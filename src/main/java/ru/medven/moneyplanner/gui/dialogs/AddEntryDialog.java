package ru.medven.moneyplanner.gui.dialogs;

import java.awt.Frame;

import ru.medven.moneyplanner.i18n.Messages;

/**
 * Adding entry for main table. Choosing operation type with combobox and setting value and name of operation. Date can be changed by DatePicker.
 * @author rkush
 */
public class AddEntryDialog extends SimpleDialog {

    private static final int WIDTH = 320;
    private static final int HEIGHT = 240;

    public AddEntryDialog(Frame owner) {
        super(owner, Messages.ADD_ENTRY, new Size(WIDTH, HEIGHT));
        initUI();
    }

    private void initUI() {
    }
}
