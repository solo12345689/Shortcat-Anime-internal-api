package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    private final o f29592b;

    /* JADX INFO: renamed from: a */
    private final Paint.FontMetricsInt f29591a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    private short f29593c = -1;

    /* JADX INFO: renamed from: d */
    private short f29594d = -1;

    /* JADX INFO: renamed from: e */
    private float f29595e = 1.0f;

    i(o oVar) {
        K1.f.h(oVar, "rasterizer cannot be null");
        this.f29592b = oVar;
    }

    public final o a() {
        return this.f29592b;
    }

    final int b() {
        return this.f29593c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f29591a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f29591a;
        this.f29595e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f29592b.e();
        this.f29594d = (short) (this.f29592b.e() * this.f29595e);
        short sI = (short) (this.f29592b.i() * this.f29595e);
        this.f29593c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f29591a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
