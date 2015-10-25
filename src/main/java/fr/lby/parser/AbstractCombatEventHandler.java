package fr.lby.parser;

import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public abstract class AbstractCombatEventHandler extends AbstractEventHandler {

    Unit parseDestinationUnit(String[] strings) {
        return new Unit(
                strings[CombatEventMapping.DESTINATION_GUID],
                strings[CombatEventMapping.DESTINATION_NAME],
                strings[CombatEventMapping.DESTINATION_FLAGS],
                strings[CombatEventMapping.DESTINATION_FLAGS_2]);
    }

    protected static class CombatEventMapping {
        public static final int DESTINATION_GUID    = 5;
        public static final int DESTINATION_NAME    = 6;
        public static final int DESTINATION_FLAGS   = 7;
        public static final int DESTINATION_FLAGS_2 = 8;
    }

}
