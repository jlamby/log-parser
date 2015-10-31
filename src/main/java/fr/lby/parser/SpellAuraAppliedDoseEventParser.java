package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraAppliedDoseEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellAuraAppliedDoseEventParser extends AbstractHandler {

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
