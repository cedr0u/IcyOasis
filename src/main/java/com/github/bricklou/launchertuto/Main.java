package com.github.bricklou.launchertuto;

import javafx.application.Application;

import javax.swing.*;

//un trés grand merci à BrickLou pour le code source
//personalisation pour IcyOasis par "Cedr0u" aka "cedrou_0"

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("javafx.application.Application");
            Application.launch(Launcher.class, args);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erreur:\n" + e.getMessage() + " not found",
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
