package fr.lby.parser.handlers.spell.aura;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraBrokenSpellEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class SpellAuraBrokenSpellEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_BROKEN_SPELL;
    }

    @Override
    protected SpellAuraBrokenSpellEvent parse(String[] strings) {
        return new SpellAuraBrokenSpellEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseSpell(strings, SpellAuraBrokenSpellMapping.EXTRA_SPELL_OFFSET),
                ParserUtils.parseAuraType(strings, SpellAuraBrokenSpellMapping.AURA_TYPE_OFFSET));
    }

    protected static class SpellAuraBrokenSpellMapping {
        static final int EXTRA_SPELL_OFFSET = 12;
        static final int AURA_TYPE_OFFSET   = 15;
    }

}
