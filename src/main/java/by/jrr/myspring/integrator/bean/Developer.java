package by.jrr.myspring.integrator.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Developer {
    private String name;
    private String skill;
    private int level;
    private  boolean isIntensive;

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", level=" + level +
                ", isIntensive=" + isIntensive +
                '}';
    }
}
