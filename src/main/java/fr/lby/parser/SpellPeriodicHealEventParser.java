package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellPeriodicHealEvent;
import fr.lby.events.type.Event;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicHealEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_HEAL;
    }

    @Override
    protected Event parse(String[] strings) {
        return new SpellPeriodicHealEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseInteger(strings, SpellPeriodicHealEventMapping.AMOUNT),
                ParserUtils.parseInteger(strings, SpellPeriodicHealEventMapping.OVERHEAL),
                ParserUtils.parseInteger(strings, SpellPeriodicHealEventMapping.ABSORBED),
                ParserUtils.parseBoolean(strings, SpellPeriodicHealEventMapping.CRITICAL));
    }

    protected static class SpellPeriodicHealEventMapping {
        static final int AMOUNT   = 25;
        static final int OVERHEAL = 26;
        static final int ABSORBED = 27;
        static final int CRITICAL = 28;
    }
}
