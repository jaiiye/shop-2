package com.mission.shop.product.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductAttrExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public ProductAttrExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andProductIdIsNull() {
			addCriterion("product_id is null");
			return (Criteria) this;
		}

		public Criteria andProductIdIsNotNull() {
			addCriterion("product_id is not null");
			return (Criteria) this;
		}

		public Criteria andProductIdEqualTo(Long value) {
			addCriterion("product_id =", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotEqualTo(Long value) {
			addCriterion("product_id <>", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThan(Long value) {
			addCriterion("product_id >", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
			addCriterion("product_id >=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThan(Long value) {
			addCriterion("product_id <", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThanOrEqualTo(Long value) {
			addCriterion("product_id <=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdIn(List<Long> values) {
			addCriterion("product_id in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotIn(List<Long> values) {
			addCriterion("product_id not in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdBetween(Long value1, Long value2) {
			addCriterion("product_id between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotBetween(Long value1, Long value2) {
			addCriterion("product_id not between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdIsNull() {
			addCriterion("attr_group_id is null");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdIsNotNull() {
			addCriterion("attr_group_id is not null");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdEqualTo(Long value) {
			addCriterion("attr_group_id =", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdNotEqualTo(Long value) {
			addCriterion("attr_group_id <>", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdGreaterThan(Long value) {
			addCriterion("attr_group_id >", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdGreaterThanOrEqualTo(Long value) {
			addCriterion("attr_group_id >=", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdLessThan(Long value) {
			addCriterion("attr_group_id <", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdLessThanOrEqualTo(Long value) {
			addCriterion("attr_group_id <=", value, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdIn(List<Long> values) {
			addCriterion("attr_group_id in", values, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdNotIn(List<Long> values) {
			addCriterion("attr_group_id not in", values, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdBetween(Long value1, Long value2) {
			addCriterion("attr_group_id between", value1, value2, "attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrGroupIdNotBetween(Long value1, Long value2) {
			addCriterion("attr_group_id not between", value1, value2,
					"attrGroupId");
			return (Criteria) this;
		}

		public Criteria andAttrNameIsNull() {
			addCriterion("attr_name is null");
			return (Criteria) this;
		}

		public Criteria andAttrNameIsNotNull() {
			addCriterion("attr_name is not null");
			return (Criteria) this;
		}

		public Criteria andAttrNameEqualTo(String value) {
			addCriterion("attr_name =", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameNotEqualTo(String value) {
			addCriterion("attr_name <>", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameGreaterThan(String value) {
			addCriterion("attr_name >", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
			addCriterion("attr_name >=", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameLessThan(String value) {
			addCriterion("attr_name <", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameLessThanOrEqualTo(String value) {
			addCriterion("attr_name <=", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameLike(String value) {
			addCriterion("attr_name like", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameNotLike(String value) {
			addCriterion("attr_name not like", value, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameIn(List<String> values) {
			addCriterion("attr_name in", values, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameNotIn(List<String> values) {
			addCriterion("attr_name not in", values, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameBetween(String value1, String value2) {
			addCriterion("attr_name between", value1, value2, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrNameNotBetween(String value1, String value2) {
			addCriterion("attr_name not between", value1, value2, "attrName");
			return (Criteria) this;
		}

		public Criteria andAttrValueIsNull() {
			addCriterion("attr_value is null");
			return (Criteria) this;
		}

		public Criteria andAttrValueIsNotNull() {
			addCriterion("attr_value is not null");
			return (Criteria) this;
		}

		public Criteria andAttrValueEqualTo(String value) {
			addCriterion("attr_value =", value, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueNotEqualTo(String value) {
			addCriterion("attr_value <>", value, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueGreaterThan(String value) {
			addCriterion("attr_value >", value, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueGreaterThanOrEqualTo(String value) {
			addCriterion("attr_value >=", value, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueLessThan(String value) {
			addCriterion("attr_value <", value, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueLessThanOrEqualTo(String value) {
			addCriterion("attr_value <=", value, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueLike(String value) {
			addCriterion("attr_value like", value, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueNotLike(String value) {
			addCriterion("attr_value not like", value, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueIn(List<String> values) {
			addCriterion("attr_value in", values, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueNotIn(List<String> values) {
			addCriterion("attr_value not in", values, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueBetween(String value1, String value2) {
			addCriterion("attr_value between", value1, value2, "attrValue");
			return (Criteria) this;
		}

		public Criteria andAttrValueNotBetween(String value1, String value2) {
			addCriterion("attr_value not between", value1, value2, "attrValue");
			return (Criteria) this;
		}

		public Criteria andSortOrderIsNull() {
			addCriterion("sort_order is null");
			return (Criteria) this;
		}

		public Criteria andSortOrderIsNotNull() {
			addCriterion("sort_order is not null");
			return (Criteria) this;
		}

		public Criteria andSortOrderEqualTo(Integer value) {
			addCriterion("sort_order =", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderNotEqualTo(Integer value) {
			addCriterion("sort_order <>", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderGreaterThan(Integer value) {
			addCriterion("sort_order >", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("sort_order >=", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderLessThan(Integer value) {
			addCriterion("sort_order <", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
			addCriterion("sort_order <=", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderIn(List<Integer> values) {
			addCriterion("sort_order in", values, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderNotIn(List<Integer> values) {
			addCriterion("sort_order not in", values, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderBetween(Integer value1, Integer value2) {
			addCriterion("sort_order between", value1, value2, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("sort_order not between", value1, value2, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andAttrTypeIsNull() {
			addCriterion("attr_type is null");
			return (Criteria) this;
		}

		public Criteria andAttrTypeIsNotNull() {
			addCriterion("attr_type is not null");
			return (Criteria) this;
		}

		public Criteria andAttrTypeEqualTo(Integer value) {
			addCriterion("attr_type =", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeNotEqualTo(Integer value) {
			addCriterion("attr_type <>", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeGreaterThan(Integer value) {
			addCriterion("attr_type >", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("attr_type >=", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeLessThan(Integer value) {
			addCriterion("attr_type <", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeLessThanOrEqualTo(Integer value) {
			addCriterion("attr_type <=", value, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeIn(List<Integer> values) {
			addCriterion("attr_type in", values, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeNotIn(List<Integer> values) {
			addCriterion("attr_type not in", values, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeBetween(Integer value1, Integer value2) {
			addCriterion("attr_type between", value1, value2, "attrType");
			return (Criteria) this;
		}

		public Criteria andAttrTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("attr_type not between", value1, value2, "attrType");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table product_attr
	 * @mbggenerated  Thu Jul 10 21:41:41 CST 2014
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_attr
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 12 11:22:43 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}