package com.examples.listener;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;

public class LogListener implements ProcessEventListener {

    @Override
    public void beforeProcessStarted(ProcessStartedEvent event) {
        System.out.println(event);        
    }

    @Override
    public void afterProcessStarted(ProcessStartedEvent event) {
    }

    @Override
    public void beforeProcessCompleted(ProcessCompletedEvent event) {
    }

    @Override
    public void afterProcessCompleted(ProcessCompletedEvent event) {
    }

    @Override
    public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
        System.out.println(event);
    }

    @Override
    public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
    }

    @Override
    public void beforeNodeLeft(ProcessNodeLeftEvent event) {
    }

    @Override
    public void afterNodeLeft(ProcessNodeLeftEvent event) {
    }

    @Override
    public void beforeVariableChanged(ProcessVariableChangedEvent event) {
    }

    @Override
    public void afterVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println(event);
    }   
}