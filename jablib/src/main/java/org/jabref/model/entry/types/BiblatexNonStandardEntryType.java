package org.jabref.model.entry.types;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

public enum BiblatexNonStandardEntryType implements EntryType {

    ARTWORK("Artwork"),
    AUDIO("Audio"),
    BIBNOTE("Bibnote"),
    COMMENTARY("Commentary"),
    IMAGE("Image"),
    LETTER("Letter"),
    MOVIE("Movie"),
    MUSIC("Music"),
    PERFORMANCE("Performance"),
    REVIEW("Review"),
    STANDARD("Standard"),
    VIDEO("Video");

    private final String displayName;

    BiblatexNonStandardEntryType(String displayName) {
        this.displayName = displayName;
    }

    public static Optional<BiblatexNonStandardEntryType> fromName(String name) {
        return Arrays.stream(BiblatexNonStandardEntryType.values())
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

