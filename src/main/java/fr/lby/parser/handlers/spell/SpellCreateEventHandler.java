package fr.lby.parser.handlers.spell;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCreateEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class SpellCreateEventHandler extends AbstractHandler {

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
