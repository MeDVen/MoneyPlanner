package ru.medven.moneyplanner.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import ru.medven.moneyplanner.i18n.Messages;

/**
 * Main {@link JFrame} window of money planner.
 * Created by medven on 18.12.16.
 */
public class MainWindow {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new JFrame(Messages.moneyPlanner);

            MainTable mainTable = new MainTable();
            JScrollPane jScrollPane = new JScrollPane(mainTable.getTable());
//            mainFrame.add(jScrollPane);

            JPanel panel = new JPanel(new BorderLayout());
            panel.add(jScrollPane, BorderLayout.CENTER);
            mainFrame.add(panel);

            mainFrame.setSize(1024, 768);
            mainFrame.setVisible(true);
            mainFrame.setResizable(true);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.pack();
        });
    }
}
