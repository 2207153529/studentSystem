<template>
  <form class="form">
        <div>
            账号：<input type="text" placeholder="请输入手机号" v-model="username">
        </div>
        <div>
            密码：<input type="password" placeholder="请输入密码" v-model="pwd">
        </div>
        <div>
            <button class="btn btn-primary btn-lg" @click="submit">注册</button>
        </div>
    </form>
</template>

<script>
export default {
    name: 'regist',
    data() {
        return {
            username: "",
            pwd: ""
        }
    },
    methods:{
        submit(){
            localStorage.setItem("username", this.username)
            localStorage.setItem(this.username, this.pwd)
            alert("注册成功")
            this.$router.push({name: "login"})
        }
    }
}
</script>

<style>

</style>