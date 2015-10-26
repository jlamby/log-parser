package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.CastStart;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
public class SpellCastStartEvent extends CombatEvent implements Spell, CastStart {

    @Getter
    public final SpellInformation spell;

    public SpellCastStartEvent(Unit source, Unit destination, SpellInformation spell) {
        super(source, destination);
        this.spell = spell;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_CAST_START;
    }

    @Override
    public String toString() {
        return "SpellCastStartEvent [" + source.name + " start casting " + spell.name + "]";
    }

}
