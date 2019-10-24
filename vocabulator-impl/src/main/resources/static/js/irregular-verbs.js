function check(value, expectedValue) {
    var result = document.getElementById('result');
    if (value == expectedValue) {
        result.value = 'NICE';
    } else {
        result.value = 'oops';
    }
    location.reload();
}