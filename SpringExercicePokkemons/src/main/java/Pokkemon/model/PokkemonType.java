package Pokkemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PokemonType")
public class PokkemonType {
    @Column(name="TypeName")
    private String typeName;

    @Column(name="Beschrijving")
    private String beschrijving;

    @Column(name="baseAttack")
    private int BaseAttack;

    @Column(name="baseDefense")
    private int BaseDefense;

    @Column(name="baseHitPoints")
    private int BaseHitPoints;

    public String getTypeName() {
        return typeName;
    }

    public PokkemonType setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public PokkemonType setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
        return this;
    }

    public int getBaseAttack() {
        return BaseAttack;
    }

    public PokkemonType setBaseAttack(int baseAttack) {
        BaseAttack = baseAttack;
        return this;
    }

    public int getBaseDefense() {
        return BaseDefense;
    }

    public PokkemonType setBaseDefense(int baseDefense) {
        BaseDefense = baseDefense;
        return this;
    }

    public int getBaseHitPoints() {
        return BaseHitPoints;
    }

    public PokkemonType setBaseHitPoints(int baseHitPoints) {
        BaseHitPoints = baseHitPoints;
        return this;
    }
}
