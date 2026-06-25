package v;

import i1.InterfaceC5011d;
import w.AbstractC6873B;
import w.InterfaceC6921z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final void b(float[] fArr, float[] fArr2, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19 = 0.0f;
        int i11 = 0;
        float f20 = 0.0f;
        while (true) {
            float f21 = 1.0f;
            if (i11 >= i10) {
                fArr2[i10] = 1.0f;
                fArr[i10] = 1.0f;
                return;
            }
            float f22 = i11 / i10;
            float f23 = 1.0f;
            while (true) {
                f10 = ((f23 - f19) / 2.0f) + f19;
                f11 = f21 - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f24 = (((f11 * 0.175f) + (f10 * 0.35000002f)) * f12) + f13;
                f14 = f21;
                if (Math.abs(f24 - f22) < 1.0E-5d) {
                    break;
                }
                if (f24 > f22) {
                    f23 = f10;
                } else {
                    f19 = f10;
                }
                f21 = f14;
            }
            float f25 = 0.5f;
            fArr[i11] = (f12 * ((f11 * 0.5f) + f10)) + f13;
            float f26 = f14;
            while (true) {
                f15 = ((f26 - f20) / 2.0f) + f20;
                f16 = f14 - f15;
                f17 = f15 * 3.0f * f16;
                f18 = f15 * f15 * f15;
                float f27 = (((f16 * f25) + f15) * f17) + f18;
                float f28 = f22;
                if (Math.abs(f27 - f22) >= 1.0E-5d) {
                    if (f27 > f28) {
                        f26 = f15;
                    } else {
                        f20 = f15;
                    }
                    f22 = f28;
                    f25 = 0.5f;
                }
            }
            fArr2[i11] = (f17 * ((f16 * 0.175f) + (f15 * 0.35000002f))) + f18;
            i11++;
        }
    }

    public static final InterfaceC6921z c(InterfaceC5011d interfaceC5011d) {
        return AbstractC6873B.b(new z(interfaceC5011d));
    }
}
