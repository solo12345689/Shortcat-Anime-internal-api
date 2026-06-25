package z;

import Y.AbstractC2394b1;
import Y.H;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import w.AbstractC6906j;
import w.C6919x;
import w.InterfaceC6904i;

/* JADX INFO: renamed from: z.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7263e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC2394b1 f65286a = H.i(a.f65288a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC7262d f65287b = new b();

    /* JADX INFO: renamed from: z.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f65288a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7262d invoke(Y.E e10) {
            return !((Context) e10.c(AndroidCompositionLocals_androidKt.g())).getPackageManager().hasSystemFeature("android.software.leanback") ? InterfaceC7262d.f65282a.b() : AbstractC7263e.b();
        }
    }

    /* JADX INFO: renamed from: z.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC7262d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f65290c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f65289b = 0.3f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC6904i f65291d = AbstractC6906j.j(125, 0, new C6919x(0.25f, 0.1f, 0.25f, 1.0f), 2, null);

        b() {
        }

        @Override // z.InterfaceC7262d
        public float a(float f10, float f11, float f12) {
            float fAbs = Math.abs((f11 + f10) - f10);
            boolean z10 = fAbs <= f12;
            float f13 = (this.f65289b * f12) - (this.f65290c * fAbs);
            float f14 = f12 - f13;
            if (z10 && f14 < fAbs) {
                f13 = f12 - fAbs;
            }
            return f10 - f13;
        }

        @Override // z.InterfaceC7262d
        public InterfaceC6904i b() {
            return this.f65291d;
        }
    }

    public static final AbstractC2394b1 a() {
        return f65286a;
    }

    public static final InterfaceC7262d b() {
        return f65287b;
    }
}
