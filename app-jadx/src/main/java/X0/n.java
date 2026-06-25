package X0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21606b;

    public n(boolean z10, boolean z11) {
        this.f21605a = z10;
        this.f21606b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f21605a);
        textPaint.setStrikeThruText(this.f21606b);
    }
}
