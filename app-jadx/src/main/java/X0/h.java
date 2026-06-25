package X0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import b1.AbstractC2968a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f21580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f21581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21582h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21583i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21584j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21585k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21587m;

    public h(float f10, int i10, int i11, boolean z10, boolean z11, float f11, boolean z12) {
        this.f21575a = f10;
        this.f21576b = i10;
        this.f21577c = i11;
        this.f21578d = z10;
        this.f21579e = z11;
        this.f21580f = f11;
        this.f21581g = z12;
        if ((0.0f <= f11 && f11 <= 1.0f) || f11 == -1.0f) {
            return;
        }
        AbstractC2968a.c("topRatio should be in [0..1] range or -1");
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iCeil = (int) Math.ceil(this.f21575a);
        int iA = iCeil - i.a(fontMetricsInt);
        if (this.f21581g && iA <= 0) {
            int i10 = fontMetricsInt.ascent;
            this.f21583i = i10;
            int i11 = fontMetricsInt.descent;
            this.f21584j = i11;
            this.f21582h = i10;
            this.f21585k = i11;
            this.f21586l = 0;
            this.f21587m = 0;
            return;
        }
        float fAbs = this.f21580f;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int iCeil2 = (int) (iA <= 0 ? Math.ceil(iA * fAbs) : Math.ceil(iA * (1.0f - fAbs)));
        int i12 = fontMetricsInt.descent;
        int i13 = iCeil2 + i12;
        this.f21584j = i13;
        int i14 = i13 - iCeil;
        this.f21583i = i14;
        if (this.f21578d) {
            i14 = fontMetricsInt.ascent;
        }
        this.f21582h = i14;
        if (this.f21579e) {
            i13 = i12;
        }
        this.f21585k = i13;
        this.f21586l = fontMetricsInt.ascent - i14;
        this.f21587m = i13 - i12;
    }

    public final h b(int i10, int i11, boolean z10) {
        return new h(this.f21575a, i10, i11, z10, this.f21579e, this.f21580f, this.f21581g);
    }

    public final int c() {
        return this.f21586l;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.f21576b;
        boolean z11 = i11 == this.f21577c;
        if (z10 && z11 && this.f21578d && this.f21579e) {
            return;
        }
        if (this.f21582h == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.f21582h : this.f21583i;
        fontMetricsInt.descent = z11 ? this.f21585k : this.f21584j;
    }

    public final int d() {
        return this.f21587m;
    }

    public final boolean e() {
        return this.f21579e;
    }
}
