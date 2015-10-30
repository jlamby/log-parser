package fr.lby.events.spell;

import fr.lby.enums.AuraType;
import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.Dispel;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellDispelEvent extends CombatEvent implements Spell, Dispel {

    private final SpellInformation spell;
    private final SpellInformation extraSpell;
    private final AuraType         auraType;

    public SpellDispelEvent(Unit source, Unit destination, SpellInformation spell,
            SpellInformation interruptedSpell, AuraType auraType) {
        super(source, destination);
        this.spell = spell;
        this.extraSpell = interruptedSpell;
        this.auraType = auraType;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_DISPEL;
    }

    @Override
    public String toString() {
        return "SpellDispelEvent [" + source.name + " dispels " + destination.name + " " + extraSpell.name
                + " with " + spell.name + "]";
    }

}
