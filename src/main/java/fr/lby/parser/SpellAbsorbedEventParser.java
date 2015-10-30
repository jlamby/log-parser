package fr.lby.parser;

import fr.lby.enums.EventType;
import fr.lby.events.spell.SpellAbsorbedEvent;
import fr.lby.model.SpellInformation;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public class SpellAbsorbedEventParser extends AbstractSpellEventHandler {

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
                    parseSpell(strings),
                    parseExtraUnit(strings),
                    parseExtraSpell(strings),
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

    SpellInformation parseExtraSpell(String[] strings) {
        return new SpellInformation(
                parseInteger(strings, SpellAbsorbedEventMapping.EXTRA_SPELL_ID),
                strings[SpellAbsorbedEventMapping.EXTRA_SPELL_NAME],
                null);
    }

    protected static class SpellAbsorbedEventMapping {
        static final int EXTRA_UNIT_GUID    = 12;
        static final int EXTRA_UNIT_NAME    = 13;
        static final int EXTRA_UNIT_FLAGS   = 14;
        static final int EXTRA_UNIT_FLAGS_2 = 15;
        static final int EXTRA_SPELL_ID     = 16;
        static final int EXTRA_SPELL_NAME   = 17;
        static final int EXTRA_SPELL_SCHOOL = 18;
        static final int AMOUNT             = 19;
    }
}
