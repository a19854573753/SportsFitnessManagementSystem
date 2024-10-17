package com.stern.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reply
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reply
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reply
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    public ReplyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table reply
     *
     * @mbg.generated
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRcontentIsNull() {
            addCriterion("rcontent is null");
            return (Criteria) this;
        }

        public Criteria andRcontentIsNotNull() {
            addCriterion("rcontent is not null");
            return (Criteria) this;
        }

        public Criteria andRcontentEqualTo(String value) {
            addCriterion("rcontent =", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotEqualTo(String value) {
            addCriterion("rcontent <>", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentGreaterThan(String value) {
            addCriterion("rcontent >", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentGreaterThanOrEqualTo(String value) {
            addCriterion("rcontent >=", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLessThan(String value) {
            addCriterion("rcontent <", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLessThanOrEqualTo(String value) {
            addCriterion("rcontent <=", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLike(String value) {
            addCriterion("rcontent like", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotLike(String value) {
            addCriterion("rcontent not like", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentIn(List<String> values) {
            addCriterion("rcontent in", values, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotIn(List<String> values) {
            addCriterion("rcontent not in", values, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentBetween(String value1, String value2) {
            addCriterion("rcontent between", value1, value2, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotBetween(String value1, String value2) {
            addCriterion("rcontent not between", value1, value2, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRdateIsNull() {
            addCriterion("rdate is null");
            return (Criteria) this;
        }

        public Criteria andRdateIsNotNull() {
            addCriterion("rdate is not null");
            return (Criteria) this;
        }

        public Criteria andRdateEqualTo(Date value) {
            addCriterion("rdate =", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotEqualTo(Date value) {
            addCriterion("rdate <>", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThan(Date value) {
            addCriterion("rdate >", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThanOrEqualTo(Date value) {
            addCriterion("rdate >=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThan(Date value) {
            addCriterion("rdate <", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThanOrEqualTo(Date value) {
            addCriterion("rdate <=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateIn(List<Date> values) {
            addCriterion("rdate in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotIn(List<Date> values) {
            addCriterion("rdate not in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateBetween(Date value1, Date value2) {
            addCriterion("rdate between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotBetween(Date value1, Date value2) {
            addCriterion("rdate not between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRMsgIdIsNull() {
            addCriterion("r_msg_id is null");
            return (Criteria) this;
        }

        public Criteria andRMsgIdIsNotNull() {
            addCriterion("r_msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andRMsgIdEqualTo(Integer value) {
            addCriterion("r_msg_id =", value, "rMsgId");
            return (Criteria) this;
        }

        public Criteria andRMsgIdNotEqualTo(Integer value) {
            addCriterion("r_msg_id <>", value, "rMsgId");
            return (Criteria) this;
        }

        public Criteria andRMsgIdGreaterThan(Integer value) {
            addCriterion("r_msg_id >", value, "rMsgId");
            return (Criteria) this;
        }

        public Criteria andRMsgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_msg_id >=", value, "rMsgId");
            return (Criteria) this;
        }

        public Criteria andRMsgIdLessThan(Integer value) {
            addCriterion("r_msg_id <", value, "rMsgId");
            return (Criteria) this;
        }

        public Criteria andRMsgIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_msg_id <=", value, "rMsgId");
            return (Criteria) this;
        }

        public Criteria andRMsgIdIn(List<Integer> values) {
            addCriterion("r_msg_id in", values, "rMsgId");
            return (Criteria) this;
        }

        public Criteria andRMsgIdNotIn(List<Integer> values) {
            addCriterion("r_msg_id not in", values, "rMsgId");
            return (Criteria) this;
        }

        public Criteria andRMsgIdBetween(Integer value1, Integer value2) {
            addCriterion("r_msg_id between", value1, value2, "rMsgId");
            return (Criteria) this;
        }

        public Criteria andRMsgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_msg_id not between", value1, value2, "rMsgId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table reply
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table reply
     *
     * @mbg.generated
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}