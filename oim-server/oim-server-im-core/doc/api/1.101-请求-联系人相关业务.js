/*************************************************************
 *联系人的相关业务                                                                                                                           *
 * ***********************************************************/


/*************************************************************/
/**
 * 接口名称：获取联系人分组列表<br>
 * 功能：只含分组信息
 * "action": "1.101"
 * "method": "1.1.0001"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：获取联系人列表<br>
 * 功能：
 * "action": "1.101"
 * "method": "1.1.0002"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：获取联系人分组成员信息<br>
 * 功能：不包含联系人详情
 * "action": "1.101"
 * "method": "1.1.0003"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：获取联系人列表、联系人分组列表、联系人分组成员信息<br>
 * 功能：
 * "action": "1.101"
 * "method": "1.1.0004"
 */
var request = {
	"head" : {
		"key" : "b051a9e1-1442-452a-83eb-11f7fc009a20",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0004",
		"version" : "1",
		"time" : 1524288841001
	},
	"body" : {}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "b051a9e1-1442-452a-83eb-11f7fc009a20",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0004",
		"version" : "1",
		"time" : 1524288842165
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"userCategoryMemberList" : [ {
			"ownUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"userCategoryId" : "8855b8b0-22d2-47de-814a-9ea406fe257a",
			"memberUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
			"remark" : "",
			"id" : "5555de79-f1b0-4db9-a552-1d3e90be2f15"
		}, {
			"ownUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"userCategoryId" : "92445392-effd-4390-b081-55b5b9975c35",
			"memberUserId" : "82142267-23db-4498-a1f8-f0e60dcd01f7",
			"remark" : "",
			"id" : "d6b11bd5-54cd-4a31-98b5-6e085e904d85"
		} ],
		"userCategoryList" : [ {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"rank" : 0,
			"sort" : 2,
			"name" : "003",
			"id" : "0ac1fdf2-dfb5-4613-bee9-12aab7c32961"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"rank" : 0,
			"sort" : 2,
			"name" : "002",
			"id" : "32ef980f-001b-4c02-a27a-003626dda07d"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"rank" : 0,
			"sort" : 2,
			"name" : "001",
			"id" : "728479a8-e542-4b5f-ac6c-2d98aece3c8d"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"rank" : 0,
			"sort" : 1,
			"name" : "我的好友",
			"id" : "8855b8b0-22d2-47de-814a-9ea406fe257a"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"rank" : 0,
			"sort" : 2,
			"name" : "new",
			"id" : "92445392-effd-4390-b081-55b5b9975c35"
		} ],
		"userDataList" : [ {
			"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
			"number" : 10002,
			"account" : "10002",
			"email" : "",
			"mobile" : "",
			"createTime" : "2017-06-08 18:23:52",
			"signature" : "见过高手吗？",
			"head" : "4",
			"nickname" : "纨绔高手",
			"gender" : "2",
			"birthdate" : "2006-06-02 00:00:00",
			"homeAddress" : "不知道呀是，你猜猜猜看呢",
			"locationAddress" : "",
			"introduce" : "哈哈哈",
			"blood" : "A",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "82142267-23db-4498-a1f8-f0e60dcd01f7",
			"number" : 10001,
			"account" : "10001",
			"email" : "",
			"mobile" : "",
			"createTime" : "2017-06-08 18:22:51",
			"signature" : "fgfgfg",
			"head" : "10",
			"nickname" : "BB开",
			"gender" : "2",
			"birthdate" : "2011-06-03 00:00:00",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "好久没来了",
			"blood" : "O",
			"status" : "7",
			"accountType" : 0
		} ]
	}
};



/*************************************************************/
/**
 * 接口名称：获取联系人详情<br>
 * 功能：
 * "action": "1.101"
 * "method": "1.1.0005"
 */
var request = {
	"head" : {
		"key" : "a4ef08a8-3a1d-4769-b982-61d2dec85d1b",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0005",
		"version" : "1",
		"time" : 1524579827478
	},
	"body" : {
		"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32"
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "a4ef08a8-3a1d-4769-b982-61d2dec85d1b",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0005",
		"version" : "1",
		"time" : 1524579829803
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
			"homeAddress" : "中国",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "A",
			"status" : "1",
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
 * 接口名称：条件查询用户<br>
 * 功能：
 * "action": "1.101"
 * "method": "1.1.0006"
 */
var request = {
	"head" : {
		"key" : "6eb21a02-1604-458c-807b-85c2ebc74c9f",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0006",
		"version" : "1",
		"time" : 1524579208677
	},
	"body" : {
		"page" : {
			"pageSize" : 16,
			"totalCount" : 0,
			"pageNumber" : 1,
			"totalPage" : 0
		}
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "6eb21a02-1604-458c-807b-85c2ebc74c9f",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0006",
		"version" : "1",
		"time" : 1524579210983
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"userDataList" : [ {
			"id" : "004c10a1-3e04-4f94-87a6-0b1d2c536f11",
			"number" : 10111,
			"account" : "10111",
			"email" : "",
			"mobile" : "",
			"createTime" : "2018-03-22 11:34:24",
			"signature" : "",
			"head" : "18",
			"nickname" : "sad",
			"gender" : "1",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
			"number" : 10002,
			"account" : "10002",
			"email" : "",
			"mobile" : "",
			"createTime" : "2017-06-08 18:23:52",
			"signature" : "见过高手吗？",
			"head" : "4",
			"nickname" : "纨绔高手",
			"gender" : "2",
			"birthdate" : "2006-06-02 00:00:00",
			"homeAddress" : "不知道呀是，你猜猜猜看呢",
			"locationAddress" : "",
			"introduce" : "哈哈哈",
			"blood" : "A",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "034e7b80-16fe-48cc-929f-64e4d5d3ec04",
			"number" : 10134,
			"account" : "10134",
			"email" : "980299466@qq.com",
			"mobile" : "18716022536",
			"createTime" : "2018-04-13 10:16:16",
			"signature" : "",
			"head" : "1",
			"nickname" : "zhao",
			"gender" : "1",
			"birthdate" : "1996-02-15 00:00:00",
			"homeAddress" : "山西",
			"locationAddress" : "北京",
			"introduce" : "",
			"blood" : "",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "03a3998e-20c6-4b5b-9d6f-982f381697d6",
			"number" : 10093,
			"account" : "10093",
			"email" : "",
			"mobile" : "",
			"createTime" : "2018-03-13 16:21:33",
			"signature" : "",
			"head" : "8",
			"nickname" : "111",
			"gender" : "3",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "061a92fc-f3e5-4bba-aa15-d1be6a64692d",
			"number" : 10050,
			"account" : "10050",
			"email" : "15002458016@163.com",
			"mobile" : "15222222222",
			"createTime" : "2018-02-08 09:17:47",
			"signature" : "天才~",
			"head" : "3",
			"nickname" : "hxl",
			"gender" : "3",
			"birthdate" : "2018-02-08 00:00:00",
			"homeAddress" : "沈阳",
			"locationAddress" : "沈阳",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "082b626e-733a-4a9d-be4e-a238c1514027",
			"number" : 10088,
			"account" : "10088",
			"email" : "",
			"mobile" : "",
			"createTime" : "2018-03-07 13:47:26",
			"signature" : "",
			"head" : "15",
			"nickname" : "test",
			"gender" : "1",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "09e2b1fc-c313-4ccc-98ba-f5b46300efd2",
			"number" : 10015,
			"account" : "10015",
			"email" : "12312",
			"mobile" : "123123",
			"createTime" : "2017-09-16 17:25:57",
			"signature" : "3123123",
			"head" : "18",
			"nickname" : "123123",
			"gender" : "3",
			"birthdate" : "2017-09-05 00:00:00",
			"homeAddress" : "123123",
			"locationAddress" : "123123",
			"introduce" : "123123",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "0cab8a7d-9584-4973-9679-4d22abff00fc",
			"number" : 10023,
			"account" : "10023",
			"email" : "",
			"mobile" : "",
			"createTime" : "2017-11-17 23:30:25",
			"signature" : "",
			"head" : "17",
			"nickname" : "qq",
			"gender" : "3",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "0ddb5d8a-020b-4862-8a4d-9c248d56fa46",
			"number" : 10140,
			"account" : "10140",
			"email" : "",
			"mobile" : "",
			"createTime" : "2018-04-16 14:27:49",
			"signature" : "",
			"head" : "11",
			"nickname" : "哈哈",
			"gender" : "3",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "0e81538a-fbf0-4694-ab99-c3b6e8f459c3",
			"number" : 10132,
			"account" : "10132",
			"email" : "985399688@qq.com",
			"mobile" : "18600200888",
			"createTime" : "2018-04-10 18:56:01",
			"signature" : "8989\t",
			"head" : "5",
			"nickname" : "测试99",
			"gender" : "3",
			"birthdate" : "2018-04-10 00:00:00",
			"homeAddress" : "222",
			"locationAddress" : "222",
			"introduce" : "8888",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "0e834ad4-9ade-4a3f-950e-7ae2b2c7f13a",
			"number" : 10097,
			"account" : "10097",
			"email" : "2626@dddd.com",
			"mobile" : "121521",
			"createTime" : "2018-03-14 17:40:14",
			"signature" : "hjvj",
			"head" : "12",
			"nickname" : "try",
			"gender" : "3",
			"birthdate" : "1998-11-03 00:00:00",
			"homeAddress" : "61651",
			"locationAddress" : "21615",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "12ea9d85-3bba-4fd5-9bd0-26e0b650e2e0",
			"number" : 10067,
			"account" : "10067",
			"email" : "",
			"mobile" : "",
			"createTime" : "2018-03-01 15:44:56",
			"signature" : "",
			"head" : "20",
			"nickname" : "码云oim",
			"gender" : "3",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "146e4149-e8e1-4595-8b3e-de959bb3b46d",
			"number" : 10113,
			"account" : "10113",
			"email" : "",
			"mobile" : "",
			"createTime" : "2018-03-22 17:11:51",
			"signature" : "",
			"head" : "19",
			"nickname" : "xiaofang",
			"gender" : "2",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "159faa46-416b-441a-b319-814f6a501d12",
			"number" : 10045,
			"account" : "10045",
			"email" : "",
			"mobile" : "",
			"createTime" : "2018-02-05 16:11:18",
			"signature" : "",
			"head" : "18",
			"nickname" : "Dj",
			"gender" : "1",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "16744f9b-2287-4987-8098-c717cfabc867",
			"number" : 10128,
			"account" : "10128",
			"email" : "",
			"mobile" : "",
			"createTime" : "2018-04-02 21:40:38",
			"signature" : "",
			"head" : "9",
			"nickname" : "1124",
			"gender" : "3",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
			"status" : "7",
			"accountType" : 0
		}, {
			"id" : "16e37f68-4717-4d53-a66f-835c8bfc05c0",
			"number" : 10068,
			"account" : "10068",
			"email" : "11111111@qq.com",
			"mobile" : "11111111",
			"createTime" : "2018-03-01 21:01:53",
			"signature" : "111\t1\t\t\t\t",
			"head" : "12",
			"nickname" : "jim",
			"gender" : "1",
			"birthdate" : "1972-02-29 00:00:00",
			"homeAddress" : "宁波",
			"locationAddress" : "宁波",
			"introduce" : "1",
			"blood" : "B",
			"status" : "7",
			"accountType" : 0
		} ],
		"page" : {
			"pageSize" : 16,
			"totalCount" : 161,
			"pageNumber" : 1,
			"totalPage" : 11
		},
		"userHeadList" : [ {
			"userId" : "16744f9b-2287-4987-8098-c717cfabc867",
			"headId" : "c252bc08-2cbf-4855-90d5-1a316bdd1dfb",
			"fileName" : "c252bc08-2cbf-4855-90d5-1a316bdd1dfb.png",
			"type" : "2",
			"createTime" : "2018-04-05 19:56:26",
			"id" : "4a052643-0c99-488d-ba20-bde2d211bbfc"
		}, {
			"userId" : "02d54705-b9de-465d-9226-935d9f2df38a",
			"headId" : "5817a43a-b86b-4c93-93aa-9d0f20662029",
			"fileName" : "5817a43a-b86b-4c93-93aa-9d0f20662029.png",
			"type" : "2",
			"createTime" : "2018-03-14 10:37:14",
			"id" : "ea821a3e-f003-49ff-89cf-97ea4bcb8bbc"
		} ]
	}
};



/*************************************************************/
/**
 * 接口名称：发送状态改变<br>
 * 功能：当个人在线状态发生变化，向联系人发送状态改变
 * "action": "1.101"
 * "method": "1.1.0008"
 */
var request = {
	"head" : {
		"key" : "973f663f-8081-4e4e-af9b-630b5346029a",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0008",
		"version" : "1",
		"time" : 1524288841012
	},
	"body" : {
		"userId" : "",
		"status" : "1"
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "973f663f-8081-4e4e-af9b-630b5346029a",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0008",
		"version" : "1",
		"time" : 1524288842161
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
 * 接口名称：用户信息修改后发送给好友<br>
 * 功能：只发id
 * "action": "1.101"
 * "method": "1.1.0009"
 */
var request = {
	"head" : {
		"key" : "9701f9c8-543d-441d-a490-cf2951d42c37",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0009",
		"version" : "1",
		"time" : 1524579827291
	},
	"body" : {
		"userId" : ""
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "9701f9c8-543d-441d-a490-cf2951d42c37",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0009",
		"version" : "1",
		"time" : 1524579829602
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
 * 接口名称：用户信息修改后，发送给好友<br>
 * 功能：
 * "action": "1.101"
 * "method": "1.1.0010"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：获取好友状态<br>
 * 功能：
 * "action": "1.101"
 * "method": "1.1.0011"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：获取用户头像信息<br>
 * 功能：
 * "action": "1.101"
 * "method": "1.1.0012"
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：获取联系人头像列表<br>
 * 功能：
 * "action": "1.101"
 * "method": "1.1.0013"
 */
var request = {
	"head" : {
		"key" : "79c07395-25b9-4683-9f91-f91c04fc63c9",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0013",
		"version" : "1",
		"time" : 1524288841001
	},
	"body" : {
		"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32"
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "79c07395-25b9-4683-9f91-f91c04fc63c9",
		"name" : "",
		"action" : "1.101",
		"method" : "1.1.0013",
		"version" : "1",
		"time" : 1524288842137
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"headList" : [ {
			"userId" : "82142267-23db-4498-a1f8-f0e60dcd01f7",
			"headId" : "e74d46fc-0ad5-4842-a727-2b8c390cf5f8",
			"fileName" : "e74d46fc-0ad5-4842-a727-2b8c390cf5f8.png",
			"type" : "2",
			"createTime" : "2018-02-24 15:39:27",
			"id" : "384195d5-406e-4eff-b8ce-d3939f918e0b"
		}, {
			"userId" : "02d54705-b9de-465d-9226-935d9f2df38a",
			"headId" : "5817a43a-b86b-4c93-93aa-9d0f20662029",
			"fileName" : "5817a43a-b86b-4c93-93aa-9d0f20662029.png",
			"type" : "2",
			"createTime" : "2018-03-14 10:37:14",
			"id" : "ea821a3e-f003-49ff-89cf-97ea4bcb8bbc"
		} ]
	}
};