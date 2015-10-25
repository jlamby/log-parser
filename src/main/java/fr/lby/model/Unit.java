package fr.lby.model;

/**
 * @author jlamby
 *
 */
public class Unit {

    public final String guid;
    public final String name;
    public final String flags;
    public final String flags2;

    public Unit(String guid, String name, String flags, String flags2) {
        this.guid = guid;
        this.name = name;
        this.flags = flags;
        this.flags2 = flags2;
    }

    @Override
    public String toString() {
        return "Unit [name=" + name + "]";
    }

}
