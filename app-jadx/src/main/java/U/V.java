package U;

import Y.AbstractC2394b1;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;
import s0.E1;
import s0.t1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC2394b1 f17890a = Y.H.j(a.f17891a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17891a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U invoke() {
            return new U(null, null, null, null, null, 31, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17892a;

        static {
            int[] iArr = new int[X.l.values().length];
            try {
                iArr[X.l.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[X.l.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[X.l.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[X.l.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[X.l.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[X.l.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[X.l.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[X.l.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[X.l.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[X.l.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[X.l.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f17892a = iArr;
        }
    }

    public static final J.a a(J.a aVar) {
        float f10 = (float) 0.0d;
        return J.a.b(aVar, J.c.c(C5015h.n(f10)), null, null, J.c.c(C5015h.n(f10)), 6, null);
    }

    public static final E1 b(U u10, X.l lVar) {
        switch (b.f17892a[lVar.ordinal()]) {
            case 1:
                return u10.a();
            case 2:
                return e(u10.a());
            case 3:
                return u10.b();
            case 4:
                return e(u10.b());
            case 5:
                return J.i.g();
            case 6:
                return u10.c();
            case 7:
                return a(u10.c());
            case 8:
                return e(u10.c());
            case 9:
                return u10.d();
            case 10:
                return t1.a();
            case 11:
                return u10.e();
            default:
                throw new Td.r();
        }
    }

    public static final AbstractC2394b1 c() {
        return f17890a;
    }

    public static final E1 d(X.l lVar, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1629172543, i10, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
        }
        E1 e1B = b(D.f17597a.b(interfaceC2425m, 6), lVar);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return e1B;
    }

    public static final J.a e(J.a aVar) {
        float f10 = (float) 0.0d;
        return J.a.b(aVar, null, null, J.c.c(C5015h.n(f10)), J.c.c(C5015h.n(f10)), 3, null);
    }
}
