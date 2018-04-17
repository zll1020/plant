package cust.plant.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderinfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNull() {
            addCriterion("goodID is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(Integer value) {
            addCriterion("goodID =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(Integer value) {
            addCriterion("goodID <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(Integer value) {
            addCriterion("goodID >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodID >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(Integer value) {
            addCriterion("goodID <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("goodID <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<Integer> values) {
            addCriterion("goodID in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<Integer> values) {
            addCriterion("goodID not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(Integer value1, Integer value2) {
            addCriterion("goodID between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodID not between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andBuyuseridIsNull() {
            addCriterion("buyUserID is null");
            return (Criteria) this;
        }

        public Criteria andBuyuseridIsNotNull() {
            addCriterion("buyUserID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyuseridEqualTo(Integer value) {
            addCriterion("buyUserID =", value, "buyuserid");
            return (Criteria) this;
        }

        public Criteria andBuyuseridNotEqualTo(Integer value) {
            addCriterion("buyUserID <>", value, "buyuserid");
            return (Criteria) this;
        }

        public Criteria andBuyuseridGreaterThan(Integer value) {
            addCriterion("buyUserID >", value, "buyuserid");
            return (Criteria) this;
        }

        public Criteria andBuyuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyUserID >=", value, "buyuserid");
            return (Criteria) this;
        }

        public Criteria andBuyuseridLessThan(Integer value) {
            addCriterion("buyUserID <", value, "buyuserid");
            return (Criteria) this;
        }

        public Criteria andBuyuseridLessThanOrEqualTo(Integer value) {
            addCriterion("buyUserID <=", value, "buyuserid");
            return (Criteria) this;
        }

        public Criteria andBuyuseridIn(List<Integer> values) {
            addCriterion("buyUserID in", values, "buyuserid");
            return (Criteria) this;
        }

        public Criteria andBuyuseridNotIn(List<Integer> values) {
            addCriterion("buyUserID not in", values, "buyuserid");
            return (Criteria) this;
        }

        public Criteria andBuyuseridBetween(Integer value1, Integer value2) {
            addCriterion("buyUserID between", value1, value2, "buyuserid");
            return (Criteria) this;
        }

        public Criteria andBuyuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("buyUserID not between", value1, value2, "buyuserid");
            return (Criteria) this;
        }

        public Criteria andSelluseridIsNull() {
            addCriterion("sellUserID is null");
            return (Criteria) this;
        }

        public Criteria andSelluseridIsNotNull() {
            addCriterion("sellUserID is not null");
            return (Criteria) this;
        }

        public Criteria andSelluseridEqualTo(Integer value) {
            addCriterion("sellUserID =", value, "selluserid");
            return (Criteria) this;
        }

        public Criteria andSelluseridNotEqualTo(Integer value) {
            addCriterion("sellUserID <>", value, "selluserid");
            return (Criteria) this;
        }

        public Criteria andSelluseridGreaterThan(Integer value) {
            addCriterion("sellUserID >", value, "selluserid");
            return (Criteria) this;
        }

        public Criteria andSelluseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellUserID >=", value, "selluserid");
            return (Criteria) this;
        }

        public Criteria andSelluseridLessThan(Integer value) {
            addCriterion("sellUserID <", value, "selluserid");
            return (Criteria) this;
        }

        public Criteria andSelluseridLessThanOrEqualTo(Integer value) {
            addCriterion("sellUserID <=", value, "selluserid");
            return (Criteria) this;
        }

        public Criteria andSelluseridIn(List<Integer> values) {
            addCriterion("sellUserID in", values, "selluserid");
            return (Criteria) this;
        }

        public Criteria andSelluseridNotIn(List<Integer> values) {
            addCriterion("sellUserID not in", values, "selluserid");
            return (Criteria) this;
        }

        public Criteria andSelluseridBetween(Integer value1, Integer value2) {
            addCriterion("sellUserID between", value1, value2, "selluserid");
            return (Criteria) this;
        }

        public Criteria andSelluseridNotBetween(Integer value1, Integer value2) {
            addCriterion("sellUserID not between", value1, value2, "selluserid");
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