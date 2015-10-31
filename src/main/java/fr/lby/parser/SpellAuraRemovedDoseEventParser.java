package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraRemovedDoseEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellAuraRemovedDoseEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_REMOVED_DOSE;
    }

    @Override
    protected SpellAuraRemovedDoseEvent parse(String[] strings) {
        return new SpellAuraRemovedDoseEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseAuraType(strings),
                ParserUtils.parseAmount(strings));
    }

}
