package P7;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends MetricAffectingSpan implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13521a;

    public a(float f10) {
        this.f13521a = f10;
    }

    private final void a(TextPaint textPaint) {
        if (Float.isNaN(this.f13521a)) {
            return;
        }
        textPaint.setLetterSpacing(this.f13521a);
    }

    public final float b() {
        return this.f13521a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        AbstractC5504s.h(paint, "paint");
        a(paint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        AbstractC5504s.h(paint, "paint");
        a(paint);
    }
}
