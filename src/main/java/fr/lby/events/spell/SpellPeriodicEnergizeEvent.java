package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.enums.PowerType;
import fr.lby.events.type.primary.SpellPeriodic;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

@Getter
public class SpellPeriodicEnergizeEvent extends SpellEnergizeEvent implements SpellPeriodic {

    public SpellPeriodicEnergizeEvent(Unit source, Unit destination, SpellInformation spell, int amount,
            PowerType powerType) {
        super(source, destination, spell, amount, powerType);
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_PERIODIC_ENERGIZE;
    }

    @Override
    public String toString() {
        return "SpellPeriodicEnergizeEvent [" + source.name + " restores " + amount + " " + powerType.name() + " with "
                + spell.name + "]";
    }

}
