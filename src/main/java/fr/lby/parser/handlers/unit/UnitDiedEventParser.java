package fr.lby.parser.handlers.unit;

import fr.lby.enums.EventType;
import fr.lby.events.unit.UnitDiedEvent;

/**
 * @author jlamby
 *
 */
public class UnitDiedEventParser extends AbstractUnitEventParser {

    @Override
    protected EventType getEventType() {
        return EventType.UNIT_DIED;
    }

    @Override
    protected UnitDiedEvent parse(String[] strings) {
        return new UnitDiedEvent(
                strings[UnitEventMapping.UNKNOWN_FIELD_1],
                strings[UnitEventMapping.UNKNOWN_FIELD_2],
                strings[UnitEventMapping.UNKNOWN_FIELD_3],
                strings[UnitEventMapping.UNKNOWN_FIELD_4],
                parseSourceUnit(strings));
    }

}
