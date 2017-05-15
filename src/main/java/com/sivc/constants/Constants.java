package com.sivc.constants;


/**
 * Constant values used throughout the application.
 *
 */
public final class Constants {



    private Constants() {
        // hide me
    }
    //~ Static fields/initializers =============================================

    public static final String DATE_FORMAT = "MM/dd/yyyy";
    /**
     * The Alphabet number for search query
     */
    public static final String ALPHABET_SEARCH_PREFIX = "^$^";
    /**
     * The name of the ResourceBundle used in this application
     */
    public static final String BUNDLE_KEY = "ApplicationResources";

    /**
     * File separator from System properties
     */
    public static final String FILE_SEP = System.getProperty("file.separator");

    /**
     * User home from System properties
     */
    public static final String USER_HOME = System.getProperty("user.home") + FILE_SEP;

    /**
     * The name of the configuration hashmap stored in application scope.
     */
    public static final String CONFIG = "appConfig";

    /**
     * Session scope attribute that holds the locale set by the user. By setting this key
     * to the same one that Struts uses, we get synchronization in Struts w/o having
     * to do extra work or have two session-level variables.
     */
    public static final String PREFERRED_LOCALE_KEY = "org.apache.struts2.action.LOCALE";

    /**
     * The request scope attribute that holds the list form
     */
    public static final String LIST_MODEL_KEY = "items";

    /**
     * The request scope attribute that holds the form
     */
    public static final String FORM_MODEL_KEY = "item";


    /**
     * The name of the Administrator role, as specified in web.xml
     */
    public static final String ADMIN_ROLE = "ADMIN";

    public static final String SUPPORT_ROLE = "SUPPORT";


    /**
     * The name of the user's role list, a request-scoped attribute
     * when adding/editing a user.
     */
    public static final String USER_ROLES = "userRoles";

    public static final Integer MIN_PERFORMANCE = 3;

    public static final Integer BONUS = 500000;

    /**
     * The name of the available roles list, a request-scoped attribute
     * when adding/editing a user.
     */
    public static final String AVAILABLE_ROLES = "availableRoles";

    /**
     * The name of the CSS Theme setting.
     */
    public static final String CSS_THEME = "csstheme";

    /**
     * Sort direction constants
     */
    public static final String SORT_ASC = "2";
    public static final String SORT_DESC = "1";

    /**
     * Acegi security constants
     */

    public static final String ACEGI_SECURITY_FORM_USERNAME_KEY = "j_username";
    public static final String ACEGI_SECURITY_FORM_PASSWORD_KEY = "j_password";

    public static final String ACEGI_SECURITY_LAST_USERNAME_KEY = "ACEGI_SECURITY_LAST_USERNAME";

    /**
     * Crudaction
     */
    public static final String ACTION_DELETE = "delete";
    public static final String ACTION_SEARCH = "search";
    public static final String ACTION_INSERT_UPDATE = "insert-update";
    public static final String ACTION_IMPORT = "import";
    public static final String ACTION_EXPORT = "export";

    public static final String MESSAGE_RESPONSE_MODEL_KEY = "messageResponse";

    /**
     * Audit status
     */
    public static final int AUDIT_FINISHED = 0;
    public static final int AUDIT_NOT_YET = 1;

    /**
     * Brand Group
     */
    public static final String BRAND_GROUP_IFT = "IFT";
    public static final String BRAND_GROUP_DBB = "DBB";

    /**
     * Outlet brand
     */
    public static final String FRISO = "FRISO";
    public static final String DLITF = "DLIFT";
    public static final String DBB = "SD_DBB";

       /*
       elearning
        */

    public static final String ASSIGNMENT_LIST_STATUS_NOT_START = "Chưa nộp bài";
    public static final String ASSIGNMENT_LIST_STATUS_IN_PROGRESS = "Đang làm";
    public static final String ASSIGNMENT_LIST_STATUS_NEED_GRADING = "Cần chấm điểm";
    public static final String ASSIGNMENT_LIST_STATUS_GRADED = "Đã chấm";


    // re-audit
    public static final int RE_AUDIT_NO_FACINGS = 5;

    public static final int RE_AUDIT_GPS_DISTANCE = 1000; //meter

    /**
     * Outlet Active status
     */
    public static final int OUTLET_STATUS_ACTIVE = 1;
    public static final int OUTLET_STATUS_CLOSED = 2;
    public static final int OUTLET_STATUS_CHANGE_BUSINESS = 3;
    public static final int OUTLET_STATUS_NOT_FOUND = 4;
    public static final int OUTLET_STATUS_REFUSE_AUDIT = 5;
    public static final int OUTLET_STATUS_NO_FACING = 6;
    public static final int OUTLET_STATUS_NO_SELL = 7;


    public static final int MAX_JSON_ITEM = 20;


    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_GT = "GT";
    public static final String ROLE_MT = "MT";
    public static final String ROLE_MODERATOR = "MODERATOR";
    public static final String ROLE_RESPONDENT = "RESPONDENT";
    public static final String ROLE_INSTRUCTOR = "INSTRUCTOR";
    public static final String ROLE_DISTRIBUTOR = "DISTRIBUTOR";
    public static final String ROLE_ASM = "ASM";
    public static final String ROLE_SE = "SE";
    public static final String ROLE_RSM = "RSM";
    public static final String ROLE_NSM = "NSM";
    public static final String ROLE_AUDITOR = "AUDITOR";
    public static final String ROLE_SM = "SM";
    public static final String ROLE_NW = "NW";


    /**
     * Utils
     */
    public static final String COMMA_SEP = ",";

    /**
     * Assessment
     */

    public static final Integer SAVE = 1;
    public static final Integer SUBMITTED = 2;
    public static final Integer APPROVE = 3;
    public static final Integer REJECT = 4;


    public static final int ACTION_PLAN_STATUS_ON_TIME = 0;
    public static final int ACTION_PLAN_STATUS_NOT_ON_TIME = 1;
    public static final int ACTION_PLAN_STATUS_MATCH_SCORE = 2;
    public static final int ACTION_PLAN_STATUS_NOT_MATCH_SCORE = 3;
    public static final int ACTION_PLAN_STATUS_NOT_COMPLETED = 4;

    public static final String DISTRIBUTOR_LEVEL_LOGISTIC_NAME = "Logistic";
    public static final String DISTRIBUTOR_LEVEL_STRATEGIC_NAME = "Strategic";
    public static final String DISTRIBUTOR_LEVEL_VALUE_ADDED_NAME = "ValueAdded";

    public static final String FCV_EMAIL_DOMAIN = "@frieslandcampina.com";
    public static final String FCV_PASSWORD_DEFAULT = "123456";
    public static final Integer FCV_USER_ACTIVE = 1;

    public static final String FCV_DAY_OF_FIELD_STANDARD_CODE = "SNF";

    public static final int FCV_WEEKEND_OFF_DAY_ON_SUN = 1;
    public static final int FCV_WEEKEND_OFF_DAY_ON_MON = 2;
    public static final int FCV_WEEKEND_OFF_DAY_ON_TUE = 3;
    public static final int FCV_WEEKEND_OFF_DAY_ON_WED = 4;
    public static final int FCV_WEEKEND_OFF_DAY_ON_THU = 5;
    public static final int FCV_WEEKEND_OFF_DAY_ON_FRI = 6;
    public static final int FCV_WEEKEND_OFF_DAY_ON_SAT = 7;


    //DCDT Distributor Capacity Plan :
    public static final Integer DCP_SE_WRAP = 1;
    public static final Integer DCP_SE_CONFIRMED = 2;
    public static final Integer DCP_ASM_WRAP = 7;
    public static final Integer DCP_ASM_CONFIRM = 9;
    public static final Integer DCP_ASM_APPROVE = 5;
    public static final Integer DCP_ASM_REJECT = 4;
    public static final Integer DCP_RSM_WRAP = 8;
    public static final Integer DCP_RSM_CONFIRM = 10;
    public static final Integer DCP_RSM_APPROVE = 3;
    public static final Integer DCP_RSM_REJECT = 6;
    public static final String DCP_NAME_YEAR = "Kế Hoạch Phát Triển Năng Lực NPP Năm ";


    public static final Integer AC_DRAFT = 0;
    public static final Integer AC_SENT = 1;
    public static final Integer AC_ASM_REJECTED = 5;
    public static final Integer AC_ASM_APPROVED = 10;
    public static final Integer AC_RSM_REJECTED = 7;
    public static final Integer AC_RSM_APPROVED = 20;


    public static final Integer DISTRIBUTOR_LEVEL_LOGISTIC_ID = 1;
    public static final Integer DISTRIBUTOR_LEVEL_VALUE_ADDED_ID = 2;
    public static final Integer DISTRIBUTOR_LEVEL_STRATEGIC_ID = 3;

    public static final String DISTRIBUTOR_PERFORMANCE_ATTRIBUTE_KEY = "DISTRIBUTOR_PERFORMANCE_ATTRIBUTE_KEY";
    public static final String REPORT4S_ATTRIBUTE_KEY = "REPORT4S_ATTRIBUTE_KEY";

    public static final String TEMP_WORKING_PLAN_FINAL_DETAIL_LIST = "TEMP_WORKING_PLAN_FINAL_DETAIL_LIST";
    public static final String ACTION_ON_SESSION_STORED_LIST_INSERT = "INSERT";
    public static final String ACTION_ON_SESSION_STORED_LIST_UPDATE = "UPDATE";
    public static final String ACTION_ON_SESSION_STORED_LIST_DELETE = "DELETE";

    // Working Plan
    public static final Integer WORKING_PLAN_REGISTERED = 0;
    public static final Integer WORKING_PLAN_ACTUAL = 1;

    public static final Integer WORKING_PLAN_GROUPBY_USER = 0;
    public static final Integer WORKING_PLAN_GROUPBY_MONTH = 1;

    public static final Integer WORKING_PLAN_BASEDON_STANDARDFW = 0;
    public static final Integer WORKING_PLAN_BASEDON_ACTUALFW = 1;

    public static final String ALL = "ALL";
    public static final String NATION_WIDE = "Nation Wide (NW)";

    // for report display on table.
    public static final String IS_LIVE_MANAGER_SUMMARY="IS_LIVE_MANAGER_SUMMARY";
    public static final String STAFF_NAME="STAFF_NAME";
    public static final String STAFF_ID="STAFF_ID";

    public static final String NUMBER_OF_WORKING_TRUTH_DAYS_OF_LAST_MONTH="NUMBER_OF_WORKING_TRUTH_DAYS_OF_LAST_MONTH";
    public static final String NUMBER_OF_FIELD_DAYS_OF_LAST_MONTH="NUMBER_OF_FIELD_DAYS_OF_LAST_MONTH";
    public static final String FIELD_STANDARDIZED_USERS_PERCENT_OF_LAST_MONTH ="FIELD_STANDARDIZED_USERS_PERCENT_OF_LAST_MONTH";
    public static final String NUMBER_OF_OTHER_WORKING_DAYS_OF_LAST_MONTH="NUMBER_OF_OTHER_WORKING_DAYS_OF_LAST_MONTH";

    public static final String NUMBER_OF_REAL_FIELD_DAYS_OF_LAST_MONTH="NUMBER_OF_REAL_FIELD_DAYS_OF_LAST_MONTH";
    public static final String REAL_FIELD_STANDARDIZED_USERS_PERCENT_OF_LAST_MONTH ="REAL_FIELD_STANDARDIZED_USERS_PERCENT_OF_LAST_MONTH";
    public static final String NUMBER_OF_CHANGE_DAYS_OF_LAST_MONTH ="NUMBER_OF_CHANGE_DAYS_OF_LAST_MONTH";
    public static final String CHANGE_PLANS_PERCENTAGE_OF_LAST_MONTH ="CHANGE_PERCENTAGE";

    public static final String NUMBER_OF_WORKING_TRUTH_DAYS_OF_CURRENT_MONTH ="NUMBER_OF_WORKING_TRUTH_DAYS_OF_CURRENT_MONTH";
    public static final String NUMBER_OF_FIELD_DAYS_OF_CURRENT_MONTH="NUMBER_OF_FIELD_DAYS_OF_CURRENT_MONTH";
    public static final String FIELD_STANDARDIZED_USERS_PERCENT_OF_CURRENT_MONTH ="FIELD_STANDARDIZED_USERS_PERCENT_OF_CURRENT_MONTH";
    public static final String NUMBER_OF_OTHER_WORKING_DAYS_OF_CURRENT_MONTH="NUMBER_OF_OTHER_WORKING_DAYS_OF_CURRENT_MONTH";

    public static final String NUMBER_OF_TRUTH_WORKING_DAYS_PERCENT_OF_LAST_MONTH="NUMBER_OF_TRUTH_WORKING_DAYS_PERCENT_OF_LAST_MONTH";
    public static final String NUMBER_OF_FIELD_DAYS_PERCENT_OF_LAST_MONTH="NUMBER_OF_FIELD_DAYS_PERCENT_OF_LAST_MONTH";
    public static final String NUMBER_OF_PLANNED_WORKING_DAYS_PERCENT_OF_LAST_MONTH="NUMBER_OF_PLANNED_WORKING_DAYS_PERCENT_OF_LAST_MONTH";
    public static final String NUMBER_OF_OTHER_WORKING_DAYS_PERCENT_OF_LAST_MONTH="NUMBER_OF_OTHER_WORKING_DAYS_PERCENT_OF_LAST_MONTH";
    public static final String NUMBER_OF_REAL_FIELD_DAYS_PERCENT_OF_LAST_MONTH="NUMBER_OF_REAL_FIELD_DAYS_PERCENT_OF_LAST_MONTH";
    public static final String NUMBER_OF_REAL_STANDARDIZED_FIELD_USERS_OF_LAST_MONTH="NUMBER_OF_REAL_STANDARDIZED_FIELD_USERS_OF_LAST_MONTH";
    public static final String NUMBER_OF_CHANGED_REAL_DAYS_PERCENT_OF_LAST_MONTH="NUMBER_OF_CHANGED_REAL_DAYS_PERCENT_OF_LAST_MONTH";
    public static final String NUMBER_OF_CHANGED_REAL_PLANS_PERCENT_OF_LAST_MONTH="NUMBER_OF_CHANGED_REAL_PLANS_PERCENT_OF_LAST_MONTH";
    public static final String NUMBER_OF_TRUTH_WORKING_DAYS_PERCENT_OF_CURRENT_MONTH="NUMBER_OF_TRUTH_WORKING_DAYS_PERCENT_OF_CURRENT_MONTH";
    public static final String NUMBER_OF_PLANNED_FIELD_DAYS_PERCENT_OF_CURRENT_MONTH="NUMBER_OF_PLANNED_FIELD_DAYS_PERCENT_OF_CURRENT_MONTH";
    public static final String NUMBER_OF_STANDARDIZED_USERS_PERCENT_OF_CURRENT_MONTH="NUMBER_OF_STANDARDIZED_USERS_PERCENT_OF_CURRENT_MONTH";
    public static final String NUMBER_OF_OTHER_WORKING_DAYS_PERCENT_OF_CURRENT_MONTH="NUMBER_OF_OTHER_WORKING_DAYS_PERCENT_OF_CURRENT_MONTH";

    public static final String REPORT_ITEM_DISPLAY="REPORT_ITEM_DISPLAY";

    public static final String special_ScoreCardKPI_ROI = "% ROI";
    public static final String special_ScoreCardKPI_WTD = "WTD of power SKUs (pts)";

    public static final String special_ScoreCardKPI_ATTRITION = "% SM Attrition rate";
    public static final String special_ScoreCardKPI_NOSE = "# SE";
    public static final String special_ScoreCardKPI_NOSM = "# NVBH";
    public static final String special_ScoreCardKPICat_SOV = "Sales Out Volume";
    public static final String special_ScoreCardKPICat_SIP = "Superior Instore Presence";

    public static final Integer SCORECARD_YEAR_SE_SUBMITTED = 1;
    public static final Integer SCORECARD_YEAR_ASM_APPROVED = 3;
    public static final Integer SCORECARD_YEAR_RSM_APPROVED = 5;
    public static final Integer SCORECARD_YEAR_ASM_REJECTED = 2;
    public static final Integer SCORECARD_YEAR_RSM_REJECTED = 4;
    public static final Integer SCORECARD_YEAR_SE_DRAFT = 6;
    public static final Integer SCORECARD_NOT_SEND = 0; // 4 submission report filter


    public static final String SCORECARD_SUMMARY_TYPE_SUM = "sum";
    public static final String SCORECARD_SUMMARY_TYPE_AVERAGE = "average";
    public static final String SCORECARD_VIEW_TYPE_YEAR = "year";
    public static final String SCORECARD_VIEW_TYPE_MONTH = "month";





    public static final String Attribute4S_S1 = "S1";
    public static final String Attribute4S_POSITION_S1 = "6";
    public static final String Attribute4S_S2 = "S2";
    public static final String Attribute4S_POSITION_S2 = "7";
    public static final String Attribute4S_S3 = "S3";
    public static final String Attribute4S_POSITION_S3 = "9";
    public static final String Attribute4S_S4 = "S4";
    public static final String Attribute4S_POSITION_S4 = "8";

    public static final Integer E_LEARNING_ASSIGNMENT_INSTANCE_PAUSE = 1;
    public static final Integer E_LEARNING_ASSIGNMENT_INSTANCE_IN_PROGRESS = 2;
    public static final Integer E_LEARNING_ASSIGNMENT_INSTANCE_SUBMITTED = 3;
    public static final Integer E_LEARNING_ASSIGNMENT_INSTANCE_GRADED = 4;

    public static final Integer E_LEARNING_CLASS_ROSTER_OPENING= 1;
    public static final Integer E_LEARNING_CLASS_ROSTER_CLOSED= 2;


    public static final String  E_LEARNING_PREFIX_ANSWER = "a";

    public static final String  E_LEARNING_VIEW_RESOURCE_FROM_CURRICULUM = "CURRICULUM";

    public static final String  E_LEARNING_VIEW_RESOURCE_FROM_ASSIGNMENT = "ASSIGNMENT";



    public static final String  QUESTION_TYPE_NAME_MC = "MC";
    public static final String QUESTION_TYPE_NAME_MSC = "MSC";
    public static final String QUESTION_TYPE_NAME_GR = "GR";
    public static final String QUESTION_TYPE_NAME_SA = "SA";
    public static final String QUESTION_TYPE_NAME_MR = "MR";
    public static final String QUESTION_TYPE_NAME_TS = "TS";
    public static final String QUESTION_TYPE_NAME_TSO = "TSO";
    public static final String QUESTION_TYPE_NAME_TSE = "TSE";

    public static final Integer STUDENT_ASSIGNMENT_STATUS_NOT_START = 0;
    public static final Integer STUDENT_ASSIGNMENT_STATUS_IN_PROGRESS = 1;
    public static final Integer STUDENT_ASSIGNMENT_STATUS_SUBMITTED = 2;
    public static final Integer STUDENT_ASSIGNMENT_STATUS_GRADED = 3;
    public static final Integer STUDENT_ASSIGNMENT_STATUS_EXPIRE = 3;


    public static final String SESSION_START_TIME = "session_startTime";
    public static final String E_LEARNING_ASSESSMENT_CATEGORY_EXAMPLE = "EXAMPLE";   // code of single question

    public static final String  WORKINGPLAN_ALLOW_EDIT = "AHC";
    public static final String  WORKINGPLAN_ALLOW_UPDATE = "CNN";

    public static final String E_LEARNING_ASSESSMENT_CATEGORY_CUSTOM_TEST_CODE = "QP";
    public static final String E_LEARNING_ASSESSMENT_CATEGORY_CUSTOM_TEST_NAME = "Nhóm bài tập tự khởi tạo";

    public static final String E_LEARNING_RESOURCE_CATEGORY_CUSTOM_TEST_CODE = "QP";
    public static final String E_LEARNING_RESOURCE_CATEGORY_CUSTOM_TEST_NAME = "Nhóm tài nguyên tự khởi tạo";

    public static final Float ELEARNING_QUESTIONTYPE_MC_MAXSCORE = Float.parseFloat("10");
    public static final Float ELEARNING_QUESTIONTYPE_SA_MAXSCORE = Float.parseFloat("20");

    public static final Boolean ELEARING_QUESTIONTYPE_MC_AUTOSCORE = true;
    public static final Boolean ELEARING_QUESTIONTYPE_SA_AUTOSCORE = false;


    public static final String ZIP_FILE_TEMP = "D:\\workspace\\FCV\\web\\src\\main\\webapp\\content\\temp\\";
    public static final String ZIP_FILE_EXTRACT = "D:\\workspace\\FCV\\web\\src\\main\\webapp\\content\\";

    public static final String VIEW_FROM_CURRICULUM = "CURRICULUM";

    public static final String SCORECARD_KPI_EVALUATION_SUM = "SUM";
    public static final String SCORECARD_KPI_EVALUATION_AVERAGE = "AVERAGE";
    public static final String SCORECARD_KPI_EVALUATION_INCREASE = "INCREASE";

    public static final String SCORECARD_KPI_COMPARE_LESS = "LESS";
    public static final String SCORECARD_KPI_COMPARE_GREATER = "GREATER";

    public static final String REPORT_DISTRIBUTOR_ASSESSMENT = "REPORT_DISTRIBUTOR_ASSESSMENT";
    public static final String REPORT_SCORECARD = "REPORT_SCORECARD";
    public static final String REPORT_WORKING_PLAN = "REPORT_WORKING_PLAN";
    public static final String REPORT_E_LEARNING = "REPORT_E_LEARNING";
    public static final String REPORT = "REPORT";


    /**
     * Created with IntelliJ IDEA.
     * User: viennh
     * Date: 8/28/13
     * Time: 4:42 PM
     * To change this template use File | Settings | File Templates.
     */
    public static enum AsignmentSettingEnum {
        ASS_ST1("dcdt.assessment.status1"),
        ASS_ST2("dcdt.assessment.status2");


        private  Integer value;
        private String key;
        private AsignmentSettingEnum(String key) {
            this.key = key;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }
}