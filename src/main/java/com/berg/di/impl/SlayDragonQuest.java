package com.berg.di.impl;

import com.berg.di.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component("quest")
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    @Autowired
    public SlayDragonQuest(PrintStream stream){

        this.stream = stream;
    }

    @Override
    public void embark() {

        stream.println("Beautiful girl");
    }
}
