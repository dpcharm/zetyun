package com.datacanvas.superion.pojo;

import com.datacanvas.superion.common.TestType;
import lombok.Data;

@Data
public class Plan {

    protected String name;
    protected TestType type;
    protected String version;
    protected String description;
    protected int order;
    protected int podCount;
    protected double cpu;
    protected double mem;
    protected int priority;
    protected String status;
    protected String mailRecipient;

}
