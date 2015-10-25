package fr.lby.parser;

import org.apache.commons.lang3.BooleanUtils;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellPeriodicDamageEvent;
import fr.lby.model.SpellInformation;
import fr.lby.parser.SpellDamageEventParser.SpellDamageEventMapping;

/**
 * @author jlamby
 *
 */
public class SpellPeriodicDamageEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_PERIODIC_DAMAGE;
    }

    @Override
    protected SpellPeriodicDamageEvent parse(String[] strings) {
        SpellInformation spell = parseSpell(strings);

        return new SpellPeriodicDamageEvent(
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

}
