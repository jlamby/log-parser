package fr.lby.parser;

import org.apache.commons.lang3.BooleanUtils;

import fr.lby.enums.EventType;
import fr.lby.events.Event;

/**
 * @author jlamby
 *
 */
public abstract class AbstractHandler {

    protected AbstractHandler nextParser;
    protected EventType       eventType;

    public AbstractHandler nextParser(AbstractHandler nextParser) {
        this.nextParser = nextParser;
        return nextParser;
    }

    public Event parse(String type, String[] strings) {

        if (EventType.getByName(type) == getEventType()) {
            return parse(strings);
        }

        if (nextParser != null) {
            return nextParser.parse(type, strings);
        }

        return null;
    }

    protected abstract EventType getEventType();

    protected abstract Event parse(String[] strings);

    int parseInteger(String[] strings, int index) {
        return Integer.valueOf(strings[index]);
    }

    boolean parseBoolean(String[] strings, int index) {
        return BooleanUtils.toBoolean(strings[index], "1", "nil");
    }

}
