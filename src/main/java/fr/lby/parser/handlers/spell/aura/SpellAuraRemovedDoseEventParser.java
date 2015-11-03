package fr.lby.parser.handlers.spell.aura;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraRemovedDoseEvent;
import fr.lby.parser.AbstractHandler;
import fr.lby.parser.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellAuraRemovedDoseEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_REMOVED_DOSE;
    }

    @Override
    protected SpellAuraRemovedDoseEvent parse(String[] strings) {
        return new SpellAuraRemovedDoseEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseAuraType(strings),
                ParserUtils.parseAuraAmount(strings));
    }

}
