package H7;

import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f8092a = new o();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8093a;

        static {
            int[] iArr = new int[EnumC3304u.values().length];
            try {
                iArr[EnumC3304u.f37832a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3304u.f37833b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8093a = iArr;
        }
    }

    private o() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[PHI: r6
  0x007e: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v5 int) binds: [B:5:0x0013, B:8:0x0018, B:11:0x003d, B:12:0x003f, B:13:0x0041, B:24:0x0099, B:21:0x0089, B:17:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List b(H7.w[] r23) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H7.o.b(H7.w[]):java.util.List");
    }

    private final Float c(C3303t c3303t, float f10) {
        if (c3303t == null) {
            return null;
        }
        int i10 = a.f8093a[c3303t.a().ordinal()];
        if (i10 == 1) {
            return Float.valueOf(B.i(c3303t.b(0.0f)) / f10);
        }
        if (i10 == 2) {
            return Float.valueOf(c3303t.b(1.0f));
        }
        throw new Td.r();
    }

    public final List a(List colorStops, float f10) {
        AbstractC5504s.h(colorStops, "colorStops");
        int size = colorStops.size();
        w[] wVarArr = new w[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            wVarArr[i11] = new w(null, null, 3, null);
        }
        Float fC = c(((n) colorStops.get(0)).b(), f10);
        float fFloatValue = fC != null ? fC.floatValue() : 0.0f;
        int size2 = colorStops.size();
        int i12 = 0;
        boolean z10 = false;
        while (i12 < size2) {
            n nVar = (n) colorStops.get(i12);
            Float fC2 = c(nVar.b(), f10);
            if (fC2 == null) {
                fC2 = i12 == 0 ? Float.valueOf(0.0f) : i12 == colorStops.size() - 1 ? Float.valueOf(1.0f) : null;
            }
            if (fC2 != null) {
                fFloatValue = Math.max(fC2.floatValue(), fFloatValue);
                wVarArr[i12] = new w(nVar.a(), Float.valueOf(fFloatValue));
            } else {
                z10 = true;
            }
            i12++;
        }
        if (z10) {
            for (int i13 = 1; i13 < size; i13++) {
                Float fB = wVarArr[i13].b();
                Float fB2 = wVarArr[i10].b();
                int i14 = i13 - i10;
                int i15 = i14 - 1;
                if (fB != null && fB2 != null && i15 > 0) {
                    float fFloatValue2 = (fB.floatValue() - fB2.floatValue()) / i14;
                    if (1 <= i15) {
                        int i16 = 1;
                        while (true) {
                            int i17 = i10 + i16;
                            wVarArr[i17] = new w(((n) colorStops.get(i17)).a(), Float.valueOf(fB2.floatValue() + (i16 * fFloatValue2)));
                            if (i16 == i15) {
                                break;
                            }
                            i16++;
                        }
                    }
                    i10 = i13;
                }
            }
        }
        return b(wVarArr);
    }
}
