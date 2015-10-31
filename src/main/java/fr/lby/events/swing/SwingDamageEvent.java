package fr.lby.events.swing;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Swing;
import fr.lby.events.type.secondary.Damage;
import fr.lby.model.DamageInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SwingDamageEvent extends CombatEvent implements Swing, Damage {

    public final DamageInformation damage;

    public SwingDamageEvent(Unit source, Unit destination, DamageInformation damage) {
        super(source, destination);
        this.damage = damage;
    }

    @Override
    public EventType getType() {
        return EventType.SWING_DAMAGE;
    }

    @Override
    public String toString() {
        return "SwingDamageEvent [ " + source.name + " -> " + destination.name + " : " + damage.amount + "]";
    }
}