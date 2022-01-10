<template>
  <div class="dataList">
    <el-table
    :data="tableData"
    stripe
    show-overflow-tooltip='true'
    @row-click='handleRowClickRole'
    index="getIndex"
    ref="column"
    style="width: 100%"
    row-key>
    <el-table-column
      prop="college"
      label="专业">
    </el-table-column>
    <el-table-column
      prop="major"
      label="班级">
    </el-table-column>
    <el-table-column
      prop="manNum"
      label="男生人数">
    </el-table-column>
    <el-table-column
      prop="girlNum"
      label="女生人数">
    </el-table-column>
    <el-table-column
      prop="classAvg"
      label="男女比例">
    </el-table-column>

  <el-table-column
      prop="classAvg"
      label="操作"
      width="150"
      >

      <alert-message/>
      
      </el-table-column>
  </el-table>

  </div>
</template>

<script>
import {mapState, mapActions} from 'vuex'
import AlertMessage from './AlertMessage'
export default {
    name: "DateList",
    components: {
        AlertMessage
    },
    data() {
        return {
            
            // dataInfo:{}
        }
    },
    computed:{
      ...mapState(["tableData", 'formInline', 'pageNum'])
    },
    watch:{
        pageNum(){
            this.sendAjsx(this.pageNum, this.formInline.major, this.formInline.college)
        }
    },
    methods:{
        // 查看详情代码
        handleRowClickRole(index){
            this.$bus.$emit("getData", index)
        },
        // 发送请求方法
        ...mapActions(["sendAjsx"])
    },
    mounted(){
        console.log(this.formInline.major)
        this.sendAjsx(this.pageNum, this.formInline.major, this.formInline.college)
    }
}
</script>

<style>
  .dataList{
    overflow-y: scroll;
    height: 80%;
  }
</style>