package com.schoolinformationmanagementsystem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentselectcourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentselectcourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIncreIdIsNull() {
            addCriterion("incre_id is null");
            return (Criteria) this;
        }

        public Criteria andIncreIdIsNotNull() {
            addCriterion("incre_id is not null");
            return (Criteria) this;
        }

        public Criteria andIncreIdEqualTo(Integer value) {
            addCriterion("incre_id =", value, "increId");
            return (Criteria) this;
        }

        public Criteria andIncreIdNotEqualTo(Integer value) {
            addCriterion("incre_id <>", value, "increId");
            return (Criteria) this;
        }

        public Criteria andIncreIdGreaterThan(Integer value) {
            addCriterion("incre_id >", value, "increId");
            return (Criteria) this;
        }

        public Criteria andIncreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("incre_id >=", value, "increId");
            return (Criteria) this;
        }

        public Criteria andIncreIdLessThan(Integer value) {
            addCriterion("incre_id <", value, "increId");
            return (Criteria) this;
        }

        public Criteria andIncreIdLessThanOrEqualTo(Integer value) {
            addCriterion("incre_id <=", value, "increId");
            return (Criteria) this;
        }

        public Criteria andIncreIdIn(List<Integer> values) {
            addCriterion("incre_id in", values, "increId");
            return (Criteria) this;
        }

        public Criteria andIncreIdNotIn(List<Integer> values) {
            addCriterion("incre_id not in", values, "increId");
            return (Criteria) this;
        }

        public Criteria andIncreIdBetween(Integer value1, Integer value2) {
            addCriterion("incre_id between", value1, value2, "increId");
            return (Criteria) this;
        }

        public Criteria andIncreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("incre_id not between", value1, value2, "increId");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdIsNull() {
            addCriterion("incre_stu_id is null");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdIsNotNull() {
            addCriterion("incre_stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdEqualTo(Integer value) {
            addCriterion("incre_stu_id =", value, "increStuId");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdNotEqualTo(Integer value) {
            addCriterion("incre_stu_id <>", value, "increStuId");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdGreaterThan(Integer value) {
            addCriterion("incre_stu_id >", value, "increStuId");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("incre_stu_id >=", value, "increStuId");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdLessThan(Integer value) {
            addCriterion("incre_stu_id <", value, "increStuId");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("incre_stu_id <=", value, "increStuId");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdIn(List<Integer> values) {
            addCriterion("incre_stu_id in", values, "increStuId");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdNotIn(List<Integer> values) {
            addCriterion("incre_stu_id not in", values, "increStuId");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdBetween(Integer value1, Integer value2) {
            addCriterion("incre_stu_id between", value1, value2, "increStuId");
            return (Criteria) this;
        }

        public Criteria andIncreStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("incre_stu_id not between", value1, value2, "increStuId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andSelectTimeIsNull() {
            addCriterion("select_time is null");
            return (Criteria) this;
        }

        public Criteria andSelectTimeIsNotNull() {
            addCriterion("select_time is not null");
            return (Criteria) this;
        }

        public Criteria andSelectTimeEqualTo(Date value) {
            addCriterion("select_time =", value, "selectTime");
            return (Criteria) this;
        }

        public Criteria andSelectTimeNotEqualTo(Date value) {
            addCriterion("select_time <>", value, "selectTime");
            return (Criteria) this;
        }

        public Criteria andSelectTimeGreaterThan(Date value) {
            addCriterion("select_time >", value, "selectTime");
            return (Criteria) this;
        }

        public Criteria andSelectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("select_time >=", value, "selectTime");
            return (Criteria) this;
        }

        public Criteria andSelectTimeLessThan(Date value) {
            addCriterion("select_time <", value, "selectTime");
            return (Criteria) this;
        }

        public Criteria andSelectTimeLessThanOrEqualTo(Date value) {
            addCriterion("select_time <=", value, "selectTime");
            return (Criteria) this;
        }

        public Criteria andSelectTimeIn(List<Date> values) {
            addCriterion("select_time in", values, "selectTime");
            return (Criteria) this;
        }

        public Criteria andSelectTimeNotIn(List<Date> values) {
            addCriterion("select_time not in", values, "selectTime");
            return (Criteria) this;
        }

        public Criteria andSelectTimeBetween(Date value1, Date value2) {
            addCriterion("select_time between", value1, value2, "selectTime");
            return (Criteria) this;
        }

        public Criteria andSelectTimeNotBetween(Date value1, Date value2) {
            addCriterion("select_time not between", value1, value2, "selectTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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