package com.stern.pojo;

/**
 * 课程类型 -实体类
 */
public class Coursecategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coursecategory.cate_id
     *
     * @mbg.generated
     */
    private Integer cateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coursecategory.cate_name
     *
     * @mbg.generated
     */
    private String cateName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coursecategory.cate_id
     *
     * @return the value of coursecategory.cate_id
     *
     * @mbg.generated
     */
    public Integer getCateId() {
        return cateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coursecategory.cate_id
     *
     * @param cateId the value for coursecategory.cate_id
     *
     * @mbg.generated
     */
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coursecategory.cate_name
     *
     * @return the value of coursecategory.cate_name
     *
     * @mbg.generated
     */
    public String getCateName() {
        return cateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coursecategory.cate_name
     *
     * @param cateName the value for coursecategory.cate_name
     *
     * @mbg.generated
     */
    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }
}