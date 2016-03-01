function createTemplate(template) {
  return values => template.replace(/\{\{(.+?)\}\}/g, (_, k) => values[k] || "");
};

