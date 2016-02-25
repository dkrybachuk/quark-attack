QUnit.test( "test questions existed property", function( assert ) {
  assert.ok( questions[0].question === 'What\'s the currency of the USA?', "Passed!" );
});

QUnit.test( "test questions", function( assert ) {
  assert.ok( questions[0].usersAnswer === null, "Passed!" );
});
