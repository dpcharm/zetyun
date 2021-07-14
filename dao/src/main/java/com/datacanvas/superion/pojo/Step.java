package com.datacanvas.superion.pojo;

import com.datacanvas.superion.common.TestType;
import lombok.Data;

@Data
public class Step {

    protected String name;
    protected TestType type;
    protected String version;
    protected String description;
//    protected RequestService requestService;
    protected String requestUrl;
//    protected HttpRequestMethod requestMethod;
    protected String data;
    protected String input;
    protected String output;
    protected String responseVerification;
    protected String uploadFileDir;

}
