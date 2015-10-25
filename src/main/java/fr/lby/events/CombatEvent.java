package fr.lby.events;

import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public abstract class CombatEvent extends BaseEvent {

    public final Unit destination;

    public CombatEvent(Unit source, Unit destination) {
        super(source);
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "CombatEvent [destination=" + destination + ", type=" + getType() + ", source=" + source + "]";
    }

}
