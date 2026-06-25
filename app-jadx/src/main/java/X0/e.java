package X0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21572a;

    public e(float f10) {
        this.f21572a = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f21572a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f21572a);
    }
}
