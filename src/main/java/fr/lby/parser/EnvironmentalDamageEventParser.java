package fr.lby.parser;

import fr.lby.enums.EnvironmentalType;
import fr.lby.enums.EventType;
import fr.lby.events.EnvironmentalDamageEvent;

/**
 * @author jlamby
 *
 */
public class EnvironmentalDamageEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.ENVIRONMENTAL_DAMAGE;
    }

    @Override
    protected EnvironmentalDamageEvent parse(String[] strings) {
        return new EnvironmentalDamageEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                EnvironmentalType.getByValue(strings[EnvironmentalDamageEventMapping.ENVIRONMENTAL_TYPE]),
                parseInteger(strings, EnvironmentalDamageEventMapping.AMOUNT),
                parseInteger(strings, EnvironmentalDamageEventMapping.OVERKILL),
                null, // Integer.valueOf(strings[SpellDamageEventMapping.SPELL_SCHOOL]),
                parseInteger(strings, EnvironmentalDamageEventMapping.RESISTED),
                parseInteger(strings, EnvironmentalDamageEventMapping.BLOCKED),
                parseInteger(strings, EnvironmentalDamageEventMapping.ABSORBED),
                parseBoolean(strings, EnvironmentalDamageEventMapping.CRITICAL),
                parseBoolean(strings, EnvironmentalDamageEventMapping.GLANCING),
                parseBoolean(strings, EnvironmentalDamageEventMapping.CRUSHING));
    }

    protected static class EnvironmentalDamageEventMapping {
        static final int ENVIRONMENTAL_TYPE = 22;
        static final int AMOUNT             = 23;
        static final int OVERKILL           = 24;
        static final int SPELL_SCHOOL       = 25;
        static final int RESISTED           = 26;
        static final int BLOCKED            = 27;
        static final int ABSORBED           = 28;
        static final int CRITICAL           = 29;
        static final int GLANCING           = 30;
        static final int CRUSHING           = 31;
    }

}
