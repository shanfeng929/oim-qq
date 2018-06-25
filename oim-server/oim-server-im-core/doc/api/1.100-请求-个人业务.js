/*************************************************************
 *个人业务                                                                                                                                          *
 * ***********************************************************/


/*************************************************************/
/**
 * 接口名称：用户注册<br>
 * 功能：
 * "action": "1.100"
 * "method": "1.1.0000"
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：登录<br>
 * 功能：
 * "action": "1.100"
 * "method": "1.1.0001"
 */
var request = {
	"head" : {
		"key" : "5adcb58e-c8d4-4b51-9b0a-d7ffaab632fe",
		"name" : "",
		"action" : "1.100",
		"method" : "1.1.0001",
		"version" : "1",
		"time" : 1524288840748
	},
	"body" : {
		"loginData" : {
			"account" : "10000",
			"password" : "e10adc3949ba59abbe56e057f20f883e",
			"status" : "1"
		}
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "5adcb58e-c8d4-4b51-9b0a-d7ffaab632fe",
		"name" : "",
		"action" : "1.100",
		"method" : "1.1.0001",
		"version" : "1",
		"time" : 1524288841925
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"userData" : {
			"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"number" : 10000,
			"account" : "10000",
			"email" : "",
			"mobile" : "",
			"createTime" : "2017-06-08 18:14:22",
			"signature" : "",
			"head" : "7",
			"nickname" : "会说话的猫",
			"gender" : "1",
			"birthdate" : "2007-05-31 00:00:00",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "A",
			"accountType" : 0
		},
		"userHead" : {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"headId" : "62969af2-d2af-4169-a658-ad446d8689df",
			"fileName" : "62969af2-d2af-4169-a658-ad446d8689df.png",
			"type" : "2",
			"createTime" : "2018-01-31 18:17:36",
			"id" : "9e6b580e-8cb2-4c56-a9a6-acca0242296e"
		}
	}
};


/*************************************************************/
/**
 * 接口名称：获取个人信息<br>
 * 功能：
 * "action": "1.100"
 * "method": "1.1.0003"
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：修改个人信息<br>
 * 功能：
 * "action": "1.100"
 * "method": "1.1.0004"
 */
var request = {
	"head" : {
		"key" : "45fb6b62-0655-47ff-8af3-f261fd35a189",
		"name" : "",
		"action" : "1.100",
		"method" : "1.1.0004",
		"version" : "1",
		"time" : 1524579827123
	},
	"body" : {
		"userData" : {
			"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"number" : 0,
			"email" : "",
			"mobile" : "",
			"signature" : "",
			"nickname" : "会说话的猫",
			"gender" : "1",
			"birthdate" : "2007-05-31 00:00:00",
			"homeAddress" : "中国",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "A",
			"accountType" : 0
		}
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "45fb6b62-0655-47ff-8af3-f261fd35a189",
		"name" : "",
		"action" : "1.100",
		"method" : "1.1.0004",
		"version" : "1",
		"time" : 1524579829417
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {}
};



/*************************************************************/
/**
 * 接口名称：修改密码<br>
 * 功能：
 * "action": "1.100"
 * "method": "1.1.0005"
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：修改头像<br>
 * 功能：
 * "action": "1.100"
 * "method": "1.1.0006"
 */
var request = "";

var response = "";