package fr.lby.events.encounter;

import fr.lby.enums.DifficultyType;

/**
 * @author jlamby
 *
 */
public class EncounterEndEvent extends EncounterStartEvent {

    public final boolean success;

    public EncounterEndEvent(int id, String name, DifficultyType difficulty, int raidSize, boolean success) {
        super(id, name, difficulty, raidSize);
        this.success = success;
    }

    @Override
    public String toString() {
        return "EncounterEndEvent [id=" + id + ", name=" + name + ", difficulty=" + difficulty
                + ", raidSize=" + raidSize + ", success=" + success + "]";
    }

}
