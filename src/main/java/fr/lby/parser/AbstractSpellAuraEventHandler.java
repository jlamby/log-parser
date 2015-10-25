package fr.lby.parser;

import fr.lby.enums.AuraType;

/**
 * @author jlamby
 *
 */
public abstract class AbstractSpellAuraEventHandler extends AbstractSpellEventHandler {

    AuraType parseAuraType(String[] strings) {
        return AuraType.valueOf(strings[AbstractSpellAuraEventMapping.AURA_TYPE]);
    }

    int parseAmount(String[] strings) {
        if (strings.length > AbstractSpellAuraEventMapping.AMOUNT) {
            return parseInteger(strings, AbstractSpellAuraEventMapping.AMOUNT);
        }

        return 0;
    }

    protected static class AbstractSpellAuraEventMapping {
        static final int AURA_TYPE = 12;
        static final int AMOUNT    = 13;
    }

}
