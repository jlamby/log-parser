package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellSummonEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellSummonEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_SUMMON;
    }

    @Override
    protected SpellSummonEvent parse(String[] strings) {
        return new SpellSummonEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings));
    }

}
