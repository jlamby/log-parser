package fr.lby.events.type.secondary;

import fr.lby.model.SpellInformation;

/**
 * A buff or debuff is being removed by spell damage.<br/>
 * <br/>
 * The source is the name of the caster of the aura that was broken, and the destination is the target which the aura
 * broke off of (needs verifying).
 *
 * @author jlamby
 *
 */
public interface AuraBrokenSpell extends Aura {

    public SpellInformation getExtraSpell();

}
