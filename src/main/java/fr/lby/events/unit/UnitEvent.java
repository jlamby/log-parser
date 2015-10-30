package fr.lby.events.unit;

import fr.lby.events.Event;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public abstract class UnitEvent implements Event {

    public final String unknownField1;
    public final String unknownField2;
    public final String unknownField3;
    public final String unknownField4;
    public final Unit   source;

    public UnitEvent(String unknownField1, String unknownField2, String unknownField3, String unknownField4,
            Unit source) {
        super();
        this.unknownField1 = unknownField1;
        this.unknownField2 = unknownField2;
        this.unknownField3 = unknownField3;
        this.unknownField4 = unknownField4;
        this.source = source;
    }

}
