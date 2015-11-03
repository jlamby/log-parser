package fr.lby.parser.handlers.spell.periodic;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellDamageEvent;
import fr.lby.events.spell.SpellPeriodicDamageEvent;
import fr.lby.parser.handlers.spell.SpellDamageEventHandler;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicDamageEventHandler extends SpellDamageEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_DAMAGE;
    }

    @Override
    protected SpellPeriodicDamageEvent parse(String[] strings) {
        SpellDamageEvent event = super.parse(strings);

        return new SpellPeriodicDamageEvent(
                event.source,
                event.destination,
                event.spell,
                event.damage);
    }

}
