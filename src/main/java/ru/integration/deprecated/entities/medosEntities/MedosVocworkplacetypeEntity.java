package ru.integration.deprecated.entities.medosEntities;

import javax.persistence.*;


@Entity
@Table(name = "vocworkplacetype", schema = "sqluser", catalog = "riams")
public class MedosVocworkplacetypeEntity {
    private Long id;
    private String promedcode;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "promedcode")
    public String getPromedcode() {
        return promedcode;
    }
    public void setPromedcode(String promedcode) {
        this.promedcode = promedcode;
    }

}