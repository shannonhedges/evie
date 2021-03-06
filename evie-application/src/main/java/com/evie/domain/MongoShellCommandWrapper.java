package com.evie.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import sun.misc.BASE64Decoder;

import java.util.Base64;

/**
 * Created by rmhedge on 7/28/17.
 */
public class MongoShellCommandWrapper {

    private String databaseName;

    private String command;

    public MongoShellCommandWrapper() {
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
