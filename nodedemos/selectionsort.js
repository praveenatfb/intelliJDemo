let elements = [5, 8, 2, 9, 3, 1, 4, 6];
console.log("The array elements before sorting are " + elements);
for (var i = 0; i < elements.length - 1; i++) {
    for (var j = i + 1; j < elements.length; j++) {
        if (elements[i] > elements[j]) {
            var temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
        }
    }
}
console.log("The array elements are::" + elements);