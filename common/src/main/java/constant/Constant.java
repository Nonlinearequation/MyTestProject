package constant;


/**
 * @Author: 邓彬
 * @Date: 2020/9/11
 * Manage模块的常量类
 */
public class Constant {
    /**
     * 分隔符英文的横杠
     */
    public static final String CROSS_BAR_CHARACTER = "-";
    /**
     * 英文的 .
     */
    public static final String POINT_BAR_CHARACTER = ".";
    /**
     * 英文的 ！
     */
    public static final String EXCLAMATION_MARK_CHARACTER = "!";
    /**
     * 英文的 /
     */
    public static final String SLASH_MARK_CHARACTER = "/";
    /**
     * 英文的 :
     */
    public static final String COLON_CHARACTER = ":";

    /**
     * 英文的 ;
     */
    public static final String SEMICOLON_CHARACTER = ";";

    /**
     * 英文的短下划线
     */
    public static final String UNDERLINE_SHORT_CHARACTER = "_";
    /**
     * 英文的逗号
     */
    public static final String COMMA_CHARACTER = ",";
    /**
     * 一个空格
     */
    public static final String ONE_SPACE = " ";
    /**
     * 返回的默认结果集
     */
    public static final String RESULT_FAIL = null;
    /**
     * 当前页码
     */
    public static final String PAGE = "page";
    /**
     * 每页显示记录数
     */
    public static final String LIMIT = "limit";
    /**
     * 排序字段
     */
    public static final String ORDER_FIELD = "sidx";
    /**
     * 排序方式
     */
    public static final String ORDER = "order";
    /**
     * 升序
     */
    public static final String ASC = "asc";

    /**
     * 删除
     */
    public static final String DELETE = "delete";

    /**
     * 暂停
     */
    public static final String PAUSE = "pause";

    /**
     * 发布
     */
    public static final String RELEASE = "release";
    /**
     * true
     */
    public static final boolean TRUE = true;
    /**
     * false
     */
    public static final boolean FALSE = false;

    /**
     * ID
     */
    public static final String ID = "id";

    /**
     * ENABLE_FLAG
     */
    public static final String ENABLE_FLAG = "enable_flag";

    /**
     * CREATE_TIME
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * PAGE_INDEX
     */
    public static final String PAGE_INDEX = "pageIndex";

    /**
     * PAGE_SIZE
     */
    public static final String PAGE_SIZE = "pageSize";
    /**
     * SIZE
     */
    public static final String SIZE = "size";

    /**
     * 默认页码 第1页
     */
    public static final Integer DEFAULT_PAGE_INDEX = 1;

    /**
     * 默认每页展示数量 10条
     */
    public static final int DEFAULT_PAGE_SIZE = 10;

    /**
     * 每页最大数量
     */
    public static final int MAX_PAGE_SIZE = 100;

    /**
     * 数字10
     */
    public static final int TEN_NUMBER = 10;

    /**
     * 数字20
     */
    public static final int TWENTY_NUMBER = 20;
    /**
     * 数字30
     */
    public static final int THIRTY_NUMBER = 30;

    /**
     * 数字40
     */
    public static final int FORTY_NUMBER = 40;
    /**
     * 统一返回data的key
     */
    public static final String RESULT_CHARACTER = "result";
    /**
     * 首页页面的总览图 REDIS-KEY
     */
    public static final String HOME_PAGE_STRUCT = "home_struct";
    /**
     * 首页页面的背景图 REDIS-KEY
     */
    public static final String HOME_PAGE_BACKGROUND = "home_background";
    /**
     * 首页页面的轮播Banner  REDIS-KEY
     */
    public static final String HOME_PAGE_FLOW_BANNER = "home_flow-banner";
    /**
     * 首页页面的热点广告位  REDIS-KEY
     */
    public static final String HOME_PAGE_HOT_AD = "home_hot_ad";
    /**
     * 首页页面的Metro  REDIS-KEY
     */
    public static final String HOME_PAGE_METRO = "home_metro";
    /**
     * 首页页面的切分banner  REDIS-KEY
     */
    public static final String HOME_PAGE_SPLIT_BANNER = "home_split_banner";
    /**
     * 首页页面的专题广告位  REDIS-KEY
     */
    public static final String HOME_PAGE_SPECIAL_AD = "home_special_ad";
    /**
     * 首页页面的快报  REDIS-KEY
     */
    public static final String HOME_PAGE_LETTERS = "home_letters";
    /**
     * 首页页面的推荐  REDIS-KEY
     */
    public static final String HOME_PAGE_RECOMMEND = "home_recommend";
    /**
     * 首页页面的floating  REDIS-KEY
     */
    public static final String HOME_PAGE_FLOATING = "home_floating";
    /**
     * 首页页面的navigation  REDIS-KEY
     */
    public static final String HOME_PAGE_NAVIGATION = "home_navigation";
    /**
     * 首页页面的navigation  REDIS-KEY
     */
    public static final String HOME_PAGE_NAVIGATION_ACTIVITY = "home_navigation_activity";
    /**
     * 首页页面的tab  REDIS-KEY
     */
    public static final String HOME_PAGE_TAB = "home_tab";
    /**
     * 支付时效-根据订单类型设置-前缀 REDIS-KEY
     */
    public static final String PAY_EFFECTIVETIME_ORDER_PREFIX = "pay:effectivetime:order";
    /**
     * 保存标识
     */
    public static final String SAVE = "save";
    /**
     * 修改标识
     */
    public static final String UPDATE = "update";
    /**
     * 查询标识
     */
    public static final String QUERY = "query";
    /**
     * 列表标识
     */
    public static final String LIST = "list";
    /**
     * 编辑标识
     */
    public static final String EDITOR = "editor";
    /**
     * 首页弹窗 REDIS-KEY
     */
    public static final String HOME_PAGE_POPUP = "home_popup";

    /**
     * 默认空字符串
     */
    public static final String EMPTY_STRING = "";
    /**
     * 编辑标识 常量
     */
    public static final int TEN = 10;

    /**
     * 背景图
     */
    public static final String BACKGROUND = "background";
    /**
     * 轮播banner
     */
    public static final String FLOW_BANNER = "flowBanner";
    /**
     * 楼层
     */
    public static final String HOME_PAGE_RECOMMEND_INFO = "homePageRecommend";
    /**
     * floating
     */
    public static final String FLOATING = "floating";
    /**
     * 首页弹窗
     */
    public static final String HOME_POPUP = "homePopup";
    /**
     * 分类tab
     */
    public static final String TAB = "tab";
    /**
     * 热点广告位
     */
    public static final String HOT_ADVERTISEMENT = "hotAdvertisement";
    /**
     * Metro
     */
    public static final String METRO = "metro";
    /**
     * 导航栏
     */
    public static final String NAVIGATION = "navigation";

    public static final String NAVIGATION_HOME_PAGE = "首页";
    public static final String NAVIGATION_CLASSIFY_PAGE = "分类";
    public static final String NAVIGATION_CART_PAGE = "购物车";
    public static final String NAVIGATION_MINE_PAGE = "我的";
    public static final String NAVIGATION_COMMUNITY_PAGE = "社区";
    public static final String NAVIGATION_HOME_TYPE = "10";
    public static final String NAVIGATION_CLASSIFY_TYPE = "20";
    public static final String NAVIGATION_CART_TYPE = "30";
    public static final String NAVIGATION_MINE_TYPE = "40";
    public static final String NAVIGATION_COMMUNITY_TYPE = "50";


    /**
     * 导航栏-key
     */
    public static final String NAVIGATION_CHARACTER_FOR_REDIS_KEY = "navigation";
    /**
     * 专题广告位
     */
    public static final String SPECIAL_ADVERTISEMENT = "specialAdvertisement";
    /**
     * 切分banner
     */
    public static final String SPLIT_BANNER = "splitBanner";
    /**
     * 用户默认等级
     */
    public static final String USER_GRADE_NAME = "游客";
    /**
     * 所有的用户类型
     */
    public static final String USER_TYPE_ALL = "10";
    /**
     * 用户类型
     */
    public static final String USER_TYPE = "userType";
    /**
     * Flag
     */
    public static final String FLAG = "flag";
    /**
     * redisKey-活动关键字
     */
    public static final String ACTIVITY_CHARACTER_FOR_REDIS_KEY = "activity";

    /**
     * redis中活动的秒杀活动字段
     */
    public static final String SECKILL_ACTIVITY_CHARACTER_FOR_REDIS = "seckill";

    /**
     * redis中活动的直降活动字段
     */
    public static final String FALL_ACTIVITY_CHARACTER_FOR_REDIS = "fall";

    /**
     * redis中活动的拼团活动字段
     */
    public static final String GROUP_BUYING_ACTIVITY_CHARACTER_FOR_REDIS = "group_buying";

    /**
     * redis中活动的订金活动字段
     */
    public static final String ADVANCE_PURCHASE_ACTIVITY_CHARACTER_FOR_REDIS = "advance_purchase";
    /**
     * redis中活动的商户合作活动字段
     */
    public static final String BIZ_COOPERATION_ACTIVITY_CHARACTER_FOR_REDIS = "biz_cooperation";
    /**
     * redis中以旧换新key前缀
     */
    public static final String OLD_FOR_NEW_FOR_REDIS = "old_for_new";

    /**
     * redis中商品限购活动
     */
    public static final String PURCHASE_LIMIT_CHARACTER_FOR_REDIS = "purchase_limit";

    /**
     * redis中活动类型 - 10：秒杀 20：直降
     */
    public static final int SECKILL_ACTIVITY_NUM = 10;
    /**
     * redis中活动类型 - 10：秒杀 20：直降
     */
    public static final int FALL_ACTIVITY_NUM = 20;
    /**
     * redis中活动类型 - 10：秒杀 20：直降 30：付定金 40:商务合作 50: 以旧换新 60: 限购活动 70: 拼团活动 80:批量修改商品
     */
    public static final String SECKILL_ACTIVITY_CHARACTER = "10";
    public static final int SECKILL_ACTIVITY_CHARACTER_INT = 10;
    public static final String FALL_ACTIVITY_CHARACTER = "20";
    public static final int FALL_ACTIVITY_CHARACTER_INT = 20;
    public static final String ADVANCE_PURCHASE_ACTIVITY_CHARACTER = "30";
    public static final int ADVANCE_PURCHASE_ACTIVITY_CHARACTER_INT = 30;
    public static final String BIZ_COOPERATION_ACTIVITY_CHARACTER = "40";
    public static final String OLD_FOR_NEW_CHARACTER = "50";
    public static final String PURCHASE_LIMIT_CHARACTER = "60";
    public static final int PURCHASE_LIMIT_CHARACTER_INT = 60;
    public static final String GROUP_BUYING_ACTIVITY_CHARACTER = "70";
    public static final int GROUP_BUYING_ACTIVITY_CHARACTER_INT = 70;
    public static final String BATCH_UPDATE_CHARACTER = "80";
    public static final int BATCH_UPDATE_CHARACTER_INT = 80;
    /**
     * redis中活动类型 - 接上↑↑↑↑↑↑↑ 0普通订单
     */
    public static final String NO_ACTIVITY_CHARACTER = "0";
    public static final int NO_ACTIVITY_CHARACTER_INT = 0;
    /**
     * 不区分活动和普通订单（包含普通订单和活动订单）
     */
    public static final int ALL_CHARACTER_INT = 0;

    /**
     * 活动关键字分隔符
     */
    public static final String DELIMITER_CHARACTER_FOR_REDIS_KEY = "#";
    /**
     * 预付定金活动状态 20-开始
     */
    public static final String ADVANCE_ACTIVITY_STATUS_HAS_STARTED_CODE = "20";
    /**
     * 10-未开始;20-进行中;30-已停用;40已结束;-10: 无活动
     */
    public static final int ACTIVITY_STATUS_EMPTY_CODE = -10;
    public static final int ACTIVITY_STATUS_HAS_NOT_STARTED_CODE = 10;
    public static final int ACTIVITY_STATUS_PROCESSING_CODE = 20;
    public static final int ACTIVITY_STATUS_STOP_USING_CODE = 30;
    public static final int ACTIVITY_STATUS_TERMINATED_CODE = 40;
    /**
     * 活动状态-字符
     */
    public static final String ACTIVITY_STATUS_HAS_NOT_STARTED_CHARACTER = "未开始";
    public static final String ACTIVITY_STATUS_PROCESSING_CHARACTER = "进行中";
    public static final String ACTIVITY_STATUS_STOP_USING_CHARACTER = "已停用";
    public static final String ACTIVITY_STATUS_TERMINATED_CHARACTER = "已结束";
    /**
     * EOC广告位置字符
     */
    public static final String ADVERTISEMENT_LOGIN_PAGE_CHARACTER = "登录页";
    /**
     * 活动是否限制用户 10-限制 20-不限制
     */
    public static final int ACTIVITY_LIMIT_USER_CODE = 10;
    /**
     * 活动是否限制用户 10-限制 20-不限制
     */
    public static final int ACTIVITY_UNLIMIT_USER_CODE = 20;

    /**
     * 是否可用 10-可用 20-删除
     */
    public static final int ENABLE_TEN = 10;
    /**
     * 是否可用 10-可用 20-删除
     */
    public static final int UNABLE_TWENTY = 20;
    /**
     * 更新数据库影响的行数 1
     */
    public static final int EFFECT_ROWS_ONE = 1;
    /**
     * 更新数据库影响的行数 0
     */
    public static final int EFFECT_ROWS_ZERO = 0;

    /**
     * 楼层状态:10-未生效 20-生效中
     */
    public static final int FLOOR_STATUS_TEN = 10;
    /**
     * 楼层状态:10-未生效 20-生效中
     */
    public static final int FLOOR_STATUS_TWENTY = 20;
    /**
     * 常量 0
     */
    public static final int ZERO = 0;
    /**
     * 常量 9
     */
    public static final int NINE = 9;
    /**
     * 常量 18
     */
    public static final int EIGHTEEN = 18;
    /**
     * 常量 1
     */
    public static final int ONE = 1;

    /**
     * 常量 2
     */
    public static final int TWO = 2;
    /**
     * 常量 3
     */
    public static final int THREE = 3;

    /**
     * 常量 4
     */
    public static final int FOUR = 4;
    /**
     * 常量 5
     */
    public static final int FIVE = 5;

    /**
     * 常量 20
     */
    public static final int TWENTY = 20;

    /**
     * 常量48
     */
    public static final int FORTY_EIGHT = 48;

    /**
     * 常量59
     */
    public static final int FIFTY_NINE = 59;

    /**
     * 常量 200
     */
    public static final int TWO_HUNDRED = 200;

    /**
     * 常量 1000
     */
    public static final int THOUSAND = 1000;

    /**
     * 常量 -1
     */
    public static final int NEGATIVE_NUMBER_ONE = -1;
    /**
     * 常量 3
     */
    public static final int NUMBER_THREE = 3;
    /**
     * 常量4
     */
    public static final int NUMBER_FOUR = 4;
    /**
     * 字符串1
     */
    public static final String ONE_STRING = "1";
    /**
     * 字符串0
     */
    public static final String ZERO_STRING = "0";
    public static final Object SUCCESS = "SUCCESS";


    public static final String USERID = "uid";

    public static final String SHOPID = "shop_id";

    public static final String LOGGING_STATUS = "logging_status";

    public static final String MOBILE_LOGIN_TOKEN = "mobile-login-token";

    public static final String JSESSIONID = "JSESSIONID";

    /**
     * http header
     */
    public static final String X_FLAG = "x-flag";

    /**
     * http header - 登录授权
     */
    public static final String AUTHORIZATION = "Authorization";

    /**
     * 商城2.0 pc端 卖家
     */
    public static final String X_REQ_SELLER = "seller";

    /**
     * 商城2.0 H5 买家
     */
    public static final String X_REQ_H5 = "h5";

    /**
     * 商城2.0 微信小程序 买家
     */
    public static final String X_REQ_MINI = "mini";

    /**
     * 商城2.0 android移动端 买家
     */
    public static final String X_REQ_ANDROID = "android";

    /**
     * 商城2.0 ios移动端 买家
     */
    public static final String X_REQ_IOS = "iOS";

    /**
     * 商城2.0 eoc
     */
    public static final String X_REQ_EOC = "eoc";

    /**
     * 10-未生效 20-生效中
     */
    public static final int TAB_STATUS_TEN = 10;
    /**
     * 10-未生效 20-生效中
     */
    public static final int TAB_STATUS_TWENTY = 20;

    /**
     * 用于保存找回密码的手机号
     */
    public static final String FIND_PWD_REDIS = "find_pwd_key";
    /**
     * 国家名字字段
     */
    public static final String AREA_NAME = "areaName";
    /**
     * 区号
     */
    public static final String AREA_CODE = "areaCode";
    /**
     * 正则规则
     */
    public static final String AREA_RULE = "areaRule";
    /**
     * 区号管理的主键ID
     */
    public static final String AREA_ID = "id";
    /**
     * 手机号码
     */
    public static final String MOBILE_NUMBER = "mobileNumber";
    /**
     * 短信验证码
     */
    public static final String MESSAGE_CODE = "messageCode";
    /**
     * 登录标识字段
     */
    public static final String LOGIN_FLAG = "loginFlag";
    /**
     * 短信发送的标识
     */
    public static final String MESSAGE_FLAG = "messageFlag";
    /**
     * 用户名
     */
    public static final String USER_NAME = "userName";
    /**
     * 密码
     */
    public static final String PASS_WORD = "passWord";
    /**
     * 验证key
     */
    public static final String KEY = "key";
    /**
     * 微信openId
     */
    public static final String OPEN_ID = "openId";
    /**
     * 微信unionId
     */
    public static final String UNION_ID = "unionId";
    /**
     * 第三方 绑定 errorKey
     */
    public static final String ERROR_KEY = "errorKey";
    /**
     * 第三方绑定 registerFlag
     */
    public static final String REGISTER_FLAG = "registerFlag";
    /**
     * 微信accessToken
     */
    public static final String ACCESS_TOKEN = "accessToken";
    /**
     * 明文，加密数据
     */
    public static final String ENCRYPTED_DATA = "encryptedData";
    /**
     * 加密算法初始向量
     */
    public static final String IV = "iv";
    /**
     * 微信返回的code
     */
    public static final String CODE = "code";
    /**
     * 店铺类目状态
     */
    public static final int STATUS = 1;

    /**
     * 店铺类目启用
     */
    public static final int CATEGORY_USABLE = 10;
    /**
     * 店铺类目停用
     */
    public static final int CATEGORY_UNUSABLE = 20;
    /**
     * 已设置
     */
    public static final int READY_SET = 10;
    /**
     * 未设置
     */
    public static final int NO_SET = 20;

    /**
     * 店铺类目全部状态
     */
    public static final int CATEGORY_ALL_STATUS = 30;
    /**
     * 用户登录标识
     */
    public static final String USER_LOGIN = "USER_LOGIN";
    /**
     * 找回密码
     */
    public static final String FIND_PWD = "FIND_PWD";
    /**
     * 设置密码密码
     */
    public static final String SETTING_PWD = "SETTING_PWD";
    /**
     * 微信绑定
     */
    public static final String REGISTER_WECHAT = "REGISTER_WECHAT";

    public static final String REGISTER_IOS = "REGISTER_IOS";

    public static final Integer IS_EXPORT = 2;

    /**
     * 商务合作标签 类型1 咨询客服 0 标签
     */
    public static final Integer TAG_TYPE = 1;

    public static final String WECHAT_LOGIN_KEY = "wechat_login_key";

    public static final String WECHAT_IOS_KEY = "ios_login_key";
    /**
     * Long 类型的 ZERO
     */
    public static final Long LONG_ZERO = 0L;

    /**
     * int 类型的 -1
     */
    public static final int MINUS_ONE = -1;

    /**
     * 操作类型
     */
    public static final String OPERATION_TYPE = "operationType";
    /**
     * 操作菜单
     */
    public static final String OPERATION_MENU = "operationMenu";
    /**
     * 操作人
     */
    public static final String MODIFY_BY = "modifyBy";
    /**
     * 操作日期
     */
    public static final String MODIFY_TIME = "modifyTime";
    /**
     * 修改后的值
     */
    public static final String AFTER_MODIFY_VALUE = "afterModifyValue";
    /**
     * 苹果identityToken
     */
    public static final String IDENTITY_TOKEN = "identityToken";

    /**
     * Long 类型的 ONE
     */
    public static final Long LONG_ONE = 1L;
    /**
     * 短信验证码标识
     */
    public static final String VALIDATION = "validation";
    /**
     * 短信验证码标识
     */
    public static final String CAPTCHA_IS_LOCK = "CaptchaIsLock";
    /**
     * 以旧换新标识
     */
    public static final String OLD_FOR_NEW = "OLD_FOR_NEW";

    /**
     * 个人中心-修改密码-短信标识
     */
    public static final String MODIFY_PWD = "MODIFY_PWD";
    /**
     * 个人中心-更换手机-旧手机短信标识
     */
    public static final String VERIFY_OLD_MOBILE = "VERIFY_OLD_MOBILE";
    /**
     * 个人中心-更换手机-新手机短信标识
     */
    public static final String VERIFY_NEW_MOBILE = "VERIFY_NEW_MOBILE";

    /**
     * 每天手机短信次数最大上限
     */
    public static final int MAX_PHONE = 10;
    /**
     * 60s 短信有效期
     */
    public static final int MSG_EXPIRE = 60;
    /**
     * 每天同一IP地址 短信次数最大上限
     */
    public static final int MAX_IP = 500;
    /**
     * 店铺类目等级
     */
    public static final Integer SHOP_CATEGORY_LEV = 3;
    /**
     * DEV-环境
     */
    public static final String ENV_DEV = "dev";
    /**
     * TEST-环境
     */
    public static final String ENV_TEST = "test";
    /**
     * UAT-环境
     */
    public static final String ENV_UAT = "uat";
    /**
     * STRESS-环境
     */
    public static final String ENV_STRESS = "stress";
    /**
     * 商品下架状态
     */
    public static final Integer ITEM_DOWN_STATUS = 5;
    /**
     * 商品列表是否显示商品推荐
     */
    public static final Integer IS_SHOW_COMMEND = 1;
    /**
     * 楼层管理 标识
     */
    public static final String FLOOR_SET_ING = "floorSeting";
    /**
     * 推荐广告位 标识
     */
    public static final String ADVERT_SET_ING = "advertSeting";
    /**
     * Metro图标 标识
     */
    public static final String METRO_ICON = "metroIcon";
    /**
     * 轮播banner 标识
     */
    public static final String BANNER_SET = "bannerSet";
    /**
     * 热点广告位 标识
     */
    public static final String HOT_ADVERT = "hotAdvert";
    /**
     * 专题广告位 标识
     */
    public static final String SPECIAL_ADVERT = "specialAdvert";
    /**
     * 首页分类tab配置 标识
     */
    public static final String TAB_CLASSIFY = "tab-classify";
    /**
     * 店铺申请平台类目审核成功状态
     */
    public static final Integer SHOP_CATEGORY_STATUS_PASS = 2;

    /**
     * 热门城市
     */
    public static final int HOT_FILED = 10;
    /**
     * 用户未注册是的状态码
     */
    public static final int USER_UN_REGISTER = 1324;
    /**
     * 微信登录，未绑定时返回的错误码
     */
    public static final int WE_CHAT_UN_REGISTER = 1315;
    /**
     * IOS未绑定时返回的错误码
     */
    public static final int IOS_UN_REGISTER = 1318;

    /**
     * 用户反馈信息缓存前缀
     */
    public static final String USER_FEEDBACK_CACHE_PREFIX = "user_feedback_";
    /**
     * 用户反馈信息缓存时间间隔
     */
    public static final String USER_FEEDBACK_CACHE_INTERVAL = "user_feedback_interval_";
    /**
     * 用户反馈图片地址分割符
     */
    public static final String USER_FEEDBACK_PIC_URL_SPILT = "---";
    /**
     * 用户反馈最大缓存
     */
    public static final Integer USER_FEEDBACK_COMMIT_MAX_TIME = 20;
    /**
     * 用户反馈缓存步长 +1 常量
     */
    public static final Integer INCR_USER_FEEDBACK_COMMIT_STEP_SIZE = 1;
    /**
     * 用户反馈缓存步长 -1 常量
     */
    public static final Integer DECR_USER_FEEDBACK_COMMIT_STEP_SIZE = -1;
    /**
     * 用户反馈最大文字
     */
    public static final Integer USER_FEEDBACK_MAX_CONTENT = 500;
    /**
     * 常量 2
     */
    public static final Integer CONSTANT_TWO = 2;

    /**
     * EOC-自助服务服务上下架状态 10-上架 20-下架
     */
    public static final int SELF_SERVICE_SHELVE = 10;
    /**
     * EOC-自助服务服务上下架状态 10-上架 20-下架
     */
    public static final int SELF_SERVICE_UNSHELVE = 20;
    /**
     * EOC-自助服务服务名称长度上限 5
     */
    public static final int MAX_SERVICE_NAME = 5;
    /**
     * EOC-自助服务跳转类型:10-页面跳转 20-内部跳转
     */
    public static final Integer SELF_SERVICE_PAGE_JUMP = 10;
    /**
     * EOC-自助服务跳转类型:10-页面跳转 20-内部跳转
     */
    public static final Integer SELF_SERVICE_INTERNAL_JUMP = 20;
    /**
     * EOC-自助服务同时上架服务数量上限 20
     */
    public static final int MAX_SERVICE_AMOUNT = 20;
    /**
     * 排序规则  10:全部 20：查询图片 30：查询半年内
     */
    public static final int EVALUATION_ALL = 10;
    /**
     * 排序规则  10:全部 20：查询图片 30：查询半年内
     */
    public static final int EVALUATION_PIC = 20;
    /**
     * 排序规则  10:全部 20：查询图片 30：查询半年内
     */
    public static final int EVALUATION_HALF_YEAR = 30;

    /**
     * 客服轮播图状态：10-上架；20-下架；（编码）
     */
    public static final int SERVICE_BANNER_STATUS_SHELVE_CODE = 10;
    public static final int SERVICE_BANNER_STATUS_UNSHELVE_CODE = 20;

    /**
     * EOC-文章标题长度上限 20
     */
    public static final int MAX_ARTICAL_NAME = 20;
    /**
     * EOC-常见问题文章上下架状态 10-上架 20-下架
     */
    public static final int FAQ_QUESTION_UNSHELVE = 20;
    /**
     * EOC-常见问题文章上下架状态 10-上架 20-下架
     */
    public static final int FAQ_QUESTION_SHELVE = 10;

    /**
     * 移动端登录TOKEN
     */
    public static final String MOBILE_USER_LOGIN_TOKEN = "mobile_login_token";

    /**
     * DESCRIPTION：记住是否是记住登录
     */
    public static final String AUTO_LOGON = "autologon";

    /**
     * DESCRIPTION：记住登录名用的
     */
    public static final String LOG_NAME = "logname";

    /**
     * DESCRIPTION：用户ID
     */
    public static final String USER_ID = "uid";

    /**
     * 商品待上架状态
     */
    public static final int PRODUCT_SHELVING_STATUS = 3;

    /**
     * 商品待发布状态
     */
    public static final int PRODUCT_NO_PUBLISH_STATUS = 1;

    /**
     * 商品正常保存状态
     */
    public static final int PRODUCT_SAVE_NORMAL_STATUS = 1;

    /**
     * 保存为草稿
     */
    public static final int PRODUCT_SAVE_DRAFT_STATUS = 2;
    /**
     * 客服轮播图上架最大数量
     */
    public static final int SERVICE_BANNER_SHELVE_MAX_NUMBER = 5;
    /**
     * 客服轮播图已上架的轮播图重复最小数量
     */
    public static final int SERVICE_BANNER_SAME_SEQUENCE_COUNT = 1;

    /**
     * 快报缓存redis中秒数
     */
    public static final long SERVICE_LETTLES_REDIS_SECONDS = 120L;

    /**
     * 自助服务每页最大图标数 10
     */
    public static final int PAGE_SIZE_TEN = 10;
    /**
     * 排序标志：10-倒序，20-正序
     */
    public static final int DESC_ORDER = 10;
    /**
     * 排序标志：10-倒序，20-正序，30-按目录类别正序
     */
    public static final int ASC_ORDER = 20;
    public static final int CATEGORY_ORDER = 30;

    public static final String IOS = "REGISTER_IOS";

    public static final String WE_CAHT = "REGISTER_WECHAT";

    /**
     * 格力
     */
    public static final int GREE_SERVICE_MAX_ROWS = 20;

    /**
     * 商务合作最大导出数据数量
     */
    public static final Integer ITEM_ASK_MAX_EXPORT_NUMBER = 5000;
    /**
     * 最大请求数量
     */
    public static final Integer SEND_NUMBER_LIMIT_NUMBER = 200;
    public static final Integer PREFERENTIAL_ABLE_TEN =  10;
    /**
     * 商务合作合作类型：10-工业制品默认，20-银隆汽车
     */
    private Integer cooperationType;
    public static final Integer BIZ_COOPERATION_TYPE_TEN = 10;
    public static final Integer BIZ_COOPERATION_TYPE_TWENTY = 20;

    //public static final String WE_CAHT = "WECHAT";

    /**
     * EOC-帮助中心文章上下架状态 10-上架 20-下架
     */
    public static final Integer EOC_HELP_CENTER_ARTICLE_UNSHELVE = 20;
    public static final Integer EOC_HELP_CENTER_ARTICLE_SHELVE = 10;

    /**
     * EOC-帮助中心页面层级 10-一级页面 20-二级页面 30-三级页面
     */
    public static final Integer EOC_HELP_CENTER_LEVEL_ONE_PAGE = 10;
    public static final Integer EOC_HELP_CENTER_LEVEL_TWO_PAGE = 20;
    public static final Integer EOC_HELP_CENTER_LEVEL_THREE_PAGE = 30;

    /**
     * EOC-帮助中心一级页面时parent_id设置为 0L
     */
    public static final Long EOC_HELP_CENTER_PARENT_ID_DEFAULT = 0L;

    /**
     * EOC-帮助中心分页标志位 10-分页 20-不分页
     */
    public static final Integer EOC_HELP_CENTER_UNPAGE = 20;
    public static final Integer EOC_HELP_CENTER_PAGE = 10;
    /**
     * 叶子节点状态
     */
    public static final Integer TREE_LEAF_NODE_STATUS = 1;

    /**
     * 非叶子节点状态
     */
    public static final Integer TREE_NO_LEAF_NODE_STATUS = 0;

    /**
     * 客户性质 业主
     */
    public static final Integer CUSTOMER_TYPE_OWNER = 1;

    /**
     * 客户性质 工程商
     */
    public static final Integer CUSTOMER_TYPE_PROJECT_CONTRACTOR = 2;

    /**
     * 否自营店: 0-非自营; 1-自营; 2-第三方品牌店
     */
    public static final int NOT_IS_SELF_SHOP = 0;
    public static final int IS_SELF_SHOP = 1;
    public static final int IS_THIRD_SHOP = 2;

    /**
     * 空调配件是否完整: 0-否; 1-是
     */
    public static final int NOT_IS_INTEGRITY = 0;
    public static final int IS_INTEGRITY = 1;

    /**
     * 品牌编码：1-格力；0-非格力；-1 待鉴定
     */
    public static final int GREE_BRAND_CODE = 1;
    public static final int NOT_GREE_BRAND_CODE = 0;
    public static final int TO_IDENTIFY_CODE = -1;

    /**
     * 类型编码：1-空调；0-柜机
     */
    public static final int AIR_CONDITIONER_TYPE_CODE = 1;
    public static final int CABINET_TYPE_CODE = 0;

    /**
     * 品牌名称：1-格力；0-非格力
     */
    public static final String GREE_BRAND_NAME = "格力";
    public static final String NOT_GREE_BRAND_NAME = "非格力";

    /**
     * 以旧换新-待鉴定状态
     */
    public static final String WAIT_APPRAISAL = "待鉴定";

    /**
     * 以旧换新登记时的来源 1自营登记 2经销商登记
     */
    public static final int DISTRIBUTOR_REGISTRATION = 0;

    /**
     * 类型名称：1-空调；0-柜机
     */
    public static final String AIR_CONDITIONER_TYPE_NAME = "挂机";
    public static final String CABINET_TYPE_NAME = "柜机";

    /**
     * 是否能给格力开发票：0-否； 1-是
     */
    public static final int NOT_IS_CANINVOICE = 0;
    public static final int IS_CANINVOICE = 1;

    /**
     * 查询店铺类型：0-根据区域查询； 1-根据店铺名称查询
     */
    public static final int AREA_TYPE = 0;
    public static final int STORE_TYPE = 1;

    /**
     * 购物车个人添加商品上限值-99
     */
    public static final int CART_MAX_SIZE = 99;

    /**
     * 是否默认地址：1-是，2-否
     */
    public static final int NOT_IS_DEFAULT = 2;
    public static final int IS_DEFAULT = 1;

    /**
     * 性别：1-男 2-女 3-保密
     */
    public static final int MAN = 1;
    public static final int WOMEN = 2;
    public static final int SECRECY = 3;

    /**
     * EOC-帮助中心查询（一二三级页面名称重复数） 0-没有重复 1-一条重复 2-两条重复 3-三条重复
     */
    public static final Integer EOC_HELP_CENTER_REPEAT_ZERO = 0;
    public static final Integer EOC_HELP_CENTER_REPEAT_ONE = 1;
    public static final Integer EOC_HELP_CENTER_REPEAT_TWO = 2;
    public static final Integer EOC_HELP_CENTER_REPEAT_THREE = 3;

    /**
     * 购物车 商品失效-20 未失效-10
     */
    public static final int VALID_COMMODITY_CODE = 10;
    public static final int INVALID_COMMODITY_CODE = 20;

    /**
     * 购物车 redis-key
     */
    public static final String CART_REDIS_KEY = "cart";

    /**
     * 个人中心数量
     */
    public static final String USER_COUNT_KEY = "user_count_";

    /**
     * 用户无优惠券
     */
    public static final Long USER_COUPONS_EMPTY = -1L;
    /**
     * 确认订单：不使用优惠券
     */
    public static final String NOT_USE_COUPON = "-1";

    /**
     * 用户优惠券页签：0-未使用 1-已用 2-已过期
     */
    public static final int UNUSED = 0;
    public static final int USED = 1;
    public static final int EXPIRED = 2;

    /**
     * 1.0返回优惠券状态：1-已开始 2-已结束 3-已终止
     */
    public static final int COUPON_START = 1;
    public static final int COUPON_END = 2;
    public static final int COUPON_BREAK_UP = 3;

    /**
     * 优惠券是否已经被领取完 2-已领完
     */
    public static final int OLDMALL_COUPON_BROUGHT_UP = 2;

    /**
     * 2.0转换返回优惠券状态：1-立即领取 2-已过期 3-已领取 4-已领完
     */
    public static final int CAN_RECEIVED = 1;
    public static final int COUPON_IS_EXPIRES = 2;
    public static final int ALREADY_RECEIVED = 3;
    public static final int COUPON_BROUGHT_UP = 4;


    /**
     * EOC-帮助中心页面类型：10-文章，20-目录列表
     */
    public static final int EOC_HELP_CENTER_PAGE_TYPE_ARTICLE = 10;
    public static final int EOC_HELP_CENTER_PAGE_TYPE_CATEGORY_LIST = 20;

    /**
     * 分销店 10
     */
    public static final int DISTRIBUTION_SHOP = 10;
    /**
     * 底层店 20
     */
    public static final int GROUND_FLOOR_SHOP = 20;

    /**
     * 店铺有优惠券 10
     */
    public static final int SHOP_HAVE_DISCOUNT_COUPON = 10;

    /**
     * 店铺无优惠券 20
     */
    public static final int SHOP_NO_DISCOUNT_COUPON = 20;

    /**
     * 以旧换新登记时的来源
     * 1 自营店登记 2 经销商登记
     */
    public static final int REGISTER_SOURCE_SELF = 1;
    public static final int REGISTER_SOURCE_DEALER = 2;

    /**
     * 搜索词类型-关键词
     */
    public static final int SEARCH_WORD_TYPE_KEYWORD = 10;
    /**
     * 搜索词类型-三级类目
     */
    public static final int SEARCH_WORD_TYPE_CATEGORY = 20;
    /**
     * 搜索词类型-链接
     */
    public static final int SEARCH_WORD_TYPE_LINK = 30;
    /**
     * 搜索词类型-专题模板活动
     */
    public static final int SEARCH_WORD_TYPE_SPECIAL_TEMPLATE = 50;
    /**
     * 搜索词类型-秒杀专场
     */
    public static final int SEARCH_WORD_TYPE_SECKILL = 40;
    /**
     * 搜索词类型-直播频道
     */
    public static final int SEARCH_WORD_TYPE_LIVE_TELECAST = 60;
    /**
     * 搜索历史类型-其他
     */
    public static final int SEARCH_WORD_TYPE_OTHER = 30;
    /**
     * 搜索词链接类型-外部链接
     */
    public static final int SEARCH_WORD_LINK_TYPE_EXTERNAL = 10;
    /**
     * 搜索词链接类型-内部链接
     */
    public static final int SEARCH_WORD_LINK_TYPE_INSIDE = 20;
    /**
     * 搜索词标签类型-其他
     */
    public static final int SEARCH_WORD_LABEL_TYPE_OTHER = 40;
    /**
     * 搜索词标签类型-爆款
     */
    public static final int SEARCH_WORD_LABEL_TYPE_HOT_CAKE = 10;
    /**
     * 搜索词标签类型-新款
     */
    public static final int SEARCH_WORD_LABEL_TYPE_NEW = 20;
    /**
     * 搜索词标签类型-热款
     */
    public static final int SEARCH_WORD_LABEL_TYPE_BEST_SELLER = 30;
    /**
     * 搜索历史来源-商品
     */
    public static final int SEARCH_HISTORY_SOURCE_SHOP = 10;
    /**
     * 搜索历史来源-订单
     */
    public static final int SEARCH_HISTORY_SOURCE_ORDER = 20;


    /**
     * 店铺运行状态-停止、关闭运行
     */
    public static final int SHOP_RUN_STATUS_STOP = 2;

    /**
     * 店铺类型 shop_info表 4分销店
     */
    public static final int SHOP_TYPE_DISTRIBUTION = 4;


    /**
     * 返回值：成功或失败标记
     */
    public static final String SUCCESS_VALUE = "success";
    public static final String FAIL_VALUE = "fail";

    /**
     * 拼接用的符号
     */
    public static final String SEPARATOR_AND = "&";
    public static final String SEPARATOR_EQUAL = "=";

    /**
     * 以旧换新-品牌：格力
     */
    public static final String OLD_FOR_NEW_BRAND_NAME = "格力";

    /**
     * 以旧换新积分发送状态  1-已发送，0-未发送
     */
    public static final Integer OLD_FOR_NEW_INTEGRAL_NOT_SEND_STATES = 0;
    public static final Integer OLD_FOR_NEW_INTEGRAL_SEND_STATES = 1;

    /**
     * 以旧换新商品标签 分隔符
     */
    public static final String OLD_FOR_NEW_ITEM_TAGS_SPLIT = ";";

    /**
     * 售后- 活动是否可以退定金  1:可退 2:不可退
     */
    public static final Integer AFTER_SALE_SERVICE_CAN_REFUND_FLAG = 1;
    public static final Integer AFTER_SALE_SERVICE_CAN_NOT_REFUND_FLAG = 2;

    /**
     * 售后- 订单不可申请售后天数
     */
    public static final Integer AFTER_SALE_SERVICE_ORDER_EXPLAIN_DAY = 15;

    /**
     * 订单类型 1：普通订单；5：预售订单
     */
    public static final Integer ORDER_SHIPMENT_TYPE_NORMAL = 1;
    public static final Integer ORDER_SHIPMENT_TYPE_PRE = 5;

    /**
     * 订单状态 1:待付款，2：待配送，3：待收货，
     * 4：待评价，5：已完成，6：已取消，7：已关闭，
     * 8：待付定金，9：订单过期，10：待付尾款，
     * 11，未付尾款,12.待核销，13，已核销
     */
    public static final Integer ORDER_STATE_NOT_PAY = 1;
    public static final Integer ORDER_STATE_PAY = 2;
    public static final Integer ORDER_STATE_LEFT_AMOUNT = 10;
    public static final Integer ORDER_STATE_CANCEL = 6;

    /**
     * 售后服务类型 0: 退款 1：退货退款 2 换货
     */
    public static final Integer AFTER_SALE_SERVICE_TYPE_REFUND_AMOUNT = 0;
    public static final Integer AFTER_SALE_SERVICE_TYPE_RETURN_GOODS = 1;
    public static final Integer AFTER_SALE_SERVICE_TYPE_CHANGE_GOODS = 2;

    /**
     * 个人中心-账号注销：99-其他原因
     */
    public static final String OTHER_REASON_CODE = "99";

    /**
     * 是否新品 0否 1是
     */
    public static final int NEW_PRODUCT_CODE = 1;

    /**
     * 积分类型： 0-支出；1-收入
     */
    public static final int EXPEND = 0;
    public static final int INCOME = 1;


    /**
     * 配送方式
     * 0 自提
     * 1 配送
     */
    public static final Integer DELIVER_TYPE_BY_SELF = 0;
    public static final Integer DELIVER_TYPE_BY_SEND = 1;

    /**
     * 支付方式
     * 0 线上
     * 1 线下
     */
    public static final Integer PAYMENT_TYPE_DOWN = 126;
    public static final Integer PAID_TYPE_BY_UP = 0;
    public static final Integer PAID_TYPE_BY_DOWN = 1;

    /**
     * 支付成功-10
     */
    public static final Integer PAY_STATUS_SUCCESS = 10;
    /**
     * 支付失败-20
     */
    public static final Integer PAY_STATUS_FAIL = 20;


    /**
     * 关键字--默认
     */
    public static final String DEFAULT_KEY_WORD = "空调";

    /**
     * 为不同模块提供个人中心地址列表接口标志： 0-个人中心模块；1其他模块（订单）
     */
    public static final int USER_CENTER_MODULE = 0;
    public static final int OTHER_MODULE = 1;

    /**
     * 计算个人中心(积分, 收藏, 浏览, 优惠券)的总数
     */
    public static final String MY_FAVORITE_COUNT = "myFavoriteCount";
    public static final String BROW_HISTORY_COUNT = "browHistoryCount";
    public static final String USER_CREDIT_COUNT = "userCreditCount";
    public static final String USER_COUPON_COUNT = "userCouponCount";

    /**
     * 总条数
     */
    public static final String TOTAL_RECORD = "total";
    /**
     * 分类索引
     */
    public static final String CATEGORY_INDEX = "category";
    /**
     * 属性索引
     */
    public static final String ATTRIBUTE_INDEX = "attribute";
    /**
     * 商品索引创建
     */
    public static final String PRODUCT_INDEX = "product";
    /**
     * 推荐商品索引创建
     */
    public static final String RECOMMEND_INDEX = "recommend";
    /**
     * 我的收藏商品索引创建
     */
    public static final String FAVORITE_INDEX = "favorite";
    /**
     * 我的浏览商品索引创建
     */
    public static final String BROW_INDEX = "brow";
    /**
     * 购物车商品索引创建
     */
    public static final String CART_INDEX = "cart";
    /**
     * 营销类目索引创建
     */
    public static final String MARKET_CATEGORY_INDEX = "market_category";
    /**
     * 常用字符串 1
     */
    public static final String STR_ONE = "1";
    /**
     * 以旧换新
     */
    public static final String STORE_TRADE_IN = "以旧换新";
    /**
     * 新品
     */
    public static final String STORE_NEW_IN = "新品";
    /**
     * 秒杀
     */
    public static final String SECOND_PRODUCT = "秒杀";
    /**
     * 截取.0
     */
    public static final String SUBSTR_SINGLE_ZERO = ".0";
    /**
     * 截取.00
     */
    public static final String SUBSTR_DUB_ZERO = ".00";
    /**
     * 截取.
     */
    public static final String SUBSTR_ZERO = ".";
    /**
     * 常用字符串 0
     */
    public static final String STR_ZERO = "0";
    /**
     * 商品状态可用
     */
    public static final String STATUS_USE = "4";
    /**
     * 推荐搜索总条数
     */
    public static final int TOTAL_RECOMMEND = 50;
    /**
     * 订单发票页上的状态
     */
    public static final int INVOICE_P_STATUS_DEFAULT = 1;
    public static final int INVOICE_P_STATUS_CREATING = 2;
    public static final int INVOICE_P_STATUS_CREATED = 3;
    /**
     * 订单发票页 开票状态
     */
    public static final int INVOICE_P_CREATE_STATUS_DEFAULT = 1;
    public static final int INVOICE_P_CREATE_STATUS_CREATING = 2;
    public static final int INVOICE_P_CREATE_STATUS_CREATED = 3;
    /**
     * 订单换票发票页状态
     */
    public static final int CHANGE_INVOICE_STATUS_DEFAULT = 0;
    public static final int CHANGE_INVOICE_STATUS_EXAMINED = 1;
    public static final int CHANGE_INVOICE_STATUS_REFUSE = 2;
    public static final int CHANGE_INVOICE_STATUS_PREPARE = 3;
    public static final int CHANGE_INVOICE_STATUS_SEND_BACK = 4;
    public static final int CHANGE_INVOICE_STATUS_FINISH = 5;
    /**
     * redis中活动类型 秒杀 直降 新品 定金预购 团购
     */
    public static final String SECKILL_ACTIVITY_CHARACTER_NAME = "秒杀";
    public static final String FALL_ACTIVITY_CHARACTER_NAME = "直降";
    public static final String NEW_PRODUCT_NAME = "新品";
    public static final String NEW_FOR_NEW_NAME = "以旧换新";
    public static final String ADVANCE_PURCHASE_ACTIVITY_CHARACTER_NAME = "定金预购";
    public static final String GROUP_BUY__CHARACTER_NAME = "拼团";

    /**
     * 对公转账信息
     */
    public static final String ACCOUNT_NAME = "格力电子商务有限公司";
    public static final String BANK_NAME = "中国农业银行股份有限公司珠海金格支行";

    /**
     * 优惠券模块标识： 1-优惠券中心详情；2优惠券中心；3-我的优惠券中心详情；
     */
    public static final int COUPON_CENTER_DETAIL_FLAG = 1;
    public static final int COUPON_CENTER_FLAG = 2;
    public static final int COUPON_USER_DETAIL_FLAG = 3;

    /**
     * 个人中心用户名长度：最小长度-2；最大长度-12；
     */
    public static final int USERNAME_MIN_LENGTH = 2;
    public static final int USERNAME_MAX_LENGTH = 12;

    /**
     * 自营店 客服电话
     */
    public static final String CUSTOMER_SERVICE_PHONE_NUMBER = "400-836-5315";

    /**
     * 店铺推荐商品的最大数目
     */
    public static final int RECOMMEND_PRODUCT_LIMIT_COUNT = 50;

    /**
     * 平台商品服务
     */
    public static final int PRODUCT_SERVICE_TYPE = 10;
    /**
     * 商家商品服务
     */
    public static final int SHOP_PRODUCT_SERVICE_TYPE = 20;

    /**
     * 1-满减；2-现金；3-折扣；4-每满
     */
    public static final int FULL_CUT_CODE = 1;
    public static final int CASH_CODE = 2;
    public static final int DISCOUNT_CODE = 3;
    public static final int FULL_EACH_CODE = 4;

    public static final String CASH_DESCRIPTION = "无门槛";

    /**
     * 查询优惠卷信息
     * 0:都不是 1:平台创建 2:卖家中心 3:平台创建+卖家中心platformType
     */
    public static final Integer PLATFORM_NO_OF_THEM = 0;
    public static final Integer PLATFORM_EOC = 1;
    public static final Integer PLATFORM_MANAGE = 2;
    public static final Integer PLATFORM_ALL_OF_THEM = 3;

    /**
     * 是否有shopId相关的搜索条件
     * 0:无 1:有
     */
    public static final Integer NOT_FIND_BY_SHOP_ID = 0;
    public static final Integer IS_FIND_BY_SHOP_ID = 1;


    /**
     * 消息中心标题
     */
    public static final String SYSTEM_MESSAGE = "系统消息";
    public static final String ORDER_MESSAGE = "订单消息";
    public static final String CREDIT_MESSAGE = "积分消息";
    public static final String AFTER_SALE_MESSAGE = "售后消息";
    public static final String ACTIVITY_MESSAGE = "活动消息";
    public static final String COMMODITY_MESSAGE = "商品消息";
    public static final String SIGNED_MESSAGE = "亲~您购买的商品已经成功签收啦！";
    public static final String DISPATCH_MESSAGE = "亲~您购买的商品已经发货啦！";
    // 订单的物流商品已到货，而非库存增加来货了
    public static final String ARRIVAL_MESSAGE = "亲~您购买的商品已经到货啦！";

    /**
     * redis缓存用户浏览记录总数
     */
    public static final String BROW_HISTORY = "brow_history";

    /**
     * redis缓存店铺信息失效时间
     */
    public static final long REDIS_STORE_INFO_EXPIRE = 5L;
    /**
     * redis缓存店铺key前缀
     */
    public static final String REDIS_STORE_PREFIX = "shop_info_";

    /**
     * 所有城市地址
     */
    public static final String ALL_CASCADE_ADDRESS = "all_cascade_address";

    /**
     * 手机号码正则校验
     */
    public static final String PHONE_REGEXP = "^[1][3,4,5,6,7,8,9][0-9]{9}$";
    /**
     * 脱敏手机号
     */
    public static final String PHONE_DESENSITIZATION_REGEXP = "^[1][3,4,5,6,7,8,9][0-9][*]{4}[0-9]{4}$";

    /**
     * 跳转类型(10-商品详情;20-链接;30-直播;40-秒杀专场;50-专题活动模板；70-分类商品列表；80-其他小程序; 110-拼团)
     */
    public static final Integer OPEN_TYPE_SKU = 10;

    public static final Integer OPEN_TYPE_PRODUCT_DETAIL = 20;

    public static final Integer OPEN_TYPE_LIVE_TELECAST = 30;

    public static final Integer OPEN_TYPE_SECKILL = 40;

    public static final Integer OPEN_TYPE_TEMPLATE = 50;

    public static final Integer OPEN_TYPE_SPECIAL_TEMP_MARKET_CATEGORY = 70;
    public static final Integer OPEN_TYPE_SPECIAL_TEMP_OTHER_APPLET = 80;

    public static final Integer OPEN_TYPE_GROUP_BUYING = 110;

    /**
     * 秒杀活动分布式锁的前缀key
     */
    public static final String ACTIVITY_SECKILL_LOCK_KEY = "activity_seckill_lock_";
    public static final String ACTIVITY_SECKILL_LOCK_ORDER = "order_";
    public static final String ACTIVITY_SECKILL_LOCK_UPDATE_STOCK = "update_stock_";
    public static final String ACTIVITY_SECKILL_LOCK_INVENTORY = "inventory_";

    /**
     * 商品限购活动分布式锁的前缀key
     */
    public static final String ACTIVITY_PURCHASE_LIMIT_LOCK_KEY = "activity_purchase_limit_lock_";
    public static final String ACTIVITY_PURCHASE_LIMIT_LOCK_ORDER = "order_";
    public static final String ACTIVITY_PURCHASE_LIMIT_LOCK_SHOP = "shopId_";
    public static final String ACTIVITY_PURCHASE_LIMIT_LOCK_UPDATE_STOCK = "update_stock_";
    public static final String ACTIVITY_PURCHASE_LIMIT_LOCK_INVENTORY = "inventory_";

    /**
     * 直降活动分布式锁的前缀key
     */
    public static final String ACTIVITY_FALL_LOCK_KEY = "activity_fall_lock_";
    public static final String ACTIVITY_FALL_LOCK_UPDATE_STOCK = "update_stock_";

    /**
     * 拼团活动分布式锁的前缀key
     */
    public static final String ACTIVITY_GROUP_BUYING_LOCK_KEY = "activity_group_buying_lock_";
    public static final String ACTIVITY_GROUP_BUYING_LOCK_UPDATE_STOCK = "update_stock_";

    /**
     * 是否是拼团的团长 1、是 0、否
     */
    public static final int NOT_IS_LEADER = 0;
    public static final int IS_LEADER = 1;


    public static final String SALES_UTI = "万";

    /**
     * 退货方式 自行寄回
     */
    public static final Integer RETURN_METHOD_BUYER_DELIVERY = 20;


    /**
     * 以旧换新-审核状态名称
     */
    public static final String TO_IDENTIFY = "待鉴定";
    public static final String IDENTIFY_NOT_PASS = "鉴定不通过";
    public static final String PENDING_SUBSIDY = "待发放补贴";
    public static final String CANCEL = "取消";

    /**
     * 定时任务表枚举ID
     * 1-首页背景图；2-首页轮播图；3-首页专题广告位；4-首页MetroIcon; 5-切分banner;
     * 6-专题广告位；7-首页楼层广告；8-首页弹窗；9-首页Floating；10-首页底部导航栏；
     * 11-EOC内容管理广告; 12-秒杀;13-直播活动；14-商品限购活动; 17-拼团活动
     */
    public static final int BACKGROUND_TABLE_ENUM = 1;
    public static final int FLOW_BANNER_TABLE_ENUM = 2;
    public static final int HOT_AD_TABLE_ENUM = 3;
    public static final int METRO_ICON_TABLE_ENUM = 4;
    public static final int SPLIT_BANNER_TABLE_ENUM = 5;
    public static final int SPECIAL_ADS_TABLE_ENUM = 6;
    public static final int HOME_RECOMMEND_AD_ENUM = 7;
    public static final int HOME_POPUP_TABLE_ENUM = 8;
    public static final int HOME_FLOATING_TABLE_ENUM = 9;
    public static final int NAVIGATION_BAR_TABLE_ENUM = 10;
    public static final int EOC_ADS_TABLE_ENUM = 11;
    public static final int SECKILL_TABLE_ENUM = 12;
    public static final int LIVE_ACTIVITY_TABLE_ENUM = 13;
    public static final int PURCHASE_LIMIT_TABLE_ENUM = 14;
    public static final int FALL_TABLE_ENUM = 15;
    public static final int TRIAL_ACTIVITY_TABLE_ENUM = 16;
    public static final int GROUP_BUYING_TABLE_ENUM = 17;
    public static final int BATCH_UPDATE_TABLE_ENUM = 18;

    /**
     * 定时任务handleName
     */
    public static final String BACKGROUND_JOB_HANDLER = "backgroundJobHandler";
    public static final String FLOW_BANNER_JOB_HANDLER = "flowBannerJobHandler";
    public static final String HOT_ADS_JOB_HANDLER = "hotAdsJobHandler";
    public static final String METRO_ICON_JOB_HANDLER = "metroIconJobHandler";
    public static final String SPLIT_BANNER_JOB_HANDLER = "splitBannerJobHandler";
    public static final String SPECIAL_ADS_JOB_HANDLER = "specialAdsJobHandler";
    public static final String HOME_RECOMMEND_AD_JOB_HANDLER = "homeRecommendAdJobHandler";
    public static final String HOME_POPUP_JOB_HANDLER = "homePopupJobHandler";
    public static final String HOME_FLOATING_JOB_HANDLER = "homeFloatingJobHandler";
    public static final String NAVIGATION_BAR_JOB_HANDLER = "navigationBarJobHandler";
    public static final String NAVIGATION_ACTIVITY_JOB_HANDLER = "navigationActivityJobHandler";
    public static final String LIVE_ACTIVITY_JOB_HANDLER = "refreshLiveStatusTask";
    public static final String PURCHASE_LIMIT_JOB_HANDLER = "purchaseLimitJobHandler";
    public static final String FALL_ACTIVITY_JOB_HANDLER = "fallActivityRefreshStatusJobHandler";
    public static final String TRIAL_ACTIVITY_APPLY_JOB_HANDLER = "trialActivityApplyJobHandler";
    public static final String TRIAL_ACTIVITY_RESULT_PUBLISH_JOB_HANDLER = "trialActivityResultPublishJobHandler";
    public static final String TRIAL_ACTIVITY_REGIST_DEADLINE_BEFORE_24_HOURS_JOB_HANDLER = "trialActivityRegistDeadlineBefore24HoursJobHandler";
    public static final String TRIAL_ACTIVITY_REGIST_DEADLINE_JOB_HANDLER = "trialActivityRegistDeadlineJobHandler";
    public static final String TRIAL_ACTIVITY_ACTIVITY_DEADLINE_JOB_HANDLER = "trialActivityActivityDeadlineJobHandler";
    public static final String GROUP_BUYING_ACTIVITY_JOB_HANDLER = "groupBuyingActivityRefreshStatusJobHandler";
    /**
     * 新增或更新标记：0-新增；1-修改
     */
    public static final int SAVE_FLAG = 0;
    public static final int MODIFY_FLAG = 1;
    /**
     * 默认使用的地址code
     */
    public static final String DEFAULT_CITY_CODE = "110100";

    /* 秒杀相关token */
    public static final String SECKILL_TOKEN = "seckillToken";
    public static final String SECKILL_STOCK_NUM = "seckillStockNum";
    public static final String SECKILL_PERSON_BUY_NUM = "seckillPersonBuyNum";
    public static final String SECKILL_USER = "seckillUser";
    public static final String SECKILL_PERSON_NUM = "seckillPersonNum";

    /**
     * 是否使用MQ
     */
    public static final boolean IS_USE_MQ = true;

    /**
     * 是否首页预览标志：1-是；2-否
     */
    public static final int PREVIEW = 1;
    /**
     * 店铺类目缓存前缀
     */
    public static final String SHOP_CATEGORY_REDIS_KEY = "shop_category_";
    /**
     * 平台分摊
     */
    public static final Integer COST_ALLOCATION_PLATFORM = 1;
    /**
     * 店铺分摊
     */
    public static final Integer COST_ALLOCATION_SHOP = 2;
    /**
     * 优惠券使用范围 1-平台通用
     */
    public static final Integer DISCOUNT_COUPON_RANGE_PLATFORM = 1;
    /**
     * 优惠券使用范围 2-店铺通用
     */
    public static final Integer DISCOUNT_COUPON_RANGE_SHOP = 2;
    /**
     * 优惠券使用范围 3-部分品类可用
     */
    public static final Integer DISCOUNT_COUPON_RANGE_CATEGORY = 3;
    /**
     * 优惠券使用范围 4-部分商品可用
     */
    public static final Integer DISCOUNT_COUPON_RANGE_PRODUCT = 4;
    /**
     * 平台通用--展示当前店铺全部商品
     */
    public static final Integer COUPON_TYPE_PLATFORM = 1;
    /**
     * 平台品类-- 展示当前店铺全部可用品类商品
     */
    public static final Integer COUPON_TYPE_CATEGORY = 2;
    /**
     * 平台sku-- 展示全部可用商品
     */
    public static final Integer COUPON_TYPE_PLATFORM_SKU = 3;
    /**
     * 平台sku-- 展示所属店铺全部商品
     */
    public static final Integer COUPON_TYPE_PLATFORM_SHOP_SKU = 4;
    /**
     * 底层店建店铺通用--   展示当前店铺全部商品
     */
    public static final Integer COUPON_TYPE_SHOP = 5;
    /**
     * 底层店建店铺通用--展示当前店铺所属品类的全部商品
     */
    public static final Integer COUPON_TYPE_SHOP_CATEGORY = 6;
    /**
     * 底层店建店铺通用-- 展示店铺所属sku商品
     */
    public static final Integer COUPON_TYPE_SHOP_SKU = 7;
    /**
     * AR模型生效状态 10-未生效  20-生效中
     */
    public static final int AR_UNABLE_TEN = 10;
    public static final int AR_ENABLE_TWENTY = 20;

    /**
     * 商品属性
     * 1：选项值 2：自定义文本
     */
    public static final Integer ATTRIBUTE_CHOOSE_VALUE = 1;
    public static final Integer ATTRIBUTE_INPUT_VALUE = 2;

    /**
     * 商品审核开关状态
     * 开启：1; 关闭：0
     */
    public final static int OPEN_AUDIT = 1;
    public final static int CLOSE_AUDIT = 0;

    /**
     * 商品状态
     * 上架：UP; 下架：DOWN; 取消审核：CANCEL; 审核通过：PASS；审核驳回：UNPASS；锁定：LOCK；解锁：UNLOCK；
     */
    public final static String GOODS_UP = "UP";
    public final static String GOODS_DOWN = "DOWN";
    public final static String GOODS_CANCEL = "CANCEL";
    public final static String GOODS_PASS = "PASS";
    public final static String GOODS_UNPASS = "UNPASS";
    public final static String GOODS_LOCK = "LOCK";
    public final static String GOODS_UNLOCK = "UNLOCK";

    /**
     * 商务合作类型-工业制品
     */
    public final static Integer COOPERATION_TYPE_PRODUCT = 10;
    /**
     * 商务合作类型-银龙汽车
     */
    public final static Integer COOPERATION_TYPE_YINLONG = 20;

    /**
     * 店铺类目缓存前缀
     */
    public static final String SHOP_CATEGORY_CACHE_PREFIX = "shop_category_data";
    /**
     * 平台类目缓存前缀
     */
    public static final String PLATFORM_CATEGORY_CACHE_PREFIX = "platform_category_data";
    /**
     * 品牌类目缓存
     */
    public static final String ITEM_BRAND_CACHE_PREFIX = "item_brand_data";
    /**
     * 显示营销类目
     */
    public final static int MARKETING_CATEGORY_ON = 1;
    /**
     * 不显示营销类目
     */
    public final static int MARKETING_CATEGORY_OFF = 2;

    /**
     * 总数返回字段
     */
    public static final String TOTAL_COUNT_CHARACTER = "totalCount";

    /**
     * 是否以旧换新-sku维度
     * 1：是；0：否；
     */
    public static final int OLD_FOE_NEW_ENABLE = 1;
    public static final int OLD_FOE_NEW_UNABLE = 0;
    /**
     * 营销类目分类-0
     */
    public static final int MARKETING_CATEGORY_LV0 = 0;
    /**
     * 一级营销类目
     */
    public static final int MARKETING_CATEGORY_LV1 = 1;
    /**
     * 二级营销类目
     */
    public static final int MARKETING_CATEGORY_LV2 = 2;
    /**
     * 三级营销类目
     */
    public static final int MARKETING_CATEGORY_LV3 = 3;
    /**
     * 营销类目开启
     */
    public static final int MARKETING_CATEGORY_STATUS_ENABLED = 1;
    /**
     * 营销类目关闭
     */
    public static final int MARKETING_CATEGORY_STATUS_DISABLED = 2;

    /**
     * 店铺商品管理-修改sku状态-操作人: 10:商家，20:平台
     */
    public final static int SHOP_PRODUCT_UPDATE_SKU_STATE_SELLER = 10;
    public final static int SHOP_PRODUCT_UPDATE_SKU_STATE_EOC = 20;

    /**
     * 以旧换新 旧机标志
     */
    public final static String TAG = "旧机";

    /**
     * 登录shopType  0:没有店铺 1：自营店 2：非自营店 3：第三方品牌店
     */
    public final static int LOGIN_SHOP_TYPE_0 = 0;
    public final static int LOGIN_SHOP_TYPE_1 = 1;
    public final static int LOGIN_SHOP_TYPE_2 = 2;
    public final static int LOGIN_SHOP_TYPE_3 = 3;


    /**
     * EOC-店铺商品管理最大导出数量
     */
    public final static long SHOP_PRODUCT_MAX_EXPORT_COUNT = 60000;

    public final static int SEARCH_TOTAL = 1000;

    /**
     * 扣点待审核
     */
    public final static int REBATE_WAIT_AUDIT = 1;

    /**
     * 扣点审核通过,已生效
     */
    public final static int REBATE_AUDIT_PASS = 2;

    /**
     * 扣点审核驳回
     */
    public final static int REBATE_AUDIT_REJECT = 3;

    /**
     * 扣点未设置
     */
    public final static int REBATE_NOT_SET = 4;

    /**
     * 扣点分布式锁前缀
     */
    public final static String REBATE_LOCK_KEY = "rebate_lock_key";


    /**
     * eoc_店铺群组_redisKey前缀
     */
    public final static String EOC_SHOP_GROUP_CONFIG_REDIS_KEY_PREFIX = "eoc_shop_group_config_";
    public final static String EOC_SHOP_GROUP_CONFIG_GROUPS = "groups";
    public final static String EOC_SHOP_GROUP_CONFIG_MEMBERS = "members";

    /**
     * 秒杀专场redisKey 前缀
     */
    public final static String SPECIALTY_KEY_PREFIX = "specialty_key_prefix";
    public final static String SPECIALTY_ACTIVITY_IDS = "specialty_activity_ids";
    public final static String SPECIALTY_ACTIVITY_VALUE = "specialty_activity_value";
    public final static String LAST_ROBBERY = "last_robbery";

    /**
     * 购买上限-设置单个订单内SKU购买上限
     */
    public static final String PRODUCT_LIMIT_BUY_NUM = "productLimitBuyNum";
    public static final int PRODUCT_LIMIT_BUY_NUM_DEFAULT = 999;

    /**
     * 商品限购-活动类型
     */
    public static final int PRODUCT_LIMIT_TYPE_SINGLE = 10;//单个限购活动
    public static final int PRODUCT_LIMIT_TYPE_GROUP = 20;//组合限购活动


    /**
     * 终端类型 10 h5, 20 微信小程序, 30 安卓, 40 ios
     */
    public static final int TERMINAL_TYPE_H5 = 10;
    public static final int TERMINAL_TYPE_WX = 20;
    public static final int TERMINAL_TYPE_ANDROID = 30;
    public static final int TERMINAL_TYPE_IOS = 40;

    /**
     * 支付通道 10 直连 20 网付通
     */
    public static final int CHANNEL_TYPE_DIRECT = 10;
    public static final int CHANNEL_TYPE_GNETE = 20;

    /**
     * 支付通道-前缀 REDIS-KEY
     */
    public static final String PAY_CHANNEL_ORDER_PREFIX = "pay:channel:order";

    /**
     * 超时订单取消-延时队列名称
     */
    public static final String PAY_ORDER_CANCEL_DELAY_QUEUE_PREFIX = "pay:cancel:order";
    /**
     * 支付订单缓存-延时队列名称
     */
    public static final String PAY_CACHE_ORDER_CANCEL_DELAY_QUEUE_PREFIX = "pay:cancel:pay_cache";
    /**
     * 超时设置订单地址取消-延时队列名称
     */
    public static final String NO_ADDRESS_PAY_ORDER_CANCEL__DELAY_QUEUE_PREFIX = "pay:no:address:cancel:order";

    /**
     * 异常延时队列后缀
     */
    public static final String ERROR_DELAY_QUEUE_SUFFIX = ":error";

    /**
     * 直播商品redis-key
     */
    public static final String LIVE_ACTIVITY_REDIS_KEY_PREFIX = "live_commodity_sku";


    /**
     * 是否有效商品
     * 1-有效；2无效
     */
    public static final String PRODUCT_VALID_STATUS = "1";
    public static final String PRODUCT_INVALID_STATUS = "2";

    /**
     * 2.0db配置表商品状态
     * 4-在售；5-下架；7-申请解锁
     */
    public static final int PRODUCT_ON_SALE_STATUS = 4;
    public static final int PRODUCT_SALE_OUT_STATUS = 5;
    public static final int APPLY_UNLOCK = 7;

    /**
     * 配置表是否配置了某个模块
     * 10-已配置
     * 20-未配置
     */
    public static final int IS_CONFIG = 10;
    public static final int IS_NOT_CONFIG = 20;

    /**
     * 操作类型
     * 1-修改操作
     * 2-删除操作
     */
    public static final int MODIFY_OPERATOR = 1;
    public static final int DELETE_OPERATOR = 2;

    /**
     * 跳转类型：10-商品详情;20-链接;30-直播;40-秒杀专场;50-专题模板活动
     */
    public static final int PRODUCT_DETAIL = 10;

    //商品搜索
    /**
     * 为新品
     */
    public static final String NEW_PRODUCT = "1";
    /**
     * 搜索结果隐藏
     */
    public static final String SEARCH_PAGE_HIDE = "1";

    /**
     * 专题模板活动名称
     */
    public static final String SPECIAL_TEMPLATE_NAME = "templateName";

    public static final String ENABLE_FLAG_ATTR = "enableFlag";

    public static final String STORE_ID_ATTR = "storeId";

    /**
     * 订单是否为先付款 后设置地址订单
     * 10 无设置  20 有设置
     */
    public static final int ORDER_UNSET_ADDRESS = 10;
    public static final int ORDER_SET_ADDRESS = 20;

    /**
     * token转换子token有效时间常量
     */
    public static final long SUB_TOKEN_CACHE_VALID_TIME = 86400L;

    /**
     * 限购活动个人限量前缀
     */
    public static final String PURCHASE_LIMIT_REDIS_KEY_PREDIX = "prodLimitPersonBuyNum";

    /**
     * 直降活动相关key
     */
    public static final String FALL_STOCK_NUM = "fallStockNum";
    public static final String FALL_PERSON_BUY_NUM = "fallPersonBuyNum";

    /**
     * 拼团活动相关key
     */
    public static final String GROUP_BUYING_STOCK_NUM = "groupBuyingStockNum";
    public static final String GROUP_BUYING_PERSON_BUY_NUM = "groupBuyingPersonBuyNum";
    public static final String GROUP_BUYING_USER = "groupBuyingUser";

    /**
     * 专题模板
     * 图片组件跳转其他小程序最大长度
     */
    public static final int appIdMaxLength = 128;
    public static final int originalIdMaxLength = 128;
    public static final int pagePathMaxLength = 256;

    /**
     * 会员token
     */
    public static final String DM_MEMBER_TOKEN = "dm_member_token";

    /**
     * 直降活动 是否限制用户参与 10-都限制 20-不限制 30-限制用户注册时间 40-限制仅限未下过订单的新用户能参与活动
     */
    public static final int FALL_LIMIT_USER_ALL = 10;
    public static final String FALL_LIMIT_USER_ALL_STR = "10";
    public static final int FALL_UNLIMIT_USER = 20;
    public static final String FALL_UNLIMIT_USER_STR = "20";
    public static final int FALL_LIMIT_USER_BY_TIME = 30;
    public static final String FALL_LIMIT_USER_BY_TIME_STR = "30";
    public static final int FALL_LIMIT_USER_BY_ORDER = 40;
    public static final String FALL_LIMIT_USER_BY_ORDER_STR = "40";


    /**
     * 拼团活动 是否限制成团截止时间 10-限制 20-不限制
     */
    public static final int GROUP_BUYING_TIME_LIMIT_USER_CODE = 10;
    public static final int GROUP_BUYING_TIME_UNLIMIT_USER_CODE = 20;

    /**
     * 拼团活动 是否限制用户参与 10-都限制 20-不限制 30-限制用户注册时间 40-限制仅限未下过订单的新用户能参与活动
     */
    public static final int GROUP_BUYING_LIMIT_USER_ALL = 10;
    public static final String GROUP_BUYING_LIMIT_USER_ALL_STR = "10";
    public static final int GROUP_BUYING_UNLIMIT_USER = 20;
    public static final String GROUP_BUYING_UNLIMIT_USER_STR = "20";
    public static final int GROUP_BUYING_LIMIT_USER_BY_TIME = 30;
    public static final String GROUP_BUYING_LIMIT_USER_BY_TIME_STR = "30";
    public static final int GROUP_BUYING_LIMIT_USER_BY_ORDER = 40;
    public static final String GROUP_BUYING_LIMIT_USER_BY_ORDER_STR = "40";


    /**
     * 拼团活动状态
     * 10-未开始;20-进行中;30-已停用;40已结束
     */
    public static final Integer GROUP_BUYING_STATUS_NOT_STAR = 10;
    public static final Integer GROUP_BUYING_STATUS_GOING = 20;
    public static final Integer GROUP_BUYING_STATUS_STOP = 30;
    public static final Integer GROUP_BUYING_STATUS_END = 40;

    /**
     * 拼团活动个人限购userPurchaseLimit
     */
    public static final Integer GROUP_BUYING_USER_PURCHASE_LIMIT = 0;

    /**
     * 拼团活动不限购数量前端展示
     */
    public static final Integer GROUP_BUYING_PURCHASE_LIMITS = -1;
    /**
     * 限购数量逻辑异常已超卖
     */
    public static final Integer GROUP_BUYING_PURCHASE_LIMITS_EXCEPTION = -2;
    /**
     * 是否展示活动预告 10-展示 20-不展示
     */
    public static final int FALL_NOTICE_FLAG_TEN = 10;
    public static final String FALL_NOTICE_FLAG_TEN_STR = "10";
    public static final int FALL_NOTICE_FLAG_TWENTY = 20;
    public static final String FALL_NOTICE_FLAG_TWENTY_STR = "20";

    /**
     * 我的试用 申请中 申请失败 申请成功 活动停用
     */
    public static final Integer APPLYING = 10;
    public static final Integer APPLY_FAIL = 20;
    public static final Integer APPLY_SUCCESS = 30;
    public static final Integer APPLY_ACTIVITY_STOP = 40;

    /**
     * 试用状态
     * 申请中：待抽签-0
     * 申请成功： 待登记-10、待上传-20、已上传-30、已结束-40
     * 申请失败：未中选-50
     */
    public static final Integer WAIT_LOT = 0;
    public static final Integer WAIT_REGISTER = 10;
    public static final Integer WAIT_UPLOAD = 20;
    public static final Integer ALREADY_UPLOAD = 30;
    public static final Integer ALREADY_FINISH = 40;
    public static final Integer NOT_SELECTED = 50;

    /**
     * 审核状态
     * 审核状态 10-待审核; 20-已审核; 30-已驳回; 40-审核未通过
     */
    public static final Integer WAIT_AUDIT = 10;
    public static final Integer ALREADY_AUDIT = 20;
    public static final Integer REJECTED = 30;
    public static final Integer AUDIT_FAIL = 40;

    public static final String ACTIVITY_TRIAL_APPLY_LOCK_ = "trial_apply_lock_";

    /**
     * 零点时间
     */
    public static final String ZERO_TIME = "00:00:00";

    /**
     * 每天最晚时间
     */
    public static final String FINAL_TIME = "23:59:59";

    /**
     * 活动优惠限制key
     */
    public static final String ACTIVITY_PREFERENCE_lIMIT_REDIS_KEY = "activity_preference_limit";

    /**
     * 记录
     */
    public static final String RECORDS = "records";

    /**
     * 支付时效: 0-线上支付；1-线下支付
     * 默认支付时效
     */
    public static final int ONLINE_PAY_TYPE = 0;
    public static final int OFFLINE_PAY_TYPE = 1;
    public static final long DEFAULT_EFFECTIVE_TIME = 30L;
    // 线下支付标记-redis_key
    public static final String ORDER_OFFLINE_PAY_TYPE_REDIS_KEY = "order_offLine_pay_type_";

    /**
     * 线下支付（对公转账）是否有效配置： 10-有效；20-无效
     */
    public static final int OFFLINE_PAY_TYPE_VALID = 10;
    public static final int OFFLINE_PAY_TYPE_INVALID = 20;


    public static final String USER_INFO_REDIS_PRE = "USER_INFO_";


    public static final String COUPON = "coupon";
    public static final String COUPON_CODE = "coupon_code";
    public static final String MZ_CARD = "mz_card";
    public static final String INTEGRATION = "integration";

    /**
     * 售后评价提交锁
     */
    public static final String AFTER_SALE_EVALUATION = "after_sale_evaluation_lock_";

    /**
     * redis缓存店铺key前缀
     */
    public static final String REDIS_SHOP_DETAIL_PREFIX = "shop_detail_";
    /**
     * redis缓存店铺图片
     */
    public static final String REDIS_SHOP_DETAIL_PIC_PREFIX = "shop_detail_pic_";
    /**
     * 水印
     */
    public static final String REDIS_SHOP_DETAIL_PIC_CONTENT = "格力商城入驻专用其他无效";

    /**
     * 导出Excel临时保存时间
     */
    public static final int UPLOAD_EXCEL_OSS_TIME = 20;


    /**
     * 活动商品activity_type es数值 为活动商品排序使用
     * 相隔数字为以后新增活动 排到中间做准备
     * 24-秒杀 19-买赠  14-直降  10-拼团 0-无活动 当前顺序为降序
     */
    public static final int SECKILL_ES = 24;

    public static final int FALL_DOWN_ES = 14;

    public static final int NO_ACTIVITY_ES = 0;

    public static final int GROUP_BY_ES = 10;

    /**
     * es中hits的基础属性sort
     */
    public static final String ES_HITS_BASE_SORT = "sort";
    /**
     * 商品在es排序后sort的长度 综合
     */
    public static final int ES_PRODUCT_SORT_LENGTH_KEY_COMPREHENSIVE = 8;
    /**
     * 商品在es排序后sort的长度 销售
     */
    public static final int ES_PRODUCT_SORT_LENGTH_KEY_SALES = 8;
    /**
     * 商品在es排序后sort的长度 价格
     */
    public static final int ES_PRODUCT_SORT_LENGTH_KEY_PRICE = 9;
    /**
     * 商品在es排序后sort的长度 新品
     */
    public static final int ES_PRODUCT_SORT_LENGTH_KEY_NEW = 5;
    /**
     * 批量修改操作单状态-未开始 10
     */
    public static final Integer BATCH_UPDATE_STATUS_HAS_NOT_STARTED_CODE = 10;

    /**
     * 批量修改操作单状态-进行中 20
     */
    public static final Integer BATCH_UPDATE_STATUS_UNDERWAY_CODE = 20;

    /**
     * 批量修改操作单状态-已停用 30
     */
    public static final Integer BATCH_UPDATE_STATUS_STOP_USING_CODE = 30;

    /**
     * 批量修改操作单状态-已结束 40
     */
    public static final Integer BATCH_UPDATE_STATUS_TERMINATED_CODE = 40;

    /**
     * 批量修改操作单-开始执行器
     */
    public static final String BATCH_UPDATE_JOB_HANDLER = "batchUpdateJobHandler";

    /**
     * 批量修改商品
     */
    public static final String BATCH_UPDATE_FOR_REDIS = "batchUpdate";

    /**
     * 批量修改操作单-不更新字段
     */
    public static final String BATCH_UPDATE_NOT_CHANGE = "##NOCHANGE##";

    /**
     * 批量修改操作单-修改项-sku广告语 10
     */
    public static final Integer BATCH_UPDATE_CHANGE_SKU_AD = 10;

    /**
     * 批量修改操作单-修改项-sku标签列表 20
     */
    public static final Integer BATCH_UPDATE_CHANGE_SKU_ACTIVITY_LABEL = 20;

    /**
     * 批量修改操作单-修改项-sku主图 30
     */
    public static final Integer BATCH_UPDATE_CHANGE_SKU_MASTER_PICTURE = 30;

    /**
     * 批量修改操作单-修改项-sku售价 40
     */
    public static final Integer BATCH_UPDATE_CHANGE_SKU_PRICE = 40;

    /**
     * 批量修改操作单-修改项-sku划线价 50
     */
    public static final Integer BATCH_UPDATE_CHANGE_SKU_GUIDE_PRICE = 50;

    /**
     * 批量导入最大行数
     */
    public static final int BATCH_IMPORT_MAX_LENGTH = 1000;

    /**
     * 批量导入-首页楼层 10
     */
    public static final Integer BATCH_IMPORT_TYPE_HOME_PAGE_FLOOR = 10;

    /**
     * 批量导入-商品推荐 20
     */
    public static final Integer BATCH_IMPORT_TYPE_RECOMMEND_PRODUCT = 20;

    /**
     * 批量导入-直播商品库 30
     */
    public static final Integer BATCH_IMPORT_TYPE_LIVE_PRODUCT = 30;

    /**
     * 批量导入-AR模型 40
     */
    public static final Integer BATCH_IMPORT_TYPE_AR_MODEL = 40;


    /**
     * es字段寸多个值用于term的符号
     */
    public static final String ES_SEPARATOR = "a";

    /**
     * 2.1.2 销售属性是否勾选 空或者1 勾选，2 非勾选
     */
    public static final int ATTRIBUTE_SKU_CHECK = 1;

    public static final int ATTRIBUTE_SKU_UN_CHECK = 2;

    /**
     * 店铺类目可批量导入的最大商品数量
     */
    public static final int MAX_SHOP_CATEGORY_PRODUCT_IMPORT = 1000;

    /**
     * 购物车失效原因： 10 非在售
     */
    public static final int CART_INVALID_REASON_NOT_ON_SALE = 10;

    /**
     * 购物车失效原因： 20 sku是否有效
     */
    public static final int CART_INVALID_REASON_USEFUL = 20;

    /**
     * 购物车失效原因： 30 是否在销售区域
     */
    public static final int CART_INVALID_REASON_SALE_AREA = 30;

    /**
     * 购物车失效原因： 40 无库存
     */
    public static final int CART_INVALID_REASON_INVENTORY = 40;

    /**
     * SKU
     */
    public static final String SKU_NO = "skuNo";

    /**
     * sku库存
     */
    public static final String SKU_INVENTORY = "skuInventory";

    /**
     * 商详redis key
     */
    public static final String DETAIL_FOR_REDIS = "detail_V1_";

    /**
     * 商详redis key v212 拼团、sku需求版本
     */
    public static final String DETAIL_V212_FOR_REDIS = "detail_V212_";

    /**
     * 售后服务、安装服务空标签
     */
    public static final String EMPTY_SERVICE_STR = "<p></p>";


    /**
     * 邮件文本类型
     */
    public static final String DEFAULT_TIME_TYPE = "text/plain";

    /**
     * 发送短信=1
     */
    public static final String SEND_SMS = "1";
    /**
     * 发送邮件=2
     */
    public static final String SEND_MAIL = "2";
    /**
     * 信息发送成功
     */
    public static final String IS_IT_SUCCESSFUL = "1";

    /**
     * 信息发送失败
     */
    public static final String SENT_SUCCESSFULLY = "0";

    /**
     * 分页工具类的属性
     */
    public static final String PAGING_TOOL_CLASS = "records";

    /**
     * 短信信息关闭 2
     */
    public static final Long MESSAGE_OFF = 2L;

    /**
     * 站内信已读 2
     */
    public static final Long WEBSITE_READ = 2L;

    /**
     * 物流信息 1
     */
    public static final Long LOGISTICS_NEWS = 1L;

    /**
     * 通知信息 2
     */
    public static final Long NOTIFICATION_MESSAGE = 2L;

}
