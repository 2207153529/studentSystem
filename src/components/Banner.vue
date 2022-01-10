<template>
        <el-form :inline="true" :model="formInline" class="demo-form-inline">
        <el-form-item label="班级">
            <el-input v-model="formInline.major" placeholder="筛选"></el-input>
        </el-form-item>
        <el-form-item label="专业">
        <el-select v-model="formInline.college" placeholder="专业">
        <el-option 
        v-for="(item, index) in collegeList" 
        :label="item" 
        :value="item"
        :key="index">
        </el-option>
        </el-select>
        </el-form-item>
        <el-form-item>
            <el-button type="primary" @click="onSubmit">查询</el-button>
        </el-form-item>
        </el-form>

</template>

<script>
import {mapActions, mapState, mapMutations} from 'vuex'
export default {
    name: "Banner",
    data() {
        return {
            
        }
    },
    computed:{
        ...mapState(["collegeList", 'formInline', 'pageNum'])
    },
    methods:{
        ...mapActions(['sendAjsx', 'getPageSum']),
        ...mapMutations(['SET_PAGE_NUM']),
        onSubmit(){
            this.SET_PAGE_NUM(1)
            this.getPageSum()
            this.sendAjsx(this.pageNum, this.formInline.major, this.formInline.college)
        }
    },
}
</script>

<style>
    /* .bar{
        width: 100px;
    } */
</style>