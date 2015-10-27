package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.enums.PowerType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.Energize;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellEnergizeEvent extends CombatEvent implements Spell, Energize {

    public final SpellInformation spell;
    public final int              amount;
    public final PowerType        powerType;

    public SpellEnergizeEvent(Unit source, Unit destination, SpellInformation spell, int amount, PowerType powerType) {
        super(source, destination);
        this.spell = spell;
        this.amount = amount;
        this.powerType = powerType;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_ENERGIZE;
    }

    @Override
    public String toString() {
        return "SpellEnergizeEvent [" + source.name + " restores " + amount + " " + powerType.name() + " with " + spell.name + "]";
    }

}
