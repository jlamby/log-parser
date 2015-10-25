package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.swing.SwingDamageEvent;
import fr.lby.events.swing.SwingDamageLandedEvent;

/**
 * @author jlamby
 *
 */
public class SwingDamageLandedEventParser extends SwingDamageEventParser {

    @Override
    protected EventType getEventType() {
        return EventType.SWING_DAMAGE_LANDED;
    }

    @Override
    protected SwingDamageLandedEvent parse(String[] strings) {
        SwingDamageEvent event = super.parse(strings);

        return new SwingDamageLandedEvent(
                event.source,
                event.destination,
                event.amount,
                event.overkill,
                event.spellSchool,
                event.resisted,
                event.blocked,
                event.absorbed,
                event.critical,
                event.glancing,
                event.crushing);
    }

}
