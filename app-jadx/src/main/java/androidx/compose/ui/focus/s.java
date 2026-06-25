package androidx.compose.ui.focus;

import K0.AbstractC1792i;
import K0.InterfaceC1790h;
import androidx.compose.ui.platform.AbstractC2739w0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26690a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f26691b = d(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26692c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f26693d = d(2);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return s.f26691b;
        }

        public final int b() {
            return s.f26693d;
        }

        private a() {
        }
    }

    public static final boolean c(int i10, InterfaceC1790h interfaceC1790h) {
        if (e(i10, f26691b)) {
            return true;
        }
        if (e(i10, f26692c)) {
            return !A0.a.f(((A0.b) AbstractC1792i.a(interfaceC1790h, AbstractC2739w0.j())).a(), A0.a.f96b.b());
        }
        if (e(i10, f26693d)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    private static int d(int i10) {
        return i10;
    }
}
