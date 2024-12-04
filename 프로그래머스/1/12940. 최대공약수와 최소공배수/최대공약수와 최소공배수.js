function solution(n, m) {
    const gcd = (n, m) => (m === 0 ? n : gcd(m, n % m));
    const lcm = (n * m) / gcd(n, m);

    return [gcd(n, m), lcm];
}