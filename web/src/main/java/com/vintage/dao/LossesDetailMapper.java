package com.vintage.dao;

import com.vintage.entity.LossesDetail;
import com.vintage.entity.LossesDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LossesDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    int countByExample(LossesDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    int deleteByExample(LossesDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String lossesDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    int insert(LossesDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    int insertSelective(LossesDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    List<LossesDetail> selectByExample(LossesDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    LossesDetail selectByPrimaryKey(String lossesDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LossesDetail record, @Param("example") LossesDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LossesDetail record, @Param("example") LossesDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LossesDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table losses_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LossesDetail record);
}