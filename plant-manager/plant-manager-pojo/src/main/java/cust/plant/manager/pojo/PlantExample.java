package cust.plant.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class PlantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlantExample() {
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

        public Criteria andPlantidIsNull() {
            addCriterion("PlantID is null");
            return (Criteria) this;
        }

        public Criteria andPlantidIsNotNull() {
            addCriterion("PlantID is not null");
            return (Criteria) this;
        }

        public Criteria andPlantidEqualTo(Integer value) {
            addCriterion("PlantID =", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidNotEqualTo(Integer value) {
            addCriterion("PlantID <>", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidGreaterThan(Integer value) {
            addCriterion("PlantID >", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlantID >=", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidLessThan(Integer value) {
            addCriterion("PlantID <", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidLessThanOrEqualTo(Integer value) {
            addCriterion("PlantID <=", value, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidIn(List<Integer> values) {
            addCriterion("PlantID in", values, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidNotIn(List<Integer> values) {
            addCriterion("PlantID not in", values, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidBetween(Integer value1, Integer value2) {
            addCriterion("PlantID between", value1, value2, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantidNotBetween(Integer value1, Integer value2) {
            addCriterion("PlantID not between", value1, value2, "plantid");
            return (Criteria) this;
        }

        public Criteria andPlantnameIsNull() {
            addCriterion("plantName is null");
            return (Criteria) this;
        }

        public Criteria andPlantnameIsNotNull() {
            addCriterion("plantName is not null");
            return (Criteria) this;
        }

        public Criteria andPlantnameEqualTo(String value) {
            addCriterion("plantName =", value, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameNotEqualTo(String value) {
            addCriterion("plantName <>", value, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameGreaterThan(String value) {
            addCriterion("plantName >", value, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameGreaterThanOrEqualTo(String value) {
            addCriterion("plantName >=", value, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameLessThan(String value) {
            addCriterion("plantName <", value, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameLessThanOrEqualTo(String value) {
            addCriterion("plantName <=", value, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameLike(String value) {
            addCriterion("plantName like", value, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameNotLike(String value) {
            addCriterion("plantName not like", value, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameIn(List<String> values) {
            addCriterion("plantName in", values, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameNotIn(List<String> values) {
            addCriterion("plantName not in", values, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameBetween(String value1, String value2) {
            addCriterion("plantName between", value1, value2, "plantname");
            return (Criteria) this;
        }

        public Criteria andPlantnameNotBetween(String value1, String value2) {
            addCriterion("plantName not between", value1, value2, "plantname");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeID is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeID =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeID <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeID >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeID >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeID <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeID <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeID in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeID not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeID between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeID not between", value1, value2, "typeid");
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