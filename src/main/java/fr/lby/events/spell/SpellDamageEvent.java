package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Spell;
import fr.lby.events.type.secondary.Damage;
import fr.lby.model.DamageInformation;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellDamageEvent extends CombatEvent implements Spell, Damage {

    public final SpellInformation  spell;
    public final DamageInformation damage;

    public SpellDamageEvent(Unit source, Unit destination, SpellInformation spell,
            DamageInformation damageInformation) {
        super(source, destination);
        this.spell = spell;
        this.damage = damageInformation;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_DAMAGE;
    }

    @Override
    public String toString() {
        return "SpellDamageEvent [ " + source.name + " (" + spell.name + ") -> " + destination.name + " : "
                + damage.amount + "]";
    }

}
