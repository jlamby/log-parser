package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.unit.UnitDiedEvent;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public class UnitDiedEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.UNIT_DIED;
    }

    @Override
    protected UnitDiedEvent parse(String[] strings) {
        Unit source = new Unit(
                strings[UnitDiedEventMapping.SOURCE_GUID],
                strings[UnitDiedEventMapping.SOURCE_NAME],
                strings[UnitDiedEventMapping.SOURCE_FLAGS],
                strings[UnitDiedEventMapping.SOURCE_FLAGS_2]);

        return new UnitDiedEvent(
                strings[UnitDiedEventMapping.UNKNOWN_FIELD_1],
                strings[UnitDiedEventMapping.UNKNOWN_FIELD_2],
                strings[UnitDiedEventMapping.UNKNOWN_FIELD_3],
                strings[UnitDiedEventMapping.UNKNOWN_FIELD_4],
                source);
    }

    protected static class UnitDiedEventMapping {
        static final int UNKNOWN_FIELD_1 = 1;
        static final int UNKNOWN_FIELD_2 = 2;
        static final int UNKNOWN_FIELD_3 = 3;
        static final int UNKNOWN_FIELD_4 = 4;
        static final int SOURCE_GUID     = 5;
        static final int SOURCE_NAME     = 6;
        static final int SOURCE_FLAGS    = 7;
        static final int SOURCE_FLAGS_2  = 8;
    }

}
