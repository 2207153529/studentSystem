<template>
    <div class="block">
        <el-pagination
            @current-change="handleCurrentChange"
            :current-page.sync="page"
            :page-size="10"
            layout="prev, pager, next, jumper"
            :total="12767">
    </el-pagination>
    </div>
</template>

<script>
export default {
    name: "Footer",
    data() {
        return {
            page: 1
        }
    },
    methods:{
        handleCurrentChange(val) {
            this.$bus.$emit("page", val)
      }
    },
    mounted(){
        this.$bus.$emit("page", this.page)
    }
}
</script>

<style>
    .block {
        margin-top: 10px;
        display: flex;
        justify-content: center;
    }
</style>