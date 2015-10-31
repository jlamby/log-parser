package fr.lby.events.spell;

import fr.lby.enums.AuraType;
import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.AuraBroken;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellAuraBrokenEvent extends CombatEvent implements Spell, AuraBroken {

    public final SpellInformation spell;
    public final AuraType         auraType;

    public SpellAuraBrokenEvent(Unit source, Unit destination, SpellInformation spell, AuraType auraType) {
        super(source, destination);
        this.spell = spell;
        this.auraType = auraType;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_AURA_BROKEN;
    }

    @Override
    public String toString() {
        return "SpellAuraBrokenEvent [" + source.name + " removes " + auraType + " " + spell.name + " from "
                + destination.name + "]";
    }

}
