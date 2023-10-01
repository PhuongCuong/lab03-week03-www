package fit.iuh.edu.vn.lab03week03.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;
    private String name;
    @Column(name = "note")
    private String node;

    @OneToMany(mappedBy = "skill")
    private List<LevelCan> levelCans;
    @OneToMany(mappedBy = "skill")
    private List<LevelJob> levelJobs;

    public Skill() {
    }

    public Skill(long id, String name, String node) {
        this.id = id;
        this.name = name;
        this.node = node;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", node='" + node + '\'' +
                '}';
    }
}
