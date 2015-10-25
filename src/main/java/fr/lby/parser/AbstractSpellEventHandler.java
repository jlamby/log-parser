package fr.lby.parser;

import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public abstract class AbstractSpellEventHandler extends AbstractCombatEventHandler {

    SpellInformation parseSpell(String[] strings) {
        return new SpellInformation(
                Integer.valueOf(strings[SpellEventMapping.ID]),
                strings[SpellEventMapping.NAME],
                null);
    }

    protected static class SpellEventMapping {
        static final int ID     = 9;
        static final int NAME   = 10;
        static final int SCHOOL = 11;
    }

}
