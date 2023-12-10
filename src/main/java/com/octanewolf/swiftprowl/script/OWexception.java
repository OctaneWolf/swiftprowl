/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */
package com.octanewolf.swiftprowl.script;

/**
 * INTERNAL USE
 */
public class OWexception extends Exception {

    protected String _name = "OWexception";

    public OWexception(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        String ret = _name + ": " + getMessage() + "\n";
        //for (StackTraceElement elm : getStackTrace()) {
        //    ret += "  Line " + elm.getLineNumber()
        //            + ", in file " + elm.getFileName() + "\n";
        //    return ret;
        //}
        //ret += "Line ?, in File ?";
        return ret;
    }
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

    public String toStringShort() {
        return _name + ": " + getMessage();
    }
}
