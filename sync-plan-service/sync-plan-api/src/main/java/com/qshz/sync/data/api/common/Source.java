package com.qshz.sync.data.api.common;

import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

/**
 * 0 : 默认值
 * 1 : mutual_vip_record
 * 2 : mutual_red_package_records
 * 3 : enterprise_records
 * 4 : buy_ebao_give_plan
 * 5 : family_buckets
 * 6 : plan_rewards_gift
 * 7 : chenqiang_give
 * 8 : chicken_box_gift
 * 9 : activity_give_gift
 * 10 : mutual_plan_event
 * 11 : mutual_vip_order
 * 12 : pull_new_gift
 * 13 : gift
 * 14 : mutual_plan_transform
 * 15 : order
 * 16 : boundpay
 * 17 : two_year_gift
 * 18 : gold_member_gift
 * 19 : record
 */
public enum Source {
    mutual_vip_record(1),
    mutual_red_package_records(2),
    enterprise_records(3),
    buy_ebao_give_plan(4),
    family_buckets(5),
    plan_rewards_gift(6),
    chenqiang_give(7),
    chicken_box_gift(8),
    activity_give_gift(9),
    mutual_plan_event(10),
    mutual_vip_order(11),
    pull_new_gift(12),
    gift(13),
    mutual_plan_transform(14),
    order(15),
    boundpay(16),
    two_year_gift(17),
    gold_member_gift(18),
    record(19);
    private int source;
    private Source(int source){
        this.source = source;
    }

    public int getSource(){
        return  source;
    }
    //初始化枚举，防止直接valueOf报错
    private static final Map<String, Source> nameIndex = Maps.newHashMapWithExpectedSize(Source.values().length);
    static {
        for (Source suit : Source.values()) {
            nameIndex.put(suit.name(), suit);
        }
    }

    public static int getVaule(String name){
        if(StringUtils.isEmpty(name)){
            return 0;
        }
        Source source = nameIndex.get(name);
        if(source != null){
            return Source.valueOf(name).getSource();
        }else{
            return 0;
        }
    }

}
