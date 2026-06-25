package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2686c extends AbstractC2683b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27417d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27418e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C2686c f27419f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BreakIterator f27420c;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2686c a(Locale locale) {
            if (C2686c.f27419f == null) {
                C2686c.f27419f = new C2686c(locale, null);
            }
            C2686c c2686c = C2686c.f27419f;
            AbstractC5504s.f(c2686c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return c2686c;
        }

        private a() {
        }
    }

    public /* synthetic */ C2686c(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final void i(Locale locale) {
        this.f27420c = BreakIterator.getCharacterInstance(locale);
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
        do {
            BreakIterator breakIterator = this.f27420c;
            if (breakIterator == null) {
                AbstractC5504s.u("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f27420c;
                if (breakIterator2 == null) {
                    AbstractC5504s.u("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i10, iFollowing);
            }
            BreakIterator breakIterator3 = this.f27420c;
            if (breakIterator3 == null) {
                AbstractC5504s.u("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.following(i10);
        } while (i10 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f27420c;
            if (breakIterator == null) {
                AbstractC5504s.u("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f27420c;
                if (breakIterator2 == null) {
                    AbstractC5504s.u("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i10);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i10);
            }
            BreakIterator breakIterator3 = this.f27420c;
            if (breakIterator3 == null) {
                AbstractC5504s.u("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.preceding(i10);
        } while (i10 != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractC2683b
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f27420c;
        if (breakIterator == null) {
            AbstractC5504s.u("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private C2686c(Locale locale) {
        i(locale);
    }
}
