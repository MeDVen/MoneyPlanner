package ru.medven.moneyplanner.gui.dialogs;

import java.awt.*;

import ru.medven.moneyplanner.entity.Operation;
import ru.medven.moneyplanner.i18n.Messages;

import javax.swing.*;

/**
 * Adding entry for main table. Choosing operation type with combobox and setting value and name of operation. Date can be changed by DatePicker.
 * @author rkush
 */
public class AddEntryDialog extends SimpleDialog {

    private static final int WIDTH = 320;
    private static final int HEIGHT = 240;

    private JComboBox<Operation> operationComboBox;
    private JTextField nameOperation;
    private JTextField valueField;

    public AddEntryDialog(Frame owner) {
        super(owner, Messages.ADD_ENTRY, new Size(WIDTH, HEIGHT));
        initUI();
    }

    private void initUI() {
        operationComboBox = new JComboBox<>(Operation.operations);
        operationComboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Operation opValue = (Operation) value;
                this.setText(opValue.getName());
                return this;
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(operationComboBox, BorderLayout.NORTH);

        add(panel);
    }
}
