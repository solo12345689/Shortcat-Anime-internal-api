package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f42582o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f42583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f42584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42585c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42587e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42594l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i f42596n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42586d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f42588f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42589g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f42590h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f42591i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42592j = f42582o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42593k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f42595m = null;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends Exception {
    }

    private h(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f42583a = charSequence;
        this.f42584b = textPaint;
        this.f42585c = i10;
        this.f42587e = charSequence.length();
    }

    public static h b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new h(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f42583a == null) {
            this.f42583a = "";
        }
        int iMax = Math.max(0, this.f42585c);
        CharSequence charSequenceEllipsize = this.f42583a;
        if (this.f42589g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f42584b, iMax, this.f42595m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f42587e);
        this.f42587e = iMin;
        if (this.f42594l && this.f42589g == 1) {
            this.f42588f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f42586d, iMin, this.f42584b, iMax);
        builderObtain.setAlignment(this.f42588f);
        builderObtain.setIncludePad(this.f42593k);
        builderObtain.setTextDirection(this.f42594l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f42595m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f42589g);
        float f10 = this.f42590h;
        if (f10 != 0.0f || this.f42591i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f42591i);
        }
        if (this.f42589g > 1) {
            builderObtain.setHyphenationFrequency(this.f42592j);
        }
        i iVar = this.f42596n;
        if (iVar != null) {
            iVar.a(builderObtain);
        }
        return builderObtain.build();
    }

    public h c(Layout.Alignment alignment) {
        this.f42588f = alignment;
        return this;
    }

    public h d(TextUtils.TruncateAt truncateAt) {
        this.f42595m = truncateAt;
        return this;
    }

    public h e(int i10) {
        this.f42592j = i10;
        return this;
    }

    public h f(boolean z10) {
        this.f42593k = z10;
        return this;
    }

    public h g(boolean z10) {
        this.f42594l = z10;
        return this;
    }

    public h h(float f10, float f11) {
        this.f42590h = f10;
        this.f42591i = f11;
        return this;
    }

    public h i(int i10) {
        this.f42589g = i10;
        return this;
    }

    public h j(i iVar) {
        this.f42596n = iVar;
        return this;
    }
}
