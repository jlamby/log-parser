package fr.lby.parser;

import fr.lby.model.Spell;

/**
 * @author jlamby
 *
 */
public abstract class AbstractSpellEventHandler extends AbstractCombatEventHandler {

    Spell parseSpell(String[] strings) {
        return new Spell(
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
