package fr.lby.events.spell;

import fr.lby.enums.AuraType;
import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.AuraRemoved;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellAuraRemovedEvent extends CombatEvent implements Spell, AuraRemoved {

    public final SpellInformation spell;
    public final AuraType         auraType;
    public final int              amount;

    public SpellAuraRemovedEvent(Unit source, Unit destination, SpellInformation spell, AuraType auraType, int amount) {
        super(source, destination);
        this.spell = spell;
        this.auraType = auraType;
        this.amount = amount;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_AURA_REMOVED;
    }

    @Override
    public String toString() {
        return "SpellAuraRemovedEvent [" + source.name + " " + auraType + " " + destination.name + " with " + spell.name
                + " (" + amount + ")]";
    }

}
