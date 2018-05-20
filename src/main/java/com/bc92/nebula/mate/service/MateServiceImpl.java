package com.bc92.nebula.mate.service;

import com.bc92.nebula.mate.dao.MateMapper;
import com.bc92.nebula.mate.entity.MatePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by leehotin
 * Date: 2018/5/19  上午8:07
 * To change this template use File | Settings | FileTemplates
 */
public class MateServiceImpl {

    @Autowired
    private MateMapper mateMapper;

    public Integer save(MatePo matePo) {
        mateMapper.insert(matePo);
        return matePo.getId();
    }

    public Integer update(MatePo matePo) {
        return mateMapper.update(matePo);
    }

    public Integer delete(int id) {
        return mateMapper.delete(id);
    }

    public MatePo selectById(int id) {
        return mateMapper.selectById(id);
    }

    public List<MatePo> selectAll() {
        return mateMapper.selectAll();
    }

    @Transactional  // 需要事务的时候加上
    public Boolean transaction() {
        return true;
    }
}
