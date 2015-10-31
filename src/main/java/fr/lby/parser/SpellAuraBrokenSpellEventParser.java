package fr.lby.parser;

import fr.lby.enums.AuraType;
import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraBrokenSpellEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellAuraBrokenSpellEventParser extends AbstractSpellAuraEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_BROKEN_SPELL;
    }

    @Override
    protected SpellAuraBrokenSpellEvent parse(String[] strings) {
        return new SpellAuraBrokenSpellEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseSpell(strings, SpellAuraBrokenSpellMapping.EXTRA_SPELL_OFFSET),
                parseAuraType(strings));
    }

    @Override
    AuraType parseAuraType(String[] strings) {
        return AuraType.valueOf(strings[SpellAuraBrokenSpellMapping.AURA_TYPE]);
    }

    protected static class SpellAuraBrokenSpellMapping {
        static final int EXTRA_SPELL_OFFSET = 12;
        static final int AURA_TYPE          = 15;
    }

}
