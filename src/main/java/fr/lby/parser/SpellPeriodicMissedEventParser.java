package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.spell.SpellPeriodicMissedEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicMissedEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_MISSED;
    }

    @Override
    protected SpellPeriodicMissedEvent parse(String[] strings) {
        return new SpellPeriodicMissedEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                MissType.valueOf(strings[SpellPeriodicMissedEventMapping.MISS_TYPE]),
                ParserUtils.parseBoolean(strings, SpellPeriodicMissedEventMapping.OFF_HAND),
                ParserUtils.parseBoolean(strings, SpellPeriodicMissedEventMapping.MULTISTRIKE),
                ParserUtils.parseAmount(strings, SpellPeriodicMissedEventMapping.AMOUNT_MISSED));
    }

    protected static class SpellPeriodicMissedEventMapping {
        static final int MISS_TYPE     = 12;
        static final int OFF_HAND      = 13;
        static final int MULTISTRIKE   = 14;
        static final int AMOUNT_MISSED = 15;
    }
}
