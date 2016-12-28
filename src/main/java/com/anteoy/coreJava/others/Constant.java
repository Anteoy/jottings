package com.anteoy.coreJava.others;

/**
 * @author zhao
 * @date 2016/12/1
 */

public interface Constant {


    /********************************************* url*** ********************************************/

    // yimei
    String URL_YIMEI_LOAN_INFO = "/loan/info";                                                  //信贷综合信息查询

    // bairong
    String URL_BAIRONG_COURT_EXECUTEDPEOPLE_B = "/court/executedPeopleB";                       //法院被执行人（B机构）

    // kuaixin
    String URL_KUAIXIN_BLACKLIST_AUDIT = "/blacklist/audit";                                    //黑名单验证


    /****************************************** interface ********************************************/

    // yimei
    String INTERFACE_YIMEI_LOAN_INFO = "yimei_loan_info";                                       //信贷综合信息查询

    // bairong
    String INTERFACE_BAIRONG_COURT_EXECUTEDPEOPLE_B = "bairong_court_executedpeople_b";         //法院被执行人（B机构）

    // kuaixin
    String INTERFACE_KUAIXIN_BLACKLIST_AUDIT = "kuaixin_blacklist_audit";                       //黑名单验证




    /****************************************** collection ********************************************/

    // yimei
    String MONGO_YIMEI_LOAN_INFO = "yimei_loan_info";                                               //信贷综合信息查询

    // bairong
    String MONGO_BAIRONG_COURT_EXECUTEDPEOPLE_B = "bairong_court_executed_people";                  //法院被执行人（B机构）

    // kuaixin
    String MONGO_KUAIXIN_BLACKLIST_AUDIT = "kuaixin_blacklist_audit";                               //黑名单验证





    /****************************************** mysql ********************************************/

    // yimei
    String MYSQL_YIMEI_LOAN_INFO = "yimei_loan_info_logs";                                          //信贷综合信息查询

    // bairong
    String MYSQL_BAIRONG_COURT_EXECUTEDPEOPLE_B = "bairong_court_executed_people_b_logs";           //法院被执行人（B机构）

    // kuaixin
    String MYSQL_KUAIXIN_BLACKLIST_AUDIT = "kuaixin_blacklist_audit_logs";                          //黑名单验证



    /****************************************** 时间戳 ********************************************/

    Long TIMESTAMP_ONE_SECOND = 1000L;                                                                  // 1秒
    Long TIMESTAMP_ONE_MINUTE = 60 * 1000L;                                                             // 1分钟
    Long TIMESTAMP_THIRTY_MINUTE = 30 * 60 * 1000L;                                                     // 30分钟
    Long TIMESTAMP_ONE_HOUR = 60 * 60 * 1000L;                                                          // 1小时
    Long TIMESTAMP_ONEDOTFIVE_HOUR = 90 * 60 * 1000L;                                                   // 1.5小时
    Long TIMESTAMP_TWO_HOUR = 2 * 60 * 60 * 1000L;                                                      // 2小时
    Long TIMESTAMP_TWENTYTHREE_HOUR = 23 * 60 * 60 * 1000L;                                             // 23小时
    Long TIMESTAMP_ONE_DAY = 24 * 60 * 60 * 1000L;                                                      // 1天
    Long TIMESTAMP_TWO_MONTH = 60 * 24 * 60 * 60 * 1000L;                                               // 两个月







}
