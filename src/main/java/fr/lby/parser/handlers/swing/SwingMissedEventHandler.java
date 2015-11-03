package fr.lby.parser.handlers.swing;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.swing.SwingMissedEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class SwingMissedEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SWING_MISSED;
    }

    @Override
    protected SwingMissedEvent parse(String[] strings) {
        return new SwingMissedEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                MissType.valueOf(strings[SwingMissedEventMapping.MISS_TYPE]),
                ParserUtils.parseBoolean(strings, SwingMissedEventMapping.OFF_HAND),
                ParserUtils.parseBoolean(strings, SwingMissedEventMapping.MULTISTRIKE),
                ParserUtils.parseAmount(strings, SwingMissedEventMapping.AMOUNT_MISSED));
    }

    protected class SwingMissedEventMapping {
        static final int MISS_TYPE     = 9;
        static final int OFF_HAND      = 10;
        static final int MULTISTRIKE   = 11;
        static final int AMOUNT_MISSED = 12;
    }

}
