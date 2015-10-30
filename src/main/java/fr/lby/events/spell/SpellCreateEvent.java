package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.Create;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellCreateEvent extends CombatEvent implements Spell, Create {

    public final SpellInformation spell;

    @Override
    public EventType getType() {
        return EventType.SPELL_CREATE;
    }

    public SpellCreateEvent(Unit source, Unit destination, SpellInformation spell) {
        super(source, destination);
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "SpellCreateEvent [" + source.name + " creates " + spell.name + "]";
    }
}
