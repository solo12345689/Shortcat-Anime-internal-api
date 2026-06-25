package U;

import U0.Y0;
import Y.AbstractC2394b1;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.common.verification.SigningManager;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC2394b1 f18642a = Y.H.j(a.f18643a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18643a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o0 invoke() {
            return new o0(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18644a;

        static {
            int[] iArr = new int[X.u.values().length];
            try {
                iArr[X.u.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[X.u.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[X.u.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[X.u.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[X.u.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[X.u.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[X.u.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[X.u.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[X.u.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[X.u.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[X.u.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[X.u.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[X.u.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[X.u.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[X.u.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f18644a = iArr;
        }
    }

    private static final Y0 a(o0 o0Var, X.u uVar) {
        switch (b.f18644a[uVar.ordinal()]) {
            case 1:
                return o0Var.e();
            case 2:
                return o0Var.f();
            case 3:
                return o0Var.g();
            case 4:
                return o0Var.h();
            case 5:
                return o0Var.i();
            case 6:
                return o0Var.j();
            case 7:
                return o0Var.n();
            case 8:
                return o0Var.o();
            case 9:
                return o0Var.p();
            case 10:
                return o0Var.b();
            case 11:
                return o0Var.c();
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return o0Var.d();
            case 13:
                return o0Var.k();
            case 14:
                return o0Var.l();
            case 15:
                return o0Var.m();
            default:
                throw new Td.r();
        }
    }

    public static final AbstractC2394b1 b() {
        return f18642a;
    }

    public static final Y0 c(X.u uVar, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1049072145, i10, -1, "androidx.compose.material3.<get-value> (Typography.kt:209)");
        }
        Y0 y0A = a(D.f17597a.c(interfaceC2425m, 6), uVar);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return y0A;
    }
}
