package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellInterruptEvent;

/**
 * @author jlamby
 *
 */
public class SpellInterruptEventParser extends AbstractExtraSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_INTERRUPT;
    }

    @Override
    protected SpellInterruptEvent parse(String[] strings) {
        return new SpellInterruptEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings),
                parseExtraSpell(strings));
    }

}
