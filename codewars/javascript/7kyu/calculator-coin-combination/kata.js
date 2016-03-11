var coinCombo = function(cents) {
  denomination = [1, 5, 10, 25];
  result = [0, 0, 0, 0];
  var i, j;
  for (i = cents; i > 0;) {
    for (j = denomination.length; j >= 0; j--) {
      if (denomination[j] <= i) {
        result[j] += 1;
        i -= denomination[j];  
        break;
      }
    }
  }
  return result;
}