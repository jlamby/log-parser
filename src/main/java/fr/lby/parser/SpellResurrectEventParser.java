package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellResurrectEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellResurrectEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_RESURRECT;
    }

    @Override
    protected SpellResurrectEvent parse(String[] strings) {
        return new SpellResurrectEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings));
    }

}
