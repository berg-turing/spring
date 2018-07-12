package com.berg.spittr.data;

import com.berg.spittr.domain.Spittle;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 */
public interface SpittleRespository {

    /**
     *
     * @param max
     * @param count
     * @return
     */
    List<Spittle> findSpittles(Long max, Integer count);
}
