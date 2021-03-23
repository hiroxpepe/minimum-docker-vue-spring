// data object
var data = { message: "It works!" }

window.addEventListener("load", () => {
    // adding object to a Vue Instance
    var vm = new Vue({
        el: '#vue-app',
        data: data,
        // define methods under the methods object
        methods: {
            getMessage() {
                // ajax request to the backend server
                axios.get(
                    'http://localhost:8881/api/message', {
                        headers: {'content-type': 'application/json'}
                    })
                    .then(response => {
                        // get the return value of an ajax request
                        this.message = response.data.message;
                    })
                    .catch(error => {
                        // display error messages
                        this.message = error;
                    });
            }
        }
    })
});