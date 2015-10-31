package fr.lby.events;

import fr.lby.enums.EnvironmentalType;
import fr.lby.enums.EventType;
import fr.lby.events.type.primary.Environmental;
import fr.lby.events.type.secondary.Damage;
import fr.lby.model.DamageInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class EnvironmentalDamageEvent extends CombatEvent implements Environmental, Damage {

    public final EnvironmentalType environmentalType;
    public final DamageInformation damage;

    public EnvironmentalDamageEvent(Unit source, Unit destination, EnvironmentalType environmentalType,
            DamageInformation damageInformation) {
        super(source, destination);
        this.environmentalType = environmentalType;
        this.damage = damageInformation;
    }

    @Override
    public EventType getType() {
        return EventType.ENVIRONMENTAL_DAMAGE;
    }

    @Override
    public String toString() {
        return "EnvironmentalDamage [ " + environmentalType + " -> " + destination.name + " : "
                + damage.amount + "]";
    }
}
