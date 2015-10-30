package fr.lby.events.unit;

import fr.lby.enums.EventType;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public class UnitDestroyedEvent extends UnitEvent {

    public UnitDestroyedEvent(String unknownField1, String unknownField2, String unknownField3, String unknownField4,
            Unit source) {
        super(unknownField1, unknownField2, unknownField3, unknownField4, source);
    }

    @Override
    public EventType getType() {
        return EventType.UNIT_DESTROYED;
    }

    @Override
    public String toString() {
        return "UnitDestroyedEvent [source=" + source.name + "]";
    }
}
