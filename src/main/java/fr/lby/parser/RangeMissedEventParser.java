package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.range.RangeMissedEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class RangeMissedEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.RANGE_MISSED;
    }

    @Override
    protected RangeMissedEvent parse(String[] strings) {
        return new RangeMissedEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                MissType.valueOf(strings[RangeMissedEventMapping.MISS_TYPE]),
                parseBoolean(strings, RangeMissedEventMapping.OFF_HAND),
                parseBoolean(strings, RangeMissedEventMapping.MULTISTRIKE),
                parseAmount(strings));
    }

    int parseAmount(String[] strings) {
        if (strings.length > RangeMissedEventMapping.AMOUNT_MISSED) {
            return parseInteger(strings, RangeMissedEventMapping.AMOUNT_MISSED);
        }

        return 0;
    }

    protected class RangeMissedEventMapping {
        static final int MISS_TYPE     = 12;
        static final int OFF_HAND      = 13;
        static final int MULTISTRIKE   = 14;
        static final int AMOUNT_MISSED = 15;
    }

}
