package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.CombatEvent;
import fr.lby.model.Spell;
import fr.lby.model.SpellSchool;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public class SpellDamageEvent extends CombatEvent {

    public final Spell       spell;
    public final int         amount;
    public final int         overkill;
    public final SpellSchool spellSchool;
    public final boolean     resisted;
    public final boolean     blocked;
    public final boolean     absorbed;
    public final boolean     critical;
    public final boolean     glancing;
    public final boolean     crushing;

    public SpellDamageEvent(Unit source, Unit destination, Spell spell, int amount, int overkill,
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
        return EventType.SPELL_DAMAGE;
    }

    @Override
    public String toString() {
        return "SpellDamageEvent [ " + source.name + " (" + spell.name + ") -> " + destination.name + " : " + amount
                + "]";
    }

}
