package f1;

import Y.C0;
import Y.U1;
import Y.b2;
import Y.h2;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import d1.j;
import ie.InterfaceC5082a;
import r0.C6230l;
import s0.A1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A1 f46802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f46803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0 f46804c = b2.e(C6230l.c(C6230l.f58350b.a()), null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h2 f46805d = U1.d(new InterfaceC5082a() { // from class: f1.c
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return d.d(this.f46801a);
        }
    });

    public d(A1 a12, float f10) {
        this.f46802a = a12;
        this.f46803b = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader d(d dVar) {
        if (dVar.b() == 9205357640488583168L || C6230l.k(dVar.b())) {
            return null;
        }
        return dVar.f46802a.mo483createShaderuvyYCjk(dVar.b());
    }

    public final long b() {
        return ((C6230l) this.f46804c.getValue()).m();
    }

    public final void c(long j10) {
        this.f46804c.setValue(C6230l.c(j10));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        j.a(textPaint, this.f46803b);
        textPaint.setShader((Shader) this.f46805d.getValue());
    }
}
