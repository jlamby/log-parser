package fr.lby.events.unit;

import fr.lby.enums.EventType;
import fr.lby.events.Event;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public class UnitDiedEvent implements Event {

    public final String unknownField1;
    public final String unknownField2;
    public final String unknownField3;
    public final String unknownField4;
    public final Unit   source;

    public UnitDiedEvent(String unknownField1, String unknownField2, String unknownField3, String unknownField4,
            Unit source) {
        this.unknownField1 = unknownField1;
        this.unknownField2 = unknownField2;
        this.unknownField3 = unknownField3;
        this.unknownField4 = unknownField4;
        this.source = source;
    }

    @Override
    public EventType getType() {
        return EventType.UNIT_DIED;
    }

    @Override
    public String toString() {
        return "UnitDiedEvent [source=" + source + "]";
    }

}
