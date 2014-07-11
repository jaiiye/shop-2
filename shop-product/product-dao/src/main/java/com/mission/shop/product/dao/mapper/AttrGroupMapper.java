package com.mission.shop.product.dao.mapper;

import com.mission.shop.product.dao.model.AttrGroup;
import com.mission.shop.product.dao.model.AttrGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttrGroupMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	int countByExample(AttrGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	int deleteByExample(AttrGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	int deleteByPrimaryKey(Long attrGroupId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	int insert(AttrGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	int insertSelective(AttrGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	List<AttrGroup> selectByExample(AttrGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	AttrGroup selectByPrimaryKey(Long attrGroupId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	int updateByExampleSelective(@Param("record") AttrGroup record,
			@Param("example") AttrGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	int updateByExample(@Param("record") AttrGroup record,
			@Param("example") AttrGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	int updateByPrimaryKeySelective(AttrGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table attr_group
	 * @mbggenerated  Thu Jul 10 21:43:30 CST 2014
	 */
	int updateByPrimaryKey(AttrGroup record);
}