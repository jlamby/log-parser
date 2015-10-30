package fr.lby.events.type.secondary;

import fr.lby.model.SpellInformation;

/**
 * Spellcasting being interrupted by an ability such as Kick or Pummel.
 *
 * @author jlamby
 *
 */
public interface Interrupt {

    public SpellInformation getExtraSpell();

}
