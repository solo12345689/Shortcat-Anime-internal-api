package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.ui.platform.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2701h extends AbstractC2683b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27455d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27456e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C2701h f27457f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BreakIterator f27458c;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2701h a(Locale locale) {
            if (C2701h.f27457f == null) {
                C2701h.f27457f = new C2701h(locale, null);
            }
            C2701h c2701h = C2701h.f27457f;
            AbstractC5504s.f(c2701h, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return c2701h;
        }

        private a() {
        }
    }

    public /* synthetic */ C2701h(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final boolean i(int i10) {
        if (i10 <= 0 || !j(i10 - 1)) {
            return false;
        }
        return i10 == d().length() || !j(i10);
    }

    private final boolean j(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }

    private final boolean k(int i10) {
        if (j(i10)) {
            return i10 == 0 || !j(i10 - 1);
        }
        return false;
    }

    private final void l(Locale locale) {
        this.f27458c = BreakIterator.getWordInstance(locale);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2698g
    public int[] a(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!j(i10) && !k(i10)) {
            BreakIterator breakIterator = this.f27458c;
            if (breakIterator == null) {
                AbstractC5504s.u("impl");
                breakIterator = null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f27458c;
        if (breakIterator2 == null) {
            AbstractC5504s.u("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i10);
        if (iFollowing == -1 || !i(iFollowing)) {
            return null;
        }
        return c(i10, iFollowing);
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
        while (i10 > 0 && !j(i10 - 1) && !i(i10)) {
            BreakIterator breakIterator = this.f27458c;
            if (breakIterator == null) {
                AbstractC5504s.u("impl");
                breakIterator = null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f27458c;
        if (breakIterator2 == null) {
            AbstractC5504s.u("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i10);
        if (iPreceding == -1 || !k(iPreceding)) {
            return null;
        }
        return c(iPreceding, i10);
    }

    @Override // androidx.compose.ui.platform.AbstractC2683b
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f27458c;
        if (breakIterator == null) {
            AbstractC5504s.u("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private C2701h(Locale locale) {
        l(locale);
    }
}
