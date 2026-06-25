package s0;

import k1.AbstractC5437b;
import kotlin.jvm.internal.AbstractC5504s;
import t0.AbstractC6579b;
import t0.AbstractC6580c;

/* JADX INFO: renamed from: s0.s0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6387s0 {
    /* JADX WARN: Removed duplicated region for block: B:226:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(float r20, float r21, float r22, float r23, t0.AbstractC6580c r24) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.AbstractC6387s0.a(float, float, float, float, t0.c):long");
    }

    public static final long b(int i10) {
        return C6385r0.n(Td.F.b(Td.F.b(i10) << 32));
    }

    public static final long c(int i10, int i11, int i12, int i13) {
        return b(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static final long d(long j10) {
        return C6385r0.n(Td.F.b(j10 << 32));
    }

    public static /* synthetic */ long e(float f10, float f11, float f12, float f13, AbstractC6580c abstractC6580c, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            abstractC6580c = t0.k.f60205a.G();
        }
        return a(f10, f11, f12, f13, abstractC6580c);
    }

    public static /* synthetic */ long f(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return c(i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long g(float r17, float r18, float r19, float r20, t0.AbstractC6580c r21) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.AbstractC6387s0.g(float, float, float, float, t0.c):long");
    }

    public static final long h(long j10, long j11) {
        long jO = C6385r0.o(j10, C6385r0.v(j11));
        float fT = C6385r0.t(j11);
        float fT2 = C6385r0.t(jO);
        float f10 = 1.0f - fT2;
        float f11 = (fT * f10) + fT2;
        return g(f11 == 0.0f ? 0.0f : ((C6385r0.x(jO) * fT2) + ((C6385r0.x(j11) * fT) * f10)) / f11, f11 == 0.0f ? 0.0f : ((C6385r0.w(jO) * fT2) + ((C6385r0.w(j11) * fT) * f10)) / f11, f11 != 0.0f ? ((C6385r0.u(jO) * fT2) + ((C6385r0.u(j11) * fT) * f10)) / f11 : 0.0f, f11, C6385r0.v(j11));
    }

    public static final long i(long j10, long j11, float f10) {
        AbstractC6580c abstractC6580cD = t0.k.f60205a.D();
        long jO = C6385r0.o(j10, abstractC6580cD);
        long jO2 = C6385r0.o(j11, abstractC6580cD);
        float fT = C6385r0.t(jO);
        float fX = C6385r0.x(jO);
        float fW = C6385r0.w(jO);
        float fU = C6385r0.u(jO);
        float fT2 = C6385r0.t(jO2);
        float fX2 = C6385r0.x(jO2);
        float fW2 = C6385r0.w(jO2);
        float fU2 = C6385r0.u(jO2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return C6385r0.o(g(AbstractC5437b.b(fX, fX2, f10), AbstractC5437b.b(fW, fW2, f10), AbstractC5437b.b(fU, fU2, f10), AbstractC5437b.b(fT, fT2, f10), abstractC6580cD), C6385r0.v(j11));
    }

    public static final float j(long j10) {
        AbstractC6580c abstractC6580cV = C6385r0.v(j10);
        if (!AbstractC6579b.e(abstractC6580cV.e(), AbstractC6579b.f60193a.b())) {
            AbstractC6350e1.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC6579b.h(abstractC6580cV.e())));
        }
        AbstractC5504s.f(abstractC6580cV, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        t0.n nVarW = ((t0.F) abstractC6580cV).w();
        float fA = (float) ((nVarW.a(C6385r0.x(j10)) * 0.2126d) + (nVarW.a(C6385r0.w(j10)) * 0.7152d) + (nVarW.a(C6385r0.u(j10)) * 0.0722d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int k(long j10) {
        return (int) Td.F.b(C6385r0.o(j10, t0.k.f60205a.G()) >>> 32);
    }
}
