package P7;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends CharacterStyle implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f13542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f13543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13544d;

    public q(float f10, float f11, float f12, int i10) {
        this.f13541a = f10;
        this.f13542b = f11;
        this.f13543c = f12;
        this.f13544d = i10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AbstractC5504s.h(textPaint, "textPaint");
        textPaint.setShadowLayer(this.f13543c, this.f13541a, this.f13542b, this.f13544d);
    }
}
