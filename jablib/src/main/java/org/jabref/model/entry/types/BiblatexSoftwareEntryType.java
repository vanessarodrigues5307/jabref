package org.jabref.model.entry.types;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

public enum BiblatexSoftwareEntryType implements EntryType {

    DATASET("Dataset"),
    SOFTWARE_VERSION("SoftwareVersion"),
    SOFTWARE_MODULE("SoftwareModule"),
    CODE_FRAGMENT("CodeFragment");

    private final String displayName;

    BiblatexSoftwareEntryType(String displayName) {
        this.displayName = displayName;
    }

    public static Optional<BiblatexSoftwareEntryType> fromName(String name) {
        return Arrays.stream(BiblatexSoftwareEntryType.values())
                     .filter(field -> field.getName().equalsIgnoreCase(name))
                     .findAny();
    }

    @Override
    public String getName() {
        return displayName.toLowerCase(Locale.ENGLISH);
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }
}
