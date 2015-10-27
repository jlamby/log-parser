package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.PartyKillEvent;

/**
 * @author jlamby
 *
 */
public class PartyKillEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.PARTY_KILL;
    }

    @Override
    protected PartyKillEvent parse(String[] strings) {
        return new PartyKillEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings));
    }

}
