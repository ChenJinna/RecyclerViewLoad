package com.kina.recyclerviewload.base;

/****
 * @Project_Name: RecyclerViewLoad
 * @Copyright: Copyright © 2012-2016 G-emall Technology Co.,Ltd
 * @Version: 1.0.0.1
 * @Created by:     g-emall on 2016/9/6 17:35.
 * @Desc:
 * @ModifyHistory:
 ****/

public interface OnLoadMoreListener {
    /**
     * 加载更多的回调方法
     * @param isReload 是否是重新加载，只有加载失败后，点击重新加载时为true
     */
    void onLoadMore(boolean isReload);
}