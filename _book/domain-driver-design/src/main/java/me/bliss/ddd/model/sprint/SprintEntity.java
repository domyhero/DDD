package me.bliss.ddd.model.sprint;

import lombok.Getter;
import org.apache.commons.lang.StringUtils;

/**
 *
 *
 * @author lanjue
 * @version $Id: me.bliss.ddd.model.sprint, v 0.1 4/8/16
 *          Exp $
 */
public class SprintEntity {

    @Getter
    private SprintId sprintId;

    @Getter
    private String name;

    public SprintEntity(SprintId sprintId, String name) {
        this.setSprintId(sprintId);
        this.setName(name);
    }

    public void createSprint(){

    }

    public void setSprintId(SprintId sprintId) {
        if (sprintId == null) {
            throw new IllegalArgumentException("sprintId isn't allowed null");
        }
        this.sprintId = sprintId;
    }

    public void setName(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name isn't allowed blank");
        }
        this.name = name;
    }
}