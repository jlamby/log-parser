package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellResurrectEvent;

/**
 * @author jlamby
 *
 */
public class SpellResurrectEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_RESURRECT;
    }

    @Override
    protected SpellResurrectEvent parse(String[] strings) {
        return new SpellResurrectEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings));
    }

}
