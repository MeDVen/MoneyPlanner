package ru.medven.moneyplanner.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Internationalization messages.
 *
 * Created by medven on 18.12.16.
 */
public final class Messages {

    private static Locale locale;

    private static ResourceBundle resourceBundle;

    static {
        locale = Locale.getDefault();
        resourceBundle = ResourceBundle.getBundle("Messages", locale);
    }

    private Messages() {
    }

    public static final String moneyPlanner = resourceBundle.getString("moneyPlanner");
}
