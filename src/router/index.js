import VueRouter from 'vue-router'
import login from '../pages/login.vue'
import index from '../pages/index.vue'
import regist from '../pages/regist.vue'
import home from '../pages/home.vue'
import Error from '../pages/Error.vue'
import Student from "../pages/pages_children/student.vue"
import Major from "../pages/pages_children/major.vue"
import Echarts from "../pages/pages_children/echarts.vue"



const router = new VueRouter({
    routes: [
        {
            name: "index",
            path: "/index",
            component: index,
            redirect: "/index/student",
            meta:{title: "主页"},
            children:[
                {
                    name: "student",
                    path: "student",
                    component:Student,
                    meta: {title: "学生详情"}
                },
                {
                    name: "major",
                    path: "major",
                    component: Major,
                    meta: {title: "班级详情"}
                },
                {
                    name: "echarts",
                    path: "echarts",
                    component: Echarts,
                    meta:{title: "可视化"}
                }
            ]
        },
        {
            name:'home',
            path: "/",
            component: home,
            redirect: "login",
            children:[
                {
                    name:"login",
                    path: "login",
                    component: login,
                    meta:{title:"登录"}
                },
                {
                    name: "regist",
                    path: "regist",
                    component: regist,
                    meta:{title: "注册"}
                },
            ]
        },
        {
            name:"error",
            path: "/error",
            component:Error
        }
    ]
})

// 配置全局路由守卫
router.beforeEach((to, from, next)=>{
    if(to.name === 'error'){
        next()
    }else if(to.name!=='login'&&to.name!=='regist'){
        if(localStorage.getItem('username')===null){
            next({name:"error"})
        }
    }
    next()
})

// 配置全局后置路由守卫
router.afterEach((to, from)=>{
    document.title = to.meta.title
})

export default router