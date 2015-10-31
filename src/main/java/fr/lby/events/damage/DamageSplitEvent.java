package fr.lby.events.damage;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellDamageEvent;
import fr.lby.model.DamageInformation;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public class DamageSplitEvent extends SpellDamageEvent {

    @Override
    public EventType getType() {
        return EventType.DAMAGE_SPLIT;
    }

    public DamageSplitEvent(Unit source, Unit destination, SpellInformation spell,
            DamageInformation damageInformation) {
        super(source, destination, spell, damageInformation);
    }

    @Override
    public String toString() {
        return "DamageSplitEvent [ " + source.name + " (" + spell.name + ") -> " + destination.name + " : "
                + damage.amount + "]";
    }

}
