package x;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.W0;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function1;
import r0.AbstractC6225g;
import r0.C6224f;
import r0.C6230l;
import u0.InterfaceC6708c;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: x.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7017o extends W0 implements p0.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C7003a f63371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C7025w f63372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6997Q f63373e;

    public C7017o(C7003a c7003a, C7025w c7025w, C6997Q c6997q, Function1 function1) {
        super(function1);
        this.f63371c = c7003a;
        this.f63372d = c7025w;
        this.f63373e = c6997q;
    }

    private final boolean a(InterfaceC6711f interfaceC6711f, EdgeEffect edgeEffect, Canvas canvas) {
        return j(180.0f, AbstractC6225g.a(-C6230l.i(interfaceC6711f.f()), (-C6230l.g(interfaceC6711f.f())) + interfaceC6711f.l1(this.f63373e.a().c())), edgeEffect, canvas);
    }

    private final boolean c(InterfaceC6711f interfaceC6711f, EdgeEffect edgeEffect, Canvas canvas) {
        return j(270.0f, AbstractC6225g.a(-C6230l.g(interfaceC6711f.f()), interfaceC6711f.l1(this.f63373e.a().b(interfaceC6711f.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean h(InterfaceC6711f interfaceC6711f, EdgeEffect edgeEffect, Canvas canvas) {
        return j(90.0f, AbstractC6225g.a(0.0f, (-AbstractC5466a.d(C6230l.i(interfaceC6711f.f()))) + interfaceC6711f.l1(this.f63373e.a().a(interfaceC6711f.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean i(InterfaceC6711f interfaceC6711f, EdgeEffect edgeEffect, Canvas canvas) {
        return j(0.0f, AbstractC6225g.a(0.0f, interfaceC6711f.l1(this.f63373e.a().d())), edgeEffect, canvas);
    }

    private final boolean j(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(C6224f.m(j10), C6224f.n(j10));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // p0.i
    public void draw(InterfaceC6708c interfaceC6708c) {
        this.f63371c.r(interfaceC6708c.f());
        if (C6230l.k(interfaceC6708c.f())) {
            interfaceC6708c.B1();
            return;
        }
        interfaceC6708c.B1();
        this.f63371c.j().getValue();
        Canvas canvasD = s0.E.d(interfaceC6708c.n1().b());
        C7025w c7025w = this.f63372d;
        boolean zC = c7025w.r() ? c(interfaceC6708c, c7025w.h(), canvasD) : false;
        if (c7025w.y()) {
            zC = i(interfaceC6708c, c7025w.l(), canvasD) || zC;
        }
        if (c7025w.u()) {
            zC = h(interfaceC6708c, c7025w.j(), canvasD) || zC;
        }
        if (c7025w.o()) {
            zC = a(interfaceC6708c, c7025w.f(), canvasD) || zC;
        }
        if (zC) {
            this.f63371c.k();
        }
    }
}
