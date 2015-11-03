package fr.lby.parser.handlers.swing;

import fr.lby.enums.EventType;
import fr.lby.events.swing.SwingDamageEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class SwingDamageEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SWING_DAMAGE;
    }

    @Override
    protected SwingDamageEvent parse(String[] strings) {
        return new SwingDamageEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseDamage(strings, DAMAGE_FIELDS_OFFSET));
    }

    private static final int DAMAGE_FIELDS_OFFSET = 22;

}
