package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.Absorbed;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellAbsorbedEvent extends CombatEvent implements Spell, Absorbed {

    public final SpellInformation spell;
    public final Unit             extraUnit;
    public final SpellInformation extraSpell;
    public final int              amount;

    public SpellAbsorbedEvent(Unit source, Unit destination, SpellInformation spell, Unit extraUnit,
            SpellInformation extraSpell, int amount) {
        super(source, destination);
        this.spell = spell;
        this.extraUnit = extraUnit;
        this.extraSpell = extraSpell;
        this.amount = amount;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_ABSORBED;
    }

    @Override
    public String toString() {
        return "SpellAbsorbedEvent [ " + source.name + " (" + spell.name + ") -> " + destination.name + " : "
                + amount + "]";
    }

}
