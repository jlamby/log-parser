package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAbsorbedEvent;
import fr.lby.model.Unit;
import fr.lby.parser.models.ParserUtils;

/**
 * @author jlamby
 *
 */
public class SpellAbsorbedEventParser extends AbstractCombatEventHandler {

    @Override
    protected EventType getEventType() {
        return EventType.SPELL_ABSORBED;
    }

    @Override
    protected SpellAbsorbedEvent parse(String[] strings) {
        if (strings.length > 17) {
            return new SpellAbsorbedEvent(
                    parseSourceUnit(strings),
                    parseDestinationUnit(strings),
                    ParserUtils.parseSpell(strings),
                    parseExtraUnit(strings),
                    ParserUtils.parseSpell(strings, SpellAbsorbedEventMapping.EXTRA_SPELL_OFFSET),
                    parseInteger(strings, SpellAbsorbedEventMapping.AMOUNT));
        }
        return null;
    }

    Unit parseExtraUnit(String[] strings) {
        return new Unit(
                strings[SpellAbsorbedEventMapping.EXTRA_UNIT_GUID],
                strings[SpellAbsorbedEventMapping.EXTRA_UNIT_NAME],
                strings[SpellAbsorbedEventMapping.EXTRA_UNIT_FLAGS],
                strings[SpellAbsorbedEventMapping.EXTRA_UNIT_FLAGS_2]);
    }

    protected static class SpellAbsorbedEventMapping {
        static final int EXTRA_UNIT_GUID    = 12;
        static final int EXTRA_UNIT_NAME    = 13;
        static final int EXTRA_UNIT_FLAGS   = 14;
        static final int EXTRA_UNIT_FLAGS_2 = 15;
        static final int EXTRA_SPELL_OFFSET = 16;
        static final int AMOUNT             = 19;
    }
}
