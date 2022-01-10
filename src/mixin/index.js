import axios from 'axios'

export const mixin = {
    methods: {
        sendAjax(url){
            var result = axios.get(url).then(result=>{
                return result.data
            })
            return result
        }
    },
}