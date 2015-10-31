package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.range.RangeMissedEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class RangeMissedEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.RANGE_MISSED;
    }

    @Override
    protected RangeMissedEvent parse(String[] strings) {
        return new RangeMissedEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                MissType.valueOf(strings[RangeMissedEventMapping.MISS_TYPE]),
                ParserUtils.parseBoolean(strings, RangeMissedEventMapping.OFF_HAND),
                ParserUtils.parseBoolean(strings, RangeMissedEventMapping.MULTISTRIKE),
                ParserUtils.parseAmount(strings, RangeMissedEventMapping.AMOUNT_MISSED));
    }

    protected class RangeMissedEventMapping {
        static final int MISS_TYPE     = 12;
        static final int OFF_HAND      = 13;
        static final int MULTISTRIKE   = 14;
        static final int AMOUNT_MISSED = 15;
    }

}
