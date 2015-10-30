package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCreateEvent;

/**
 * @author jlamby
 *
 */
public class SpellCreateEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_CREATE;
    }

    @Override
    protected SpellCreateEvent parse(String[] strings) {
        return new SpellCreateEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings));
    }

}
