QUnit.test( "test simple template", function( assert ) {
  let personTmpl = createTemplate("{{name}} likes {{animalType}}");
  assert.equal( personTmpl({ name: "John", animalType: "dogs" }), "John likes dogs", "Passed!" );
});
