function solution(numbers) {
    var answer = 0;
    let sum = 0;
    for (let num of numbers) {
        sum += num;
    }
    answer = sum / numbers.length;
    return answer;
}