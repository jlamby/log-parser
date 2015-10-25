package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellDamageEvent;
import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public class SpellDamageEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_DAMAGE;
    }

    @Override
    protected SpellDamageEvent parse(String[] strings) {
        SpellInformation spell = parseSpell(strings);

        return new SpellDamageEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell,
                parseInteger(strings, SpellDamageEventMapping.AMOUNT),
                parseInteger(strings, SpellDamageEventMapping.OVERKILL),
                null, // Integer.valueOf(strings[SpellDamageEventMapping.SPELL_SCHOOL]),
                parseInteger(strings, SpellDamageEventMapping.RESISTED),
                parseInteger(strings, SpellDamageEventMapping.BLOCKED),
                parseInteger(strings, SpellDamageEventMapping.ABSORBED),
                parseBoolean(strings, SpellDamageEventMapping.CRITICAL),
                parseBoolean(strings, SpellDamageEventMapping.GLANCING),
                parseBoolean(strings, SpellDamageEventMapping.CRUSHING));
    }

    protected static class SpellDamageEventMapping {
        static final int AMOUNT       = 25;
        static final int OVERKILL     = 26;
        static final int SPELL_SCHOOL = 27;
        static final int RESISTED     = 28;
        static final int BLOCKED      = 29;
        static final int ABSORBED     = 30;
        static final int CRITICAL     = 31;
        static final int GLANCING     = 32;
        static final int CRUSHING     = 33;
    }

}
