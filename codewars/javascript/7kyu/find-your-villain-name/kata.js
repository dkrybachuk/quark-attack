var getVillainName = function (birthday) {
  return first_name[birthday.getMonth()].name
  + ' '
  + last_name[birthday.getDate() % 10];
};