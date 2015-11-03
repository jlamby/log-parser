package fr.lby.parser.handlers.unit;

import fr.lby.model.Unit;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public abstract class AbstractUnitEventHandler extends AbstractHandler {

    Unit parseSourceUnit(String[] strings) {
        return new Unit(
                strings[UnitEventMapping.SOURCE_GUID],
                strings[UnitEventMapping.SOURCE_NAME],
                strings[UnitEventMapping.SOURCE_FLAGS],
                strings[UnitEventMapping.SOURCE_FLAGS_2]);
    }

    protected static class UnitEventMapping {
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
