<template>
    <div class="body-right">
        <Main/>
    </div>
</template>

<script>
    import Footer from '../components/footer.vue'
    import Main from '../components/main.vue'
    export default {
        name: "BodyRight",
        components:{
            Main
        }
    }
</script>

<style>
    .main{
        width: 100%;
        height: 100%;
    }
    /* .footer{
        width: 100%;
        height: 10%;
    } */
</style>