package com.happybird.electronic.http.listener;

/**
 * Created by Administrator on 2017/12/23/023.
 */

public interface OnTaskListener<T>  {
    void onFinish(T t);
}
