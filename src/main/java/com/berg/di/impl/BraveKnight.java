package com.berg.di.impl;

import com.berg.di.Knight;
import com.berg.di.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("knight")
public class BraveKnight implements Knight {

    private Quest quest;

    @Autowired
    public BraveKnight(Quest quest){

        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {

        quest.embark();
    }
}
