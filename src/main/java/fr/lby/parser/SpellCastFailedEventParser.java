package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCastFailedEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellCastFailedEventParser extends AbstractHandler {

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
