package com.chen.practice.behavioralPattern.command;

/**
 * 具体命令类
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.operation();
    }
}
