package fr.lby.model;

/**
 * @author jlamby
 *
 */
public class Spell {

    public final int         id;
    public final String      name;
    public final SpellSchool spellSchool;

    public Spell(int id, String name, SpellSchool spellSchool) {
        this.id = id;
        this.name = name;
        this.spellSchool = spellSchool;
    }

    @Override
    public String toString() {
        return "Spell [name=" + name + "]";
    }

}
