package fr.lby.events.type.secondary;

import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public interface Absorbed {

    public Unit getExtraUnit();

    public SpellInformation getExtraSpell();

    public int getAmount();

}
