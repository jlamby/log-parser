package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraAppliedDoseEvent;
import fr.lby.model.SpellInformation;

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
        SpellInformation spell = parseSpell(strings);

        return new SpellAuraAppliedDoseEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell,
                parseAuraType(strings),
                parseAmount(strings));
    }

}
