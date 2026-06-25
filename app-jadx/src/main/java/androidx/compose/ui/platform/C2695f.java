package androidx.compose.ui.platform;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.ui.platform.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2695f extends AbstractC2683b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27450c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27451d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static C2695f f27452e;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2695f a() {
            if (C2695f.f27452e == null) {
                C2695f.f27452e = new C2695f(null);
            }
            C2695f c2695f = C2695f.f27452e;
            AbstractC5504s.f(c2695f, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return c2695f;
        }

        private a() {
        }
    }

    public /* synthetic */ C2695f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean i(int i10) {
        if (i10 <= 0 || d().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == d().length() || d().charAt(i10) == '\n';
    }

    private final boolean j(int i10) {
        if (d().charAt(i10) != '\n') {
            return i10 == 0 || d().charAt(i10 - 1) == '\n';
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2698g
    public int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && d().charAt(i10) == '\n' && !j(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !i(i11)) {
            i11++;
        }
        return c(i10, i11);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2698g
    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && d().charAt(i10 - 1) == '\n' && !i(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !j(i11)) {
            i11--;
        }
        return c(i11, i10);
    }

    private C2695f() {
    }
}
