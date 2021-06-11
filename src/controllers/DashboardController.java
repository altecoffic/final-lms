package controllers;

import java.awt.Color;
import javax.swing.JPanel;

public class DashboardController {

    public DashboardController() {
    }

    public static void setColor(JPanel book) {
        book.setBackground(new Color(72, 91, 99));
    }

    public static void resetColor(JPanel book2) {
        book2.setBackground(new Color(51, 51, 51));
    }

}
