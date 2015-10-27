package fr.lby.events.swing;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Swing;
import fr.lby.events.type.secondary.Missed;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SwingMissedEvent extends CombatEvent implements Swing, Missed {

    public final MissType missType;
    public final boolean  offHand;
    public final boolean  multistrike;
    public final int      amountMissed;

    public SwingMissedEvent(Unit source, Unit destination, MissType missType,
            boolean offHand, boolean multistrike, int amountMissed) {
        super(source, destination);
        this.missType = missType;
        this.offHand = offHand;
        this.multistrike = multistrike;
        this.amountMissed = amountMissed;
    }

    @Override
    public EventType getType() {
        return EventType.SWING_MISSED;
    }

    @Override
    public String toString() {
        return "SwingMissedEvent [ " + source.name + " -> " + destination.name + " : "
                + missType + " " + amountMissed + "]";
    }

}
