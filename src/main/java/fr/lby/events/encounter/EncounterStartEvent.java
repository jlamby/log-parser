package fr.lby.events.encounter;

import fr.lby.enums.DifficultyType;
import fr.lby.enums.EventType;
import fr.lby.events.type.Event;

/**
 * @author jlamby
 *
 */
public class EncounterStartEvent implements Event {

    public final int            id;
    public final String         name;
    public final DifficultyType difficulty;
    public final int            raidSize;

    public EncounterStartEvent(int id, String name, DifficultyType difficulty, int raidSize) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
        this.raidSize = raidSize;
    }

    @Override
    public EventType getType() {
        return EventType.ENCOUNTER_START;
    }

    @Override
    public String toString() {
        return "EncounterStartEvent [id=" + id + ", name=" + name + ", difficulty=" + difficulty + ", raidSize="
                + raidSize + "]";
    }

}
