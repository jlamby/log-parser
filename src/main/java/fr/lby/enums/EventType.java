package fr.lby.enums;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jlamby
 *
 */
public enum EventType {

    UNKNOWN,
    ENCOUNTER_START,
    ENCOUNTER_END,
    UNIT_DIED,
    SPELL_DAMAGE,
    SPELL_PERIODIC_HEAL;

    public static EventType getByName(String name) {
        return Arrays
            .stream(values())
            .filter(type -> type.name().equals(name))
            .findFirst()
            .orElseGet(() -> {
                LOGGER.debug("Event type with name {} is UNKNOWN", name);
                return UNKNOWN;
            });
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(EventType.class);

}