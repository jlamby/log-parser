package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.PowerType;
import fr.lby.events.spell.SpellPeriodicEnergizeEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicEnergizeEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_ENERGIZE;
    }

    @Override
    protected SpellPeriodicEnergizeEvent parse(String[] strings) {
        return new SpellPeriodicEnergizeEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseInteger(strings, SpellPeriodicEnergizeEventMapping.AMOUNT),
                PowerType.getByValue(ParserUtils.parseInteger(strings, SpellPeriodicEnergizeEventMapping.POWER_TYPE)));
    }

    protected static class SpellPeriodicEnergizeEventMapping {
        static final int AMOUNT     = 25;
        static final int POWER_TYPE = 26;
    }

}
