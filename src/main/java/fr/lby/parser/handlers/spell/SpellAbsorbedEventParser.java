package fr.lby.parser.handlers.spell;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAbsorbedEvent;
import fr.lby.parser.AbstractHandler;
import fr.lby.parser.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellAbsorbedEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_ABSORBED;
    }

    @Override
    protected SpellAbsorbedEvent parse(String[] strings) {
        if (strings.length > 17) {
            return new SpellAbsorbedEvent(
                    ParserUtils.parseSourceUnit(strings),
                    ParserUtils.parseDestinationUnit(strings),
                    ParserUtils.parseSpell(strings),
                    ParserUtils.parseUnit(strings, SpellAbsorbedEventMapping.EXTRA_UNIT_OFFSET),
                    ParserUtils.parseSpell(strings, SpellAbsorbedEventMapping.EXTRA_SPELL_OFFSET),
                    ParserUtils.parseInteger(strings, SpellAbsorbedEventMapping.AMOUNT));
        }
        return null;
    }

    protected static class SpellAbsorbedEventMapping {
        static final int EXTRA_UNIT_OFFSET  = 12;
        static final int EXTRA_SPELL_OFFSET = 16;
        static final int AMOUNT             = 19;
    }
}
