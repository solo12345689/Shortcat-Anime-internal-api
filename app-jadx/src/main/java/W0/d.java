package W0;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f20601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f20602b;

    public d(CharSequence charSequence, TextPaint textPaint) {
        this.f20601a = charSequence;
        this.f20602b = textPaint;
    }

    @Override // W0.b
    public int e(int i10) {
        TextPaint textPaint = this.f20602b;
        CharSequence charSequence = this.f20601a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // W0.b
    public int f(int i10) {
        TextPaint textPaint = this.f20602b;
        CharSequence charSequence = this.f20601a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
