<template>
    <div class="body-left">
        <ul class="aside">
            <li><router-link :to="{name:'student'}">学生详情</router-link></li>
            <li><router-link :to="{name:'major'}">班级详情</router-link></li>
            <li><router-link :to="{name:'echarts'}">可视化</router-link></li>
        </ul>
    </div>
</template>

<script>
export default {
    name: "BodyLeft"
}
</script>

<style lang="less">
    .aside{
        width: 100%;
        height: 100%;
        li,a{
            text-align: center;
            line-height: 60px;
            width: 100%;
            height: 60px;
            font-size: 25px;
        }
        li:hover{
            background: #ff6600;
        }
        a{
            color: white;
            text-decoration: none;
        }
    }
</style>