package fr.lby.events.type.primary;

import fr.lby.model.SpellInformation;

/**
 * Spell is the prefix for most effects even if the spell is a DoT or channeled. <br/>
 * IE when the spell begins to be cast, SPELL_CAST_START is fired and not SPELL_PERIODIC_CAST_START. This is the same
 * with _MISS, _FAILED, etc.
 *
 * @author jlamby
 *
 */
public interface Spell {

    public SpellInformation getSpell();

}
