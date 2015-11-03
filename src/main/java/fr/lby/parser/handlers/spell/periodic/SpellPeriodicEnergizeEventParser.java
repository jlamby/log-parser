package fr.lby.parser.handlers.spell.periodic;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellEnergizeEvent;
import fr.lby.events.spell.SpellPeriodicEnergizeEvent;
import fr.lby.parser.handlers.spell.SpellEnergizeEventParser;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicEnergizeEventParser extends SpellEnergizeEventParser {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_ENERGIZE;
    }

    @Override
    protected SpellPeriodicEnergizeEvent parse(String[] strings) {
        SpellEnergizeEvent event = super.parse(strings);
        return new SpellPeriodicEnergizeEvent(
                event.source,
                event.destination,
                event.spell,
                event.amount,
                event.powerType);
    }

}
