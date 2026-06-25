package U0;

import g1.C4832l;
import i1.EnumC5027t;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Z0 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18793a;

        static {
            int[] iArr = new int[EnumC5027t.values().length];
            try {
                iArr[EnumC5027t.f48573a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5027t.f48574b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18793a = iArr;
        }
    }

    public static final G b(F f10, E e10) {
        if (f10 == null && e10 == null) {
            return null;
        }
        return AbstractC2195d.a(f10, e10);
    }

    public static final Y0 c(Y0 y02, Y0 y03, float f10) {
        return new Y0(K0.c(y02.O(), y03.O(), f10), C.b(y02.N(), y03.N(), f10));
    }

    public static final Y0 d(Y0 y02, EnumC5027t enumC5027t) {
        return new Y0(K0.h(y02.A()), C.e(y02.x(), enumC5027t), y02.y());
    }

    public static final int e(EnumC5027t enumC5027t, int i10) {
        C4832l.a aVar = C4832l.f47292b;
        if (C4832l.j(i10, aVar.a())) {
            int i11 = a.f18793a[enumC5027t.ordinal()];
            if (i11 == 1) {
                return aVar.b();
            }
            if (i11 == 2) {
                return aVar.c();
            }
            throw new Td.r();
        }
        if (!C4832l.j(i10, aVar.f())) {
            return i10;
        }
        int i12 = a.f18793a[enumC5027t.ordinal()];
        if (i12 == 1) {
            return aVar.d();
        }
        if (i12 == 2) {
            return aVar.e();
        }
        throw new Td.r();
    }
}
