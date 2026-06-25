package V0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import b1.AbstractC2968a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f19645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextPaint f19648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextDirectionHeuristic f19650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Layout.Alignment f19651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextUtils.TruncateAt f19653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f19654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f19655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f19656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f19657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f19658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f19659o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f19660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f19661q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f19662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f19663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f19664t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f19665u;

    public l0(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        this.f19645a = charSequence;
        this.f19646b = i10;
        this.f19647c = i11;
        this.f19648d = textPaint;
        this.f19649e = i12;
        this.f19650f = textDirectionHeuristic;
        this.f19651g = alignment;
        this.f19652h = i13;
        this.f19653i = truncateAt;
        this.f19654j = i14;
        this.f19655k = f10;
        this.f19656l = f11;
        this.f19657m = i15;
        this.f19658n = z10;
        this.f19659o = z11;
        this.f19660p = i16;
        this.f19661q = i17;
        this.f19662r = i18;
        this.f19663s = i19;
        this.f19664t = iArr;
        this.f19665u = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            AbstractC2968a.a("invalid start value");
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            AbstractC2968a.a("invalid end value");
        }
        if (!(i13 >= 0)) {
            AbstractC2968a.a("invalid maxLines value");
        }
        if (!(i12 >= 0)) {
            AbstractC2968a.a("invalid width value");
        }
        if (!(i14 >= 0)) {
            AbstractC2968a.a("invalid ellipsizedWidth value");
        }
        if (f10 >= 0.0f) {
            return;
        }
        AbstractC2968a.a("invalid lineSpacingMultiplier value");
    }

    public final Layout.Alignment a() {
        return this.f19651g;
    }

    public final int b() {
        return this.f19660p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f19653i;
    }

    public final int d() {
        return this.f19654j;
    }

    public final int e() {
        return this.f19647c;
    }

    public final int f() {
        return this.f19663s;
    }

    public final boolean g() {
        return this.f19658n;
    }

    public final int h() {
        return this.f19657m;
    }

    public final int[] i() {
        return this.f19664t;
    }

    public final int j() {
        return this.f19661q;
    }

    public final int k() {
        return this.f19662r;
    }

    public final float l() {
        return this.f19656l;
    }

    public final float m() {
        return this.f19655k;
    }

    public final int n() {
        return this.f19652h;
    }

    public final TextPaint o() {
        return this.f19648d;
    }

    public final int[] p() {
        return this.f19665u;
    }

    public final int q() {
        return this.f19646b;
    }

    public final CharSequence r() {
        return this.f19645a;
    }

    public final TextDirectionHeuristic s() {
        return this.f19650f;
    }

    public final boolean t() {
        return this.f19659o;
    }

    public final int u() {
        return this.f19649e;
    }
}
