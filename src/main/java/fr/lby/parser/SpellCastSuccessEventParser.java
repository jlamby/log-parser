package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellCastSuccessEvent;
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
    protected SpellCastSuccessEvent parse(String[] strings) {
        SpellInformation spell = parseSpell(strings);

        return new SpellCastSuccessEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell);
    }

}
