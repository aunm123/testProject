package com.Entity;

import java.util.ArrayList;
import java.util.List;

public class GroupRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupRightExample() {
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

        public Criteria andGridIsNull() {
            addCriterion("grid is null");
            return (Criteria) this;
        }

        public Criteria andGridIsNotNull() {
            addCriterion("grid is not null");
            return (Criteria) this;
        }

        public Criteria andGridEqualTo(Integer value) {
            addCriterion("grid =", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridNotEqualTo(Integer value) {
            addCriterion("grid <>", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridGreaterThan(Integer value) {
            addCriterion("grid >", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridGreaterThanOrEqualTo(Integer value) {
            addCriterion("grid >=", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridLessThan(Integer value) {
            addCriterion("grid <", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridLessThanOrEqualTo(Integer value) {
            addCriterion("grid <=", value, "grid");
            return (Criteria) this;
        }

        public Criteria andGridIn(List<Integer> values) {
            addCriterion("grid in", values, "grid");
            return (Criteria) this;
        }

        public Criteria andGridNotIn(List<Integer> values) {
            addCriterion("grid not in", values, "grid");
            return (Criteria) this;
        }

        public Criteria andGridBetween(Integer value1, Integer value2) {
            addCriterion("grid between", value1, value2, "grid");
            return (Criteria) this;
        }

        public Criteria andGridNotBetween(Integer value1, Integer value2) {
            addCriterion("grid not between", value1, value2, "grid");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andRightidIsNull() {
            addCriterion("rightid is null");
            return (Criteria) this;
        }

        public Criteria andRightidIsNotNull() {
            addCriterion("rightid is not null");
            return (Criteria) this;
        }

        public Criteria andRightidEqualTo(Integer value) {
            addCriterion("rightid =", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotEqualTo(Integer value) {
            addCriterion("rightid <>", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidGreaterThan(Integer value) {
            addCriterion("rightid >", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rightid >=", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLessThan(Integer value) {
            addCriterion("rightid <", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLessThanOrEqualTo(Integer value) {
            addCriterion("rightid <=", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidIn(List<Integer> values) {
            addCriterion("rightid in", values, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotIn(List<Integer> values) {
            addCriterion("rightid not in", values, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidBetween(Integer value1, Integer value2) {
            addCriterion("rightid between", value1, value2, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotBetween(Integer value1, Integer value2) {
            addCriterion("rightid not between", value1, value2, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightTypeIsNull() {
            addCriterion("right_type is null");
            return (Criteria) this;
        }

        public Criteria andRightTypeIsNotNull() {
            addCriterion("right_type is not null");
            return (Criteria) this;
        }

        public Criteria andRightTypeEqualTo(Integer value) {
            addCriterion("right_type =", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeNotEqualTo(Integer value) {
            addCriterion("right_type <>", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeGreaterThan(Integer value) {
            addCriterion("right_type >", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_type >=", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeLessThan(Integer value) {
            addCriterion("right_type <", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeLessThanOrEqualTo(Integer value) {
            addCriterion("right_type <=", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeIn(List<Integer> values) {
            addCriterion("right_type in", values, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeNotIn(List<Integer> values) {
            addCriterion("right_type not in", values, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeBetween(Integer value1, Integer value2) {
            addCriterion("right_type between", value1, value2, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("right_type not between", value1, value2, "rightType");
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