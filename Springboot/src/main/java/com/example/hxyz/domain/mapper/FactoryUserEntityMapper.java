package com.example.hxyz.domain.mapper;

import com.example.hxyz.assess.persistant.repository.MyBatisRepository;
import com.example.hxyz.domain.entity.FactoryUserEntity;
import com.example.hxyz.domain.entity.FactoryUserEntityExample;

import java.io.Serializable;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
@MyBatisRepository
public interface FactoryUserEntityMapper extends Serializable {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    int countByExample(FactoryUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    int deleteByExample(FactoryUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    @Delete({
        "delete from t_factory_user",
        "where f_id = #{f_id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer f_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    @Insert({
        "insert into t_factory_user (f_id, f_factory_id, ",
        "f_factory_name, f_username, ",
        "f_mobile, f_device_code, ",
        "f_password, f_photo, ",
        "f_realname, f_title, ",
        "f_role, f_status, f_factory_type, ",
        "f_charge_factorys, f_check_step, ",
        "f_joined_date, f_work_begin_date, ",
        "f_work_end_date, f_break_address, ",
        "f_break_fee, f_card_no, ",
        "f_citizen_id_no, f_citizen_id_img1, ",
        "f_citizen_id_img2, f_creator_id, ",
        "f_create_time, f_recruitment_person, ",
        "f_recruitment_path)",
        "values (#{f_id,jdbcType=INTEGER}, #{f_factory_id,jdbcType=INTEGER}, ",
        "#{f_factory_name,jdbcType=VARCHAR}, #{f_username,jdbcType=VARCHAR}, ",
        "#{f_mobile,jdbcType=VARCHAR}, #{f_device_code,jdbcType=VARCHAR}, ",
        "#{f_password,jdbcType=VARCHAR}, #{f_photo,jdbcType=VARCHAR}, ",
        "#{f_realname,jdbcType=VARCHAR}, #{f_title,jdbcType=VARCHAR}, ",
        "#{f_role,jdbcType=CHAR}, #{f_status,jdbcType=INTEGER}, #{f_factory_type,jdbcType=VARCHAR}, ",
        "#{f_charge_factorys,jdbcType=VARCHAR}, #{f_check_step,jdbcType=VARCHAR}, ",
        "#{f_joined_date,jdbcType=TIMESTAMP}, #{f_work_begin_date,jdbcType=TIMESTAMP}, ",
        "#{f_work_end_date,jdbcType=TIMESTAMP}, #{f_break_address,jdbcType=VARCHAR}, ",
        "#{f_break_fee,jdbcType=DOUBLE}, #{f_card_no,jdbcType=VARCHAR}, ",
        "#{f_citizen_id_no,jdbcType=VARCHAR}, #{f_citizen_id_img1,jdbcType=VARCHAR}, ",
        "#{f_citizen_id_img2,jdbcType=VARCHAR}, #{f_creator_id,jdbcType=INTEGER}, ",
        "#{f_create_time,jdbcType=TIMESTAMP}, #{f_recruitment_person,jdbcType=VARCHAR}, ",
        "#{f_recruitment_path,jdbcType=VARCHAR})"
    })
    int insert(FactoryUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    int insertSelective(FactoryUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    List<FactoryUserEntity> selectByExample(FactoryUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    @Select({
        "select",
        "f_id, f_factory_id, f_factory_name, f_username, f_mobile, f_device_code, f_password, ",
        "f_photo, f_realname, f_title, f_role, f_status, f_factory_type, f_charge_factorys, ",
        "f_check_step, f_joined_date, f_work_begin_date, f_work_end_date, f_break_address, ",
        "f_break_fee, f_card_no, f_citizen_id_no, f_citizen_id_img1, f_citizen_id_img2, ",
        "f_creator_id, f_create_time, f_recruitment_person, f_recruitment_path",
        "from t_factory_user",
        "where f_id = #{f_id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    FactoryUserEntity selectByPrimaryKey(Integer f_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    int updateByExampleSelective(@Param("record") FactoryUserEntity record, @Param("example") FactoryUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    int updateByExample(@Param("record") FactoryUserEntity record, @Param("example") FactoryUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    int updateByPrimaryKeySelective(FactoryUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_factory_user
     *
     * @mbggenerated Wed Mar 29 14:33:03 CST 2017
     */
    @Update({
        "update t_factory_user",
        "set f_factory_id = #{f_factory_id,jdbcType=INTEGER},",
          "f_factory_name = #{f_factory_name,jdbcType=VARCHAR},",
          "f_username = #{f_username,jdbcType=VARCHAR},",
          "f_mobile = #{f_mobile,jdbcType=VARCHAR},",
          "f_device_code = #{f_device_code,jdbcType=VARCHAR},",
          "f_password = #{f_password,jdbcType=VARCHAR},",
          "f_photo = #{f_photo,jdbcType=VARCHAR},",
          "f_realname = #{f_realname,jdbcType=VARCHAR},",
          "f_title = #{f_title,jdbcType=VARCHAR},",
          "f_role = #{f_role,jdbcType=CHAR},",
          "f_status = #{f_status,jdbcType=INTEGER},",
          "f_factory_type = #{f_factory_type,jdbcType=VARCHAR},",
          "f_charge_factorys = #{f_charge_factorys,jdbcType=VARCHAR},",
          "f_check_step = #{f_check_step,jdbcType=VARCHAR},",
          "f_joined_date = #{f_joined_date,jdbcType=TIMESTAMP},",
          "f_work_begin_date = #{f_work_begin_date,jdbcType=TIMESTAMP},",
          "f_work_end_date = #{f_work_end_date,jdbcType=TIMESTAMP},",
          "f_break_address = #{f_break_address,jdbcType=VARCHAR},",
          "f_break_fee = #{f_break_fee,jdbcType=DOUBLE},",
          "f_card_no = #{f_card_no,jdbcType=VARCHAR},",
          "f_citizen_id_no = #{f_citizen_id_no,jdbcType=VARCHAR},",
          "f_citizen_id_img1 = #{f_citizen_id_img1,jdbcType=VARCHAR},",
          "f_citizen_id_img2 = #{f_citizen_id_img2,jdbcType=VARCHAR},",
          "f_creator_id = #{f_creator_id,jdbcType=INTEGER},",
          "f_create_time = #{f_create_time,jdbcType=TIMESTAMP},",
          "f_recruitment_person = #{f_recruitment_person,jdbcType=VARCHAR},",
          "f_recruitment_path = #{f_recruitment_path,jdbcType=VARCHAR}",
        "where f_id = #{f_id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FactoryUserEntity record);
}