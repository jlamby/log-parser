package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.swing.SwingDamageLandedEvent;

/**
 * @author jlamby
 *
 */
public class SwingDamageLandedEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SWING_DAMAGE_LANDED;
    }

    @Override
    protected SwingDamageLandedEvent parse(String[] strings) {
        return new SwingDamageLandedEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseInteger(strings, SwingDamageLandedEventMapping.AMOUNT),
                parseInteger(strings, SwingDamageLandedEventMapping.OVERKILL),
                null, // Integer.valueOf(strings[SwingDamageLandedEventMapping.SPELL_SCHOOL]),
                parseInteger(strings, SwingDamageLandedEventMapping.RESISTED),
                parseInteger(strings, SwingDamageLandedEventMapping.BLOCKED),
                parseInteger(strings, SwingDamageLandedEventMapping.ABSORBED),
                parseBoolean(strings, SwingDamageLandedEventMapping.CRITICAL),
                parseBoolean(strings, SwingDamageLandedEventMapping.GLANCING),
                parseBoolean(strings, SwingDamageLandedEventMapping.CRUSHING));
    }

    protected static class SwingDamageLandedEventMapping {
        static final int AMOUNT       = 22;
        static final int OVERKILL     = 23;
        static final int SPELL_SCHOOL = 24;
        static final int RESISTED     = 25;
        static final int BLOCKED      = 26;
        static final int ABSORBED     = 27;
        static final int CRITICAL     = 28;
        static final int GLANCING     = 29;
        static final int CRUSHING     = 30;
    }

}
