package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.SpellPeriodic;
import fr.lby.events.type.secondary.Missed;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellPeriodicMissedEvent extends CombatEvent implements SpellPeriodic, Missed {

    public final SpellInformation spell;
    public final MissType         missType;
    public final boolean          offHand;
    public final boolean          multistrike;
    public final int              amountMissed;

    public SpellPeriodicMissedEvent(Unit source, Unit destination, SpellInformation spell, MissType missType,
            boolean offHand, boolean multistrike, int amountMissed) {
        super(source, destination);
        this.spell = spell;
        this.missType = missType;
        this.offHand = offHand;
        this.multistrike = multistrike;
        this.amountMissed = amountMissed;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_PERIODIC_MISSED;
    }

    @Override
    public String toString() {
        return "SpellPeriodicMissedEvent [ " + source.name + " (" + spell.name + ") -> " + destination.name + " : "
                + missType + " " + amountMissed + "]";
    }

}
