package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraRemovedEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellAuraRemovedEventParser extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_REMOVED;
    }

    @Override
    protected SpellAuraRemovedEvent parse(String[] strings) {
        return new SpellAuraRemovedEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseAuraType(strings),
                ParserUtils.parseAuraAmount(strings));
    }

}
