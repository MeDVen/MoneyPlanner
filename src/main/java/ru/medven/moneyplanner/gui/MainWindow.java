package ru.medven.moneyplanner.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import ru.medven.moneyplanner.gui.dialogs.AddEntry;
import ru.medven.moneyplanner.i18n.Messages;

/**
 * Main {@link JFrame} window of money planner.
 * Created by medven on 18.12.16.
 */
public class MainWindow {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new JFrame(Messages.MONEY_PLANNER);

            MainTable mainTable = new MainTable();
            JScrollPane jScrollPane = new JScrollPane(mainTable.getTable());

            JPanel southPanel = new JPanel(new BorderLayout());
            JButton jButton = new JButton("Add entry");
            jButton.addActionListener(e -> {
                System.out.println("Just open dialog!");
                AddEntry addEntry = new AddEntry(mainFrame);
                addEntry.setVisible(true);
            });
            southPanel.add(jButton);

            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(jScrollPane, BorderLayout.CENTER);
            mainPanel.add(southPanel, BorderLayout.SOUTH);
            mainFrame.add(mainPanel);

            mainFrame.setSize(1024, 768);
            mainFrame.setVisible(true);
            mainFrame.setResizable(true);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.pack();
        });
    }
}
