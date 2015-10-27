package fr.lby.events.range;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.events.type.primary.Range;
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
public class RangeDamageEvent extends CombatEvent implements Range, Damage {

    public final SpellInformation spell;
    public final int              amount;
    public final int              overkill;
    public final SpellSchool      spellSchool;
    public final int              resisted;
    public final int              blocked;
    public final int              absorbed;
    public final boolean          critical;
    public final boolean          glancing;
    public final boolean          crushing;

    public RangeDamageEvent(Unit source, Unit destination, SpellInformation spell, int amount, int overkill,
            SpellSchool spellSchool, int resisted, int blocked, int absorbed, boolean critical, boolean glancing,
            boolean crushing) {
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
        return EventType.RANGE_DAMAGE;
    }

    @Override
    public String toString() {
        return "RangeDamageEvent [ " + source.name + " -> " + destination.name + " : "
                + amount + "]";
    }
}
