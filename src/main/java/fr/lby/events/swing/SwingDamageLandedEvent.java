package fr.lby.events.swing;

import fr.lby.enums.EventType;
import fr.lby.model.SpellSchool;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SwingDamageLandedEvent extends SwingDamageEvent {

    public SwingDamageLandedEvent(Unit source, Unit destination, int amount, int overkill, SpellSchool spellSchool,
            int resisted, int blocked, int absorbed, boolean critical, boolean glancing, boolean crushing) {
        super(source, destination, amount, overkill, spellSchool, resisted, blocked, absorbed, critical, glancing,
                crushing);
    }

    @Override
    public EventType getType() {
        return EventType.SWING_DAMAGE_LANDED;
    }

    @Override
    public String toString() {
        return "SwingDamageLandedEvent [ " + source.name + " -> " + destination.name + " : "
                + amount + "]";
    }
}
