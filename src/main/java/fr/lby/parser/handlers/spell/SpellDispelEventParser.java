package fr.lby.parser.handlers.spell;

import fr.lby.enums.AuraType;
import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellDispelEvent;
import fr.lby.parser.AbstractHandler;
import fr.lby.parser.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellDispelEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_DISPEL;
    }

    @Override
    protected SpellDispelEvent parse(String[] strings) {
        return new SpellDispelEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseSpell(strings, SpellDispelMapping.EXTRA_SPELL_OFFSET),
                AuraType.valueOf(strings[SpellDispelMapping.AURA_TYPE]));
    }

    protected static class SpellDispelMapping {
        static final int EXTRA_SPELL_OFFSET = 12;
        static final int AURA_TYPE          = 15;
    }

}
