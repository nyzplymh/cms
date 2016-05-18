package cn.freeteam.cms.dao;

import cn.freeteam.cms.model.Comment;
import cn.freeteam.cms.model.CommentExample;
import cn.freeteam.cms.model.Guestbook;
import cn.freeteam.cms.model.GuestbookExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    int countByExample(CommentExample example);
    int countByExampleCache(CommentExample example);

    

    List<Comment> commentUpdateYear(CommentExample example);
    List<Comment> commentUpdateYearPage(CommentExample example);
    List<Comment> commentUpdateMonth(CommentExample example);
    List<Comment> commentUpdateMonthPage(CommentExample example);
    List<Comment> commentUpdateDay(CommentExample example);
    List<Comment> commentUpdateDayPage(CommentExample example);
    List<Comment> commentUpdateWeek(CommentExample example);

    int commentUpdateYearCount(CommentExample example);
    int commentUpdateYearSum(CommentExample example);
    int commentUpdateMonthCount(CommentExample example);
    int commentUpdateMonthSum(CommentExample example);
    int commentUpdateDayCount(CommentExample example);
    int commentUpdateDaySum(CommentExample example);
    int commentUpdateWeekSum(CommentExample example);
    

    List<Comment> sysSiteCommentPage(CommentExample example);
    List<Comment> sysSiteComment(CommentExample example);
    int sysSiteCommentCount(CommentExample example);
    int sysSiteCommentSum(CommentExample example);
    
    
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    List<Comment> selectByExample(CommentExample example);
    List<Comment> selectPageByExample(CommentExample example);
    List<Comment> selectPageByExampleCache(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    Comment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_comment
     *
     * @mbggenerated Wed Feb 06 14:25:12 CST 2013
     */
    int updateByPrimaryKey(Comment record);
}