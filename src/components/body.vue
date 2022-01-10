<template>
  <div class="body">
        <BodyLeft/>
        <BodyRight/>
  </div>
</template>

<script>
    import BodyLeft from './body-left.vue'
    import BodyRight from './body-right.vue'
    export default {
        name:"Body",
        components:{
            BodyLeft,
            BodyRight,
        }
    }
</script>

<style>
    .body{
        display: flex;
        justify-content: space-between;
    }
    .body-left{
        width: 20%;
        height: 100%;
        background: #606266;
    }
    .body-right{
        width: 80%;
        height: 100%;
        background: white;
    }
</style>