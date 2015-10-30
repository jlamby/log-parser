package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.CastFailed;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellCastFailedEvent extends CombatEvent implements Spell, CastFailed {

    public final SpellInformation spell;
    public final String           failType;

    public SpellCastFailedEvent(Unit source, Unit destination, SpellInformation spell, String failType) {
        super(source, destination);
        this.spell = spell;
        this.failType = failType;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_CAST_FAILED;
    }

    @Override
    public String toString() {
        return "SpellCastFailedEvent [" + source.name + " failed to cast " + spell.name + ". " + failType + "]";
    }
}
