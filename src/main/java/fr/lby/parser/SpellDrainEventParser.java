package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.PowerType;
import fr.lby.events.spell.SpellDrainEvent;

/**
 * @author jlamby
 *
 */
public class SpellDrainEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_DRAIN;
    }

    @Override
    protected SpellDrainEvent parse(String[] strings) {
        return new SpellDrainEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings),
                parseInteger(strings, SpellDrainMapping.AMOUNT),
                PowerType.getByValue(parseInteger(strings, SpellDrainMapping.POWER_TYPE)),
                parseInteger(strings, SpellDrainMapping.EXTRA_AMOUNT));
    }

    protected static class SpellDrainMapping {
        static final int AMOUNT       = 25;
        static final int POWER_TYPE   = 26;
        static final int EXTRA_AMOUNT = 27;
    }

}
