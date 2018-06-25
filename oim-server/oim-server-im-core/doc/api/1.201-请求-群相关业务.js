/*************************************************************/
/**
 * 接口名称：获取群分组列表（仅分组信息）<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0001"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：获取群列表<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0002"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：获取群分组成员（群和群分组关系）<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0003"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：获取群分组、群列表、群列表成员<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0004"
 */
var request = {
	"head" : {
		"key" : "94e702f1-dc28-4b6c-9f8f-70a1dedcfec4",
		"name" : "",
		"action" : "1.201",
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
		"key" : "94e702f1-dc28-4b6c-9f8f-70a1dedcfec4",
		"name" : "",
		"action" : "1.201",
		"method" : "1.1.0004",
		"version" : "1",
		"time" : 1524288842164
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"groupCategoryList" : [ {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"rank" : 0,
			"sort" : 2,
			"name" : "001",
			"id" : "1102b276-fdf3-4243-ac07-5ab81b736d07"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"rank" : 0,
			"sort" : 1,
			"name" : "我的聊天群",
			"id" : "f7ead2ae-9fdf-4877-ab30-409149864c46"
		} ],
		"groupList" : [ {
			"number" : 10000,
			"name" : "简单的",
			"head" : "1",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "",
			"introduce" : "",
			"position" : "",
			"createTime" : "2017-08-17 11:25:40",
			"id" : "3655d19f-ff85-45bf-bcec-97bdacb6be5e"
		}, {
			"number" : 10003,
			"name" : "团体",
			"head" : "2",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "",
			"introduce" : "",
			"position" : "",
			"createTime" : "2018-01-10 11:04:20",
			"id" : "6933301d-fac0-4aa6-a602-b9dfb375ae77"
		}, {
			"number" : 10002,
			"name" : "超级猛",
			"head" : "2",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "",
			"introduce" : "",
			"position" : "",
			"createTime" : "2018-01-09 00:03:35",
			"id" : "ab9c584b-5786-4dbd-ada5-9a6e5f426e71"
		}, {
			"number" : 10001,
			"name" : "2323",
			"head" : "1",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "2323",
			"introduce" : "2323",
			"position" : "",
			"createTime" : "2017-11-08 22:44:25",
			"id" : "c91f7bbf-5925-4bd8-9461-00eb7441da97"
		} ],
		"groupCategoryMemberList" : [ {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"groupCategoryId" : "f7ead2ae-9fdf-4877-ab30-409149864c46",
			"groupId" : "3655d19f-ff85-45bf-bcec-97bdacb6be5e",
			"remark" : "",
			"id" : "2ae46d57-248c-449f-922c-e59997bae4cb"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"groupCategoryId" : "f7ead2ae-9fdf-4877-ab30-409149864c46",
			"groupId" : "c91f7bbf-5925-4bd8-9461-00eb7441da97",
			"remark" : "",
			"id" : "c5beefd9-12ea-41eb-9742-b000d3be76cd"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"groupCategoryId" : "1102b276-fdf3-4243-ac07-5ab81b736d07",
			"groupId" : "6933301d-fac0-4aa6-a602-b9dfb375ae77",
			"remark" : "",
			"id" : "cb461333-337d-43f6-a002-29e791ba5312"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"groupCategoryId" : "f7ead2ae-9fdf-4877-ab30-409149864c46",
			"groupId" : "ab9c584b-5786-4dbd-ada5-9a6e5f426e71",
			"remark" : "",
			"id" : "ef0c0f87-d040-465a-a2e8-eb04347e0d7d"
		} ]
	}
};



/*************************************************************/
/**
 * 接口名称：获取群信息<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0005"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：条件查询群<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0006"
 */
var request = {
	"head" : {
		"key" : "8013d0f8-05ce-4b10-96f7-b05ea5f245c0",
		"name" : "",
		"action" : "1.201",
		"method" : "1.1.0006",
		"version" : "1",
		"time" : 1524579241273
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
		"key" : "8013d0f8-05ce-4b10-96f7-b05ea5f245c0",
		"name" : "",
		"action" : "1.201",
		"method" : "1.1.0006",
		"version" : "1",
		"time" : 1524579243589
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"groupList" : [ {
			"number" : 10006,
			"name" : "ttttt",
			"head" : "1",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "",
			"introduce" : "",
			"position" : "",
			"createTime" : "2018-03-07 13:56:57",
			"id" : "104efac1-f112-4935-bada-e2684ec68d3d"
		}, {
			"number" : 10005,
			"name" : "hahahahahahahahaha",
			"head" : "2",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "",
			"introduce" : "",
			"position" : "",
			"createTime" : "2018-03-03 14:51:56",
			"id" : "158b85a9-68d4-4b92-945f-8b4007f2861f"
		}, {
			"number" : 10000,
			"name" : "简单的",
			"head" : "1",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "",
			"introduce" : "",
			"position" : "",
			"createTime" : "2017-08-17 11:25:40",
			"id" : "3655d19f-ff85-45bf-bcec-97bdacb6be5e"
		}, {
			"number" : 10004,
			"name" : "测试群",
			"head" : "1",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "1111",
			"introduce" : "1111",
			"position" : "",
			"createTime" : "2018-02-07 18:49:55",
			"id" : "5a19af61-9b10-4f37-86bd-454d43d66744"
		}, {
			"number" : 10003,
			"name" : "团体",
			"head" : "2",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "",
			"introduce" : "",
			"position" : "",
			"createTime" : "2018-01-10 11:04:20",
			"id" : "6933301d-fac0-4aa6-a602-b9dfb375ae77"
		}, {
			"number" : 10002,
			"name" : "超级猛",
			"head" : "2",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "",
			"introduce" : "",
			"position" : "",
			"createTime" : "2018-01-09 00:03:35",
			"id" : "ab9c584b-5786-4dbd-ada5-9a6e5f426e71"
		}, {
			"number" : 10001,
			"name" : "2323",
			"head" : "1",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "2323",
			"introduce" : "2323",
			"position" : "",
			"createTime" : "2017-11-08 22:44:25",
			"id" : "c91f7bbf-5925-4bd8-9461-00eb7441da97"
		}, {
			"number" : 10008,
			"name" : "111",
			"head" : "1",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "",
			"introduce" : "",
			"position" : "",
			"createTime" : "2018-03-15 08:59:32",
			"id" : "dfa8ea49-a81f-4200-ae87-6600892c9ed5"
		}, {
			"number" : 10009,
			"name" : "ceshi",
			"head" : "3",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "",
			"introduce" : "",
			"position" : "",
			"createTime" : "2018-04-16 12:26:29",
			"id" : "ed90334e-b3d3-475e-a0d1-c707e0e31a11"
		}, {
			"number" : 10007,
			"name" : "4",
			"head" : "1",
			"remark" : "",
			"classification" : "",
			"publicNotice" : "4",
			"introduce" : "4",
			"position" : "",
			"createTime" : "2018-03-07 14:01:08",
			"id" : "f899d8e6-803c-493b-b1e6-fa9d2a17499d"
		} ],
		"page" : {
			"pageSize" : 16,
			"totalCount" : 10,
			"pageNumber" : 1,
			"totalPage" : 1
		},
		"groupHeadList" : []
	}
};



/*************************************************************/
/**
 * 接口名称：新增群<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0008"
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：修改群<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0009"
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：获取群成员列表<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0010"
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：<br>
 * 功能：
 * "action": "1.201"
 * "method": ""
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：修改群头像<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0011"
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：获取群成员关系列表<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0014"
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：获取群头像列表<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0013"
 */
var request = {
	"head" : {
		"key" : "49570889-39f5-49e4-8db4-88dd33f754ef",
		"name" : "",
		"action" : "1.201",
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
		"key" : "49570889-39f5-49e4-8db4-88dd33f754ef",
		"name" : "",
		"action" : "1.201",
		"method" : "1.1.0013",
		"version" : "1",
		"time" : 1524288842141
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"headList" : []
	}
};


/*************************************************************/
/**
 * 接口名称：获取群成员详细列表<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0015"
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：获取用户在各个群的权限<br>
 * 功能：
 * "action": "1.201"
 * "method": "1.1.0016"
 */
var request = {
	"head" : {
		"key" : "936e4e1a-8722-4459-9137-ec446a6c4d86",
		"name" : "",
		"action" : "1.201",
		"method" : "1.1.0016",
		"version" : "1",
		"time" : 1524288841001
	},
	"body" : {}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "936e4e1a-8722-4459-9137-ec446a6c4d86",
		"name" : "",
		"action" : "1.201",
		"method" : "1.1.0016",
		"version" : "1",
		"time" : 1524288842145
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"groupMemberList" : [ {
			"groupId" : "ab9c584b-5786-4dbd-ada5-9a6e5f426e71",
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"position" : "3",
			"id" : "589dff82-486e-4326-bcac-be295d9cc5da"
		}, {
			"groupId" : "6933301d-fac0-4aa6-a602-b9dfb375ae77",
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"position" : "3",
			"id" : "7b54fae2-19cf-4644-8d1e-67ff99d3ac2c"
		}, {
			"groupId" : "c91f7bbf-5925-4bd8-9461-00eb7441da97",
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"position" : "3",
			"id" : "9b409663-aa40-432e-b4ed-f48922f229fc"
		}, {
			"groupId" : "3655d19f-ff85-45bf-bcec-97bdacb6be5e",
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"position" : "3",
			"id" : "bd1f58bf-0d9f-4ee7-af7e-d4ec73a0c171"
		} ]
	}
};