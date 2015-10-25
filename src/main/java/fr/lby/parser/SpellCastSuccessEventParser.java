package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCastSuccess;
import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public class SpellCastSuccessEventParser extends AbstractSpellEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_CAST_SUCCESS;
    }

    @Override
    protected SpellCastSuccess parse(String[] strings) {
        SpellInformation spell = parseSpell(strings);

        return new SpellCastSuccess(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell);
    }

}
