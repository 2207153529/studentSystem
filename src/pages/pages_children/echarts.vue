<template>
    <div class="echarts main">
        <div class="pie" ref="chart"></div>
    </div>
</template>

<script>
import {mapState, mapActions} from 'vuex'

export default {
    name: "Echarts",
    computed:{
        ...mapState(["AllMajorData"])   
    },
    methods:{
        ...mapActions(["getAllMajor"]),
        drawChart(){
            const myChart = this.$echarts.init(this.$refs.chart)
        myChart.setOption(option)
        }
    },
    mounted(){
        this.getAllMajor()
        this.$nextTick(this.drawChart())
        console.log(this)
    }
}
</script>

<style>
    .echarts{
        width: 100%;
        height: 100%;
    }
    .pie{
        width: 500px;
        height: 500px;
    }
</style>