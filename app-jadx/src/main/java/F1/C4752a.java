package f1;

import Td.r;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.AbstractC5504s;
import u0.AbstractC6712g;
import u0.C6715j;
import u0.C6716k;

/* JADX INFO: renamed from: f1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4752a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6712g f46800a;

    public C4752a(AbstractC6712g abstractC6712g) {
        this.f46800a = abstractC6712g;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            AbstractC6712g abstractC6712g = this.f46800a;
            if (AbstractC5504s.c(abstractC6712g, C6715j.f61115a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC6712g instanceof C6716k)) {
                throw new r();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((C6716k) this.f46800a).f());
            textPaint.setStrokeMiter(((C6716k) this.f46800a).d());
            textPaint.setStrokeJoin(b.b(((C6716k) this.f46800a).c()));
            textPaint.setStrokeCap(b.a(((C6716k) this.f46800a).b()));
            ((C6716k) this.f46800a).e();
            textPaint.setPathEffect(null);
        }
    }
}
