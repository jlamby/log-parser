package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.unit.UnitDestroyedEvent;

/**
 * @author jlamby
 *
 */
public class UnitDestroyedEventParser extends AbstractUnitEventParser {

    @Override
    protected EventType getEventType() {
        return EventType.UNIT_DESTROYED;
    }

    @Override
    protected UnitDestroyedEvent parse(String[] strings) {
        return new UnitDestroyedEvent(
                strings[UnitEventMapping.UNKNOWN_FIELD_1],
                strings[UnitEventMapping.UNKNOWN_FIELD_2],
                strings[UnitEventMapping.UNKNOWN_FIELD_3],
                strings[UnitEventMapping.UNKNOWN_FIELD_4],
                parseSourceUnit(strings));
    }

}
