package fr.lby.parser.handlers.spell.cast;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCastFailedEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class SpellCastFailedEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_CAST_FAILED;
    }

    @Override
    protected SpellCastFailedEvent parse(String[] strings) {
        return new SpellCastFailedEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                strings[SpellCastFailedEventMapping.FAIL_TYPE]);
    }

    protected static class SpellCastFailedEventMapping {
        static final int FAIL_TYPE = 12;
    }

}
