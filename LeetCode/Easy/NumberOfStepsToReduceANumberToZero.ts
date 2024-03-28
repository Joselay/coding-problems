function numberOfSteps(num: number): number {
  let res = 0;
  while (num > 0) {
    if (num & 1) {
      num--;
    } else {
      num /= 2;
    }
    res++;
  }
  return res;
}
