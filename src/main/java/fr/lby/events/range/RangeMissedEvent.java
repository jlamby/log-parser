package fr.lby.events.range;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Range;
import fr.lby.events.type.secondary.Missed;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class RangeMissedEvent extends CombatEvent implements Range, Missed {

    public final SpellInformation spell;
    public final MissType         missType;
    public final boolean          offHand;
    public final boolean          multistrike;
    public final int              amountMissed;

    public RangeMissedEvent(Unit source, Unit destination, SpellInformation spell, MissType missType, boolean offHand,
            boolean multistrike, int amount) {
        super(source, destination);
        this.spell = spell;
        this.missType = missType;
        this.offHand = offHand;
        this.multistrike = multistrike;
        this.amountMissed = amount;
    }

    @Override
    public EventType getType() {
        return EventType.RANGE_MISSED;
    }

    @Override
    public String toString() {
        return "RangeMissedEvent [ " + source.name + " -> " + destination.name + " : "
                + missType + " " + amountMissed + "]";
    }

}
