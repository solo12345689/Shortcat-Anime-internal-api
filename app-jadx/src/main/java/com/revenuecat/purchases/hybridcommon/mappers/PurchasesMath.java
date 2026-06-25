package com.revenuecat.purchases.hybridcommon.mappers;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
class PurchasesMath {
    PurchasesMath() {
    }

    static int addExact(int i10, int i11) {
        int i12 = i10 + i11;
        if (((i10 ^ i12) & (i11 ^ i12)) >= 0) {
            return i12;
        }
        throw new ArithmeticException("integer overflow");
    }

    static int multiplyExact(int i10, int i11) {
        long j10 = ((long) i10) * ((long) i11);
        int i12 = (int) j10;
        if (i12 == j10) {
            return i12;
        }
        throw new ArithmeticException("integer overflow");
    }
}
