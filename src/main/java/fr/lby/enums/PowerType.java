package fr.lby.enums;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jlamby
 *
 */
public enum PowerType {

    UNKNOWN(-99),
    HEALTH(-2),
    MANA(0),
    RAGE(1),
    FOCUS(2),
    ENERGY(3),
    @Deprecated
    PET_HAPPINESS(4),
    RUNES(5),
    RUNIC_POWER(6),
    SOUL_SHARD(7),
    ECLIPSE_ENERGY(8), // solar is + ; lunar is -
    HOLY_POWER(9),
    SOUND_ATRAMEDES(10),
    UNANMED(11),
    CHI(12),
    BURNING_EMBERS(14);

    private PowerType(int value) {
        this.value = value;
    }

    public int value;

    public static PowerType getByValue(int value) {
        return Arrays
                .stream(values())
                .filter(t -> t.value == value)
                .findFirst()
                .orElseGet(() -> {
                    LOGGER.warn("Unknown power type was found : {}", value);
                    return UNKNOWN;
                });
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(PowerType.class);

}
