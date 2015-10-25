package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraRemovedEvent;
import fr.lby.model.SpellInformation;

/**
 * @author jlamby
 *
 */
public class SpellAuraRemovedEventParser extends AbstractSpellAuraEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_REMOVED;
    }

    @Override
    protected SpellAuraRemovedEvent parse(String[] strings) {
        SpellInformation spell = parseSpell(strings);

        return new SpellAuraRemovedEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                spell,
                parseAuraType(strings),
                parseAmount(strings));
    }

}
