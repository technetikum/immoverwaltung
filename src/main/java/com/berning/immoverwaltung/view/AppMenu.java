package com.berning.immoverwaltung.view;

import com.berning.immoverwaltung.control.Database;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class AppMenu extends MenuBar {

    public AppMenu(AnchorPane pane) {
        super();
        
        // For each menu item create an event method as seen below.
        // The characters äöüß are replaced by ae, oe, ue, ss as replaced by
        // the method makeMethodNameFromMenuItem.
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
        for (String i : menuItemName) {
            addMenuItem(menu, i);
        }
    }

    private void addMenuItem(Menu menu, String name) {
        MenuItem menuItem = new MenuItem(name);
        menu.getItems().add(menuItem);
        String methodName = makeMethodNameFromMenuItem(name);
        try {
            // Used getDeclaredMethod instead of getMethod because the first one can access  private methods!
            final Method eventMethod = this.getClass().getDeclaredMethod(methodName, Event.class);
            menuItem.setOnAction((event) -> {
                try {
                    eventMethod.invoke(this, event);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    System.out.println("Cause: " + ex.getCause());
                    System.out.println(ex.getLocalizedMessage());
                    ex.printStackTrace();
                }
            });
        } catch (NoSuchMethodException ex) {
            System.out.println("There is something wrong with determining the method. Using a default method.");
            ex.printStackTrace();
        } catch (SecurityException ex) {
            ex.printStackTrace();
        }

    }

    private String makeMethodNameFromMenuItem(String str) {
        String repl = str.replaceAll("[_ ]", "");
        StringBuilder strb = new StringBuilder(repl.length());
        CharacterIterator it = new StringCharacterIterator(repl);
        for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
            switch (ch) {
                case 'ä':
                    strb.append("ae");
                    break;
                case 'Ä':
                    strb.append("Ae");
                    break;
                case 'ö':
                    strb.append("oe");
                    break;
                case 'Ö':
                    strb.append("Oe");
                    break;
                case 'ü':
                    strb.append("ue");
                    break;
                case 'Ü':
                    strb.append("Ue");
                    break;
                case 'ß':
                    strb.append("ss");
                    break;
                default:
                    strb.append(ch);
                    break;
            }
        }
        String result = strb.toString();
        return "menuItem" + result.substring(0, 1).toUpperCase() 
                + result.substring(1).toLowerCase();
    }

    private void menuItemNeuedatenbank(Event e) {
        System.out.println(e.toString());
        try {
            Database db = new Database();
        } catch (SQLException | IOException ex) {
            Logger.getLogger(AppMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void menuItemDatenbankladen(Event e) {

    }

    private void menuItemDatenbankspeichern(Event e) {

    }

    private void menuItemMieter(Event e) {

    }

    private void menuItemVertraege(Event e) {

    }

    private void menuItemObjekte(Event e) {

    }

    private void menuItemUeber(Event e) {

    }

}
