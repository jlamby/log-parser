package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.PowerType;
import fr.lby.events.spell.SpellPeriodicEnergizeEvent;
import fr.lby.parser.SpellPeriodicMissedEventParser.SpellPeriodicMissedEventMapping;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicEnergizeEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_ENERGIZE;
    }

    int parseAmount(String[] strings) {
        if (strings.length > SpellPeriodicMissedEventMapping.AMOUNT_MISSED) {
            return parseInteger(strings, SpellPeriodicMissedEventMapping.AMOUNT_MISSED);
        }

        return 0;
    }

    @Override
    protected SpellPeriodicEnergizeEvent parse(String[] strings) {
        return new SpellPeriodicEnergizeEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings),
                parseInteger(strings, SpellPeriodicEnergizeEventMapping.AMOUNT),
                PowerType.getByValue(parseInteger(strings, SpellPeriodicEnergizeEventMapping.POWER_TYPE)));
    }

    protected static class SpellPeriodicEnergizeEventMapping {
        static final int AMOUNT     = 25;
        static final int POWER_TYPE = 26;
    }

}
