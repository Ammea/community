package com.nowconder.community.util;

public interface CommunityConstant {
    int ACTIVATION_SUCCESS=0;
    int ACTIVATION_REPEAT=1;
    int ACTIVATION_FAILURE=2;

    /*
    * 默认状态的登录凭证超时时间
    * */
    int DEFAULT_EXPIRED_SECONDS=3600*12;
    /*
     * 记住密码状态的登录凭证超时时间
     * */
    int REMEMBER_EXPIRED_SECONDS=3600*24*100;


}
