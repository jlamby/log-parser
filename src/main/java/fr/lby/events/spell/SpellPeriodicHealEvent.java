package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.SpellPeriodic;
import fr.lby.events.type.secondary.Heal;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellPeriodicHealEvent extends CombatEvent implements SpellPeriodic, Heal {

    public final SpellInformation spell;
    public final int              amount;
    public final int              overheal;
    public final int              absorbed;
    public final boolean          critical;

    public SpellPeriodicHealEvent(Unit source, Unit destination, SpellInformation spell, int amount, int overheal,
            int absorbed, boolean critical) {
        super(source, destination);
        this.spell = spell;
        this.amount = amount;
        this.overheal = overheal;
        this.absorbed = absorbed;
        this.critical = critical;
    }

    @Override
    public EventType getType() {
        return EventType.SPELL_PERIODIC_HEAL;
    }

    @Override
    public String toString() {
        return "SpellPeriodicHealEvent [ " + source.name + " (" + spell.name + ") -> " + destination.name + " : "
                + amount + "]";
    }

}
