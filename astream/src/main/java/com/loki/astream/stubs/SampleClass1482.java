package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1482 {

    @Ignore    private SampleClass1483 sampleClass;

    public SampleClass1482(){
        sampleClass = new SampleClass1483();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}