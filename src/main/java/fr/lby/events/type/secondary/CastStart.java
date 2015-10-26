package fr.lby.events.type.secondary;

/**
 * Triggered when a spell begins casting. <br/>
 * Instant Cast and channeled spells don't invoke this event. They trigger _CAST_SUCCESS, _MISS instead.
 *
 * @author jlamby
 *
 */
public interface CastStart {

}
