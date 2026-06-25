package P7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends ReplacementSpan implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13548c;

    public s(int i10, int i11, int i12) {
        this.f13546a = i10;
        this.f13547b = i11;
        this.f13548c = i12;
    }

    public final int a() {
        return this.f13548c;
    }

    public final int b() {
        return this.f13546a;
    }

    public final int c() {
        return this.f13547b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        AbstractC5504s.h(canvas, "canvas");
        AbstractC5504s.h(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        AbstractC5504s.h(paint, "paint");
        if (fontMetricsInt != null) {
            int i12 = -this.f13548c;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return this.f13547b;
    }
}
