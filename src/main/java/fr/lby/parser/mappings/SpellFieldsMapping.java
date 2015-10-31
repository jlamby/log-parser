package fr.lby.parser.mappings;

/**
 * @author jlamby
 *
 */
public class SpellFieldsMapping {

    protected static final int ID     = 0;
    protected static final int NAME   = 1;
    protected static final int SCHOOL = 2;

    public SpellFieldsMapping(int startIndex) {
        this.offset = startIndex;
    }

    final int offset;

    public final int getIdIndex() {
        return offset + ID;
    }

    public final int getNameIndex() {
        return offset + NAME;
    }

    public final int getSchoolIndex() {
        return offset + SCHOOL;
    }

}
