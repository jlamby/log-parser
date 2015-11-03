package fr.lby.parser.handlers.spell.aura;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraBrokenEvent;
import fr.lby.parser.ParserUtils;
import fr.lby.parser.handlers.AbstractHandler;

/**
 * @author jlamby
 *
 */
public class SpellAuraBrokenEventHandler extends AbstractHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_BROKEN;
    }

    @Override
    protected SpellAuraBrokenEvent parse(String[] strings) {
        return new SpellAuraBrokenEvent(
                ParserUtils.parseSourceUnit(strings),
                ParserUtils.parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                ParserUtils.parseAuraType(strings));
    }

}
