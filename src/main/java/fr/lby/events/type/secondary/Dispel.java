package fr.lby.events.type.secondary;

import fr.lby.enums.AuraType;
import fr.lby.model.SpellInformation;

/**
 * A buff or debuff being actively dispelled by a spell like Remove Curse or Dispel Magic. <br/>
 * <br/>
 * The source is the caster of the aura that was dispelled, and the destination is the target which was dispelled (needs
 * verifying).
 * 
 * @author jlamby
 *
 */
public interface Dispel {

    public SpellInformation getExtraSpell();

    public AuraType getAuraType();

}
