package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.enums.MissType;
import fr.lby.events.type.primary.SpellPeriodic;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellPeriodicMissedEvent extends SpellMissedEvent implements SpellPeriodic {

    public SpellPeriodicMissedEvent(Unit source, Unit destination, SpellInformation spell, MissType missType,
            boolean offHand, boolean multistrike, int amountMissed) {
        super(source, destination, spell, missType, offHand, multistrike, amountMissed);
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
