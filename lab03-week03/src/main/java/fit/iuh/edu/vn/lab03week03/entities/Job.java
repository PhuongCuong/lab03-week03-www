package fit.iuh.edu.vn.lab03week03.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "job")
public class Job {
    @Id
    @Column(name = "job_id")
    private long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "job")
    private List<LevelJob> levelJobs;

    public Job(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Job() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
