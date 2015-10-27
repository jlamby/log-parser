package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.swing.SwingMissedEvent;

/**
 * @author jlamby
 *
 */
public class SwingMissedEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SWING_MISSED;
    }

    @Override
    protected SwingMissedEvent parse(String[] strings) {
        return new SwingMissedEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                MissType.valueOf(strings[SwingMissedEventMapping.MISS_TYPE]),
                parseBoolean(strings, SwingMissedEventMapping.OFF_HAND),
                parseBoolean(strings, SwingMissedEventMapping.MULTISTRIKE),
                parseAmount(strings));
    }

    int parseAmount(String[] strings) {
        if (strings.length > SwingMissedEventMapping.AMOUNT_MISSED) {
            return parseInteger(strings, SwingMissedEventMapping.AMOUNT_MISSED);
        }

        return 0;
    }

    protected class SwingMissedEventMapping {
        static final int MISS_TYPE     = 9;
        static final int OFF_HAND      = 10;
        static final int MULTISTRIKE   = 11;
        static final int AMOUNT_MISSED = 12;
    }

}
