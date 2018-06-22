package ru.medven.moneyplanner.gui;

import java.awt.BorderLayout;

import javax.swing.*;

import ru.medven.moneyplanner.gui.dialogs.AddEntryDialog;
import ru.medven.moneyplanner.i18n.Messages;

/**
 * Main {@link JFrame} window of money planner.
 * Created by medven on 18.12.16.
 */
public class MainWindow {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            final JFrame mainFrame = new JFrame(Messages.MONEY_PLANNER);

            MainTable table = new MainTable();
            JScrollPane tableScrollPane = new JScrollPane(table.getTable());

            JPanel southPanel = new JPanel(new BorderLayout());
            JButton jButton = new JButton(Messages.ADD_ENTRY);
            jButton.addActionListener(e -> {
                System.out.println("Just open dialog!");
                AddEntryDialog addEntryDialog = new AddEntryDialog(mainFrame);
                addEntryDialog.setVisible(true);
            });
            southPanel.add(jButton);

            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(tableScrollPane, BorderLayout.CENTER);
            mainPanel.add(southPanel, BorderLayout.SOUTH);

            mainFrame.add(mainPanel);
            mainFrame.setSize(1024, 768);
            mainFrame.setVisible(true);
            mainFrame.setResizable(true);
            mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(null);
        });
    }
}
