package fr.lby.parser.handlers.range;

import fr.lby.enums.EventType;
import fr.lby.events.range.RangeDamageEvent;
import fr.lby.parser.AbstractHandler;
import fr.lby.parser.ParserUtils;

/**
 * @author jlamby
 *
 */
public class RangeDamageEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.RANGE_DAMAGE;
    }

    @Override
    protected RangeDamageEvent parse(String[] strings) {
        return new RangeDamageEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseDamage(strings, DAMAGE_FIELDS_OFFSET));
    }

    private static final int DAMAGE_FIELDS_OFFSET = 25;

}
