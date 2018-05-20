package com.bc92.nebula.mate.dao;

import com.bc92.nebula.mate.entity.MatePo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by leehotin
 * Date: 2018/5/19  上午8:04
 * To change this template use File | Settings | FileTemplates
 */
@Mapper
public interface MateMapper {

    /**
     * 添加操作，返回新增元素的 ID
     *
     * @param matePo
     */
    @Insert("insert into person(name,phone) values(#{name},#{phone})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insert(MatePo matePo);

    /**
     * 更新操作
     *
     * @param matePo
     * @return 受影响的行数
     */
    @Update("update person set name=#{name},age=#{age} where id=#{id}")
    Integer update(MatePo matePo);

    /**
     * 删除操作
     *
     * @param id
     * @return 受影响的行数
     */
    @Delete("delete from person where id=#{id}")
    Integer delete(@Param("id") int id);

    /**
     * 查询所有
     *
     * @return
     */
    @Select("select id,name,age from person")
    List<MatePo> selectAll();

    /**
     * 根据主键查询单个
     *
     * @param id
     * @return
     */
    @Select("select id,name,age from person where id=#{id}")
    MatePo selectById(@Param("id") int id);
}
