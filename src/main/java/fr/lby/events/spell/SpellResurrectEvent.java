package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.Resurrect;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
public class SpellResurrectEvent extends CombatEvent implements Spell, Resurrect {

    @Getter
    public final SpellInformation spell;

    public SpellResurrectEvent(Unit source, Unit destination, SpellInformation spell) {
        super(source, destination);
        this.spell = spell;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_RESURRECT;
    }

    @Override
    public String toString() {
        return "SpellResurrectEvent [" + source.name + " resurrects " + destination.name + " with " + spell.name + "]";
    }

}
