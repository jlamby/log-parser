package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellHealEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellHealEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_HEAL;
    }

    @Override
    protected SpellHealEvent parse(String[] strings) {

        return new SpellHealEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                parseInteger(strings, SpellHealEventMapping.AMOUNT),
                parseInteger(strings, SpellHealEventMapping.OVERHEAL),
                parseInteger(strings, SpellHealEventMapping.ABSORBED),
                parseBoolean(strings, SpellHealEventMapping.CRITICAL));
    }

    protected static class SpellHealEventMapping {
        static final int AMOUNT   = 25;
        static final int OVERHEAL = 26;
        static final int ABSORBED = 27;
        static final int CRITICAL = 28;
    }
}
