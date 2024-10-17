package com.stern.mapper;

import com.stern.pojo.Coursefunction;
import com.stern.pojo.CoursefunctionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 课程功能 -数据访问层
 */
@Component
public interface CoursefunctionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    long countByExample(CoursefunctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    int deleteByExample(CoursefunctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    int insert(Coursefunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    int insertSelective(Coursefunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    List<Coursefunction> selectByExample(CoursefunctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    Coursefunction selectByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Coursefunction record, @Param("example") CoursefunctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Coursefunction record, @Param("example") CoursefunctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Coursefunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursefunction
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Coursefunction record);
}