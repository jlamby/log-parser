package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellInterruptEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellInterruptEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_INTERRUPT;
    }

    @Override
    protected SpellInterruptEvent parse(String[] strings) {
        return new SpellInterruptEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseSpell(strings, EXTRA_SPELL_OFFSET));
    }

    protected static final int EXTRA_SPELL_OFFSET = 12;

}
