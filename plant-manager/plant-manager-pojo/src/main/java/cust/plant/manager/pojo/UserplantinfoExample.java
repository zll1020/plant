package cust.plant.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserplantinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserplantinfoExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPlantidIsNull() {
            addCriterion("plantID is null");
            return (Criteria) this;
        }

        public Criteria andPlantidIsNotNull() {
            addCriterion("plantID is not null");
            return (Criteria) this;
        }

        public Criteria andPlantidEqualTo(Integer value) {
            addCriterion("plantID =", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidNotEqualTo(Integer value) {
            addCriterion("plantID <>", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidGreaterThan(Integer value) {
            addCriterion("plantID >", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("plantID >=", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidLessThan(Integer value) {
            addCriterion("plantID <", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidLessThanOrEqualTo(Integer value) {
            addCriterion("plantID <=", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidIn(List<Integer> values) {
            addCriterion("plantID in", values, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidNotIn(List<Integer> values) {
            addCriterion("plantID not in", values, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidBetween(Integer value1, Integer value2) {
            addCriterion("plantID between", value1, value2, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidNotBetween(Integer value1, Integer value2) {
            addCriterion("plantID not between", value1, value2, "plantid");
            return (Criteria) this;
        }

        public Criteria andSellstatusIsNull() {
            addCriterion("sellStatus is null");
            return (Criteria) this;
        }

        public Criteria andSellstatusIsNotNull() {
            addCriterion("sellStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSellstatusEqualTo(Integer value) {
            addCriterion("sellStatus =", value, "sellstatus");
            return (Criteria) this;
        }

        public Criteria andSellstatusNotEqualTo(Integer value) {
            addCriterion("sellStatus <>", value, "sellstatus");
            return (Criteria) this;
        }

        public Criteria andSellstatusGreaterThan(Integer value) {
            addCriterion("sellStatus >", value, "sellstatus");
            return (Criteria) this;
        }

        public Criteria andSellstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellStatus >=", value, "sellstatus");
            return (Criteria) this;
        }

        public Criteria andSellstatusLessThan(Integer value) {
            addCriterion("sellStatus <", value, "sellstatus");
            return (Criteria) this;
        }

        public Criteria andSellstatusLessThanOrEqualTo(Integer value) {
            addCriterion("sellStatus <=", value, "sellstatus");
            return (Criteria) this;
        }

        public Criteria andSellstatusIn(List<Integer> values) {
            addCriterion("sellStatus in", values, "sellstatus");
            return (Criteria) this;
        }

        public Criteria andSellstatusNotIn(List<Integer> values) {
            addCriterion("sellStatus not in", values, "sellstatus");
            return (Criteria) this;
        }

        public Criteria andSellstatusBetween(Integer value1, Integer value2) {
            addCriterion("sellStatus between", value1, value2, "sellstatus");
            return (Criteria) this;
        }

        public Criteria andSellstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sellStatus not between", value1, value2, "sellstatus");
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