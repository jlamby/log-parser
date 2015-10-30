package fr.lby.events.spell;

import fr.lby.enums.AuraType;
import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.AuraBrokenSpell;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellAuraBrokenSpellEvent extends CombatEvent implements Spell, AuraBrokenSpell {

    public final SpellInformation spell;
    public final SpellInformation extraSpell;
    public final AuraType         auraType;

    @Override
    public EventType getType() {
        return EventType.SPELL_AURA_BROKEN_SPELL;
    }

    public SpellAuraBrokenSpellEvent(Unit source, Unit destination, SpellInformation spell, SpellInformation extraSpell,
            AuraType auraType) {
        super(source, destination);
        this.spell = spell;
        this.extraSpell = extraSpell;
        this.auraType = auraType;
    }

    @Override
    public String toString() {
        return "SpellAuraBrokenSpellEvent [" + source.name + " " + auraType + " " + destination.name + " with "
                + spell.name + "]";
    }

}
