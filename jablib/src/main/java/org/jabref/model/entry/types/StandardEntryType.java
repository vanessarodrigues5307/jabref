package org.jabref.model.entry.types;

import java.util.Locale;

/// Defines standard entry types as defined by BibTeX and BibLaTeX.
/// At {@link BibtexEntryTypeDefinitions}, the required and optional fields for each type (for BibTeX) is defined.
/// The BibLaTeX entry types are defined at {@link BiblatexEntryTypeDefinitions}.
/// More reading on BibTeX and its fields is collected at <a href="https://docs.jabref.org/advanced/fields">JabRef's documentation</a>.
public enum StandardEntryType implements EntryType {
    // BibTeX
    ARTICLE("Article"),
    BOOK("Book"),
    BOOKLET("Booklet"),
    COLLECTION("Collection"),
    CONFERENCE("Conference"),
    IN_BOOK("InBook"),
    IN_COLLECTION("InCollection"),
    IN_PROCEEDINGS("InProceedings"),
    MANUAL("Manual"),
    MASTERS_THESIS("MastersThesis"),
    MISC("Misc"),
    PHD_THESIS("PhdThesis"),
    PROCEEDINGS("Proceedings"),
    TECH_REPORT("TechReport"),
    UNPUBLISHED("Unpublished"),
    // BibLaTeX
    BOOK_IN_BOOK("BookInBook"),
    IN_REFERENCE("InReference"),
    MV_BOOK("MvBook"),
    MV_COLLECTION("MvCollection"),
    MV_PROCEEDINGS("MvProceedings"),
    MV_REFERENCE("MvReference"),
    ONLINE("Online"),
    REFERENCE("Reference"),
    REPORT("Report"),
    SET("Set"),
    SUPP_BOOK("SuppBook"),
    SUPP_COLLECTION("SuppCollection"),
    SUPP_PERIODICAL("SuppPeriodical"),
    THESIS("Thesis"),
    WWW("WWW"),
    SOFTWARE("Software"),
    DATASET("Dataset");

    private final String displayName;

    StandardEntryType(String displayName) {
        this.displayName = displayName;
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
