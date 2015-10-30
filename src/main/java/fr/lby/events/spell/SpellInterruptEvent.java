package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.Interrupt;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellInterruptEvent extends CombatEvent implements Spell, Interrupt {

    private final SpellInformation spell;
    private final SpellInformation extraSpell;

    public SpellInterruptEvent(Unit source, Unit destination, SpellInformation spell,
            SpellInformation interruptedSpell) {
        super(source, destination);
        this.spell = spell;
        this.extraSpell = interruptedSpell;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_INTERRUPT;
    }

    @Override
    public String toString() {
        return "SpellInterruptEvent [" + source.name + " interrupts " + destination.name + " " + extraSpell.name
                + " with " + spell.name + "]";
    }

}
