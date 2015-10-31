package fr.lby.parser.models;

import org.apache.commons.lang3.BooleanUtils;

import fr.lby.model.DamageInformation;
import fr.lby.model.SpellInformation;
import fr.lby.parser.mappings.DamageFieldsMapping;
import fr.lby.parser.mappings.SpellFieldsMapping;

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
     * Parse {@link SpellInformation} starting at offset 9.
     * 
     * @param strings
     * @return
     */
    public static SpellInformation parseSpell(String[] strings) {
        return parseSpell(strings, 9);
    }

    public static SpellInformation parseSpell(String[] strings, int spellFieldsOffset) {
        SpellFieldsMapping fieldsMapping = new SpellFieldsMapping(spellFieldsOffset);
        return new SpellInformation(
                parseInteger(strings, fieldsMapping.getIdIndex()),
                strings[fieldsMapping.getNameIndex()],
                null);
    }

}
