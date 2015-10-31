package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCreateEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellCreateEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_CREATE;
    }

    @Override
    protected SpellCreateEvent parse(String[] strings) {
        return new SpellCreateEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings));
    }

}
