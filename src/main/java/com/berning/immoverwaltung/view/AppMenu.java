package com.berning.immoverwaltung.view;

import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class AppMenu extends MenuBar {

    public AppMenu(AnchorPane pane) {
        super();
        addMenu("_Datei",
                "Neue Datenbank", "Datenbank laden", "Datenbank speichern");
        addMenu("_Bearbeiten",
                "Mieter", "Verträge", "Objekte");
        addMenu("_Hilfe",
                "Über");
        setAnchor();
        pane.getChildren().add(this);
    }

    private void setAnchor() {
        AnchorPane.setTopAnchor(this, 0.0);
        AnchorPane.setLeftAnchor(this, 0.0);
        AnchorPane.setRightAnchor(this, 0.0);
    }

    private Menu addMenu(String name) {
        Menu menu = new Menu(name);
        getMenus().add(menu);
        return menu;
    }

    private void addMenu(String menuName, String... menuItemName) {
        Menu menu = addMenu(menuName);
        for(String i: menuItemName) {
            addMenuItem(menu, i);
        }
    }

    private void addMenuItem(Menu menu, String name) {
        MenuItem menuItem = new MenuItem(name);
        menu.getItems().add(menuItem);
    }
}
