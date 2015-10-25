package fr.lby.events.spell;

import fr.lby.enums.AuraType;
import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.AuraApplied;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellAuraAppliedEvent extends CombatEvent implements Spell, AuraApplied {

    public final SpellInformation spell;
    public final AuraType         auraType;

    @Override
    public EventType getType() {
        return EventType.SPELL_AURA_APPLIED;
    }

    public SpellAuraAppliedEvent(Unit source, Unit destination, SpellInformation spell, AuraType auraType) {
        super(source, destination);
        this.spell = spell;
        this.auraType = auraType;
    }

    @Override
    public String toString() {
        return "SpellAuraAppliedEvent [" + source.name + " " + auraType + " " + destination.name + " with " + spell.name
                + "]";
    }

}
