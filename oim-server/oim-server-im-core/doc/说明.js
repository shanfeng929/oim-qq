/**
 * 一、接入步骤
 * 1.先获取服务器地址：基础服务接口->获取各自服务地址 server.main.tcp.address 聊天服务TCP地址 server.main.websocket.address 聊天服务WebSocket地址 这是考虑到有更换服务器地址的情况，如果确定不会更换服务地址，忽略此步骤 
 * 2.按接入协议连接上服务器 
 * 3.执行登录操作 
 * 4.执行相关接口请求，完成客户端各业务（考虑到不同版本客户端实现不同的功能，除聊天消息、通知等此类信息由服务器推送外，其他业务均由客户端主动请求）
 */






/**
 * 二、消息体说明
 * 1、客户端向服务端请求格式为{head:{},body:{}},其中head为固定格式，主要包含请求业务、客户端信息，body为具体业务数据
 * 2、服务端响应客户端数据格式为{head:{},info:{},body:{}}，head和body同上，info为请求是否成功，错误码和提示信息
 * 3、客户端收到服务端推送信息{head:{},body:{}}，head和body同客户端请求服务端。
 * 4、客户每一个请求服务器都会有相应的响应信息，响应信息会保持请求信息中头部（head）中的key、action、method原值返回
 * 5、接口编码规则：action：为业务大类，作用域.业务编码 如：1.100（1：为普通功能，2：内部员工使用） ；method:为具体业务方法 版本.方向（请求/推送）+业务编码 如，请求为：1.10001 ，接受到推送为：1.20001
 */

var request = { //客户端发送给服务端的请求信息
	"head" : {
		"key" : "1479871523686", //消息的key，建议使用uuid，尽量避免生成重复值，服务端响应时可用与判断所对应的请求信息
		"name" : "", //备用，尚未使用
		"clientVersion" : "2.0", //客户端版本信息
		"clientType" : "1", //客户端类型/clientType： 1=pc 2=mac 3=ios 4=android 5=wp 6=web 7=wap
		"action" : "1.100", //业务动作类型：如聊天业务，个人信息业务等
		"method" : "1.10001", //业务类型的具体方法，服务器靠action+method判断请求操作
		"version" : "1", //接口的版本信息
		"time" : 1479808788675 //发送请求时的时间戳，服务端会返回响应时候的时间戳
	},
	"body" : { //业务数据的主体，具体按相应业务方法接口传参
		"xxx" : "xxx"
	}
};

var response = { //服务端响应客户端请求
	"head" : {
		"key" : "1479871523686", //保持请求原值
		"name" : "", //保持请求原值
		"action" : "1.100", //保持请求原值
		"method" : "1.10001", //保持请求原值
		"version" : "", //服务端的接口版本
		"resultCode" : "", //返回编码，注意编码所出现的错误均系统级别，表示尚未执行到具体业务方法：0：失败 1：成功
		"resultMessage" : "", //返回提示信息
		"time" : 1479871524111
	},
	"info" : { //info为业务提示信息
		"success" : true, //true:成功 false:失败
		"errors" : [ //errors为程序级别错误，主要给程序员看的，如不能为空的参数给空值了、数字类型的给字符类型了等
			{
				"code" : "10001",
				"text" : "xxx参数不能为空"
			}
		],
		"warnings" : [ //warnings为业务级别的错误，如用户的账号错误，密码错误
			{
				"code" : "10001",
				"text" : "账号不能为空"
			}
		]
	},
	"body" : { //数据主体
		"xxx" : "xxx"
	}
};

/**
 * 收到服务器推送的消息体结构
 * body：消息业务主体信息<br>
 */
var push = { //收到服务推送的信息
	"head" : {
		"key" : "1479808788675",
		"name" : "",
		"action" : "1.100",
		"method" : "1.10001",
		"version" : "1",
		"time" : 1479808788675
	},
	"body" : {
		"xxx" : "xxx"
	}
};
