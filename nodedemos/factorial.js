console.log("The program is to find the factorial of the given number...")

const n = 5;
let fact = 1;
for (var i = 1; i < n; i++) {
    fact = fact * i;
}
console.log("The factorial of the given number is :: " + fact);