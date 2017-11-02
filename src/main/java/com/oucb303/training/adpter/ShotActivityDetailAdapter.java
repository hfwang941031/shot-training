package com.oucb303.training.adpter;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.oucb303.training.R;
/**
 * Created by 王海峰 on 2017/10/20.
 */

public class ShotActivityDetailAdapter extends BaseAdapter {


    private Context context;
    private int groupId;
    private long[] completedTime;
    private char[] completeNum;
    private double[] averageSpeed;
//    private int[] completedTimes;//规定时间内的完成次数
//    private List<Integer> finishTime;//每次完成所用时间

    public ShotActivityDetailAdapter(Context context,long[] completedTime,char[] completeNum,int groupId){
        this.context = context;
        this.completedTime=completedTime;
        this.completeNum=completeNum;
        this.groupId = groupId;
    }
    public ShotActivityDetailAdapter(Context context,long[] completedTime,char[] completeNum,double[] averageSpeed,int groupId){
        this.context = context;
        this.completedTime=completedTime;
        this.completeNum=completeNum;
        this.groupId = groupId;
        this.averageSpeed=averageSpeed;
    }



    //getCount决定了listview一共有多少个item
    @Override
    public int getCount() {

        return completeNum.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder ;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_single_double_jump2, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        //关于finishTime的逻辑写道这里
        holder.tvNum.setText(completeNum[position]+"");
        holder.tvTime.setText(completedTime[position]+"ms");
        holder.tvSpeed.setText(averageSpeed[position]+"m/s");
        return view;
    }

    class ViewHolder {
        private TextView tvTime;
        private  TextView tvNum;
        private TextView tvSpeed;

        public ViewHolder(View view){
            tvTime = (TextView) view.findViewById(R.id.tv_time);//次数
            tvNum = (TextView) view.findViewById(R.id.tv_num);//每次所用时间
            tvSpeed = (TextView) view.findViewById(R.id.tv_speed);
        }
    }

}
