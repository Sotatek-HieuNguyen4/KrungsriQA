package interfaces;

public class LandingPageUIs {

    public static final String AGREE_BUTTON = "//span[text()='ตกลง']";

    public static final String  CAR_TYPE_FILTER_BOX = "//div[contains(text(),'ประเภทรถยนต์')]";

    public static final String CAR_DYNAMIC_OPTION = "//p[text()='%s']/parent::div//p[text()='%s']";

    public static final String CAR_TYPE = "//div[@class='container']/div[1]/div[not(contains(@style,'display: none'))]//p[text()='%s']/parent::div";

    public static final String  CAR_BRAND = "//p[text()='ยี่ห้อรถยนต์']/parent::div//p[text()='%s']";

    public static final String  CAR_MODEL = "//p[text()='รุ่นรถยนต์']/parent::div//p[text()='%s']";

    public static final String  CAR_SUB_MODEL = "//p[text()='รุ่นย่อยรถยนต์']/parent::div//p[text()='%s']";

    public static final String CAR_REGIS_YEAR = "//p[text()='%s'][1]";

    public static final String  CAR_REGIS_PROVINCE = "//div[@class='modal__carprovince_search_container']//div[not(contains(@class,'modal__carprovince_search_container_mobile'))]//input[@id='province-autocomplete']";

    public static final String  PROVINCE = "//div[text()='%s']";

    public static final String  CAR_INSURANCE_TYPE = "//p[text()='%s']";

    public static final String  CONTINUE_BTN = "//p[text()='ดำเนินการต่อ']";

    public static final String  SUBMIT_FILTER_BTN = "//p[@class='insuaranceplan__submit--text']";

    public static final String  FILTER_RESULT_TEXT = "//span[text()='ประกันภัยรถยนต์ยอดนิยม']";

    public static final String HOME_LINK = "//a[contains(text(),'หน้า')]";
}
