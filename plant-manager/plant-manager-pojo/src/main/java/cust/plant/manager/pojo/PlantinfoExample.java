package cust.plant.manager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlantinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlantinfoExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andSoiltempIsNull() {
            addCriterion("soilTemp is null");
            return (Criteria) this;
        }

        public Criteria andSoiltempIsNotNull() {
            addCriterion("soilTemp is not null");
            return (Criteria) this;
        }

        public Criteria andSoiltempEqualTo(Float value) {
            addCriterion("soilTemp =", value, "soiltemp");
            return (Criteria) this;
        }

        public Criteria andSoiltempNotEqualTo(Float value) {
            addCriterion("soilTemp <>", value, "soiltemp");
            return (Criteria) this;
        }

        public Criteria andSoiltempGreaterThan(Float value) {
            addCriterion("soilTemp >", value, "soiltemp");
            return (Criteria) this;
        }

        public Criteria andSoiltempGreaterThanOrEqualTo(Float value) {
            addCriterion("soilTemp >=", value, "soiltemp");
            return (Criteria) this;
        }

        public Criteria andSoiltempLessThan(Float value) {
            addCriterion("soilTemp <", value, "soiltemp");
            return (Criteria) this;
        }

        public Criteria andSoiltempLessThanOrEqualTo(Float value) {
            addCriterion("soilTemp <=", value, "soiltemp");
            return (Criteria) this;
        }

        public Criteria andSoiltempIn(List<Float> values) {
            addCriterion("soilTemp in", values, "soiltemp");
            return (Criteria) this;
        }

        public Criteria andSoiltempNotIn(List<Float> values) {
            addCriterion("soilTemp not in", values, "soiltemp");
            return (Criteria) this;
        }

        public Criteria andSoiltempBetween(Float value1, Float value2) {
            addCriterion("soilTemp between", value1, value2, "soiltemp");
            return (Criteria) this;
        }

        public Criteria andSoiltempNotBetween(Float value1, Float value2) {
            addCriterion("soilTemp not between", value1, value2, "soiltemp");
            return (Criteria) this;
        }

        public Criteria andSoilhumIsNull() {
            addCriterion("soilHum is null");
            return (Criteria) this;
        }

        public Criteria andSoilhumIsNotNull() {
            addCriterion("soilHum is not null");
            return (Criteria) this;
        }

        public Criteria andSoilhumEqualTo(Float value) {
            addCriterion("soilHum =", value, "soilhum");
            return (Criteria) this;
        }

        public Criteria andSoilhumNotEqualTo(Float value) {
            addCriterion("soilHum <>", value, "soilhum");
            return (Criteria) this;
        }

        public Criteria andSoilhumGreaterThan(Float value) {
            addCriterion("soilHum >", value, "soilhum");
            return (Criteria) this;
        }

        public Criteria andSoilhumGreaterThanOrEqualTo(Float value) {
            addCriterion("soilHum >=", value, "soilhum");
            return (Criteria) this;
        }

        public Criteria andSoilhumLessThan(Float value) {
            addCriterion("soilHum <", value, "soilhum");
            return (Criteria) this;
        }

        public Criteria andSoilhumLessThanOrEqualTo(Float value) {
            addCriterion("soilHum <=", value, "soilhum");
            return (Criteria) this;
        }

        public Criteria andSoilhumIn(List<Float> values) {
            addCriterion("soilHum in", values, "soilhum");
            return (Criteria) this;
        }

        public Criteria andSoilhumNotIn(List<Float> values) {
            addCriterion("soilHum not in", values, "soilhum");
            return (Criteria) this;
        }

        public Criteria andSoilhumBetween(Float value1, Float value2) {
            addCriterion("soilHum between", value1, value2, "soilhum");
            return (Criteria) this;
        }

        public Criteria andSoilhumNotBetween(Float value1, Float value2) {
            addCriterion("soilHum not between", value1, value2, "soilhum");
            return (Criteria) this;
        }

        public Criteria andAirtempIsNull() {
            addCriterion("airTemp is null");
            return (Criteria) this;
        }

        public Criteria andAirtempIsNotNull() {
            addCriterion("airTemp is not null");
            return (Criteria) this;
        }

        public Criteria andAirtempEqualTo(Float value) {
            addCriterion("airTemp =", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempNotEqualTo(Float value) {
            addCriterion("airTemp <>", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempGreaterThan(Float value) {
            addCriterion("airTemp >", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempGreaterThanOrEqualTo(Float value) {
            addCriterion("airTemp >=", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempLessThan(Float value) {
            addCriterion("airTemp <", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempLessThanOrEqualTo(Float value) {
            addCriterion("airTemp <=", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempIn(List<Float> values) {
            addCriterion("airTemp in", values, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempNotIn(List<Float> values) {
            addCriterion("airTemp not in", values, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempBetween(Float value1, Float value2) {
            addCriterion("airTemp between", value1, value2, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempNotBetween(Float value1, Float value2) {
            addCriterion("airTemp not between", value1, value2, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirhumIsNull() {
            addCriterion("airHum is null");
            return (Criteria) this;
        }

        public Criteria andAirhumIsNotNull() {
            addCriterion("airHum is not null");
            return (Criteria) this;
        }

        public Criteria andAirhumEqualTo(Float value) {
            addCriterion("airHum =", value, "airhum");
            return (Criteria) this;
        }

        public Criteria andAirhumNotEqualTo(Float value) {
            addCriterion("airHum <>", value, "airhum");
            return (Criteria) this;
        }

        public Criteria andAirhumGreaterThan(Float value) {
            addCriterion("airHum >", value, "airhum");
            return (Criteria) this;
        }

        public Criteria andAirhumGreaterThanOrEqualTo(Float value) {
            addCriterion("airHum >=", value, "airhum");
            return (Criteria) this;
        }

        public Criteria andAirhumLessThan(Float value) {
            addCriterion("airHum <", value, "airhum");
            return (Criteria) this;
        }

        public Criteria andAirhumLessThanOrEqualTo(Float value) {
            addCriterion("airHum <=", value, "airhum");
            return (Criteria) this;
        }

        public Criteria andAirhumIn(List<Float> values) {
            addCriterion("airHum in", values, "airhum");
            return (Criteria) this;
        }

        public Criteria andAirhumNotIn(List<Float> values) {
            addCriterion("airHum not in", values, "airhum");
            return (Criteria) this;
        }

        public Criteria andAirhumBetween(Float value1, Float value2) {
            addCriterion("airHum between", value1, value2, "airhum");
            return (Criteria) this;
        }

        public Criteria andAirhumNotBetween(Float value1, Float value2) {
            addCriterion("airHum not between", value1, value2, "airhum");
            return (Criteria) this;
        }

        public Criteria andLightIsNull() {
            addCriterion("light is null");
            return (Criteria) this;
        }

        public Criteria andLightIsNotNull() {
            addCriterion("light is not null");
            return (Criteria) this;
        }

        public Criteria andLightEqualTo(Float value) {
            addCriterion("light =", value, "light");
            return (Criteria) this;
        }

        public Criteria andLightNotEqualTo(Float value) {
            addCriterion("light <>", value, "light");
            return (Criteria) this;
        }

        public Criteria andLightGreaterThan(Float value) {
            addCriterion("light >", value, "light");
            return (Criteria) this;
        }

        public Criteria andLightGreaterThanOrEqualTo(Float value) {
            addCriterion("light >=", value, "light");
            return (Criteria) this;
        }

        public Criteria andLightLessThan(Float value) {
            addCriterion("light <", value, "light");
            return (Criteria) this;
        }

        public Criteria andLightLessThanOrEqualTo(Float value) {
            addCriterion("light <=", value, "light");
            return (Criteria) this;
        }

        public Criteria andLightIn(List<Float> values) {
            addCriterion("light in", values, "light");
            return (Criteria) this;
        }

        public Criteria andLightNotIn(List<Float> values) {
            addCriterion("light not in", values, "light");
            return (Criteria) this;
        }

        public Criteria andLightBetween(Float value1, Float value2) {
            addCriterion("light between", value1, value2, "light");
            return (Criteria) this;
        }

        public Criteria andLightNotBetween(Float value1, Float value2) {
            addCriterion("light not between", value1, value2, "light");
            return (Criteria) this;
        }

        public Criteria andCo2IsNull() {
            addCriterion("co2 is null");
            return (Criteria) this;
        }

        public Criteria andCo2IsNotNull() {
            addCriterion("co2 is not null");
            return (Criteria) this;
        }

        public Criteria andCo2EqualTo(Float value) {
            addCriterion("co2 =", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotEqualTo(Float value) {
            addCriterion("co2 <>", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThan(Float value) {
            addCriterion("co2 >", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThanOrEqualTo(Float value) {
            addCriterion("co2 >=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThan(Float value) {
            addCriterion("co2 <", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThanOrEqualTo(Float value) {
            addCriterion("co2 <=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2In(List<Float> values) {
            addCriterion("co2 in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotIn(List<Float> values) {
            addCriterion("co2 not in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2Between(Float value1, Float value2) {
            addCriterion("co2 between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotBetween(Float value1, Float value2) {
            addCriterion("co2 not between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidIsNull() {
            addCriterion("growStatusID is null");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidIsNotNull() {
            addCriterion("growStatusID is not null");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidEqualTo(Integer value) {
            addCriterion("growStatusID =", value, "growstatusid");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidNotEqualTo(Integer value) {
            addCriterion("growStatusID <>", value, "growstatusid");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidGreaterThan(Integer value) {
            addCriterion("growStatusID >", value, "growstatusid");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("growStatusID >=", value, "growstatusid");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidLessThan(Integer value) {
            addCriterion("growStatusID <", value, "growstatusid");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("growStatusID <=", value, "growstatusid");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidIn(List<Integer> values) {
            addCriterion("growStatusID in", values, "growstatusid");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidNotIn(List<Integer> values) {
            addCriterion("growStatusID not in", values, "growstatusid");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidBetween(Integer value1, Integer value2) {
            addCriterion("growStatusID between", value1, value2, "growstatusid");
            return (Criteria) this;
        }

        public Criteria andGrowstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("growStatusID not between", value1, value2, "growstatusid");
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