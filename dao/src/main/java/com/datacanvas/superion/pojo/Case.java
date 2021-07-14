package com.datacanvas.superion.pojo;

import com.datacanvas.superion.common.TestType;
import lombok.Data;

@Data
public class Case {

    protected String name;
    protected TestType type;
    protected String version;
    protected String description;
    protected String author;
    protected int priority;
    protected String presetData;

}
