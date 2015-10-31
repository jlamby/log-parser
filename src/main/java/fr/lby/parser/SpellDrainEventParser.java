package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.PowerType;
import fr.lby.events.spell.SpellDrainEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellDrainEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_DRAIN;
    }

    @Override
    protected SpellDrainEvent parse(String[] strings) {
        return new SpellDrainEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseInteger(strings, SpellDrainMapping.AMOUNT),
                PowerType.getByValue(ParserUtils.parseInteger(strings, SpellDrainMapping.POWER_TYPE)),
                ParserUtils.parseInteger(strings, SpellDrainMapping.EXTRA_AMOUNT));
    }

    protected static class SpellDrainMapping {
        static final int AMOUNT       = 25;
        static final int POWER_TYPE   = 26;
        static final int EXTRA_AMOUNT = 27;
    }

}
