package X0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f21601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f21602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f21603d;

    public l(int i10, float f10, float f11, float f12) {
        this.f21600a = i10;
        this.f21601b = f10;
        this.f21602c = f11;
        this.f21603d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f21603d, this.f21601b, this.f21602c, this.f21600a);
    }
}
