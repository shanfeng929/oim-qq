
/*************************************************************/
/**
 * 接口名称：获取最近聊天列表（含对象id和类型）<br>
 * 功能：此接口获取的最近列表只包含最近聊天对象的类型（用户或者群等）和聊天对象的id<br>
 * "action": "1.500"
 * "method": "1.1.0001"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：获取最近聊天列表（含对象信息）<br>
 * 功能：此接口获取的最近聊天列表含聊天对象的详细信息。
 * "action": ""
 * "method": "1.1.0002"
 */
var request = {
	"head" : {
		"key" : "abfaa725-6606-4d1d-ba58-abeb6a63ff5c",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.0002",
		"version" : "1",
		"time" : 1524288841003
	},
	"body" : {
		"count" : 20,
		"userId" : ""
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "abfaa725-6606-4d1d-ba58-abeb6a63ff5c",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.0002",
		"version" : "1",
		"time" : 1524288842131
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"lastChatList" : [ {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"messageId" : "da7865b9-0099-41ad-aeab-f9d71f6a8efc",
			"contentId" : "21ca4e67-a8e6-4a98-8089-b012484e89a0",
			"chatId" : "4fcfa1a0-4eef-413c-b30a-28a809a621d0",
			"type" : "1",
			"time" : "2018-04-17 16:58:39",
			"timestamp" : 1523955519186,
			"id" : "87d01427-d628-4deb-8a00-4a92bfa62fa8"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"messageId" : "4e7db74d-b0aa-4255-858e-56fdcd3e2637",
			"contentId" : "bba6a889-469e-4a7d-8cd2-2aa3afe42b5b",
			"chatId" : "82142267-23db-4498-a1f8-f0e60dcd01f7",
			"type" : "1",
			"time" : "2018-04-17 15:16:23",
			"timestamp" : 1523949382757,
			"id" : "c7d83c31-af6a-4fc7-b83c-61ad9cb8da98"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"messageId" : "28e16e88-6638-4f13-bc6a-49b56fb7a0be",
			"contentId" : "a586302c-d55b-4e90-8c9a-df7e79ee8d70",
			"chatId" : "fc89d29c-ff3c-40e3-b58e-c4c0d218b3e4",
			"type" : "1",
			"time" : "2018-04-17 14:47:39",
			"timestamp" : 1523947659123,
			"id" : "0f2eb4a6-e885-4555-821d-0d7fa9105e09"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"messageId" : "f4b657b2-fed9-4679-8816-c6e6a95472b7",
			"contentId" : "4d8f6f3b-0c5d-4f48-9e72-7ca007af9aa4",
			"chatId" : "02d54705-b9de-465d-9226-935d9f2df38a",
			"type" : "1",
			"time" : "2018-04-17 14:19:56",
			"timestamp" : 1523945995717,
			"id" : "76da1885-501a-4856-87e7-d43ec5eacbbf"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"messageId" : "bfe111dd-9496-482a-9c04-e34265a39ab3",
			"contentId" : "c914968c-1f4b-4c0c-af2f-93658c920a20",
			"chatId" : "be935c04-f4ed-4e55-a011-4a41870922ae",
			"type" : "1",
			"time" : "2018-04-14 13:53:47",
			"timestamp" : 1523685227226,
			"id" : "0454d9e3-1dc8-42c5-93bd-8976ab35f08e"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"messageId" : "d0869095-b1d7-4671-9d53-faf9862d9643",
			"contentId" : "d0869095-b1d7-4671-9d53-faf9862d9643",
			"chatId" : "3655d19f-ff85-45bf-bcec-97bdacb6be5e",
			"type" : "2",
			"time" : "2018-04-14 13:42:13",
			"timestamp" : 1523684533172,
			"id" : "e6d9b143-9824-47ee-8ebb-eb0400439b6c"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"messageId" : "6dc96410-4c2b-4232-9949-25b3cb168176",
			"contentId" : "6dc96410-4c2b-4232-9949-25b3cb168176",
			"chatId" : "6933301d-fac0-4aa6-a602-b9dfb375ae77",
			"type" : "2",
			"time" : "2018-04-04 11:07:41",
			"timestamp" : 1522811260953,
			"id" : "faaeb7e1-1972-47b9-acc2-5bf7f279463d"
		}, {
			"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
			"messageId" : "8460e70b-5f92-4e95-a1dd-e453f4bca513",
			"contentId" : "8460e70b-5f92-4e95-a1dd-e453f4bca513",
			"chatId" : "c91f7bbf-5925-4bd8-9461-00eb7441da97",
			"type" : "2",
			"time" : "2018-02-01 16:15:52",
			"timestamp" : 1517472951527,
			"id" : "4d566787-4ab7-4371-ac51-b3cba5409dbf"
		} ],
		"count" : 20,
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
			"accountType" : 0
		}, {
			"id" : "4fcfa1a0-4eef-413c-b30a-28a809a621d0",
			"number" : 10035,
			"account" : "10035",
			"email" : "",
			"mobile" : "",
			"createTime" : "2018-01-09 00:00:24",
			"signature" : "",
			"head" : "1",
			"nickname" : "粗大萌妹",
			"gender" : "3",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
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
			"accountType" : 0
		}, {
			"id" : "be935c04-f4ed-4e55-a011-4a41870922ae",
			"number" : 10003,
			"account" : "10003",
			"email" : "",
			"mobile" : "",
			"createTime" : "2017-07-04 11:25:42",
			"signature" : "",
			"head" : "16",
			"nickname" : "hello",
			"gender" : "3",
			"birthdate" : "2006-07-13 00:00:00",
			"homeAddress" : "",
			"locationAddress" : "",
			"introduce" : "",
			"blood" : "other",
			"accountType" : 0
		}, {
			"id" : "fc89d29c-ff3c-40e3-b58e-c4c0d218b3e4",
			"number" : 10038,
			"account" : "10038",
			"email" : "",
			"mobile" : "13677773433",
			"createTime" : "2018-01-10 11:00:47",
			"signature" : "",
			"head" : "3",
			"nickname" : "kaka",
			"gender" : "3",
			"birthdate" : "1991-01-16 00:00:00",
			"homeAddress" : "杭州",
			"locationAddress" : "杭州",
			"introduce" : "",
			"blood" : "other",
			"accountType" : 0
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
		"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32"
	}
};



/*************************************************************/
/**
 * 接口名称：获取最近聊天列表（含最后聊天内容）<br>
 * 功能：此接口包含聊天对象详细信息和聊天内容
 * "action": "1.500"
 * "method": "1.1.0003"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：删除聊天记录<br>
 * 功能：
 * "action": "1.500"
 * "method": "1.1.0004"
 */
var request = "";

var response = "";