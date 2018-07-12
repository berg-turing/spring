package com.berg.spittr.data.impl;

import com.berg.spittr.data.SpittleRespository;
import com.berg.spittr.domain.Spittle;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Component
public class SpittleRespositoryImpl implements SpittleRespository {

    @Override
    public List<Spittle> findSpittles(Long max, Integer count) {

        return createData(count);
    }

    /**
     * 生成数据
     * @param count     数据个数
     * @return          生成的数据
     */
    private List<Spittle> createData(Integer count){

        List<Spittle> spittleList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            spittleList.add(new Spittle("spittle " + i, new Date()));
        }

        return spittleList;
    }
}
