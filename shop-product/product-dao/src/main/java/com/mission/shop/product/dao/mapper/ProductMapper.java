package com.mission.shop.product.dao.mapper;

import com.mission.shop.product.dao.model.Product;
import com.mission.shop.product.dao.model.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	int countByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	int deleteByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	int deleteByPrimaryKey(Long productId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	int insert(Product record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	int insertSelective(Product record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	List<Product> selectByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	Product selectByPrimaryKey(Long productId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Product record,
			@Param("example") ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	int updateByExample(@Param("record") Product record,
			@Param("example") ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	int updateByPrimaryKeySelective(Product record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Sat Jul 12 23:07:03 CST 2014
	 */
	int updateByPrimaryKey(Product record);
}