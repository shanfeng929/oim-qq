import service from '@/libs/service';

let personal = {};

personal.login = function (account, password, back) {
    var body = {
        'account': account,
        'password': password
    };

    var m = {'body': body};
    service.post('/manage/index/login', m, back);
}

export default personal;
