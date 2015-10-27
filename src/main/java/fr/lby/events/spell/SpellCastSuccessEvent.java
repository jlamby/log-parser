package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.CastSuccess;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
public class SpellCastSuccessEvent extends CombatEvent implements Spell, CastSuccess {

    @Getter
    public final SpellInformation spell;

    public SpellCastSuccessEvent(Unit source, Unit destination, SpellInformation spell) {
        super(source, destination);
        this.spell = spell;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_CAST_SUCCESS;
    }

    @Override
    public String toString() {
        return "SpellCastSuccess [" + source.name + " successfuly cast " + spell.name + "]";
    }

}
