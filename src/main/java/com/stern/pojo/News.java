package com.stern.pojo;

import java.util.Date;

public class News {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.nid
     *
     * @mbg.generated
     */
    private Integer nid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.ntitle
     *
     * @mbg.generated
     */
    private String ntitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.ncreatetime
     *
     * @mbg.generated
     */
    private Date ncreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.nk_id
     *
     * @mbg.generated
     */
    private Integer nkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.ncontent
     *
     * @mbg.generated
     */
    private String ncontent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.nid
     *
     * @return the value of news.nid
     *
     * @mbg.generated
     */
    public Integer getNid() {
        return nid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.nid
     *
     * @param nid the value for news.nid
     *
     * @mbg.generated
     */
    public void setNid(Integer nid) {
        this.nid = nid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.ntitle
     *
     * @return the value of news.ntitle
     *
     * @mbg.generated
     */
    public String getNtitle() {
        return ntitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.ntitle
     *
     * @param ntitle the value for news.ntitle
     *
     * @mbg.generated
     */
    public void setNtitle(String ntitle) {
        this.ntitle = ntitle == null ? null : ntitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.ncreatetime
     *
     * @return the value of news.ncreatetime
     *
     * @mbg.generated
     */
    public Date getNcreatetime() {
        return ncreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.ncreatetime
     *
     * @param ncreatetime the value for news.ncreatetime
     *
     * @mbg.generated
     */
    public void setNcreatetime(Date ncreatetime) {
        this.ncreatetime = ncreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.nk_id
     *
     * @return the value of news.nk_id
     *
     * @mbg.generated
     */
    public Integer getNkId() {
        return nkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.nk_id
     *
     * @param nkId the value for news.nk_id
     *
     * @mbg.generated
     */
    public void setNkId(Integer nkId) {
        this.nkId = nkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.ncontent
     *
     * @return the value of news.ncontent
     *
     * @mbg.generated
     */
    public String getNcontent() {
        return ncontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.ncontent
     *
     * @param ncontent the value for news.ncontent
     *
     * @mbg.generated
     */
    public void setNcontent(String ncontent) {
        this.ncontent = ncontent == null ? null : ncontent.trim();
    }
}