<template>
    <div class="major main">
        <Banner></Banner>
        <data-list/>
        <page-components/>
    </div>
</template>

<script>
import DataList from '../../components/DataList.vue'
import Banner from '../../components/Banner.vue'
import PageComponents from '../../components/PageComponents.vue'
import AlertMessage from '../../components/AlertMessage.vue'
import {mapState} from 'vuex'

export default {
    name: "Major",
    components:{
        DataList,
        Banner,
        PageComponents,
        AlertMessage
    },
    computed:{
        ...mapState(["formInline"])
    },
    beforeDestroy(){
        this.formInline.major = ""
        this.formInline.college = ""
    }
}
</script>

<style>

</style>