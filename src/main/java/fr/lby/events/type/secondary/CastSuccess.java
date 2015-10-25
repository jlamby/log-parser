package fr.lby.events.type.secondary;

/**
 * Triggered when channeled spells begin or when instant cast spells are cast. <br/>
 * This (obviously) isn't triggered when this spell misses.<br/>
 * On a miss SPELL_MISS will be triggered instead. Also, spells that invoke _CAST_START don't trigger this event when
 * they are done casting. <br/>
 * <br/>
 * Use _SPELL_MISS or _SPELL_DAMAGE or _SPELL_AURA_APPLIED to see when they were cast
 *
 * @author jlamby
 *
 */
public interface CastSuccess {

}
