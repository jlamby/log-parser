package fr.lby.enums;

import java.util.Arrays;

/**
 * @author jlamby
 *
 */
public enum DifficultyType {

    NONE,
    _5_PLAYER_INSTANCE,
    _5_PLAYER_HEROIC_INSTANCE,
    _10_PLAYER_RAID_INSTANCE,
    _25_PLAYER_RAID_INSTANCE,
    _10_PLAYER_HEROIC_INSTANCE,
    _25_PLAYER_HEROIC_INSTANCE,
    RAID_FINDER_INSTANCE,
    CHALLENGE_MODE_INSTANCE,
    _40_PLAYER_RAID_INSTANCE,
    NOT_USED_1,
    HEROIC_SCENARIO_INSTANCE,
    SCENARION_INSTANCE,
    NOT_USED_2,
    FLEXIBLE_RAID,
    HEROIC_FLEXIBLE_RAID;

    public static DifficultyType valueOf(int value) {
        return Arrays
            .stream(values())
            .filter(item -> item.ordinal() == value)
            .findFirst()
            .orElse(NONE);
    }

}
