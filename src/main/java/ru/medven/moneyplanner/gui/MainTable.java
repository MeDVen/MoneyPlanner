package ru.medven.moneyplanner.gui;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * Main table of money planner program with all operations.
 * Created by medven on 18.12.16.
 */
public class MainTable {

    private JTable table;

    public MainTable() {
        TableModel tableModel = initTableModel();
        table = new JTable(tableModel);
        RowFilter<Object, Object> filter = new RowFilter<Object, Object>() {
            public boolean include(Entry entry) {
                Integer population = (Integer) entry.getValue(1);
                return population.intValue() > 0;
            }
        };
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tableModel);
        sorter.setRowFilter(filter);
        table.setRowSorter(sorter);
    }

    public JTable getTable() {
        return table;
    }

    private TableModel initTableModel() {
        Object[][] data = {
                {"A", 1},
                {"B", 2},
                {"C", 3},
                {"D", 4},
                {"E", 5}
        };
        String[] columnNames = {"Item", "Value"};
        TableModel tableModel = new DefaultTableModel(data, columnNames) {
            public Class<?> getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
        return tableModel;
    }
}
