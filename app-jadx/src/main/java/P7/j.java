package P7;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends CharacterStyle implements UpdateAppearance, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13534a;

    public j(float f10) {
        this.f13534a = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        AbstractC5504s.h(paint, "paint");
        paint.setAlpha(AbstractC5466a.d(Color.alpha(paint.getColor()) * this.f13534a));
        if (paint.bgColor != 0) {
            paint.bgColor = Color.argb(AbstractC5466a.d(Color.alpha(r0) * this.f13534a), Color.red(paint.bgColor), Color.green(paint.bgColor), Color.blue(paint.bgColor));
        }
    }
}
