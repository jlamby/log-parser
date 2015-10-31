package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCastSuccessEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellCastSuccessEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_CAST_SUCCESS;
    }

    @Override
    protected SpellCastSuccessEvent parse(String[] strings) {
        return new SpellCastSuccessEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings));
    }

}
