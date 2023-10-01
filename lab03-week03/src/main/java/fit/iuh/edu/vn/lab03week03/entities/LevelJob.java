package fit.iuh.edu.vn.lab03week03.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "level_job")
public class LevelJob {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    private String level;

    public LevelJob() {
    }

    public LevelJob(Skill skill, Job job, String level) {
        this.skill = skill;
        this.job = job;
        this.level = level;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "LevelJob{" +
                "skill=" + skill +
                ", job=" + job +
                ", level='" + level + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LevelJob levelJob)) return false;
        return Objects.equals(getSkill(), levelJob.getSkill()) && Objects.equals(getJob(), levelJob.getJob());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSkill(), getJob());
    }
}
