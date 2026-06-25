package X0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class m extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21604a;

    public m(float f10) {
        this.f21604a = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f21604a + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f21604a + textPaint.getTextSkewX());
    }
}
