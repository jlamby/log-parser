package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellSummonEvent;

/**
 * @author jlamby
 *
 */
public class SpellSummonEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_SUMMON;
    }

    @Override
    protected SpellSummonEvent parse(String[] strings) {
        return new SpellSummonEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings));
    }

}
