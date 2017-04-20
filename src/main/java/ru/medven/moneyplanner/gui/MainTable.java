package ru.medven.moneyplanner.gui;

import java.util.Enumeration;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
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
        initColumnFilters(tableModel);
        initCellRenderer();
    }

    public JTable getTable() {
        return table;
    }

    private void initColumnFilters(TableModel tableModel) {
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

    private void initCellRenderer() {
        DefaultTableCellRenderer centerTextRenderer = new DefaultTableCellRenderer();
        centerTextRenderer.setHorizontalAlignment(JLabel.CENTER);

        TableColumnModel columnModel = table.getColumnModel();
        Enumeration<TableColumn> columns = columnModel.getColumns();
        while (columns.hasMoreElements()) {
            TableColumn tableColumn = columns.nextElement();
            tableColumn.setCellRenderer(centerTextRenderer);
        }
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
