package org.jabref.gui.theme;

import org.jabref.logic.l10n.Localization;

public enum ThemeColorScheme {

    FOLLOW_SYSTEM("Follow System"),
    LIGHT("Light"),
    DARK("Dark");

    private final String colorSchemeName;

    ThemeColorScheme(String colorSchemeName) {
        this.colorSchemeName = colorSchemeName;
    }

    public static ThemeColorScheme of(String colorScheme) {
        if (colorScheme == null) {
            return FOLLOW_SYSTEM;
        }
        for (ThemeColorScheme scheme : values()) {
            if (scheme.colorSchemeName.equals(colorScheme)) {
                return scheme;
            }
        }
        return FOLLOW_SYSTEM;
    }

    public String getLocalizedName() {
        return Localization.lang(colorSchemeName);
    }

    public String getColorSchemeName() {
        return colorSchemeName;
    }
}
