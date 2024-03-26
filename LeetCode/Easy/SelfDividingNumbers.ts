function selfDividingNumbers(left: number, right: number): number[] {
  const lst: number[] = [];

  while (left < 10) {
    lst.push(left++);
  }

  for (let i = left; i <= right; i++) {
    let isSelfDividing: boolean = true;
    let n: number = i;
    while ((n | 0) > 0) {
      if (i % ((n | 0) % 10) !== 0) {
        isSelfDividing = false;
        break;
      }
      n /= 10;
    }
    if (isSelfDividing) lst.push(i);
  }

  return lst;
}
