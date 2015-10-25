package fr.lby.parser;

import fr.lby.enums.DifficultyType;
import fr.lby.enums.EventType;
import fr.lby.events.encounter.EncounterStartEvent;

/**
 * @author jlamby
 *
 */
public class EncounterStartEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.ENCOUNTER_START;
    }

    @Override
    protected EncounterStartEvent parse(String[] strings) {
        return new EncounterStartEvent(
                parseInteger(strings, EncounterStartEventMapping.ID),
                strings[EncounterStartEventMapping.NAME],
                DifficultyType.valueOf(Integer.valueOf(strings[EncounterStartEventMapping.DIFFICULTY_TYPE])),
                parseInteger(strings, EncounterStartEventMapping.RAID_SIZE));

    }

    protected static class EncounterStartEventMapping {
        static final int ID              = 1;
        static final int NAME            = 2;
        static final int DIFFICULTY_TYPE = 3;
        static final int RAID_SIZE       = 4;
    }

}
