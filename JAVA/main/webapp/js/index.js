var buttonArray = document.querySelectorAll("button[class='el-button el-button--primary']");
for (i=1; i<buttonArray.length;i++){
    buttonArray[i].setAttribute("index", i);
}

function echartsRelod (index){
    var button = document.querySelectorAll("button[class='el-button el-button--primary']")[index];
    var manNum = button.parentElement.parentElement.parentElement.children[2];
    var girlNum = button.parentElement.parentElement.parentElement.children[3];
    var mychar = echarts.init(document.querySelector("#man"));
    option = {
        tooltip: {
            trigger: 'item'
        },
        legend: {
            top: '5%',
            left: 'center'
        },
        series: [
            {
                name: 'Access From',
                type: 'pie',
                radius: ['40%', '70%'],
                avoidLabelOverlap: false,
                itemStyle: {
                    borderRadius: 10,
                    borderColor: '#fff',
                    borderWidth: 2
                },
                label: {
                    show: false,
                    position: 'center'
                },
                emphasis: {
                    label: {
                        show: true,
                        fontSize: '40',
                        fontWeight: 'bold'
                    }
                },
                labelLine: {
                    show: false
                },
                data: [
                    { value: Number(manNum), name: '男' },
                    { value: Number(girlNum), name: '女' },
                ]
            }
        ]
    };
    mychar.setOption(option);
}
