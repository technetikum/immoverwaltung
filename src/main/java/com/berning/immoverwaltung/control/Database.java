package com.berning.immoverwaltung.control;

import com.berning.immoverwaltung.models.Tenants;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.io.IOException;
import java.sql.SQLException;

public class Database {

    public Database() throws SQLException, IOException {
        // SQLite-TEST
        String databaseUrl = "jdbc:sqlite:test.db";
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
        Dao<Tenants, String> tenantsDao = DaoManager.createDao(connectionSource, Tenants.class);
        TableUtils.createTable(connectionSource, Tenants.class);
        Tenants tenants = new Tenants();
        tenants.setName("Ollek");
        tenants.setForename("Oschi");
        tenantsDao.create(tenants);
        Tenants t2 = tenantsDao.queryForId("Ollek");
        System.out.println("Vorname: " + t2.getForename());
        connectionSource.close();
    }
}

