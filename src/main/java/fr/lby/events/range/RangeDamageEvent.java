package fr.lby.events.range;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Range;
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
public class RangeDamageEvent extends CombatEvent implements Range, Damage {

    public final SpellInformation  spell;
    public final DamageInformation damage;

    public RangeDamageEvent(Unit source, Unit destination, SpellInformation spell,
            DamageInformation damageInformation) {
        super(source, destination);
        this.spell = spell;
        this.damage = damageInformation;
    }

    @Override
    public EventType getType() {
        return EventType.RANGE_DAMAGE;
    }

    @Override
    public String toString() {
        return "RangeDamageEvent [ " + source.name + " -> " + destination.name + " : "
                + damage.amount + "]";
    }
}
