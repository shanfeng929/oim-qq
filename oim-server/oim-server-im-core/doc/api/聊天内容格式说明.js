/**
 * 聊天内容格式说明，聊天内容为了能够支持图文混排
 *
 */
//看以下文字信息转为消息dome
/**
 * 你好啊！<img src="http://xxxx.jpg"/>,啦啦啦。/n
 * 哇哇哇哇哇
 *
 */
var content = {
    "sections" : [ //段落，表示换行
        {
            "items" : [ //内容集合，
                {
                    "type" : "text", //内容类型目前有:text：文本 image：图片地址
                    "value" : "你好啊！"
                },
                {
                    "type" : "image",
                    "value" : "http://xxxx.jpg"
                },
                {
                    "type" : "text",
                    "value" : "啦啦啦。"
                }
            ]
        }, {
            "items" : [ //内容集合，
                {
                    "type" : "text",
                    "value" : "哇哇哇哇哇"
                }
            ]
        }
    ],
    "font" : { //文字样式，扩展用，目前忽略
        "underline" : false, //是否下划线
        "bold" : false, //是否粗体
        "italic" : false, //是否倾斜
        "color" : "000000", //字体颜色
        "name" : "微软雅黑", //
        "size" : 12 //字体尺寸
    },
    "timestamp" : 1479699748949 //发送时间，通常为服务器时间
};
