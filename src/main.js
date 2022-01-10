import Vue from 'vue'
import App from './App.vue'
import router from './router/index'
import VueRouter from 'vue-router'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import store from './store'
import echarts from 'echarts'


Vue.config.productionTip = false
Vue.use(VueRouter)
Vue.use(ElementUI)


new Vue({
  store,
  router: router,
  beforeCreate(){
    Vue.prototype.$bus = this
    Vue.prototype.$echarts = echarts
    console.log(Vue)
  },
  render: h => h(App),
}).$mount('#app')
