package fr.lby.parser.handlers;

import fr.lby.enums.EventType;
import fr.lby.events.damage.DamageSplitEvent;
import fr.lby.events.spell.SpellDamageEvent;
import fr.lby.parser.handlers.spell.SpellDamageEventHandler;

/**
 * @author jlamby
 *
 */
public class DamageSplitEventHandler extends SpellDamageEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.DAMAGE_SPLIT;
    }

    @Override
    protected DamageSplitEvent parse(String[] strings) {
        SpellDamageEvent event = super.parse(strings);

        return new DamageSplitEvent(
                event.source,
                event.destination,
                event.spell,
                event.damage);
    }

}
