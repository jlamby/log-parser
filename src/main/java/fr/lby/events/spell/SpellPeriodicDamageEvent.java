package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.type.primary.SpellPeriodic;
import fr.lby.model.DamageInformation;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicDamageEvent extends SpellDamageEvent implements SpellPeriodic {

    public SpellPeriodicDamageEvent(Unit source, Unit destination, SpellInformation spell, DamageInformation damage) {
        super(source, destination, spell, damage);
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_PERIODIC_DAMAGE;
    }

    @Override
    public String toString() {
        return "SpellPeriodicDamage [ " + source.name + " (" + spell.name + ") -> " + destination.name + " : "
                + damage.amount + "]";
    }

}
