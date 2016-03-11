QUnit.test( "test questions existed property", function( assert ) {
  assert.deepEqual(coinCombo(1) , [1, 0, 0, 0],"Passed!");
  assert.deepEqual(coinCombo(6) , [1, 1, 0, 0],"Passed!");
  assert.deepEqual(coinCombo(11) , [1, 0, 1, 0],"Passed!");
});

