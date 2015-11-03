package fr.lby.parser.handlers.encounter;

import fr.lby.enums.DifficultyType;
import fr.lby.enums.EventType;
import fr.lby.events.encounter.EncounterStartEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class EncounterStartEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.ENCOUNTER_START;
    }

    @Override
    protected EncounterStartEvent parse(String[] strings) {
        return new EncounterStartEvent(
                ParserUtils.parseInteger(strings, EncounterStartEventMapping.ID),
                strings[EncounterStartEventMapping.NAME],
                DifficultyType.valueOf(ParserUtils.parseInteger(strings, EncounterStartEventMapping.DIFFICULTY_TYPE)),
                ParserUtils.parseInteger(strings, EncounterStartEventMapping.RAID_SIZE));

    }

    protected static class EncounterStartEventMapping {
        static final int ID              = 1;
        static final int NAME            = 2;
        static final int DIFFICULTY_TYPE = 3;
        static final int RAID_SIZE       = 4;
    }

}
