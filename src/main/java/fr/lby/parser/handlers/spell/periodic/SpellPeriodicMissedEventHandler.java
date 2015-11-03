package fr.lby.parser.handlers.spell.periodic;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellMissedEvent;
import fr.lby.events.spell.SpellPeriodicMissedEvent;
import fr.lby.parser.handlers.spell.SpellMissedEventHandler;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicMissedEventHandler extends SpellMissedEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_MISSED;
    }

    @Override
    protected SpellPeriodicMissedEvent parse(String[] strings) {
        SpellMissedEvent event = super.parse(strings);

        return new SpellPeriodicMissedEvent(
                event.source,
                event.destination,
                event.spell,
                event.missType,
                event.offHand,
                event.multistrike,
                event.amountMissed);
    }

}
