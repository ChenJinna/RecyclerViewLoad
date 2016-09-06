package com.kina.recyclerviewload;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.kina.recyclerviewload.base.BaseAdapter;
import com.kina.recyclerviewload.base.ViewHolder;

import java.util.List;

/****
 * @Project_Name: RecyclerViewLoad
 * @Copyright: Copyright © 2012-2016 G-emall Technology Co.,Ltd
 * @Version: 1.0.0.1
 * @Created by:     g-emall on 2016/9/6 17:40.
 * @Desc:
 * @ModifyHistory:
 ****/
public class RefreshAdapter extends BaseAdapter<String> {

    public RefreshAdapter(Context context, List<String> datas, boolean isLoadMore) {
        super(context, datas, isLoadMore);
    }

    @Override
    protected void convert(ViewHolder holder, final String data) {
        holder.setText(R.id.item_title, data);
        holder.setOnClickListener(R.id.item_btn, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "我是" + data + "的button", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_layout;
    }
}
