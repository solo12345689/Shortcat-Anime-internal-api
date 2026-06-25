package Y0;

import Ud.AbstractC2279u;
import b1.AbstractC2968a;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class L implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final a f22613b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final L f22614c;

    /* JADX INFO: renamed from: d */
    private static final L f22615d;

    /* JADX INFO: renamed from: e */
    private static final L f22616e;

    /* JADX INFO: renamed from: f */
    private static final L f22617f;

    /* JADX INFO: renamed from: g */
    private static final L f22618g;

    /* JADX INFO: renamed from: h */
    private static final L f22619h;

    /* JADX INFO: renamed from: i */
    private static final L f22620i;

    /* JADX INFO: renamed from: j */
    private static final L f22621j;

    /* JADX INFO: renamed from: k */
    private static final L f22622k;

    /* JADX INFO: renamed from: l */
    private static final L f22623l;

    /* JADX INFO: renamed from: m */
    private static final L f22624m;

    /* JADX INFO: renamed from: n */
    private static final L f22625n;

    /* JADX INFO: renamed from: o */
    private static final L f22626o;

    /* JADX INFO: renamed from: p */
    private static final L f22627p;

    /* JADX INFO: renamed from: q */
    private static final L f22628q;

    /* JADX INFO: renamed from: r */
    private static final L f22629r;

    /* JADX INFO: renamed from: s */
    private static final L f22630s;

    /* JADX INFO: renamed from: t */
    private static final L f22631t;

    /* JADX INFO: renamed from: u */
    private static final List f22632u;

    /* JADX INFO: renamed from: a */
    private final int f22633a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final L a() {
            return L.f22631t;
        }

        public final L b() {
            return L.f22629r;
        }

        public final L c() {
            return L.f22630s;
        }

        public final L d() {
            return L.f22624m;
        }

        public final L e() {
            return L.f22625n;
        }

        public final L f() {
            return L.f22627p;
        }

        public final L g() {
            return L.f22626o;
        }

        public final L h() {
            return L.f22628q;
        }

        public final L i() {
            return L.f22623l;
        }

        public final L j() {
            return L.f22617f;
        }

        public final L k() {
            return L.f22618g;
        }

        public final L l() {
            return L.f22619h;
        }

        private a() {
        }
    }

    static {
        L l10 = new L(100);
        f22614c = l10;
        L l11 = new L(200);
        f22615d = l11;
        L l12 = new L(300);
        f22616e = l12;
        L l13 = new L(400);
        f22617f = l13;
        L l14 = new L(500);
        f22618g = l14;
        L l15 = new L(600);
        f22619h = l15;
        L l16 = new L(ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD);
        f22620i = l16;
        L l17 = new L(800);
        f22621j = l17;
        L l18 = new L(900);
        f22622k = l18;
        f22623l = l10;
        f22624m = l11;
        f22625n = l12;
        f22626o = l13;
        f22627p = l14;
        f22628q = l15;
        f22629r = l16;
        f22630s = l17;
        f22631t = l18;
        f22632u = AbstractC2279u.p(l10, l11, l12, l13, l14, l15, l16, l17, l18);
    }

    public L(int i10) {
        this.f22633a = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC2968a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L) && this.f22633a == ((L) obj).f22633a;
    }

    public int hashCode() {
        return this.f22633a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f22633a + ')';
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: u */
    public int compareTo(L l10) {
        return AbstractC5504s.i(this.f22633a, l10.f22633a);
    }

    public final int v() {
        return this.f22633a;
    }
}
