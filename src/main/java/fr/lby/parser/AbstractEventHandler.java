package fr.lby.parser;

import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public abstract class AbstractEventHandler extends AbstractHandler {

    Unit parseSourceUnit(String[] strings) {
        return new Unit(
                strings[EventMapping.SOURCE_GUID],
                strings[EventMapping.SOURCE_NAME],
                strings[EventMapping.SOURCE_FLAGS],
                strings[EventMapping.SOURCE_FLAGS_2]);
    }

    protected static class EventMapping {
        public static final int TYPE           = 0;
        public static final int SOURCE_GUID    = 1;
        public static final int SOURCE_NAME    = 2;
        public static final int SOURCE_FLAGS   = 3;
        public static final int SOURCE_FLAGS_2 = 4;

    }
}
