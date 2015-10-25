package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.SpellPeriodic;
import fr.lby.events.type.secondary.Damage;
import fr.lby.model.SpellInformation;
import fr.lby.model.SpellSchool;
import fr.lby.model.Unit;
import lombok.Getter;

/**
 * @author jlamby
 *
 */
@Getter
public class SpellPeriodicDamageEvent extends CombatEvent implements SpellPeriodic, Damage {

    public final SpellInformation spell;
    public final int              amount;
    public final int              overkill;
    public final SpellSchool      spellSchool;
    public final boolean          resisted;
    public final boolean          blocked;
    public final boolean          absorbed;
    public final boolean          critical;
    public final boolean          glancing;
    public final boolean          crushing;

    public SpellPeriodicDamageEvent(Unit source, Unit destination, SpellInformation spell, int amount, int overkill,
            SpellSchool spellSchool, boolean resisted, boolean blocked, boolean absorbed, boolean critical,
            boolean glancing, boolean crushing) {
        super(source, destination);
        this.spell = spell;
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
        return EventType.SPELL_PERIODIC_DAMAGE;
    }

    @Override
    public String toString() {
        return "SpellPeriodicDamage [ " + source.name + " (" + spell.name + ") -> " + destination.name + " : " + amount
                + "]";
    }

}
