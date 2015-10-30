package fr.lby.parser;

import fr.lby.enums.AuraType;
import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellDispelEvent;

/**
 * @author jlamby
 *
 */
public class SpellDispelEventParser extends AbstractExtraSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_DISPEL;
    }

    @Override
    protected SpellDispelEvent parse(String[] strings) {
        return new SpellDispelEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                parseSpell(strings),
                parseExtraSpell(strings),
                AuraType.valueOf(strings[SpellDispelMapping.AURA_TYPE]));
    }

    protected static class SpellDispelMapping {
        static final int AURA_TYPE = 15;
    }

}
