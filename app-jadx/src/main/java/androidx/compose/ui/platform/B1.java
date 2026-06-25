package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class B1 extends View implements K0.o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f27193b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27194c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f27195d = b.f27199a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ViewOutlineProvider f27196e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f27197f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2697f1 f27198a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC5504s.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineA = ((B1) view).f27198a.a();
            AbstractC5504s.e(outlineA);
            outline.set(outlineA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27199a = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Matrix) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return B1.f27197f;
        }

        private c() {
        }
    }
}
