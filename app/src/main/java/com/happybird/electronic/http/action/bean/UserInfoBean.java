package com.happybird.electronic.http.action.bean;

import com.git.easylib.EventMessage.BaseBean;
import com.happybird.electronic.http.model.UserInfo;

/**
 *
 * @author dyf
 * @date 2017/10/19/019
 */

public class UserInfoBean extends BaseBean {

    private UserInfo resultContent;

    public UserInfo getResultContent() {
        return resultContent;
    }

    public void setResultContent(UserInfo resultContent) {
        this.resultContent = resultContent;
    }



}
