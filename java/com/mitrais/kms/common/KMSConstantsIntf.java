/* 
 * $Header: /cvsrepos/mmsv50/mmsv50/src/java/com/mitrais/kms/common/KMSConstantsIntf.java,v 1.32 2011/11/22 01:18:54 sony_y Exp $
 *
 * KMSConstantsIntf.java
 *
 * Copyright (c) 2004, PT. Mitrais, Kuta, Bali, Indonesia
 * All rights reserved.
 *
 */
package com.mitrais.kms.common;

import com.mitrais.kms.admin.calendarview.components.CalendarDayView;

/**
 * <p>
 * Interface containing all constants in MMS.
 * </p>
 * 
 * @author DIONISIUS
 */
public interface KMSConstantsIntf {
	
	// menu specific constants
	public static final String REFERENCE_PARAMETER = "ref";
	public static final String BLANK_SCREEN = "topMenu.jsp";
	public static final String LANDING_PAGE = "landingPage";
	
	public static final String ACTION_TYPE_MENU_DO_NOTHING = "0";
    public static final String ACTION_TYPE_MENU_OPEN_IN_CONTENT = "1";
    public static final String ACTION_TYPE_MENU_OPEN_NEW_WINDOW = "2";
    public static final String ACTION_TYPE_MENU_OPEN_NEW_WINDOW_OFFSET_DEFINED = "3";
    public static final String ACTION_TYPE_MENU_OPEN_IN_CURR_WINDOW = "4";
    
    public static final String MODULE_TYPE_OUTPATIENT = "OUTP";
    public static final String MODULE_TYPE_DIAGNOSTICSUPPORT = "DGS";
    public static final String MODULE_TYPE_WARDADMISSION = "WARD";
    public static final String MODULE_TYPE_PUBLICHEALTH = "PHLT";
    public static final String MODULE_TYPE_REGISTRATION = "REG";
    public static final String MODULE_TYPE_MCU_REGISTRATION = "MCU";
    
    public static final String WARD_TYPE_ADMISSION = "ADMISSION";
    public static final String REFERENCE_OUTPATIENT = "OUTP_SCHD";
    public static final String REFERENCE_DIAGNOSTICSUPPORT = "DGS_SCHD";
    public static final String REFERENCE_WARDADMISSION = "WARD_SCHD";
    public static final String REFERENCE_PUBLICHEALTH = "PHLT_SCHD";
    
    public static final String MENU_TYPE_REGULAR = "R";
    public static final String MENU_TYPE_SCREEN = "S";
    
    public static final String MMS_ROOT_MENU = "000000000";
    public static final String CHANGE_PASSWORD_MENU_ID = "999999999";
    public static final String OUTPATIENT_MENU_ID = "400130000";
    public static final String DIAGNOSTICSUPPORT_MENU_ID = "400070000";
    public static final String WARDADMISSION_MENU_ID = "400240000";
    public static final String PUBLICHEALTH_MENU_ID = "400160000";
    public static final String REGISTRATION_MENU_ID = "400180000";
    public static final String MCU_REGISTRATION_MENU_ID = "400180200";
    public static final String SYSTEM_CONFIGURATION = "4022";
    public static final String REGISTRATION_REF_ID = "400180008";
    public static final String SEARCH_REGISTRATION_MENU_ID = "400180002";
    public static final String SEARCH_REGISTRATION_REF = "searchRegRef";
    public static final String SEARCH_APPOINTMENT_REF = "400030001";
    public static final String REG_SCHEDULE_AFTER = "1";
    
    // screen path
    public static final String SCREEN_PATH_SEPARATOR = ";";
	
    // role specific constants
    public static final String ROLE_ID_HEAD_NURSE = "FLPUP";
    public static final String ROLE_REGISTRATION = "4018";
    public static final String ROLE_WARD = "402401";
    public static final String ROLE_ICU = "402404";
    public static final String ROLE_DISPENSARY = "DISPS"; // dispensary role
    public static final String CTX_MEDICAL_HISTORY_VIEW_ROLE = "MHVIEW"; // medical record locking role
    public static final String CTX_MEDICAL_HISTORY_LOCK_ROLE = "MHLOCK";
    public static final String ROLE_TYPE_FOR_TARIFF= "T";
    public static final String ROLE_CHANGE_TREATMENT_CLASS = "TREA";
    public static final String IS_HAS_ROLE_CHANGE_TREATMENT_CLASS = "isHasRoleChangeTreatment";
	public static final String REPORT_BLANK_TITLE = "";
    public static final String CTX_IMG_LIST = "imageList";
    public static final String CTX_XRAY_IMG_LIST = "xRayImageList";
    public static final String CTX_XRAY_IMG_DICOM_FILE_PATH = "dicomFilePath";
    public static final String VIEW_IMAGE_ONLY = "viewOnly";
    public static final String CTX_IS_NEW = "isNew";
    public static final String GENERIC_SEPARATOR = ";";
    public static final String SPACE_STRING = " ";
    public static final String KEY_SEPARATOR = "-";
    public static final String EQUAL_SEPARATOR = "=";
    public static final String PLUS_OPERATOR = "+";
    public static final String CTX_USER_VALUES = "userValuesList";

    // the "usual" name of PK Field in Hibernate Persistence Class plus dot (".")
    public static final String COMPID_DOT = "compId.";
    public static final String DEFAULT_SELECTED_COUNT = " count(*) ";
    public static final String OPERAND_PLUS_AS_JOIN = "(+)";
    public static final int DEFAULT_RECSTART = 0;
    public static final String FLAG_TRUE = "1";
    public static final String FLAG_FALSE = "0";
    //add this so the literal will be clear enough
    public static final String FLAG_ACTIVE = "1";
    public static final String FLAG_NOTACTIVE = "0";
    public static final String DEFAULT_FLAG = FLAG_FALSE;
    public static final String FWD_ERROR_ADD = "errorAdd";
    public static final String FWD_SUCCESS_ADD = "successAdd";
    public static final String FWD_SHOW_VACC_HIST = "showVaccHistory";
    public static final String FWD_ERROR_MERGED = "errorMerged";

    // just a flag for indicating no boolean preference
    public static final String FLAG_TRUEFALSE = "TF";
    public static final String BOOLEAN_TRUE = "true";
    public static final String BOOLEAN_FALSE = "false";
    public static final String PREF_LANG = "prefLang";
    public static final String USER_ID = "userId";
    public static final String USER_LAST_LOGIN = "lastLogin";
    public static final String LAST_ACCESS_TIME = "loginTime";
    public static final String USER_ROLES = "userRoles";
    public static final String STAFF_NAME = "staffName";
    public static final String STAFF_TYPE = "staffType";
    public static final String WH_ACCESS_ROLE_IDS = "whRoleIds";
    public static final String WH_ACCESS_WH_LOOKUP = "whLookups";
    public static final String WH_ACCESS_DISP_LOOKUP = "whDispLookups";
    public static final String WH_ACCESS_WH_ID = "whIds";

    // Role type
    public static final String LOOKUP_TYPE_ROLE_TYPE = "ROL_TYPE";
    public static final String LOOKUP_CODE_ROLE_TYPE_WAREHOUSE = "W";
    public static final String LOOKUP_CODE_ROLE_TYPE_ROLE = "R";
    public static final String CTX_ROLE_TYPE = "roleType";
    public static final String CTX_ROLE_TYPE_MAP = "roleTypeMap";
    public static final String PASS = "Pass";
    public static final String LOOKUP_TYPE_BODYSGMT = "BODYSGMT";
    public static final String FAIL = "Fail";
    public static final String LANG_ENGLISH = "en";
    public static final String LANG_INDONESIA = "in";
    public static final String DEFAULT_LANG = "en";
    public static final String LOCAL_LANG = "loc";
    public static final String EMRG_BODYSEGMENT = "EMRG_BODYSEGMENT";
    public static final String CTX_USE_DELAYED_DATAENTRY = "isUseDelayedDataEntry";

    // Super User constants (these should be fixed values)
    public static final String SUPER_USER_ROLE_ID = "SA102";
    public static final String TABLE_TYPE_SUPER_USER = "SPR_USER";
    public static final String CTX_SUPER_USER_LOGIN = "isSuperUserLogin";
    public static final String ALL_APPOINTMENT_ROLE_ID = "ALAPON";
    public static final String LOOKUP_CURRENCY_DEFAULT = "IDR";
    public static final String LOOKUP_CURRENCY_DEFAULT_FLAG = "DEFAULT";
    public static final String SPRING_CONFFILE_LOC = "C:/resinport100/webapps/KMS/WEB-INF/classes/applicationContext-hibernate.xml";
    public static final String NUMERIC_SEQUENCE_BEAN_ID = "NumericSequenceBOTarget";

    public static final String ROLE_ID_STORETRANSFER_APPROVAL = "ST_APP";
    public static final String ROLE_ID_PURCHASEORDER_APPROVAL = "PO_APP";
    public static final String ROLE_ID_PRESC_RETURN_APPROVAL = "401504";
    public static final String ROLE_ID_GRN_PRICE = "GRNP";
    public static final String CTX_STORETRANSFER_PATH = "storeTransferEdit.do?act=Show";

    //    For System Configuration Service File
    public static final String SYST_COF_SERV_BEAN_ID = "ConfService";
    public static final String SYST_SCREEN_SERV_BEAN_ID = "ScreenService";
    
    // form submission
    public static final String TOKEN_NO_NEED_TO_BE_CREATED = "tokenNoNeedToBeCreated";
    public static final String TOKEN_NO_NEED_TO_BE_VALIDATED = "tokenNoNeedToBeValidated";
    public static final String FROM_MED_ACTN_POP_UP = "fromMedActnPopUp";
    
    // For User Defined Field Service File
    public static final String SPRING_USER_FLD_DEFINED_CLASS = "UserDefinedFieldService";
    public static final String SPRING_USER_FLD_DEFINED_SEARCH_MGR_CLASS = "UserDefinedFieldSearchManager";
    public static final String MODE_USR_DEF_FLD = "USR_FLD";
    public static final String CTX_SCR_HAS_FLDS = "screenHasFields";
    public static final String CTX_USR_FLDS = "usrFlds";
    public static final String LOOKUP_TYPE_FLD_TYPE = "USRFLD";
    public static final String CTX_MAP_FLD_TYPE_LIST = "mapFldTypeList";
    public static final String CTX_FLD_TYPE_LIST = "fldTypeList";
    public static final String LOOKUP_TYPE_FLD_STATUS = "USRSTAT";
    public static final String CTX_MAP_FLD_STATUS_LIST = "mapFldStatusList";
    public static final String USR_SCR_FLD_MAP = "usrScrFldMap";
    public static final String USR_SCR_FLD_PKS_MAP = "usrScrFldPksMap";
    public static final String CTX_USR_DEF_ENT_ID = "usrDefEntityId";
    public static final String USER_VALUE_SERVICE = "UserValuesService";

    // TODO : this constant's redundant.
    // For Service module service file
    public static final String SERV_SERV_BEAN_ID = "ServService";

    // For Service module service Search Manager
    public static final String SERV_SERV_SCH_MGR_BEAN_ID = "ServServiceSearchManager";
    public static final String PATIENT_SCH_MGR_BEAN_ID = "PatientSearchFromWebManager";
    public static final String SPRING_PUBLIC_HEALTH_BO = "PublicHealthBO";

    // registration
    public static final String REG_ITEM_SCH_MGR_BEAN_ID = "RegItemSearchManager";
    public static final String APPT_REG_ITEM_SCH_MGR_BEAN_ID = "ApptRegItemSearchManager";
    public static final String PATIENT_TYPE_REGULAR = "P";
    public static final String PATIENT_TYPE_APPOINTMENT = "A";
    public static final String SCREEN_APPT_PATIENT_DETAIL = "apptPatientDetailShow";
    public static final String SCREEN_REGISTRATION_NORMAL_SEARCH = "actvRegShow";
    public static final String SCREEN_APPOINTMENT_REGISTRATION = "apptActvRegShow";
    public static final String SCREEN_ACTV_REVIEW_SHOW = "actvReviewShow.do";
    public static final String SCREEN_PROMPT_FLAG = "screenPromptFlag";
    public static final String LOOKUP_TYPE_EXC_SVC = "EXC_SVC";
    public static final String SCREEN_REFERENCE_APPOINTMENT = "400030002";

    // Examination Default Time Interval
    public static final int DEF_EXAM_TIME_MINUTE = 20;
    public static final String DEF_EXAM_TIME_TYPE = "SCH_ITVL";
    public static final String DEF_EXAM_TIME_CODE = "DEFAULT";

    // User Time Tolerance
    public static final int DEF_INT_TIME = 2;
    public static final String LOOKUP_TYPE_INT_TIME = "SCH_TIME";
    public static final String LOOKUP_CODE_INT_TIME = "INTTIME";
    public static final String DELAYED_DATA_ENTRY = "DDE01";

    //     Appointment Transfer
    public static final String CTX_TRANS = "modeTrans";
    public static final String MODE_TRANS = "TRANSFER";

    //    For Facility Service File
    public static final String FACILITY_SERV_BEAN_ID = "FaclService";

    // TODO : this constant's redundant.
    public static final String SERVICE_SERV_BEAN_ID = "ServService";
    public static final String MEDICAL_RECORD_SERV_BEAN_ID = "MedicalRecordService";
    public static final String MEDICAL_RECORD_SEARCH_SERV_BEAN_ID = "MedicalRecordSearchService";
    public static final String SPRING_PERSONNEL_INTF_TO_ELLIPSE = "PersonnelIntfToEllipse";
    public static final String SPRING_OPERATION_MAINTENANCE_TO_ELLIPSE = "OperationMaintenanceToEllipse";
    public static final String SPRING_MATERIAL_INTF_TO_ELLIPSE = "MaterialIntfToEllipse";

    // paging info which will be used in preBoxWithPaging taglib
    public static final String CTX_PAGING_INFO = "pagingInfo";

    // search result which will be iterated
    public static final String CTX_SEARCH_RESULT = "searchResult";
    public static final String CTX_SEARCH_RESULT_MAP = "searchResultMap";
    public static final String CTX_SEARCH_RESULT_2 = "searchResult2";

    public static final String CTX_SEARCH_RESULT_SEARCH_ITEM = "searchResultSearchItem";
    public static final String CTX_SEARCH_RESULT_PRESCRIBED_ITEM = "searchResultPrescribedItem";
    public static final String CTX_SEARCH_RESULT_ADJUSTED_ITEM = "searchResultAdjustedItem";

    // types of method for searching records
    public static final String CTX_SEARCH_METHODS = "searchMethods";

    //type of method for searching po sys
    public static final String CTX_PO_SYS = "purchaseSys";

    // type of method for searching po status
    public static final String CTX_PO_STATUS = "purchaseStatus";

    //constanct for lookUpType
    public static final String CTX_LOOKUP_TYPE = "lookUpType";

    // key to display button save
    public static final String CTX_SAVE_DISPLAYED = "isAddOrModDisplayed";

    // key to display button cancel
    public static final String CTX_CANCEL_DISPLAYED = "isCancelDisplayed";

    // key to display form
    public static final String CTX_FORM_DISPLAYED = "isFormDisplayed";

    // key to enable/disable payment info in invoice detail
    public static final String CTX_INVC_HAS_ITEMS = "invoiceHasItems";

    // key to enable/disable down payment info in invoice detail
    public static final String CTX_INVC_HAS_DOWNPAYMENT = "invoiceHasDownPaym";

    // key to enable/disable payment info in invoice detail
    public static final String CTX_INVC_HAS_PAYMENTS = "invoiceHasPayments";

    // key to enable/disable refund info in invoice detail
    public static final String CTX_INVC_HAS_REFUNDS = "invoiceHasRefunds";

//  key to enable/disable downpayment info payment detail
    public static final String CTX_PAYM_HAS_STANDARDPAYMENT = "paymentHasStandardPayment";

    //     key to enable/disable downpayment info payment detail
    public static final String CTX_PAYM_HAS_DOWNPAYMENT = "paymentHasDownPayment";

    // key to enable/disable treatment class (in invoice detail)
    public static final String CTX_TREATMENT_CLASS_DISABLED = "treatmentClassDisabled";
    
    // key to enable/disable treatment class (in invoice detail)
    public static final String CTX_NO_COMPANY_SPECIFIC_TARIFF = "no_company_specific_tariff";

    // key to /hide requested by (in registration actv)
    public static final String CTX_REQUESTED = "wasRequested";

    // key to /hide button view actv details
    public static final String CTX_ACTV_HAS_DETAIL = "actvHasDetail";

    // key to /hide all operational buttons
    public static final String CTX_ACTV_CLOSED_CANCELED = "actvClosedOrCanceled";

    public static final String CTX_ACTV_INACTIVE = "actvInactive";

    // types of method for searching OutStanding Payment
    public static final String CTX_OUTSTANDING_PAYMENT_LIST = "outStandingPayment";
    public static final String CTX_FROM_SEARCH_ITEM ="isFromSearchItem";
    // next detail screen, used after adding activity which contains detail
    public static final String CTX_NEXT_DETAIL_SCREEN = "nextDetailScreen";
    public static final String CTX_MENUGRPMAPP = "menuGrpMapp";
    public static final String CTX_MENUGRPMAPP_ASSIGN = "menuGrpMappAssign";
    public static final String[] EMPTY_STR_ARRAY = new String[] {  };
    public static final Object[] EMPTY_OBJ_ARRAY = new Object[] {  };


	public static final String CTX_FACL_NO = "facNo";
    public static final String CTX_FACL_TYPE = "faclType";
    public static final String CTX_FACL_STATUS = "faclStatus";
    public static final String CTX_FACL_AVAILABILITY = "faclAvailability";
    public static final String CTX_FACL_CLASS = "faclClass";
    public static final String CTX_FACL_LOCATION = "location";
    public static final String CTX_FACL_OPERATE_LICENSE = "operateLicense";
    public static final String CTX_FACL_CALIBRATION_CERT = "calibrationCert";
    public static final String SLCT_EXIST_TABLE_CODE = "SLCT_EXIST";
    public static final String CTX_FACL_SERV = "faclServ";

    public static final String CTX_BOOK_STATUS = "bookStatus";
    public static final String CTX_BOOK_ITEM_STATUS = "bookItemStatus";
    public static final String CTX_BOOK_HEADER_STATUS = "headerStatus";
    public static final String CTX_TOTAL_ITEM = "totalItem";

    public static final String SPRING_CONFFILE_NAME = "applicationContext-hibernate.xml";

    // to be set in userDetail*
    public static final String CTX_MENUGRP = "menuGrp";
    public static final String CTX_ROLE = "role";
    public static final String CTX_ROLE_ASSIGN = "roleAssign";
    public static final String CTX_ROLE_AVAIL = "roleAvail";
    public static final String CTX_LANGUAGE = "language";
    public static final String CTX_YN = "YN";
    public static final String YES = "Y";
    public static final String NO = "N";
    public static final String CTX_USERGRP = "userGrp";
    public static final String CTX_USERGRP_ASSIGN = "userGrpAssign";
    public static final String CTX_LOGIN_USER = "loginUser";
    public static final String CTX_ROLE_MENUGRP = "roleMenuGrp";
    public static final String CTX_ROLE_MENUGRP_ASSIGN = "roleMenuGrpAssign";
    public static final String CTX_SVC_SECTION = "svcSection";
    public static final String CTX_SVC_SERVICE = "svcService";
    public static final String CTX_SVC_STAFF = "svcStaff";
    public static final String CTX_SVC_VISIT_STATUS = "svcVisitStatus";
    public static final String CTX_SVC_VISIT_TODAY = "svcVisitToday";
    public static final String CTX_SVC_VISIT_DATE = "svcVisitDate";
    public static final String CTX_SVC_MR_NO = "svcMrNo";
    public static final String CTX_SVC_ROLE_MAPP = "svcRoleMapp";
    public static final String CTX_EMPLOYEE_TYPE_EMPLOYEE = "INCO";
    public static final String CTX_EMPLOYEE_TYPE_OTHER = "OTH";
    public static final String CTX_EMPLOYEE_TYPE_CONTRACTOR = "CT";

    // Gender Type
    public static final String CTX_GENDER_MALE = "M";
    public static final String CTX_GENDER_FEMALE = "F";
    public static final String CTX_IS_MALE = "isMale";
    // Marital Status
    public static final String CTX_GENDER_SINGLE = "S";
    public static final String CTX_GENDER_MARRIED = "M";

    // Rhesus Type
    public static final String CTX_RHE_POS = "POS";
    public static final String CTX_RHE_NEG = "NEG";
    public static final String MODE_UPD = "UPD";
    public static final String MODE_ADD = "ADD";
    public static final String MODE_DEL = "DEL";
    public static final String MODE_POP = "POP";
    public static final String MODE_VIEW = "VIEW";
    public static final String MODE_DEACT = "DEACT";

    /* Supply  */
    public static final String FWD_ALLOCATE_ITEM = "allocateItem";
    public static final String MODE_APPROVE = "APRV";
    public static final String MODE_FULFILL = "FFL";
    public static final String MODE_SUBMIT = "SBMT";
    public static final String MODE_RECEIVE = "RECV";
    public static final String MODE_BLANK = "BLANK";
    public static final String MODE_ADD_ITEM = "ADD_ITEM";
    public static final String MODE_COMPLETE_ITEM = "COMPLETE_ITEM";
    public static final String MODE_ALLOCATE_ITEM = "ALLOCATE_ITEM";
    public static final String MODE_ISSUED_ITEM = "ISSUED_ITEM";
    public static final String MODE_PRINT_INVOICE = "PRINT_INVOICE";
    public static final String MODE_UPDATE_SOH = "updateSOH";
    public static final String CTX_MODE = "mode";
    public static final String STATUS_CLOSED = "C";
    public static final String STATUS_CANCELLED = "D";
    public static final String STATUS_OPEN = "O";
    public static final String STATUS_WAITING = "W";
    public static final String STATUS_SCHEDULED = "S";
    public static final String CTX_STATUS = "status";
    public static final String CTX_SUP_MAT_TRANSACT_PAYMENT_STATUS = "supplyMatTransactPaymentSts";
    public static final int PAGE_SIZE = 10;
    public static final int PAGE_SIZE_BLOCK_VIEW = 6;
    public static final String LOOKUP_TYPE_SEARCH_METHOD = "SR_MET";
    public static final String LOOKUP_TYPE_MENU_ITEM = "SC_MNU";
    public static final String LOOKUP_TYPE_ACCESS = "ACC";
    public static final String LOOKUP_TYPE_YN = "GE_YESNO";
    public static final String YES_NO_LIST = "yesNoList";
    public static final String LOOKUP_TYPE_LANG = "GE_LANG";
    public static final String LOOKUP_TYPE_PO_SYS = "SU_PRSYS";
    public static final String LOOKUP_TYPE_PO_STATUS = "SU_POST";
    public static final String LOOKUP_TYPE_MCU_TYPE = "MCU_TYPE";
    public static final String LOOKUP_TYPE_MCU_ITEM = "MCU_ITM";
    public static final String LOOKUP_TYPE_SECTION = "GE_SCC";
     public static final String LOOKUP_TYPE_SERVICE = "GE_SVC";
    public static final String LOOKUP_TYPE_AMND_SERVICE = "AMND_SVC";
    public static final String LOOKUP_TYPE_SERVICE_MAP = "MFSV_MAP";
    public static final String LOOKUP_TYPE_SECTION_SERVICE = "SCC_SVC";
    public static final String LOOKUP_TYPE_ACTIVITY_FLAG = "ACTV_FLG";
    public static final String LOOKUP_TYPE_STAFF_DOCTOR = "D";
    public static final String LOOKUP_TYPE_STAFF_THERAPIST = "T";
    public static final String LOOKUP_TYPE_STAFF_NURSE = "N";
    public static final String LOOKUP_TYPE_STAFF_NUTRITIONIST = "Z";
    public static final String LOOKUP_TYPE_PATIENT = "P";
    public static final String LOOKUP_TYPE_ACTV_STATUS = "RI_AS";
    public static final String LAST_UPDATE_BY_TRIGGER = "system";

    // Formulir Template
    public static final String LOOKUP_TYPE_FORMULIR_TMP = "TMP_RPT";
    public static final String CTX_FORMULIR_TEMPLATE = "listFormulirTemplate";
    public static final int LOWER_NO_ITEM = 1;
    public static final int HIGHER_NO_ITEM = 1001;

    // Lookup type for Emergency
    public static final String EMERGENCY_SERVICE_CODE = "SV32";
    public static final String LOOKUP_TYPE_CODE = "MR_ERT";
    public static final String LOOKUP_TYPE_ACCIDENTAL = "MR_ACT";
    public static final String LOOKUP_TYPE_TRIAGE_CLASS = "MR_TSC";
    public static final String LOOKUP_TYPE_EMRG_DISMISSAL = "MR_EDC";
    public static final String LOOKUP_TYPE_TRIAGE_DISMISSAL = "MR_TDC";
    public static final String LOOKUP_TYPE_SEVERITY_CATEGORY = "GNRL";    
    public static final String MR_TYPE_EMERGENCY = "03";
    // Lookup type for Emergency Work accident part
    public static final String OTHER_ACCD_OPTION = "ACTJ";
    public static final String WORK_ACCD_OPTION = "ACTA";
    public static final String LOOKUP_TYPE_INJURY_KIND = "AR_IK";
    public static final String CTX_INJURY_KIND_LIST = "injuryKindList";
    public static final String LOOKUP_TYPE_BODY_PART = "AR_BP";
    public static final String CTX_BODY_PART_LIST = "bodyPartList";
    public static final String LOOKUP_TYPE_ACC_TYPE = "AR_TYPE";
    public static final String CTX_ACC_TYPE_LIST = "accdTypeList";
    public static final String LOOKUP_TYPE_SUB_PRAC = "AR_ICSP";
    public static final String CTX_SUB_PRAC_LIST = "subPracList";
    public static final String LOOKUP_TYPE_SUB_COND = "AR_ICSC";
    public static final String CTX_SUB_COND_LIST = "subCondList";
    public static final String LOOKUP_TYPE_PSN_FAC = "AR_BCPF";
    public static final String CTX_PSN_FAC_LIST = "personalFactorList";
    public static final String LOOKUP_TYPE_JOB_FAC = "AR_BCJF";
    public static final String CTX_JOB_FAC_LIST = "jobFactorList";

    // for LOOKUP TREATMENT CLASS
    public static final String TREATMENT_CLASS_NO = "NOTC";
    public static final String TREATMENT_CLASS_SUPERIOR = "SP";
    public static final String TREATMENT_CLASS_SUITE = "S";
    public static final String TREATMENT_CLASS_BIG_SUITE = "BS";

    // for LOOKUP PRESCRIPTION TYPE
    public static final String LOOKUP_TYPE_PRESC_TYPE = "PRSC_TYP";
    public static final String TABLE_CODE_REQ_APPRVL = "RA";
    public static final String ROLE_ID_RESTRICTED_DRUG_APPROVAL = "APPDRG";
    public static final String CTX_PRICE_CUTTING_TYPE_LIST = "PCTYPE";
    public static final String LOOKUP_TYPE_PRICE_CUTTING = "PC_TYPE";
    public static final String PRICE_CUTTING_TYPE_PERCENTAGE = "PRC";
    public static final String PRICE_CUTTING_TYPE_NOMINAL = "NOM";

    // for LOOKUP CODE PRESCRIPTION TYPE
    public static final String LOOKUP_CODE_STND = "STND";
    public static final String LOOKUP_CODE_NSTND = "NSTND";
    public static final String CTX_PRESCRIPTION_TYPE = "ctxPrescType";
    public static final String CTX_SELECTED_PRESC_TYPE = "ctxSelectedPrescType";
    public static final String CTX_READONLY = "ctxReadonly";
    public static final String CTX_PRS_WAREHOUSE_DISABLED = "isWarehouseEnabled";
    
    // for LOOKUP CODE PRESCRIPTION RETURN
    public static final String LOOKUP_CODE_PRESC_RET = "PRET_AUTO";

	public static final String CTX_PRESCRIPTION_RE_EDIT = "prescReEdit";
	public static final String LOOKUP_CODE_PRESC_RE_EDIT = "PRESC_RE_EDIT";

	// Lookup type for Outpatient
	public static final String LOOKUP_TYPE_SECTION_WHOUSE = "SECTION_WHOUSE";
    public static final String LOOKUP_TYPE_OUTP_DISMISSAL = "MR_ODC";
    public static final String LOOKUP_CODE_DISMISSAL_RECOMMEND_TO_OTHER_HOSPITAL =
        "ROS";
    public static final String GP_SERVICE_CODE = "SV01";
    public static final String SURGERY_SERVICE_CODE = "SV02";
    public static final String ENT_SERVICE_CODE = "SV03";
    public static final String INTERNAL_MEDICINE_SERVICE_CODE = "SV05";
    public static final String OPHTHALMOLOGY_SERVICE_CODE = "SV08";
    public static final String NEUROLOGY_SERVICE_CODE = "SV10";
    public static final String RADIOLOGY_SERVICE_CODE = "SV12";
    public static final String DENTAL_CLINIC_SERVICE_CODE = "SV13";
    public static final String VISION_TEST_SERVICE_CODE = "SV75";
    public static final String OPTIC_SERVICE_CODE = "SV29";
    public static final String HEARING_TEST_SERVICE_CODE = "SV26";    
    public static final String TREADMILL_SERVICE_CODE = "SV24";
    public static final String BLOOD_PRESSURE_TEST_SERVICE_CODE = "SV71";
    public static final String TRIAGE_SERVICE_CODE = "SV41";
    public static final String TRIAGE_MR_TYPE = "290";
    public static final String NUTRITION_SERVICE_CODE = "SV25";    
    public static final String PULMONOLOGY_SERVICE_CODE = "SV93";    
    public static final String ORTHOPEDY_SERVICE_CODE = "SV91";    
    public static final String PEDIATRIC_SERVICE_CODE = "SV06";
    public static final String DERMATOLOGY_SERVICE_CODE = "SV07";
    public static final String PSYCHIATRY_SERVICE_CODE = "SV11";
    public static final String PHYSIOLOGY_SERVICE_CODE = "SV102";    
    public static final String LOOKUP_CODE_DISMISSAL_ADMISSION = "ADM";
    public static final String LOOKUP_CODE_DISMISSAL_ADMISSION_EMERGENCY = "EDC4";
    public static final String LOOKUP_CODE_REVERT_TO_REFERRING_FACILITY = "RRF";
    public static final String LOOKUP_CODE_DISMISSAL_TRANSFER_OUT_HOSPITAL =
        "TOH";
    public static final String LOOKUP_CODE_DISMISSAL_TRANSFER_IN_FACILITY =
        "TIF";
    public static final String LOOKUP_CODE_DISMISSAL_REFERRED_OUT_FACILITY =
        "ROF";
    public static final String LOOKUP_CODE_DISMISSAL_REFERRED_IN_FACILITY =
        "RIF";
    public static final String LOOKUP_TYPE_PSYCHIATRY_TREATMENT = "PSY_TR";
    public static final String CTX_PSYCHIATRY_TREATMENT_LIST = "psychTreatList";
    
    //growth history
    public static final String LOOKUP_TYPE_GROWTH_HIST = "GROW_GRP";
    public static final String LOOKUP_TYPE_GROWTH_HIST_PARAM = "BOUND_PAR";
    public static final String LOOKUP_CODE_GROWTH_HIST_WEIGHT = "WEIGHT";
    public static final String LOOKUP_CODE_GROWTH_HIST_LENGTH = "LENGTH";
    public static final double INCHES_TO_CM = 2.54;
    public static final double LBS_TO_KG = 0.45359237;
    public static final String UNIT_OF_WEIGHT_LBS = "LB";
    public static final String UNIT_OF_HEIGHT_INCHES = "IN";
    
    //Constant for Emergency examination template
    public static final String EMERGENCY_SERV_CD = "SV32";
    // Orthodontist
    public static final String DENT_ORTO_ACTV_CODE = "ORT";
    public static final String MR_TYPE_ORTHODONTIC_EXAM = "023";
    public static final String CTX_DISABLE_MR_DATE = "isDisableMrDate";
    
    // Lookup type for Orthodontist
    public static final String LOOKUP_TYPE_ORTO_DISMISSAL = "MR_PDC";
    public static final String LOOKUP_TYPE_DO_ACTIVITY = "MR-DOT";
    public static final String CTX_DENT_ORTO_ITEM_LIST = "dentOrtoItemList";
    public static final String CTX_DENT_ORTO_ITEM_IS_CLOSED = "isClosed";

    // Lookup type for Physiotherapy
    public static final String LOOKUP_TYPE_PHYSIO_DISMISSAL = "MR_PDC";
    public static final String MR_TYPE_PHYSIO ="04";
    
    // Lookup type for facility
    public static final String LOOKUP_TYPE_FAC_TYPE = "FAC_TYPE";
    public static final String LOOKUP_TYPE_FAC_CLASS = "FAC_CLS";
    public static final String LOOKUP_TYPE_FAC_STATUS = "FAC_STS";
    public static final String LOOKUP_TYPE_FAC_AVAILABILITY = "FAC_AVL";
    public static final String LOOKUP_TYPE_BOOKING_STATUS = "FAC_BS";
    public static final String LOOKUP_TYPE_BOOK_ITEM_STATUS = "FAC_BIS";
    public static final String LOOKUP_TYPE_FAC_LOCATION = "HSPTL_CLNC";
    public static final String LOOKUP_TYPE_FAC_SERV = "FAC_SERV";

    // Lookup code for facility
	public static final String LOOKUP_CODE_CS_TIME_RANGE = "CS_TIME_RANGE";
	
    //LOOKUP for Amendment
    public static final String LOOKUP_TYPE_AMEND_AUTH	 = "AMND_AUTH";
    public static final String LOOKUP_CODE_AMEND_USER	 = "AMND_USER";

    //Supply Module
    public static final String LOOKUP_TYPE_SUP_GROUP_CODE = "SUP_ELGC";
    public static final String LOOKUP_TYPE_SUP_CLASS_CODE = "SUP_ELCC";
    public static final String LOOKUP_TYPE_SUP_STOCK_CLASS = "SUP_ELSC";
    public static final String LOOKUP_TYPE_SUP_STOCK_TYPE = "SUP_ELST";
    public static final String LOOKUP_TYPE_SUP_UOI = "SU_UOI";
    public static final String LOOKUP_TYPE_SUP_UOM = "SU_UOM";
    public static final String LOOKUP_TYPE_SUP_MEDIC_SUP_CLASS = "SUP_MSC";
    public static final String LOOKUP_TYPE_SUP_MEDIC_SYS = "MD_SYS";
    public static final String LOOKUP_TYPE_SUP_MEDIC_FUNCTION = "MD_FUNC";
    public static final String LOOKUP_TYPE_SUP_MEDIC_MANUFACTURE = "MD_MANF";
    public static final String LOOKUP_TYPE_SUP_WAREHOUSE_ID = "SU_WID";
    public static final String LOOKUP_TYPE_SUP_ADJUSTMENT = "SU_ADJT";
    public static final String LOOKUP_TYPE_SUP_MATERIAL_TRANSACT_HEADER_STATUS = "SU_TST";
    public static final String LOOKUP_TYPE_SUP_MATERIAL_TRANSACT_ITEM_STATUS = "SU_IST";
    public static final String LOOKUP_TYPE_SUP_GRN_HEADER_STATUS = "SU_GRST";
    public static final String LOOKUP_TYPE_SUP_GRN_ITEM_STATUS = "SU_GRIST";
    public static final String LOOKUP_TYPE_SUP_MATERIAL_TRANSACT_OUTSTANDING_STATUS =
        "SU_OST";
    public static final String LOOKUP_TYPE_SUP_TRANSACTION_TYPE = "SU_TRT";
    public static final String LOOKUP_TYPE_SUP_MATERIAL_TYPE = "SU_PRM";
    public static final String LOOKUP_TYPE_SUP_STATUS = "SU_PROST";
    public static final String LOOKUP_TYPE_SUP_PRIORITY = "SU_POP";
    public static final String LOOKUP_TYPE_SUP_POSYS = "SU_PRSYS";
    public static final String LOOKUP_TYPE_SUP_TYPE = "SUP_TYPE";
    public static final String LOOKUP_TYPE_SUP_ITEM_STATUS = "SU_POIST";
    public static final String LOOKUP_TYPE_PRESC_PAYMENT_STATUS = "PRSC_PMT";
    public static final String LOOKUP_TYPE_SUP_INV_COSTING = "INV_VAL";
    public static final String LOOKUP_CODE_SUP_COSTING_MTH = "CALC_MTD";
    public static final String LOOKUP_CODE_SUP_SELL_MARKUP = "SELL_PCT";
    public static final String LOOKUP_TYPE_SUP_PO_RECV_STS = "PORC_STS";
    public static final String LOOKUP_SUP_HOSPITAL = "HOSP";

    public static final String LOOKUP_TYPE_PRESET_SCHEME = "NP_FLG";
    public static final String LOOKUP_TYPE_STCK_MNTR = "STCK_MNTR";
    public static final String LOOKUP_CODE_MIN_PRESET = "MIN_PRESET";
    public static final String LOOKUP_CODE_MAX_PRESET = "MAX_PRESET";
    public static final String LOOKUP_CODE_MIN_THRESHOLD = "MIN_THRESHOLD";
    public static final String LOOKUP_TYPE_STCK_EXP_MNTR = "STCK_EXP_MNTR";
    public static final String LOOKUP_CODE_EXPIR_STATE = "EXPIR_STATE";
    public static final String LOOKUP_CODE_HIEXP_STATE = "HIEXP_STATE";
    public static final String LOOKUP_CODE_CRTCL_STATE = "CRTCL_STATE";
    public static final String CTX_MIN_PRESET = "minPreset";
    public static final String CTX_MAX_PRESET = "maxPreset";
    public static final String CTX_MIN_THRESHOLD = "minThreshold";

    public static final String LOOKUP_TYPE_SUP_ORDER_LEAD_TIME_UNIT = "SU_ORLEAD";

    public static final String CTX_SUP_GROUP_CODE = "supplyGroupCode";
    public static final String CTX_SUP_CLASS_CODE = "supplyClassCode";
    public static final String CTX_SUP_STOCK_CLASS = "supplyStockClass";
    public static final String CTX_SUP_STOCK_TYPE = "supplyStockType";
    public static final String CTX_SUP_UOI = "supplyUOI";
    public static final String CTX_SUP_UOM = "supplyUOM";
    public static final String CTX_SUP_MEDIC_FUNC = "supplyMedFunc";
    public static final String CTX_SUP_WAREHOUSE = "supplyWarehouse";
    public static final String CTX_SUP_WAREHOUSE_ALL = "supplyWarehouseAll";
    public static final String CTX_SUP_WAREHOUSE_MAP = "supplyWarehouseMap";
    public static final String CTX_SUP_MAP = "supplierMap";
    public static final String CTX_SUP_ADJUSTMENT = "supplyAdjustment";
    public static final String CTX_SUP_MAT_TRANSACT_HEADER_STATUS = "supplyMatTransactHeaderSts";
    public static final String CTX_SUP_MAT_TRANSACT_ITEM_STATUS = "supplyMatTransactItemSts";
    public static final String CTX_SUP_MAT_TRANSACT_OUTSTANDING_STATUS = "supplyMatTransactOutstdSts";
    public static final String CTX_SUP_TRANSACT_TYPE = "supplyTransactType";
    public static final String CTX_SUP_MAT_TYPE = "supplyMatType";
	public static final String SUP_MAT_TYPE_OTHER_VALUE = "O";	
	public static final String OTH_EMRG_RELATION_VALUE = "OTH";
    public static final String CTX_SUP_STATUS = "supplyStatus";
    public static final String CTX_SUP_PRIORITY = "supplyPriority";
    public static final String CTX_SUP_POSYS = "supplyPOSys";
    public static final String CTX_SUP_TYPE = "supplyType";
    public static final String CTX_PO_ITEM_STATUS = "itemPurchaseStatus";
    public static final String CTX_ORDER_NO = "orderNo";
    public static final String CTX_BATCH_NO = "ctxBatchNo";
    public static final String CTX_BATCH_INPUT_BUTTON_ENABLED = "ctxBatchInputButtonEnabled";
    public static final String CTX_BATCH_AVAIL_QTY = "ctxBatchAvailQty";
    public static final String CTX_BATCH_EXPIRATION_DATE = "ctxBatchExpirationDate";
    public static final String CTX_BATCH_GRN_NO = "ctxBatchGrnNo";
    public static final String CTX_BATCH_SPLR_NO = "ctxBatchSplrNo";
    public static final String CTX_BATCH_SKIP_AUTOCREATE = "ctxBatchSkipAutoCreate";
    public static final String CTX_CODE_SUP_POSYS = "MEDC";
    public static final String CTX_CODE_SUP_POSYS_ELPS = "ELPS";
    public static final String CTX_SUP_SUPPLIER = "supplierInfo";
    public static final String CTX_SUP_ORDER_LEAD_TIME_UNIT = "supplierOrderLeadTimeUnit";
    public static final String LOOKUP_SUP_STOCK_SUPPLIER = "STCK";
    public static final String LOOKUP_SUP_MED_SVC_REFF = "SVCREF";
    public static final String CTX_SUP_PO_RECV_STATUS = "poReceiptStatus";
    public static final String SPRING_RO_SEARCH = "RecommendedOrderSearchFromWebManager";
    public static final String RECV_PO_INP_FRM_UNIT_PRICE_FLAG = "RCV_PO_UNIT_PRC_FLAG";
    public static final String CTX_CATL_SPLR_LIST = "catlSplrList";
    public static final String CTX_CATL_SPLR_TOOL_TIPS_ADD = "toolTipsAdd";
    public static final String CTX_CATL_SPLR_TOOL_TIPS_MOD = "toolTipsMod";
    public static final String CTX_CATL_SPLR_TOOL_TIPS_DEL = "toolTipsDel";
    public static final String CTX_PRESET_SCHEME = "presetScheme";
    public static final String LOOKUP_SLCT_YN = "SLCT_YN";
    public static final String CTX_CATL_FORMULARY = "catlFormulary";
    public static final String CTX_HAS_GRNP_ROLE = "hasGrnpRole";
    public static final String CTX_GRN_BATCH_UPDATE_INDEX = "grnBatchUpdateIndex";
    public static final String CTX_GRN_BATCH_QTY_RECEIVED = "grnBatchQtyRecv";
    public static final String CTX_GRN_BATCH_QTY_RETURN = "grnBatchQtyReturn";
    public static final String CTX_GRN_BATCH_ACT_QTY_BUY = "grnBatchActQtyBuy";
    public static final String CTX_GRN_BATCH_QTY_IN_BATCH = "grnBatchQtyInBatch";
    public static final String GRN_HEAD_RESULTMAP_HEAD = "grnHeadResultMapHead";
    public static final String GRN_HEAD_RESULTMAP_ITEMLIST = "grnHeadResultMapItemList";
    public static final String GRN_ITEM_RESULTMAP_ITEMLIST = "grnItemResultMapItemList";
    public static final String GRN_ITEM_RESULTMAP_QTYDIFFMAP = "grnItemResultMapQtyDiffMap";
    public static final String GRN_BATCH_RESULTMAP_ITEM = "grnBatchResultMapItem";
    public static final String GRN_BATCH_RESULTMAP_BATCHLIST = "grnBatchResultMapBatchList";
    public static final String CTX_MANUAL_BATCH_ENTRY_FLAG = "ctxManualBatchEntryFlag";

    // used in method stateListAjax at apptPatientDispatchAction for JSON structure
    // please see apptPatientDetail.jsp 
    public static final String CONST_SUP_COUNTRY = "country";
    public static final String CONST_SUP_VALUE = "value";
    public static final String CONST_SUP_CAPTION = "caption";
    public static final String CONST_SUP_DEFAULT_STATE ="dState";
    public static final String COOKIE_PRES_SEARCH_METHOD = "cookiePresSearchMethod";
    public static final String COOKIE_PRES_NO = "cookiePresNo";
    public static final String COOKIE_PRES_WAREHOUSE = "cookiePresWarehouse";
    public static final String COOKIE_PRES_DOCTOR = "cookiePresDoctor";
    public static final String COOKIE_PRES_PATIENT = "cookiePresPatient";
    public static final String COOKIE_PRES_STATUS = "cookiePresStatus";
    public static final String COOKIE_PRES_CREATED_DATE = "cookiePresCreatedDate";

    // end: Supply Module
    public static final String LOOKUP_TYPE_COST_CENTER = "GE_CC";
    public static final String CTX_COST_CENTER = "costCenterList";

    // gak mau pake dulu ah
    public static final String VALUE_ALL = "";
    public static final String VALUE_EMPTY = " ";
    public static final String LIT_ALL = "All";
    public static final String FWD_ERROR = "errorPage";
    public static final String FWD_SUCCESS = "success";
    public static final String FWD_FAIL = "fail";
    public static final String FWD_DETAIL = "detail";
    public static final String FWD_PRINT = "print";
    public static final String FWD_DELETE_SUCCESS = "deleteSuccess";
    public static final String FWD_JASPER_REPORT = "jasperReportPage";
    public static final String FWD_PRINT_INVOICE = "printInvoice";
    public static final String FWD_PRINT_OUT = "printOut";

    // GENERAL FIELD LENGTH USED IN FRONT END
    public static final String DATE_LENGTH = "10";
    public static final String DATE_LENGTH_PRINT = "12";
    public static final String TIME_LENGTH = "5";
    public static final String ROOT_MENU = "ROOT";

    /** PINDAHAN DARI AdminConstantsIntf **/
    // PATIENT_DETAIL: Lookup Table_Type + List Attribute Names
    public static final String LOOKUP_TYPE_DEPT = "DEPT"; //department
    public static final String CTX_DEPT_LIST = "deptList";
    public static final String LOOKUP_TYPE_EMAIL = "EMAIL";
    public static final String LOOKUP_TYPE_EMAIL_ERROR_REPORT = "ERROR";
    public static final String DEPT_SECT = "GE_SCC"; //section
    public static final String DEPT_SECT_LIST = "sectList";
    public static final String LOOKUP_TYPE_GENDER = "PI_GDR"; //gender
    public static final String CTX_GENDER_LIST = "gedrList";
    public static final String LOOKUP_TYPE_MARITAL = "PI_MRS"; //marital type
    public static final String CTX_MARITAL_LIST = "mrtlList";
    public static final String LOOKUP_TYPE_RELIGION = "PI_RLG"; //religion
    public static final String CTX_RELIGION_LIST = "relgList";
    public static final String LOOKUP_TYPE_PATCLASS = "PTN_CL"; //patient class
    public static final String CTX_PATCLASS_LIST = "patClass";
    public static final String BLANK_CLASS = "";
    public static final String DATABASE_BLANK_VALUE = " ";

    public static final String CTX_PATIENT_HIST_LIST = "patientHistList";
    // TODO : to be removed, change reference to these constants
    public static final String CTRY = "GE_CNT"; //country
    public static final String CTRY_LIST = "ctryList";
    public static final String LOOKUP_TYPE_COUNTRY = "GE_CNT"; //country
    public static final String CTX_COUNTRY_LIST = "ctryList";
    public static final String LOOKUP_TYPE_NATIONALITY = "GE_NAT"; //nationality
    public static final String CTX_NATIONALITY_LIST = "nationList";
    public static final String LOOKUP_TYPE_BLOOD_TYPE = "PI_BT"; //bloodtype
    public static final String CTX_BLOOD_COMPONENT_PACK_LIST = "bldCompPackList";
    public static final String LOOKUP_BLOOD_COMPONENT_PACK = "BL_COM";
    public static final String CTX_BLOOD_SOURCE = "source"; //blood source
    public static final String LOOKUP_BLOOD_SOURCE = "PI_SRC";
    public static final String LOOKUP_BLOOD_SOURCE_OUT = "OUT";
    public static final String CTX_BLOOD_TYPE_LIST = "bldtList";
    public static final String LOOKUP_TYPE_RHESUS = "PI_RSH"; //rhesus
    public static final String CTX_RHESUS_LIST = "rhesList";
    public static final String LOOKUP_TYPE_OCCUPATION = "PI_OCP"; //occupation
    public static final String CTX_OCCUPATION_LIST = "occuList";
    public static final String LOOKUP_TYPE_EDUCATION = "PI_EDU"; //education
    public static final String CTX_EDUCATION_LIST = "eduList";
    public static final String LOOKUP_TYPE_PAYMENT_TYPE = "PI_PTY"; //payment type
    public static final String MULTIPLE_PAYMENT_ASSOC_VAL04 = "MTLP_PYMNT"; //multiple payment
    public static final String CTX_TYPE_MULTI_PAYMENT = "listPayment"; //multiple payment
    public static final String CTX_PAYMENT_TYPE_LIST = "paymList";
    public static final String CTX_PAYMENT_TYPE_MAP_LIST = "paymMapList";
    public static final String LOOKUP_TYPE_COSTCENTER_MAN = "CC_MC";
    public static final String CTX_COSTCENTER_MAN_LIST = "ccmcList";
    public static final String LOOKUP_TYPE_COSTCENTER_DEPT = "CC_BD";
    public static final String CTX_COSTCENTER_DEPT_LIST = "ccbdList";
    public static final String LOOKUP_TYPE_SPN_RELATION = "PI_REL"; //sponsor relation
    public static final String CTX_SPN_RELATION_LIST = "sprlList";
    public static final String LOOKUP_TYPE_INSURANCE_TYPE = "INS_TYPE"; //insurance type
    public static final String CTX_INSURANCE_TYPE_LIST = "insTypeList";
    public static final String LOOKUP_TYPE_VERIFICATION_STATUS= "VERIFY_STATUS"; //insurance verification status
    public static final String CTX_CLAIM_STAT_LIST = "clmStatusList";
    public static final String LOOKUP_TYPE_CLAIM_STATUS= "CLM_RPRT_STTS"; //insurance verification status
    public static final String LOOKUP_TYPE_RELATION = "GE_RLTN"; // Emergency contacts relation
    public static final String CTX_RELATION_LIST = "rltnList";
    public static final String CTX_CC_TYPE_LIST = "ccTypeList";
    public static final String LOOKUP_TYPE_CC_TYPE = "CC_TYPE";
    public static final String BENEFITS_TYPE_INSURANCE = "INS";
    public static final String BENEFITS_TYPE_COMPANY = "COM";
    public static final String COST_CENTER = "costCenter";
    public static final String COST_CENTER_DESC = "costCenterDesc";
    public static final String FOC_OR_BC_NOTE = "focOrBcNote";
    public static final String CARD_NUMBER = "cardNumber";
    public static final String CARD_HOLDER = "cardHolder";
    
    // for checking original payment type and insurance plan
    public static final String CTX_INS_CHECK_PAYM_TYPE = "insCheckPaymType";
    public static final String CTX_INS_CHECK_PROVIDER = "insCheckProvider";
    public static final String CTX_INS_CHECK_PLAN = "insCheckPlan";
    public static final String CTX_INS_CHECK_ORIG_PATH = "insCheckOriginalPath";
    
    public static final String CTX_VERIFY_STATUS_LIST = "verifyStatList";
    public static final String LOOKUP_TYPE_COSTCENTER_OTHER_ACC = "CC_OA"; // Cost Center, Backcharge to Other Account.
    public static final String CTX_COSTCENTER_OTHER_ACC_LIST = "ccacList";
    public static final String LOOKUP_TYPE_COMPANY_NAME = "MYOB_CDC"; // Company Name
    public static final String CTX_COMPANY_NAME_LIST = "companyNameList";
    public static final String LOOKUP_TYPE_PLAN_DESC = "PLAN"; // Plan Desc
    public static final String CTX_PLAN_DESC_LIST = "planDescList";
    public static final String CTX_SVC_CODE_AND_MR_TYPE_MAP = "svcCodeMap";
    
    public static final String LOOKUP_TYPE_FREE_DETAIL = "PMT_DT";
    public static final String CTX_FREE_DETAIL_LIST = "freeDetailList";
    public static final String LOOKUP_CODE_FREE_DETAIL_OTHER = "PTH";
    
    public static final String LOOKUP_TYPE_FOC_TYPE = "FOC_TYPE";
    public static final String CTX_FOC_TYPE_LIST = "focTypeList";
    public static final String LOOKUP_TYPE_BC_TYPE = "BC_TYPE";
    public static final String CTX_BC_TYPE_LIST = "bcTypeList";
    public static final String LOOKUP_TYPE_MERCHANT_NUMBER = "MRCHT_NMBR";
    public static final String CTX_MERCHANT_NUMBER_LIST = "merchantNumberList";

    //Staff
    public static final String LOOKUP_TYPE_STAFF_TYPE = "PI_PT";
    public static final String LOOKUP_TYPE_STAFF_TITLE = "STF_TITLE";
    public static final String CTX_STAFF_TYPE_LIST = "staffTypeList";
    public static final String CTX_STAFF_TITLE_LIST = "staffTitleList";
    public static final String CTX_STAFF_STATUS_LIST = "staffStatusList";
    public static final String LOOKUP_TYPE_STAFF_STATUS = "PI_STATUS";

    //TARIFF DETAIL:
    public static final String LOOKUP_TYPE_TARIFF_CLASS = "TF_CFN";
    public static final String CTX_TARIFF_CLASS_LIST = "tarfClassList";
    public static final String LOOKUP_TYPE_CURRENCY = "CCY";
    public static final String CTX_CURRENCY_LIST = "currencyList";
    public static final String LOOKUP_TYPE_PERIOD = "TF_PRD";
    public static final String CTX_PERIOD_LIST = "prdList";
    public static final String LOOKUP_TYPE_EXP_TYPE = "GE_EXPEL";
    public static final String CTX_EXP_TYPE_LIST = "exptList";
    public static final String EXP_TYPE_MAT_PRSC = "PRSC";
    public static final String LOOKUP_TYPE_TARIFF_TYPE = "TF_TYP";
    public static final String CTX_TARIFF_TYPE_LIST = "tarfTypeList";
    public static final String LOOKUP_TYPE_DOCTOR_FEE_TYPE = "DRFEETYP";
    public static final String CTX_DOCTOR_FEE_TYPE_LIST = "drFeeTypeList";
    public static final String LOOKUP_DEFAULT_TARIFF_CLASSIFICATION = "AUTO_CHG_REG_TRFF";
	public static final String LOOKUP_TYPE_TARIFF_CMPNY_STAT = "TF_CMPNY_STAT";
    public static final String CTX_TARIFF_CMPNY_STAT = "status";
    public static final String LOOKUP_TYPE_TARIFF_CMPNY_STAT_MAP = "TF_CMPNY_STAT";
    public static final String CTX_TARIFF_CMPNY_STAT_MAP = "statusMap";
    public static final String CATALOGUE_TARIFF_MAPPING_FORM = "catalogueTariffMappingForm";
    public static final String CATALOGUE_TARIFF_MAPPING_ISFROMALERT = "isFromAlert";
    public static final String SEARCHTYPE_NULL_TARIFF_CODE = "SearchNull";
    public static final String SINGLE_TARIFF = "SINGLE";
    public static final String MULTIPLE_TARIFF ="MLTP";

    // Discount / Charge
    public static final String LOOKUP_TYPE_ITEM_TYPE = "ITEM_TYPE";
    public static final String LOOKUP_CODE_DISC = "DISC";
    public static final String LOOKUP_CODE_SUR = "SUR";
    public static final String LOOKUP_CODE_TAX = "TAX";
    public static final String LOOKUP_CODE_NOMINAL = "N";
    public static final String LOOKUP_CODE_PERCENTAGE = "P";
    public static final String CTX_ITEM_TYPE_LIST = "itemTypeList";
    public static final String CTX_CALC_TYPE_LIST = "calcTypeList";
    public static final String CTX_ITEM_TYPE_MAP = "itemTypeMap";
    public static final String CTX_CALC_TYPE_MAP = "calcTypeMap";
    public static final String CTX_MAP_LOOKUP_DISC_CHARGE = "mapLookupDiscCharge";
    public static final String CTX_DISC_CHARGE_LIST = "discChargeList";

    // Medical Fee & Tariff Original Customization
    public static final String SPRING_TARIFF_ORIGINAL_SEARCH = "TariffOriginalSearchFromWebManager";
    public static final String SPRING_DISCOUNT_CHARGE_SEARCH = "DiscChargeSearchFromWebManager";
    public static final String SPRING_TARIFFPATIENT_BO = "TariffPatientBO";

    //REGISTRATION
    public static final String CTX_SERVICE_LIST = "servList";
    public static final String LOOKUP_CODE_REGULAR_REG_TYPE = "R";
    public static final String LOOKUP_CODE_APPOINTMENT_REG_TYPE = "A";
    public static final String ORACLE_DATE_FORMAT_ONLY = "DD-MM-YYYY";
    public static final String ORACLE_DATETIME_FORMAT = "DD-MM-YYYY HH24:MI";
    public static final String ORACLE_DATETIME_FORMAT_SLASH = "DD/MM/YYYY HH24:MI";

    // Appointment Registration
    public static final String LOOKUP_TYPE_PATIENT_TYPE = "PTN_TP";
    public static final String CTX_PATIENT_TYPE_LIST = "patientType";

    // Non Registration Schedule
    public static final String LOOKUP_TYPE_SCHEDULE_TYPE = "SC_TYPE";
    public static final String CTX_SCHEDULE_TYPE_LIST = "scheduleType";
    public static final String CTX_SCHEDULE_TYPE_LIST_OTHER = "OTH";
    //    public static final String SECT = "GE_SCC";                //section
    public static final String CTX_SECTION_LIST = "sectList";
    public static final String CTX_SECTION_MAP = "sectMap";
    public static final String CTX_MAP_REG_TYPE_LIST = "mapRegTypeList";
    public static final String LOOKUP_TYPE_REG_TYPE = "REG_TYPE";
    public static final String CTX_MAP_ACTV_LIST = "mapActvList";
    public static final String CTX_MAP_ACTV_FLAG_LIST = "mapActvFlagList";

    public static final String CTX_MAP_SERVICE_LIST = "mapServiceList";

    //pake visit aje
    //public static final String STAT_TYPE = "RI_VS";            //reg status
    //public static final String STAT_TYPE_LIST = "statTypeList";
    public static final String DOCTOR_LIST = "doctorList";
    public static final String LOOKUP_TYPE_DOCCLASS = "DOC_CL"; //doctor class
    public static final String CTX_DOCCLASS_LIST = "docClass";

    // TODO : find out the difference between RI_AS and RI_VS
    public static final String LOOKUP_TYPE_VISIT_STATUS = "RI_VS"; //visit status
    public static final String CTX_VISIT_STATUS_LIST = "visitList"; //visit status
    public static final String CTX_VISIT_STATUS_MAP = "visitStatusMap"; //visit status
    public static final String CTX_ACTV_STATUS_LIST = "actvStatusList";
    public static final String CTX_VISIT_STATUS = "visitStatus";
    public static final String CTX_SECTION_SERVICE_LIST = "sectionServiceList";
    public static final String CTX_SERVICE_NEED_REDIRECT_LIST = "serviceNeedRedirectList";
    public static final String CTX_STAFF_LIST = "staffList";
    public static final String CTX_USER_ROLE_LIST = "userRoleList";
    public static final String CTX_USER_ROLE = "userRole";
    public static final String PHARMACY_ROLE_ID = "[RWH200]";
    public static final String DISPENSARY_ROLE_ID = "DISPS";
    public static final String LOOKUP_TYPE_EMRG_CASE = "MR_ERT";
    public static final String CTX_EMRG_CASE_LIST = "emrgCaseList";
    public static final String LOOKUP_TYPE_MCU_CATEGORY = "XX_MCP";
    public static final String CTX_MCU_CATEGORY_LIST = "MCUTypeList";
    public static final String LOOKUP_TYPE_EXAM_GROUP = "GE_EXMGR";
    public static final String CTX_EXAM_GROUP_LIST = "examGroupList";
    public static final String LOOKUP_TYPE_EXAM_ITEM = "GE_EXM";
    public static final String CTX_EXAM_ITEM_LIST = "examItemList";
    public static final String EXAM_ASSOC_VAL_01 = "assocVal01";
    public static final String EXAM_ITEM_DESC = "examItemDesc";    
    public static final String CTX_SERVICE_STAFF_RESULT = "serviceStaffResult";
    public static final String OUT_REF_RANGE_SCREENING = "S";
    public static final String OUT_REF_RANGE_CONFIRM = "C";

    // lookup where table_type GE_EXM but assoc_val_03 = 1|1 is only dummy
    public static final String EXAM_CODE_DUMMY = "1|1";
    public static final String EXAM_CODE_NORMAL = "0|0";
    public static final String EXAM_CODE_VALUE_ONLY = "1|0";

    // INVOICE related
    public static final String LOOKUP_TYPE_INV_STAT = "XX_IS";
    public static final String INV_STAT_NEW = "N";
    public static final String INV_STAT_CANCELED = "C";
    public static final String CTX_INV_STAT_LIST = "invStatusList";
    public static final String CTX_INV_TYPE_LIST = "invTypeList";
    public static final String LOOKUP_TYPE_INV_TYPE = "INV_TYPE";
    public static final String CTX_MGN_CONT_PATIENT_TYPE_LIST = "mgnContPatientTypeList";
    public static final String LOOKUP_TYPE_MGN_CONT_PATIENT_TYPE = "MC_TYPE";
    public static final String CTX_NUM_ACTIVE_ITEMS = "noOfActiveItems";
    public static final String SPRING_STAFF_SEARCH = "StaffSearchFromWebManager";
    public static final String SPRING_INVOICE_SEARCH = "InvoiceSearchFromWebManager";
    public static final String CTX_COMPLETEDDATE_ENABLED = "completedDateEnabled";
    public static final String REV_ADJ_BUTTON_SHOW = "revAdjButtonShow";
    public static final String REV_ADJ_TYPE = "revAdjType";
    public static final String REV_ADJ_TYPE_COMPLETE = "CO";
    public static final String REV_ADJ_TYPE_CREDIT_NOTE = "CN";
    public static final String REV_ADJ_TYPE_DEBIT_NOTE = "DN";
    public static final String REV_ADJ_ITEM = "ITEM";
    public static final String REV_ADJ_ADJUST = "ADJUST";
    public static final String REV_ADJ_IS_CREDIT = "isCredit";
    public static final String REV_ADJ_STATUS_NEW = "NEW";
    public static final String REV_ADJ_STATUS_APPROVED = "APPROVED";
    public static final String REV_ADJ_STATUS_CANCELLED = "CANCELLED";
    public static final String REV_ADJ_STATUS_REFUNDED = "REFUNDED";
    public static final String REV_ADJ_STATUS_INVOICED = "INVOICED";
    public static final String REV_ADJ_SEARCH_ITEMS = "revAdjItems";
    public static final String REV_ADJ_TOTAL_VALUE = "revAdjTotalValue";
    public static final String REV_ADJ_TOTAL_VALUE_ROUNDED = "revAdjTotalValueRounded";
    public static final String REV_ADJ_TOTAL_DISC = "revAdjTotalDisc";
    public static final String REV_ADJ_TOTAL_TAX = "revAdjTotalTax";
    public static final String REV_ADJ_TOTAL_DEVIATION = "revAdjTotalDeviation";
    public static final String REV_ADJ_TOTAL_VALUE_AFTER_REVADJ = "revAdjTotalValueAfterRevAdj";
    public static final String REV_ADJ_TOTAL_VALUE_AFTER_REVADJ_ROUNDED = "revAdjTotalValueAfterRevAdjRounded";
    public static final String CTX_REV_ADJ_ITEMS_LIST = "invcRevAdjItemsList";
    public static final String CTX_REV_ADJ_HAS_ITEMS = "invcRevAdjHasItems";
    public static final String REV_ADJ_FORM_LITERAL = "InvcRevAdjForm";
    public static final String CTX_INV_ADJ_CREATE_ROLE = "ADJCRT";
    public static final String CTX_INV_ADJ_APPROVE_ROLE = "ADJAPP";
    public static final String CTX_INV_ADJ_REFUND_ROLE = "ADJRFD";
    public static final String CTX_INV_ADJ_INVOICE_ROLE = "ADJINV";
    
    public static final String INV_ADJ_ITEM_TYPE = "ADJ";
    public static final String INV_ADJ_TARIFF_CODE = "ADJ01";
    
    public static final String MEDN_ACTN_BUTTON_SHOW = "mednActnButtonShow";
    public static final String ADD_PAYM_BUTTON_SHOW = "addPaymButtonShow";
    public static final String INVC_COMPLETE_BUTTON_SHOW = "invcCompleteButtonShow";
    public static final String INVC_PRINT_BUTTON_SHOW = "invcPrintButtonShow";
    public static final String INVC_ITEM_IS_EMPTY="isEmptyInvoiceItem";
    public static final String VIEW_INS_PLAN_SHOW = "viewInsurancePlanShow";

    // INVOICE ITEM :  ADMIN FINANCE
    public static final String LOOKUP_TYPE_INVC_ITEM_STATUS = "XX_IIS";
    public static final String INVC_ITEM_STATUS_ACTIVE = "A";
    public static final String CTX_INVC_ITEM_STATUS = "invcItemStatusList";
    public static final String LOOKUP_TYPE_INVC_ITEM_TYPE = "XX_IIT";
    public static final String CTX_INVC_ITEM_TYPE = "invcItemTypeList";

    // INVOICE ITEM : place where invoice issued
    public static final String LOOKUP_TYPE_INVC_LOCATION = "XX_IIO";
    public static final String CTX_INVC_LOCATION = "invcItemLocation";
    public static final String CTX_INVC_LOCATION_LIST = "invcLocationList";

    // CASHIER USER ID
    public static final String CTX_CSH_ROLE_ID = "CASHR";
    public static final String CTX_IS_CASHIER = "isCashier";

    //FINANCE ADMIN ROLE ID
    public static final String CTX_FINANCE_ADMIN_ROLE_ID = "HA101";

    // lists
    public static final String CTX_INVC_ITEMS = "invcItemsList";
    public static final String CTX_INVC_TOTAL_DP = "invcTotalDP";
    public static final String CTX_PAYM_TOTAL_NORMAL = "paymTotalNormal";
    public static final String CTX_PAYM_TOTAL_DP = "paymTotalDP";
    public static final String CTX_PAYM_TOTAL_REFUND = "paymTotalRefund";
    public static final String CTX_PAYM_TOTAL_BALANCE = "paymTotalBalance";
    public static final String CTX_INVC_PAYMENTS = "invcPaymentsList";
    public static final String CTX_INVC_REFUNDS = "invcRefundsList";
    public static final String CTX_INVC_DOWNPAYMENT = "invcDownPaym";
    public static final String CTX_PAYM_DOWNPAYMENT = "paymDownPaym";
    public static final String CTX_INVC_REV_ADJ_STATUS = "adjStatus";
    public static final String LOOKUP_TYPE_INVC_REV_ADJ_STATUS = "ADJSTATUS";

    //SERVICE MODULE:
    //Lookup Table_Type + List Attribute Names
    public static final String TYPE_EMRG_DISMISS = "MR_EDC";
    public static final String TYPE_DISMISS = "MR_DDC";
    public static final String STATUS_ACTIVE_LIT = "Active";
    public static final String STATUS_NOT_ACTIVE_LIT = "Not Active";
    public static final String STATUS_ACTIVE = "ACTIVE";
    public static final String STATUS_NOTACTIVE = "NOTACTIVE";
    public static final String STATUS_MERGED = "MERGED";
    public static final String DISMISS_LIST = "dismissalList";
    public static final String ACTION_CODE = "MR_ACN";
    public static final String TYPE_CODE = "MR_ERT";
    public static final String TYPE_ACCIDENTAL = "MR_ACT";
    public static final String TYPE_TRIAGE_CLASS = "MR_TSC";
    //Dental
    public static final String LOOKUP_TYPE_DENTAL_ACT = "MR_DAC";
    public static final String CTX_DENTAL_ACT_LIST = "dentalActList";
    public static final String LOOKUP_TYPE_DCEXAM_GROUP = "MR_DXG";
    public static final String CTX_DCEXAM_GROUP_LIST = "dcExamGroupList";
    public static final String LOOKUP_TYPE_DENTAL_CHECKUP = "MR_DCT";
    public static final String LOOKUP_TYPE_DENTAL_PERIODONTAL = "MR_DCP";
    public static final String LOOKUP_TYPE_DENTAL_DENTOFACIAL = "MR_DCD";
    public static final String CTX_DENTAL_CHECKUP_LIST = "dentalCheckupList";
    public static final String CTX_DENTAL_PERIODONTAL_LIST = "dentalPeriodontalList";
    public static final String CTX_DENTAL_DENTOFACIAL_LIST = "dentalDentofacialList";
    public static final String CTX_DENTOFACIAL_OTHER = "OTH";
    
    public static final String MR_TYPE_DENTAL_CLINIC ="021";

    //Echocardiography
    public static final String ECHOCARDIO_SERVICE_CODE = "SV45";
    public static final String ECHO_DETAIL_PATH = "echoDopp";
    public static final String TEE_DETAIL_PATH = "teeDseDetail";
    public static final String ECHOCARDIO_MRTYPE = "101";
    
    //DiagSupp - Treadmill test:
    public static final String LOOKUP_TYPE_RISK_FACTOR = "MR_TRF";
    public static final String CTX_RISK_FACTOR_LIST = "riskFactorList";
    public static final String LOOKUP_TYPE_TEST_CATEGORY = "MR_TCT";
    public static final String CTX_TEST_CATEGORY_LIST = "testCategoryList";

    //DiagSupp - Nutrition:
    public static final String LOOKUP_TYPE_DIET = "MR_NDT";
    public static final String CTX_DIET_LIST = "dietTypeList";
    public static final String REQ_SECTION_INPATIENT_FOOD = "I";
    public static final String REQ_SECTION_INPATIENT_CONS = "C";
    public static final String REQ_SECTION_OUTPATIENT_REFR = "O";
    public static final String CTX_REQ_SECTION_INPATIENT_FOOD_LIT = "reqSecInpFood";
    public static final String CTX_REQ_SECTION_INPATIENT_CONS_LIT = "reqSecInpCons";
    public static final String CTX_REQ_SECTION_OUTPATIENT_REFR_LIT = "reqSecOutpRefr";

    //DiagSupp - Laboratory
    public static final String DS_17_TABLE_TYPE = "DS_17";
    public static final String CTX_HAVING_DETAILS = "isHavingDetails";
    public static final String CTX_HAVING_TOTAL_EXPOSE = "isHavingTotalExpose";
    public static final String MR_TYPE_DIAG_SUPP_LAB = "17";
    public static final String LAB_DIAG_SUPP = "L";
    //appointment or non-appt type
    public static final String CTX_REG_TYPE = "regType";
    public static final String APPT_REG_TYPE = "A";
    public static final String REGULER_REG_TYPE = "R";
    public static final String APPT_REG_GRP_ID = "apptRegGrpId";
    public static final String VIEW_DETAIL_EXAM = "viewDetailExam";

    // new type in Lookup
    // TODO : put in dml
    public static final String LOOKUP_TYPE_FOOD = "MR_NFD";
    public static final String CTX_FOOD_LIST = "foodTypeList";
    public static final String LOOKUP_TYPE_REQ_SECTION = "NUT_SCC";
    public static final String CTX_REQ_SECTION_LIST = "reqSectionList";

    //OccHealth - MCU Summary
    public static final String LOOKUP_TYPE_WEIGHT_GROUP = "MR_WMC";
    public static final String CTX_WEIGHT_GROUP_LIST = "weightGroupList";
    public static final String LOOKUP_TYPE_FITNESS_LEVEL = "MCU_FIT";
    public static final String CTX_FITNESS_LEVEL_LIST = "fitnessLevelList";
    public static final String LOOKUP_TYPE_HEART_RISK = "MCU_HRSK";
    public static final String CTX_HEART_RISK_LIST = "heartRiskList";
    public static final String LOOKUP_TYPE_AGE_UNIT = "GE_AGE";
    public static final String AGE_UNIT_LIST = "ageUnitList";
    public static final String LOOKUP_TYPE_VISION = "MCU_VIS";
    public static final String VISION_LIST = "visionList";
    public static final String LOOKUP_TYPE_HEALTH_CONDITION = "MCU_COND";
    public static final String HEALTH_CONDITION_LIST = "conditionList";
    public static final String LOOKUP_TYPE_HEARING_LOSS = "MCU_HLS";
    public static final String HEARING_LOSS_LIST = "hearingLostList";
    public static final String LOOKUP_TYPE_HYPERTENSION = "MCU_HYPR";
    public static final String HYPERTENSION_LIST = "hypertensionList";
    public static final String LOOKUP_TYPE_HAEMATURI = "MCU_HAEM";
    public static final String HAEMATURI_LIST = "haematuriList";
    public static final String LOOKUP_TYPE_SMOKING_HABIT = "MCU_SMOK";
    public static final String SMOKING_HABIT_LIST = "smokingHabitList";
    public static final String LOOKUP_TYPE_BODY_WEIGHT = "MCU_WEIG";
    public static final String BODY_WEIGHT_LIST = "bodyWeightList";
    public static final String LOOKUP_TYPE_FBS = "MCU_FBS";
    public static final String FBS_LIST = "fbsList";
    public static final String LOOKUP_TYPE_REFLEX = "MCU_REF";
    public static final String CTX_REFLEX_LIST = "reflexList";
    public static final String LOOKUP_TYPE_MCUCL_BLIND = "MCU_CLB";
    public static final String CTX_MCUCL_BLIND_LIST = "colorBlindList";
    public static final String LOOKUP_TYPE_PULSE_OPT = "MCU_REG";
    public static final String CTX_PULSE_OPT_LIST = "pulseOptionList";
    public static final String LOOKUP_TYPE_MR_TYPE_PRE_EMP = "97";

    //OccHealth - Optic Service
    public static final String LOOKUP_TYPE_OPTIC_SERVICE = "MR_OST";
    public static final String CTX_OPTIC_SERVICE_LIST = "opticServiceList";
    public static final String LOOKUP_TYPE_LENS = "MR_OLT";
    public static final String CTX_LENS_LIST = "lensList";
    public static final String MR_TYPE_OPTIC_SERVICE = "11";
    //OccHealth - Lung Test
    public static final String LOOKUP_TYPE_LUNG_TEST_RESULT = "MR_LNGRS";
    public static final String CTX_LUNG_TEST_RESULT_LIST = "lungTestResultList";

    //OccHealth - Vaccination
    public static final String LOOKUP_TYPE_VACCINATION = "MR_VTP";
    public static final String CTX_VACCINATION_LIST = "vaccList";
    public static final String LOOKUP_TYPE_VACC_LOC = "MR_VLC";
    public static final String CTX_VACC_LOC_LIST = "vaccLocList";
    public static final String MR_TYPE_VACC = "10";
    public static final String HEPATITIS_B_VACCINE = "HBV";
    public static final String HB_VACCINE1 = "VAC1";
    public static final String HB_VACCINE2 = "VAC2";
    public static final String HB_VACCINE3 = "VAC3";
    public static final String HB_BOOSTER1 = "BOS1";
    public static final String HB_BOOSTER2 = "BOS2";
    public static final String HB_BOOSTER3 = "BOS3";
    public static final String HB_BOOSTER4 = "BOS4";
    public static final String HB_BOOSTER5 = "BOS5";

    //OccHealth - Hearing Test
    public static final String LOOKUP_TYPE_NOISE_TYPE = "MR_HNT";
    public static final String CTX_NOISE_TYPE_LIST = "noiseTypeList";
    public static final String LOOKUP_TYPE_OTOSCOPIC = "MR_HOT";
    public static final String CTX_OTOSCOPIC_LIST = "otoscopicList";
    public static final String LOOKUP_TYPE_AUDIOMETRIC = "MR_HAM";
    public static final String CTX_AUDIOMETRIC = "audiometricList";
    public static final String LOOKUP_TYPE_CONCLUSION = "MR_HCL";
    public static final String CTX_CONCLUSION = "conclusionList";
    public static final String LOOKUP_TYPE_SUGGESTION = "MR_HSG";
    public static final String CTX_SUGGESTION = "suggestionList";
    public static final String HEARING_TABLE_CODE = "SV26";
    public static final String SERVICE_SEARCH_GRID_LIST = "serviceSearchGridList";

    // Emergency
    public static final String SECTION_LIST = "sectionList";
    public static final String SERVICE_LIST = "serviceList";
    public static final String SERVICE_HST = "serviceHst";
    public static final String STATUS_LIST = "statusList";
    public static final String STATUS_HST = "statusHst";
    public static final String FACILITY_LIST = "facList";
    public static final String PERSON_ROLE_LIST = "personRoleList";
    public static final String IN_DOCTOR_GROUP = "inDoctorGroup";
    public static final String DOCTORS_LIST = "doctorList";
    public static final String TOTAL_RECORD = "totalRecord";
    public static final String ACTV_GRP_ID = "actvGrpId";
    public static final String ACTV_ID = "actvId";
    public static final String EMERGENCY_LIST = "emergencyList";
    public static final String ACCIDENTAL_LIST = "accidentalList";
    public static final String TRIAGE_LIST = "triageList";
    public static final String DISMISSAL_LIST = "dismissalList";
    public static final String STATUS = "status";
    public static final String CopyOfEmergencyData = "copyOfEmergencyData";

    // service
    public static final String LOOKUP_TYPE_DSE_SCOR = "DSE_SCOR";
	public static final String CTX_DSE_SCOR_LIST = "dseScorList";
	public static final String LOOKUP_TYPE_STENOSIS = "STENOSIS";
	public static final String CTX_STENOSIS_LIST = "stenosisList";
	public static final String LOOKUP_TYPE_CALC = "CALC";
	public static final String CTX_CALC_LIST = "calcList";

    // Outpatient
    public static final String TYPE_DELIMITER = "|";
    public static final String MCU_SUMR_ROLE_ID = "_RSV28";
    public static final String CopyOfOutpatientData = "requestActivity";
    public static final String LOOKUP_TYPE_PEDIATRIC_CASE = "PED_CS";
    public static final String PEDIATRIC_CASE_LIST = "pediatricCaseList";
    public static final String LOOKUP_TYPE_PSYCHIATRY_CASE = "PSY_CS";
    public static final String PSYCHIATRY_CASE_LIST = "psychiatryCaseList";
    public static final String LOOKUP_TYPE_DERMATOLOGY_CASE = "DEM_CS";
    public static final String DERMATOLOGY_CASE_LIST = "dermatologyCaseList";
    public static final String PSYCHIATRY_CASE_DRUG_ABUSE = "DRGA";

    // Mcu Router
    public static final String MRTYPE_LIST = "mrTypeList";
    public static final String ACTV_ID_LIST = "actvIdList";
    public static final String CTX_MR_TYPE = "mrType";

    // Mother and Child
    public static final String LOOKUP_TYPE_CONTRACEPT = "MR_FCT";
    public static final String CONTRACEPT_LIST = "contraceptList";
    public static final String LOOKUP_TYPE_NOTFPREASON = "MR_FNR";
    public static final String NOT_FP_REASON_LIST = "notFPReasonList";
    public static final String LOOKUP_TYPE_VACCINATION_LOC = "MR_VLC";
    public static final String VACCINATION_LOC_LIST = "vaccinationLocList";
    public static final String RISK_CODE_LIST = "riskCodeList";
    public static final String LOOKUP_TYPE_INFANT_FOOD_CODE = "MR_IFT";
    public static final String INFANT_FOOD_CODE_LIST = "infantFoodCodeList";
    public static final String LOOKUP_TYPE_MOTHER_AND_CHILD_ACTION_CODE = "MR_MAC";
    public static final String LOOKUP_TYPE_ACTION_CODE = "MR_IAC";
    public static final String ACTION_LIST = "actionList";
    public static final String LOOKUP_TYPE_MR_TYPE = "MR_URL";

    // School Health / School Dental Health
    public static final String PUBLIC_HEALTH_CODE = "PBH";
    public static final String SCHOOL_LIST = "schoolList";
    public static final String LOOKUP_TYPE_SCHOOL = "GE_SCH";
    public static final String NUTRITION_STATUS_LIST = "nutritionStatusList";
    public static final String LOOKUP_TYPE_NUTRITION_STATUS = "MR_NTR";
    public static final String COLOR_BLIND_LIST = "colorBlindList";
    public static final String LOOKUP_TYPE_COLOR_BLIND = "MR_BLCL";
    public static final String OUTSIDE_EARS_LIST = "outsideEarsList";
    public static final String LOOKUP_TYPE_OUTSIDE_EARS = "MR_EAROT";
    public static final String INSIDE_EARS_LIST = "insideEarsList";
    public static final String LOOKUP_TYPE_INSIDE_EARS = "MR_EARIN";
    public static final String SCHOOL_HEALTH_SERVICE_CODE = "SV33";
    public static final String SCHOOL_DENTAL_HEALTH_SERVICE_CODE = "SV36";
    public static final String SCHOOL_HEALTH_DESCRIPTION = "School Health / School Dental Health";
    public static final String EXTERNAL_VISIT_TYPE = "EXT";
    public static final String SCHOOL_HEALTH_MR_TYPE = "16";
    public static final String SCHOOL_DENTAL_HEALTH_MR_TYPE = "16X";
    public static final String SCHOOL_DENTAL_PARTICIPANTS = "Prtcpnt";
    public static final String MOTHER_CHILD_SERVICE_CODE = "SV31";

    // don't need this, already declared above -- just for note
    // public static final String CTX_AUDIOMETRIC            = "audiometricList";
    // public static final String LOOKUP_TYPE_AUDIOMETRIC   = "MR_HAM";
    public static final String TONSIL_LIST = "tonsilList";
    public static final String LOOKUP_TYPE_TONSIL = "MR_TSL";
    public static final String SKIN_LIST = "skinList";
    public static final String LOOKUP_TYPE_SKIN = "MR_SKIN";
    public static final String HB_LIST = "HBList";
    public static final String LOOKUP_TYPE_HB = "MR_HB";
    public static final String RECOMMEND_LIST = "RecommendList";
    public static final String LOOKUP_TYPE_RECOMMEND = "MR_RECM";
    public static final String SERVICE_CODE = "serviceCode";
    public static final String MR_TYPE = "mrType";

    //Inpatient
    public static final String WARD_TABLE_CODE = "SV15";
    public static final String ICU_TABLE_CODE = "SV40";
    public static final String DELIV_MATR_TABLE_CODE = "SV16";
    public static final String OT_TABLE_CODE = "SV17";
    public static final String REQUEST_DELIV_INFN_REC = "DELIV_INFN_REC";
    public static final String REQUEST_SCHOOL_DENTAL = "SCHOOL_DENTAL";
    public static final String SERVICE_PATH = "PATH";
    public static final String REQUEST_BED_NO = "BED_NO";
    public static final String CTX_INFANT_NO = "Infant #";
    public static final String CTX_ANTE_NATAL = "anteNatal";
    public static final String LOOKUP_TYPE_STATUS = "MR_IPS";
    public static final String LOOKUP_TYPE_WARD_DISMISAL = "MR_IDC";
    public static final String LOOKUP_TYPE_ANES_TYPE = "MR_ANS";
    public static final String LOOKUP_TYPE_SURG_CLASS = "MR_SGC";
    public static final String LOOKUP_TYPE_SURG_TYPE = "MR_SGT";
    public static final String LOOKUP_TYPE_SURG_URG = "MR_SGU";
    public static final String LOOKUP_TYPE_PATIENT_COND = "MR_PCD";
    public static final String LOOKUP_TYPE_TREATMENT_CODE = "MR_STC";
    public static final String LOOKUP_TYPE_CONDITION = "MR_MMC";
    public static final String LOOKUP_TYPE_PLACENTA = "MR_MPL";
    public static final String LOOKUP_TYPE_PIRENIUM = "MR_MPR";
    public static final String LOOKUP_TYPE_DELIVERY = "MR_MDC";
    public static final String LOOKUP_TYPE_DELIVERY_ACTION = "DEL_ACT";
    public static final String LOOKUP_TABLE_CODE_ABORTUS = "ABO";
    public static final String LOOKUP_TYPE_WARD_DISMISSAL = "MR_WDC";
    public static final String LOOKUP_TYPE_HCU_DISMISSAL = "MR_HDC";
    public static final String LOOKUP_TYPE_OPERATING_THEATRE_DISMISSAL = "MR_OTDC";
    public static final String LOOKUP_TYPE_BIRTH_CONDITION = "MR_MIC";
    public static final String LOOKUP_TYPE_INFANT_CONDITION = "INFT_COND";
    public static final String LOOKUP_TYPE_NEONATAL_CASE = "NEONTL_CASE";
    public static final String LOOKUP_TYPE_MEAL_TYPE = "MEAL_TP";
    public static final String LOOKUP_TYPE_DIET_INPATIENT = "DIET_TP";
    public static final String LOOKUP_TYPE_SIGN_TYPE = "MR_VST";
    public static final String CTX_SIGN_TYPE_LIST = "signTypeList";
    public static final String CTX_SIGN_TYPE = "signType";
    public static final String CTX_SIGN_UNIT_LIST = "signUnitList";
    public static final String DIET_TYPE_LIST = "dietTypeList";
    public static final String MEAL_TYPE_LIST = "mealTypeList";
    public static final String BIRTH_CONDITION_LIST = "birthCondList";
    public static final String INFANT_CONDITION_LIST = "infantCondList";
    public static final String NEONATAL_CASE_LIST = "neoNatalCaseList";
    public static final String LOOKUP_TYPE_INFANT_WEIGHT_GEST_AGE = "MR_GEA";
    public static final String INFANT_WEIGHT_GEST_AGE_LIST = "weightGestationalAgeList";
    public static final String ANES_TYPE_LIST = "anesTypeList";
    public static final String SURG_CLASS_LIST = "surgClassList";
    public static final String SURG_TYPE_LIST = "surgTypeList";
    public static final String SURG_PROC_LIST = "surgProcList";
    public static final String SURG_URG_LIST = "surgUrgList";
    public static final String PATIENT_COND_LIST = "patientCondList";
    public static final String TREATMENT_CODE_LIST = "treatmentCodeList";
    public static final String CONDITION_LIST = "conditionList";
    public static final String PLACENTA_LIST = "placentaList";
    public static final String COMP_IN_PREG_LIST = "compInPregList";
    public static final String LOOKUP_TYPE_MISSCARRIAGE = "MR_COM";
    public static final String CTX_MISSCARRIAGE = "misscarriage";
    public static final String PIRENIUM_LIST = "pireniumList";
    public static final String DELIVERY_LIST = "deliveryList";
    public static final String DELIVERY_ACTION_LIST = "deliveryActList";
    public static final String INFANT_LIST = "infantList";
    public static final String VST_HEART = "VST1";
    public static final String VST_RESPITORY = "VST2";
    public static final String VST_WEIGHT = "VST3";
    public static final String VST_BLOOD = "VST4";
    public static final String VST_TEMPERATURE = "VST5";
    public static final String VST_BREATHING = "VST6";
    public static final String VST_FLUID_BALANCE = "VST6";
    
    public static final String VST_RISK_OF_FALL = "VST9";
    public static final String VST_DECUBITUS_RISK = "VST10";
    public static final String VST_INTAKE = "VST11";
    public static final String VST_OUTPUT = "VST12";
    public static final String VST_RISK_OF_FALL_TITLE = "The Risk Of Fall";
    public static final String VST_DECUBITUS_RISK_TITLE = "Decubitus Risk";
    public static final String VST_INTAKE_TITLE = "Intake";
    public static final String VST_OUTPUT_TITLE = "Output";
    
    public static final String VST_HEART_TITLE = "Heart Rate";
    public static final String VST_RESPITORY_TITLE = "Respiration Rate";
    public static final String VST_WEIGHT_TITLE = "Weight";
    public static final String VST_BLOOD_TITLE = "Blood Presure";
    public static final String VST_TEMPERATURE_TITLE = "Temperature";
    public static final String VST_FLUID_BALANCE_TITLE = "Fluid Balance";
    public static final String SIGN_UNIT_WEIGHT = "VS_SUW";
    public static final String SIGN_UNIT_TEMPERATURE = "VS_SUT";
    public static final String CTX_TIME_LITERAL = "Time";
    public static final String STAFF_DOCTOR_ONLY = "doctorOnly";
    public static final String STAFF_DOCTOR = "D";
    public static final String STAFF_NURSE = "N";
    public static final String STAFF_NUTRITIONIST = "ALL";
    public static final String STAFF_ADM_FINANCE = "AFS";
    public static final String EXISTING_INFANT = "EXISTING_INFANT";
    public static final String INFANT_FIRST_NAME = "Infant";
    public static final String INFANT_LAST_NAME = "No Name";
    public static final String INFANT_MARITAL_STATUS = "S";
    public static final double VAL_BOUND_30 = 30.0;
    public static final double VAL_BOUND_190 = 190.0;
    public static final double VAL_BOUND_55 = 55.0;
    public static final double VAL_BOUND_34 = 34.0;
    public static final double VAL_BOUND_43 = 43.0;
    public static final double VAL_BOUND_105 = 105.0;
    public static final double VAL_BOUND_260 = 260.0;
    public static final double VAL_BOUND_310 = 310.0;
    public static final double VAL_BOUND_M10 = -10.0;
    public static final double VAL_BOUND_210 = 210.0;
    public static final double VAL_BOUND_40 = 40.0;
    public static final double VAL_BOUND_180 = 180.0;
    public static final double VAL_BOUND_10 = 10.0;
    public static final double VAL_BOUND_45 = 45.0;
    public static final double VAL_BOUND_48 = 48.0;
    public static final double VAL_BOUND_35 = 35.0;
    public static final double VAL_BOUND_42 = 42.0;
    public static final double VAL_BOUND_100 = 100.0;
    public static final double VAL_BOUND_250 = 250.0;
    public static final double VAL_BOUND_300 = 300.0;
    public static final double VAL_BOUND_0 = 0.0;
    public static final double VAL_BOUND_200 = 200.0;
    public static final double VAL_BOUND_99 = 99;
    public static final double VAL_BOUND_44 = 44;
    public static final double VAL_BOUND_M20 = -20.0;
    public static final String CTX_CHART_MAKER = "CHART_MAKER";
    public static final String CTX_CHART_BOUNDARY = "CHART_BOUNDARY";
    public static final String CTX_LOWER_FLUID_BOUNDARY = "LOWER_FLUID_BOUNDARY";
    public static final String CTX_UPPER_FLUID_BOUNDARY = "UPPER_FLUID_BOUNDARY";
    public static final String LOOKUP_TYPE_SL_TYPE = "SL_TP";
    public static final String CTX_SL_TYPE_LIST = "sickLeaveTypeList";
    public static final String VITAL_SIGN_GRAPH_LIST = "vitalSignGraphs";
    public static final String VITAL_SIGN_MEASUREMENT_LIST = "vitalSignMeasurementLists";
    public static final String ICU_MR_TYPE = "28";
    public static final String WARD_MR_TYPE = "05";
    public static final String INP_DOCTOR_NOTES_LIST_MR_TYPE ="0511";
    public static final String INP_DOCTOR_NOTES_MR_TYPE ="051";
    public static final String INP_NURSE_CARE_MR_TYPE ="052";
    public static final String INP_VITAL_SIGN_MR_TYPE ="053";
    public static final String INP_TRANSFUSSION_MR_TYPE ="054";
    public static final String INP_TRANSFUSSION_DETAIL_MR_TYPE ="0541";
    public static final String INP_DIET_MR_TYPE ="055";
    public static final String INP_DIET_DETAIL_MR_TYPE ="0551";
    public static final String INP_ICU_NOTES_MR_TYPE ="281";
    public static final String CTX_INPATIENT = "Inpatient";
    public static final String CARDIOLOGY_TABLE_CODE = "SV04";
    public static final String CTX_CARDIOLOGY = "Poly Cardiology";
    public static final String SPRING_INPATIENT_BO = "InpatientBO";
    public static final String LOOKUP_TYPE_PRIORITY = "PRIORT";
    public static final String CTX_TYPE_PRIORITY = "listPriority";

    public static final String LOOKUP_TYPE_CAUSE_OF_NEONATAL_DEATH = "MR_CND";
    public static final String CTX_CAUSE_OF_NEONATAL_DEATH_LIST = "cndlist";
    
    public static final String LOOKUP_CODE_BIRTH_COND_STILL_BIRTH = "MIC05";
    
    public static final String LOOKUP_TYPE_MED_CHART_INTAKE_ROUTE = "INTAKE_ROUTE";
    public static final String CTX_MED_CHART_INTAKE_ROUTE = "intakeRoute";
    public static final String LOOKUP_TYPE_MED_CHART_WHOUSE = "MED_CHART_WHOUSE";
    public static final String LOOKUP_TYPE_MED_CHART_ITEM_STATUS = "MED_CHART_ITEMSTATUS";
    public static final String CTX_MED_CHART_ITEM_STATUS = "medChartItemStatus";
    public static final String CTX_MED_CHART_ITEMS = "medChartItems";
    public static final String CTX_MED_CHART_ADD_DU_ROWS = "medChartAddDURows";
    public static final String CTX_MED_CHART_IS_A_DOCTOR = "isADoctor";
    public static final String CTX_MED_CHART_ISSUE_STATUS = "issueStatus";
    public static final String LOOKUP_TYPE_MED_CHART_ISSUE_STATUS = "MDC_ISSUE_STATUS";
    public static final String CTX_MED_CHART_ISSUE_TYPE = "issueType";
    public static final String CTX_MED_CHART_DRUG_ADM = "drugAdministration";
    public static final String CTX_MED_CHART_SEARCH_PRN = "searchPRN";
    public static final String LOOKUP_TYPE_MED_CHART_DRUG_ADM = "MDC_DRUG_ADM";
    public static final String CTX_MED_CHART_ALL_FACILITIES = "allFacilities";
    public static final String CTX_MED_CHART_ALL_PATIENTS = "allPatients";
    public static final String CTX_MED_CHART_ALL_DRUGS = "allDrugs";
    public static final String CTX_MED_CHART_UNPROCEED_LIST = "medChartUnproceedList";
    public static final String CTX_MED_CHART_ITEM_UNPROCEED_LIST_COUNT = "medChartUnproceedListCount";
    public static final String MED_CHART_REQUESTED_DRUG_LIST_REPORT_ID = "PDFRPTREQDRUGLIST";
    public static final String MED_CHART_DRUG_LABEL_REPORT_ID = "PDFRPTMEDCDRUGLABEL";
    public static final String MED_CHART_ADMINISTRATION_REPORT_ID = "PDFRPTMEDCADMNOTE";
    public static final String MED_CHART_PRE_ID_LIT = "MC";
    public static final String CTX_MED_CHART_PER_MONTH = "medcPerMonth";
    public static final String SEARCHTYPE_MEDC_CHART = "MEDC";
    public static final String LOOKUP_TYPE_MED_CHART_MONTH = "LK_MONTH";
    public static final String HAS_MED_CHART_ROLE = "hasMedChartRole";
    public static final String MED_CHART_ROLE = "MDCCRT";
    public static final String MED_CHART_ISSUE_ROLE = "MDCISS";
    public static final String CTX_LOOKUP_MED_CHART_MAP = "medChartMap";
    public static final String CTX_MED_CHART_PREFILL_NARATIVE = "prefillNarative";
    public static final String LOOKUP_TYPE_FETAL_PRESENTATION = "MR_FEP";
    public static final String FETAL_PRESENTATION_LIST = "fetalPresentationList";

    //Medical Services - OCH - Vaccination
    public static final String HEPATITIS_TABLE_CODE = "SV30";
    public static final String UKS_TABLE_CODE = "SV33";

    //Medical Services - OCH - Hear Test
    public static final String LOOKUP_TYPE_SECTION_HEAR_TEST = "GE_SEC";
    public static final String LOOKUP_TYPE_LOCATION_HEAR_TEST = "GE_LOC";

    // Patient Prescription MRType
    public static final String PRESCRIPTION_MRTYPE = "19";
    public static final String CTX_OUTSTANDING_BUTTON = "OUTSTDBTN";

    //Medical History
    public static final String CTX_MEDICAL_HISTORY_MAP = "medicalHistory";
    public static final String CTX_PATIENT_NAME = "patientName";
    public static final String CTX_PERSON_LIST = "personList";
    public static final String CTX_BACK_TO_MEDICAL_HISTORY_ENABLED = "backToMedicalHistoryEnabled";
    public static final String CTX_MEDICAL_HISTORY_ROLE = "HA106";
    public static final String SORT_ASC = "asc";
	public static final String SORT_DESC = "desc";
	public static final String CTX_SORT_PARAM = "sortParam";
	public static final String SORT_TYPE_PARAM = "sortType";
	public static final String SORT_NAME_PARAM = "sortName";
	public static final String SEARCH_PATIENT_MED_HIST = "400110002";


    //Vaccination MR Type
    public static final String VACCINATION_MRTYPE = "10";
    public static final String DELIVERY_ROOM_MRTYPE = "07";
    public static final String OPERATING_THEATRE_MRTYPE = "06";

    //Reference variable from medical record to prescription
    public static final String REF_MEDICAL_RECORD = "REF_MEDICAL_RECORD";
    
    //reference variable from prescription to scan prescription
    public static final String CTX_FROM_PRESCRIPTION_EDIT = "prescriptionDetail";

    // Reporting
    public static final String LOOKUP_TYPE_REPORT_CLASS = "RPT_CLS";
    public static final String LOOKUP_TYPE_REPORT_TYPE = "RPT_TYP";
    public static final String LOOKUP_TYPE_REPORT_MODULE = "RPT_MODULE";
    public static final String LOOKUP_TYPE_CORVU_PARAM = "CV_PRM";
    public static final String CTX_REPORT_CLASS = "reportClassList";
    public static final String CTX_REPORT_TYPE = "reportTypeList";
    public static final String CTX_REPORT_GROUP = "reportGroup";
	public static final String CONST_REPORT_FORM = "reportForm";

    public static final String REPORT_GROUP_STATUTORY = "STTR";
    public static final String REPORT_GROUP_OPERATIONAL = "OPER";
    public static final String REPORT_GROUP_MANAGEMENT = "MNG";
    
    public static final String TABLE_CODE_GOVERNMENT = "GOV";
    public static final String TABLE_CODE_INTERNAL = "INT";
    
    public static final String REPORT_LIT_ALL = "ALL";
    //ADDED FOR RETRIEVE SERVICE NAME FOR OUTPATIENT BLANK REPORT
    public static final String CONST_ASSOC_VAL02 = "01";
    public static final String CONST_ASSOC_VAL02_LIKE = "01|%";
    //END

    /* custom INCO - Work Accident report
            public static final String TYPE_INJURY_KIND = "AR_IK";
            public static final String TYPE_BODY_PART = "AR_BP";
            public static final String TYPE_ACC_TYPE = "AR_TYPE";
            public static final String TYPE_SUB_PRAC = "AR_ICSP";
            public static final String TYPE_SUB_COND = "AR_ICSC";
            public static final String TYPE_PSN_FAC = "AR_BCPF";
            public static final String TYPE_JOB_FAC = "AR_BCJF";
        */
    public static final String ROPR_NO_FORMAT = "000000000";
    public static final String MTRL_TRANS_NO_FORMAT = "000000000";
    public static final String PRESC_SEQ_FORMAT = "0000";
    public static final double SUPL_DEFAULT_CONV_FACT = 1;
    public static final String LOOKUP_TYPE_MR_URL = "MR_URL";
    public static final String CTX_MR_URL_LIST = "mrURLList";
    public static final String CTX_SHOW_BUTTON_APPROVE_REJECT = "showApproveRejectButtons";
    public static final String CTX_SHOW_BUTTON_SAVE = "showSaveButton";
    public static final String CTX_SHOW_BUTTON_SUBMIT = "showSubmitButton";
    public static final String CTX_SHOW_BUTTON_ADD = "showAddItemButton";
    public static final String CTX_SHOW_BUTTON_ELLIPSE = "showToEllipseButton";
    public static final String CTX_SHOW_BUTTON_PRINT = "showPrintROButton";
    public static final String CTX_SHOW_BUTTON_CANCEL = "showCancelButton";
    public static final String CTX_SHOW_BUTTON_DELETE = "showDeleteButton";
    public static final String CTX_SHOW_BUTTON_ANTE_NATAL = "showAnteNatalButton";
    public static final String CTX_OPTION_RO = "showROItems";
    public static final String CTX_OPTION_CAT = "showAllCatalogueItems";
    public static final String CTX_OPTION_ALLINV = "showAllInventoryItems";
    public static final String CTX_OPTION_LOWINV = "showLowInventoryItems";
    public static final String CTX_SUP_RESULT_STATUS = "supplyResultStatus";
    public static final String CTX_SUP_RESULT_PRIORITY = "supplyResultPriority";
    public static final String CTX_SUP_RESULT_POSYS = "supplyResultPosys";
    public static final String CTX_SUP_RESULT_WAREHOUSE = "supplyResultWarehouse";
    public static final String CTX_SUP_RESULT_UOM = "supplyResultUOM";
    public static final String CTX_SUP_RESULT_UOI = "supplyResultUOI";
    public static final String CTX_SUP_RESULT_ITEM_STATUS = "supplyResultItemStatus";
    public static final String CTX_SUP_RESULT_MEDIC_FUNC = "suppMlyResultMedicFunc";
    public static final String CTX_SUP_RESULT_MANUFACTURE = "suppMlyResultManufacture";

    /* Material Transaction */
    public static final String BATCH_TRANS_MAP_HEAD = "batchTransMapHead";
    public static final String BATCH_TRANS_MAP_ITEM = "batchTransMapItem";
    public static final String BATCH_TRANS_MAP_BATCH = "batchTransMapBatch";
    public static final String CTX_MAP_BATCHES = "mapOfBatches";
    public static final String CTX_MAP_PERSON = "mapOfPerson";
    public static final String CTX_MAP_LOOKUP = "mapOfLookUp";
    public static final String CTX_MAP_STOCK_CODE = "mapOfStockCode";
    public static final String CTX_MAP_WAREHOUSE = "mapOfWarehouse";
    public static final String CTX_MAP_MAT_TRAN_ITEM_FORM = "mapOfMaterialTransactionItemForm";    
    public static final String CTX_HEADER_STATUS = "headerStatus";
    public static final String CTX_ITEM_STATUS = "itemStatus";
    public static final String CTX_PREV_REQ_NO = "prevReqNo";
    public static final String CTX_REQ_NO = "reqNo";
    public static final String SECTION_OUT = "OUT";
    public static final String SECTION_INP = "INP";
    public static final String SECTION_EMG = "EMG";
    public static final String MTRL_ENTITY = "MTRL";

    /* Registration Point Lookup - Custom INCO */
    public static final String LOOKUP_TYPE_REG_POINT = "REG_PT";
    public static final String CTX_REG_POINT_LIST = "regPointList";
    public static final String LOOKUP_TYPE_GLASSES = "GLS_TP";
    public static final String CTX_GLASSES_LIST = "glassesTypeList";
    public static final String LOOKUP_TYPE_INPT_TYPE = "INP_TP";
    public static final String CTX_INPT_TYPE_LIST = "inpatientTypeList";
    public static final String LOOKUP_TYPE_SURG_RISK = "MR_SRS";
    public static final String CTX_SURG_RISK_LIST = "surgeryRiskList";
    public static final String LOOKUP_OP_ACT_TYPE = "OP_ACT";
    public static final String CTX_OP_ACT_LIST = "operationActionList";
    public static final String PRESC_NO_LIT = "Prescription No : ";
    public static final String STORE_TRANS_NO_LIT = "Store Transfer No : ";
    public static final String ISSUE_REQI_NO_LIT = "Store Requisition No : ";

    //Medical Library
    public static final String CTX_DOCUMENT_DATA = "document";

    // Constants used in MCU Registration
    public static final String NOT_AVAILABLE = "N/A";
    public static final String MCU_SERVICE_TYPE = "SV28";
    public static final String OCCH_SECTION_TYPE = "OCH";
    public static final String LOOKUP_TYPE_HAZARD_LEVEL = "HZD_LVL";
    public static final String UNASSIGNED_LIST = "unassignedList";
    public static final String LOW_HAZARD = "LVL_LOW";
    public static final String HIGH_HAZARD = "LVL_HGH";
    public static final String MCU_SECTION_SERVICE_TYPE = "SV80,SV84,SV78,SV79,SV83,SV81";

    // Specific Checkup
    public static final String SPECIFIC_CHECKUP_SERVICE_TYPE = "SV39";

    //DiagSupp - Blood Donor
    public static final String TYPE_BLOOD_DONOR = "SV27";

    // XRay
    public static final String CTX_XRAY_RIS_NOTES = "risNotes";
    
    //DiagSupp - X-Ray
    public static final String XRAY_SERVICE_CODE = "SV20";
    public static final String XRAY_FILM_USAGE_TBL_TYPE = "XR_FILM";
    public static final String XRAY_FILM_COUNTER_TBL_CODE = "COUNTER";
    public static final String ZERO_VALUE = "0";

    public static final String MR_TYPE_GENERAL_XRAY = "82";
    //Outpatient - Physioterapy
    public static final String PHYSIOTERAPY_SERVICE_CODE = "SV14";

    //DiagSupp - Standard X-Ray
    public static final String STD_XRAY_SERVICE_CODE = "SV82";

    //DiagSupp - Dental X-Ray
    public static final String DENT_XRAY_SERVICE_CODE = "SV85";

    //Inpatient - Ward
    public static final String CTX_INPT_DEPENDENCY_LEVEL = "depnLevel";
    public static final String LOOKUP_TYPE_INPT_DEPENDENCY_LEVEL = "INPT_DL";
    public static final String CTX_EXCEPTION = "exception";
    public static final String LOOKUP_TYPE_OTHER_DISMISSAL = "OTH";
    public static final String CTX_INPT_BACTERIA = "bacteria";
    public static final String LOOKUP_TYPE_INPT_BACTERIA = "DC_BACT";
    

    //Doctor Visit Schedule
    public static final String LOOKUP_TYPE_MONTH = "MONTH";
    public static final String LOOKUP_TYPE_LOCATION = "VSDOCLOC";
    public static final String CTX_YEAR = "year";
    public static final String CTX_MONTH = "month";
    public static final String CTX_MONTH_MAP = "monthMap";
    public static final String CTX_LOCATION = "location";
    public static final String CTX_LOCATION_MAP = "locationMap";

    //Public Community Health
    public static final String LOOKUP_TYPE_PROGRAM_TYPE = "PCH_PROG";
    public static final String LOOKUP_TYPE_PCH_DATA_TYPE = "PCH_TYPE";
    public static final String LOOKUP_TYPE_PCH_REPORT_TYPE = "PCH_RPT";
    public static final String CTX_PROGRAM_TYPE = "program";
    public static final String CTX_PROGRAM_TYPE_MAP = "programMap";
    public static final String CTX_LOCATION_TYPE = "location";
    public static final String CTX_LOCATION_TYPE_MAP = "locationMap";
    public static final String CTX_PCH_DATA_TYPE_LIST = "dataTypeList";
    public static final String CTX_PCH_DATA_TYPE_MAP = "dataTypeMap";
    public static final String CTX_PCH_MAPPING_DETAIL_REMARK = "mapping";
    public static final String CTX_PCH_MONTH_MAPPING = "monthMapping";
    public static final String CTX_PCH_REPORT_TYPE = "reportType";
    public static final String CTX_PCH_REPORT_TYPE_MAP = "reportTypeMap";
    public static final String PCH_TREATED_DRINKING_WATER_AREA = "TWDW";
    public static final String PCH_UNTREATED_DRINKING_WATER_AREA = "UWDW";
    public static final String PCH_NATURAL_BATHING_AREA = "NBB";
    public static final String PCH_WASTE_WATER_AREA = "WWA";
    public static final String PCH_BOD_AREA = "BOD";
    public static final String PCH_CHEMICAL_QUALITY_MONTHLY = "CQPM";
    public static final String PCH_TABLE_TYPE_PARAMETER = "PCH_PARM";
    public static final String PCH_CHEMICAL_QUALITY_MONTHLY_DETAIL = "DETAIL";
    public static final String PCH_CHEMICAL_QUALITY_MONTHLY_REMARK = "REMARK";
    public static final String PCH_CHEMICAL_QUALITY_REPORT = "CQPWRPT";
    public static final String PCH_BACTERIOLOGICAL_REPORT = "BQPWRPT";
    public static final String CTX_PCH_TREATED_WATER_ITEM_LIST = "treatedItemList";
    public static final String CTX_PCH_UNTREATED_WATER_ITEM_LIST = "untreatedItemList";
    public static final String CTX_PCH_NATURAL_BATHING_ITEM_LIST = "naturalBathingItemList";
    public static final String CTX_PCH_WASTE_WATER_ITEM_LIST = "wasteWaterItemList";
    public static final String CTX_PCH_BOD_ITEM_LIST = "bodItemList";
    public static final String CTX_PCH_CHEMICAL_QUALITY_ITEM_LIST = "chemicalItemList";
    public static final String CTX_PCH_TREATED_WATER_HEADER = "treatedHeader";
    public static final String CTX_PCH_UNTREATED_WATER_HEADER = "untreatedHeader";
    public static final String CTX_PCH_NATURAL_BATHING_HEADER = "naturalBathingHeader";
    public static final String CTX_PCH_WASTE_WATER_HEADER = "wasteWaterHeader";
    public static final String CTX_PCH_BOD_HEADER = "bodHeader";
    public static final String CTX_PCH_CHEMICAL_QUALITY_HEADER = "chemicalHeader";
    public static final String CTX_PCH_TREATED_WATER_ITEM_MAP = "treatedItemMap";
    public static final String CTX_PCH_UNTREATED_WATER_ITEM_MAP = "untreatedItemMap";
    public static final String CTX_PCH_NATURAL_BATHING_ITEM_MAP = "naturalBathingMap";
    public static final String CTX_PCH_WASTE_WATER_ITEM_MAP = "wasteWaterItemMap";
    public static final String CTX_PCH_BOD_ITEM_MAP = "bodItemMap";
    public static final String CTX_PCH_CHEMICAL_QUALITY_ITEM_MAP = "chemicalItemMap";
    public static final String CTX_THEME = "theme";
    public static final String LOOKUP_TYPE_THEME = "PCH_THM";
    public static final String PROG_TYPE_EDUCATION_SESSION = "PROG05";

    // Offsite Medical Treatment
    public static final String LOOKUP_TYPE_MEDICAL_CONSULTATION = "MD_CNSLT";
    public static final String MEDICAL_CONSULTATION_LIST = "medicalConsultationList";
    public static final String LOOKUP_TYPE_MEDICAL_PROVIDER = "MD_PROV";
    public static final String MEDICAL_PROVIDER_LIST = "medicalProviderList";

    // Offsite Medical Treatment Invoice
    public static final String CTX_OMT_INVC_ITEMS = "omtInvcItems";
    public static final String CTX_HAVING_INVOICE = "isHavingInvoice";
    public static final String CTX_HAVING_ITEMS = "isHavingItems";
    public static final String CTX_OMT_INVC_LIST = "omtInvcList";
    public static final String CTX_PRINT = "print";
    public static final String XRAY_DETAIL_PATH = "xRayDetail";
    public static final String CORE_XRAY_DETAIL_PATH = "coreXRayDetail";
    public static final String LAB_RESULT_PATH = "labResult";
    public static final String THERAPY_EXAM_PATH = "therapyExam";
    public static final String LOGOUT_PAGE_PATH = "logoutPage";
    public static final String ERROR_PAGE_PATH = "errorPage";

    // Rehabilitation Module
    public static final String LOOKUP_TYPE_TIME_UNIT = "TIMEUNIT";
    public static final String TIME_UNIT_LIST = "timeUnitList";
    public static final String LOOKUP_TYPE_FINAL_DECISION = "FNL_DECS";
    public static final String FINAL_DECISION_LIST = "finalDecisionList";
    public static final String LOOKUP_TYPE_REHAB_CONCLUSION = "REHB_CCL";
    public static final String REHAB_CONCLUSION_LIST = "rehabConclusionList";
    public static final String CTX_HAVING_SESSIONS = "isHavingSessions";
    public static final String CTX_SESSION_LIST = "sessionList";

    public static final String MR_TYPE_REHABILITATION = "27";
    // Inco Specific Default Value for Patient/Staff
    public static final String INCO_POSTCODE_DEFAULT = "92984";
    public static final String INCO_STATE_DEFAULT = "Sulawesi Selatan";
    public static final String INCO_COUNTRY_DEFAULT = "ID";

    //Inco Specific Payment Info
    public static final String CTX_RELATION_EMPLOYEE = "EMP";
    public static final String CTX_RELATION_SPOUSE = "S";
    public static final String CTX_RELATION_CHILDREN = "CH";
    public static final String CTX_RELATION_OTHER = "O";
    public static final String CTX_RELIGION_OTHER = "OTH";
    public static final String LOOKUP_TYPE_INTERFACE_CONFIG = "IF_CFG";
    public static final String SICK_LEAVE_TYPE = "S";
    public static final String KMS_REFERENCE = "KMS";
    public static final String LOOKUP_TYPE_PULSE_NORMALITY = "PLS_CND";
    public static final String CTX_PULSE_NORMALITY_LIST = "pulseNormality";
    public static final String DENTURE_STAT_ROUTER_LINK = "dentureStatShow.do?act=Show";
    public static final String LOOKUP_DEFAULT = "DEFAULT";
    public static final String DEFAULT_MEDICAL_FEE = "MEDFEE";
    public static final String LOOKUP_TYPE_EXCLUDED = "EXCLUDED";
    public static final String LOOKUP_TYPE_INCL_CPOE_OTHR = "OTHR_CPOE";
    public static final String LOOKUP_TYPE_DEP_BEN_TYPE = "DEP_TYPE";
    public static final String LOOKUP_CODE_EXCLUDED_PERIOD_CHECK = "PERIODCHECK";

    // the name of xml file that consist of Ellipse Connection Informatation
    public static final String FILENAME_ELLIPSE_CONNECTION_XML = "EllipseConnection.XML";
    public static final String FILE_EXT_SERIALIZED = ".ser";
    public static final String MRTYPE_GP = "01";
    public static final String CTX_PRESCRIPTION_LIST = "prescriptionList";
    public static final String CTX_PRESC_PREV_RETURNS = "prescPrevReturns";
    public static final String CTX_PRESCRIPTION_REC = "prescriptionRec";
    public static final String CTX_MTRL_INVOICE_ITEM = "mtrlInvoiceItems";
    public static final String CTX_LOOKUP_STATUS = "lookupStatusOptions";
    public static final String LOOKUP_TYPE_LOOKUP_STATUS = "LKUPSTAT";
    public static final String CONST_COUNTRY_DEFAULT = "ID";
    public static final String CTX_DOMESTIC_NATIONALITY = "RSA";
    public static final String CTX_FOREIGN_NATIONALITY = "NONRSA";
    public static final String CTX_OCCUPATION_EMPLOYEE = "B";
    public static final String CTX_OCCUPATION_CONTRACTOR = "D";
    public static final String CTX_OCCUPATION_OTHERS = "O";
    public static final String CTX_OCCUPATION_OUTSIDER = "S";
    public static final String CTX_FILM_DATA = "filmData";
    public static final String CTX_FILM_TABLE_CODE = "filmTableCode";
    //public static final String LOOKUP_TYPE_STATE = "GE_STA"; //nationality
    public static final String LOOKUP_TYPE_STATE = "PTN_ST";
    public static final String CTX_STATE_LIST = "stateList";
    public static final String CTX_XRAY_CONCL_LIST = "xrayConclList";
    public static final String LOOKUP_TYPE_XRAY_CONCL = "XR_CON";
    public static final String LOOKUP_PREGNANT = "PREGNANT";
    public static final String CTX_PREGNANT_LIST = "pregnantList";
    public static final String CTX_ITERATIVE_DISABLED = "iterativeDisabled";
    public static final String NOT_AVAILABLE_STATE = "NA";

    //related to medivac and medileave
    public static final String LOOKUP_TYPE_MED_STAT = "MDVLSTS";
    public static final String CTX_MEDSTAT_LIST = "mdvlStsList";
    public static final String LOOKUP_TYPE_MEDIVAL = "MEDIVAL";
    public static final String CTX_MEDIVAL_LIST = "medivalList";
    public static final String LOOKUP_TYPE_MED_TO = "MDVL_TO";
    public static final String CTX_MEDTO_LIST = "mdvlToList";
    public static final String LOOKUP_TYPE_MED_REQ = "MDVL_REQ";
    public static final String CTX_MEDREQ_LIST = "mdvlReqList";
    public static final String LOOKUP_TYPE_MED_BY = "MDVL_BY";
    public static final String CTX_MEDBY_LIST = "mdvlByList";
    public static final String LOOKUP_TYPE_MED_ACCO = "MDVLACCO";
    public static final String CTX_MEDACCO_LIST = "mdvlAccoList";
    public static final String LOOKUP_TYPE_GEN_MOB = "GENMOB";
    public static final String CTX_GENMOB_LIST = "genMobList";
    public static final String LOOKUP_TYPE_POS_PLANE = "POSPLANE";
    public static final String CTX_POSPLANE_LIST = "posPlaneList";
    public static final String LOOKUP_TYPE_CNCS = "CNCS";
    public static final String CTX_CNCS_LIST = "cncsList";
    public static final String LOOKUP_TYPE_RESPR = "RESPR";
    public static final String CTX_RESPR_LIST = "resprList";
    public static final String LOOKUP_TYPE_CATHETER = "CATHETER";
    public static final String CTX_CATHETER_LIST = "catheterList";
    public static final String LOOKUP_TYPE_BLEEDING = "BLEEDING";
    public static final String CTX_BLEEDING_LIST = "bleedingList";
    public static final String LOOKUP_TYPE_PAYMENT = "PAYMENT";
    public static final String CTX_PAYMENT_LIST = "paymentList";
    public static final String LOOKUP_TYPE_AMB_STAT = "AMBSTAT";
    public static final String CTX_AMBSTAT_LIST = "ambStatList";
    public static final String LOOKUP_TYPE_WORKCAP = "WORKCAP";
    public static final String CTX_WORKCAP_LIST = "workCapList";
    public static final String LOOKUP_TYPE_CAPABLE = "CAPABLE";
    public static final String CTX_CAPABLE_LIST = "capableList";
    public static final String LOOKUP_TYPE_ENDPER = "ENDPER";
    public static final String CTX_ENDPER_LIST = "endperList";
    public static final String LOOKUP_TYPE_PRDTYPE = "PRD_TYPE";
    public static final String CTX_PRDTYPE_LIST = "prdTypeList";
    public static final String LOOKUP_TYPE_YESNOFLAG = "YN_FLG";
    public static final String CTX_YESNOFLAG_LIST = "yesNoFlagList";
    public static final String LOOKUP_TYPE_ESC_REASON = "ERCOD";
    public static final String CTX_ESC_REASON_LIST = "escReasonList";
    public static final String LOOKUP_TYPE_ESC_APV = "ESAPP";
    public static final String PREFIX_LOOKUP_CODE_MDVL = "MDVL";
    public static final String PREFIX_LOOKUP_CODE_EMPALERT = "EMPALERT";
    public static final String CTX_ESC_ESC_APV = "escApvList";
    public static final String CTX_MAP_MEDIVAL = "mapMedival";
    public static final String CTX_MAP_MED_STAT = "mapMedStat";
    public static final String CTX_MAP_MED_REQ = "mapMedReq";
    public static final String CTX_MAP_MED_ESC_RESN = "mapMedEscResn";
    public static final String CTX_MAP_MED_ESC_STATUS = "mapMedEscStatus";
    public static final String CTX_MAP_MED_REQ_LIST = "mapMedReqList";
    public static final String CTX_DISP_MED_ESC_LIST_METHOD = "dispMedEscListMethod";
    public static final String CTX_DISP_PATN_LOG_LIST_METHOD = "dispPatnLogListMethod";
    public static final String CTX_DISP_DOC_REC_LIST_METHOD = "dispDocRecListMethod";
    public static final String CTX_DISP_ASSES_LIST_METHOD = "dispAssessListMethod";
    public static final String CTX_DISP_EMP_ALERT_LIST_METHOD = "dispEmpAlertListMethod";
    public static final String CTX_DISP_INT_OFFICE_LIST_METHOD = "dispIntOfficeListMethod";
    public static final String CTX_DISP_CREATE_REGISTRATION_MEDIVAC_ONLY = "createRegistrationMedivacOnly";
    public static final String MEDIVAL_STATUS_NEW = "NEW";
    public static final String MEDIVAL_STATUS_APRV = "APPRV";
    public static final String MEDIVAL_STATUS_NOT_APRV = "NAPPRV";
    public static final String MEDIVAL_STATUS_ONTRT = "ONTRT";
    public static final String MEDIVAL_STATUS_RET = "RETTRT";
    public static final String MEDIVAL_STATUS_ASSES = "ASSESS";
    public static final String MEDIVAL_STATUS_CLOSED = "CLOSED";
    public static final String MEDIVAL_STATUS_PENDING_APPROVAL = "PNDG";
    public static final String MEDIVAL_STATUS_WAITING = "WAITING";
    public static final String STATUS_ASSES_SURV_CMPL = "C";
    public static final String LOOKUP_CODE_MEDIVAC = "MEDIVAC";
    public static final String LOOKUP_CODE_YES = "1";
    public static final String LOOKUP_CODE_NEED_APPROVAL = "0";
    public static final String LOOKUP_CODE_APPROVED = "2";
    public static final String LOOKUP_CODE_CAP_OTHERS = "OTHERS";
    public static final String LOOKUP_CODE_ENDPER_OTHERS = "OTHERS";
    public static final String MEDIVAL_MRTYPE = "86";
    public static final int MEDICAL_ESC_TRUE = 1;
    public static final String CTX_USE_MEDICAL_ESC = "useMedicalEsc";
    public static final String CTX_HAS_MEDICAL_ESC = "hasMedicalEsc";
    public static final String CTX_MEDICAL_ESC_LIST = "medicalEscList";
    public static final String CTX_MEDIVAL_STATUS = "medivalStatus";
    public static final String CTX_MEDIVAL_SAVE_ENABLED = "medivalSaveEnabled";
    public static final String CTX_HAS_PATIENT_LOG = "hasPatientLog";
    public static final String CTX_PATIENT_LOG_LIST = "patientLogList";
    public static final String CTX_MED_MOD_ENABLED = "medModEnabled";
    public static final String CTX_MED_PAGE2_ENABLED = "medPage2Enabled";
    public static final String CTX_MED_PAGE3_ENABLED = "medPage3Enabled";
    public static final String CTX_MED_ESCORT_ENABLED = "medEscortEnabled";
    public static final String CTX_MED_ESCORT_LINK_ENABLED = "medEscortLinkEnabled";
    public static final String CTX_MED_APPROVE_ENABLED = "medApproveEnabled";
    public static final String CTX_MED_TREAT_ENABLED = "medTreatEnabled";
    public static final String CTX_MED_RTNDATE_ENABLED = "medReturnDateEnabled";
    public static final String CTX_MED_PTNLOG_ENABLED = "medPtnlogEnabled";
    public static final String CTX_MED_INTOFF_ENABLED = "medIntoffEnabled";
    public static final String CTX_MED_DOCREC_ENABLED = "medDocRecEnabled";
    public static final String CTX_MED_ASSES_ENABLED = "medAssesEnabled";
    public static final String CTX_MED_ASSES_CMPL_ENABLED = "medAssesCmplEnabled";
    public static final String CTX_MED_ALERT_ENABLED = "medAlertEnabled";
    public static final String CTX_MED_VIEW_ENABLED = "medViewEnabled";
    public static final String CTX_MED_ESC_APP_VIEW_ENABLED = "medEscAppEnabled";
    public static final String CTX_MED_ESC_APP_VIEW_MODIFIABLE = "medEscAppModifiable";
    public static final String CTX_MED_RETDATE_FLD_ENABLED = "medRetdateFldEnabled";
    public static final String CTX_MED_RETDATE_VAL_ENABLED = "medRetdateValEnabled";
    public static final String CTX_MED_DATA_DISABLED = "medDataDisabled";
    public static final String CTX_MED_PATIENT_DATA_DISABLED = "medPatientDataDisabled";
    public static final String CTX_MED_DOCREC_LIST_ENABLED = "medDocRecListEnabled";
    public static final String CTX_MED_DOCREC_DATA_ENABLED = "medDocRecDataEnabled";
    public static final String CTX_MED_ASSES_LIST_ENABLED = "medAssesListEnabled";
    public static final String CTX_MED_INTOFC_LIST_ENABLED = "medIntOffEnabled";
    public static final String CTX_MED_EMPALERT_LIST_ENABLED = "medEmpAlertEnabled";
    public static final String CTX_VIEW_OTHER_DOC_BTN_ENABLED = "viewOtherDocBtnEnabled";
    public static final String CTX_MED_FORMLETTER_LIST_ENABLED = "medFormLetterEnabled";
    public static final String CTX_HAS_FORMLETTER = "hasFormLetter";
	public static final String CTX_FORMLETTER_LIST = "formLetterList";
    public static final String CTX_MED_EMPALERT_STATUS = "medEmpAlertStatus";
    public static final String CTX_MDVL_EMP_ALERT_SECTION1 = "mdvlEmpAlertSection1";
    public static final String CTX_MDVL_EMP_ALERT_SECTION2 = "mdvlEmpAlertSection2";
    public static final String CTX_MDVL_EMP_ALERT_SECTION3 = "mdvlEmpAlertSection3";
    public static final String CTX_MDVL_EMP_ALERT_SECTION4 = "mdvlEmpAlertSection4";
    public static final String CTX_MDVL_EMP_ALERT_DATA_DISABLED1 = "mdvlEmpAlertDisabledData1";
    public static final String CTX_MDVL_EMP_ALERT_DATA_DISABLED2 = "mdvlEmpAlertDisabledData2";
    public static final String CTX_MDVL_EMP_ALERT_DATA_DISABLED3 = "mdvlEmpAlertDisabledData3";
    public static final String CTX_MDVL_EMP_ALERT_DATA_DISABLED4 = "mdvlEmpAlertDisabledData4";
    public static final String MEDIVAL_SERVICE = "MedivalService";
    public static final String MEDIVAL_APPROVAL_SERVICE = "MedivalApprovalService";
    public static final String CTX_ALTITUDE_WORK_LIST = "altitudeList";
    public static final String LOOKUP_ALTITUDE_WORK = "ALT_WE";
    public static final String MED_HRD_ROLE_ID = "HRD";
    public static final String MEDIVAC_ADMIN_ROLE_ID = "MMIVAC";
    public static final String MED_DOCTOR = "RSV900";
    public static final String MED_DOH_DOCTOR = "DOHDOC";
    public static final String IR_DEPT_ROLE_ID = "IRDEPT";
    public static final String DEPT_HEAD_ROLE_ID = "DPTHED";
    public static final String MED_DETAIL_OPTION = "OPTION";
    public static final String MED_DETAIL_MEDLEAVE = "MEDLEAVE";
    public static final String MED_DETAIL_MEDEMGREVAC = "MEDEMGREVAC";
    public static final String MED_DETAIL_MEDNEMGREVAC = "MEDNEMGREVAC";
    public static final String MED_DETAIL_MEDILEAVE = "MEDILEAVE";
    public static final String MED_DETAIL_MEDIVAC = "MEDIVAC";
    public static final String CTX_COMPANY_LIST = "companyList";
    public static final String LOOKUP_TYPE_COMPANY = "COMPANY";
    public static final String COMPANY_OTHER = "OTHER";
    public static final String CTX_DESTINATION_LIST = "destinationList";
    public static final String LOOKUP_TYPE_DESTINATION = "MED_DEST";
    public static final String LOOKUP_TYPE_DISTRICT = "DISTRICT";

    //Employee Alert Status
    public static final String EMPTY_ALERT_STATUS = "NEW";
    public static final String MED_ALERT_STATUS = "MED";
    public static final String IR_ALERT_STATUS = "IR";
    public static final String DEPT_ALERT_STATUS = "DEPT";
    public static final String MGMT_ALERT_STATUS = "MGMT";

    // Authentication
    public static final String LOOKUP_TYPE_ITEM_AUTH = "ITEMAUTH";

    //Form Letter
    public static final String CTX_FORMTYPE_LIST = "formTypeList";
    public static final String LOOKUP_TYPE_MDVL_FORM = "MDV_FORM";
    public static final String CTX_FURTHER_TREAT_LIST = "furtherTreatList";
    public static final String LOOKUP_TYPE_MDVL_ENTL = "MDV_ENTL";
    public static final String CTX_REF_DOC_TYPE_LIST = "refDocTypeList";
    public static final String CTX_MDVL_ENTL_LIST = "mdvlEntlList";
    public static final String DROP_DOWN_SIGN	= "LKUP_DD=";
    public static final String LOOKUP_TYPE_SPECIALIST = "GE_PRC";

    public static final String MEDIVAC_FORM_TYPE	= "MDV";
    public static final String MEDILEAVE_FORM_TYPE	= "MDL";
    public static final String INDEMNITY_MED_FORM_TYPE	= "INDM_MED";
    public static final String INDEMNITY_MSC_FORM_TYPE	= "INDM_MSC";

    public static final String FWD_MEDIVAC_PRINT = "medivacPrint";
    public static final String FWD_MEDILEAVE_PRINT = "medileavePrint";
    public static final String FWD_INDM_MED_PRINT = "indmMedPrint";
    public static final String FWD_INDM_MISC_PRINT = "indmMiscPrint";

    //user authenticator back-end
    public static final String TYPE_APPSET = "APPSET";
    public static final String LOOKUP_TYPE_AUTH = "AUTH";
    public static final String AUTH_MODE_DB = "DB";
    public static final String AUTH_MODE_LDAP = "LDAP";
    public static final String USER_AUTH_METHOD = "USER_AUTH_METHOD";
    public static final String AUTH_MODE_SSO_AD = "SSOAD";
    public static final String XRAY_FILM_USAGE_PARENT_PURPOSE = "XRAY_NUM_OF_FILM";
    public static final String XRAY_FILM_EXPOSURE_PARENT_PURPOSE = "XRAY_NUM_OF_EXPSR";
    public static final String XRAY_FILM_EXPOSURE_FACTOR_KV_PARENT_PURPOSE = "XRAY_EXPSR_FACTOR_KV";
    public static final String XRAY_FILM_EXPOSURE_FACTOR_MA_PARENT_PURPOSE = "XRAY_EXPSR_FACTOR_MA";
    public static final String XRAY_FILM_EXPOSURE_FACTOR_S_PARENT_PURPOSE = "XRAY_EXPSR_FACTOR_S";
    public static final String XRAY_FILM_RESET_PARENT_PURPOSE = "XRAY_RESET_COUNTER";
    public static final String LOOKUP_TYPE_XRAY_FILM_TYPE = "XRY_FLM";

    //User Defined Fields
    public static final String DATE = "DATE";
    public static final String NUMERIC = "NUMERIC";
    public static final String TEXT_FIELD = "TEXTFIELD";
    public static final String TIME = "TIME";
    public static final String CHECKBOX = "CHKBOX";
    public static final String TEXT_AREA = "TEXTAREA";
    public static final String DROP_DOWN = "DROPDOWN";
    public static final String UDF_VALIDATION_MANDATORY = "MANDATORY";
    public static final String UDF_VALIDATION_LENGTH = "LENGTH";
    public static final String UDF_FIELD_NAME_ACTIONFORM_MAP_UDF_COLL = "mapUsrDefFldColl";
    public static final String RADIO_BUTTON = "RADIOBUTTON";

    //Token validation
    public static final String LOOKUP_TYPE_NEED_TOKEN_CREATED = "TKNCREAT";
    public static final String LOOKUP_TYPE_NEED_TOKEN_VALIDATED = "TKNVALID";
    public static final String LOOKUP_TYPE_TOKEN_COMMON_METHOD = "COMMON";
    public static final String LOOKUP_TYPE_TOKEN_CREATED_METHOD = "TKNCMTHD";
    public static final String LOOKUP_TYPE_TOKEN_VALIDATED_METHOD = "TKNVMTHD";

    //DiagSupp - Laboratory
    public static final String LABORATORY_SERVICE_CODE = "SV18";
    public static final String DENTAL_LABORATORY_SERVICE_CODE = "SV19";
    public static final String ECG_SERVICE_CODE = "SV21";
    public static final String USG_SERVICE_CODE = "SV22";
    public static final String CTSCAN_SERVICE_CODE = "SV23";
    public static final String ECGCPL_SERVICE_CODE = "SV100";
    public static final String ENDSCPY_SERVICE_CODE = "SV101";

    // Jasper SYSTEM Report Flag
    public static final String JASPER_SYT_RPT_FLAG = "SYST";

    // Jasper USER Report Flag
    public static final String JASPER_USER_RPT_FLAG = "USER";

    // Jasper Report Content
    public static final String CTX_JASPER_REPORT_CONTENT = "JASPER_REPORT_CONTENT";

    // Report Content Type
    public static final String CTX_REPORT_CONTENT_TYPE = "REPORT_CONTENT_TYPE";

    // Jasper Report Type - Table Type
    public static final String JR_TABLE_TYPE = "RPT_TYPE";

    //  Jasper Report IDs
    public static final String OUTPATIENT_PDF_REPORT_ID = "PDFRPTOUTP";
    public static final String OUTPATIENT_SURGERY_PDF_REPORT_ID = "PDFRPTOUTPSURG";
    public static final String LABORATORY_PDF_REPORT_ID = "PDFRPTLAB";
    public static final String INPATIENT_OPR_THR_PDF_REPORT_ID = "PDFRPTOPTTHR";
    public static final String INPATIENT_OBST_EXAM_PDF_REPORT_ID = "PDFRPTOBSTEXM";
    public static final String INPATIENT_OBST_EXAM_GYN_PDF_REPORT_ID = "PDFRPTOBSTGYN";
    public static final String INPATIENT_OBST_EXAM_FAM_PDF_REPORT_ID = "PDFRPTOBSTFAM";
    public static final String INPATIENT_OBST_EXAM_PREN_PDF_REPORT_ID = "PDFRPTOBSTPREN";
    public static final String INPATIENT_OBST_EXAM_POSTN_PDF_REPORT_ID = "PDFRPTOBSTPOSTN";
    public static final String PREGNANCY_PDF_REPORT_ID = "PDFRPTPREGNANCY";
    public static final String FAMILY_PLAN_PDF_REPORT_ID = "PDFRPTFAMILYPLAN";
    public static final String INFANT_PDF_REPORT_ID = "PDFRPTINFANT";
    public static final String INFANT_INFO_PDF_REPORT_ID = "PDFRPTINFANTINFO";
    public static final String MOTHER_PDF_REPORT_ID = "PDFRPTMOTHER";
    public static final String EMERGENCY_PDF_REPORT_ID = "PDFRPTEMRG";
    public static final String ECG_PDF_REPORT_ID = "PDFRPTECG";
    public static final String ECG_DETAIL_PDF_REPORT_ID = "PDFRPTECGDETAIL";
    public static final String CTSCAN_PDF_REPORT_ID = "PDFRPTCTSCAN";
    public static final String ECGCPL_PDF_REPORT_ID = "PDFRPTECGCPL";
    public static final String CTSCAN_DETAIL_PDF_REPORT_ID = "PDFRPTCTSCANDETAIL";
    public static final String USG_PDF_REPORT_ID = "PDFRPTUSG";
    public static final String USG_DETAIL_PDF_REPORT_ID = "PDFRPTUSGDETAIL";
    public static final String ENDSCPY_PDF_REPORT_ID = "PDFRPTENDSCPY";
    public static final String ENDSCPY_DETAIL_PDF_REPORT_ID = "PDFRPTENDSCPYDETAIL";
    public static final String PHYSIOTHERAPY_PDF_REPORT_ID = "PDFRPTPHYS";
    public static final String PHYSIOTHERAPY_RESULT_PDF_REPORT_ID = "PDFRPTPHYSRESULT";
    public static final String XRAY_PDF_REPORT_ID = "PDFRPTXRAY";
    public static final String XRAY_DETAIL_PDF_REPORT_ID = "PDFRPTXRAYDETAIL";
    public static final String STD_XRAY_PDF_REPORT_ID = "PDFRPTSTDXRAY";
    public static final String STD_XRAY_DETAIL_PDF_REPORT_ID = "PDFRPTSTDXRAYDETAIL";
    public static final String DENT_XRAY_PDF_REPORT_ID = "PDFRPTDENTXRAY";
    public static final String DENT_XRAY_DETAIL_PDF_REPORT_ID = "PDFRPTDENTXRAYDETAIL";
    public static final String ECHODOPPLER_PDF_REPORT_ID = "PDFRPTECHODOPPLER";
    public static final String ECHOCARDIO_PDF_REPORT_ID = "PDFRPTECHOCARDIO";
    public static final String LABORATORY_DETAIL_PDF_REPORT_ID = "PDFRPTLABDETAIL";
    public static final String TRIAGE_PDF_REPORT_ID = "PDFRPTTRIAGE";
    public static final String TREADMILL_PDF_REPORT_ID = "PDFRPTTREADMILL";
    public static final String HEPATITISB_PDF_REPORT_ID = "PDFRPTHEPATITISB";
    public static final String NUTRITION_PDF_REPORT_ID = "PDFRPTNUTRITION";
    public static final String NUTRITION2_PDF_REPORT_ID = "PDFRPTNUTRITION2";
    public static final String INPATIENT_DELIV_PDF_REPORT_ID = "PDFRPTDELIV";
    public static final String INPATIENT_PDF_REPORT_ID = "PDFRPTWARD";
    public static final String INPATIENT_DISCHARGE_SUM_PDF_REPORT_ID = "PDFRPTWARDDISCSUM";
    public static final String INPATIENT_ICU_PDF_REPORT_ID = "PDFRPTICU";
	public static final String INPATIENT_DOC_NOTE_PDF_REPORT_ID = "PDFRPTDOCNOTE";
	public static final String INPATIENT_NUR_CARE_PDF_REPORT_ID = "PDFRPTNURCARE";
	public static final String INPATIENT_NUR_DOC1_PDF_REPORT_ID = "RPRT-MR007A";
	public static final String INPATIENT_NUR_DOC2_PDF_REPORT_ID = "RPRT-MR007B";
	public static final String INPATIENT_PROGRESS_REPORT_TYPE_FORM = "ProgressReportForm";
	public static final String NURSE_DOC1_REPORT_TYPE_FORM = "NurseDoc1Form";
	public static final String NURSE_DOC2_REPORT_TYPE_FORM = "NurseDoc2Form";
	public static final String INPATIENT_PROGRESS_PDF_REPORT_ID = "PDFRPTMR010";
    public static final String INPATIENT_PDF_IN_OUT_REPORT_ID = "PDFRPTWARDINOUT";
    public static final String INPATIENT_PDF_PATIENT_RESUME_REPORT_ID = "PDFRPTWARDRES";
    public static final String NON_DEFAULT_REPORT_TYPE_INOUT_FORM = "inOutForm";
    public static final String NON_DEFAULT_REPORT_TYPE_PATIENT_RESUME = "patientResume";
    public static final String DEFAULT_REPORT_TYPE = "default";
    public static final String LUNG_TEST_PDF_REPORT_ID = "PDFRPTLUNGTEST";
    public static final String UKGS_EXAM_PDF_REPORT_ID = "PDFRPTUKGSEXAM";
    public static final String UKS_EXAM_PDF_REPORT_ID = "PDFRPTUKSEXAM";
    public static final String VACCINATION_PDF_REPORT_ID = "PDFRPTVACCINATION";
    public static final String DENTAL_LABORATORY_PDF_REPORT_ID = "PDFRPTDENTLAB";
    public static final String DENTAL_LABORATORY_DETAIL_PDF_REPORT_ID = "PDFRPTDENTLABDETAIL";
    public static final String HEARING_TEST_PDF_REPORT_ID = "PDFRPTHEARINGTEST";
    public static final String HEARING_TEST_AUDIO_METRPDF_REPORT_ID = "PDFRPTHEARMTRICTEST";
    public static final String BLOOD_DONOR_PDF_REPORT_ID = "PDFRPTBLOODDONOR";
    public static final String EMPL_MED_ALERT_PDF_REPORT_ID = "PDFRPTEMPLMEDALERT";
    public static final String OPTIC_SERVICE_PDF_REPORT_ID = "PDFRPTOPTICSERVICE";
    public static final String INT_OFF_MEMO_PDF_REPORT_ID = "PDFRPTINTOFFMEMO";
    public static final String DOC_REC_PDF_REPORT_ID = "PDFRPTDOCREC";
    public static final String MED_EVAC_PDF_REPORT_ID = "PDFRPTMEDEVAC"; //1
    public static final String MED_REFF_PDF_REPORT_ID = "PDFRPTMEDREFF"; //2
    public static final String MED_TRAN_PDF_REPORT_ID = "PDFRPTMEDTRAN"; //3
    public static final String MED_ASSM_PDF_REPORT_ID = "PDFRPTMEDASSM";
    public static final String DENTAL_PDF_REPORT_ID = "PDFRPTDENTAL";
    public static final String PERIODONTAL_PDF_REPORT_ID = "PDFRPTPERIODONTAL";
    public static final String DENTALSTAT_PDF_REPORT_ID = "PDFRPTDENTSTAT";
    public static final String DENTALSTAT1_PDF_REPORT_ID = "PDFRPTDENTSTAT1";
    public static final String DENTALSTAT2_PDF_REPORT_ID = "PDFRPTDENTSTAT2";
    public static final String DENTURE_PDF_REPORT_ID = "PDFRPTDENTURE";
    public static final String ORTHODONTIST_PDF_REPORT_ID = "PDFRPTORTHO";
    public static final String ORTHODONTIST_DETAIL_PDF_REPORT_ID = "PDFRPTORTHODETAIL";
    public static final String MEDICAL_ESCORT_PDF_REPORT_ID = "PDFRPTMEDICALESCORT";
    public static final String MEDIVAC_FORMLETTER_PDF_REPORT_ID = "PDFRPTMEDIVACFL";
    public static final String MEDILEAVE_FORMLETTER_PDF_REPORT_ID = "PDFRPTMEDILEAVEFL";
    public static final String INDEMNITY_MED_FORMLETTER_PDF_REPORT_ID = "PDFRPTINDMMEDFL";
    public static final String INDEMNITY_MSC_FORMLETTER_PDF_REPORT_ID = "PDFRPTINDMMSCFL";
    public static final String MED_EVAC_PAT_LOG_PDF_REPORT_ID = "PDFRPTMEDPATLOG";
    public static final String PURCHASE_ORDER_PDF_REPORT_ID				= "PDFRPTPURCHASEORDER";
    public static final String GOODSRECEIVEDNOTE_PDF_REPORT_ID				= "RPT_CORE_GRN";
    public static final String MULTI_SLICE_CT_PDF_REPORT_ID = "PDFRPTMULTISLICECT";
    public static final String CARDIOLOGY_PDF_REPORT_ID = "PDFRPTCARDIO";
    public static final String INVENTORY_ADJUSTMENT_PDF_REPORT_ID = "PDFINVADJUST";
    public static final String MCU_PHYSICAL_EXAMINATION_REPORT_ID = "PDFRPTMEDICALEXAM";
    public static final String CATHLAB_PDF_REPORT_ID = "PDFRPTCATHLAB";
    public static final String BLOOD_PRESSURE_PDF_REPORT_ID = "PDFRPTBLOODPRESSURE";
    public static final String URINALYSIS_PDF_REPORT_ID = "PDFRPTURINALYSIS";
    public static final String VISION_TEST_PDF_REPORT_ID = "PDFRPTVISIONTEST";
    public static final String HEIGHT_WEIGHT_PDF_REPORT_ID = "PDFRPTHEIGHTWEIGHT";
    public static final String PHYSICAL_EXAM_PDF_REPORT_ID = "PDFRPTPHYSEXAM";
    public static final String PARTOGRAPH_PDF_REPORT_ID = "PDFRPTPARTOGRAPH";
    public static final String HEMODIALISIS_PDF_REPORT_ID = "RPT_CORE_HDMLExam";

    // prescription return receipt
    public static final String PRESCRETURN_REPORT_ID = "RPT_CORE_PRESCRETURN";
    
    // RADT 51
    public static final String REGISTRATION_PRINT_LABEL_PDF_REPORT_ID = "PDFREGPRINTLABEL";

    // for employee termination
    public static final String EMP_TERM_TBL_TYPE = "PATIENT";
    public static final String EMP_TERM_TBL_CODE = "EMP_TERM";
    public static final String EMP_TERM_NEW_STATUS = "N";
    public static final String EMP_TERM_NOTIFIED_STATUS = "C";
    public static final String EMP_TERM_LOOKUP_TYPE = "ACT";
    public static final String EMP_TERM_LOOKUP_CODE = "EMP_TERM";

    //  Letter Type
    public static final String LOOKUP_TYPE_TEMPLATE_TYPE = "TMPL_TYP";
    public static final String LOOKUP_TYPE_TEMPLATE_TYPE_OTHER = "005";
    public static final String LOOKUP_CODE_TEMPLATE_TYPE_INFORMED = "001";
    public static final String LOOKUP_CODE_TEMPLATE_TYPE_DISCHARGE = "002";
    public static final String LOOKUP_CODE_TEMPLATE_TYPE_OTHER = "005";
    public static final String CTX_TEMPLATE_TYPE = "templateType";
    public static final String CTX_TEMPLATE_TYPE_MAP = "templateTypeMap";

    // Obstetric
    public static final String OBSTETRIC_MR_TYPE = "065";
    public static final String LOOKUP_TYPE_PULSE_CONDITION = "OBS_PLS";
    public static final String CTX_PULSE_CONDITION_LIST = "pulseConditionList";
    public static final String LOOKUP_TYPE_OBSTETRIC_RISK_FACTOR = "OBS_RISK";
    public static final String CTX_OBSTETRIC_RISK_FACTOR_LIST = "riskFactorList";
    public static final String CTX_OBSTETRIC_DETAIL_REPORT_ID = "detailReportId";
    public static final String MR_TYPE_OBSTR_REC = "88";
    
    // Examination Group Service
    public static final String LOOKUP_TYPE_EXAM_SERVICE = "EXM_SVC";
    public static final String CTX_EXAM_SERVICE_LIST = "examServiceList";
    public static final String LOOKUP_TYPE_EXAM_GROUP_TYPE = "GRP_TYPE";
    public static final String CTX_EXAM_GROUP_TYPE_LIST = "examGroupTypeList";
    public static final String CTX_LOOKUP_STATUS_LIST = "lookupStatusList";
    public static final String EXAM_DETAIL_SCREEN_TITLE = "EXAMINATION DETAIL";
    public static final String EXAMINATION_FLAG="EXAM";
    public static final String LOOKUP_TYPE_EXAM_LEVEL = "TYPE_EXM";
    public static final String CTX_EXAM_LEVEL_LIST = "examLevel";

    // Medical Service Configurator
    public static final String ROLE_FOR_SERVICE = "RSV";
    public static final String CTX_ROLE_LIST = "roleList";

    // Boundaries and Action Configuration
    public static final String ACTION_ALERT = "ALT";
    public static final String ACTION_EMAIL = "EML";
    public static final String ACTION_PARADING = "PRD";
    public static final String ACTION_TYPE_BOUNDARY = "BL";
    public static final String BOUND_DATA_NUMERIC = "N";
    public static final String BOUND_DATA_TEXT = "T";
    public static final String CTX_ACT_FLAG_LIST = "actFlagList";
    public static final String CTX_ACT_TIME_LIST = "actTimeList";
    public static final String CTX_ACT_TYPE_ALT = "ALT";
    public static final String CTX_ACT_TYPE_EML = "EML";
    public static final String CTX_ACT_TYPE_LIST = "actTypeList";
    public static final String CTX_ACT_TYPE_MAP = "actTypeMap";
    public static final String CTX_ACT_TYPE_PRD = "PRD";
    public static final String CTX_BOUND_DATA_NUM = "N";
    public static final String CTX_BOUND_DATA_TXT = "T";
    public static final String CTX_BOUND_DATA_TYPE_LIST = "boundDataTypeList";
    public static final String CTX_BOUND_FIELD_LIST = "boundFieldList";
    public static final String CTX_BOUND_OPR_LIST = "boundOprList";
    public static final String CTX_BOUND_TYPE_LIST = "boundTypeList";
    public static final String CTX_MR_TYPE_LIST = "mrTypeList";
    public static final String ERROR_ON_ADD = "ERROR_ON_ADD";
    public static final String LOOKUP_CODE_DEFAULT_ALERT_FROM_ADDR = "ALRT_FROM";
    public static final String LOOKUP_CODE_DEFAULT_ALERT_REPLYTO_ADDR = "ALRT_REP_TO";
    public static final String LOOKUP_TYPE_ACT_FLAG = "ACT_FLG";
    public static final String LOOKUP_TYPE_ACT_TIME = "ACT_TM";
    public static final String LOOKUP_TYPE_ACT_TYPE = "ACT_TYPE";
    public static final String LOOKUP_TYPE_BOUND_DATA_TYPE = "DT_TYPE";
    public static final String LOOKUP_TYPE_BOUND_FIELD = "BON_FLD";
    public static final String LOOKUP_TYPE_BOUND_OPR = "BON_OPR";
    public static final String LOOKUP_TYPE_BOUND_TYPE = "BON_TYPE";
    public static final String LOOKUP_TYPE_DEFAULT_VALUES = "DEF_VAL";
    public static final String ROLE_ID_OMP = "OMP";

    // General Alert
    public static final String GENERAL_ALERT_DETAIL_CLASS = "com.mitrais.kms.general.alert.AlertDetail";
    public static final String GENERAL_ALERT_DETAIL_TARGET_CLASS = "com.mitrais.kms.general.alert.AlertDetailTarget";
    public static final String LOOKUP_CODE_ALERTSTATUS_ACK = "A";
    public static final String LOOKUP_TYPE_ALERTSTATUS = "GNRL_ALRT_STS";
    public static final String LOOKUP_TYPE_ALERTTYPE = "GNRL_ALRT_TYP";
    public static final String PREFIX_REQATT_KEY_LIST = "list.";
    public static final String PREFIX_REQATT_KEY_MAP = "map.";
    public static final String REQATT_FORMNAME = "reqatt.form.name";

    // Service search
    public static final String CTX_SECTION_CODE = "sectionCode";
    public static final String CTX_SERVICE_CODE = "serviceCode";

	// References
	public static final String CTX_REF_TYPE = "reference";
	public static final String LOOKUP_REF_TYPE = "PP_TYPE";

    public static final String CTX_REFERENCE_TYPE = "referenceType";
	public static final String LOOKUP_REFERENCE_TYPE = "REF_TYPE";


    //ADT Follow UpTreatment Facility
    public static final String FOLLOW_UP_TREATMENT_FAC_IN = "FLPLOC1";
    public static final String FOLLOW_UP_TREATMENT_FAC_OUT = "FLPLOC2";
    //  Periodical Password Reminder
    public static final String CHANGE_PASSWORD_REMINDER = "changePasswordReminder";
    public static final String PASSWORD_EXPIRE_IN_DAYS = "passwordExpireInDays";
    public static final String LOOKUP_CODE_PASSWORD_EXPIRY_INTERVAL = "EXP_INTV";
    public static final String LOOKUP_CODE_PASSWORD_REMINDER_INTERVAL = "REM_INTV";
    public static final String PASSWORD_CHANGED_SUCCESS = "passwordChangeSuccess";
	public static final String PASSWORD_MESSAGE ="message";
	public static final String FORGOT_PASSWORD_MESSAGE = "forgotPassword";
    //  Password Complexity Role
    public static final String LOOKUP_TYPE_PASS_PARAM = "PASS_PRM";
    public static final String PASS_PARAM_MIN_LENGTH_TABLE_CODE = "001";
    public static final String PASS_PARAM_CONTENT_TABLE_CODE = "002";
    public static final String PASS_PARAM_SPC_CHR_TABLE_CODE = "003";
    public static final String NUMERIC_VALUE_PWD_CONTENT = "N";
    public static final String ALPHABET_VALUE_PWD_CONTENT = "A";
    public static final String ALPHABET_NUMERIC_VALUE_PWD_CONTENT = "B";
    public static final String NO_SPC_CHR_VALUE_PWD_CONTENT = "N";

    //  Mail Utility
    public static final String MAIL_UTILITY_BEAN_ID = "MailUtility";
    public static final String LOOKUP_TYPE_PWD_INTV = "PWD_INTV";
    public static final String PASSWORD_EXPIRED = "passwordExpired";

    // Patient Tariff
    public static final String CTX_AVAIL_TARIFF = "availTariff";
    public static final String CTX_ASSIGN_TARIFF = "assignTariff";
    public static final String CONST_NON_PX_TRF = "00";
    public static final String CONST_PX_TRF = "01";
    public static final String CTX_DEFAULT_REG_TARIFF = "defaultRegTariff";

    //Pref Lang
    public static final String CTX_PREF_LANG_ENGLISH = "isPrefLangEnglish";

    //facility booking
    public static final String BOOKING_STATUS_OCCUPIED = "O";
    public static final String BOOKING_STATUS_CLOSE = "C";
    public static final String BOOKING_STATUS_RESERVED = "N";
    public static final String BOOKING_STATUS_RETURN = "R";
    public static final String SQL_TYPE_ORACLE = "oracle";
    public static final String SQL_TYPE_SQLSERVER = "sqlserver";
    public static final String CODE_MCU_ITEM = "MCUITEM";
    public static final String REPORT_PARAMETER_TYPE_INTEGER = "Integer";
    public static final String TYPE_BULAN = "Bulan";
    public static final String TYPE_TAHUN = "Tahun";
    public static final String TYPE_DARI_TAHUN = "Dari Tahun";
    public static final String TYPE_SAMPAI_TAHUN = "Sampai Tahun";
    public static final String TYPE_TANGGAL = "Tanggal";
    public static final String TYPE_DARI_TANGGAL = "Dari Tanggal";
    public static final String TYPE_SAMPAI_TANGGAL = "Sampai Tanggal";
    public static final String TYPE_TRIWULAN = "Triwulan";
    public static final String FACILITY_ITEM_ALREADY_FULL = "msfac.book.item.error.alreadyFull";

    //Medical Escort
    public static final String DUE_TO_PHRS = "PH";
    public static final String DUE_TO_HRDP = "HR";
    public static final String DUE_TO_PCC = "PC";

//  Item rate
    public static final String LOOKUP_TYPE_ITEM_RATE = "ITEMRATE";

    //Axo 9276
    public static String HTML_OPTION_YES = "Yes";
    public static String HTML_OPTION_NO = "No";
    public static String CTX_SICK_LEAVE_VISIBLE = "sickMedLeaveVisible";
    public static String CTX_MED_ATTN_VISIBLE = "medAttnVisible";

    // Image Path
    String IMAGE_FILE_PROTOCOL = "file:///";
    String IMAGE_PATH_SERVICE = "ImagePathService";
    String IMAGE_PATH_REC_TABLE_ALIAS = "imagepathrec";
    String IMAGE_PATH_REC_CLASS = "com.mitrais.kms.service.ImagePathRec";
    String SUCCESS = "success";
    String SUCCESS_SAVE = "successSave";
    String FAILURE = "failure";
    String SHOW = "show";
    String ERROR_APPROVE = "errorApprove";
    String SUCCESS_REFUND = "successRefund";
    String SUCCESS_INVOICE = "successInvoice";
    String SUCCESS_INV_REV_ADJ_REFUND = "successInvRevAdjRefund";

    /*
     *
     * <bean id="adminBDConcrete" class="com.mitrais.kms.admin.service.AdminBDConcrete">
     *<property name="implementor"><ref local="adminBDPOJO"/></property>
     *<property name="greeting"><value>Good Morning</value></property>
     *  </bean>
     *
     */
    String ACTION_PARAMETER = "act";
    String LOG_HEADER_CLASS = "com.mitrais.kms.audit.LogHeader";
    String LOG_ITEM_CLASS = "com.mitrais.kms.audit.LogItem";
    String LOG_ITEM_LIST_CLASS = "com.mitrais.kms.audit.LogItemList";
    String LOG_MAPPING_CLASS = "com.mitrais.kms.audit.LogMapping";
    String LOG_MAPPING_HEADER_CLASS = "com.mitrais.kms.audit.LogMappingHeader";
    String ACCS_METH_MAPP_CLASS = "AccsMethMapp";
    String BOOK_HEAD_CLASS = "com.mitrais.kms.facility.BookHead";
    String BOOK_ITEM_CLASS = "com.mitrais.kms.facility.BookItem";
    String FACILITY_STATUS_CLASS = "com.mitrais.kms.facility.FacilityStatus";
    String BLOD_DONR_CLASS = "com.mitrais.kms.service.BlodDonr";
    String BLOD_DONR_TEST_CLASS = "com.mitrais.kms.service.BlodDonrTest";
    String DENT_MCUP_CLASS = "com.mitrais.kms.service.DentMcup";
    String DENT_MCUP_TOTH_DTL_CLASS = "com.mitrais.kms.service.DentMcupTothDtl";
    String DENT_ORTO_CLASS = "com.mitrais.kms.service.DentOrto";
    String DENT_ORTO_ITEM_CLASS = "com.mitrais.kms.service.DentOrtoItem";
    String DIAG_SUPP_CLASS = "com.mitrais.kms.service.DiagSupp";
    String DIAG_SUPP_ITEM_CLASS = "com.mitrais.kms.service.DiagSuppItem";
    String DIAG_SUPP_REC_CLASS = "com.mitrais.kms.service.DiagSuppRec";
    String PRE_MED_REC_CLASS = "com.mitrais.kms.service.PreMedRec";
    String ANEST_AGENT_REC_CLASS = "com.mitrais.kms.service.AnesAgentRec";
    String FLUID_SUM_REC_CLASS = "com.mitrais.kms.service.FluidSumRec";
    String OFFS_MEDI_TRMT_CLASS = "com.mitrais.kms.service.OffsMediTrmt";
    String REHB_MAST_REC_CLASS = "com.mitrais.kms.service.RehbMastRec";
    String OMT_INVC_HEAD_CLASS = "com.mitrais.kms.admin.OMTInvcHead";
    String OMT_INVC_ITEM_CLASS = "com.mitrais.kms.admin.OMTInvcItem";
    String EMRG_CTCT_DAO_CLASS = "com.mitrais.kms.admin.EmrgCtct";
    String EMRG_WORK_ACCD_CLASS = "com.mitrais.kms.inco.service.EmrgWorkAccd";
    String EQUI_MAST_CLASS = "com.mitrais.kms.facility.EquiMast";
    String EXTN_PROG_DAO_CLASS = "com.mitrais.kms.admin.ExtnProg";
    String FAMI_PLAN_CLASS = "com.mitrais.kms.service.FamiPlan";
    String GRP_INFO_CLASS = "GrpInfo";
    String GRP_PRSN_MAPP_CLASS = "GrpPrsnMapp";
    String HTML_DATA_DAO_CLASS = "com.mitrais.kms.admin.HTMLData";
    String HTML_HEAD_DAO_CLASS = "com.mitrais.kms.admin.HTMLHead";
    String INFN_REC_CLASS = "com.mitrais.kms.service.InfnRec";
    String INVC_HEAD_DAO_CLASS = "com.mitrais.kms.admin.InvcHead";
    String INVC_ITEM_DAO_CLASS = "com.mitrais.kms.admin.InvcItem";
    String INVC_PAYM_DAO_CLASS = "com.mitrais.kms.admin.InvcPaym";
    String INVC_REV_ADJ_DAO_CLASS = "com.mitrais.kms.admin.InvcRevAdj";
    String INVC_REV_ADJ_ITEM_DAO_CLASS = "com.mitrais.kms.admin.InvcRevAdjItem";
    String MTRL_TRANS_HEAD_CLASS = "com.mitrais.kms.supply.MtrlTransHead";
    String PRSC_RTRN_HEAD_CLASS = "com.mitrais.kms.supply.PrescReturnHead";
    String MTRL_TRANS_HEAD_LOG_CLASS = "com.mitrais.kms.supply.MtrlTransHeadLog";
    String MTRL_TRANS_ITEM_CLASS = "com.mitrais.kms.supply.MtrlTransItem";
    String PRSC_RTRN_ITEM_CLASS = "com.mitrais.kms.supply.PrescReturnItem";
    String MTRL_TRANS_ITEM_LOG_CLASS = "com.mitrais.kms.supply.MtrlTransItemLog";
    String LUNG_TEST_CLASS = "com.mitrais.kms.service.LungTest";
    String MEDC_ACTN_DAO_CLASS = "com.mitrais.kms.admin.MedcActn";
    String MENU_GRP_CLASS = "com.mitrais.kms.config.MenuGrp";
    String MENU_GRP_MENU_MAPP_CLASS = "com.mitrais.kms.config.MenuGrpMenuMapp";
    String MENU_DEF_CLASS = "com.mitrais.kms.config.MenuDef";
    String ROLE_MENU_GRP_MAP_CLASS = "com.mitrais.kms.config.RoleMenuGrpMap";
    String ROLE_MODULE_MAP_CLASS = "com.mitrais.kms.config.RoleModuleMap";
    String MOTH_REC_CLASS = "com.mitrais.kms.service.MothRec";
    String MTRL_EXPR_CLASS = "com.mitrais.kms.supply.MtrlExpr";
    String MTRL_RECV_CLASS = "com.mitrais.kms.supply.MtrlRecv";
    String GRN_HEAD_CLASS = "com.mitrais.kms.supply.GrnHead";
    String GRN_ITEM_CLASS = "com.mitrais.kms.supply.GrnItem";
    String GRN_BATCH_CLASS = "com.mitrais.kms.supply.GrnBatch";
    String MTRL_EXP_TRACK_CLASS = "com.mitrais.kms.supply.MtrlExpTrack";
    String MTRL_TRANS_BATCH_PRESC_CLASS  = "com.mitrais.kms.supply.MtrlTransBatchPresc";
    String MTRL_TRANS_BATCH_STTR_CLASS  = "com.mitrais.kms.supply.MtrlTransBatchSttr";
    String MTRL_TRANS_BATCH_IVAD_CLASS = "com.mitrais.kms.supply.MtrlTransBatchIvad";
    String MTRL_TRANS_BATCH_PRET_CLASS = "com.mitrais.kms.supply.MtrlTransBatchPret";
    String MTRL_TRANS_BATCH_SR_CLASS = "com.mitrais.kms.supply.MtrlTransBatchSR";
    String MTRL_TRANS_BATCH_MEDC_CHART_CLASS = "com.mitrais.kms.supply.MtrlTransBatchMedcChart";
    String MTRL_TRANS_BATCH_MEDC_CHART_RETURN_CLASS = "com.mitrais.kms.supply.MtrlTransBatchMedcReturn";
    String MTRL_TRANS_BATCH_RET_PHAR = "com.mitrais.kms.supply.MtrlTransBatchRetPhar";
    String WH_INVN_FIFO_PRC_AVAIL_CLASS = "com.mitrais.kms.supply.WHInventoryFIFOPricesAvail";
    String WH_INVN_MOVING_AVG_PRICE_CLASS = "com.mitrais.kms.supply.WHInventoryMovingAvgPrice";
    String PAYM_INFO_DAO_CLASS = "com.mitrais.kms.admin.PaymInfo";
    String PHYS_REC_CLASS = "PhysRec";
    String LOOKUP_TYPE_SCH_TIME = "SCH_TIME";
    String LOOKUP_ADDEDTIME = "ADDEDTIME";
    String PHYS_REC_TRMT_DETL_CLASS = "PhysRecTrmtDetl";
    String PO_HEAD_CLASS = "com.mitrais.kms.supply.PoHead";
    String PO_HEAD_LOG_CLASS = "com.mitrais.kms.supply.PoHeadLog";
    String PO_ITEM_CLASS = "com.mitrais.kms.supply.PoItem";
    String PO_ITEM_LOG_CLASS = "com.mitrais.kms.supply.PoItemLog";
    String PREG_REC_CLASS = "com.mitrais.kms.service.PregRec";
    String PRSC_REC_CLASS = "com.mitrais.kms.service.PrscRec";
    String PRSN_ACCT_CLASS = "PrsnAcct";
    String PRSN_INFO_CLASS = "PrsnInfo";
    String PRSN_INFO_DAO_CLASS = "com.mitrais.kms.admin.PrsnInfo";
    String PRSN_CASE_HIST_DAO_CLASS = "com.mitrais.kms.admin.PrsnCaseHist";
    String REG_GRP_DAO_CLASS = "com.mitrais.kms.admin.RegGrp";
    String REG_ITEM_DAO_CLASS = "com.mitrais.kms.admin.RegItem";
    String NONREG_SCHED_ITEM_CLASS = "com.mitrais.kms.admin.NonRegistrationScheduleItem";
    String REG_LABR_DAO_CLASS = "com.mitrais.kms.admin.RegLabr";
    String NON_REG_SCH_DAO_CLASS = "com.mitrais.kms.admin.NonRegistrationScheduleItem";
    String ROLE_ACCS_MAPP_CLASS = "RoleAccsMapp";
    String ROLE_ACCT_MAPP_CLASS = "RoleAcctMapp";
    String ROLE_INFO_CLASS = "RoleInfo";
    String BADG_NUMR_HAZD_LEVL_MAPP_CLASS = "BadgNumrHazdLevlMapp";
    String RETAIL_PHAR_HEAD = "com.mitrais.kms.supply.RetailPharHead";
    String RETAIL_PHAR_ITEM = "com.mitrais.kms.supply.RetailPharItem";    
    String ROPR_HEAD_CLASS = "com.mitrais.kms.supply.RoprHead";
    String ROPR_HEAD_LOG_CLASS = "com.mitrais.kms.supply.RoprHeadLog";
    String ROPR_ITEM_CLASS = "com.mitrais.kms.supply.RoprItem";
    String ROPR_ITEM_LOG_CLASS = "com.mitrais.kms.supply.RoprItemLog";
    String SPLR_INFO_CLASS = "com.mitrais.kms.supply.SplrInfo";
    String SPLR_TYPE_LIST_CLASS = "com.mitrais.kms.supply.SplrTypeList";
    String UKS_REC_CLASS = "com.mitrais.kms.service.UKSRec";
    String USER_PARM_CLASS = "UserParm";
    String WARH_INVN_CLASS = "com.mitrais.kms.supply.WarhInvn";
    String WARH_INVN_LOG_CLASS = "com.mitrais.kms.supply.WarhInvnLog";
    String WARH_INVN_HIST_CLASS = "com.mitrais.kms.supply.WarhInvnHist";
    String STCK_CATL_CLASS = "StckCatl";
    String SCREEN_CLASS = "com.mitrais.kms.config.Screen";
    String SYST_LKUP_CLASS = "com.mitrais.kms.config.SystLkup";
    String SYST_LKUP_LONG_CLASS = "com.mitrais.kms.config.SystLkupLong";
    String NUMR_SEQN_CLASS = "com.mitrais.kms.config.NumrSeqn";
    String DOCM_DATA_CLASS = "com.mitrais.kms.library.DocmData";
    String DOCM_DETL_CLASS = "com.mitrais.kms.library.DocmDetl";
    String CATL_SPLR_CLASS = "CatlSplr";
    String CATL_SPLR_LOG_CLASS = "CatlSplrLog";
    String KMS_MSG_CLASS = "com.mitrais.kms.util.messaging.KMSMessage";
    String KMS_DELIV_PROG_CLASS = "com.mitrais.kms.service.DelivProgRec";

    // Boundaries and Action Configuration
    String BOND_ACT_DETL = "com.mitrais.kms.config.ActDetl";
    String BOND_ACT_DETL_ALRT = "com.mitrais.kms.config.ActDetlAlrt";
    String BOND_ACT_DETL_HIST = "com.mitrais.kms.config.ActDetlHist";
    String BOND_ACT_DETL_MAIL = "com.mitrais.kms.config.ActDetlMail";
    String BOND_ACT_DETL_PRDE = "com.mitrais.kms.config.ActDetlPrde";
    String BOND_ACT_HEAD = "com.mitrais.kms.config.BondActHead";
    String BOND_ACT_LIST = "com.mitrais.kms.config.BondActList";
    String BOND_DETL = "com.mitrais.kms.config.BondDetl";
    String SPRING_BOND_ACT_SERVICE = "BondActService";

    // Forgot Password
    String FRGT_PSWD = "com.mitrais.kms.config.FrgtPswd";

    String DIARY_TASK_CLASS = "com.mitrais.kms.diary.DiaryTask";
    public static final String DIARY_ALERT_CLASS = "com.mitrais.kms.diary.DiaryAlert";
    public static final String DIARY_ALERT_USER_CLASS = "com.mitrais.kms.diary.DiaryAlertUser";
    
    // General Alert
    String SPRING_GNRL_ALERT_SERVICE = "GeneralAlertService";

    //Diary Screen
    String DIARY_SERVICE = "DiaryService";
    String DIARY_ACTION_PATH = "diaryDialog";
    String DIARY_TASK_STATUS_NEW = "N";
    String DIARY_TASK_STATUS_DISMISSED = "D";
    String DIARY_TASK_DISPLAY_TYPE_REMINDER = "R";    
    String DIARY_TASK_DISPLAY_TYPE_EMAIL = "E";
    String DIARY_URL_PARAM_OPEN ="open";
    String DIARY_ATTR_TASK_ID_NEED_TO_BE_OPEN = "taskIdNeedToBeOpen";
    String DIARY_ATTR_USER_FULL_NAME = "userFullName";
    String DIARY_DISPLAY_CONFIG = "displayConfig";
    String DIARY_ALLSTAFF = "ALLSTAFF";
    String DIARY_TASK_REF_ID_DEFAULT = "0";

    // Modul Service
    String MED_PATIENT_LOG_CLASS = "com.mitrais.kms.service.MedPatientLog";
    String INPT_DOCT_NOTE_CLASS = "com.mitrais.kms.service.InptDoctNote";
    String INPT_NURS_TRMT_CLASS = "com.mitrais.kms.service.InptNursTrmt";
    String MAST_REC_CLASS = "com.mitrais.kms.service.MastRec";
    String MAST_REC_CLASS_READ_ONLY = "com.mitrais.kms.service.MastRecRO";
    String MCU_ABNR_CLASS = "com.mitrais.kms.service.McuAbnr";
    String MCU_SUMR_CLASS = "com.mitrais.kms.service.McuSumr";
    String NUTR_REC_CLASS = "com.mitrais.kms.service.NutrRec";
    String OUTP_REC_CLASS = "com.mitrais.kms.service.OutpRec";
    String SURG_REC_CLASS = "com.mitrais.kms.service.SurgRec";
    String TRED_REC_CLASS = "com.mitrais.kms.service.TredRec";
    String VACC_REC_CLASS = "com.mitrais.kms.service.VaccRec";
    String DELIV_INFN_REC_CLASS = "com.mitrais.kms.service.DelivInfnRec";
    String DELIV_MATR_REC_CLASS = "com.mitrais.kms.service.DelivMatrRec";
    String INVC_PAYM_DETL_DAO_CLASS = "com.mitrais.kms.admin.InvcPaymDetl";
    String DENT_EXAM_CLASS = "com.mitrais.kms.service.DentExam";
    String DENT_EXAM_ITEM_CLASS = "com.mitrais.kms.service.DentExamItem";
    String DENT_MCUP_TOTH_DETL_CLASS = "com.mitrais.kms.service.DentMcupTothDetl";
    String DENT_ORTO_ACTV_GRP_CLASS = "com.mitrais.kms.service.DentOrtoActvGrp";
    String ECHO_DOPPLER_ITEM_CLASS = "com.mitrais.kms.service.EchoDopplerItem";
    String ECHO_DOPPLER_REC_CLASS = "com.mitrais.kms.service.EchoDopplerRec";
    String TEE_DSE_REC_CLASS = "com.mitrais.kms.service.TEEDobStressEchocardioRec";
    String LVF_CLASS = "com.mitrais.kms.service.LVF";
    String WALL_MOTION_CLASS = "com.mitrais.kms.service.WallMotion";
    String MULTI_SLICE_CT_SCAN_REC_CLASS = "com.mitrais.kms.service.MultiSliceCTScanRec";
    String EMRG_REC_CLASS = "com.mitrais.kms.service.EmrgRec";
    String HEAR_TEST_CLASS = "com.mitrais.kms.service.HearTest";
    String HEPB_REC_CLASS = "com.mitrais.kms.service.HepbRec";
    String INPT_BLOD_TRNF_CLASS = "com.mitrais.kms.service.InptBlodTrnf";
    String INPT_DOC_NOTE_CLASS = "com.mitrais.kms.service.InptDoctNote";
    String INPT_NURST_TRMT_CLASS = "com.mitrais.kms.service.InptNursTrmt";
    String INPT_NUTR_REC_CLASS = "com.mitrais.kms.service.InptNutrRec";
    String INPT_REC_CLASS = "com.mitrais.kms.service.InptRec";
    String INPT_VITL_SIGN_CLASS = "com.mitrais.kms.service.InptVitlSign";
    String INPT_VITL_SIGN_GRP_CLASS = "com.mitrais.kms.service.InptVitlSignGrp";
    String OPTC_SERV_CLASS = "com.mitrais.kms.service.OptcServ";
    String SICK_LEAV_CLASS = "com.mitrais.kms.service.SickLeav";
    String INPT_ICU_NOTE_CLASS = "com.mitrais.kms.service.InptICUNote";
	String MDVL_FORM_LETTER_CLASS = "com.mitrais.kms.service.MdvlFormLetter";
	String DELIV_PROG_CLASS = "com.mitrais.kms.service.DelivProgRec";
	String DELIV_VITAL_SIGN_CLASS = "com.mitrais.kms.service.DelivVitalSignRec";
	String HEMODIALISIS_REC_CLASS = "com.mitrais.kms.service.HemodialisisRec";
	String HEMODIALISIS_PROC_CLASS = "com.mitrais.kms.service.HemodialisisProc";
	String HEMO_PROCESS_GRP_CLASS = "com.mitrais.kms.service.HemoProcessGrp";
	String HEMOD_NURSE_DIAGNOSE_CLASS = "com.mitrais.kms.service.HemoNurseDiagnose";
	
	String MED_CHART_HEAD_CLASS = "com.mitrais.kms.service.MedChart";
	String MED_CHART_ITEM_CLASS = "com.mitrais.kms.service.MedChartItem";
	String MED_CHART_ISSUE_CLASS = "com.mitrais.kms.supply.MedChartIssue";


    //Inco Specific - Public Community Health
    String PCH_ACTV_REC_CLASS = "com.mitrais.kms.inco.service.PCHActvRec";
    String PCH_TEST_LOC_CLASS = "com.mitrais.kms.inco.service.PchTestLoc";
    String PCH_WATR_COND_HEAD_CLASS = "com.mitrais.kms.inco.service.PchWatrCondHead";
    String PCH_WATR_COND_ITEM_CLASS = "com.mitrais.kms.inco.service.PchWatrCondItem";
    String XRAY_CLASS = "com.mitrais.kms.service.XRay";
    String XRAY_ITEM_CLASS = "com.mitrais.kms.service.XrayItem";
    String CORE_XRAY_ITEM_CLASS = "com.mitrais.kms.service.CoreXRayItem";
    String CORE_XRAY_CLASS = "com.mitrais.kms.service.CoreXRay";
    String SPRING_ADMIN_301_DAO_CONCRETE = "gpfb301DAOConcrete";
    String SPRING_ADMIN_302_DAO_CONCRETE = "gpfb302DAOConcrete";
    String SPRING_ADMIN_BDIMPL = "adminBDConcrete";
    String SPRING_ADMIN_BD_CONCRETE = "adminBDConcrete";
    String SPRING_ADMIN_DELIVE_DAO_CONCRETE = "DelivInfnRecDAOConcrete";
    String SPRING_EQUI_MAST_CONCRETE = "EquiMastDAO";
    String SPRING_BOOK_HEAD_CONCRETE = "BookHeadDAO";
    String SPRING_BOOK_ITEM_CONCRETE = "BookItemDAO";

    // corrected by dion, there is *no* such "prsnInfoDAOConcrete" in Spring's XML,
    // but rather "prsnInfoDAO"
    // String SPRING_ADMIN_PRSN_INFO_DAO_CONCRETE = "prsnInfoDAOConcrete";
    String SPRING_ADMIN_PRSN_INFO_DAO_CONCRETE = "PrsnInfoDAO";
    String SPRING_BLOD_DONR_CONCRETE = "BlodDonrDAO";
    String SPRING_DELIV_INFN_DAO_CONCRETE = "DelivInfnRecDAO";
    String SPRING_DELIV_MATR_REC_DAO_CONCRETE = "DelivMatrRecDAO";
    String SPRING_DENT_MCUP_CONCRETE = "DentMcupDAO";
    String SPRING_DENT_MCUP_TOTH_DTL_CONCRETE = "DentMcupTothDtlDAO";
    String SPRING_DENT_ORTO_CONCRETE = "DentOrtoDAO";
    String SPRING_DENT_ORTO_ITEM_CONCRETE = "DentOrtoItemDAO";
    String SPRING_DIAG_SUPP_CONCRETE = "DiagSuppDAO";
    String SPRING_DIAG_SUPP_ITEM_CONCRETE = "DiagSuppItemDAO";
    String SPRING_DOCM_DATA_DAO_CONCRETE = "DocmDataDAO";
    String SPRING_DOCM_DETL_DAO_CONCRETE = "DocmDetlDAO";
    String SPRING_DTD_DETL_DAO_CONCRETE = "DtdDetlDAO";
    String SPRING_DTD_ICD_MAPP_DAO_CONCRETE = "DtdIcdMappDAO";
    String SPRING_EMRG_WORK_ACCD_CONCRETE = "EmrgWorkAccdDAO";
    String SPRING_EMRG_CTCT_DAO_CONCRETE = "EmrgCtctDAO";
    String SPRING_EXTN_PROG_DAO_CONCRETE = "ExtnProgDAO";
    String SPRING_FAMI_PLAN_CONCRETE = "FamiPlanDAO";
    String SPRING_FAMI_PLAN_DAO_CONCRETE = "FamiPlanDAO";
    String SPRING_HEAR_TEST_DAO_CONCRETE = "HearTestDAO";
    String SPRING_HEPB_REC_DAO_CONCRETE = "HepbRecDAO";
    String SPRING_HTML_DATA_DAO_CONCRETE = "HTMLDataDAO";
    String SPRING_HTML_HEAD_DAO_CONCRETE = "HTMLHeadDAO";
    String SPRING_ICD_MAST_DAO_CONCRETE = "IcdMastDAO";
    String SPRING_INFN_REC_CONCRETE = "InfnRecDAO";
    String SPRING_INPT_BLOD_TRNF_DAO_CONCRETE = "InptBlodTrnfDAO";
    String SPRING_INPT_NURS_TRMT_DAO_CONCRETE = "InptNursTrmtDAO";
    String SPRING_INPT_NUTR_REC_DAO_CONCRETE = "InptNutrRecDAO";
    String SPRING_INPT_VITL_SIGN_DAO_CONCRETE = "InptVitlSignDAO";
    String SPRING_INPT_VITL_SIGN_GRP_DAO_CONCRETE = "InptVitlSignGrpDAO";
    String SPRING_INVC_HEAD_DAO_CONCRETE = "InvcHeadDAO";
    String SPRING_INVC_ITEM_DAO_CONCRETE = "InvcItemDAO";
    String SPRING_INVC_PAYM_DAO_CONCRETE = "InvcPaymDAO";
    String SPRING_MTRL_TRANS_HEAD_CONCRETE = "MtrlTransHeadDAO";
    String SPRING_MTRL_TRANS_ITEM_CONCRETE = "MtrlTransItemDAO";
    String SPRING_LUNG_TEST_CONCRETE = "LungTestDAO";
    String SPRING_MCU_ABNR_DAO_CONCRETE = "McuAbnrDAO";
    String SPRING_MCU_SUMR_DAO_CONCRETE = "McuSumrDAO";
    String SPRING_MEDC_ACTN_DAO_CONCRETE = "MedcActnDAO";
    String SPRING_MOTH_REC_CONCRETE = "MothRecDAO";
    String SPRING_MSF_200_DAO_CONCRETE = "Msf200DAO";
    String SPRING_MTRL_EXPR_CONCRETE = "MtrlExprDAO";
    String SPRING_MTRL_RECV_CONCRETE = "MtrlRecvDAO";
    String SPRING_NUMR_SEQN_DAO_CONCRETE = "NumrSeqnDAO";
    String SPRING_NUTR_REC_DAO_CONCRETE = "NutrRecDAO";
    String SPRING_OPTC_SERV_DAO_CONCRETE = "OptcServDAO";
    String SPRING_PAYM_INFO_DAO_CONCRETE = "PaymInfoDAO";
    String SPRING_PO_HEAD_CONCRETE = "PoHeadDAO";
    String SPRING_PO_ITEM_CONCRETE = "PoItemDAO";
    String SPRING_PREG_REC_CONCRETE = "PregRecDAO";
    String SPRING_PREG_REC_DAO_CONCRETE = "PregRecDAO";
    String SPRING_PRSC_REC_CONCRETE = "PrscRecDAO";
    String SPRING_PRSN_INFO_DAO_CONCRETE = "PrsnInfoDAO";
    String SPRING_REG_GRP_DAO_CONCRETE = "RegGrpDAO";
    String SPRING_REG_ITEM_DAO_CONCRETE = "RegItemDAO";
    String SPRING_REG_LABR_DAO_CONCRETE = "RegLabrDAO";
    String SPRING_ROPR_HEAD_CONCRETE = "RoprHeadDAO";
    String SPRING_ROPR_ITEM_CONCRETE = "RoprItemDAO";
    String SPRING_RPRT_DEFN_DAO_CONCRETE = "RprtDefnDAO";
    String SPRING_RPRT_TMPL_DAO_CONCRETE = "RprtTmplDAO";
    String SPRING_SPLR_INFO_CONCRETE = "SplrInfoDAO";
    String SPRING_SURG_REC_DAO_CONCRETE = "SurgRecDAO";
    String SPRING_TARF_LIST_DAO_CONCRETE = "TarfListDAO";
    String SPRING_TRED_REC_DAO_CONCRETE = "TredRecDAO";
    String SPRING_UKS_DETL_DAO_CONCRETE = "UKSDetlDAO";
    String SPRING_UKS_REC_CONCRETE = "UKSRecDAO";
    String SPRING_VACC_REC_DAO_CONCRETE = "VaccRecDAO";
    String SPRING_WARH_INVN_CONCRETE = "WarhInvnDAO";
    String SPRING_WARH_INVN_HIST_CONCRETE = "WarhInvnHistDAO";
    String SPRING_INVC_PAYM_DETL_DAO_CONCRETE = "InvcPaymDetlDAO";
    String SPRING_MAST_REC_DAO_CONCRETE = "MastRecDAO";
    String SPRING_MEDICAL_RECORD_TYPE_DAO_CONCRETE = "MedicalRecordTypeDAO";

    //Inco Specific Public Community Health
    String SPRING_PCH_ACTV_REC_CONCRETE = "PCHActvRecDAO";
    String SPRING_PCH_TEST_LOC_CONCRETE = "PchTestLocDAO";
    String SPRING_PCH_WATR_COND_HEAD_CONCRETE = "PchWatrCondHeadDAO";
    String SPRING_PCH_WATR_COND_ITEM_CONCRETE = "PchWatrCondItemDAO";
    String SPRING_PCH_ACTV_REC_BO = "PCHActvRecBO";
    String SPRING_PCH_TEST_LOC_BO = "PchTestLocBO";
    String SPRING_PCH_WATR_COND_HEAD_BO = "PchWatrCondHeadBO";
    String SPRING_PCH_WATR_COND_ITEM_BO = "PchWatrCondItemBO";
    String SPRING_PCH_WATR_COND_SERVICE = "WaterConditionService";
    String SPRING_PCH_WATR_COND_SEARCH_MANAGER = "WaterConditionSearchManager";

    // Inco Specific OMT Invoice BO
    String SPRING_OMT_INVOICE_BO = "OMTInvoiceBO";

    // BO Declarations for Spring goes here
    String SPRING_MEDICAL_RECORD_BO = "medicalRecordBO";
    String SPRING_ELLIPSE_BATCH_INVOICE_DAO_CONCRETE = "EllipseBatchInvoiceDAO";

    /*
     * by dion, should not called direclty, but rather via proxy
     * tp krn masih blum bisa, panggil langsung saja
     */
    String SPRING_FINANCE_BO_TARGET = "FinanceBOTarget";
    String SPRING_FINANCE_BO = "FinanceBO";
    String SPRING_PERSONINFO_BO_TARGET = "PersonInfoBOTarget";
    String SPRING_PERSONINFO_BO = "PersonInfoBO";
    String SPRING_USER_BO = "PrsnAcctBO";
    String SPRING_LOG_HEADER_BO = "LogHeaderBO";
    String SPRING_REGISTRATION_BO_TARGET = "RegistrationBOTarget";
    String SPRING_REGISTRATION_BO = "RegistrationBO";
    String SPRING_NON_REGISTRATION_BO = "NonRegistrationScheduleBO";
    String SPRING_REPORTING_BO_TARGET = "ReportingBOTarget";
    String SPRING_REPORTING_BO = "ReportingBO";
    String SPRING_INVOICEPAYMENT_BO_TARGET = "InvoicePaymentBOTarget";
    String SPRING_INVOICEPAYMENT_BO = "InvoicePaymentBO";
    String SPRING_INVOICE_BO_TARGET = "InvoiceBOTarget";
    String SPRING_INVOICE_BO = "InvoiceBO";
    String SPRING_INVOICE_PAYMENT_DETAIL_BO_TARGET = "InvoicePaymentDetailBOTarget";
    String SPRING_INVOICE_PAYMENT_DETAIL_BO = "InvoicePaymentDetailBO";
    String SPRING_FINANCE_SERVICE_TARGET = "FinanceServiceTarget";
    String SPRING_FINANCE_SERVICE = "FinanceService";

    //Name of Medical Library BO
    String SPRING_ICD10_B0_TARGET = "Icd10BOTarget";
    String SPRING_ICD10_BO = "Icd10BO";
    String SPRING_SNOMED_B0_TARGET = "SnomedBOTarget";
    String SPRING_SNOMED_BO = "SnomedBO";
    

    //Name of Master Record BO
    String SPRING_MASTER_RECORD_BO_TARGET = "MasterRecordBOTarget";
    String SPRING_MASTER_RECORD_BO = "MasterRecordBO";
    String SPRING_MEDICAL_LIBRARY_BO = "MedicalLibraryBO";
    String SPRING_MEDICAL_LIBRARY_SERVICE = "MedicalLibraryService";
    String SPRING_INVENTORY_SERVICE = "InventoryService";
    String SPRING_INVENTORY_ADJUSTMENT_BO = "InventoryAdjustmentBO";
    String SPRING_SUPPLIER_INFO_SERVICE = "SupplierInfoService";
    String SPRING_MCU_PACKAGE_SERVICE = "MCUPackageService";
    String SPRING_PURCHASING_SERVICE = "PurchasingService";
    String SPRING_MTRLTRANS_SERVICE = "MtrlTransService";
    String SPRING_REPORTING_SERVICE = "ReportingService";
    String SPRING_UKSDETL_BO = "UKSDetlBO";
    String SPRING_UKSDETL_BO_TARGET = "UKSDetlBOTarget";
    String SPRING_SCHLACTVDTL_BO = "SchlActvDetlBO";
    String SPRING_AUDIT_SERVICE = "AuditService";
    String SPRING_AVERAGE_PRICE_BO_FACTORY = "AveragePriceBOFactory";


    String SPRING_MTRL_TRACKING_SERVICE = "MtrlTrackingService";


    //Search Supplier Ellipse
    String SPRING_SEARCH_SUPPLIER_ELLIPSE = "SearchSupplierSearchManager";
    String SPRING_MSF200_BO_TARGET = "Msf200BOTarget";

    //Store transfer Email
    String SPRING_MESSAGE_SENDER = "MessageSender";
    String SPRING_MESSAGE_SERVICE = "MessageService";

    // Name of DAO bean context
    String ACCS_METH_MAPP_DAO_BEAN_CONTEXT = "AccsMethMappDAO";
    String GRP_INFO_DAO_BEAN_CONTEXT = "GrpInfoDAO";
    String GRP_PRSN_MAPP_DAO_BEAN_CONTEXT = "GrpPrsnMappDAO";
    String MENU_GRP_DAO_BEAN_CONTEXT = "MenuGrpDAO";
    String MENU_GRP_MENU_MAPP_DAO_BEAN_CONTEXT = "MenuGrpMenuMappDAO";
    String PRSN_ACCT_DAO_BEAN_CONTEXT = "PrsnAcctDAO";
    String ROLE_ACCS_MAPP_DAO_BEAN_CONTEXT = "RoleAccsMappDAO";
    String ROLE_ACCT_MAPP_DAO_BEAN_CONTEXT = "RoleAcctMappDAO";
    String ROLE_INFO_DAO_BEAN_CONTEXT = "RoleInfoDAO";
    String SYST_LKUP_DAO_BEAN_CONTEXT = "SystLkupDAO";
    String USER_PARM_DAO_BEAN_CONTEXT = "UserParmDAO";
    String FRGT_PSWD_DAO_BEAN_CONTEXT = "FrgtPswdDAO";
    String RETAIL_PHAR_HEAD_DAO_CONTEXT = "RetailPharHeadDAO";
    String RETAIL_PHAR_ITEM_DAO_CONTEXT = "RetailPharItemDAO";        
    String FRGT_PSWD_BO_BEAN_CONTEXT = "FrgtPswdBO";
    String SYST_LKUP_BO_BEAN_CONTEXT = "SystLkupBO";
    String CTX_LOOKUP_PRESCRIPTION_MAP = "prescriptionMap";
    String LOOKUP_TYPE_ACTION_STATUS = "AC_STS";
    String CTX_LOOKUP_ACTION_STATUS = "lkupActionStatus";
    String LOOKUP_TYPE_TARIFF_CLASSIF = "TF_CFN";
    String CTX_TARIFF_CLASSIF_LIST = "tariffClassifList";
    String CTX_TARIFF_MED_ACT_LIST = "tariffMedActList";
    String CTX_LOOKUP_TARIFF_LIST = "lkupTariffList";
    String CTX_TARIFF_LIST_LIST = "tariffListList";
    String CTX_MEDICAL_ACTION_LIST = "medcActionList";
    String CTX_LOOKUP_INVC_MEDC_TOTAL = "medcActionTotal";
    String ORDER_BY_QUERY = " order by ";
    
    //Maternity File
    String CTX_DELIV_PARTOGRAPH = "partograph";
    //For Delivery Progress Table List
    String CTX_DELIV_PROG_REC = "delivProgRec";
    //For Vital Table List
    String CTX_VITAL_SIGN_REC = "vitalSignRec";
    //For Delivery Infant List
    String CTX_DELIV_INFN_REC = "delivInfnRec";
    String CTX_DELIV_INFN_SIZE = "delivInfnSize";

    // Table aliases for Hibernate Query
    // CONFIG
    String SYST_LKUP_TABLE_ALIAS = "lookup";
    String SYST_LKUP_LONG_TABLE_ALIAS = "lookupLong";
    String ACCS_METH_MAPP_TABLE_ALIAS = "access";
    String ROLE_INFO_TABLE_ALIAS = "role";
    String GRP_INFO_TABLE_ALIAS = "groupinfo";
    String GRP_PRSN_MAPP_TABLE_ALIAS = "grpprsnmapp";
    String MENU_GRP_TABLE_ALIAS = "menugrp";
    String MENU_GRP_MENU_MAPP_TABLE_ALIAS = "menuGrpMenuMapp";
    String ROLE_ACCS_MAPP_TABLE_ALIAS = "roleaccsmapp";
    String ROLE_ACCT_MAPP_TABLE_ALIAS = "roleacctmapp";
    String BADG_NUMR_HAZD_LEVL_MAPP_TABLE_ALIAS = "badgnumrhazdlevlmapp";
    String USER_PARM_TABLE_ALIAS = "userparm";
    String PRSN_ACCT_TABLE_ALIAS = "prsnacct";

    // Administration
    String NON_REGISTRATION_TABLE_ALIAS = "nonRegSch";

    // ONLINE HELP
    public static final String TABLE_TYPE_ONLINE_HELP = "OL_HLP";
    //README
    public static final String TABLE_TYPE_README = "README";
    public static final String CTX_README = "readMe";
    public static final String TABLE_CODE_RELEASE_NOTE = "REL_NOTE";

    // ADMIN
    String PRSN_INFO_TABLE_ALIAS = "prsninfo";

    // SERVICE
    String BLOD_DONR_TABLE_ALIAS = "bloddonr";
    String BLOD_DONR_TEST_TABLE_ALIAS = "bloddonrtest";
    String DELIV_INFN_REC_TABLE_ALIAS = "delivinfnrec";
    String DELIV_MATR_REC_TABLE_ALIAS = "delivmatrrec";
    String DENT_EXAM_TABLE_ALIAS = "dentexam";
    String DENT_EXAM_ITEM_TABLE_ALIAS = "dentexamitem";
    String DENT_MCUP_TABLE_ALIAS = "dentmcup";
    String DENT_MCUP_TOTH_DETL_TABLE_ALIAS = "dentmcuptothdetl";
    String DENT_ORTO_ACTV_GRP_TABLE_ALIAS = "dentortoactvgrp";
    String DENT_ORTO_TABLE_ALIAS = "dentorto";
    String DENT_ORTO_ITEM_TABLE_ALIAS = "dentortoitem";
    String ECHO_DOPPLER_ITEM_TABLE_ALIAS = "echodoppleritem";
    String ECHO_DOPPLER_REC_TABLE_ALIAS = "echodopplerrec";
    String TEE_DSE_REC_TABLE_ALIAS = "teedserec";
    String LVF_TABLE_ALIAS = "lvf";
    String WALL_MOTION_TABLE_ALIAS = "wallmotion";
    String DIAG_SUPP_TABLE_ALIAS = "diagsupp";
    String DIAG_SUPP_ITEM_TABLE_ALIAS = "diagsuppitem";
    String EMRG_REC_TABLE_ALIAS = "emrgrec";
    String FAMI_PLAN_TABLE_ALIAS = "famiplan";
    String HEAR_TEST_TABLE_ALIAS = "heartest";
    String HEPB_REC_TABLE_ALIAS = "hepbrec";
    String INPT_ICU_NOTE_TABLE_ALIAS = "inpticunote";
    String INFN_REC_TABLE_ALIAS = "infnrec";
    String INPT_BLOD_TRNF_TABLE_ALIAS = "inptblodtrnf";
    String INPT_DOCT_NOTE_TABLE_ALIAS = "inptdoctnote";
    String INPT_NURS_TRMT_TABLE_ALIAS = "inptnurstrmt";
    String INPT_NUTR_REC_TABLE_ALIAS = "inptnutrrec";
    String INPT_REC_TABLE_ALIAS = "inptrec";
    String INPT_VITL_SIGN_TABLE_ALIAS = "inptvitlsign";
    String INPT_VITL_SIGN_GRP_TABLE_ALIAS = "inptvitlsigngrp";
    String LUNG_TEST_TABLE_ALIAS = "lungtest";
    String MAST_REC_TABLE_ALIAS = "mastrec";
    String MCU_ABNR_TABLE_ALIAS = "mcuabnr";
    String MCU_SUMR_TABLE_ALIAS = "mcusumr";
    String MOTH_REC_TABLE_ALIAS = "mothrec";
    String MULTI_SLICE_CT_SCAN_REC_TABLE_ALIAS = "multislicectscanrec";
    String NUTR_REC_TABLE_ALIAS = "nutrrec";
    String OFFS_MEDI_TRMT_TABLE_ALIAS = "offsmeditrmt";
    String OPTC_SERV_TABLE_ALIAS = "optcserv";
    String OUTP_REC_TABLE_ALIAS = "outprec";
    String PHYS_REC_TABLE_ALIAS = "physrec";
    String PHYS_REC_TRMT_DETL_TABLE_ALIAS = "physrectrmtdetl";
    String PREG_REC_TABLE_ALIAS = "pregrec";
    String PRSC_REC_TABLE_ALIAS = "prscrec";
    String SICK_LEAV_TABLE_ALIAS = "sickLeav";
    String SURG_REC_TABLE_ALIAS = "surgrec";
    String TRED_REC_TABLE_ALIAS = "tredrec";
    String UKS_REC_TABLE_ALIAS = "uksrec";
    String VACC_REC_TABLE_ALIAS = "vaccrec";
    String REHB_MAST_REC_TABLE_ALIAS = "rehbmastrec";
    String XRAY_TABLE_ALIAS = "xray";
    String XRAY_ITEM_TABLE_ALIAS = "xrayitem";
    String XRFILM_REC_TABLE_ALIAS = "xrfilmrec";
    String CORE_XRAY_TABLE_ALIAS = "corexray";
    String CORE_XRAY_ITEM_TABLE_ALIAS = "corexrayitem";
    String MDVL_FORM_LETTER_TABLE_ALIAS = "mdvlFormLetter";

    // Custom INCO
    String EMRG_WORK_ACCD_TABLE_ALIAS = "emrgworkaccd";

    public static final String LOOKUP_TYPE_SUP_GROUP = "SUP_GRP";
    // used for section list in person info (staff & patient)
    String LOOKUP_TYPE_EMPL_SECTION = "SECTION";
    String CTX_LOOKUP_INV_STAT = "lookupInvcStatus";

    // TODO : find a reasonable and efficient way to get attribute value from action form
    // cant retrieve value using request.getParameter
    String CTX_INVC_STATUS = "invoiceStatus";

    // this is the property of a Java Bean
    // e.g PrsnInfo.getCreatedBy, RegGrp.get
    String BEANPROP_CREATED_BY = "createdBy";
    String BEANPROP_CREATED_DATE = "createdDate";
    String BEANPROP_STAFF_ID = "staffId";
    String BEANPROP_PERSON_ID = "personId";
    String BEANPROP_DOCTOR_ID = "doctorId";
    String BEANPROP_MR_NO = "mrNo";
    String BEANPROP_SPONSOR_ID = "spnEmployeeId";
    String EXPENSE_ELEMENT_OTHERS = "99999999";
    String CTX_LIST_EE = "listEE";
    String LOOKUP_TYPE_ELLCON = "ELLCON";
    String LOOKUP_TYPE_ELLUSR = "ELLUSR";
    String CTX_MAP_PATIENT = "mapPatient";
    String CTX_MAP_SPONSOR = "mapSponsor";
    String CTX_INVCHEAD_PAYMENT_TYPE = "invcHeadPaymentType";

    // Library - ICD
    public static final String ICD_9_NO = "9";
    public static final String ICD_10_NO = "10";
    public static final String ICD_CURR_NO = "currIcdNo";
    // Treatment Class
    public static final String LOOKUP_TYPE_TREAT_CLS = "TREA_CLS";
    public static final String CTX_TREAT_CLS = "treatCls";

    //Invoice Item
    String INVOICE_ITEM_TYPE_DOWNPAYMENT = "DPM";

    //Invoice Payment
    String LOOKUP_TYPE_PAYMENT_FOR = "PYM_FOR";
    String CTX_PAYMENT_FOR_LIST = "paymentForList";
    String PAYMENT_FOR_REFUND = "F";
    String PAYMENT_FOR_HALF_PAID = "H";
    String PAYMENT_FOR_FULLY_PAID = "P";
    String PAYMENT_FOR_REMAIN_UNPAID = "R";
    String PAYMENT_STATUS_PAID = "P";
    String PAYMENT_STATUS_UNPAID = "U";
    String PAYMENT_STATUS_HALF_PAID = "H";
    String PAYMENT_STATUS_CANCELLED = "L";
    String EMAILS_SEPARATOR = ",";

    //     Jasper Report
    String JASP_RPRT_DEFN_CLASS = "com.mitrais.kms.admin.JaspRprtDefn";
    String JASP_RPRT_PARM_CLASS = "com.mitrais.kms.admin.JaspRprtParm";

    //-------------------------------
    // JASPER REPORT CONSTANTS
    //-------------------------------
    //  Jasper Report Service
    String JASPER_REPORT_SERVICE = "JasperReportService";
    public static final String PREGNANCY_MR_TYPE = "15";

    String SHOW_DEPENDENT = "showDependent";
	public static final String PREF_LANG_INDONESIA = "ID";
	public static final String USER_PREF_CCY_FORMAT_FOR_DISP_RO = "CurrencyFormatting";

    //-------------------------------
    // AJAX CONSTANTS
    //-------------------------------
    // AJAX COMMONS
    public static final String AJAX_NUMBER = "No.";
    public static final String LOOKUP_TYPE_SERVICE_VALID = "GE_VALID";
    public static final String CTX_VALID_REQUIRED ="validRequired";
    public static final String CTX_PRESC_AUTH_TYPE ="authorizedPrsnType";
    public static final String LEGAL_PRESCRIPTION_TYPE = "D";
    public static final String NURSE_ALKES_TYPE = "N";

    // AJAX ICD CODE
    public static final String AJAX_ICD_CODE = "icdCode";
    public static final String AJAX_INTERNATIONAL_NAME = "intlName";
    public static final String AJAX_LOCAL_NAME = "localName";
    
    //AJAX NANDA CODE
    public static final String AJAX_NANDA_CODE = "nandaCode";
    public static final String ICD_CODE_1 = "icdCode1";
    public static final String ICD_CODE_2 = "icdCode2";
    public static final String ICD_CODE_3 = "icdCode3";
    

//  AJAX Patient Search
    public static final String AJAX_MR_NO = "mrNo";
    public static final String AJAX_FULL_NAME = "fullName";
    public static final String AJAX_EMPLOYEE_ID = "employeeId";
    public static final String AJAX_FIRST_NAME = "firstName";
    public static final String AJAX_LAST_NAME = "lastName";
    public static final String AJAX_DOB = "dateOfBirth";
    public static final String AJAX_PATIENT_NAME = "patientName";

    //AJAX Staff Search
    public static final String AJAX_STAFF_ID = "staffId";
    public static final String AJAX_STAFF_NAME = "staffName";
    public static final String AJAX_STAFF_TYPE = "staffType";

    //AJAX Drug Search
    public static final String AJAX_STOCK_CODE = "stockCode";
    public static final String AJAX_STOCK_NAME = "stockName";
    public static final String AJAX_MEDICINE_NAME = "medicineName";
    public static final String AJAX_MAX_ORDER = "maxOrder";
    public static final String AJAX_MEDIC_FUNCTION = "medicFunc";
    public static final String AJAX_UOI = "uoi";
    public static final String AJAX_TYPE = "type";
    public static final String AJAX_UNIT_PRICE = "uitPrc";
    public static final String AJAX_DESC = "description";

    //Main Menu global forward key. Fixing error when directly access login.do
    public static final String MAINMENU = "mainMenu";
    public static final String LOGIN_PAGE = "loginPage";
    public static final String SESSION_KEY_USER_LANDINGPAGE = "userLandingPage";
    public static final String SESSION_KEY_FLAG_ACCESS_LOGIN = "userFlagAccessLogin";
    //Non Standart Catalog
	public static final String LOOKUP_TYPE_ORIGINATOR = "NSTD_ORG";
	public static final String CTX_ORIGINATOR_LIST = "originatorList";

	public static final String AUDIT_FLAG_TABLE_TYPE = "AUDT_FLG";
	public static final String YN_FLAG_TABLE_CODE = "YN_FLG";
	public static final String AUDIT_DATA_DUMP_DIRECTORY_TABLE_CODE = "AUDIT_DATA_DIRECTORY";

	//Patient Registration Search page
	public static final String KMS_PATIENT_REG_SEARCH_PAGE = "patientSearch";
	//Patient Search page holder
	public static final String KMS_PATIENT_SEARCH_PAGE_KEY = "patientSearchRequestkey";

	public static final String GROUPITEM_EXAMITEM_TOKEN = "_";

	public static final String IMMEDIATE_TRANSFER_ROLE = "IMMTRN";
	public static final String SESSION_KEY_IMMEDIATE_TRANSFER_GRANT = "immTrnGrantSession";

    //BLOOD BANK
    String REG_BLOOD_BANK_DAO_CLASS = "com.mitrais.kms.ptfi.admin.RegBloodBank";
    String BLOOD_BANK_LOG_DAO_CLASS = "com.mitrais.kms.ptfi.service.BloodBankLog";
    String INVN_BLOOD_BANK_DAO_CLASS = "com.mitrais.kms.ptfi.service.InvnBloodBank";
    public static final String MR_TYPE_BLOOD_BANK ="18";
	public static final String ERROR_MSSUP_AT_LEAST_ONE_ITEM_MUST_BE_VALID_FOR_APPROVED_REQUEST = "error.mssup.at.least.one.item.must.be.valid.for.approved.request";

    public static final String CTX_REQ_BLOOD_PACK_TYPE_LIST = "BloodPackTypeList";
    public static final String LOOKUP_TYPE_REQ_BLOOD_PACK_TYPE = "PAC_BLOD";

    public static final String CTX_REQ_BLOOD_TYPE_LIST = "BloodTypeList";
    public static final String LOOKUP_TYPE_REQ_BLOOD_TYPE = "REQ_BLOD";

    public static final String CONST_BLOOD_TRANSACTION = "TRANS";
    public static final String CONST_BLOOD_DISCHARGES = "DISCH";

    public static final String CTX_BLOOD_BANK_LOC_LIST = "BDLocList";
    public static final String CTX_BLOOD_BANK_LOC_MAP = "BDLocMap";
    public static final String CTX_REQ_BLOOD_PACK_TYPE_MAP = "BloodPackTypeMap";
    public static final String LOOKUP_CODE_BLOOD_BANK_LOCATION = "BD_LOC";

    public static final String FLAG_BLOOD_DONOR = "BD";
    public static final String FLAG_BLOOD_REQUEST = "BR";

    public static final String CONSTANT_WHOLE_BLOOD = "WHB";
    public static final String CONSTANT_PRC = "PRC";
    public static final String CONSTANT_PLT = "PLT";
    public static final String CONSTANT_WRC	= "WRC";
    public static final String CONSTANT_LRR	= "LRR";
    public static final String CONSTANT_FFP	= "FFP";
    public static final String CONSTANT_CA = "CA";
    public static final String CONSTANT_HA = "HA";
    public static final String CONSTANT_IGL = "IGL";
    public static final String CONSTANT_LQP = "LP";
    public static final String CONSTANT_TRC = "TC";
    public static final String CONSTANT_BFG = "BC";
    public static final String CONSTANT_OTH = "OTH";

	public static final String USER_VALUES_DETAIL_EXAM_KEYS = "tableCode|parentPurpose|assocVal01";
	public static final String USER_VALUES_CORE_XRAY_KEYS = "tableCode|parentPurpose|assocVal01";


	public static final String CTX_LABORATORY_LOCATION = "LabLocation";
	public static final String CTX_EXAM_MTD_LIST = "examMethodList";
	public static final String CTX_EXAM_EQUIP_LIST = "examEquipmentList";
	public static final String CTX_EXAM_SPEC_LIST = "examSpecimenList";
	public static final String LOOKUP_TYPE_LABORATORY_LOCATION = "LAB_LOC";
	public static final String LOOKUP_TYPE_EXAM_METHOD = "MTD_EXM";
	public static final String LOOKUP_TYPE_EXAM_EQUIPMENT = "EQM_EXM";
	public static final String LOOKUP_TYPE_EXAM_SPEC = "MTR_EXM";
	public static final String TABLE_CODE_LABORATORY_LOCATION_TPRA = "TPRA";
	public static final String TABLE_CODE_LABORATORY_LOCATION_KK = "KK";
	public static final String TABLE_CODE_LABORATORY_LOCATION_MIX = "MIX";
	public static final String TABLE_CODE_LABORATORY_LOCATION_OFFSITE_ISLAND = "OISLN";
	public static final String TABLE_CODE_LABORATORY_LOCATION_OFFSITE_ISLAND_AUS = "OI_AUS";
	public static final String TABLE_CODE_LABORATORY_LOCATION_OFFSITE_ISLAND_SING = "OI_SING";
	public static final String CHILD_NORMAL_VALUE_TYPE = "C";
	public static final String FEMALE_NORMAL_VALUE_TYPE = "F";
	public static final String MALE_NORMAL_VALUE_TYPE = "M";
	public static final String OTHER_NORMAL_VALUE_TYPE = "O";
	public static final String LOOKUP_TYPE_EXAM_NORMAL = "EXM_NORM";
	public static final String LOOKUP_TYPE_EXAM_DESC = "DESC_EXM";

	public static final String CTX_WARD_SURGERY_CASE ="wardSurgeryCase";
    public static final String CTX_ADT_PROGNOSIS ="adtPrognosis";
	public static final String LOOKUP_TYPE_WARD_SURGERY_CASE = "WSRG_CS";
    public static final String LOOKUP_TYPE_ADT_PROGNOSIS = "INPT_PR";
    public static final String LOOKUP_TYPE_WARD_OPHTALMOLOGY = "OP1";
    public static final String LOOKUP_TYPE_WARD_SURGICAL_DIS = "SC2";
    public static final String LOOKUP_TYPE_WARD_PSYCHO_ABUSE = "PA";

	public static final String CTX_EMERGENCY_CASE_LIST ="emergencyCase";
	public static final String LOOKUP_TYPE_EMERGENCY_CASE = "AE_CS";
    public static final String CTX_OP_THEATER_UNIT_LIST = "opUnitList";
    public static final String LOOKUP_TYPE_OP_UNIT = "MR_UNT";
    public static final String CTX_HCU_UNIT_LIST = "hcuUnitList";
    public static final String LOOKUP_TYPE_HCU_UNIT = "HCU_UNIT";
	public static final String LOOKUP_TYPE_DEFAULT_VALUE = "DEF_VALUE";
	public static final String LOOKUP_CODE_TREATMENT_CLASS= "TREAT_CLASS";
	public static final String TABLE_CODE_DEFAULT_MRNO_LENGTH = "MRNO_LENGTH";
	public static final String TABLE_CODE_UPDATE_SOH_DIFF_IMPORT = "SOHDIF_IMP";

	public static final String LOOKUP_TYPE_PAYMENT_TYPE_MAP = "PaymentTypeMap";

	public static final String MEDICAL_CHECKUP_ACTIVITY_TYPE = "MCU";
	public static final String SERVICE_WITH_ALL_ACCESS_TYPE = "ALL";

	public static final String MAT_051A_PDF_REPORT_ID = "PDFRPTSTRTRNSFREQ";
	public static final String MAT_051B_PDF_REPORT_ID = "PDFRPTSTRTRNSFISSD";

	public static final String MAT_061A_PDF_REPORT_ID = "PDFRPTSTRREQREQ";
	public static final String MAT_061B_PDF_REPORT_ID = "PDFRPTSTRREQISSD";

	public static final String LOOKUP_TYPE_SETTING = "SETTING";
	public static final String PT_LIST_DISP_FLAG = "PT_LIST_DISP_FLAG";
	public static final String LOOKUP_CODE_BYPASS_PR_APPROVAL = "BYPASS_PR_APPRV";

	public static final String DUPL_PTN_ALRT_FLAG = "DUPL_PTN_ALRT_FLAG";

	public static final String LOOKUP_TYPE_LDAP_SETTING = "LDAPSET";
	public static final String LOOKUP_CODE_LDAP_URL = "URL";
	public static final String LOOKUP_CODE_LDAP_DOMAIN = "DOMAIN";
	public static final String LOOKUP_CODE_LDAP_DNDOMAIN = "DNDOMAIN";
	public static final String LDAP_EXTRAENVVARS_NAME = "java.naming.referral";
	public static final String LDAP_EXTRAENVVARS_VALUE = "follow";
	public static final String LDAP_SEARCHFILTER_PREFIX = "(sAMAccountName=";
	public static final String LDAP_SEARCHFILTER_SUFFIX = ")";
	public static final String LDAP_USER_SEARCH_SERVICE = "LDAPUserSearch";

	public static final String LOOKUP_TYPE_VACCINATION_GROUP = "VACC_GRP";
	public static final String TABLE_CODE_VACCINE_GROUP = "VACC";
	public static final String CTX_VACCINATION_GROUP = "vaccinationGroup";
	public static final String CTX_CATALOGUE_BATCH_INFO_PROCESS_TYPE="batchInfoProcessType";

	public static final String SPRING_BATCH_INFO_DAO_CONCRETE = "BatchInfoDAO";

	public static final String PREFIX_LOOKUP_CODE_INVOICE = "INVOICE";

	public static final String LOOKUP_TYPE_VACC_BATCH_NO_USER_VAL = "VACC_BATCH_NO";
	public static final String TABLE_CODE_VACC_BATCH_NO_USER_VAL = "BATCH_NO";

	//public static final String PREFIX_LOOKUP_CODE_INVOICE = "INVOICE";

	public static final String DISCHRG_INFO_FLAG = "DISCHRG_INFO_FLAG";

	public static final String DEAD_LESS_THAN_48_HRS = "DLT";
	public static final String DEAD_MORE_THAN_48_HRS = "DMT";
	public static final String ESCAPE = "IDC04";

	public static final String OPT_PRE_EMP_MCU_REG = "PRE_MCU_REG_SRCH_OPT";
	public static final String OPT_MCU_PERIOD_IS_MULTIPLE_OREP_OPTION = "PRD_MCU_OREP_CONF";
	public static final String OPT_PRE_EMP_MCU_REG_CAND_PRFL = "CAND_PRFL";
	public static final String OPT_PRE_EMP_MCU_REG_PAT_PRFL = "PAT_PRFL";
	public static final String OPT_POST_MCU_TO_ELLIPSE = "POST_MCU_TO_ELLIPSE";

	public static final String TABLE_CODE_DEFAULT_PO_NO_LENGTH = "PO_NO_LENGTH";
	public static final String PO_NO_AUTONUM_FLAG = "PO_NO_AUTONUM_FLAG";
	public static final String PO_NO = "poNo";

	public static final String USER_LGN_FOR_STAFF_ID_FLAG = "USR_LGN_4_STFID_FLAG";

	public static final String SETTING_AVERAGE_PRICE_TYPE = "AVG_PRC_TYPE";
	public static final String MOVING_AVERAGE_PRICE_TYPE = "MOVE";
	public static final String FIFO_AVERAGE_PRICE_TYPE = "FIFO";

	public static final String STAFF_ID_AUTO_ENTRY_FLAG = "staffIdAutoEntryFLAG";

	//physiotherapy requested activity
	public static final String REQUESTED_ACTIVITY_FLAG = "requestedActivityFLAG";

	public static final String MEDIVAC_MEDILEAVE_SERVICE_CODE = "SV86";
	public static final String MEDIVAC_MEDILEAVE_MR_TYPE = "86";
	public static final String REG_ACCESS_LIMITATION = "REG_ACCESS";

	public static String LOOKUP_TYPE_EXTRA_OCCUPATION_PERIODIC_MCU = "XTRAOCCPERMCU";
	public static final String CTX_RO_RCVWAREHOUSE_ENABLED = "rcvWhId";

	public static final String ICD10_SEARCHTYPE = "searchType";
        public static final String ICD_FROM_LIBRARY = "isFromLibray";
	public static final String SEARCHTYPE_AJAX = "AJAX";
	public static final String SEARCHTYPE_AJAX2 = "AJAX2";
    public static final String SEARCHTYPE_AJAX_FULL_NAME = "AJAXFULLNAME";
	public static final String REPORT_PARAMETER_TYPE_LOOKUP = "Lookup";

	public static final int INVOICE_DIGIT_PRECISION = 2;

	public static final int PO_DIGIT_PRECISION = 2;

	public static final String DEFAULT_BATCH_NUMBER_SEARCH_METHOD = "LIK";
	public static String LOOKUP_TYPE_AUTH_STORETRANSFER_BUTTON = "AUTH_ST_BUTTON";
	public static final String CHAR_REPLACEMENT = "@";

    public static final String CONF_LDAP_SERVER = "ldap.server";
    public static final String LICENSE_DIR = "license.dir";

    public static final String CTX_IMPORT_STCK_CATALOGUE_INVENTORY_CSV_RESULT = "importStockCatalogueInventorySpecialFieldsFlag";
    public static final String PATH_IMPORT_CSV_CATALOGUE_INVENTORY_WITH_DO = "stockCatalogueImport.do";

    public static final String ROLE_ID_IMPORT_WAREHOUSE_INVENTORY_SPECIAL_FIELDS = "WHIMP1";
    public static final String CTX_IMPORT_WAREHOUSE_INVENTORY_SPECIAL_FIELDS = "importWarehouseInventorySpecialFieldsFlag";
    public static final String CTX_IMPORT_WAREHOUSE_INVENTORY_CSV_RESULT = "importWarehouseInventoryCSVResult";

    public static final String PATH_IMPORT_CSV_WAREHOUSE_INVENTORY_WITH_DO= "warehouseInventoryImport.do";
    public static final String LOOKUP_CODE_DEFAULT_CSV_MAX_ROWNUMBER = "CSV_MAXROW";
    public static final String CTX_IMPORT_CSV_BUTTON_ENABLE = "enableImportButton";

    public static final String CTX_MAP_SUP_UOI = "mapUoi";
    public static final String CTX_MAP_SUP_UOP = "mapUop";

    public static final String CTX_IS_MULTIPLE_LINE = "isMultipleLine";
	public static final String CTX_EDIT_MODE = "EDIT_MODE";
	public static final String EDIT_ITEM_MODE = "editItem";
	public static final String EDIT_HEADER_MODE = "editHeader";
	public static final String CTX_ITEM_UPD = "ITEM_UPD_MODE";
	public static final String ITEM_COMPLETE = "completeItem";
	public static final String ITEM_APPROVAL = "approveItem";


	//for report
	public static final String REPORT_NAME = "reportName";
	public static final String CONTENT_TYPE_CSV = "application/vnd.ms-excel";
	public static final String CONTENT_TYPE_XLS = "application/ms-excel";
	public static final String CONTENT_TYPE_HTML = "text/html";
	public static final String CONTENT_TYPE_PDF = "application/pdf";


	//cath lab
	public static final String CATETHER_LOC_TABLE_ALIAS = "catetherlocrec";
	public static final String CATETHER_LOC_REC_CLASS = "com.mitrais.kms.service.CatetherLocRec";
	public static final String CORONER_ANGIO_REC_TABLE_ALIAS = "coronerangiorec";
	public static final String CORONER_ANGIO_REC_CLASS = "com.mitrais.kms.service.CoronerAngioRec";

	public static final String LOOKUP_TYPE_IN_LOC = "IN_LOC";
	public static final String CTX_IN_LOC_LIST = "inLocList";

	public static final String LOOKUP_TYPE_CAT_TYPE = "CAT_TYPE";
	public static final String CTX_CAT_TYPE_LIST = "catTypeList";

	public static final String LOOKUP_TYPE_SHE_TYPE = "SHE_TYPE";
	public static final String CTX_SHE_TYPE_LIST = "sheTypeList";

    public static final String LOOKUP_TYPE_CONTRAST = "CTR_TYPE";
	public static final String CTX_CONTRAST_LIST = "contrastList";

    public static final String LOOKUP_TYPE_EXTERN_DOCTOR = "EXT_DOCT";

	public static final String LOOKUP_TYPE_LV_TYPE = "LV_TYPE";
	public static final String CTX_LV_TYPE_LIST = "lvTypeList";

	public static final String LOOKUP_TYPE_LV_STE = "LV_STE";
    public static final String CTX_LV_STE_LIST = "lvSteList";

    public static final String CTX_CATETHER_LOC_LIST = "catetherLocList";

    public static final String MR_TYPE_CATH_LAB ="102";

    //nutrtion
    public static final String MR_TYPE_NUTRITION = "08";
    //KTEN43 merging radiology
    public static final String MEDICAL_ACTION_PDF_REPORT_ID = "PDFRPTMEDACTION";
	public static final String MEDICAL_ACTION_PDF_REPORT_FLAG = "MEDICAL_ACTION";


	public static final String PRSNINFO_MAP = "PRSNINFO_MAP";

	public static final String CTX_DUPLICATE_PATIENT_MSG = "duplicatePatientMsg";
	public static final String CTX_CHECK_DUPLICATE_PATIENT = "checkDuplicatePatient";
	
	public static final String CTX_MERGED_PATIENT_MSG = "mergedPatientMsg";
	public static final String CTX_CHECK_MERGED_PATIENT = "checkMergedPatient";
	public static final String CTX_MERGED_MRNO = "mergedMrNo";
	public static final String CTX_MERGED_FIRST_NAME = "mergedFirstName";
	public static final String CTX_MERGED_LAST_NAME = "mergedLastName";
	public static final String CTX_MERGED_DAY_OF_BIRTH = "mergedDayOfBirth";
	public static final String CTX_MERGED_PATIENT_CLASSIFICATION = "mergedPatientClassification";
	public static final String CTX_MERGED_EMPLOYEE_ID = "mergedEmployeeId";

	/*
	 * Constants for CalendarView START
	 */
	/**
	 * Constant identifying Day view
	 */
	public static final String DAY_VIEW = "DAY";
	/**
	 * Constant identifying Week view
	 */
	public static final String WEEK_VIEW = "WEEK";
	/*
	 * Calendar Bar background images
	 * -------------------------------
	 * Note: Do not change these values. To change the background image, edit
	 * 		 the image files directly.
	 */
	/**
	 * Background image for registration calendar bars
	 */
	public static final String REG_BG_IMG = "images/registrations_bg.png";
	/**
	 * Background image for appointment calendar bars
	 */
	public static final String APP_BG_IMG = "images/appointment_bg.png";
	/**
	 * Background image for non registration calendar bars
	 */
	public static final String NONREG_BG_IMG = "images/other_bg.png";
	
	public static final String ONDUTY_BG_IMG = "images/onduty_bg.png";
	public static final String OFFDUTY_BG_IMG = "images/offduty_bg.png";
	
	/**
	 * Background image for mixed schedule calendar bars
	 */
	public static final String MIXED_BG_IMG = "images/mixed_bg.png";
	/*
	 * Integer constants used in <code>testBoundaryValue</code>
	 * method in <code>DayCalendarBarFactory</code> and <code>WeekCalendarBarFactory</code>.
	 * Do not change these values.
	 */
	/**
	 * Integer constant representing lower boundary value.
	 * @see {@CalendarWeekView}, {@link CalendarDayView}
	 */
	public static final int LOWER_BOUNDARY_VALUE = -1;
	/**
	 * Integer constant representing upper boundary value.
	 * @see {@CalendarWeekView}, {@link CalendarDayView}
	 */
	public static final int UPPER_BOUNDARY_VALUE = 1;
	/**
	 * Integer constant representing normal value.
	 * @see {@CalendarWeekView}, {@link CalendarDayView}
	 */
	public static final int NORMAL_VALUE = 0;
	/**
	 * Integer constant representing lower and upper boundary value.
	 * @see {@CalendarWeekView}, {@link CalendarDayView}
	 */
	public static final int LOWER_AND_UPPER_BOUNDARY_VALUE = 2;
	/**
	 * Integer constant representing the calendar bar width for an
	 * hour in Day View.
	 *
	 * Do not change this value directly unless an hour is no longer
	 * 60 minutes. Change the <code>MINUTES_COLSPAN</code> attribute
	 * instead.
	 */
	public static final int HOUR_COLSPAN = 60*KMSConstantsIntf.MINUTES_COLSPAN;
	/**
	 * Integer constant representing the calendar bar width for one
	 * minute in Day View.
	 */
	public static final int MINUTES_COLSPAN = 1;
	/**
	 * Integer constant representing the calendar bar width for one
	 * 	day in Week View.
	 */
	public static final int DAY_COLSPAN = 90;
	/**
	 * Maximum length for the data panel for Day View, which is
	 * 24 hours.
	 */
	public static final int MAX_DAY_COLSPAN = 24*KMSConstantsIntf.HOUR_COLSPAN;
	/**
	 * Maximum length for the data panel for Week View, which is
	 * 7 days.
	 */
	public static final int MAX_WEEK_COLSPAN = 7*KMSConstantsIntf.DAY_COLSPAN;
	/**
	 * The maximum number of columns shown in data panel in Week View.
	 */
	public static int WEEK_HORIZONTAL_DATA_WIDTH_INDEX = 5;
	/**
	 * The maximum number of rows shown in data panel in Week View.
	 */
	public static int WEEK_VERTICAL_DATA_HEIGHT_INDEX = 5;
	/**
	 * Number of days in a week
	 */
	public static int NUMBER_DAYS_IN_A_WEEK = 7;
	/**
	 * The maximum number of columns shown in data panel in Day View.
	 */
	public static int DAY_HORIZONTAL_DATA_WIDTH_INDEX = 8;
	/**
	 * The maximum number of rows shown in data panel in Day View.
	 */
	public static int DAY_VERTICAL_DATA_HEIGHT_INDEX = 5;
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static final String CTX_WEEK_LIST = "weekList";
	/**
	 * Appointment Type description
	 */
	public static final String TYPE_APPOINTMENT = "Appointment";
	/**
	 * Registration Type description
	 */
	public static final String TYPE_REGISTRATION = "Registration";
	/**
	 * Non Registration Type description
	 */
	public static final String TYPE_OTHER = "Non Registration";
	/**
	 * Mixed Type description
	 */
	public static final String TYPE_MIXED = "Mixed Schedule";

	public static final String FORM_UPDATER_FUNCTION = "updateOnClick";
	public static final String CTX_JSON_STRING = "jsonString";
	public static int STANDARD_APPOINTMENT_MINUTES = 20;
	public static int WEEK_DEFAULT_SCROLL_INDEX = 0;
	public static int DAY_DEFAULT_SCROLL_INDEX = 8;
	public static int WEEKS_LIST_WEEKS_FORWARD = 26;
	public static int WEEKS_LIST_WEEKS_BACKWARD = 26;

	/*
	 * Constants for CalendarView END
	 */

    //added from KMSConstantIntfSC.java
    public static final String CTX_AUTHENTICATE_FLAG = "authFlag";

    public static final String CTX_MAP_TRF_LIST = "ctxMapTrfList";
    public static final String CTX_MAP_TRF_ORIG_LIST = "ctxMapTrfOrigList";

    public static final String SECTION_DIAGNOSTIC_SUPPORT = "DGS";
    public static final String SECTION_OCC_HEALTH = "OCH";
    public static final String SECTION_CATH_LAB = "CLB";
    public static final String SECTION_TRIAGE = "TRI";

    public static final String UOM_CONCATENATED_NOTES_FLAG  = "concatenated_notes";

    public static final String CTX_IS_PATIENT_PAYM_NONCHARGABLE = "isPatientPaymNonChargable";

    public static final String DATE_PICKER_WEEK_TYPE ="WEEK";
    public static final String DATE_PICKER_DATE_TYPE ="DATE";

    // License manager constants
    public static final String LICENSE_READER_BEAN = "licenseReaderBean";

    public static final String CTX_LOGIN_NOTIFICATION_MESSAGE_KEY="ctxLoginNotificationMessageKey";
    public static final String CTX_LOGIN_NOTIFICATION_MESSAGE_ARG_KEY="ctxLoginNotificationMessageArgKey";
    public static final String CTX_ERROR_HEADER_KEY="ctxErrorHeaderMessageKey";
    public static final String ROLE_LICENSE_NOTIFICATION = "LICNSE";

    public static final String ENCRYPTION_CIPHER_ALGORITHM = "AES/ECB/PKCS7Padding";
    public static final String ENCRYPTION_CIPHER_PROVIDER  = "BC";
    public static final String DEF_VAL_TABLE_TYPE = "DEF_VAL";
    public static final String INST_DATE_TABLE_CODE = "INST_DATE";
    public static final String EXCD_DATE_TABLE_CODE = "EXCD_DATE";
    public static final String CLIENT_PROPERTIES_NAME = "client.name";
    public static final String CLIENT_PROPERTIES_ADDRESS = "client.address";
    public static final String ALGORITHM_MD5 = "MD5";
    public static final String ALGORITHM_AES = "AES";
    public static final String SECRET_KEY_FILENAME = "kms30.key";
    public static final String INST_DATE_INITIALISATION_SALT = "h4shth153ncrypteds7r1n9";
    public static final String EXCEED_DATE_INITIALISATION_SALT = "3xc3edD47eS4l7xsfsw43";
    public static final String AUTH_LIST_DELIMITER = ",";
    public static final String USER_EXPR="userExpired";

    // Inventory Adjustment related constants
    public static final String IVN_ADJ_APPR_BYPASS_FLAG = "IVADJS_APRVL";
    public static final String IVN_ADJ_VOH_CALC_TYPE_FLAG = "VOH_CALCTYPE";
    public static final String IVN_ADJ_UNSO_SUBMIT_FLAG = "IVADJS_UNDO_SUBMIT";

    public static final String IVN_ADJ_APPROVAL_BUTTON_SHOW = "invcApprovalButtonShow";
    public static final String INV_ADJ_APPROVAL_ROLE_ID = "IA002";
    public static final String INV_ADJ_TYPE_MEDICATION_RETURN = "MCADJ";
    /**
     * Inventory Adjustment types.
     */
    public static final String PLUS_ADJUSTMENT = "PLUS";
    public static final String MINUS_ADJUSTMENT = "MINUS";

    public static final String PLUS_SIGN = "+";
    public static final String MINUS_SIGN = "-";
    public static final String LOOKUP_INV_TYPE = "TYPE";
	public static final String CTX_INV_TYPE = "invTypeList";

	/**
	 * Value on Hand (VOH) calculation types.
	 */
    public static final String LATEST_PRICE_VOH = "1";
    public static final String MIXED_PRICE_VOH  = "2";
    public static final String AVERAGE_PRICE_VOH = "3";

    /**
     * Jasper Report Definition types.
     */
    public static final String REPORT_FLAG_REQUEST_KEY = "reportFlag";
    public static final String REPORT_CLASS_REQUEST_KEY = "reportClass";
    public static final String REPORT_TYPE_REQUEST_KEY = "reportType";

    public static final String JR_TABLE_FLAG = "RPT_FLAG";
    public static final String JR_TABLE_CLASS = "RPT_CLS";

    public static final String JASP_RPRT_DEFN_ROLE_ID_OPERAND = "RPT%";

    /**
     * Jasper Report Parameter types.
     */
    public static final String REPORT_PARM_TYPE = "reportParmType";

    public static final String JR_PARM_TYPE = "RPT_PARM_TYPE";

    // Radiographer staff constant
    public static final String STAFF_RADIOGRAPHER = "H";

    public static final String PO_OFFICER = "WHS";

    String SPRING_REPORTING_COLUMN_BO = "ReportingColumnBO";
	public static final String REPORT_PARAMETER_TYPE_CUSTOMBO = "CustomBO";

    public static final String AVERAGE_ITEM_STATUS_IN = "IN";
    public static final String AVERAGE_ITEM_STATUS_OUT = "OUT";
    public static final String AVERAGE_ITEM_STATUS_ADJUSTED = "ADJ";
    public static final String WHOUSE_POINTED_AS_MAINWAREHOUSE = "MAIN";

	public static final String LOOKUP_TYPE_SUP_WH_INV_UPDATED = "WH_UPDATE";
    // Reusable parameter names for store transfer e-mail message text
    public static final String SENDER_WH_PARAM_KEY = "SENDER_WH";
    public static final String REQUESTOR_WH_PARAM_KEY = "REQUESTOR_WH";
    public static final String TIMESTAMP_PARAM_KEY = "TIMESTAMP";
    public static final String ACTOR_PARAM_KEY = "ACTOR";
    public static final String ST_NUMBER_PARAM_KEY = "ST_NUMBER";

    // Reusable parameter names for Forgot Password security section
    public static final String PATIENT_FULLNAME_PARAM_KEY = "PATIENT_FULLNAME";
    public static final String URL_PATH_PARAM_KEY = "URL_PATH";

    // Store Transfer E-mail message ids
    public static final String EMAIL_MSG_STTR_SUBMIT_REQUEST = "STR001";
    public static final String EMAIL_MSG_STTR_APPROVE_REQUEST = "STR002";
    public static final String EMAIL_MSG_STTR_REJECT_REQUEST = "STR003";
    public static final String EMAIL_MSG_STTR_APPROVE = "STR004";
    public static final String EMAIL_MSG_STTR_SUBMIT= "STR005";
    public static final String EMAIL_MSG_STTR_REJECT = "STR006";
    public static final String EMAIL_MSG_STTR_ACQUIT = "STR007";
    public static final String EMAIL_MSG_STTR_IMMEDIATE_TRANSFER = "STR008";
    public static final String EMAIL_MSG_STTR_RECEIVE = "STR009";
    public static final String EMAIL_MSG_STTR_CANCEL_ACQUIT = "STR010";
    public static final String EMAIL_MSG_STTR_CANCEL_REQUEST = "STR011";
    public static final String EMAIL_MSG_STTR_CANCEL= "STR012";
	public static final String LOOKUP_TYPE_SICK_LEAVE_EMAIL_FLAG = "SICKLV_EMLFLG";

	// Security E-mail message ids
    public static final String EMAIL_MSG_FRGT_PSWD = "FRGPWD";

	public static final String RECOMMENDED_ORDER_PDF_REPORT_ID = "PDFRPTRCMDORDR";

	//Purchase Requisition
	public static final String PURCHASE_REQ_STATUS_CANCELLED = "CNCL";

    public static final String CTX_PASS_LENGTH = "PASS_LENGTH";
	public static final String LOOKUP_TYPE_CREATE_WH_INVENTORY_LOG = "CREATE_INVN_LOG";
	public static final String FLAG_SOH_ONLY = "2";

	public static final String CTX_AVG_PRICE_ADJUSTMENT = "avgPrcAdj";

	public static final String LOOKUP_DEFAULT_SEARCH_RESULT_TR_LIMIT="SR_TR_LIMIT";
	public static final String LOOKUP_DEFAULT_SEARCH_RESULT_RQ_LIMIT="SR_RQ_LIMIT";
	public static final String LOOKUP_DEFAULT_SEARCH_RESULT_RX_LIMIT="SR_RX_LIMIT";

	public static final String EXTERNAL_CONSTANTS_BEAN_ID= "externalConstants";
	public static final String CTX_EDITION_NAME= "editionName";

	// Sick Leave
	public static final String LOOKUP_TYPE_SICK_LEAVE_LOCATION = "SL_LOC";

	//Table Code for System Lookup with Table Type = 'MR_URL'
	public static final String LOOKUP_CODE_PERIODICAL = "78";
	public static final String LOOKUP_CODE_PREEMP = "79";
	public static final String LOOKUP_CODE_MCU_DENTAL_RECORD = "022";

	//Forgot Password security section
	public static final String BTN_EMAIL_NEW_PASSWORD = "btnEmailNewPassword";
	public static final String SUCCESS_SENT_EMAIL = "successSentEmail";
	public static final String REQ_PARAM_BUTTON = "button";
	public static final String REQ_PARAM_TOKEN = "token";
	public static final String CTX_FORGOT_PASSWORD = "forgotPassword";
	public static final String FRGT_PSWD_LINK = "/changeForgotPasswordShow.do?act=Show&token=";
	public static final String IS_VALID_PWD_KEY = "isValidPwd";
	public static final String MESSAGE_KEY = "message";

	// RIS 13 MRI Report
    public static final String MRI_EXAM_PDF_REPORT_ID = "PDFRPTMRIEXAM";
    public static final String MRI_DETAIL_PDF_REPORT_ID = "PDFRPTMRIDETAIL";
	
	public static final String LOOKUP_SERVICE_RADIODIAGNOSTIC = "SV48";
	
	//Warehouse ID Constants for Stock Catalogue filtering in Medication Chart
	public static final String CTX_MED_CHART_WAREHOUSE_ID = "whouseId";
	public static final String CTX_SVC_STCK_CATL_AVLBTY = "stckCatlAvlbty";
	public static final String CTX_IS_WITH_STCK_CATL_AVLBTY_INFO = "isWithStckCatlAvlbty";
	public static final String CTX_BED_NO_IS_SET = "bedNoIsSet";
	public static final String CTX_MED_CHART_AVLBTY_NUMBER = "avlbltyNumber";
	
	//RADT78
	public static final String ALERT_TYPE_WAITING_LIST_BOOKED_ROOM = "WLBR";
	//PIS9
	public static final String KMS_PRESC_SCAN_REC_CLASS = "com.mitrais.kms.service.PrescScanRec";
	public static final String CTX_UPLOAD_SCAN_PRESCRIPTION_ROLE = "SCPRSC";	
	public static final String SPRING_PRESCRIPTION_SCAN_BO = "prescriptionScanBO";
	public static final String MTRL_EXP_TRACKING_SERVICE = "MtrlExpTrackingService";

	//A&E11
	public static final String LOOKUP_TYPE_OBJ_EXM = "EXAMOBJ";
	public static final String OBJ_EXM_SECTION = "EXAMOBJ_SECTION";
	public static final String LOOKUP_TYPE_OBJ_EXM_STAT = "EXAMOBJSTAT";
	public static final String CTX_OBJ_EXAM_STAT_LIST = "objExamStatList";
	public static final String TABLE_CODE_NOT_EXAMINED = "NOT_EXAMINED";
	public static final String TABLE_CODE_OE_JAUNDICE = "OE_JAUNDICE";
	public static final String TABLE_CODE_OE_ANEMIC = "OE_ANEMIC";
	public static final String TABLE_CODE_OE_CYANOTIC = "OE_CYANOTIC";
	public static final String TABLE_CODE_OE_CLUBBING = "OE_CLUBBING";
	public static final String TABLE_CODE_OE_OEDEMA = "OE_OEDEMA";
	public static final String TABLE_CODE_OE_LYMPH_NODES = "OE_LYMPH_NODES";
	public static final String TABLE_CODE_OE_NOTES = "OE_NOTES";
	public static final String TABLE_CODE_OEI_SKINSTAT = "OEI_SKINSTAT";
	public static final String TABLE_CODE_OEI_EYESSTAT = "OEI_EYESTAT";
	public static final String TABLE_CODE_OEI_ENTSTAT = "OEI_ENTSTAT";
	public static final String TABLE_CODE_OEI_NECKSTAT = "OEI_NECKSTAT";
	public static final String TABLE_CODE_OEI_RESPSTAT = "OEI_RESPSTAT";
	public static final String TABLE_CODE_OEI_CARDSTAT = "OEI_CARDSTAT";
	public static final String TABLE_CODE_OEI_GASTSTAT = "OEI_GASTSTAT";
	public static final String TABLE_CODE_OEI_UROSTAT = "OEI_UROSTAT";
	public static final String TABLE_CODE_OEI_MUSCSTAT = "OEI_MUSCSTAT";
	public static final String TABLE_CODE_OEI_NEURSTAT = "OEI_NEURSTAT";
	public static final String TABLE_CODE_OEI_BRESTAT = "OEI_BRESTAT";
	public static final String TABLE_CODE_OEI_HEADSTAT = "OEI_HEADSTAT";
	public static final String TABLE_CODE_OEI_ABDSTAT = "OEI_ABDSTAT";
	public static final String TABLE_CODE_OEI_PERIVASCSTAT = "OEI_PERIVASCSTAT";
		
	public static final String OBJ_EXAM_STAT_NORMAL = "N";
	public static final String OBJ_EXAM_STAT_ABNORMAL = "A";
	public static final String OBJ_EXAM_STAT_NOT_EXAMINED = "X";
	
	public static final String CTX_INVOICE_ITEM_ENABLED = "ITEM_ENABLED";
	public static final String CTX_INVOICE_PAYM_ENABLED = "PAYM_ENABLED";
	public static final String CTX_SPECY_INVC_ITEMS_ENABLED = "SPECY_ITEM_ENABLED";
	
	public static final String CTX_INVOICE_ITEM_ENABLED_NAME = "itemEnabled";
	public static final String CTX_INVOICE_PAYM_ENABLED_NAME = "paymEnabled";
	public static final String CTX_SPECY_INVC_ITEMS_ENABLED_NAME = "specyInvcItemEnabled";
	
	 public static final String LOOKUP_TYPE_DENTAL_ACT_DTL = "DTL_ACT_CD_DTL";
	 public static final String CTX_DENTAL_ACT_DTL_LIST = "dentalActDtlList";
	 
	 public static final String LOOKUP_TYPE_TOOTH_TYPE = "TOOTH_TYPE";
	 public static final String CTX_DENTAL_TTH_TYP_LIST = "toothTypeList";
	 
	 public static final String TOOTH_TYPE_DECIDOUS = "D";
	 public static final String TOOTH_TYPE_PERMANENT = "P";
	 public static final String TOOTH_TYPE_NA = "N";
	 
	 public static final String LOOKUP_TYPE_DNT_ACT_DTL_MAP = "DTL_ACT_CD_DTL_MAP";
	 public static final String AJAX_DNT_ACT_DETL = "dentActDetl";
	 public static final String AJAX_DNT_ACT_DETL_DESC ="dentActDetlDesc";
	 public static final String DENTAL_TREATMENT_BO = "DentTreatmentBO";
	 public static final String AJAX_DNT_ACT_DETL_DESC_LIT_ALL_USING_STARR ="*";
	 
	 public static final String TABLE_CODE_PATIENT_OCCUPATION_CONTRACTOR = "D";
	 public static final String TABLE_CODE_PATIENT_OCCUPATION_PRIVATISATION = "PRVT";
	 public static final String TABLE_CODE_PATIENT_OCCUPATION_ARMY = "ARMY";
	 public static final String TABLE_CODE_PATIENT_OCCUPATION_POLICE = "PLCE";
	 public static final String TABLE_CODE_PATIENT_OCCUPATION_PRIVATISATIONCANDIDATE = "PRVC";
	 public static final String TABLE_CODE_PATIENT_OCCUPATION_BUSINESSVISITOR = "BSVS";

	 public static final String SERVICE_CODE_ECHODOPPLER = "SV45";

    //Used for Blank Form
	//author ikhwank
	public static final String BLANK_FORM = "blankForm";
	public static final String FWD_SHOW_SERVICES_OUTPATIENT = "showTitles";
	public static final String FWD_SHOW_EXAM_GRP = "showExamGrp";
	public static final String SYST_LKUP_LIST = "systLkUpList";
	public static final String EXAM_GROUP_LIST = "examGroupList";
	public static final String SERVICE_CODE_DENTLABDETAIL_REPORT = "SV19";
	public static final String SERVICE_CODE_DENTXRAY_REPORT = "SV85";
	public static final String SERVICE_CODE_CTSCANDETAIL_REPORT = "SV23";
	public static final String SERVICE_CODE_LABDETAILEXAM_REPORT = "SV18";
	public static final String SERVICE_CODE_PHSYIOEXAMRESULT_REPORT = "SV14";
	public static final String SERVICE_CODE_STDRADEXAMDETAIL_REPORT = "SV82";
	public static final String SERVICE_CODE_USGXRAYDETAIL_REPORT = "SV22";
	public static final String SERVICE_CODE_RADEXAMDETAIL_REPORT = "SV20";
	public static final String[] REPORTS_HAVE_LIST = {DENTAL_LABORATORY_DETAIL_PDF_REPORT_ID,DENT_XRAY_DETAIL_PDF_REPORT_ID,
		CTSCAN_DETAIL_PDF_REPORT_ID,LABORATORY_DETAIL_PDF_REPORT_ID, PHYSIOTHERAPY_RESULT_PDF_REPORT_ID,
		STD_XRAY_DETAIL_PDF_REPORT_ID, USG_DETAIL_PDF_REPORT_ID, XRAY_DETAIL_PDF_REPORT_ID, MRI_DETAIL_PDF_REPORT_ID, ECHODOPPLER_PDF_REPORT_ID};

	//Sequence service code in SERVICE_CODE_LIST is same with in REPORTS_HAVE_LIST
	public static final String[] SERVICE_CODE_LIST = {SERVICE_CODE_DENTLABDETAIL_REPORT,SERVICE_CODE_DENTXRAY_REPORT,
		SERVICE_CODE_CTSCANDETAIL_REPORT,SERVICE_CODE_LABDETAILEXAM_REPORT, SERVICE_CODE_PHSYIOEXAMRESULT_REPORT,
		SERVICE_CODE_STDRADEXAMDETAIL_REPORT, SERVICE_CODE_USGXRAYDETAIL_REPORT, SERVICE_CODE_RADEXAMDETAIL_REPORT, 
		LOOKUP_SERVICE_RADIODIAGNOSTIC, SERVICE_CODE_ECHODOPPLER};
		
	public static final String LENGTH_EXAM_GROUP_MULTIPLE_SELECT = "10";
	//end
	public static final String LOOKUP_CODE_BYPASS_PRESC_PROC = "BYPASS_PRESC_PROC";
    
	// OPERATING THEATRE CHECKLIST
	public static final String OPERATING_THEATRE_CHECK_LIST = "CHK_LST";
	public static final String PDF_OPERATING_THEATRE_CHECK_LIST = "PDFOPRTHTCHECKLIST";
	public static final String OPERATING_THEATRE_CHECK_LIST_QUESTION = "q";
	public static final String OPERATING_THEATRE_CHECK_LIST_LINE = "line";
	public static final String OPERATING_THEATRE_CHECK_LIST_BOLD = "bold";
	public static final String OPERATING_THEATRE_CHECK_LIST_FIRST_TABLE = "A";
	public static final String OPERATING_THEATRE_CHECK_LIST_STATUS = "waiting";
    public static final String OPERATING_THEATRE_CHECK_LIST_TEXTAREA = "textarea";
	public static final String OPERATING_THEATRE = "OPR_THEATRE";
	public static final String OPERATING_THEATRE_CHECK_LIST_RADIO = "radiobutton";

	//EMR 6 - Amandment History
	public static final String AMENDMENT_HISTORY_PDF_REPORT_ID = "AMENDHIST";
	//end EMR 6 - Amandment History
	
	//AE5
	public static final String CTX_SEARCH_EMERGENCY_REGISTRATION = "400180005";
	public static final String REG_POINT_EMERGENCY = "PT2";
    public static final String AE_EMERGENCY_LIST = "aeEmergencyList";
    public static final String AE_TRIAGE_LIST = "aeTriageList";
    public static final String LOOKUP_TYPE_EMG_CASE = "CASE_EMG";

	// Retail Pharmacy
	public static final String CTX_RETAIL_PHAR_STATUS = "retailPharStatus";
	public static final String CTX_RETAIL_PHAR_HEAD_STATUS = "retailPharHeadStatus";	
	public static final String CTX_RETAIL_PHAR_STATUS_MAP = "retailPharStatusMap";
	public static final String LOOKUP_TYPE_RETAL_PHAR_STATUS = "RETAIL_PHAR_STATUS";
	public static final String LOOKUP_CODE_RETAL_PHAR_STATUS_COMPLETED = "CMPL";
	public static final String LOOKUP_CODE_RETAL_PHAR_STATUS_PRINTED = "PRNT";	
	public static final String CTX_RETAIL_PHAR_ITEMS = "retailPharItems";
    public static final String TYPE_DISMISSAL="DISMISSAL";

    public static final String DEFAULT_QUANTITY = "1";
	
    //A&E 3/5
    //add as ref in the searchPatient to exclude the Unknown Patient from search criteria and search result
    public static final String CTX_SEARCH_PATIENT_FROM_CREATE_REGISTRATION = "searchPatientToCreateRegistration";
    public static final String CTX_SEARCH_REG_INCLUDE_ALL_PATIENT_TYPE = "searchRegIncludeAllPatientType";

    //Axosoft 8928
    public static final String HAS_BED_NO_ASSOC_WHOUSE = "hasBedNoAssocWhouse";
    
    public static final String TEST_LOCATION_NAME_STRING_FORMAT = "[%s] - %s";

    //default_age for unknown patient
    public static final String UNKNOWN_PATIENT_AGE_CODE = "UNKNOWN_PATIENT_AGE";
    public static final int DEFAULT_UNKNOWN_PATIENT_AGE	= 0;
    
    // for child age detection
    public static final String IS_CHILD_AGE = "isChild";

    //Axosoft 9550
    public static final String IS_REQUEST_OTHER_ACTIVITY_ACTIVATED = "isCreateTriageActivated";
    public static final String TABLE_TYPE_REQ_OTHR_ACTV = "REQ_OTHR_ACTV";;
    public static final String AUTO_CREATE_ACTV_MODE = "autoCreateActvMode";

    // Diary Screen
    public static final String  SYS_ADMIN_ROLE_ID = "DRYADM";
    public static final String  AUTH_USER_ROLE_ID = "DRYAUS";

    public static final String EMAIL_MSG_DRY_EML = "DRYEML";
    public static final String DIARY_SUBJECT_PARAM_KEY = "DIARY_SUBJECT";
    public static final String DIARY_MESSAGE_PARAM_KEY = "DIARY_MESSAGE";

    public static final String DIARY_REMINDER_DAYS = "msdry.reminder.days";
    public static final String DIARY_REMINDER_MINUTES = "msdry.reminder.minutes";
    public static final String DIARY_REMINDER_OVERDUE = "msdry.reminder.overdue";
    public static final String DIARY_REMINDER_DUE = "msdry.reminder.due";
    public static final String DIARY_REMINDER_NOW = "msdry.reminder.now";

    public static final String DIARY_ASSIGNED_TASK = "msdry.assigned.task";

    public static final String DIARY_FIRST_MINUTE = "00:00";
    public static final String DIARY_LAST_MINUTE = "23:59";
    
    public static final long DIARY_TASK_DEF_ID = 0;
    public static final int DIARY_FIRST_HOUR_OF_DAY = 0;
    public static final int DIARY_FIRST_MINUTE_OF_DAY = 0;
    public static final int DIARY_LAST_HOUR_OF_DAY = 23;
    public static final int DIARY_LAST_MINUTE_OF_DAY = 59;

    public static final String DIARY_PARAMETER_TASK_ID = "taskId";
    public static final String DIARY_PARAMETER_TASK_ID_LIST = "taskIdList";
    public static final String DIARY_PARAMETER_START_DATE = "startDate";
    public static final String DIARY_PARAMETER_START_TIME = "startTime";
    public static final String DIARY_PARAMETER_END_DATE = "endDate";
    public static final String DIARY_PARAMETER_END_TIME = "endTime";
    public static final String DIARY_PARAMETER_WARNING_DATE = "warningDate";
    public static final String DIARY_PARAMETER_WARNING_TIME = "warningTime";
    public static final String DIARY_PARAMETER_INTERVAL = "interval";
    public static final String DIARY_PARAMETER_SUBJECT = "subject";
    public static final String DIARY_PARAMETER_DESCRIPTION = "description";
    public static final String DIARY_PARAMETER_MESSAGE  = "message";
    public static final String DIARY_PARAMETER_PRIORITY = "priority";
    public static final String DIARY_PARAMETER_DISPLAY_TYPE = "displayType";
    public static final String DIARY_PARAMETER_ASSIGNED_TO = "assignedTo";
    public static final String DIARY_PARAMETER_ALL_STAFF_COMBOBOX =  "allStaffCB";
    public static final String DIARY_PARAMETER_MESSAGES_WANT_TO_BE_DELETED = "messagesWantToBeDeleted";
    public static final String DIARY_IGNORE_FIRST_LOGIN_CHECK = "ignoreFirstLoginCheck";

    public static final String DIARY_TASK_PERSON_ID_ALLSTAFF = "ALLSTAFF";

    public static final String CTX_IS_FIRST_LOGGED_IN = "isFirstLoggedIn";
    public static final String LOOKUP_CODE_MAX_DAYS_REM = "MAX_DAYS_REM";
    
    //SNOMED BROWSE
    public static final Integer MAX_NUMBER_SNOMED_CONCEPT_RETR = 50;
    public static final String SNOMED_CONCEPT_STATUS_CURRENT = "0";
    public static final String SNOMED_CONCEPT_PRIMITIVE_TYPE = "1";
    public static final String SNOMED_CONCEPT_HAVE_CHILD="0";
    public static final String SNOMED_CONCEPT_DONT_HAVE_CHILD="1";
    public static final String SNOMED_RELATION_ZERO_REFINABILITY="0";
    public static final String SNOMED_RELATION_TYPE_DEFINITION="0";
    public static final String SNOMED_RELATION_TYPE_QUALIFIER="1";
    public static final String SNOMED_DESC_TYPE_CODE_FOR_TERM="1";
    
	public static final String USER_MODULE="userModule";
    
    //MIMS
    public static final String SPRING_MIMS_SERVICE = "mimsService";
	public static final String MMS_STOCK_CATALOGUE = "MMS_Stock_Catalogue";
	public static final String MIMS_AJAX_DELIMITER_CHARACTER = ";";
	public static final String AJAX_JSON = "ajaxJSON";
	public static final String MIMS_ICD10 = "ICD10";
	public static final String MMS_CATALOGUE_CLASS_DRUG = "DRUG";
	public static final String MIMS_REFERENCE_CODE_LENGTH = "38";
	public static final String MIMS_DRUG_MAPPING_TYPE_FORM = "drugMappingForm";

        public static final String ANALYTICS_ROLE = "400200"; 

    //specific dismissal lookup code for MMS-OH and MMS-SUITE
    public static final String[] MMS_OH_DISMISSAL_LOOKUP_LIST = {"DWMR","DWR"};
    
    public static final String CTX_DAILY_CARE_SCHEDULE="dailyCareSchedule";
    public static final String CTX_NOTES_AND_CARE_SUMMARY="notesAndCareSummary";
    public static final String CTX_NURSE_CARE_SUMMARY="nurseCareSummary";
    public static final String INPATIENT_SECTION_CODE="INP";
    public static final String CTX_DOCTOR_NOTES="doctorNotes";
    public static final String CTX_NURSE_NOTES="nurseNotes";   
    
    public static final String LOOKUP_TYPE_FOLLOW_UP_LOC="FLP_LOC";
    public static final String IS_FOLLOW_UP="1";
    public static final String REFERER_PAGE_FROM_FOLLOW_UP="followUpSearch";
    public static final String FOLLOW_UP_IS_CLOSE="C";
    public static final String FOLLOW_UP_IS_OPEN="O";

    public static final String MESSAGE_NOT_SUPPORTED_YET = "Not supported yet.";
    public static final String SPRING_KPI_ANALYTICS_SERVICE = "AnalyticsService";
    public static final String INDICATOR_TYPE_FIN = "FIN";
    public static final String INDICATOR_TYPE_ADMFIN = "ADMFIN";
    public static final String CTX_ANALYTICS_SERVICE_SECTION = "analyticsServSec";
    public static final String LOOKUP_TYPE_ANALYTICS_SERVICE_SECTION = "ANLT_SEC_SERV";
    public static final String CTX_ANALYTICS_INDICATOR_TYPE = "indicatorType";
    public static final String LOOKUP_TYPE_ANALYTICS_INDICATOR_TYPE = "ANLT_INDC_TYPE";
    public static final String CTX_ANALYTICS_INDICATOR_PARM_FIN = "indicatorParmFin";
    public static final String LOOKUP_TYPE_ANALYTICS_INDICATOR_PARM_FIN = "ANLT_FIN_PARM";
    public static final String CTX_ANALYTICS_INDICATOR_PARM_ADMFIN = "indicatorParmAdmfin";
    public static final String LOOKUP_TYPE_ANALYTICS_INDICATOR_PARM_ADMFIN = "ANLT_ADMFIN_PARM";
    public static final String CTX_ANALYTICS_DURATION = "duration";
    public static final String LOOKUP_TYPE_ANALYTICS_DURATION = "ANLT_DURATION";
    public static final String DURATION_WEEK = "WEEK";
    public static final String DURATION_MONTH = "MONTH";
    public static final String DURATION_QUARTER = "QUARTER";
    public static final String DURATION_YEAR = "YEAR";
    public static final String DURATION_CUSTOM = "CUSTOM";
    public static final String CTX_DISPLAY_GRAPHS = "displayGraphs";
    public static final String CTX_DISPLAY_PREV_GRAPH = "displayPrevGraph";
    public static final String CTX_IND_TYPE_TITLE_1 = "indicatorTypeTitle1";
    public static final String CTX_DURATION_TITLE_1 = "durationTitle1";
    public static final String CTX_IND_TYPE_TITLE_2 = "indicatorTypeTitle2";
    public static final String CTX_DURATION_TITLE_2 = "durationTitle2";
    public static final String TABLE_CODE_AVG_LENGTH_OF_STAY = "AVLOS";
    public static final String TABLE_CODE_TURN_OVER_INTERVAL = "TOI";
    public static final String TABLE_CODE_AVLOS_AND_TOI = "AVLOS_TOI";
    public static final String TABLE_CODE_BED_OCC_RATE = "BOR";
    public static final String TABLE_CODE_BED_TURN_OVER = "BTO";
    public static final String CTX_ANALYTICS_VALUE_LIST_1 = "valueList1";
    public static final String CTX_ANALYTICS_VALUE_LIST_2 = "valueList2";
    public static final String CTX_ANALYTICS_X_AXIS = "xAxis";
    public static final String CTX_ANALYTICS_X_AXIS_2 = "xAxis_2";
    public static final String KPI_ANALYTICS_LEGENDS = "legends";
    public static final String KPI_ANALYTICS_LEGENDS_PCT = "(%)";    
    public static final String ANLT_OUTP_TABLE_TYPE = "ANLT_OUTP";
    public static final String ANLT_INPT_TABLE_TYPE = "ANLT_INPT";
    public static final String ANLT_SROT_TABLE_TYPE = "ANLT_SROT";
    public static final String ANLT_DSRD_TABLE_TYPE = "ANLT_DSRD";
    public static final String ANLT_DSLB_TABLE_TYPE = "ANLT_DSLB";
    public static final String CTX_ANALYTICS_KPI = "analyticsKPI";

    public static final String CTX_ANALYTICS_SERVER = "analyticsServer";
    public static final String ANLT_SERVER_TABLE_TYPE = "ANLT_SERVER";
    public static final String ANLT_SERVER_TABLE_CODE = "SERVER01";
    public static final int DURATION_TYPE_CUSTOM = 0;
    public static final int DURATION_TYPE_WEEK = 1;
    public static final int DURATION_TYPE_MONTH = 2;
    public static final int DURATION_TYPE_QUARTER = 3;
    public static final int DURATION_TYPE_YEAR = 4;
    //ADT Scope 3, appointment registration
    public static final String CTX_MODE_2ND = "mode2";
    public static final String CTX_MODE_3RD = "mode3";
    public static final String FWD_REVIEW	= "review";
    public static final String FWD_EDIT_APPT_PATIENT = "editPatient";
    public static final String FWD_TRANSFER = "transferPatient";
    public static final String SPRING_REFERRAL_DOCUMENT_BO = "referralDocumentBO";
    public static final String REFERRAL_DOCUMENT_LIST = "referralDocumentList";
    public static final String AUTO_CLOSE_POP_UP = "autoClose";
    public static final String MSADM_INPATIENT_IN_FACILITY_LIT = "T_INFAC";
    public static final String CTX_FWD_TRANSFER = "isTransferedPatient";
    public static final String REFERENCE_TYPE_NON_REFERENCED = "T_NON";
    public static final String CTX_REG_TRANSFER_ROLE = "regTransferRole";

    // Client Form
    public static final String CLIENT_FORM_MODE_REG = "reg";
    public static final String CLIENT_FORM_MODE_DEL = "del";
    public static final String CLIENT_FORM_MODE_NONE = "none";
	
    // Purchase Approval Roles
    public static final String ROLE_ID_REC_ORDER_APPROVAL = "RO_APP";
    public static final String ROLE_ID_PUR_REQ_APPROVAL = "PR_APP";
    public static final String ROLE_ID_PUR_ORDER_APPROVAL = "PO_APP";

    public static final String PURCHASE_APPROVAL_ROLE = "purchaseApprovalRole";
    public static final String CTX_DOCTOR_NOTES_LIST="docterNoteList";
    public static final String CTX_NURSE_CARE_LIST="nurseNoteList";

    public static final String COMMON_SCREEN="screen";
    public static final String APPROVE_STORE_TRANSFER_SCREEN="AST";
    public static final String COMMON_NOT_AUTHORIZE_ACCESS="notAuth";
    public static final String COMMON_NO_WAREHOUSE_ACCESS="noWHouse";
    public static final String ACCESSIBLE_WAREHOUSE_LIST="wHouseAccessList";
    
    //Axosoft 12164
    public static final String PRESC_DISP_MENU_ID = "400150100";
    public static final String APPROVE_PRESC_MENU_ID = "400150103";
    public static final String PHAR_ROLE_ID = "401500";
    public static final String CTX_APPROVE_PRESC_DISABLED = "disableApprovePresc";

    public static final String DIARY_CHECK_PRESC_AUTH = "checkAuth";
	
	    
    // Diary Alert Configuration
    public static final String LOOKUP_TYPE_DIARY_INVC_ALERT = "DRY_INVC_ALERT";
    public static final String LOOKUP_TYPE_DIARY_PRESC_ALERT = "DRY_PRESC_ALERT";
    
    public static final String DIARY_ALERT_ITEM_PARM = "item";
    public static final String DIARY_ALERT_FLAG_PARM = "flag";
    
    public static final String DIARY_ALERT_ITEM_INVC = "invoice";
    public static final String DIARY_ALERT_ITEM_PRESC = "prescription";
    
    public static final String DIARY_INVC_ALERT_FLAG = "diaryInvoiceAlert";
    public static final String DIARY_PRESC_ALERT_FLAG = "diaryPrescriptionAlert";
    public static final String REFFERAL_TYPE_OUT_FAC = "T_OUTFAC";

    public static final String PRESC_SEARCH_MENU_ID = "400150103";
    public static final String INVC_SEARCH_MENU_ID = "400230102";

    public static final String FAC_TYPE_WARD = "WARD";
    public static final String FAC_TYPE_HCU = "HCU";
    public static final String FAC_TYPE_OT = "OT";
    public static final String FAC_TYPE_DR = "DR";
    public static final String FAC_TYPE_HEMO = "HEMO";
    public static final String FAC_TYPE_SU = "SU";
    public static final String FAC_STATUS_CHANGE_FAC_AVAIL_FLAG = "1";
    public static final String PRESC_CREATE_MENU_ID = "400150102";
    public static final String WARD_SCHEDULE_REFERENCE = "400240100";
    public static final String ICU_SCHEDULE_REFERENCE = "400240400";

    public static final String PROCESS_COMPLETED = "processCompleted";

    public static final String AE_REGISTRATION_REFERENCE = "400180006";
    public static final String CTX_MAP_MEDCHART="medChartMap";
    public static final String SCREEN_REFERENCE="reff";
    public static final String PRE_ADMISSION_STAFF_ID="preAdmissionStaff";
    public static final String PRE_ADMISSION_STAFF_NAME="preAdmissionStaffName";
    
    //Axosoft 12748
    public static final int CHILD_AGE = 12;
     
    public static final String FWD_NON_STANDARD_PRESCRIPTION = "nonStandard";    
    
    //Axosoft 13756
    public static final String IS_NOT_RESTRICTED_CASE = "isNotRestrictedCase";

    // MMS v4.5 Catalogue & supplier enhancement
    public static final String GROUP_CODE_MEDICAL = "K-";
    public static final String STOCK_CLASS_AUTO_ORDER = "AU";

    //Axosoft 13242
    public static final String SECTION_OHS = "OHS";
    public static final String SERVICE_CODE_REASSESSMENT = "SV77";      
    
    public static final int EXPIRATION_STATE_CRITICAL_EXPIRING = 3;
    public static final int EXPIRATION_STATE_HIGH_EXPIRING = 2;
    public static final int EXPIRATION_STATE_EXPIRING = 1;
    public static final int EXPIRATION_STATE_BEFORE_EXPIRING = 0;
    
    public static final String CTX_EXP_EXPIRING_DAY = "expiringDate";
    public static final String CTX_EXP_HI_EXPIRING_PCT = "highExpiringDate";
    public static final String CTX_EXP_CRIT_EXPIRING_PCT = "criticalExpiringDate";
    
   
    // Amendment configuration
    public static final String AMEND_CONFIG_CLASS = "com.mitrais.kms.config.AmendConfig";
    public static final String AMEND_CONFIG_SERVICE = "AmendConfigService";
    public static final String AMENDMENT_CODE="amendmentCode";
    public static final String AMENDMENT_CODE_DOCTOR_NOTE="SV151";
    public static final String AMENDMENT_CODE_REHAB_SUMR="SV381";
    public static final String AMENDMENT_CODE_TEE_DSE="SV451";
    public static final String AMENDMENT_CODE_NURSE_CARE="SV152";
    public static final String AMENDMENT_URL_LINK="amendmentURL";
    public static final String AMENDMENT_URL_LINK_WARD="inpatientWardModify";
    public static final String AMENDMENT_URL_LINK_ICU="ICUSummaryShow";
    public static final String AMEND_TYPE_SINGLE="S";
    public static final String AMEND_TYPE_LIST="L";
    public static final int MESSG_AMEND_DATA_IS_NOT_AVAILABLE=2;
    public static final int MESSG_AMEND_DATA_AVAILABLE=1;
    public static final int MESSG_AMEND_AUTH_IS_FAILED=0;
    public static final String AMEND_CHCKBX_ON = "on";
    public static final String AMENDMENT_CODE_DIET="SV153";
    public static final String AMENDMENT_CODE_BLOOD_TRANSF="SV154";
    public static final String AMENDMENT_CODE_INFANT="SV161";
    

    
    public static final String ALERT_TYPE_NOT_EXPIRING = "not_expiring_state";
    
    //proforma
    public static final String ACTION_TYPE_MED_CHART="MDC";
    public static final String ACTION_TYPE_SERVICE="SVC";
    public static final String ACTION_TYPE_MATERIAL="MAT";
    public static final String TARIF_CLASS_WARD="WRD";
    public static final String CTX_PRO_FORMA_ITEM_LIST="proFormaItemList";
    
    public static final String ICD_MAINTENANCE_ROLE = "ICDMTN";
    public static final String RESTRICTED_CASE_VIEW_ROLE = "RESCS";
    
    public static final String LOOKUP_TYPE_RESTRICTED_TAGGING = "RESTRICTED_TAG_FLAG";
    
    public static final String IS_FROM_FOLLOW_UP_SEARCH = "isFromFollowUpSearch";
    
    public static final String WAREHOUSE_INVENTORY_ROLE = "4025"; //taken from KMS_CONF_ROLE_INFO
    public static final String STCK_LVL_ROLE_ALERT = "stockLevelRoleAlert";
    public static final String STCK_EXP_ROLE_ALERT = "stockExpRoleAlert";
    
    public static final String ALERT_TYPE_EMPTY_STOCK = "empty_alert";
    public static final String ALERT_TYPE_CRITICAL_STOCK = "critical_stock_alert";
    public static final String ALERT_TYPE_LOW_STOCK = "low_stock_alert";
    public static final String ALERT_TYPE_ALMOST_FULL_STOCK = "almost_full_alert";
    public static final String ALERT_TYPE_FULL_STOCK = "full_alert";
    
    
    
    public static final String ALERT_DEF = "ALERT_DEF";
    public static final String DAILY = "DAILY";
    public static final String WEEKLY = "WEEKLY";
    public static final String MONTHLY = "MONTHLY";
    
    public static final String TRANS_TYPE_STORE_TRANS = "STORE_TRANS";
    public static final String TRANS_TYPE_MTRL_EXP = "MTRL_EXP";
    public static final String TRANS_TYPE_WRH_INVN = "WRH_INVN";
    public static final String TRANS_TYPE_IMPORT_WHINVN = "IMPORT_WHINVN";
    public static final String TRANS_TYPE_PURC_ORD = "PURC_ORD";
    public static final String TRANS_TYPE_INVN_ADJS = "INVN_ADJS";
    public static final String TRANS_TYPE_MDCL_CHART = "MDCL_CHART";
    public static final String TRANS_TYPE_PRSCP_BY_DOC = "PRSCP_BY_DOC";
    public static final String TRANS_TYPE_PRSCP_DISP = "PRSCP_DISP";
    public static final String TRANS_TYPE_RETAIL_PHAR = "RETAIL_PHAR";
    
    public static final String CTX_STOCK_LEVEL = "CTX_STOCK_LEVEL";
    public static final String CTX_STOCK_LEVEL_2ND = "CTX_STOCK_LEVEL_2ND";
    public static final String CTX_MTRL_EXPR_MAP = "CTX_MTRL_EXPR_MAP";
    
    public static final String NON_STOCK_TABLE_CODE = "NST";
    public static final String STOCK_TABLE_CODE = "ST";
    public static final String DISABLE_STOCK_TYPE = "disableStockType";
    public static final String STOCK_TYPE = "stockType";
	public static final String REPORT_PARAMETER_TYPE_POPUP = "Popup";
	public static final String SYST_LKUP_TABLE_TYPE_LOOKUP_URL = "LOOKUP_URL";
    // Claim Management
    public static final String HEALTH_BENEFIT_PROVIDER_CLASS = "com.mitrais.kms.claim.HealthBenefitProvider";
    public static final String HEALTH_BENEFIT_PLAN_CLASS = "com.mitrais.kms.claim.HealthBenefitPlan";
    public static final String BENEFIT_ITEM_CLASS = "com.mitrais.kms.claim.BenefitItem";
    public static final String CLAIM_SERVICE = "ClaimService";
    public static final String BENEFIT_TYPE_HOSPITAL = "HOSPITAL";
    public static final String BENEFIT_TYPE_OUTPATIENT = "OUTPATIENT";
    public static final String BENEFIT_TYPE_OTHERS = "OTHERS";
    public static final String PAYMENT_TYPE_HEALTH_BENEFIT_COMPANY="CA";  
    public static final String CTX_SPN_VER_LIST="verificarionList";
    public static final String LOOKUP_TYPE_VER_RELATION="PAYM_VRD";
    public static final String CTX_HEALTH_PLAN_LIST="healthPlanList";
    public static final String RETAIL_PHAR_FORM_LITERAL="RetailPharForm";
    public static final String INVOICE_HEAD_FORM_LITERAL="InvcHeadForm";
    public static final String PATIENT_DETAIL_FORM_LITERAL="PatientDetailForm";
    public static final String CLAIM_RPRT_DOC="Claim Report Document";
    public static final String INVC_DOC="Invoice Document";
    public static final String IS_ERROR_TARIFF_CODE = "isErrorTariffCode";

	
	// Exchange Rate RSS Updater
    public static final String EXCH_RATE_SOURCE_TABLE_TYPE = "CURR_PROV";
    public static final String EXCH_RATE_SCHD_TABLE_TYPE = "CURR_SCHD";
    public static final String EXCH_RATE_SWITCH_TABLE_TYPE = "CURR_SWITCH";
    public static final String EXCH_RATE_SWITCH_TABLE_CODE = "1";
    public static final String SWITCH_ON = "on";
    public static final String SWITCH_OFF = "off";
    public static final String LOOKUP_CODE_RSS1 = "1";
    public static final String LOOKUP_CODE_RSS2 = "2";
    public static final String autoUpdater = "Auto Updater";
    
    public static final String TIME_UNIT_MINUTE ="M";
    public static final String TIME_UNIT_HOUR ="H";
    public static final String TIME_UNIT_DAY ="D";
    public static final String TIME_UNIT_WEEK ="W";
    public static final String TIME_UNIT_MONTH ="MO";
    
    public static final String showOrigBuyPriceInfo = "showOrigBuyPriceInfo";
    public static final String ERROR_BUY_PRICE_FLAG = "-1";
	
    public static final String EXCHANGE_RATE_CLASS = "com.mitrais.kms.config.ExchangeRate";
    public static final String ORIG_BUY_PRICE = "origBuyPrice";
    public static final String ORIG_BUY_CURR = "origBuyCurrency";
    public static final String BASE_CURR = "baseCurrency";
    public static final String SPRING_EXCHANGE_RATE_BO = "ExchangeRateBO";
    public static final String CURRENCY_FORMAT = "#.####";
    
	// Currency for Exchange Rate
    public static final String CTX_CURR_TYPE = "currType";
    public static final String CTX_CURR_LIST = "currList";
    public static final String LOOKUP_TYPE_CURRENCY_EXCHANGE = "CURR_CODE";  
    public static final String BASE_CURRENCY_TYPE = "BASE";    
    
    //used on exchange rate module
    public static final String CURR_RATE_TABLE_ALIAS = "currrate";
    
    //ajax 

    public static final String AJAX_TARIFF_CODE="tariffCode";
    public static final String AJAX_TARIFF_DESC="tariffDesc";
    public static final String AJAX_TARIFF_DESC_LOCALE="tariffDescLoc";
    public static final String CTX_SEARCH_TYPE="searchType";
    public static final String CTX_KEYWORD="keyWord";
    public static final String CTX_WAREHOUSE = "warehouse";
    public static final String CTX_AJAX_DATE_LIMIT = "ajaxDateLimit";
    public static final String CTX_AJAX_PRESC_RETURN = "ajaxPrescReturn";
    public static final String CTX_AJAX_MEDC_CHART_RETURN = "ajaxMedChartReturn";
    public static final String RETURN_PATH_AJAX_TARIFF_CODE="successAjaxTariffCode";
    public static final String RETURN_PATH_AJAX_TARIFF_DESC="successAjaxTariffDesc";
    public static final String AJAX_DESC_KEYWORD="AJAX_DESC";
    public static final String AJAX_CODE_KEYWORD="AJAX_CODE";
    public static final String TARIFF_SCHEMA = "TRF_SCHM";
    public static final String TARIFF_SCHEMA_NOMINAL = "NML";
    public static final String TARIFF_SCHEMA_PERCENTAGES = "PRCTG";
    public static final String KEYWORD_FROM_RO_NO = "fromRoNumber";
    public static final String KEYWORD_UNTIL_RO_NO = "untilRoNumber";
    public static final String KEYWORD_FROM_PR_NO = "fromPrNumber";
    public static final String KEYWORD_UNTIL_PR_NO = "untilPrNumber";
    
	
    public static final String LOOKUP_TYPE_ALERT_TYPE = "ALRT_TYPE";
    public static final String CTX_ALERT_SETTINGS = "alertSettings";
    public static final String ALERT_SCHEDULER_SETTING = "ALERT_SCHD";
    public static final String ALERT_DEF_TABLE_TYPE = "ALERT_DEF";
	
	public static final String ALERT_TYPE_EXPIRING_STATE = "expiring_state";
    public static final String ALERT_TYPE_HIGH_EXPIRING_STATE = "high_expiring_state";
    public static final String ALERT_TYPE_CRITICAL_EXPIRING_STATE = "crit_expiring_state";

    // staff scheduling
    public static final String STAFF_SCHD_RECURR_TIME = "15";
    public static final String STAFF_ROUTINE_SCHEDULER_ROLE = "SCHED";
    public static final String STAFF_SCHD_TYPE_ON_DUTY = "OND";
    public static final String STAFF_SCHD_TYPE_OFF_DUTY = "OD";
    public static final String STAFF_SCHD_TYPE_HOLIDAY = "HD";
    public static final String STAFF_SCHD_TYPE_MEETING = "MT";
    public static final String STAFF_SCHD_TYPE_OTHERS = "OTH";
    public static final String STAFF_SCHD_NONROUTINE = "NONROUTINE";
    public static final String STAFF_SCHD_ROUTINE = "ROUTINE";
    public static final String STAFF_SCHD_TYPE_OUTH = "OUTH";
    public static final String STAFF_SCHD_TYPE_OUTP = "OUTP";

   public static final String OUTH_BG_IMG = "images/outsd_hosp.png";
   public static final String OUTP_BG_IMG = "images/outsd_pusk.png";
    public static final String CTX_STAFF_SCHD_MODIFIABLE = "isStaffSchedModifiable";
    
    public static final String CTX_FACL_STATUS_MAP = "faclStatusMap";
    public static final String CTX_FACL_BOOK_PROCEDURE = "facilityBookProcedure";

    public static final String LOOKUP_TYPE_FAC_BOOK_PROCEDURE ="PROFCT";

    // CPOE
    public static final String CPOE_SCT_MED_PRC = "CPOE_MED_PRC";
    public static final String CPOE_SCT_REF_APP = "CPOE_REF_APP";
    public static final String CPOE_SCT_OTHER = "CPOE_OTHER";
    
    public static final String CTX_CPOE_PRSN_INFO = "prsnInfo";
    public static final String CTX_CPOE_PAYM_INFO = "paymInfo";
    public static final String CTX_CPOE_MEDICAL_PROCEDURES = "medicalProcedures";
    public static final String CTX_CPOE_OTHER_SECTION = "otherSections";
    public static final String CTX_CPOE_PRESCRIPTION = "prescriptions";
    public static final String CTX_CPOE_ADMISSION = "admission";
    public static final String CTX_CPOE_REFERRALS = "referrals";
    public static final String CTX_CPOE_APPOINTMENTS = "appointments";
    public static final String CTX_CPOE_SERVICE_CODE_DESC = "serviceCodeDesc";
    public static final String CTX_CPOE_REG_ITEM = "regItem";
    public static final String CTX_CPOE_APPT_REG_ITEM = "apptRegItem";
    public static final String CTX_CPOE_SERVICES = "services";
    public static final String CTX_CPOE_PRESCRIPTION_ITEMS = "prescriptionItems";
    public static final String CTX_CPOE_POPULATE = "populate";
    public static final String MR_NO = "mrNo";
    
    // MMS 4.5 - Dev 5.28
    public static final String 	FAC_STS_TBL_CODE_GOOD	                ="GOOD";
    public static final String 	FAC_STS_TBL_CODE_DAMAGED	            ="DMG";
    public static final String 	FAC_STS_TBL_CODE_UNDER_REPAIR	        ="RPR";
    public static final String 	FAC_STS_TBL_CODE_USED_GOOD	            ="DB";
    public static final String 	FAC_STS_TBL_CODE_USED_SLIGHTLY_WORN	    ="DS";
    public static final String 	FAC_STS_TBL_CODE_USED_POOR_CONDITION	="DJ";
    public static final String 	FAC_STS_TBL_CODE_NOT_USED_DAMAGED	    ="TR";
    public static final String 	FAC_STS_TBL_CODE_NOT_USED_REPAIRED	    ="TP";
    public static final String 	FAC_STS_TBL_CODE_NOT_USED_POST_WAIT	    ="TT";
    public static final String 	FAC_STS_TBL_CODE_NOT_USED_WAIT_FOR_DOC	="TD";
    public static final String 	FAC_STS_TBL_CODE_NOT_USED_EXCESS	    ="TL";
    public static final String 	FAC_STS_TBL_CODE_NOT_USED_RESERVED	    ="TC";
    public static final String 	FAC_STS_TBL_CODE_NOTFOUND_ON_CENSUS	    ="TX";
    public static final String 	FAC_STS_TBL_CODE_HBM_FUPP_PROCESS	    ="F";
    public static final String 	FAC_STS_TBL_CODE_CLEANING_IN_PROGRESS	="CP";
    public static final String 	FAC_STS_TBL_CODE_UNDER_INSPECTION	    ="UI";
    // MMS 4.5 - RSUT    
    public static final String 	FAC_STS_TBL_CODE_SLIGHTLY_DAMAGED	    ="DMGS";

    public static final String 	DEFAULT_ZERO	    ="0";

    public static final String FAC_BOOK_PROC_TBL_CODE_RETAIL           = "PROCRB";
    public static final String FAC_BOOK_PROC_TBL_CODE_OPERATION        = "PROC";
    //claim and health benefit maintenance
    public static final String CLM_RPRT_DAO_CLASS = "com.mitrais.kms.claim.ClaimReport";
    public static final String CCLM_SUPP_DOC_CLASS = "com.mitrais.kms.claim.ClaimSuppDoc";
    public static final String CTX_PLAN_ID_LIST = "benefitPlanList";
    public static final String CLAIM_DOCUMENT_LIST = "claimDocList";
    public static final String HEALTH_BENEFITBO ="healthBenefitBO" ;
    public static final String CTX_MAP_PROVIDER = "ProviderMap";
    public static final String CTX_BENEFIT_TYPE = "benefitTypeList";
    public static final String LOOKUP_TYPE_BENEFIT = "BNFT_TYPE";

    public static final String AUTOCHARGING_TABLE_CODE = "AUTOCHG";
    public static final String MENU_REF_REG_ACTV_REVIEW = "450180009";
    
    public static final String DEFAULT_ACTION_PATH = "login.do";
    public static final String LOGOUT_ACTION_PATH = "logout.do";
    public static final String FORGOT_PASSWORD_ACTION_PATH = "forgotPassword.do";
    public static final String CHANGE_PASSWORD_SHOW_ACTION_PATH = "changeForgotPasswordShow.do";
    public static final String CHANGE_PASSWORD_EDIT_ACTION_PATH = "changeForgotPasswordEdit.do";
    public static final String CHANGE_PASSWORD_ACTION_PATH = "changePassword.do";
    public static final String CTX_BODY_CHART = "bodyChart";
    public static final String LOOKUP_BODY_CHART = "BODYSGMT";
	public static final String CTX_BODY_CHART_LIST = "bodyChartList";
	public static final String CTX_BODY_CHART_MAP = "bodyChartMap";
    public static final String BODY_CHART_PREFIX = "BC";

    public static final String CTX_PULMO_CHART = "pulmoChart";
    public static final String LOOKUP_PULMO_CHART = "PULSGMT";
	public static final String CTX_PULMO_CHART_LIST = "pulmoChartList";
    public static final String PULMO_CHART_PREFIX = "PUL";

    public static final String CTX_ORTHO_CHART = "orthoChart";
    public static final String LOOKUP_ORTHO_CHART = "ORTHOSGMT";
	public static final String CTX_ORTHO_CHART_LIST = "orthoChartList";
    public static final String ORTHO_CHART_PREFIX = "ORTHO";

    public static final String CTX_DENTAL_CHART = "dentalChart";
    public static final String LOOKUP_DENTAL_CHART = "DENTSGMT";
	public static final String CTX_DENTAL_CHART_LIST = "dentalChartList";
    public static final String DENTAL_CHART_PREFIX = "DENT";

    public static final String DENT_EXAM_PERIODONTAL_CLASS = "com.mitrais.kms.service.DentExamPeriodontal";
    public static final String DENTAL_CHART_PERMANENT = "PERM";
    public static final String CTX_DENTAL_CHART_PERMANENT_LIST = "perDentList";
    public static final String DENTAL_CHART_DECIDUOUS = "DEC";
    public static final String CTX_DENTAL_CHART_DECIDUOUS_LIST = "decDentList";
    public static final String DENTAL_CHART_PERIODONTAL = "PER";

    public static final String DENTAL_BUCCAL_MANDIBULAR = "BU_MAN";
    public static final String DENTAL_BUCCAL_MAXILLARY = "BU_MAX";
    public static final String DENTAL_LINGUAL_MANDIBULAR = "LI_MAN";
    public static final String DENTAL_PALATAL_MAXILLARY = "PAL_MAX";

    public static final String CTX_DENTAL_BUCCAL_MANDIBULAR_LIST = "dentalBuManList";
    public static final String CTX_DENTAL_BUCCAL_MAXILLARY_LIST = "dentalBuMaxList";
    public static final String CTX_DENTAL_LINGUAL_MANDIBULAR_LIST = "dentalLiManList";
    public static final String CTX_DENTAL_PALATAL_MAXILLARY_LIST = "dentalPalMaxList";

    public static final String CTX_PERIODONTAL_EXAM_CHART = "dentExam";
    public static final String LOOKUP_PERIODONTAL_EXAM_CHART = "DENTEXM";
	public static final String CTX_PERIODONTAL_EXAM_CHART_LIST = "dentExamList";
	public static final String PERIODONTAL_EXAM_PREFIX = "DENTEXM";

	public static final String CTX_PERIODONTAL_TREAT = "periodTreat";
	public static final String LOOKUP_PERIODONTAL_TREAT = "DENTTREAT";
	public static final String CTX_PERIODONTAL_TREAT_LIST = "periodTreatList";
	public static final String PERIODONTAL_TREAT_PREFIX = "DENT";

	public static final String LOOKUP_DENTAL_TREAT_POS = "DENTREATPOS";
	public static final String CTX_DENTAL_TREAT_POS_LIST = "dentalTreatPosList";
	public static final String DENTAL_TREAT_POS_PREFIX = "POS";

	public static final String PERIODONTAL_TREAT_ENDODONTIC = "ENDO";
	public static final String PERIODONTAL_TREAT_ORAL_SURGERY = "ORAL";
	public static final String PERIODONTAL_TREAT_PEDIATRIC_DENTISTRY = "PEDIA";
	public static final String PERIODONTAL_TREAT_PERIODONTIC = "PERIO";
	public static final String PERIODONTAL_TREAT_PROSTHETIC_DENTISTRY = "PROS";
	public static final String PERIODONTAL_TREAT_RESTORATIVE_DENTISTRY = "REST";
	
	public static final String PERMANENT_TREATMENT_LIST = "arrPer";
	public static final String PERIODONTAL_TREAT_LIST = "arrPerTreat";

    public static final String CTX_EYES_CHART = "eyesChart";
    public static final String LOOKUP_EYES_CHART = "EYESSGMT";
	public static final String CTX_EYES_CHART_LIST = "eyesChartList";
    public static final String EYES_CHART_PREFIX = "EYE";

    public static final String CTX_ENT_CHART = "ENTChart";
    public static final String LOOKUP_ENT_CHART = "ENTSGMT";
	public static final String CTX_ENT_CHART_LIST = "ENTChartList";
    public static final String ENT_CHART_PREFIX = "ENT";

    public static final String MENU_ID_EXAM = "EXAM";
    public static final String MENU_ID_MED_FEE = "MED_FEE";
    public static final String MENU_ID_DIARY = "DIARY";
    public static final String MENU_ID_PRESC = "PRESC";
    public static final String MENU_ID_REFERRAL = "REFERRAL";
    public static final String MENU_ID_MED_HIST = "MED_HIST";
    public static final String MENU_ID_MED_REF = "MED_REF";
    public static final String MENU_ID_CLIENT_FRM = "CLIENT_FRM";
    public static final String MENU_ID_CPOE = "CPOE";
    public static final String MENU_ID_400240101 = "400240101";
    public static final String MENU_ID_400240102 = "400240102";
    public static final String MENU_ID_400240103 = "400240103";
    public static final String MENU_ID_400240104 = "400240104";
    public static final String MENU_ID_400240120 = "400240120";
    public static final String MENU_ID_FOLLOWUP = "FOLLOWUP";
    public static final String MENU_ID_BODYCHART = "BODY_CHART";
    public static final String MENU_ID_400240401 = "400240401";
    public static final String MENU_ID_400240405 = "400240405";
    public static final String MENU_ID_400240404 = "400240404";
    
    //5.17 - VITAL SIGN
    public static final String CTX_GCS_EYES = "eyes";
    public static final String LOOKUP_TYPE_GCS_EYES = "GSC_EYE";
    public static final String CTX_GCS_MOTOR = "motor";
    public static final String LOOKUP_TYPE_GCS_MOTOR = "GSC_MOTOR";  
    public static final String CTX_GCS_VERBAL = "verbal";
    public static final String LOOKUP_TYPE_GCS_VERBAL = "GSC_VERBAL"; 
    public static final String DEFAULT_GCS_EYES = "4";
    public static final String DEFAULT_GCS_VERBAL = "5";
    public static final String DEFAULT_GCS_MOTOR = "6";
    public static final String DEFAULT_GCS = "15";
    
    //Client Form
    public static final String CLIENT_FRM_MENU_ID = "CLIENT_FRM";
    public static final String CLIENT_FRM_MENU_URL = "javascript:goToClientForm";
    public static final String NO_CLIENT_FORM = "noClientForm";
    
    public static final String CATEGORY_LIST = "categoryList";
    public static final String LOOKUP_TYPE_CLIENT_FORM_CATEGORY = "FORM_CAT";
    public static final String TABLE_LIST = "tableList";
    public static final String LOOKUP_TYPE_DB_TABLE = "DB_TABLE";
    public static final String FORM_NO = "formNo";
	public static final String CLIENT_FRM_MENU_PREFIX = "CF";
    
	//5.17 - Obstetric   
    public static final String CTX_OBS_SOP = "sexOfPartner";
    public static final String CTX_OBS_CONTRACEPTIVE = "contraceptiveType";
    public static final String LOOKUP_TYPE_OBS_SOP = "OBS_SOP";
    public static final String OBS_TABLE_CODE = "SV09";
    public static final String CTX_OBS_CMPLCTN = "complFactor";
    public static final String LOOKUP_TYPE_OBS_CMPLCTN = "OBS_CMPLCTN";
    public static final String CTX_OBS_SERV_DET = "serviceDetail";
    public static final String LOOKUP_TYPE_OBS_SERV_DET = "OBS_SERV";
    public static final String CTX_OBS_SERVICE_LIST = "obsServiceList";
    public static final String OBS_SUB_CLASS = "obsServDetList";
    public static final String OBS_GYN_CLASS = "gynecologyList";   
    public static final String OBS_FAMPLAN_CLASS = "famPlanList";    
    public static final String OBS_PRE_CLASS = "preNatalList";   
    public static final String OBS_POST_CLASS = "postNatalList";
    public static final String CTX_OBS_DELV_LIST = "obsdeliveryListSize";
    public static final String OBS_DELV_CLASS = "obsdeliveryList"; 
    public static final String LIST_VACC_CLASS = "vaccList"; 
    public static final String OBS_SERV_DET_DELV = "DELV";
    public static final String OBS_SERV_DET_GYN = "GYN";
    public static final String OBS_SERV_DET_FP	="FP";
    public static final String OBS_SERV_DET_PREN= "PREN";
    public static final String OBS_SERV_DET_POST="POSTN";       
    public static final String OBS_SERV_DET_CHECK = "checkValue";
    public static final String OBS_SERV_DET_DELV_LIST = "false";
    public static final String CTX_OBS_STATUS = "ObsStatus";
    public static final String BENEFIT_TYPE_NON_CVRG = "NON_CVRG";
    public static final String CTX_MAP_PRESCRIPTION_ITEMS = "mapOfPrescriptionItems";
    public static final String MR_TYPE_MOTHER = "24";
    
    //5.2 Analytics (KPI)
	public static final String LOOKUP_TYPE_TARF_LVL = "TARIFF_LEVEL";
	public static final String CTX_LIST_OF_PLANS = "listOfPlans";
	public static final String CTX_LIST_OF_ITEM_OTH = "listOfItemOth";
	public static final String CTX_LIST_OF_ITEM_OUT = "listOfItemOut";
	public static final String CTX_LIST_OF_ITEM_HOS = "listOfItemHos";
	public static final String CTX_LIST_OF_ITEM_NON = "listOfItemNon";
	public static final String CTX_TARF_LEVEL = "listOfLevel";
	public static final String FORWARD_SUCCESS_POP_UP = "successPopUp";
	public static final String CTX_MAP_TARIFF = "mapTariff";
    
    public static final String OUTPATIENT_PROC_NAME = "OUTP";
    public static final String SURG_PROCESS_NAME = "SURG";
	public static final String INPATIENT_PROC_NAME = "INPAT";
    public static final String DGS_LAB_PROC_NAME = "DGSLAB";
    public static final String DGS_RAD_PROC_NAME = "DGSRAD";
    
    public static final String LOOKUP_TYPE_ANALYTIC_SERVICES = "ANLT_SVC";
    public static final String PROCESSED_QUEUE_STATUS = "OK";

    public static final String LOOKUP_TYPE_ANALYTICS_EXEC_DATE = "ANLT_EXEC_DATE";
    public static final String LOOKUP_CODE_ANALYTICS_LAST_EXEC_DATE = "LAST_EXEC_DATE";
    
	//5.116 SSO
	public static final String LOGINPAGE_AVAILABLE = "LOGINPAGE_AVAILABLE"; 
	public static final String AUTH_METHOD_PARAM_NAME="authMethod";
	public static final String AUTH_METHOD_FORM="form";

	//5.117 Direct Link
	public static final String EXT_APP_BASE_LKUP_TYPE = "EXTAPP";

	//interoperability
	public static final String INTEROP_HL7_LOG_CLASS = "com.mitrais.kms.interoperability.hl7.HL7Log";
    public static final String INTEROP_SERVICE = "InteropService";
    public static final String LOOKUP_TYPE_INTEROP_CONFIG = "INTR";
    public static final String LOOKUP_CODE_INTEROP_CONFIG_CHG_PROC = "IOP01";
    public static final String LOOKUP_CODE_INTEROP_CONFIG_ACCR = "IOP02";
    public static final String LOOKUP_CODE_INTEROP_CONFIG_INVC = "IOP03";
    public static final String LOOKUP_CODE_INTEROP_CONFIG_PRSN = "IOP04";
    public static final String LOOKUP_CODE_INTEROP_CONFIG_TARIF = "IOP05";
    public static final String LOOKUP_TYPE_INTEROPERABILITY_RADIOLOGY_ENABLED = "IOP06";
	public static final String LOOKUP_TYPE_INTEROPERABILITY_DICOM_FOLDER = "IOP07";
    public static final String HL7LOG_ID_SEPARATOR = "_";
    
    //MMS Billing
	public static final String CTX_PRODUCTS_LIST = "productList";
	
	public static final String PAYMENT_TYPE = "paymentType";
	public static final String PROVIDER_NAME = "providerName";
	public static final String PLAN = "plan";
	
	public static final String IS_FROM_REFERRAL_PARAMETER = "isFromReferral";
	public static final String PARTOGRAPH_PARAMETER = "partograph";
	public static final String MMS_REPORT_FOLDER = "/Reports/Analytics/";
	public static final String EMBEDDED_REPORT_EXTENSION = ".jasper";
	public static final String ALERT_CAT_TARF_MAPP_NOTIF = "cat_tarf_map_notif";

	// Axo 16170
	public static final String IS_STATUS_FIELD_DISABLED = "isStatsDisabled";

        public static final String CTX_MAP_ALLOW_LINK_LOOKUP = "ctxMapAllowLinkLookup";
        public static final String CTX_MAP_DESC_LOOKUP = "ctxMapDescLookup";
        public static final String CTX_MAP_UNIT_PRICE_LOOKUP = "ctxMapUnitPriceLookup";
        
     // Axo 16222
    	// Medical Action Report parameter
    	public static final String MED_ACT_RPT_MR_NO = "mrNo";
    	public static final String MED_ACT_RPT_ACTV_ID = "actvId";
    	public static final String MED_ACT_RPT_ACTV_GRP_ID = "actvGrpId";
    	
    	//Link to External Application
    	public static final String EXTERNAL_APP_DESC_FILTER = "ext.app.";
    	
   // Axo 16610
   public static final String DOC_PATH_EDITABLE = "docPathEditable";
   public static final String STATUS_VERIFIED = "VRFD";
   
   public static final int TWO_DECIMAL_ROUND = 2;
   public static final String LOOKUP_TYPE_VILLAGE = "GE_VLG"; 
   public static final String CTX_VILLAGE_LIST = "villageList";
   public static final String LOOKUP_TYPE_SUBDISTRICT = "GE_DIST"; 
   public static final String CTX_SUBDISTRICT_LIST = "subdistrictList";
   public static final String LOOKUP_TYPE_REGENCY = "GE_RGNCY"; 
   public static final String CTX_REGENCY_LIST = "regencyList";
   public static final String LOOKUP_TYPE_CITY = "GE_CITY"; 
   public static final String CTX_CITY_LIST = "cityList";
	
	//Hemodialisis
   public static final String CTX_HD_CON_LIST = "hdConList";
   public static final String LOOKUP_TYPE_HD_CON = "HD_CON";
   public static final String CTX_HD_SKIN_LIST = "hdSkinList";
   public static final String LOOKUP_TYPE_HD_SKIN = "HD_SKIN";
   public static final String CTX_HD_SKLR_LIST = "hdSklrList";
   public static final String LOOKUP_TYPE_HD_SKLR = "HD_SKLR";
   public static final String CTX_HD_CONJ_LIST = "hdConjList";
   public static final String LOOKUP_TYPE_HD_CONJ = "HD_CONJ";
   public static final String CTX_HD_VISIT_LIST = "hdVisitList";
   public static final String LOOKUP_TYPE_HD_VISIT = "HD_VISIT";
   public static final String CTX_HD_SHS_LIST = "hdShsList";
   public static final String LOOKUP_TYPE_HD_SHS = "HD_SHS";
   public static final String CTX_HD_DIAL_LIST = "hdDialList";
   public static final String LOOKUP_TYPE_HD_DIAL = "HD_DIAL";
   public static final String CTX_DIAL_NO_LIST = "dialNoList";
   public static final String LOOKUP_TYPE_DIAL_NO = "DIAL_NO";
   public static final String CTX_NRS_DIAG_LIST = "nurseDiagList";
   public static final String LOOKUP_TYPE_NRS_DIAG = "NRS_DIAG";
   public static final String CTX_NRS_ACT_LIST = "nurseActList";
   public static final String LOOKUP_TYPE_NRS_ACT = "NRS_ACT";
   public static final String LOOKUP_CODE_OTHER = "OTH";
   public static final String TABLE_PROC_HEMO_LIST = "tableProcHemoList";
   
   public static final String LOOKUP_CODE_BLOOD_PRESS = "HDT01";
   public static final String LOOKUP_CODE_PULSE = "HDT02";
   public static final String LOOKUP_CODE_TEMPERATURE = "HDT03";
   public static final String LOOKUP_CODE_RESP = "HDT04";
   public static final String LOOKUP_CODE_QB = "HDT05";
   public static final String LOOKUP_CODE_VENUS = "HDT06";
   public static final String LOOKUP_CODE_UFG = "HDT07";
   public static final String LOOKUP_CODE_UFR = "HDT08";
   public static final String LOOKUP_CODE_UF = "HDT09";
   public static final String LOOKUP_CODE_HEPARIN = "HDT10";
   public static final String LOOKUP_CODE_TMP = "HDT11";
   
   public static final String NANDA_SEPARATOR = ":";
   public static final String NURS_DIAG_SEPARATOR = ";\n";
   // Inpatient Ophtalmology
   public static final String LOOKUP_TYPE_CATARACT ="WRD_CT";
   public static final String CTX_CATARACT_LIST="cataractList";
   public static final String LOOKUP_TYPE_GLAUCOMA="WRD_GL";
   public static final String CTX_GLAUCOMA_LIST="glaucomaList";
   public static final String LOOKUP_TYPE_RETINA="WRD_RT";
   public static final String CTX_RETINA_LIST="retinaList";
   public static final String LOOKUP_TYPE_CORNEA="WRD_CR";
   public static final String CTX_CORNEA_LIST="corneaList";
   public static final String LOOKUP_TYPE_BCVA="WRD_BC";
   public static final String LOOKUP_TYPE_INTRAOCULAR_PRESSURE="WRD_IP";
   public static final String LOOKUP_TYPE_TREATMENT_LEVEL="WRD_TL";
   public static final String CTX_TREATMENT_LEVEL_LIST="treatmentLevelList";
   public static final int NANDA_SEARCH_LIMIT = 10;
      
   public static final String LOOKUP_CODE_IMNS_STS = "IMNS_STS";
   public static final String CTX_IMNS_STS_LIST = "imunStatusList";
   public static final String LOOKUP_CODE_IMNS_ICD = "IMNS_ICD";
   public static final String CTX_IMNS_MAPP_LIST = "icdMappList";  
   
   public static final String SL_SIGNATURE_TABLE_CODE = "SL_SIGNATURE";

	// prescription return
	public static final String CTX_PRET_RX_NO = "rxNo";
	public static final String CTX_PRET_APPROVE = "prescReturnApprove";
	
	public static final String LOOKUP_TYPE_CONSCIOUSNESS = "CNCSNS";
	public static final String CTX_CONSCIOUSNESS_LIST = "consciousnessList";
	public static final String LOOKUP_TYPE_PUPIL_REACTION = "HCUN_PUPIL";
	public static final String CTX_LEFT_PUPIL_REACTION_LIST = "leftPupilReactionList";
	public static final String CTX_RIGHT_PUPIL_REACTION_LIST = "rightPupilReactionList";
	public static final String LOOKUP_TYPE_PHYSIOTHERAPY = "HCUN_FIS";
	public static final String CTX_PHYSIOTHERAPY_LIST = "physiotherapyList";
	public static final String LOOKUP_TYPE_MOBILIZATION = "HCUN_MOB";
	public static final String CTX_MOBILIZATION_LIST = "mobilizationList";

   public static final String LOOKUP_TYPE_SURG_TREATMENT = "SRG_TM";
   public static final String OPMED_ANES = "OPMED_ANES";
   public static final String OPMED_SURG = "OPMED_SURG";
   public static final String OPMED_INSTR = "OPMED_INSTR";
   public static final String OPMED_CIRC = "OPMED_CIRC";
   public static final String OPMED_SURG_NURSE = "OPMED_SURG_NURSE";
   public static final String OPMED_SURG_REPORT = "OPMED_SURG_REPORT";
   // This constants represent on how many maximum fields for each category in
   // Surgery exam detail screen.
   public static final int OPMED_ANES_FIELD_MAX = 3;
   public static final int OPMED_SURG_FIELD_MAX = 3;
   public static final int OPMED_INSTR_FIELD_MAX = 3;
   public static final int OPMED_CIRC_FIELD_MAX = 3;
   public static final int OPMED_SURG_NURSE_FIELD_MAX = 3;
   public static final int OPMED_SURG_REPORT_FIELD_MAX = 3;
	// reference code
	public static final String LOOKUP_CODE_REFERENCE_ACCEPT_PUSKESMAS = "T_PUS";
	public static final String LOOKUP_CODE_REFERENCE_ACCEPT_OTHER_HEALTH_FAC = "T_FAS";
	public static final String LOOKUP_CODE_REFERENCE_ACCEPT_OTHER_HOSPITAL = "T_RS";
	public static final String LOOKUP_CODE_REFERENCE_UNREGISTER_HOSPITAL = "T_UN";
	public static final String LOOKUP_CODE_REFERENCE_DOCTOR = "T_DOC";
	public static final String LOOKUP_CODE_REFERENCE_MIDWIFE = "T_MIDW";
	public static final String LOOKUP_CODE_REFERENCE_NURSE = "T_NURS";
	
	public static final String REHAB_SERVICE_CODE = "SV38";
	public static final String MATH_OPR_EQUAL = "=";
	public static final String MATH_OPR_LESS = "<";
	public static final String MATH_OPR_MORE = ">";
	public static final String MATH_OPR_LESS_EQUAL = "<=";
	public static final String MATH_OPR_MORE_EQUAL = ">=";
	
	// TD-RI-013
	public static final String VST_LLK = "VST7";
	public static final String VST_LLD = "VST8";
	public static final String VST_LLK_TITLE = "Lingkar Kepala";
	public static final String VST_LLD_TITLE = "Lingkar Dada";
	
	public static final String MTRL_EXP_TRX_ID = "trxId";
	public static final String MTRL_EXP_TRX_TYPE = "trxType";
	public static final String MTRL_EXP_TRX_PRESC = "mtrlExpTrxPresc";
	public static final String MTRL_EXP_TRX_STTR = "mtrlExpTrxSttr";
	public static final String MTRL_EXP_TRX_IVAD = "mtrlExpTrxIvad";
	public static final String MTRL_EXP_TRX_SR = "mtrlExpTrxSr";
	public static final String MTRL_EXP_TRX_MEDC = "mtrlExpTrxMedc";
	public static final String MTRL_EXP_TRX_PRESC_RETURN = "mtrlExpTrxPrescReturn";
	public static final String MTRL_EXP_ACQUIT_POSTED = "A";
	public static final String MTRL_EXP_RECEIVED_POSTED = "R";
	public static final String MTRL_EXP_TRX_MEDC_RETURN = "mtrlExpTrxMcrt";
	public static final String MTRL_EXP_TRX_RET_PHAR = "mtrlExpTrxRetPhar";
	
    /**
     * Strore Requisition Type.
     */
    public static final String NORMAL_ISSUE_ADJUSTMENT = "NISS";
    public static final String CREDIT_RETURN_ADJUSTMENT = "CRRT";
    
    
    public static final String CTX_PRESERVE_MEDCHART_CHECKBOXES = "ctxPreserveMedChartCheckboxes";
    public static final String CTX_SELECTED_DATE = "selectedDate";
    
    public static final String CTX_RET_PHAR_CANNOT_COMPLETE = "ctxRetPharCannotComplete";
    
    //RPT_CORE_RPU_015
    public static final String VACCINATION_SERVICE_CODE = "SV30";
    public static final String SCREENING_VACCINATION_SERVICE_CODE = "SV36";

	public static final String MED_CHART_ITEM_DEFAULT_VALUE = "-1";
	
	public static final String LOOKUP_TYPE_ROPR_ITEM_STATUS = "SU_PRIST";
	
    // Axo 21090
    public static final String PO_SHOW_MODE_MODIFY = "SMODY";
    public static final String PO_SHOW_MODE_APPROVE = "SAPRV";
    public static final String PO_SHOW_MODE_RECEIVE = "SRECV";
	
	//axo 21197
    public static final String EXAM_CODE_REQ_BLD_TYPE = "BRTR98";
    public static final String EXAM_CODE_REQ_RHESUS = "BRTR99";
    
    public static final String INVC_BED_LOC_CHANGE = "false";
    public static final String INVC_BED_LOC_DESC_LIST = "bedLocList";
    public static final String INVC_ITEM_TREAT_CLASS_CHANGE = "false";
    public static final String INVC_PRINT_BED_LOC = "bedLocName";
    
    public static final String MIMS_TABLE_CODE = "REG_MIMS";
    public static final String MENU_ID_400100203 = "400100203";
    public static final String MENU_ID_MIMS = "MIMS";
    
	//Axo 21250
    public static final String CTX_ALLOWED_LOC_LIST = "allowedFacList";
	   
	//monograph
	public static final String MONOGRAPH_XML = "//Result/Content/Product/Document/FULLMONO";
	public static final int MAX_DISPLAY_ITEM = 25;
	public static final String FULLMONO_TYPE = "F";
	
	// Operating theater checklist
	public static final String OPERATING_THEATRE_CHECK_LIST_PRE_OPERATIF = "CHK_LST_PRE";
	public static final String OPERATING_THEATRE_CHECK_LIST_INTRA_OPERATIF = "CHK_LST_INT";
	public static final String OPERATING_THEATRE_CHECK_LIST_POST_OPERATIF = "CHK_LST_POS";
	public static final String OPERATING_THEATRE_CHECK_LIST_KASA = "CHK_LST_KAS";
	public static final String OPERATING_THEATRE_CHECK_LIST_SAFETY = "CHK_LST_SAF";
	public static final String OPERATING_THEATRE_CHECK_LIST_TYPE = "checklistType";
	
	public static final String OT_CHECK_LIST = "checkList_";
	public static final String OT_CHECK_LIST_HEAD = "HEAD";
	public static final String OT_CHECK_LIST_GROUP = "GROUP";
	public static final String OT_CHECK_LIST_ITEM = "ITEM";
	public static final String OT_CHECK_LIST_TYPE = "checkListType_";
	public static final String OT_CHECK_LIST_TEXTAREA = "TEXTAREA";
	public static final String OT_CHECK_LIST_TEXTAREA_TYPE = "txtArea_";
	public static final String OT_CHECK_LIST_CHECK = "CHECK";
	public static final String OT_CHECK_LIST_CHECK_TYPE = "checkBox_";
	public static final String OT_CHECK_LIST_CHECK_VALUES_TYPE = "checkBoxVal_";
	public static final String OT_CHECK_LIST_CHECK_TEXAREA = "CHECK_TEXTAREA";	
	public static final String OT_CHECK_LIST_BREAK = "BREAK";
	public static final String OT_CHECK_LIST_NOT_BREAK = "NOT_BREAK";
	public static final String OT_CHECK_LIST_PARENT = "parent_";

	//TD-LOG-001
	public static final String CTX_PROCUREMENT_LIST = "procurementList";
	public static final String LOOKUP_TYPE_PROCUREMENT = "PROCUREMENT";
	public static final String STORE_TRANSFER_ACQUIT_ROLE = "ST_ACT";
	
	//TD-KAS-002
	public static final String CTX_CASHIER_LOC_LIST = "cashierLocList";
	public static final String LOOKUP_TYPE_CASHIER_LOC = "CSR_LOC";
	
	//Aldrete Score
	public static final String LOOKUP_TYPE_ALDR_SCR = "ALDR_SCR";
	public static final String CTX_RESPIRATION_SCORE_LIST = "respirationScoreList";
	public static final String CTX_CIRCULATION_SCORE_LIST = "circulationScoreList";
	public static final String CTX_ACTIVITY_SCORE_LIST = "activityScoreList";
	public static final String CTX_CONSCIOUSNESS_SCORE_LIST = "consciousnessScoreList";
	public static final String CTX_COLOR_SCORE_LIST = "colorScoreList";
	
	/* SD-OUT-001 Nurse Name */
	public static final String STAFF_LITERAL = "staff";
	public static final String MED_TRANSCRIBER_LITERAL = "medTranscriber";
	public static final String NURSE_LITERAL = "nurse";
	
	//TD-PHAR-001
	public static final String ERROR_BASE_PRICE_FLAG = "-1";
	public static final String CTX_CODE_G_LIST = "codeGList";
	public static final String LOOKUP_TYPE_CODE_G = "CODE_G";

    public static final String LOOKUP_TYPE_STAFF_LAB_ANALYST = "L";
    public static final String LOOKUP_TYPE_STAFF_MEDICAL_MANAGEMENT = "G";
    public static final String LOOKUP_TYPE_STAFF_PARAMEDIC = "M";
    public static final String LOOKUP_TYPE_STAFF_RADIOGRAPHER = "H";
    
    // Axosoft 19775
    public static final String CTX_IS_AUTHORIZED_MEDICAL_STAFF = "isMedicalStaff";
    
    //TD-NFR-001
    public static final String PRINT_PATIENT_CARD_REPORT_ID = "PDFREGPRINTPC";
    
    public static final String MEDICAL_CERTIFICATE_SICK_LEAVE = "SL";
    public static final String MEDICAL_CERTIFICATE_RES_DUTY = "RD";
    public static final String MEDICAL_CERTIFICATE_MED_ATTD = "MA";
    
    public static final String LOOKUP_INS_PROVIDER_NAME = "INS_PROV_NAME";
    public static final String LOOKUP_UNIT_OF_TEMP = "UN_TEMP";
    public static final String LOOKUP_UNIT_OF_HEI = "UN_HEI";
    public static final String LOOKUP_UNIT_OF_WEI = "UN_WEI";
    public static final String CTX_UNIT_OF_TEMP = "listUNTemp";
    public static final String CTX_UNIT_OF_HEI = "listUNHeight";
    public static final String CTX_UNIT_OF_WEI = "listUNWeight";
    
    //Admission status
    public static final String CTX_ADMISSION_STATUS = "admissionStatusList";
    public static final String LOOKUP_ADMISSION_STATUS = "ADMS_STS";
    public static final String ADMISSION_STATUS_WAITING = "WT";
    public static final String ADMISSION_STATUS_ADMIT = "AD";
    public static final String ADMISSION_STATUS_TB_DIS = "TBD";
    public static final String ADMISSION_STATUS_DIS = "DIS";
    public static final String ADMISSION_STATUS_RUN = "RUN";
    
    //view type
    public static final String SCHEDULE_VIEW_TYPE_LIST = "LIST";
    public static final String SCHEDULE_VIEW_TYPE_BLOCK = "BLOCK";
    
    //Schedule Reports
    public static final String SCHEDULE_REPORT_AE_DGS = "RPT_CORE_SCH01";
    public static final String SCHEDULE_REPORT_OUT = "RPT_CORE_SCH02";
    public static final String SCHEDULE_REPORT_INP_LIST = "RPT_CORE_SCH03_L";
    public static final String SCHEDULE_REPORT_INP_BLOCK = "RPT_CORE_SCH03_B";
    
    public static final String STAFF_ADDR_FIELD_TABLE_CODE = "STAFF_ADDR_FIELD";
		
    public static final String REFERRAL_IN_FACILITY = "RFI";
    public static final String REFERRAL_OUT_FACILITY = "RFO";
    public static final String CTX_REF_FAC_TYPE_LIST = "listRefType";
    public static final String LOOKUP_TYPE_REF_FAC_TYPE = "REF_FAC";
    public static final String REFERRAL_IS_REF_DOC_EXIST = "isRefDocExist";
    public static final String CTX_OUT_REF_DOCUMENT_DATA = "refDocument";
    public static final String LOOKUP_CODE_PHYSIO_TYPE = "PHY_TYPE";
    public static final String CTX_PHYSIO_TYPE_LIST = "physioTypeList";
    
    public static final String CTX_MILK_LIST = "milkList";
	public static final String LOOKUP_TYPE_MILK = "MILK";
    
    public static final String SURG_TYPE_CARDIAC = "SGT01";
    public static final String SURG_TYPE_OBSTETRIC = "SGT07";
    public static final String LOOKUP_TYPE_SURG_NAME = "MR_SGN";
    public static final String SURG_NAME_LIST = "surgNameList";
    public static final String CTX_MAP_SURG_DIAGSUPP_REQ = "surgDiagSuppReqList";
    public static final String LOOKUP_SURG_TYPE_CITO = "SGT1";
    public static final String LOOKUP_SURG_TYPE_ELECTIVE = "SGT2";
    public static final String LOOKUP_SURG_TYPE_DAYSURG = "SGT3";
    public static final String LOOKUP_ANEST_TYPE = "MR_SAT";
    public static final String CTX_ANEST_TYPE = "anestTypeList";
    public static final String CTX_SURG_DIAG_SUPP_REC = "surgDiagSuppList";
    public static final String CTX_SURG_PRE_MED_REC = "surgPreMedList";
    public static final String CTX_SURG_ANEST_AGENT_REC = "surgAnestAgentList";
    public static final String CTX_SURG_FLUID_SUMM_REC = "surgFluidSumList";
    public static final String OT_VITSIGN_FLOWSHEET_ID = "PDFOTVSFLW";

    public static final String RPT_OT_REF_LETTER = "REF_LETTER_OT";
}
