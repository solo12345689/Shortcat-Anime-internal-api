package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class d implements e.InterfaceC0506e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f29533b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f29534a;

    d() {
        TextPaint textPaint = new TextPaint();
        this.f29534a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f29533b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.InterfaceC0506e
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return A1.c.a(this.f29534a, sbB.toString());
    }
}
