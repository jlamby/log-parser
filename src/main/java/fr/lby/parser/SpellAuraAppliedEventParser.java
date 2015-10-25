package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraAppliedEvent;
import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public class SpellAuraAppliedEventParser extends AbstractSpellAuraEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_APPLIED;
    }

    @Override
    protected SpellAuraAppliedEvent parse(String[] strings) {
        SpellInformation spell = parseSpell(strings);

        return new SpellAuraAppliedEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell,
                parseAuraType(strings));
    }

}
