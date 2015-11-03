package fr.lby.parser.handlers.spell.cast;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCastSuccessEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class SpellCastSuccessEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_CAST_SUCCESS;
    }

    @Override
    protected SpellCastSuccessEvent parse(String[] strings) {
        return new SpellCastSuccessEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings));
    }

}
