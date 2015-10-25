package fr.lby.parser;

import org.apache.commons.lang3.BooleanUtils;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellDamageEvent;
import fr.lby.model.Spell;

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
        Spell spell = parseSpell(strings);

        return new SpellDamageEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell,
                Integer.valueOf(strings[SpellDamageEventMapping.AMOUNT]),
                Integer.valueOf(strings[SpellDamageEventMapping.OVERKILL]),
                null, // Integer.valueOf(strings[SpellDamageEventMapping.SPELL_SCHOOL]),
                BooleanUtils.toBoolean(strings[SpellDamageEventMapping.RESISTED], "1", "0"),
                BooleanUtils.toBoolean(strings[SpellDamageEventMapping.BLOCKED], "1", "0"),
                BooleanUtils.toBoolean(strings[SpellDamageEventMapping.ABSORBED], "1", "0"),
                BooleanUtils.toBoolean(strings[SpellDamageEventMapping.CRITICAL], "1", "nil"),
                BooleanUtils.toBoolean(strings[SpellDamageEventMapping.GLANCING], "1", "nil"),
                BooleanUtils.toBoolean(strings[SpellDamageEventMapping.CRUSHING], "1", "nil"));
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
