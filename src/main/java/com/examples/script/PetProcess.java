package com.examples.script;

import org.kie.api.runtime.process.ProcessContext;

public class PetProcess {
    public static void restExit(ProcessContext kcontext) {
        System.out.println("restExit >>>>>>>>>>>>>>> "+kcontext.getVariable("pet"));
    }

    public static void dump(ProcessContext kcontext) {
        System.out.println(">>>>>>> " +kcontext.getNodeInstance().getNodeName() + " >>>>>>>> "+kcontext.getVariable("pet"));
    }
}