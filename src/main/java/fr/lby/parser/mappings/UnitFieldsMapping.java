package fr.lby.parser.mappings;

/**
 * @author jlamby
 *
 */
public class UnitFieldsMapping {

    protected static final int GUID    = 0;
    protected static final int NAME    = 1;
    protected static final int FLAGS   = 2;
    protected static final int FLAGS_2 = 3;

    public UnitFieldsMapping(int startIndex) {
        this.offset = startIndex;
    }

    final int offset;

    public final int getGUIDIndex() {
        return offset + GUID;
    }

    public final int getNameIndex() {
        return offset + NAME;
    }

    public final int getFlagsIndex() {
        return offset + FLAGS;
    }

    public final int getFlags2Index() {
        return offset + FLAGS_2;
    }

}
