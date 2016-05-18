package cn.freeteam.cms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.freeteam.base.BaseExample;

public class StoreExample extends BaseExample{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    public StoreExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
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
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(String value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(String value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(String value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(String value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(String value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLike(String value) {
            addCriterion("memberid like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotLike(String value) {
            addCriterion("memberid not like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<String> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<String> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(String value1, String value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(String value1, String value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNull() {
            addCriterion("siteid is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("siteid is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(String value) {
            addCriterion("siteid =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(String value) {
            addCriterion("siteid <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(String value) {
            addCriterion("siteid >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(String value) {
            addCriterion("siteid >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(String value) {
            addCriterion("siteid <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(String value) {
            addCriterion("siteid <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLike(String value) {
            addCriterion("siteid like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotLike(String value) {
            addCriterion("siteid not like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<String> values) {
            addCriterion("siteid in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<String> values) {
            addCriterion("siteid not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(String value1, String value2) {
            addCriterion("siteid between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(String value1, String value2) {
            addCriterion("siteid not between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNull() {
            addCriterion("sitename is null");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNotNull() {
            addCriterion("sitename is not null");
            return (Criteria) this;
        }

        public Criteria andSitenameEqualTo(String value) {
            addCriterion("sitename =", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotEqualTo(String value) {
            addCriterion("sitename <>", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThan(String value) {
            addCriterion("sitename >", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThanOrEqualTo(String value) {
            addCriterion("sitename >=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThan(String value) {
            addCriterion("sitename <", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThanOrEqualTo(String value) {
            addCriterion("sitename <=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLike(String value) {
            addCriterion("sitename like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotLike(String value) {
            addCriterion("sitename not like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameIn(List<String> values) {
            addCriterion("sitename in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotIn(List<String> values) {
            addCriterion("sitename not in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameBetween(String value1, String value2) {
            addCriterion("sitename between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotBetween(String value1, String value2) {
            addCriterion("sitename not between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNull() {
            addCriterion("channelid is null");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNotNull() {
            addCriterion("channelid is not null");
            return (Criteria) this;
        }

        public Criteria andChannelidEqualTo(String value) {
            addCriterion("channelid =", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotEqualTo(String value) {
            addCriterion("channelid <>", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThan(String value) {
            addCriterion("channelid >", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThanOrEqualTo(String value) {
            addCriterion("channelid >=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThan(String value) {
            addCriterion("channelid <", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThanOrEqualTo(String value) {
            addCriterion("channelid <=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLike(String value) {
            addCriterion("channelid like", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotLike(String value) {
            addCriterion("channelid not like", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidIn(List<String> values) {
            addCriterion("channelid in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotIn(List<String> values) {
            addCriterion("channelid not in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidBetween(String value1, String value2) {
            addCriterion("channelid between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotBetween(String value1, String value2) {
            addCriterion("channelid not between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNull() {
            addCriterion("channelname is null");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNotNull() {
            addCriterion("channelname is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnameEqualTo(String value) {
            addCriterion("channelname =", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotEqualTo(String value) {
            addCriterion("channelname <>", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThan(String value) {
            addCriterion("channelname >", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThanOrEqualTo(String value) {
            addCriterion("channelname >=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThan(String value) {
            addCriterion("channelname <", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThanOrEqualTo(String value) {
            addCriterion("channelname <=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLike(String value) {
            addCriterion("channelname like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotLike(String value) {
            addCriterion("channelname not like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameIn(List<String> values) {
            addCriterion("channelname in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotIn(List<String> values) {
            addCriterion("channelname not in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameBetween(String value1, String value2) {
            addCriterion("channelname between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotBetween(String value1, String value2) {
            addCriterion("channelname not between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andObjtypeIsNull() {
            addCriterion("objtype is null");
            return (Criteria) this;
        }

        public Criteria andObjtypeIsNotNull() {
            addCriterion("objtype is not null");
            return (Criteria) this;
        }

        public Criteria andObjtypeEqualTo(String value) {
            addCriterion("objtype =", value, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeNotEqualTo(String value) {
            addCriterion("objtype <>", value, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeGreaterThan(String value) {
            addCriterion("objtype >", value, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeGreaterThanOrEqualTo(String value) {
            addCriterion("objtype >=", value, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeLessThan(String value) {
            addCriterion("objtype <", value, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeLessThanOrEqualTo(String value) {
            addCriterion("objtype <=", value, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeLike(String value) {
            addCriterion("objtype like", value, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeNotLike(String value) {
            addCriterion("objtype not like", value, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeIn(List<String> values) {
            addCriterion("objtype in", values, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeNotIn(List<String> values) {
            addCriterion("objtype not in", values, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeBetween(String value1, String value2) {
            addCriterion("objtype between", value1, value2, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjtypeNotBetween(String value1, String value2) {
            addCriterion("objtype not between", value1, value2, "objtype");
            return (Criteria) this;
        }

        public Criteria andObjidIsNull() {
            addCriterion("objid is null");
            return (Criteria) this;
        }

        public Criteria andObjidIsNotNull() {
            addCriterion("objid is not null");
            return (Criteria) this;
        }

        public Criteria andObjidEqualTo(String value) {
            addCriterion("objid =", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidNotEqualTo(String value) {
            addCriterion("objid <>", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidGreaterThan(String value) {
            addCriterion("objid >", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidGreaterThanOrEqualTo(String value) {
            addCriterion("objid >=", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidLessThan(String value) {
            addCriterion("objid <", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidLessThanOrEqualTo(String value) {
            addCriterion("objid <=", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidLike(String value) {
            addCriterion("objid like", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidNotLike(String value) {
            addCriterion("objid not like", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidIn(List<String> values) {
            addCriterion("objid in", values, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidNotIn(List<String> values) {
            addCriterion("objid not in", values, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidBetween(String value1, String value2) {
            addCriterion("objid between", value1, value2, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidNotBetween(String value1, String value2) {
            addCriterion("objid not between", value1, value2, "objid");
            return (Criteria) this;
        }

        public Criteria andObjtitleIsNull() {
            addCriterion("objtitle is null");
            return (Criteria) this;
        }

        public Criteria andObjtitleIsNotNull() {
            addCriterion("objtitle is not null");
            return (Criteria) this;
        }

        public Criteria andObjtitleEqualTo(String value) {
            addCriterion("objtitle =", value, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleNotEqualTo(String value) {
            addCriterion("objtitle <>", value, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleGreaterThan(String value) {
            addCriterion("objtitle >", value, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleGreaterThanOrEqualTo(String value) {
            addCriterion("objtitle >=", value, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleLessThan(String value) {
            addCriterion("objtitle <", value, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleLessThanOrEqualTo(String value) {
            addCriterion("objtitle <=", value, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleLike(String value) {
            addCriterion("objtitle like", value, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleNotLike(String value) {
            addCriterion("objtitle not like", value, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleIn(List<String> values) {
            addCriterion("objtitle in", values, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleNotIn(List<String> values) {
            addCriterion("objtitle not in", values, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleBetween(String value1, String value2) {
            addCriterion("objtitle between", value1, value2, "objtitle");
            return (Criteria) this;
        }

        public Criteria andObjtitleNotBetween(String value1, String value2) {
            addCriterion("objtitle not between", value1, value2, "objtitle");
            return (Criteria) this;
        }

        public Criteria andStoretimeIsNull() {
            addCriterion("storetime is null");
            return (Criteria) this;
        }

        public Criteria andStoretimeIsNotNull() {
            addCriterion("storetime is not null");
            return (Criteria) this;
        }

        public Criteria andStoretimeEqualTo(Date value) {
            addCriterion("storetime =", value, "storetime");
            return (Criteria) this;
        }

        public Criteria andStoretimeNotEqualTo(Date value) {
            addCriterion("storetime <>", value, "storetime");
            return (Criteria) this;
        }

        public Criteria andStoretimeGreaterThan(Date value) {
            addCriterion("storetime >", value, "storetime");
            return (Criteria) this;
        }

        public Criteria andStoretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("storetime >=", value, "storetime");
            return (Criteria) this;
        }

        public Criteria andStoretimeLessThan(Date value) {
            addCriterion("storetime <", value, "storetime");
            return (Criteria) this;
        }

        public Criteria andStoretimeLessThanOrEqualTo(Date value) {
            addCriterion("storetime <=", value, "storetime");
            return (Criteria) this;
        }

        public Criteria andStoretimeIn(List<Date> values) {
            addCriterion("storetime in", values, "storetime");
            return (Criteria) this;
        }

        public Criteria andStoretimeNotIn(List<Date> values) {
            addCriterion("storetime not in", values, "storetime");
            return (Criteria) this;
        }

        public Criteria andStoretimeBetween(Date value1, Date value2) {
            addCriterion("storetime between", value1, value2, "storetime");
            return (Criteria) this;
        }

        public Criteria andStoretimeNotBetween(Date value1, Date value2) {
            addCriterion("storetime not between", value1, value2, "storetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_store
     *
     * @mbggenerated do_not_delete_during_merge Tue Jul 02 09:29:46 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_store
     *
     * @mbggenerated Tue Jul 02 09:29:46 CST 2013
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