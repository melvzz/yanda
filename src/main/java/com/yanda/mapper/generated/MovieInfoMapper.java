package com.yanda.mapper.generated;

import com.yanda.entity.generated.MovieInfo;
import com.yanda.entity.generated.MovieInfoExample;
import java.util.List;

public interface MovieInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_movie_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer mvId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_movie_info
     *
     * @mbggenerated
     */
    int insert(MovieInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_movie_info
     *
     * @mbggenerated
     */
    int insertSelective(MovieInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_movie_info
     *
     * @mbggenerated
     */
    List<MovieInfo> selectByExample(MovieInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_movie_info
     *
     * @mbggenerated
     */
    MovieInfo selectByPrimaryKey(Integer mvId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_movie_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MovieInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_movie_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MovieInfo record);
}