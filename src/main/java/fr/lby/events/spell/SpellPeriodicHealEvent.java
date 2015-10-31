package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.type.primary.SpellPeriodic;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellPeriodicHealEvent extends SpellHealEvent implements SpellPeriodic {

    public SpellPeriodicHealEvent(Unit source, Unit destination, SpellInformation spell, int amount, int overheal,
            int absorbed, boolean critical) {
        super(source, destination, spell, amount, overheal, absorbed, critical);
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_PERIODIC_HEAL;
    }

    @Override
    public String toString() {
        return "SpellPeriodicHealEvent [ " + source.name + " (" + spell.name + ") -> " + destination.name + " : "
                + amount + "]";
    }

}
