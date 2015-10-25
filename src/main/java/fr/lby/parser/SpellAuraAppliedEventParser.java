package fr.lby.parser;

import fr.lby.enums.AuraType;
import fr.lby.enums.EventType;
import fr.lby.events.Event;
import fr.lby.events.spell.SpellAuraAppliedEvent;
import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public class SpellAuraAppliedEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_APPLIED;
    }

    @Override
    protected Event parse(String[] strings) {
        SpellInformation spell = parseSpell(strings);

        return new SpellAuraAppliedEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell,
                AuraType.valueOf(strings[SpellAuraAppliedEventMapping.AURA_TYPE]));
    }

    protected static class SpellAuraAppliedEventMapping {
        static final int AURA_TYPE = 12;
    }

}
