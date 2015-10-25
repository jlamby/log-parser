package fr.lby.events.type.secondary;

import fr.lby.model.SpellSchool;

/**
 * Triggered on damage to health. Nothing Special. (overkill returns a number greater than or equal to zero)
 *
 * @author jlamby
 *
 */
public interface Damage {

    public int getAmount();

    public int getOverkill();

    public SpellSchool getSpellSchool();

    public int getResisted();

    public int getBlocked();

    public int getAbsorbed();

    public boolean isCritical();

    public boolean isGlancing();

    public boolean isCrushing();

}
