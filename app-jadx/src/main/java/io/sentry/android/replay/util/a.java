package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Layout f50414a;

    public a(Layout layout) {
        AbstractC5504s.h(layout, "layout");
        this.f50414a = layout;
    }

    @Override // io.sentry.android.replay.util.q
    public int a(int i10) {
        return this.f50414a.getLineTop(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int b(int i10) {
        return this.f50414a.getLineStart(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int c() {
        return this.f50414a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.q
    public float d(int i10, int i11) {
        return this.f50414a.getPrimaryHorizontal(i11);
    }

    @Override // io.sentry.android.replay.util.q
    public int e(int i10) {
        return this.f50414a.getLineBottom(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public Integer f() {
        int i10;
        if (!(this.f50414a.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = this.f50414a.getText();
        AbstractC5504s.f(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, this.f50414a.getText().length(), ForegroundColorSpan.class);
        AbstractC5504s.e(foregroundColorSpanArr);
        int i11 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = this.f50414a.getText();
            AbstractC5504s.f(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = this.f50414a.getText();
            AbstractC5504s.f(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i10 = spanEnd - spanStart) > i11) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i11 = i10;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(r.j(numValueOf.intValue()));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.q
    public int g(int i10) {
        return this.f50414a.getLineVisibleEnd(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int h(int i10) {
        return this.f50414a.getEllipsisCount(i10);
    }
}
