package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAuraRefreshEvent;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellAuraRefreshEventParser extends AbstractSpellAuraEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_AURA_REFRESH;
    }

    @Override
    protected SpellAuraRefreshEvent parse(String[] strings) {
        return new SpellAuraRefreshEvent(
                parseSourceUnit(strings),
                parseDestinationUnit(strings),
                ParserUtils.parseSpell(strings),
                parseAuraType(strings),
                parseAmount(strings));
    }

}
