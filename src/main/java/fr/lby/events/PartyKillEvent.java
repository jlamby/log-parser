package fr.lby.events;

import fr.lby.enums.EventType;
import fr.lby.model.Unit;

/**
 * @author jlamby
 *
 */
public class PartyKillEvent extends CombatEvent {

    public PartyKillEvent(Unit source, Unit destination) {
        super(source, destination);
    }

    @Override
    public EventType getType() {
        return EventType.PARTY_KILL;
    }

    @Override
    public String toString() {
        return "PartyKillEvent [" + source.name + " kills " + destination.name + "]";
    }

}
