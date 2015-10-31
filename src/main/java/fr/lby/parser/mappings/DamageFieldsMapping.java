package fr.lby.parser.mappings;

/**
 * @author jlamby
 *
 */
public class DamageFieldsMapping {

    protected static final int AMOUNT       = 0;
    protected static final int OVERKILL     = 1;
    protected static final int SPELL_SCHOOL = 2;
    protected static final int RESISTED     = 3;
    protected static final int BLOCKED      = 4;
    protected static final int ABSORBED     = 5;
    protected static final int CRITICAL     = 6;
    protected static final int GLANCING     = 7;
    protected static final int CRUSHING     = 8;

    public DamageFieldsMapping(int startIndex) {
        this.offset = startIndex;
    }

    final int offset;

    public final int getAmountIndex() {
        return offset + AMOUNT;
    }

    public final int getOverkillIndex() {
        return offset + OVERKILL;
    }

    public final int getSpellSchoolIndex() {
        return offset + SPELL_SCHOOL;
    }

    public final int getResistedIndex() {
        return offset + RESISTED;
    }

    public final int getBlockedIndex() {
        return offset + BLOCKED;
    }

    public final int getAbsorbedIndex() {
        return offset + ABSORBED;
    }

    public final int getCriticalIndex() {
        return offset + CRITICAL;
    }

    public final int getGlancingIndex() {
        return offset + GLANCING;
    }

    public final int getCrushingIndex() {
        return offset + CRUSHING;
    }

}
