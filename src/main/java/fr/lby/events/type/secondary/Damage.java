package fr.lby.events.type.secondary;

import fr.lby.model.DamageInformation;

/**
 * Triggered on damage to health. Nothing Special. (overkill returns a number greater than or equal to zero)
 *
 * @author jlamby
 *
 */
public interface Damage {

    public DamageInformation getDamage();

}
