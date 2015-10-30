package fr.lby.parser;

import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public abstract class AbstractExtraSpellEventHandler extends AbstractSpellEventHandler {

    protected SpellInformation parseExtraSpell(String[] strings) {
        return new SpellInformation(
                parseInteger(strings, ExtraSpellMapping.ID),
                strings[ExtraSpellMapping.NAME],
                null);
    }

    protected static class ExtraSpellMapping {
        static final int ID     = 12;
        static final int NAME   = 13;
        static final int SCHOOL = 14;
    }
}