package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.enums.PowerType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.Drain;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellDrainEvent extends CombatEvent implements Spell, Drain {

    public final SpellInformation spell;
    public final int              amount;
    public final PowerType        powerType;
    public final int              extraAmount;

    public SpellDrainEvent(Unit source, Unit destination, SpellInformation spell, int amount, PowerType powerType,
            int extraAmount) {
        super(source, destination);
        this.spell = spell;
        this.amount = amount;
        this.powerType = powerType;
        this.extraAmount = extraAmount;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_DRAIN;
    }

    @Override
    public String toString() {
        return "SpellDrainEvent [" + source.name + " drains " + amount + " " + powerType.name() + " with "
                + spell.name + "]";
    }

}
