package fr.lby.enums;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jlamby
 *
 */
public enum EnvironmentalType {

    UNKNOWN,
    DROWNING,
    FALLING,
    FATIGUE,
    FIRE,
    LAVA,
    SLIME;

    public static EnvironmentalType getByValue(String value) {
        return Arrays
            .stream(values())
            .filter(type -> StringUtils.equalsIgnoreCase(type.name(), value))
            .findFirst()
            .orElseGet(() -> {
                LOGGER.warn("Environment type with name {} is UNKNOWN", value);
                return UNKNOWN;
            });
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(EnvironmentalType.class);

}
