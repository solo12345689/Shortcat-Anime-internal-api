package w;

/* JADX INFO: renamed from: w.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6897e0 {
    public static final long a(double d10, double d11, double d12, double d13, double d14) {
        double dSqrt = 2.0d * d11 * Math.sqrt(d10);
        double d15 = (dSqrt * dSqrt) - (d10 * 4.0d);
        double d16 = -dSqrt;
        C6917v c6917vA = AbstractC6918w.a(d15);
        c6917vA.f62726a += d16;
        c6917vA.f62726a *= 0.5d;
        c6917vA.f62727b *= 0.5d;
        C6917v c6917vA2 = AbstractC6918w.a(d15);
        double d17 = -1;
        c6917vA2.f62726a *= d17;
        c6917vA2.f62727b *= d17;
        c6917vA2.f62726a += d16;
        c6917vA2.f62726a *= 0.5d;
        c6917vA2.f62727b *= 0.5d;
        return d(c6917vA, c6917vA2, d11, d12, d13, d14);
    }

    public static final long b(float f10, float f11, float f12, float f13, float f14) {
        if (f11 == 0.0f) {
            return 9223372036854L;
        }
        return a(f10, f11, f12, f13, f14);
    }

    private static final double c(C6917v c6917v, double d10, double d11, double d12) {
        double d13 = d12;
        double dF = c6917v.f();
        double d14 = dF * d10;
        double d15 = d11 - d14;
        double dLog = Math.log(Math.abs(d13 / d10)) / dF;
        double dLog2 = Math.log(Math.abs(d13 / d15));
        double dLog3 = dLog2;
        for (int i10 = 0; i10 < 6; i10++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / dF));
        }
        double d16 = dLog3 / dF;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d16;
        } else if ((Double.isInfinite(d16) || Double.isNaN(d16)) ? false : true) {
            dLog = Math.max(dLog, d16);
        }
        double d17 = (-(d14 + d15)) / (dF * d15);
        double d18 = dF * d17;
        double dExp = (Math.exp(d18) * d10) + (d15 * d17 * Math.exp(d18));
        if (Double.isNaN(d17) || d17 <= 0.0d) {
            d13 = -d13;
        } else if (d17 <= 0.0d || (-dExp) >= d13) {
            dLog = (-(2.0d / dF)) - (d10 / d15);
        } else {
            if (d15 < 0.0d && d10 > 0.0d) {
                dLog = 0.0d;
            }
            d13 = -d13;
        }
        double dAbs = Double.MAX_VALUE;
        int i11 = 0;
        while (dAbs > 0.001d && i11 < 100) {
            i11++;
            double d19 = dF * dLog;
            double d20 = d13;
            double dExp2 = dLog - ((((d10 + (d15 * dLog)) * Math.exp(d19)) + d13) / ((((((double) 1) + d19) * d15) + d14) * Math.exp(d19)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d13 = d20;
        }
        return dLog;
    }

    private static final long d(C6917v c6917v, C6917v c6917v2, double d10, double d11, double d12, double d13) {
        if (d12 == 0.0d && d11 == 0.0d) {
            return 0L;
        }
        if (d12 < 0.0d) {
            d11 = -d11;
        }
        double d14 = d11;
        double dAbs = Math.abs(d12);
        return (long) ((d10 > 1.0d ? e(c6917v, c6917v2, dAbs, d14, d13) : d10 < 1.0d ? g(c6917v, dAbs, d14, d13) : c(c6917v, dAbs, d14, d13)) * 1000.0d);
    }

    private static final double e(C6917v c6917v, C6917v c6917v2, double d10, double d11, double d12) {
        double d13 = d12;
        double dF = c6917v.f();
        double dF2 = c6917v2.f();
        double d14 = dF - dF2;
        double d15 = ((dF * d10) - d11) / d14;
        double d16 = d10 - d15;
        double dLog = Math.log(Math.abs(d13 / d16)) / dF;
        double dLog2 = Math.log(Math.abs(d13 / d15)) / dF2;
        if ((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true) {
            if ((Double.isInfinite(dLog2) || Double.isNaN(dLog2)) ? false : true) {
                dLog = Math.max(dLog, dLog2);
            }
            dLog2 = dLog;
        }
        double d17 = d16 * dF;
        double dLog3 = Math.log(d17 / ((-d15) * dF2)) / (dF2 - dF);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d13 = -d13;
        } else if (dLog3 <= 0.0d || (-f(d16, dF, dLog3, d15, dF2)) >= d13) {
            dLog2 = Math.log((-((d15 * dF2) * dF2)) / (d17 * dF)) / d14;
        } else {
            if (d15 > 0.0d && d16 < 0.0d) {
                dLog2 = 0.0d;
            }
            d13 = -d13;
        }
        double d18 = d15 * dF2;
        if (Math.abs((Math.exp(dF * dLog2) * d17) + (Math.exp(dF2 * dLog2) * d18)) < 1.0E-4d) {
            return dLog2;
        }
        double d19 = Double.MAX_VALUE;
        double d20 = d13;
        int i10 = 0;
        while (d19 > 0.001d && i10 < 100) {
            i10++;
            double d21 = dF * dLog2;
            double d22 = dF2 * dLog2;
            double dExp = dLog2 - ((((Math.exp(d21) * d16) + (Math.exp(d22) * d15)) + d20) / ((Math.exp(d21) * d17) + (Math.exp(d22) * d18)));
            double dAbs = Math.abs(dLog2 - dExp);
            dLog2 = dExp;
            d19 = dAbs;
        }
        return dLog2;
    }

    private static final double f(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    private static final double g(C6917v c6917v, double d10, double d11, double d12) {
        double dF = c6917v.f();
        double dE = (d11 - (dF * d10)) / c6917v.e();
        return Math.log(d12 / Math.sqrt((d10 * d10) + (dE * dE))) / dF;
    }
}
