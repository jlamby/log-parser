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
    RANGE_DAMAGE,
    // SPELL_ABSORBED,
    SPELL_AURA_APPLIED,
    SPELL_AURA_APPLIED_DOSE,
    SPELL_AURA_REFRESH,
    SPELL_AURA_REMOVED,
    SPELL_AURA_REMOVED_DOSE,
    SPELL_CAST_FAILED,
    SPELL_CAST_START,
    SPELL_CAST_SUCCESS,
    SPELL_DAMAGE,
    SPELL_ENERGIZE,
    SPELL_PERIODIC_DAMAGE,
    SPELL_PERIODIC_HEAL,
    SPELL_PERIODIC_MISSED,
    SWING_DAMAGE,
    SWING_DAMAGE_LANDED,
    SWING_MISSED;

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