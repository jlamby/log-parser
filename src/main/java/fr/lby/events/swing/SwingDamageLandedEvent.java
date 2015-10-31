package fr.lby.events.swing;

import fr.lby.enums.EventType;
import fr.lby.model.DamageInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SwingDamageLandedEvent extends SwingDamageEvent {

    public SwingDamageLandedEvent(Unit source, Unit destination, DamageInformation damage) {
        super(source, destination, damage);
    }

    @Override
    public EventType getType() {
        return EventType.SWING_DAMAGE_LANDED;
    }

    @Override
    public String toString() {
        return "SwingDamageLandedEvent [ " + source.name + " -> " + destination.name + " : " + damage.amount + "]";
    }
}
