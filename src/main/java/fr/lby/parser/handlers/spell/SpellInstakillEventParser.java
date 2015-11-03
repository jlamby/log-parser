package fr.lby.parser.handlers.spell;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellInstakillEvent;
import fr.lby.parser.AbstractHandler;
import fr.lby.parser.ParserUtils;

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
