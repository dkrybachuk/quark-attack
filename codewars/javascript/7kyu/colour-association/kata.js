function colourAssociation(array) {
  return array.map((i) => (i.reduce((p, n) => ({[p]: n}))));
}
