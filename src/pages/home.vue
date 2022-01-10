<template>
  <div class="app">
        <router-link active-class="action" :to="{name:'login'}"><h1>登录</h1></router-link><a><h1>|</h1></a>
        <router-link active-class="action" :to="{name:'regist'}"><h1>注册</h1></router-link>
        <router-view></router-view>
  </div>
</template>

<script>
export default {
    name:"home",
    mounted(){
        console.log("home组件")
    }
}
</script>

<style>

</style>