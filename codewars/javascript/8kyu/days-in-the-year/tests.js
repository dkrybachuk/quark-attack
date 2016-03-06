QUnit.test( "test days in the year", function( assert ) {
  assert.equal(yearDays(0), '0 has 366 days', "Passed!" );
  assert.equal(yearDays(-64), '-64 has 366 days', "Passed!" );
  assert.equal(yearDays(2016), '2016 has 366 days', "Passed!" );
  assert.equal(yearDays(1974), '1974 has 365 days', "Passed!" );
  assert.equal(yearDays(-10), '-10 has 365 days', "Passed!" );
  assert.equal(yearDays(666), '666 has 365 days', "Passed!" );
  assert.equal(yearDays(1857), '1857 has 365 days', "Passed!" );
});

