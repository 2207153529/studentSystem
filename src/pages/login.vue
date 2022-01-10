<template>
    <form class="form">
        <div>
            账号：<input type="text" placeholder="请输入账号" v-model="username">
        </div>
        <div>
            密码：<input type="password" placeholder="请输入密码" v-model="pwd">
        </div>
        <div>
            <button class="btn btn-primary btn-lg" @click="submit">登录</button>
        </div>
    </form>
</template>

<script>
    export default {
        name: "login",
        data() {
            return {
                username:"",
                pwd: ""
            }
        },
        methods:{
            submit(){
                var username = localStorage.getItem("username")
                if(username!==null){
                    var password = localStorage.getItem(username)
                    if(this.pwd === password){
                        this.$router.push({
                            name: "index"
                        })
                    }else{
                        this.pwd = ""
                        alert("密码错误！！")
                    }
                }else{
                    this.username = ""
                    this.pwd = ""
                    alert("该账户不存在！！")
                }
                
            }
        }
    }
</script>

<style>

</style>