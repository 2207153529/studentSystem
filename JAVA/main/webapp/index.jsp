<%@ page import="com.school.jopo.StudentAvg" %>
<%@ page import="java.util.List" %>
<%@ page import="com.school.service.StudentAvgService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="element-ui/lib/theme-chalk/index.css">
    <style>
        .el-table .warning-row {
            background: oldlace;
        }

        .el-table .success-row {
            background: #f0f9eb;
        }
    </style>

</head>
<body>
<div id="app">
<!--    表格-->
    <%
        StudentAvgService studentAvgService = new StudentAvgService();
        List<StudentAvg> students = studentAvgService.selectAll();
        int Num = students.size();
    %>
    <template>
        <el-table
                :data="tableData"
                style="width: 100%"
                :row-class-name="tableRowClassName">
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
                    label="查看详情">
                <el-button type="primary" @click="open()">查看详情</el-button>
            </el-table-column>
        </el-table>
    </template>
<!--    分页-->
    <template>
        <div class="block" align="center">
            <el-pagination
                    @size-change="handleSizeChange"
                    @current-change="handleCurrentChange"
                    :current-page.sync="currentPage1"
                    :page-size="15"
                    layout="total, prev, pager, next"
                    :total="<%=Num%>">
            </el-pagination>
        </div>
    </template>
</div>

<script src="js/vue.js"></script>
<script src="element-ui/lib/index.js"></script>
<script src="js/jquery.js"></script>
<script src="js/echarts.min.js"></script>
<script src="js/index.js"></script>
<script>
    var dataStr;
    var page = 1;
    new Vue({
        el: '#app',
        data() {
            return {
                tableData: dataStr,
            }
        },

        methods: {
            open() {
                this.$alert('<div id="man" style="width: 100px; height: 100px;"></div>', '男女比例', {
                    dangerouslyUseHTMLString: true
                });
                echartsRelod();
            },
            // ajaxPage(page){
            //     var _this = this;
            //     $.ajax({
            //         url: "selectAllServlet",
            //         type: "GET",
            //         async: false,
            //         dataType: "json",
            //         data:{
            //             pageNum:page
            //         },
            //         success: function (data){
            //             console.log(data);
            //             _this.tableData = data;
            //         }
            //     })
            // },
            tableRowClassName({row, rowIndex}) {
                if (rowIndex === 1) {
                    return 'warning-row';
                } else if (rowIndex === 3) {
                    return 'success-row';
                }
                return '';
            },
            onSubmit() {
                console.log('submit!');
            },
            handleCurrentChange(val) {
                this.ajaxPage(val);
            }


        },
        mounted(){
            this.ajaxPage(page);
        }
    })
</script>
</body>
</html>