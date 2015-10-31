package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellDamageEvent;
import fr.lby.events.spell.SpellPeriodicDamageEvent;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicDamageEventParser extends SpellDamageEventParser {

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
