package fr.lby.parser.handlers.spell.cast;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCastStartEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class SpellCastStartEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_CAST_START;
    }

    @Override
    protected SpellCastStartEvent parse(String[] strings) {
        return new SpellCastStartEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings));
    }

}
