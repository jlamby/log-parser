package fr.lby.parser;

import org.apache.commons.lang3.BooleanUtils;

import fr.lby.enums.AuraType;
import fr.lby.model.DamageInformation;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import fr.lby.parser.mappings.DamageFieldsMapping;
import fr.lby.parser.mappings.SpellFieldsMapping;
import fr.lby.parser.mappings.UnitFieldsMapping;

/**
 * @author jlamby
 *
 */
public class ParserUtils {

    public static int parseInteger(String[] strings, int index) {
        return Integer.valueOf(strings[index]);
    }

    public static boolean parseBoolean(String[] strings, int index) {
        return BooleanUtils.toBoolean(strings[index], "1", "nil");
    }

    public static DamageInformation parseDamage(String[] strings, int damageFieldsOffset) {
        DamageFieldsMapping fieldsMapping = new DamageFieldsMapping(damageFieldsOffset);
        return new DamageInformation(
                parseInteger(strings, fieldsMapping.getAmountIndex()),
                parseInteger(strings, fieldsMapping.getOverkillIndex()),
                null, // Integer.valueOf(strings[SpellDamageEventMapping.SPELL_SCHOOL]),
                parseInteger(strings, fieldsMapping.getResistedIndex()),
                parseInteger(strings, fieldsMapping.getBlockedIndex()),
                parseInteger(strings, fieldsMapping.getAbsorbedIndex()),
                parseBoolean(strings, fieldsMapping.getCriticalIndex()),
                parseBoolean(strings, fieldsMapping.getGlancingIndex()),
                parseBoolean(strings, fieldsMapping.getCrushingIndex()));
    }

    /**
     * Parse {@link SpellInformation} starting at offset {@link #DEFAULT_SPELL_OFFSET}
     *
     * @param strings
     * @return
     */
    public static SpellInformation parseSpell(String[] strings) {
        return parseSpell(strings, DEFAULT_SPELL_OFFSET);
    }

    public static SpellInformation parseSpell(String[] strings, int spellFieldsOffset) {
        SpellFieldsMapping fieldsMapping = new SpellFieldsMapping(spellFieldsOffset);
        return new SpellInformation(
                parseInteger(strings, fieldsMapping.getIdIndex()),
                strings[fieldsMapping.getNameIndex()],
                null);
    }

    public static Unit parseSourceUnit(String[] strings) {
        return parseUnit(strings, DEFAULT_SOURCE_UNIT_OFFSET);
    }

    public static Unit parseDestinationUnit(String[] strings) {
        return parseUnit(strings, DEFAULT_DESTINATION_UNIT_OFFSET);
    }

    public static Unit parseUnit(String[] strings, int unitFieldsOffset) {
        UnitFieldsMapping fieldsMapping = new UnitFieldsMapping(unitFieldsOffset);

        return new Unit(
                strings[fieldsMapping.getGUIDIndex()],
                strings[fieldsMapping.getNameIndex()],
                strings[fieldsMapping.getFlagsIndex()],
                strings[fieldsMapping.getFlags2Index()]);
    }

    /**
     * Parse {@link AuraType} starting at offset {@link #DEFAULT_SPELL_AURA_TYPE_OFFSET}
     *
     * @param strings
     * @return
     */
    public static AuraType parseAuraType(String[] strings) {
        return parseAuraType(strings, DEFAULT_SPELL_AURA_TYPE_OFFSET);
    }

    public static AuraType parseAuraType(String[] strings, int auraTypeOffset) {
        return AuraType.valueOf(strings[auraTypeOffset]);
    }

    /**
     * Returns an integer at {@link #DEFAULT_SPELL_AURA_AMOUNT_OFFSET}. Returns 0 when
     * {@link #DEFAULT_SPELL_AURA_AMOUNT_OFFSET} is out of bounds
     *
     * @param strings
     * @return
     */
    public static int parseAuraAmount(String[] strings) {
        return parseAmount(strings, DEFAULT_SPELL_AURA_AMOUNT_OFFSET);
    }

    public static int parseAmount(String[] strings, int amountOffset) {
        if (strings.length > amountOffset) {
            return parseInteger(strings, amountOffset);
        }

        return 0;
    }

    private static final int DEFAULT_SOURCE_UNIT_OFFSET       = 1;
    private static final int DEFAULT_DESTINATION_UNIT_OFFSET  = 5;
    private static final int DEFAULT_SPELL_OFFSET             = 9;
    private static final int DEFAULT_SPELL_AURA_TYPE_OFFSET   = 12;
    private static final int DEFAULT_SPELL_AURA_AMOUNT_OFFSET = 13;
}
