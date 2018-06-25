/*************************************************************/
/**
 * 接口名称：发送群聊信息<br>
 * 功能：
 * "action": "1.500"
 * "method": "1.1.2001"
 */
var request = {
	"head" : {
		"key" : "f2d158e9-4d02-43e3-9591-2a719d0972ae",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.2001",
		"version" : "1",
		"time" : 1524579652672
	},
	"body" : {
		"groupId" : "ab9c584b-5786-4dbd-ada5-9a6e5f426e71",
		"userId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
		"content" : {
			"font" : {
				"underline" : false,
				"bold" : false,
				"italic" : false,
				"color" : "000000",
				"name" : "Microsoft YaHei",
				"size" : 14
			},
			"sections" : [ {
				"items" : [ {
					"type" : "text",
					"value" : "哈哈哈哈，这是群聊呢。"
				} ]
			} ],
			"timestamp" : 1524579652672
		}
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "f2d158e9-4d02-43e3-9591-2a719d0972ae",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.2001",
		"version" : "1",
		"time" : 1524579654935
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
 * 接口名称：获取群聊记录<br>
 * 功能：
 * "action": ""
 * "method": "1.1.2004"
 */
var request = {
	"head" : {
		"key" : "c776a422-8f65-49d8-b078-a7fcb8bf570a",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.2004",
		"version" : "1",
		"time" : 1524579766594
	},
	"body" : {
		"groupId" : "ab9c584b-5786-4dbd-ada5-9a6e5f426e71",
		"chatQuery" : {},
		"page" : {
			"pageSize" : 30,
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
		"key" : "c776a422-8f65-49d8-b078-a7fcb8bf570a",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.2004",
		"version" : "1",
		"time" : 1524579768780
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"contents" : [ {
			"userData" : {
				"id" : "6a872a5f-2735-4a9e-bf1c-a6605959db9e",
				"number" : 0,
				"head" : "4",
				"nickname" : "aa",
				"accountType" : 0
			},
			"content" : {
				"font" : {
					"underline" : false,
					"bold" : false,
					"italic" : false,
					"color" : "000000",
					"name" : "微软雅黑",
					"size" : 12
				},
				"sections" : [ {
					"items" : [ {
						"type" : "face",
						"value" : "classical,61"
					} ]
				} ],
				"timestamp" : 1524568390195
			}
		}, {
			"userData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"content" : {
				"font" : {
					"underline" : false,
					"bold" : false,
					"italic" : false,
					"color" : "000000",
					"name" : "微软雅黑",
					"size" : 12
				},
				"sections" : [ {
					"items" : [ {
						"type" : "text",
						"value" : "哈哈哈哈，这是群聊呢。"
					} ]
				} ],
				"timestamp" : 1524579654933
			}
		} ],
		"groupId" : "ab9c584b-5786-4dbd-ada5-9a6e5f426e71",
		"page" : {
			"pageNumber" : 1,
			"totalPage" : 1
		}
	}
};