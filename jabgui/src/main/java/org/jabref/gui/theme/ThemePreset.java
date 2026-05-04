package org.jabref.gui.theme;

import org.jabref.logic.l10n.Localization;

public enum ThemePreset {
    JABREF("JabRef Theme", "jabref-theme.css"),
    ATLANTA_PRIMER("Atlanta Primer", "atlanta-primer-javafx.css");

    private final String themeName;
    private final String css;

    private StyleSheet styleSheet;

    ThemePreset(String themeName, String css) {
        this.themeName = themeName;
        this.css = css;
    }

    public static ThemePreset of(String themePreset) {
        if (themePreset == null) {
            return JABREF;
        }
        for (ThemePreset preset : values()) {
            if (preset.themeName.equals(themePreset)) {
                return preset;
            }
        }
        return JABREF;
    }

    public String getThemeName() {
        return themeName;
    }

    public String getLocalizedName() {
        return Localization.lang(themeName);
    }

    public StyleSheet getStyleSheet() {
        if (styleSheet == null) {
            styleSheet = StyleSheet.create(css).orElseThrow();
        }
        return styleSheet;
    }
}
