package fr.lby.events;

import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public abstract class BaseEvent implements Event {

    public final Unit source;

    public BaseEvent(Unit source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Event [type=" + getType() + ", source=" + source + "]";
    }

}
