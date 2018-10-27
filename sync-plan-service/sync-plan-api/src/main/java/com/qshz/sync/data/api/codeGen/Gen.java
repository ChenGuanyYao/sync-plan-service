package com.qshz.sync.data.api.codeGen;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author dashan
 * @date 2018/10/11 下午5:40
 */
public class Gen {

    public static void main(String[] args) {
        String packageName = "com.qsc.plan";
        String dirPath ="";

        //"mutual_users","mutual_plan_publicity_version","mutual_plan_events","mutual_plan_pre_deductions","mutual_plan_records","mutual_vip_records","mutual_plan_publicity","mutual_plans"
        generateByTables(dirPath, packageName,"mutual_plan_trades");
    }

    private static void generateByTables(String dirPath, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://rm-bp1y256043o82d4wa.mysql.rds.aliyuncs.com:3306/health?tinyInt1isBit=false";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL).setUrl(dbUrl).
                setUsername("test_order").
                setPassword("61NNT9RJSLwGelGy").
                setDriverName("com.mysql.jdbc.Driver");

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)
                .setRestControllerStyle(true)
                .setEntityLombokModel(false)
//                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .entityTableFieldAnnotationEnable(true)
                .setInclude(tableNames);

        config.setActiveRecord(false)
                .setAuthor("zxx")
                .setOutputDir("/Users/zxx/code")
                .setFileOverride(true)
                .setBaseColumnList(true)
                .setBaseResultMap(true)
                .setOpen(true);

        boolean serviceNameStartWithI = false;
        if ( !serviceNameStartWithI ) {
            config.setServiceName("%sService");
        }
        new AutoGenerator().setGlobalConfig(config).setDataSource(dataSourceConfig).setStrategy(strategyConfig)
                .setPackageInfo(new PackageConfig().setParent(packageName)
                        .setController("controller")
                        .setEntity("entity")).execute();
    }



}
