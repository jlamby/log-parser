package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraRemovedDoseEvent;

/**
 * @author jlamby
 *
 */
public class SpellAuraRemovedDoseEventParser extends AbstractSpellAuraEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_REMOVED_DOSE;
    }

    @Override
    protected SpellAuraRemovedDoseEvent parse(String[] strings) {
        return new SpellAuraRemovedDoseEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings),
                parseAuraType(strings),
                parseAmount(strings));
    }

}
