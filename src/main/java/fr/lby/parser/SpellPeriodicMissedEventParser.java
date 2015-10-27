package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.spell.SpellPeriodicMissedEvent;
import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicMissedEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_MISSED;
    }

    int parseAmount(String[] strings) {
        if (strings.length > SpellPeriodicMissedEventMapping.AMOUNT_MISSED) {
            return parseInteger(strings, SpellPeriodicMissedEventMapping.AMOUNT_MISSED);
        }

        return 0;
    }

    @Override
    protected SpellPeriodicMissedEvent parse(String[] strings) {
        SpellInformation spell = parseSpell(strings);

        return new SpellPeriodicMissedEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell,
                MissType.valueOf(strings[SpellPeriodicMissedEventMapping.MISS_TYPE]),
                parseBoolean(strings, SpellPeriodicMissedEventMapping.OFF_HAND),
                parseBoolean(strings, SpellPeriodicMissedEventMapping.MULTISTRIKE),
                parseAmount(strings));
    }

    protected static class SpellPeriodicMissedEventMapping {
        static final int MISS_TYPE     = 12;
        static final int OFF_HAND      = 13;
        static final int MULTISTRIKE   = 14;
        static final int AMOUNT_MISSED = 15;
    }
}
