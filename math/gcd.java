int gcd(int a, int b) { 
	return b==0 ? Math.abs(a) : gcd(b, a%b);
}

BigInteger bigGcd(BigInteger a, BigInteger b) { 
	return a.gcd(b);
}