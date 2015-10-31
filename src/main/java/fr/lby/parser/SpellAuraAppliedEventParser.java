package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraAppliedEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellAuraAppliedEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_APPLIED;
    }

    @Override
    protected SpellAuraAppliedEvent parse(String[] strings) {
        return new SpellAuraAppliedEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseAuraType(strings));
    }

}
