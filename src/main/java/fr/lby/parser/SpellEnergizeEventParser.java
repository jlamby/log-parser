package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.PowerType;
import fr.lby.events.spell.SpellEnergizeEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellEnergizeEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_ENERGIZE;
    }

    @Override
    protected SpellEnergizeEvent parse(String[] strings) {
        return new SpellEnergizeEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseInteger(strings, SpellEnergizeMapping.AMOUNT),
                PowerType.getByValue(ParserUtils.parseInteger(strings, SpellEnergizeMapping.POWER_TYPE)));
    }

    protected static class SpellEnergizeMapping {
        static final int AMOUNT     = 25;
        static final int POWER_TYPE = 26;
    }

}
