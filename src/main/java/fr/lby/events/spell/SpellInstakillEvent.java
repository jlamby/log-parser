package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.Instakill;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellInstakillEvent extends CombatEvent implements Spell, Instakill {

    public final SpellInformation spell;

    @Override
    public EventType getType() {
        return EventType.SPELL_INSTAKILL;
    }

    public SpellInstakillEvent(Unit source, Unit destination, SpellInformation spell) {
        super(source, destination);
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "SpellInstakillEvent [ " + source.name + " instakills " + destination.name + " with " + spell.name
                + " ]";
    }

}
