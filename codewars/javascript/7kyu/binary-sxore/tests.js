QUnit.test( "test questions existed property", function( assert ) {
  assert.equal( sxor(0), 0, "Passed!" );
  assert.equal( sxor(1), 1, "Passed!" );
  assert.equal( sxor(50), 51, "Passed!" );
  assert.equal( sxor(1000000), 1000000, "Passed!" );
});
