package fr.lby.parser.handlers.encounter;

import fr.lby.enums.EventType;
import fr.lby.events.encounter.EncounterEndEvent;
import fr.lby.events.encounter.EncounterStartEvent;

/**
 * @author jlamby
 *
 */
public class EncounterEndEventHandler extends EncounterStartEventHandler {

    @Override
    protected EncounterEndEvent parse(String[] strings) {
        EncounterStartEvent event = super.parse(strings);

        return new EncounterEndEvent(
                event.id,
                event.name,
                event.difficulty,
                event.raidSize,
                Boolean.valueOf(strings[EncounterEndEventMapping.SUCCESS]));
    }

    @Override
    protected EventType getEventType() {
        return EventType.ENCOUNTER_END;
    }

    protected static class EncounterEndEventMapping {
        static final int SUCCESS = 5;
    }

}
