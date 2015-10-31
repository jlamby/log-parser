package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.spell.SpellMissedEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellMissedEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_MISSED;
    }

    @Override
    protected SpellMissedEvent parse(String[] strings) {
        return new SpellMissedEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                MissType.valueOf(strings[SpellMissedEventMapping.MISS_TYPE]),
                ParserUtils.parseBoolean(strings, SpellMissedEventMapping.OFF_HAND),
                ParserUtils.parseBoolean(strings, SpellMissedEventMapping.MULTISTRIKE),
                ParserUtils.parseAmount(strings, SpellMissedEventMapping.AMOUNT_MISSED));
    }

    protected class SpellMissedEventMapping {
        static final int MISS_TYPE     = 12;
        static final int OFF_HAND      = 13;
        static final int MULTISTRIKE   = 14;
        static final int AMOUNT_MISSED = 15;
    }

}
