package fr.lby.events.swing;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Swing;
import fr.lby.events.type.secondary.Damage;
import fr.lby.model.SpellSchool;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SwingDamageLandedEvent extends CombatEvent implements Swing, Damage {

    // SWING_DAMAGE_LANDED seems to compliment SWING_DAMAGE, but with the correct time when the actual damage hit

    public final int         amount;
    public final int         overkill;
    public final SpellSchool spellSchool;
    public final int         resisted;
    public final int         blocked;
    public final int         absorbed;
    public final boolean     critical;
    public final boolean     glancing;
    public final boolean     crushing;

    public SwingDamageLandedEvent(Unit source, Unit destination, int amount, int overkill, SpellSchool spellSchool,
            int resisted, int blocked, int absorbed, boolean critical, boolean glancing, boolean crushing) {
        super(source, destination);
        this.amount = amount;
        this.overkill = overkill;
        this.spellSchool = spellSchool;
        this.resisted = resisted;
        this.blocked = blocked;
        this.absorbed = absorbed;
        this.critical = critical;
        this.glancing = glancing;
        this.crushing = crushing;
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
