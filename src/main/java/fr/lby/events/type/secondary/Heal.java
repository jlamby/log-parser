package fr.lby.events.type.secondary;

/**
 * Triggered when a unit is healed
 *
 * @author jlamby
 *
 */
public interface Heal {

    public int getAmount();

    public int getOverheal();

    public int getAbsorbed();

    public boolean isCritical();

}
