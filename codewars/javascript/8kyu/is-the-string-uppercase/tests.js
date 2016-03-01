QUnit.test( "should work for the examples provided in the description", function( assert ) {
  assert.ok(''.isUpperCase() !== undefined, 'Must define the prototype isUpperCase')
  assert.equal('c'.isUpperCase(), false, 'c is not upper case');
  assert.equal('C'.isUpperCase(), true, 'C is upper case');
  assert.equal('hello I AM DONALD'.isUpperCase(), false, 'hello I AM DONALD not is upper case');
  assert.equal('HELLO I AM DONALD'.isUpperCase(), true, 'HELLO I AM DONALD is upper case');
  assert.equal('ACSKLDFJSgSKLDFJSKLDFJ'.isUpperCase(), false, 'ACSKLDFJSgSKLDFJSKLDFJ not is upper case');
  assert.equal('ACSKLDFJSGSKLDFJSKLDFJ'.isUpperCase(), true, 'ACSKLDFJSGSKLDFJSKLDFJ is upper case');
});

QUnit.test( "should also work for a few other basic tests", function( assert ) {
  assert.equal('Hello World'.isUpperCase(), false, 'Hello World is not upper case');
  assert.equal('hello world'.isUpperCase(), false, 'hello world is not upper case');
  assert.equal('Hello world'.isUpperCase(), false, 'Hello world is not upper case');
  assert.equal('hello World'.isUpperCase(), false, 'hello World is not upper case');
  assert.equal('HELLO WORLD'.isUpperCase(), true, 'HELLO WORLD is upper case');
  assert.equal('Bob walks his dog every day.'.isUpperCase(), false, 'Bob walks his dog every day. is not upper case');
  assert.equal('BOB walks his dog every day.'.isUpperCase(), false, 'BOB walks his dog every day. is not upper case');
  assert.equal('BOB WALKS HIS DOG EVERY DAY.'.isUpperCase(), true, 'BOB WALKS HIS DOG EVERY DAY. is upper case');
  assert.equal('BOB WALKs HIS DOG EVERY DAY.'.isUpperCase(), false, 'BOB WALKs HIS DOG EVERY DAY. is not upper case');
  assert.equal('#lovewins'.isUpperCase(), false, '#lovewins is not upper case');
  assert.equal('#Lovewins'.isUpperCase(), false, '#Lovewins is not upper case');
  assert.equal('#loveWins'.isUpperCase(), false, '#loveWins is not upper case');
  assert.equal('#LoveWins'.isUpperCase(), false, '#LoveWins is not upper case');
  assert.equal('#LOVEWins'.isUpperCase(), false, '#LOVEWins is not upper case');
  assert.equal('#LoveWINS'.isUpperCase(), false, '#LoveWINS is not upper case');
  assert.equal('#LOVEWINs'.isUpperCase(), false, '#LOVEWINs is not upper case');
  assert.equal('#lOVEWINS'.isUpperCase(), false, '#lOVEWINS is not upper case');
  assert.equal('#LOVEWINS'.isUpperCase(), true, '#LOVEWINS is upper case');
});
