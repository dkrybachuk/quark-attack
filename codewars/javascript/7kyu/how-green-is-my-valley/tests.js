QUnit.test( "makeValley test1", function( assert ) {
  assert.deepEqual( makeValley([79, 35, 54, 19, 35, 25]), [79, 35, 25, 19, 35, 54], "Passed!" );
});

QUnit.test( "makeValley test2", function( assert ) {
  assert.deepEqual( makeValley([67, 93, 100, -16, 65, 97, 92]), [100, 93, 67, -16, 65, 92, 97], "Passed!" );
});

QUnit.test( "makeValley test3", function( assert ) {
  assert.deepEqual( makeValley([66, 55, 100, 68, 46, -82, 12, 72, 12, 38]), [100, 68, 55, 38, 12, -82, 12, 46, 66, 72], "Passed!" );
});

QUnit.test( "makeValley test4", function( assert ) {
  assert.deepEqual( makeValley([14,14,14,14,7,14]), [14, 14, 14, 7, 14, 14], "Passed!" );
});

QUnit.test( "makeValley test5", function( assert ) {
  assert.deepEqual( makeValley([14,14,14,14,14]), [14, 14, 14, 14, 14], "Passed!" );
});