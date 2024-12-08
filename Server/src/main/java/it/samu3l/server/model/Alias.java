package it.samu3l.server.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alias")
public class Alias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String alias;

    @Column(nullable = false)
    private String destination;

    public Alias() {
    }

    public Alias(String alias, String destination) {
        this.alias = alias;
        this.destination = destination;
    }

    public Alias(Long id, String alias, String destination) {
        this.id = id;
        this.alias = alias;
        this.destination = destination;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}