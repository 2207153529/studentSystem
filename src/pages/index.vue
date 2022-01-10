<template>
    <div id="index">
        <Header/>
        <Body/>
    </div>
</template>

<script>
    import Header from '../components/header.vue'
    import Body from '../components/body.vue'

    export default {
        name: "index",
        components:{
            Header,
            Body
        },
    }
</script>

<style lang="less">
    *{
        padding:0;
        margin:0;
        box-sizing: border-box;
    }
    #index {
        display: flex;
        justify-content: space-between;
        flex-direction: column;
        .header{
            position: relative;
            width: 100%;
            height: 80px;
            text-align: center;
            background: #b3c0d1;
        }
        .body {
            width: 100%;
            height: 680px;
            background: #e9eef3;
        }
    }
</style>