package fr.lby.parser.handlers.spell.aura;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraAppliedDoseEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class SpellAuraAppliedDoseEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_APPLIED_DOSE;
    }

    @Override
    protected SpellAuraAppliedDoseEvent parse(String[] strings) {
        return new SpellAuraAppliedDoseEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseAuraType(strings),
                ParserUtils.parseAuraAmount(strings));
    }

}
