<template>
  <div id="app">
      <router-view></router-view>
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {
  }
}
</script>

<style lang="less">
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    color: #303133;
  }
  body, .body{
    background: #c8c8c9;
  }
  a{
    text-decoration: none;
  }
  input:focus{
    outline: 1px solid #51c9ff;
    box-shadow: 2px 2px 2px 2px rgba(81, 201, 255, .3);
  }
  .app{
    perspective: 1200px;
    position: absolute;
    width: 500px;
    height: 400px;
    background: #e3e3e3;
    top: 0;
    left: 0;
    bottom: 0;
    right: 0;
    margin: auto;
    box-shadow: 10px 10px 5px rgba(0, 0, 0, .3);
    border-radius: 20px;
    text-align: center;
    >a:hover{
      transform: scale(1.2);
      color: #666666!important;
    }
    h1,a{
      position: relative;
      display: inline-block;
      transition: all .5s;
      top: 10px;
      color: #a5b1c7;
    }
    :nth-child(2){
      margin: 0 20px 0 20px;
    }
  }
  .action{
    transform: scale(1.2);
    color: #666666!important;
  }
  .form{
    display: block;
    position: relative;
    padding:30px;
    left: 50%;
    transform: translateX(-50%);
    top: 40px;
    width: 80%;
    height: 75%;
    >div{
      margin-bottom: 40px;
      font-size: 20px;
      >.btn-lg{
        margin-top: 30px;
        width: 100px;
      }
      input{
        display:inline-block;
        padding-left: 10px;
        border-radius: 10px;
        border: 1px ;
        font-size: 20px;
        width: 230px;
        height: 35px;
        transition: all .3s;
      }
    }
  }
</style>
