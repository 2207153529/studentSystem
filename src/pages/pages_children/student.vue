<template>
    <div class="student">
        <table class="mytable">
            <thead>
                <tr>
                    <th>学生姓名</th>
                    <th>学院</th>
                    <th>专业</th>
                    <th>入学年份</th>
                    <th>班级</th>
                    <th>学号</th>
                    <th>性别</th>
                </tr>
            </thead>
            <tbody>
                <tr class="student-row" v-for="student in students" :key="student.id">
                    <td>{{student.name}}</td>
                    <td>{{student.college}}</td>
                    <td>{{student.major}}</td>
                    <td>{{student.grade}}</td>
                    <td>{{student.stuClass}}</td>
                    <td>{{student.stuId}}</td>
                    <td>{{student.sex}}</td>
                </tr>
            </tbody>
        </table>
        <Footer/>
    </div>
</template>

<script>
import {mixin} from '../../mixin'
import Footer from '../../components/footer.vue'
export default {
    name: "Student",
    components:{
        Footer
    },
    data() {
        return {
            students:[],
            page:1
        }
    },
    watch: {
        page:{
            immediate: true,
            handler(oldVal, newVal){
                var url = `http://localhost/selectStudents?pageNum=${oldVal}`
                this.sendAjax(url).then(resp=>{
                    this.students = resp
                })
            }
        }
    },
    mixins:[mixin],
    mounted(){
        this.$bus.$on("page",pageNum=>{
            this.page = pageNum
        })
    }
}
</script>

<style lang='less'>
    h1{
        margin: 0;
        padding: 0;
    }
    .student{
        width: 100%;
        height: 100%;
        .mytable{
            width: 100%;
            height: 90%;
            color: #909399;
            overflow: scroll!important;
            thead th {
                height: 5%;
                line-height: 40px;
                background: skyblue;
            }
            th,td{
                text-align: center;
            }
            tbody tr:hover{
                background: skyblue;
                cursor: pointer;
            }
            
        }
    }
    .footer{
        height: 9%;
        width: 100%;
    }
</style>