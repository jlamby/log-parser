package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.enums.PowerType;
import fr.lby.events.spell.SpellEnergizeEvent;
import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public class SpellEnergizeEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_ENERGIZE;
    }

    @Override
    protected SpellEnergizeEvent parse(String[] strings) {
        SpellInformation spell = parseSpell(strings);

        return new SpellEnergizeEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell,
                parseInteger(strings, SpellEnergizeMapping.AMOUNT),
                PowerType.getByValue(parseInteger(strings, SpellEnergizeMapping.POWER_TYPE)));
    }

    protected static class SpellEnergizeMapping {
        static final int AMOUNT     = 25;
        static final int POWER_TYPE = 26;
    }

}
