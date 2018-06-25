/*************************************************************
 *私聊接口                                                    *
 * ***********************************************************/


/*************************************************************/
/**
 * 接口名称：向用户发送私聊信息<br>
 * 功能：
 * "action": "1.500"
 * "method": "1.1.1001"
 */
var request = {
	"head" : {
		"key" : "58886ce4-85d4-4034-93ed-65c7189e92ed",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.1001",
		"version" : "1",
		"time" : 1524579537720
	},
	"body" : {
		"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
		"receiveUserId" : "82142267-23db-4498-a1f8-f0e60dcd01f7",
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
					"value" : "在的嘿嘿！"
				} ]
			} ],
			"timestamp" : 1524579537720
		}
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "58886ce4-85d4-4034-93ed-65c7189e92ed",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.1001",
		"version" : "1",
		"time" : 1524579539894
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
 * 接口名称：向用户发送抖动<br>
 * 功能：
 * "action": ""
 * "method": "1.1.1002"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：查询聊天历史<br>
 * 功能：
 * "action": ""
 * "method": "1.1.1004"
 */
var request = {
	"head" : {
		"key" : "95dd2f43-ef64-4d4b-8ca0-0148b80837dc",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.1004",
		"version" : "1",
		"time" : 1524579147089
	},
	"body" : {
		"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
		"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
		"chatQuery" : {},
		"page" : {
			"pageSize" : 50,
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
		"key" : "95dd2f43-ef64-4d4b-8ca0-0148b80837dc",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.1004",
		"version" : "1",
		"time" : 1524579149373
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
		"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
		"contents" : [ {
			"messageKey" : "28eaec80-b2a3-4be4-bd8f-89d796861baf",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "b3f27e04-4e6e-4474-a0f8-7f757ce3285d",
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
						"value" : "classical,53"
					} ]
				} ],
				"timestamp" : 1505725859893
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "f00a8906-7154-4f0f-8266-f26306a0fd6f",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "dad841b6-2351-4b1d-bde6-59893c3ace8b",
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
						"value" : "vbvb"
					} ]
				} ],
				"timestamp" : 1505725904894
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "7271867e-12d5-4464-8d8a-d37225e456e9",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "4c60bc1b-7a11-4853-95ce-b94a3d31d0a4",
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
						"value" : "dfdf"
					} ]
				} ],
				"timestamp" : 1505726268402
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "45655328-57c8-4256-aa79-9f04d6a3eff0",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "9d0431ed-52a1-4c01-895f-7851827f0867",
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
						"value" : "dfdf"
					} ]
				} ],
				"timestamp" : 1505726274217
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "949875f0-e9cf-4ecd-829b-4372fddd0243",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "2ba87f62-8e50-4da1-8588-b113726235aa",
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
						"value" : "classical,62"
					} ]
				} ],
				"timestamp" : 1505726604296
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "575b9876-9181-4d11-9def-978881e5e0bb",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "79e94fa0-ba09-4041-876b-1cc74bc1afa7",
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
						"value" : "ffff"
					} ]
				} ],
				"timestamp" : 1505729604028
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "a5eafbc4-9496-4b56-aae9-63e5dc6760a9",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "2684ea3e-132a-4158-87db-15678c6f3385",
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
						"value" : "fgfggf"
					} ]
				} ],
				"timestamp" : 1505737496309
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "df156c17-802e-45cf-9129-f5c4be63dca5",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "c091dfdc-78e5-43da-9060-88cf8da4ffd8",
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
						"value" : "gggg"
					} ]
				} ],
				"timestamp" : 1505737499719
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "3062b173-d20d-4512-80e2-230a2546171c",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "c895a314-11fb-4210-9893-b5070ecf6b01",
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
						"value" : "classical,40"
					} ]
				} ],
				"timestamp" : 1510287093229
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "85b56fa5-ad3e-4fc8-8b00-ab4dbf81d49a",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "e85df1b3-d50a-4ed6-99b2-4019e79b0bad",
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
						"value" : "i"
					} ]
				} ],
				"timestamp" : 1510287101051
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "25766f5b-b7b1-4e6c-8c24-d58752eefb42",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "aec65c64-0087-4354-a811-fc37c7680cba",
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
						"type" : "image",
						"value" : "{\"type\":\"1\",\"id\":\"fadf8604-10d6-4a79-ba66-8ffd3b21b049\",\"extension\":\"png\",\"name\":\"201711101603500367.png\",\"size\":0}"
					} ]
				} ],
				"timestamp" : 1510358641253
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "f11ea17c-8d8a-4abb-8bfb-94ec5fc33b4c",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "eab89bd0-7175-45d5-bc21-d7ba7412c3b2",
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
						"value" : "classical,46"
					} ]
				} ],
				"timestamp" : 1517406379765
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		}, {
			"messageKey" : "5c64b881-6307-4ff9-b36a-d56880dc2029",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "6e81c5d4-7b0b-4370-a9d0-a148e8113929",
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
						"value" : "h"
					} ]
				} ],
				"timestamp" : 1517406396371
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "e78c6dba-81c5-4ec9-ad74-539e6d6819f4",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "0a4c284c-9a6c-457f-9aea-3b4e3308d860",
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
						"value" : "h"
					} ]
				} ],
				"timestamp" : 1517406404774
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		}, {
			"messageKey" : "abea5729-4715-4200-8ef8-6624fd5f143e",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "78a97658-d313-443f-8951-f7ed48c967d0",
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
						"value" : "g"
					} ]
				} ],
				"timestamp" : 1517406459594
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		}, {
			"messageKey" : "b6b200ef-1123-4308-944b-7ab5f87a497b",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "34119000-c553-4179-877b-47ee401be5a8",
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
						"value" : "aa"
					} ]
				} ],
				"timestamp" : 1517709349403
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "43de3079-62d3-4929-8996-f7a7dc171a93",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "18b45270-7ca6-4b92-bf3a-e9b65bd3f205",
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
						"value" : "jjj"
					} ]
				} ],
				"timestamp" : 1520584746236
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "353af0a2-deb4-4925-b944-1b8035dce98c",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "66f6391b-7e99-42bf-a5e7-97a17f70acbf",
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
						"value" : "jjj"
					} ]
				} ],
				"timestamp" : 1520584750237
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "93961ee3-77f6-4e18-89a8-90a14e619370",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "f31928f0-1948-4a82-a4f8-fdef9df45ebd",
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
						"value" : "lll"
					} ]
				} ],
				"timestamp" : 1520585452490
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "6455430f-51d5-4357-be9a-1a25e3ca8de6",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "347739ce-2527-4a08-8940-15704dac28ea",
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
						"value" : "classical,8"
					} ]
				} ],
				"timestamp" : 1521163365972
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "b23641cb-0c20-4126-b943-455998389521",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "a5156c21-3915-45f2-9419-36655e9c237c",
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
						"value" : "classical,64"
					} ]
				} ],
				"timestamp" : 1521163376176
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		}, {
			"messageKey" : "57410c7c-81d9-40ed-b8d7-f29fb6751757",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "91d6f7d9-6977-4d14-8cd7-a96d63182f50",
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
						"value" : "classical,29"
					} ]
				} ],
				"timestamp" : 1523266050275
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "07cd1e70-1d07-4535-8dee-0d34ca132d91",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "c4999085-838a-4134-a740-9a93350bac4c",
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
						"value" : "测试网页版"
					} ]
				} ],
				"timestamp" : 1523692767627
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		}, {
			"messageKey" : "7861383a-98d9-4898-94d4-7f4178a176f3",
			"receiveUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			},
			"contentId" : "eb244c99-ff71-4062-bf0c-17f265f3cdbc",
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
						"value" : "可以试试图文。\n"
					} ]
				} ],
				"timestamp" : 1523692815844
			},
			"sendUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			}
		}, {
			"messageKey" : "bfebd79f-99e3-4801-8799-2bc1fa0e2266",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "528adec0-587e-4343-8d79-7615a83b36fc",
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
						"value" : "classical,30"
					} ]
				} ],
				"timestamp" : 1523692885270
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		}, {
			"messageKey" : "2be718b1-553e-4a89-b2dd-91ef9929e020",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "c0f621ef-ee15-4932-acb8-fba0f6791c88",
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
						"value" : "2\n"
					} ]
				} ],
				"timestamp" : 1523945989312
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		}, {
			"messageKey" : "02fd1198-122e-4cf6-b32d-c62e1a5e2dde",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "87c46ef6-71e3-4a47-93eb-3a1284f93ba4",
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
						"value" : "2\n"
					} ]
				} ],
				"timestamp" : 1523945989713
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		}, {
			"messageKey" : "249e92bc-bf4b-4356-8f18-e493572ae055",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "3953bfe3-3ac9-4e17-8382-cb2f0023bca8",
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
						"value" : "132\n"
					} ]
				} ],
				"timestamp" : 1523945991513
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		}, {
			"messageKey" : "12609078-50e4-40f2-81db-81746954593f",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "15c573f9-f664-4943-a4b5-65d90f869e06",
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
						"value" : "\n797"
					} ]
				} ],
				"timestamp" : 1523945992914
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		}, {
			"messageKey" : "f4b657b2-fed9-4679-8816-c6e6a95472b7",
			"receiveUserData" : {
				"id" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"number" : 0,
				"head" : "7",
				"nickname" : "会说话的猫",
				"accountType" : 0
			},
			"contentId" : "4d8f6f3b-0c5d-4f48-9e72-7ca007af9aa4",
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
						"value" : "1321\n31"
					} ]
				} ],
				"timestamp" : 1523945995515
			},
			"sendUserData" : {
				"id" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"number" : 0,
				"head" : "4",
				"nickname" : "纨绔高手",
				"accountType" : 0
			}
		} ],
		"page" : {
			"pageSize" : 50,
			"startResult" : 0,
			"endResult" : 50,
			"totalCount" : 96,
			"pageNumber" : 1,
			"totalPage" : 2,
			"resultList" : [ {
				"messageId" : "f4b657b2-fed9-4679-8816-c6e6a95472b7",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-17 14:19:56",
				"timestamp" : 1523945995515,
				"id" : "4d8f6f3b-0c5d-4f48-9e72-7ca007af9aa4"
			}, {
				"messageId" : "0218e9f8-1360-479d-8793-6d453348bf2a",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-17 14:19:55",
				"timestamp" : 1523945995115,
				"id" : "ccb3fd08-21b7-4171-8908-6000defb452b"
			}, {
				"messageId" : "192403c9-9c49-4036-b54e-111993ac675e",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-17 14:19:55",
				"timestamp" : 1523945994915,
				"id" : "e9ef7c26-1778-4b3c-b208-e7c1caf305b2"
			}, {
				"messageId" : "09f239bd-3ef2-402f-92fd-efd537d24eae",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-17 14:19:54",
				"timestamp" : 1523945993914,
				"id" : "9c3ca706-3f53-4ee4-9f37-583c2d22f73a"
			}, {
				"messageId" : "12609078-50e4-40f2-81db-81746954593f",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-17 14:19:53",
				"timestamp" : 1523945992914,
				"id" : "15c573f9-f664-4943-a4b5-65d90f869e06"
			}, {
				"messageId" : "5663e5f5-a85f-4228-a3ef-fb76475b6ca1",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-17 14:19:52",
				"timestamp" : 1523945992113,
				"id" : "6e3fbeb4-1d74-4ef6-8b48-784eefd3476e"
			}, {
				"messageId" : "249e92bc-bf4b-4356-8f18-e493572ae055",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-17 14:19:52",
				"timestamp" : 1523945991513,
				"id" : "3953bfe3-3ac9-4e17-8382-cb2f0023bca8"
			}, {
				"messageId" : "02fd1198-122e-4cf6-b32d-c62e1a5e2dde",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-17 14:19:50",
				"timestamp" : 1523945989713,
				"id" : "87c46ef6-71e3-4a47-93eb-3a1284f93ba4"
			}, {
				"messageId" : "2be718b1-553e-4a89-b2dd-91ef9929e020",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-17 14:19:49",
				"timestamp" : 1523945989312,
				"id" : "c0f621ef-ee15-4932-acb8-fba0f6791c88"
			}, {
				"messageId" : "e87d6d66-6c54-4dee-a0b5-a459b85d1aa4",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-16 15:09:42",
				"timestamp" : 1523862582416,
				"id" : "464769e8-b238-4298-bfb7-6b61e6667a21"
			}, {
				"messageId" : "6cdb7f28-613c-416f-b8b8-48d339d86d6f",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-16 15:09:19",
				"timestamp" : 1523862559008,
				"id" : "44335c20-fcca-49c5-b8e2-3c6981843dfa"
			}, {
				"messageId" : "bfebd79f-99e3-4801-8799-2bc1fa0e2266",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-14 16:01:25",
				"timestamp" : 1523692885270,
				"id" : "528adec0-587e-4343-8d79-7615a83b36fc"
			}, {
				"messageId" : "7861383a-98d9-4898-94d4-7f4178a176f3",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-14 16:00:16",
				"timestamp" : 1523692815844,
				"id" : "eb244c99-ff71-4062-bf0c-17f265f3cdbc"
			}, {
				"messageId" : "07cd1e70-1d07-4535-8dee-0d34ca132d91",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-14 15:59:28",
				"timestamp" : 1523692767627,
				"id" : "c4999085-838a-4134-a740-9a93350bac4c"
			}, {
				"messageId" : "57410c7c-81d9-40ed-b8d7-f29fb6751757",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-09 17:27:30",
				"timestamp" : 1523266050275,
				"id" : "91d6f7d9-6977-4d14-8cd7-a96d63182f50"
			}, {
				"messageId" : "384bd3d7-f0ee-49f8-94ce-618305f7ff04",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-04-09 17:27:21",
				"timestamp" : 1523266040676,
				"id" : "c3f04628-62df-4d28-9c3e-fd14ca1a2c51"
			}, {
				"messageId" : "2b9bbc43-5686-47b9-bf40-6b2014e98f98",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-03-19 23:04:13",
				"timestamp" : 1521471852825,
				"id" : "ec56ccff-6aea-46a5-a5a0-5e980500b1c6"
			}, {
				"messageId" : "b23641cb-0c20-4126-b943-455998389521",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-03-16 09:22:56",
				"timestamp" : 1521163376176,
				"id" : "a5156c21-3915-45f2-9419-36655e9c237c"
			}, {
				"messageId" : "6455430f-51d5-4357-be9a-1a25e3ca8de6",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-03-16 09:22:46",
				"timestamp" : 1521163365972,
				"id" : "347739ce-2527-4a08-8940-15704dac28ea"
			}, {
				"messageId" : "52d986f2-93b1-4fe7-a011-b8ce4e46a145",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-03-09 16:51:44",
				"timestamp" : 1520585503508,
				"id" : "a13ecdc6-5ce8-4b17-98df-ecc17a7194a2"
			}, {
				"messageId" : "93961ee3-77f6-4e18-89a8-90a14e619370",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-03-09 16:50:52",
				"timestamp" : 1520585452490,
				"id" : "f31928f0-1948-4a82-a4f8-fdef9df45ebd"
			}, {
				"messageId" : "353af0a2-deb4-4925-b944-1b8035dce98c",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-03-09 16:39:10",
				"timestamp" : 1520584750237,
				"id" : "66f6391b-7e99-42bf-a5e7-97a17f70acbf"
			}, {
				"messageId" : "43de3079-62d3-4929-8996-f7a7dc171a93",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-03-09 16:39:06",
				"timestamp" : 1520584746236,
				"id" : "18b45270-7ca6-4b92-bf3a-e9b65bd3f205"
			}, {
				"messageId" : "b6b200ef-1123-4308-944b-7ab5f87a497b",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-02-04 09:55:49",
				"timestamp" : 1517709349403,
				"id" : "34119000-c553-4179-877b-47ee401be5a8"
			}, {
				"messageId" : "b6aa9405-9d3c-4b89-bd44-09c76eeeada6",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-01-31 21:47:43",
				"timestamp" : 1517406462795,
				"id" : "1f7c91fa-71d3-45db-972e-add0ea2a55be"
			}, {
				"messageId" : "abea5729-4715-4200-8ef8-6624fd5f143e",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-01-31 21:47:40",
				"timestamp" : 1517406459594,
				"id" : "78a97658-d313-443f-8951-f7ed48c967d0"
			}, {
				"messageId" : "e78c6dba-81c5-4ec9-ad74-539e6d6819f4",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-01-31 21:46:45",
				"timestamp" : 1517406404774,
				"id" : "0a4c284c-9a6c-457f-9aea-3b4e3308d860"
			}, {
				"messageId" : "5c64b881-6307-4ff9-b36a-d56880dc2029",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-01-31 21:46:36",
				"timestamp" : 1517406396371,
				"id" : "6e81c5d4-7b0b-4370-a9d0-a148e8113929"
			}, {
				"messageId" : "f11ea17c-8d8a-4abb-8bfb-94ec5fc33b4c",
				"receiveUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"receiveUserHead" : "7",
				"receiveUserNickname" : "会说话的猫",
				"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"sendUserHead" : "4",
				"sendUserNickname" : "纨绔高手",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2018-01-31 21:46:20",
				"timestamp" : 1517406379765,
				"id" : "eab89bd0-7175-45d5-bc21-d7ba7412c3b2"
			}, {
				"messageId" : "c5b6bf57-2be8-4000-bed1-dc9d255706e0",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-12-28 12:17:11",
				"timestamp" : 1514434631092,
				"id" : "cd9737be-8f3c-4540-93fb-635a52d9645a"
			}, {
				"messageId" : "62e97f12-847f-47f1-bd20-761ac1e72c93",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-11-13 17:18:28",
				"timestamp" : 1510564708036,
				"id" : "1b0e5fc0-e66b-45f1-8025-0894e1b6f600"
			}, {
				"messageId" : "25766f5b-b7b1-4e6c-8c24-d58752eefb42",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-11-11 08:04:01",
				"timestamp" : 1510358641253,
				"id" : "aec65c64-0087-4354-a811-fc37c7680cba"
			}, {
				"messageId" : "b3453bd1-2968-40f6-8567-4bc1cb9e796b",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-11-11 08:03:17",
				"timestamp" : 1510358596962,
				"id" : "8fe040b1-9afa-440f-a640-062c55fa47a8"
			}, {
				"messageId" : "85b56fa5-ad3e-4fc8-8b00-ab4dbf81d49a",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-11-10 12:11:41",
				"timestamp" : 1510287101051,
				"id" : "e85df1b3-d50a-4ed6-99b2-4019e79b0bad"
			}, {
				"messageId" : "3062b173-d20d-4512-80e2-230a2546171c",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-11-10 12:11:33",
				"timestamp" : 1510287093229,
				"id" : "c895a314-11fb-4210-9893-b5070ecf6b01"
			}, {
				"messageId" : "431f9625-4d1c-46a7-8ef6-cd0f077223c4",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-11-05 21:49:35",
				"timestamp" : 1509889775363,
				"id" : "bf493324-71aa-4bbe-8dba-9464c97e9679"
			}, {
				"messageId" : "df156c17-802e-45cf-9129-f5c4be63dca5",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 20:25:00",
				"timestamp" : 1505737499719,
				"id" : "c091dfdc-78e5-43da-9060-88cf8da4ffd8"
			}, {
				"messageId" : "a5eafbc4-9496-4b56-aae9-63e5dc6760a9",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 20:24:56",
				"timestamp" : 1505737496309,
				"id" : "2684ea3e-132a-4158-87db-15678c6f3385"
			}, {
				"messageId" : "0a1f1c04-a35c-4e7e-894b-9c9dfa0b8861",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 20:24:53",
				"timestamp" : 1505737492703,
				"id" : "999fa1ab-2b0a-47d5-9075-827a6a3bee43"
			}, {
				"messageId" : "85b46ca0-06e4-4a4a-a0fb-bba04b4d18cf",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 20:13:50",
				"timestamp" : 1505736829613,
				"id" : "f79a7a8f-f6e8-4abf-a86a-feb43d7d2dae"
			}, {
				"messageId" : "f656bb10-cd67-4b4f-b508-60720ae0c1f7",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 20:13:43",
				"timestamp" : 1505736822598,
				"id" : "2df14ca7-95a9-4e0a-9ab1-9b287d883916"
			}, {
				"messageId" : "e3c29090-9fc9-4b14-811a-ef90d9c38afe",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 18:13:27",
				"timestamp" : 1505729607037,
				"id" : "04fc7e6c-6e94-47fb-8d3c-29d9bca9b8c7"
			}, {
				"messageId" : "575b9876-9181-4d11-9def-978881e5e0bb",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 18:13:24",
				"timestamp" : 1505729604028,
				"id" : "79e94fa0-ba09-4041-876b-1cc74bc1afa7"
			}, {
				"messageId" : "6e027d24-382c-45cf-abbd-2632981ba8a8",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 18:13:20",
				"timestamp" : 1505729599617,
				"id" : "ef6edd40-8004-48f5-8d2a-af0d90bec79e"
			}, {
				"messageId" : "949875f0-e9cf-4ecd-829b-4372fddd0243",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 17:23:24",
				"timestamp" : 1505726604296,
				"id" : "2ba87f62-8e50-4da1-8588-b113726235aa"
			}, {
				"messageId" : "45655328-57c8-4256-aa79-9f04d6a3eff0",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 17:17:54",
				"timestamp" : 1505726274217,
				"id" : "9d0431ed-52a1-4c01-895f-7851827f0867"
			}, {
				"messageId" : "7271867e-12d5-4464-8d8a-d37225e456e9",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 17:17:48",
				"timestamp" : 1505726268402,
				"id" : "4c60bc1b-7a11-4853-95ce-b94a3d31d0a4"
			}, {
				"messageId" : "f00a8906-7154-4f0f-8266-f26306a0fd6f",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 17:11:45",
				"timestamp" : 1505725904894,
				"id" : "dad841b6-2351-4b1d-bde6-59893c3ace8b"
			}, {
				"messageId" : "28eaec80-b2a3-4be4-bd8f-89d796861baf",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 17:11:00",
				"timestamp" : 1505725859893,
				"id" : "b3f27e04-4e6e-4474-a0f8-7f757ce3285d"
			}, {
				"messageId" : "92ae5a38-64e1-4f7c-8471-5f5fb968ac85",
				"receiveUserId" : "02d54705-b9de-465d-9226-935d9f2df38a",
				"receiveUserHead" : "4",
				"receiveUserNickname" : "纨绔高手",
				"sendUserId" : "2fff6e3f-1f90-401a-a2f8-56e3054aad32",
				"sendUserHead" : "7",
				"sendUserNickname" : "会说话的猫",
				"sendUserRemark" : "",
				"isDeleted" : "0",
				"isSend" : "1",
				"time" : "2017-09-18 17:10:52",
				"timestamp" : 1505725851874,
				"id" : "89e02e5d-642c-4da2-9a36-95ce26479eaf"
			} ]
		}
	}
};



/*************************************************************/
/**
 * 接口名称：获取离线消息的发送者id列表<br>
 * 功能：此接口可以获取到哪些用户给自己发送了离线消息。
 * "action": ""
 * "method": "1.1.1008"
 */
var request = {
	"head" : {
		"key" : "dd63f4c6-e3db-4835-85a3-923c7104f878",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.1008",
		"version" : "1",
		"time" : 1524288841873
	},
	"body" : {}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "dd63f4c6-e3db-4835-85a3-923c7104f878",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.1008",
		"version" : "1",
		"time" : 1524288843124
	},
	"info" : {
		"success" : true,
		"errors" : [],
		"warnings" : []
	},
	"body" : {
		"userIds" : [ "02d54705-b9de-465d-9226-935d9f2df38a" ]
	}
};



/*************************************************************/
/**
 * 接口名称：标记信息为已读<br>
 * 功能：
 * "action": ""
 * "method": "1.1.1009"
 */
var request = {
	"head" : {
		"key" : "06c42324-d48f-416a-9fac-f07d93a25a2b",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.1009",
		"version" : "1",
		"time" : 1524579147089
	},
	"body" : {
		"sendUserId" : "02d54705-b9de-465d-9226-935d9f2df38a"
	}
};

var response = {
	"head" : {
		"resultCode" : "1",
		"resultMessage" : "",
		"key" : "06c42324-d48f-416a-9fac-f07d93a25a2b",
		"name" : "",
		"action" : "1.500",
		"method" : "1.1.1009",
		"version" : "1",
		"time" : 1524579149358
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
 * 接口名称：获取离线消息数量<br>
 * 功能：
 * "action": ""
 * "method": "1.1.1010"
 */
var request = "";

var response = "";



/*************************************************************/
/**
 * 接口名称：获取指定用户的离线数量<br>
 * 功能：根据离线发送者的用户id列表，获取离线消息数量
 * "action": ""
 * "method": ""
 */
var request = "";

var response = "";


/*************************************************************/
/**
 * 接口名称：删除聊天记录<br>
 * 功能：
 * "action": ""
 * "method": "1.1.1013"
 */
var request = "";

var response = "";