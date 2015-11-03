package fr.lby.parser.handlers.spell;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellSummonEvent;
import fr.lby.parser.AbstractHandler;
import fr.lby.parser.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellSummonEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_SUMMON;
    }

    @Override
    protected SpellSummonEvent parse(String[] strings) {
        return new SpellSummonEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings));
    }

}
