QUnit.test( "test color association", function( assert ) {
  assert.deepEqual(colourAssociation([["white", "goodness"],["blue", "tranquility"]]), [{white:"goodness"},{blue:"tranquility"}], "Passed!");
});

