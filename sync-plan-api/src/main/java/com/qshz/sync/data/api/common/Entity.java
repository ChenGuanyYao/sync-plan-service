package com.qshz.sync.data.api.common;

import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public enum Entity{


    mutual_plan(1),mutual_plan_service(2);

    private int entity = 0;
    private Entity(int entity){
        this.entity = entity;
    }

    private static final Map<String, Entity> nameIndex = Maps.newHashMapWithExpectedSize(Entity.values().length);
    static {
        for (Entity suit : Entity.values()) {
            nameIndex.put(suit.name(), suit);
        }
    }

    public int getEntity(){
        return  entity;
    }

    public static int getVaule(String name){
        if(StringUtils.isEmpty(name)){
            return 0;
        }
        Entity entity = nameIndex.get(name);
        if(entity != null){
            return Entity.valueOf(name).getEntity();
        }else{
            return 0;
        }
    }

}

 class RecordEnum {


    public static void main(String[] args) throws ParseException {
//       int i = Entity.valueOf("mutual_plan").getEntity();
//        System.out.println(i);
//        System.out.println(Entity.getVaule("mutual_plan11"));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse("2018-10-25 22:22:11");
        Date date2 = simpleDateFormat.parse("2018-10-25 22:22:12");
        System.out.println(date.compareTo(date2));
    }

}
