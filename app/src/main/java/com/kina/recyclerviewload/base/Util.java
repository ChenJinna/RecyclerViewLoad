package com.kina.recyclerviewload.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/****
 * @Project_Name: RecyclerViewLoad
 * @Copyright: Copyright © 2012-2016 G-emall Technology Co.,Ltd
 * @Version: 1.0.0.1
 * @Created by:     g-emall on 2016/9/6 17:35.
 * @Desc:
 * @ModifyHistory:
 ****/

public class Util {
    /**
     * StaggeredGridLayoutManager时，查找position最大的列
     *
     * @param lastVisiblePositions
     * @return
     */
    public static int findMax(int[] lastVisiblePositions) {
        int max = lastVisiblePositions[0];
        for (int value : lastVisiblePositions) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static View inflate(Context context, int layoutId) {
        if (layoutId <= 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(layoutId, null);
    }
}
