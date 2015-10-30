package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellInterruptEvent;
import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public class SpellInterruptEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_INTERRUPT;
    }

    @Override
    protected SpellInterruptEvent parse(String[] strings) {
        return new SpellInterruptEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings),
                parseInterruptedSpell(strings));
    }

    SpellInformation parseInterruptedSpell(String[] strings) {
        return new SpellInformation(
                parseInteger(strings, SpellInterruptMapping.ID),
                strings[SpellInterruptMapping.NAME],
                null);
    }

    protected static class SpellInterruptMapping {
        static final int ID     = 12;
        static final int NAME   = 13;
        static final int SCHOOL = 14;
    }

}
