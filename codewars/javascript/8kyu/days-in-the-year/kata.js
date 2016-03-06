function yearDays(year) {
  var days = (year % 400) === 0 || (year % 4) === 0 && (year % 100) ? 366 : 365;
  return year + ' has ' + days + ' days';
}
