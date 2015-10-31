package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.swing.SwingDamageEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SwingDamageEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SWING_DAMAGE;
    }

    @Override
    protected SwingDamageEvent parse(String[] strings) {
        return new SwingDamageEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseDamage(strings, DAMAGE_FIELDS_OFFSET));
    }

    private static final int DAMAGE_FIELDS_OFFSET = 22;

}
