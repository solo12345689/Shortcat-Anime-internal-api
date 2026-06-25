package Yg;

/* JADX INFO: loaded from: classes5.dex */
final class i extends k {
    i() {
    }

    @Override // Yg.k
    protected short a(short s10) {
        short sB = b(d(s10), s10);
        short sB2 = b(d(d(sB)), sB);
        return d(b(d(b(d(d(b(d(d(d(d(sB2)))), sB2))), sB)), s10));
    }

    @Override // Yg.k
    protected short b(short s10, short s11) {
        int i10 = (s11 & 1) * s10;
        for (int i11 = 1; i11 < 12; i11++) {
            i10 ^= ((1 << i11) & s11) * s10;
        }
        return c(i10);
    }

    protected short c(int i10) {
        return (short) ((i10 >>> 21) ^ ((((i10 & 4095) ^ (i10 >>> 12)) ^ ((2093056 & i10) >>> 9)) ^ ((14680064 & i10) >>> 18)));
    }

    protected short d(short s10) {
        return c(Ug.a.a(s10));
    }
}
