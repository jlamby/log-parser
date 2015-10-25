package fr.lby.events.spell;

import fr.lby.enums.EventType;
import fr.lby.events.type.primary.SpellPeriodic;
import fr.lby.model.SpellInformation;
import fr.lby.model.SpellSchool;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicDamageEvent extends SpellDamageEvent implements SpellPeriodic {

    public SpellPeriodicDamageEvent(Unit source, Unit destination, SpellInformation spell, int amount, int overkill,
            SpellSchool spellSchool, int resisted, int blocked, int absorbed, boolean critical,
            boolean glancing, boolean crushing) {
        super(source, destination, spell, amount, overkill, spellSchool, resisted, blocked, absorbed, critical,
                glancing, crushing);
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
