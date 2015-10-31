package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.range.RangeDamageEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class RangeDamageEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.RANGE_DAMAGE;
    }

    @Override
    protected RangeDamageEvent parse(String[] strings) {
        return new RangeDamageEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseDamage(strings, DAMAGE_FIELDS_OFFSET));
    }

    private static final int DAMAGE_FIELDS_OFFSET = 25;

}
