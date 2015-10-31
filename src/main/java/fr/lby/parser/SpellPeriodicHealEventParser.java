package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellHealEvent;
import fr.lby.events.spell.SpellPeriodicHealEvent;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicHealEventParser extends SpellHealEventParser {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_HEAL;
    }

    @Override
    protected SpellPeriodicHealEvent parse(String[] strings) {
        SpellHealEvent event = super.parse(strings);

        return new SpellPeriodicHealEvent(
                event.source,
                event.destination,
                event.spell,
                event.amount,
                event.overheal,
                event.absorbed,
                event.critical);
    }

    protected static class SpellPeriodicHealEventMapping {
        static final int AMOUNT   = 25;
        static final int OVERHEAL = 26;
        static final int ABSORBED = 27;
        static final int CRITICAL = 28;
    }
}
