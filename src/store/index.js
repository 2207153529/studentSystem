import Vue from "vue";
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

// 配置actions
const actions = {
    getAllMajor(context){
        axios.get("http://127.0.0.1/selectMajor").then(result=>{
            context.commit("SET_ALL_MAJOR", result.data)
        })
    },
    sendAjsx(context, page){
        var major = context.state.formInline.major
        var college = context.state.formInline.college
        var url = `http://127.0.0.1/selectAllServlet?pageNum=${page}&major=${major}&college=${college}`
        console.log(url)
        axios.get(url).then(result=>{
            context.commit("SET_DATA", result.data)
        })
    },
    getPageSum(context){
        var major = context.state.formInline.major
        var college = context.state.formInline.college
        axios.get("http://127.0.0.1/selectPageSum"+`?major=${major}&college=${college}`).then(result=>{
          context.commit("SET_PAGR_SUM", result.data.length)
          var collegeList = []
          result.data.forEach(p=>{
              if(collegeList.indexOf(p.college) == -1) collegeList.push(p.college)
          })
          context.commit("SET_COLLEGE_LIST",collegeList)
      })
    }
}

// 配置mutation
const mutations = {
    SET_ALL_MAJOR(state, value){
        state.AllMajorData = value
    },
    SET_DATA(state, value){
        state.tableData = value
    },
    SET_COLLEGE_LIST(state, value){
        state.collegeList = value
    },
    SET_PAGE_NUM(state, page){
        state.pageNum = page
    },
    SET_PAGR_SUM(state, value){
        state.pageSum = value
    }
 }

// 配置state
const state = {
    AllMajorData:[],
    tableData:[],
    pageNum: 1,
    collegeList:[],
    pageSum:0,
    formInline: {
        major: '',
        college: ''
    }
}

// 配置getters
const getters = {

}

export default new Vuex.Store({
    actions,
    mutations,
    state,
    getters
})