package fr.lby.parser.handlers;

import fr.lby.enums.EventType;
import fr.lby.events.PartyKillEvent;
import fr.lby.parser.ParserUtils;

/**
 * @author jlamby
 *
 */
public class PartyKillEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.PARTY_KILL;
    }

    @Override
    protected PartyKillEvent parse(String[] strings) {
        return new PartyKillEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings));
    }

}
