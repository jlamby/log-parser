package fr.lby.parser.handlers.spell;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellHealEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class SpellHealEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_HEAL;
    }

    @Override
    protected SpellHealEvent parse(String[] strings) {

        return new SpellHealEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseInteger(strings, SpellHealEventMapping.AMOUNT),
                ParserUtils.parseInteger(strings, SpellHealEventMapping.OVERHEAL),
                ParserUtils.parseInteger(strings, SpellHealEventMapping.ABSORBED),
                ParserUtils.parseBoolean(strings, SpellHealEventMapping.CRITICAL));
    }

    protected static class SpellHealEventMapping {
        static final int AMOUNT   = 25;
        static final int OVERHEAL = 26;
        static final int ABSORBED = 27;
        static final int CRITICAL = 28;
    }
}
