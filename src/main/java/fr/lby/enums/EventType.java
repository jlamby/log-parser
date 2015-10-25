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
    SPELL_AURA_APPLIED,
    SPELL_AURA_REMOVED,
    SPELL_DAMAGE,
    SPELL_CAST_SUCCESS,
    SPELL_PERIODIC_HEAL,
    SPELL_PERIODIC_DAMAGE,
    SWING_DAMAGE_LANDED;

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