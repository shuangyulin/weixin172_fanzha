const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmpiv8u/",
            name: "ssmpiv8u",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmpiv8u/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园反诈骗微信小程序"
        } 
    }
}
export default base
