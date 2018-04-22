package ru.github.try_contract.model;

import java.util.Date;

/**
 * Stage
 */
public class Stage {
    private int stageNow;
    private String name;
    private long start;
    private long end;
    private boolean complete;
    private Penalty penalty;

    public int getStageNow() {
        return stageNow;
    }

    public void setStageNow(int stageNow) {
        this.stageNow = stageNow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Penalty getPenalty() {
        return penalty;
    }

    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }
}
