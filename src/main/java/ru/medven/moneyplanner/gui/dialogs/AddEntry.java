package ru.medven.moneyplanner.gui.dialogs;

import java.awt.Frame;

import javax.swing.JDialog;

import ru.medven.moneyplanner.i18n.Messages;

/**
 * Adding entry for main table. Choising operation type with combobox and setting value and name of operation. Date can be changed by DatePicker.
 * @author rkush
 */
public class AddEntry extends JDialog {

    public static final int WIDTH = 320;
    public static final int HEIGHT = 240;

    public AddEntry(Frame owner) {
        super(owner);

        setTitle(Messages.ADD_ENTRY_DIALOG_TITLE);

        setSize(WIDTH, HEIGHT);
    }
}
