package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.spell.SpellMissedEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellMissedEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_MISSED;
    }

    @Override
    protected SpellMissedEvent parse(String[] strings) {
        return new SpellMissedEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                MissType.valueOf(strings[SpellMissedEventMapping.MISS_TYPE]),
                parseBoolean(strings, SpellMissedEventMapping.OFF_HAND),
                parseBoolean(strings, SpellMissedEventMapping.MULTISTRIKE),
                parseAmount(strings));
    }

    int parseAmount(String[] strings) {
        if (strings.length > SpellMissedEventMapping.AMOUNT_MISSED) {
            return parseInteger(strings, SpellMissedEventMapping.AMOUNT_MISSED);
        }

        return 0;
    }

    protected class SpellMissedEventMapping {
        static final int MISS_TYPE     = 12;
        static final int OFF_HAND      = 13;
        static final int MULTISTRIKE   = 14;
        static final int AMOUNT_MISSED = 15;
    }

}
