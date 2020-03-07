package com.yaorange.tqt.service;

import com.yaorange.tqt.VO.FeedBackVo;
import com.yaorange.tqt.pojo.TeaFaceBack;
import com.yaorange.tqt.utils.PageResultNew;

import java.util.List;

/**
 * @author:zjj
 * @date 2020/3/6 14:36
 * @description:
 */
public interface FeedBackService {
    PageResultNew<FeedBackVo> findAllByPage(Integer pageNo, Integer pageSize, String keyWord);

    void updateFeedBack(TeaFaceBack teaFaceBack);

    void addFeedBack(TeaFaceBack teaFaceBack);

    void deleteByIds(List<Long> ids);
}
