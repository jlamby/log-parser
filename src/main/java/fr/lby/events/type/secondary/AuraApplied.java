package fr.lby.events.type.secondary;

/**
 * Triggered When Buffs/Debuffs are Applied. <br/>
 * <br/>
 * <b>Note:</b> This event doesn't fire if a debuff is applied twice without being removed.<br/>
 * IE: casting Vampiric Embrace twice in a row only triggers this event once. This can make it difficult to track
 * whether a debuff was successfully reapplied to the target. However, for instant cast spells, SPELL_CAST_SUCCESS can
 * be used.
 *
 * @author jlamby
 *
 */
public interface AuraApplied extends Aura {

}
