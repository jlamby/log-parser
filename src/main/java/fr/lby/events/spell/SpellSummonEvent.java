package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.Summon;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellSummonEvent extends CombatEvent implements Spell, Summon {

    public final SpellInformation spell;

    @Override
    public EventType getType() {
        return EventType.SPELL_SUMMON;
    }

    public SpellSummonEvent(Unit source, Unit destination, SpellInformation spell) {
        super(source, destination);
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "SpellSummonEvent [" + source.name + " summons " + spell.name + "]";
    }
}
