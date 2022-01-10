<template>
  <div>
      <h1>抱歉你还未进行登录，请登录....{{time}}秒后跳转</h1>
      <button>立即返回登录页</button>
  </div>
</template>

<script>
export default {
    name: "Error",
    data(){
        return {
            time: 3
        }
    },
    computed:{
        setTime(){
            
        }
    },
    mounted(){
        const timer = setInterval(()=>{
            if(this.time === 0){
                this.$destroy();
                return null
            }
            console.log(this.time)
            this.time-=1
        },1000)
    },
    beforeDestroy(){
        this.$router.replace({name: "home"})
    }
}
</script>

<style>

</style>