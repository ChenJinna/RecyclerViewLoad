package com.kina.recyclerviewload.base;

/****
 * @Project_Name: RecyclerViewLoad
 * @Copyright: Copyright © 2012-2016 G-emall Technology Co.,Ltd
 * @Version: 1.0.0.1
 * @Created by:     g-emall on 2016/9/6 17:36.
 * @Desc:
 * @ModifyHistory:
 ****/

public interface OnItemClickListeners<T> {
    void onItemClick(ViewHolder viewHolder, T data, int position);
}