package fit.iuh.edu.vn.lab03week03.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "level_can")
public class LevelCan {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    private String level;

    public LevelCan() {
    }

    public LevelCan(Skill skill, Candidate candidate, String level) {
        this.skill = skill;
        this.candidate = candidate;
        this.level = level;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LevelCan levelCan)) return false;
        return Objects.equals(getSkill(), levelCan.getSkill()) && Objects.equals(getCandidate(), levelCan.getCandidate()) && Objects.equals(getLevel(), levelCan.getLevel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSkill(), getCandidate(), getLevel());
    }

    @Override
    public String toString() {
        return "LevelCan{" +
                "skill=" + skill +
                ", candidate=" + candidate +
                ", level='" + level + '\'' +
                '}';
    }
}
