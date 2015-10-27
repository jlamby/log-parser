package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraAppliedDoseEvent;

/**
 * @author jlamby
 *
 */
public class SpellAuraAppliedDoseEventParser extends AbstractSpellAuraEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_APPLIED_DOSE;
    }

    @Override
    protected SpellAuraAppliedDoseEvent parse(String[] strings) {
        return new SpellAuraAppliedDoseEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings),
                parseAuraType(strings),
                parseAmount(strings));
    }

}
