package i1;

import r0.C6230l;

/* JADX INFO: renamed from: i1.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5011d extends InterfaceC5019l {
    default float A(int i10) {
        return C5015h.n(i10 / getDensity());
    }

    default long Q(long j10) {
        return j10 != 9205357640488583168L ? AbstractC5016i.b(e1(Float.intBitsToFloat((int) (j10 >> 32))), e1(Float.intBitsToFloat((int) (j10 & 4294967295L)))) : C5018k.f48556b.a();
    }

    default long d0(float f10) {
        return O(e1(f10));
    }

    default float e1(float f10) {
        return C5015h.n(f10 / getDensity());
    }

    float getDensity();

    default float l1(float f10) {
        return f10 * getDensity();
    }

    default int s0(float f10) {
        float fL1 = l1(f10);
        if (Float.isInfinite(fL1)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fL1);
    }

    default long w1(long j10) {
        if (j10 == 9205357640488583168L) {
            return C6230l.f58350b.a();
        }
        float fL1 = l1(C5018k.h(j10));
        return C6230l.d((((long) Float.floatToRawIntBits(l1(C5018k.g(j10)))) & 4294967295L) | (Float.floatToRawIntBits(fL1) << 32));
    }

    default float z0(long j10) {
        if (!C5031x.g(C5029v.g(j10), C5031x.f48582b.b())) {
            AbstractC5020m.b("Only Sp can convert to Px");
        }
        return l1(T(j10));
    }
}
