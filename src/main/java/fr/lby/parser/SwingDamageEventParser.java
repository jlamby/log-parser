package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.swing.SwingDamageEvent;

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
                parseInteger(strings, SwingDamageEventMapping.AMOUNT),
                parseInteger(strings, SwingDamageEventMapping.OVERKILL),
                null, // Integer.valueOf(strings[SwingDamageEventMapping.SPELL_SCHOOL]),
                parseInteger(strings, SwingDamageEventMapping.RESISTED),
                parseInteger(strings, SwingDamageEventMapping.BLOCKED),
                parseInteger(strings, SwingDamageEventMapping.ABSORBED),
                parseBoolean(strings, SwingDamageEventMapping.CRITICAL),
                parseBoolean(strings, SwingDamageEventMapping.GLANCING),
                parseBoolean(strings, SwingDamageEventMapping.CRUSHING));
    }

    protected static class SwingDamageEventMapping {
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
