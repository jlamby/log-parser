package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellInstakillEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellInstakillEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_INSTAKILL;
    }

    @Override
    protected SpellInstakillEvent parse(String[] strings) {
        return new SpellInstakillEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings));
    }

}
