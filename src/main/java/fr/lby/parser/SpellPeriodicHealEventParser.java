package fr.lby.parser;

import org.apache.commons.lang3.BooleanUtils;

import fr.lby.enums.EventType;
import fr.lby.events.Event;
import fr.lby.events.spell.SpellPeriodicHealEvent;
import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicHealEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_HEAL;
    }

    @Override
    protected Event parse(String[] strings) {
        SpellInformation spell = parseSpell(strings);

        return new SpellPeriodicHealEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell,
                Integer.valueOf(strings[SpellPeriodicHealEventMapping.AMOUNT]),
                Integer.valueOf(strings[SpellPeriodicHealEventMapping.OVERHEAL]),
                BooleanUtils.toBoolean(strings[SpellPeriodicHealEventMapping.ABSORBED], "1", "0"),
                BooleanUtils.toBoolean(strings[SpellPeriodicHealEventMapping.CRITICAL], "1", "nil"));
    }

    protected static class SpellPeriodicHealEventMapping {
        static final int AMOUNT   = 25;
        static final int OVERHEAL = 26;
        static final int ABSORBED = 27;
        static final int CRITICAL = 28;
    }
}
