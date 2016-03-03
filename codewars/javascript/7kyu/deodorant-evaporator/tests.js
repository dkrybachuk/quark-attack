QUnit.test( "test evaporator", function( assert ) {
  assert.equal(evaporator(10,10,10),22, "Passed!");
  assert.equal(evaporator(10,10,5),29, "Passed!");
  assert.equal(evaporator(100,5,5),59, "Passed!");
  assert.equal(evaporator(50,12,1),37, "Passed!");
});

