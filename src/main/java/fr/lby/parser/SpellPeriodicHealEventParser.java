package fr.lby.parser;

import org.apache.commons.lang3.BooleanUtils;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellPeriodicHealEvent;
import fr.lby.events.type.Event;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicHealEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_HEAL;
    }

    @Override
    protected Event parse(String[] strings) {

        return new SpellPeriodicHealEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings),
                parseInteger(strings, SpellPeriodicHealEventMapping.AMOUNT),
                parseInteger(strings, SpellPeriodicHealEventMapping.OVERHEAL),
                parseInteger(strings, SpellPeriodicHealEventMapping.ABSORBED),
                BooleanUtils.toBoolean(strings[SpellPeriodicHealEventMapping.CRITICAL], "1", "nil"));
    }

    protected static class SpellPeriodicHealEventMapping {
        static final int AMOUNT   = 25;
        static final int OVERHEAL = 26;
        static final int ABSORBED = 27;
        static final int CRITICAL = 28;
    }
}
