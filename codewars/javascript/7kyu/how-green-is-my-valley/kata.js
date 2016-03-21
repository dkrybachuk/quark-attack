function makeValley(arr) {
  var a = arr.slice();
  var result = [];
  a.sort((a, b) => {
    return b - a;
  }).forEach((x, i) => {
    var j;
    if ((i % 2) == 0) {
      j = i - Math.floor(i / 2);
    } else {
      j = (a.length - 1) - Math.floor(i / 2);
    }
    result[j] = x;
  });
  return result;
};
