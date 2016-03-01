function createTemplate(template) {
  var re = /\{\{(.+?)\}\}/;
  return function(str) {
    var result = template.split(/(\{\{.+?\}\})/)
      .filter(function(x) {
        return x
      })
      .map(function(e) {
        if (re.test(e)) {
          var match = re.exec(e);
          if (match[1] in str) {
            return str[match[1]];
          } else {
            return "";
          }
        }
        return e;
      })
      .join('');
    return result;
  };
};

