package fr.lby.parser;

import fr.lby.enums.AuraType;
import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraBrokenSpellEvent;
import fr.lby.model.SpellInformation;

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
                parseSpell(strings),
                parseExtraSpell(strings),
                parseAuraType(strings));
    }

    SpellInformation parseExtraSpell(String[] strings) {
        return new SpellInformation(
                parseInteger(strings, SpellAuraBrokenSpellMapping.ID),
                strings[SpellAuraBrokenSpellMapping.NAME],
                null);
    }

    @Override
    AuraType parseAuraType(String[] strings) {
        return AuraType.valueOf(strings[SpellAuraBrokenSpellMapping.AURA_TYPE]);
    }

    protected static class SpellAuraBrokenSpellMapping {
        static final int ID        = 12;
        static final int NAME      = 13;
        static final int SCHOOL    = 14;
        static final int AURA_TYPE = 15;
    }

}
