package ru.medven.moneyplanner.gui.dialogs;

import javax.swing.*;
import java.awt.*;

/**
 * Simple dialog. Use it when you're creating a dialog.
 *
 * @author MeDVen
 */
class SimpleDialog extends JDialog {

    SimpleDialog(Frame owner, String title, Size size) {
        super(owner);
        setTitle(title);
        setSize(size.width, size.height);
        setModal(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(owner);
    }

    /**
     * Object, whats store size information. Just width and height.
     * @author MeDVen
     */
    static class Size {
        private int width;
        private int height;

        Size(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
