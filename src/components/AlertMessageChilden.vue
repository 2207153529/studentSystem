<template>
  <div>
        <el-descriptions class="margin-top" title="具体信息" :column="4" direction="vertical">
        <el-descriptions-item label="班级">{{todoData.major}}</el-descriptions-item>
        <el-descriptions-item label="男生人数">{{todoData.manNum}}</el-descriptions-item>
        <el-descriptions-item label="女生人数" :span="2">{{todoData.girlNum}}</el-descriptions-item>
        <el-descriptions-item label="专业">
            <el-tag size="small">{{todoData.college}}</el-tag>
        </el-descriptions-item>
        </el-descriptions>
  </div>
</template>

<script>
export default {
    name: "AlertMessageChilder",
    props:['todoData'],

}
</script>

<style>
    .margin-top{
        margin-left: 10px;
    }
</style>