package fr.lby.parser.handlers;

import fr.lby.enums.EnvironmentalType;
import fr.lby.enums.EventType;
import fr.lby.events.EnvironmentalDamageEvent;
import fr.lby.parser.ParserUtils;

/**
 * @author jlamby
 *
 */
public class EnvironmentalDamageEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.ENVIRONMENTAL_DAMAGE;
    }

    @Override
    protected EnvironmentalDamageEvent parse(String[] strings) {
        return new EnvironmentalDamageEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                EnvironmentalType.getByValue(strings[EnvironmentalDamageEventMapping.ENVIRONMENTAL_TYPE]),
                ParserUtils.parseDamage(strings, EnvironmentalDamageEventMapping.DAMAGE_FIELDS_OFFSET));
    }

    protected static class EnvironmentalDamageEventMapping {
        static final int ENVIRONMENTAL_TYPE   = 22;
        static final int DAMAGE_FIELDS_OFFSET = 23;
    }

}
