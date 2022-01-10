<template>
    <div class="block">
        <el-pagination
        @current-change="handleCurrentChange"
        :current-page.sync="currentPage3"
        :page-size="10"
        layout="prev, pager, next, jumper"
        :total="pageSum">
        </el-pagination>
    </div>
</template>

<script>
import { mapActions, mapMutations, mapState } from 'vuex'
export default {
    name: "PageComponents",
    data() {
        return {
            currentPage3:1,
            // pageSum: 0
        }
    },
    computed:{
        ...mapState(['pageNum', "formInline", 'pageSum'])
    },
    methods: {
      handleCurrentChange(val) {
        this.SET_PAGE_NUM(val)
      },
      ...mapMutations(["SET_COLLEGE_LIST", "SET_PAGE_NUM"]),
      ...mapActions(['getPageSum'])
    },
    mounted(){
        this.getPageSum()
    }
}
</script>

<style>
    .block{
        position: absolute;
        left: 50%;
        transform: translate(-50%, 0);
        margin: 25px;
        padding-bottom: 25px;
    }
</style>