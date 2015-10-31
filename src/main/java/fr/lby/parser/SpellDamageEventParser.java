package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellDamageEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellDamageEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_DAMAGE;
    }

    @Override
    protected SpellDamageEvent parse(String[] strings) {
        return new SpellDamageEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseDamage(strings, DAMAGE_FIELDS_OFFSET));
    }

    private static final int DAMAGE_FIELDS_OFFSET = 25;

}
