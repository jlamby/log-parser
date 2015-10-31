package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCastStartEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellCastStartEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_CAST_START;
    }

    @Override
    protected SpellCastStartEvent parse(String[] strings) {
        return new SpellCastStartEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings));
    }

}
