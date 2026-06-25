package X0;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f21607a;

    public o(Typeface typeface) {
        this.f21607a = typeface;
    }

    private final void a(Paint paint) {
        paint.setTypeface(this.f21607a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
