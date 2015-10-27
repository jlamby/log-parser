package fr.lby.events.spell;

/**
 * If the cast fails before it starts (IE invalid target), then _CAST_START never triggers. <br/>
 * <br/>
 * However it is possible for a cast to fail after beginning. (IE you jump, move, hit escape etc.)
 *
 * @author jlamby
 *
 */
public interface CastFailed {

    public String getFailType();

}
