package cust.plant.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class ThresholdinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThresholdinfoExample() {
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

        public Criteria andTypeidIsNull() {
            addCriterion("TypeID is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("TypeID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("TypeID =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("TypeID <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("TypeID >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TypeID >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("TypeID <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("TypeID <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("TypeID in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("TypeID not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("TypeID between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("TypeID not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andParamnameIsNull() {
            addCriterion("ParamName is null");
            return (Criteria) this;
        }

        public Criteria andParamnameIsNotNull() {
            addCriterion("ParamName is not null");
            return (Criteria) this;
        }

        public Criteria andParamnameEqualTo(String value) {
            addCriterion("ParamName =", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotEqualTo(String value) {
            addCriterion("ParamName <>", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameGreaterThan(String value) {
            addCriterion("ParamName >", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameGreaterThanOrEqualTo(String value) {
            addCriterion("ParamName >=", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLessThan(String value) {
            addCriterion("ParamName <", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLessThanOrEqualTo(String value) {
            addCriterion("ParamName <=", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLike(String value) {
            addCriterion("ParamName like", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotLike(String value) {
            addCriterion("ParamName not like", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameIn(List<String> values) {
            addCriterion("ParamName in", values, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotIn(List<String> values) {
            addCriterion("ParamName not in", values, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameBetween(String value1, String value2) {
            addCriterion("ParamName between", value1, value2, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotBetween(String value1, String value2) {
            addCriterion("ParamName not between", value1, value2, "paramname");
            return (Criteria) this;
        }

        public Criteria andHightlevelIsNull() {
            addCriterion("hightLevel is null");
            return (Criteria) this;
        }

        public Criteria andHightlevelIsNotNull() {
            addCriterion("hightLevel is not null");
            return (Criteria) this;
        }

        public Criteria andHightlevelEqualTo(Float value) {
            addCriterion("hightLevel =", value, "hightlevel");
            return (Criteria) this;
        }

        public Criteria andHightlevelNotEqualTo(Float value) {
            addCriterion("hightLevel <>", value, "hightlevel");
            return (Criteria) this;
        }

        public Criteria andHightlevelGreaterThan(Float value) {
            addCriterion("hightLevel >", value, "hightlevel");
            return (Criteria) this;
        }

        public Criteria andHightlevelGreaterThanOrEqualTo(Float value) {
            addCriterion("hightLevel >=", value, "hightlevel");
            return (Criteria) this;
        }

        public Criteria andHightlevelLessThan(Float value) {
            addCriterion("hightLevel <", value, "hightlevel");
            return (Criteria) this;
        }

        public Criteria andHightlevelLessThanOrEqualTo(Float value) {
            addCriterion("hightLevel <=", value, "hightlevel");
            return (Criteria) this;
        }

        public Criteria andHightlevelIn(List<Float> values) {
            addCriterion("hightLevel in", values, "hightlevel");
            return (Criteria) this;
        }

        public Criteria andHightlevelNotIn(List<Float> values) {
            addCriterion("hightLevel not in", values, "hightlevel");
            return (Criteria) this;
        }

        public Criteria andHightlevelBetween(Float value1, Float value2) {
            addCriterion("hightLevel between", value1, value2, "hightlevel");
            return (Criteria) this;
        }

        public Criteria andHightlevelNotBetween(Float value1, Float value2) {
            addCriterion("hightLevel not between", value1, value2, "hightlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelIsNull() {
            addCriterion("lowLevel is null");
            return (Criteria) this;
        }

        public Criteria andLowlevelIsNotNull() {
            addCriterion("lowLevel is not null");
            return (Criteria) this;
        }

        public Criteria andLowlevelEqualTo(Float value) {
            addCriterion("lowLevel =", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelNotEqualTo(Float value) {
            addCriterion("lowLevel <>", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelGreaterThan(Float value) {
            addCriterion("lowLevel >", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelGreaterThanOrEqualTo(Float value) {
            addCriterion("lowLevel >=", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelLessThan(Float value) {
            addCriterion("lowLevel <", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelLessThanOrEqualTo(Float value) {
            addCriterion("lowLevel <=", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelIn(List<Float> values) {
            addCriterion("lowLevel in", values, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelNotIn(List<Float> values) {
            addCriterion("lowLevel not in", values, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelBetween(Float value1, Float value2) {
            addCriterion("lowLevel between", value1, value2, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelNotBetween(Float value1, Float value2) {
            addCriterion("lowLevel not between", value1, value2, "lowlevel");
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