package t0;

import kotlin.jvm.internal.AbstractC5504s;
import t.C6540F;
import t0.AbstractC6579b;
import t0.l;

/* JADX INFO: renamed from: t0.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6581d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(o(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(q(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final AbstractC6580c c(AbstractC6580c abstractC6580c, I i10, AbstractC6578a abstractC6578a) {
        if (AbstractC6579b.e(abstractC6580c.e(), AbstractC6579b.f60193a.b())) {
            AbstractC5504s.f(abstractC6580c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            F f10 = (F) abstractC6580c;
            if (!f(f10.F(), i10)) {
                return new F(f10, l(e(abstractC6578a.b(), f10.F().c(), i10.c()), f10.E()), i10);
            }
        }
        return abstractC6580c;
    }

    public static /* synthetic */ AbstractC6580c d(AbstractC6580c abstractC6580c, I i10, AbstractC6578a abstractC6578a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            abstractC6578a = AbstractC6578a.f60188b.a();
        }
        return c(abstractC6580c, i10, abstractC6578a);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrN = n(fArr, fArr2);
        float[] fArrN2 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{fArrN2[0] / fArrN[0], fArrN2[1] / fArrN[1], fArrN2[2] / fArrN[2]}, fArr));
    }

    public static final boolean f(I i10, I i11) {
        if (i10 == i11) {
            return true;
        }
        return Math.abs(i10.a() - i11.a()) < 0.001f && Math.abs(i10.b() - i11.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final l h(AbstractC6580c abstractC6580c, AbstractC6580c abstractC6580c2, int i10) {
        int iB = abstractC6580c.b();
        int iB2 = abstractC6580c2.b();
        if ((iB | iB2) < 0) {
            return j(abstractC6580c, abstractC6580c2, i10);
        }
        C6540F c6540fA = m.a();
        int i11 = iB | (iB2 << 6) | (i10 << 12);
        Object objC = c6540fA.c(i11);
        if (objC == null) {
            objC = j(abstractC6580c, abstractC6580c2, i10);
            c6540fA.s(i11, objC);
        }
        return (l) objC;
    }

    public static /* synthetic */ l i(AbstractC6580c abstractC6580c, AbstractC6580c abstractC6580c2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC6580c2 = k.f60205a.G();
        }
        if ((i11 & 2) != 0) {
            i10 = r.f60259a.b();
        }
        return h(abstractC6580c, abstractC6580c2, i10);
    }

    private static final l j(AbstractC6580c abstractC6580c, AbstractC6580c abstractC6580c2, int i10) {
        if (abstractC6580c == abstractC6580c2) {
            return l.f60231g.c(abstractC6580c);
        }
        long jE = abstractC6580c.e();
        AbstractC6579b.a aVar = AbstractC6579b.f60193a;
        if (!AbstractC6579b.e(jE, aVar.b()) || !AbstractC6579b.e(abstractC6580c2.e(), aVar.b())) {
            return new l(abstractC6580c, abstractC6580c2, i10, null);
        }
        AbstractC5504s.f(abstractC6580c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        AbstractC5504s.f(abstractC6580c2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new l.b((F) abstractC6580c, (F) abstractC6580c2, i10, null);
    }

    public static final float[] k(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f10 = fArr[0] * fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        fArr3[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr[1];
        float f16 = fArr2[0];
        float f17 = fArr[4];
        float f18 = fArr[7];
        fArr3[1] = (f15 * f16) + (f12 * f17) + (f18 * f14);
        float f19 = fArr[2] * f16;
        float f20 = fArr[5];
        float f21 = f19 + (fArr2[1] * f20);
        float f22 = fArr[8];
        fArr3[2] = f21 + (f14 * f22);
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = f24 + (f11 * f25);
        float f27 = fArr2[5];
        fArr3[3] = f26 + (f13 * f27);
        float f28 = fArr[1];
        float f29 = fArr2[3];
        fArr3[4] = (f28 * f29) + (f17 * f25) + (f18 * f27);
        float f30 = fArr[2];
        fArr3[5] = (f29 * f30) + (f20 * fArr2[4]) + (f27 * f22);
        float f31 = f23 * fArr2[6];
        float f32 = fArr[3];
        float f33 = fArr2[7];
        float f34 = f31 + (f32 * f33);
        float f35 = fArr2[8];
        fArr3[6] = f34 + (f13 * f35);
        float f36 = fArr2[6];
        fArr3[7] = (f28 * f36) + (fArr[4] * f33) + (f18 * f35);
        fArr3[8] = (f30 * f36) + (fArr[5] * fArr2[7]) + (f22 * f35);
        return fArr3;
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    public static final double o(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double p(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d13 * d10;
    }

    public static final double r(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}
