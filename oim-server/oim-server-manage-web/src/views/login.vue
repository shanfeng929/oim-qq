<style lang="less">
    @import './login.less';
</style>

<template>
    <div class="login" @keydown.enter="handleSubmit">
        <div class="login-con">
            <Card :bordered="false">
                <p slot="title">
                    <Icon type="log-in"></Icon>
                    欢迎登录
                </p>
                <div class="form-con">
                    <Form ref="loginForm" :model="form" :rules="rules">
                        <FormItem prop="userName">
                            <Input v-model="form.account" placeholder="请输入用户名">
                            <span slot="prepend">
                                    <Icon :size="16" type="person"></Icon>
                                </span>
                            </Input>
                        </FormItem>
                        <FormItem prop="password">
                            <Input type="password" v-model="form.password" placeholder="请输入密码">
                            <span slot="prepend">
                                    <Icon :size="14" type="locked"></Icon>
                                </span>
                            </Input>
                        </FormItem>
                        <FormItem>
                            <Button @click="handleSubmit" type="primary" long>登录</Button>
                        </FormItem>
                    </Form>
                    <p class="login-tip">输入任意用户名和密码即可</p>
                </div>
            </Card>
        </div>
    </div>
</template>

<script>
    import Cookies from 'js-cookie';
    import auth from '@/libs/auth';
    import personal from '@/app/api/personal';

    export default {
        data () {
            return {
                form: {
                    account: 'admin',
                    password: ''
                },
                rules: {
                    account: [
                        {required: true, message: '账号不能为空', trigger: 'blur'}
                    ],
                    password: [
                        {required: true, message: '密码不能为空', trigger: 'blur'}
                    ]
                }
            };
        },
        methods: {
            handleSubmit () {
                var own=this;
                this.$refs.loginForm.validate((valid) => {
                    if (valid) {
                        var account = this.form.account;
                        var password = this.form.password;

                        personal.login(account, password, function (data) {
                            var body = data.body;
                            var info = data.info;

                            if (info) {
                                if (info.success) {
                                    var user = body.user;
                                    var token = body.token;

                                    auth.setUser(user);
                                    auth.setToken(token);
                                    own.$store.commit('setAvator', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3448484253,3685836170&fm=27&gp=0.jpg');
                                    if (own.form.account === 'admin') {
                                        Cookies.set('access', 0);
                                    } else {
                                        Cookies.set('access', 1);
                                    }
                                    own.$router.push({
                                        name: 'home_index'
                                    });
                                } else {
                                    // importResult = only.getDefaultErrorText(info);
                                    // this.$Modal.info({
                                    //     title: '信息',
                                    //     content: importResult
                                    // });
                                }
                            }
                        });
                    }
                });
            }
        }
    };
</script>

<style>

</style>
