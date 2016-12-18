package ru.medven.moneyplanner.gui;

import ru.medven.moneyplanner.i18n.Messages;

import javax.swing.*;

/**
 * Main {@link JFrame} window of money planner.
 * Created by medven on 18.12.16.
 */
public class MainWindow {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new JFrame(Messages.moneyPlanner);
            mainFrame.setSize(1024, 768);
            mainFrame.setVisible(true);
            mainFrame.setResizable(false);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
