package androidx.compose.ui.layout;

import I0.M;
import I0.Q;
import I0.S;
import androidx.compose.ui.layout.F;
import androidx.core.view.L0;
import t.AbstractC6565o;
import t.C6540F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a */
    private static final AbstractC6565o f26902a;

    /* JADX INFO: renamed from: b */
    private static final F[] f26903b;

    /* JADX INFO: renamed from: c */
    private static final C6540F f26904c;

    static {
        C6540F c6540f = new C6540F(8);
        int iH = L0.p.h();
        F.a aVar = F.f26884a;
        c6540f.s(iH, aVar.f());
        c6540f.s(L0.p.g(), aVar.e());
        c6540f.s(L0.p.b(), aVar.a());
        c6540f.s(L0.p.d(), aVar.c());
        c6540f.s(L0.p.j(), aVar.g());
        c6540f.s(L0.p.f(), aVar.d());
        c6540f.s(L0.p.k(), aVar.h());
        f26902a = c6540f;
        f26903b = new F[]{aVar.f(), aVar.e(), aVar.a(), aVar.h(), aVar.g(), aVar.d(), aVar.c(), aVar.i(), aVar.b()};
        C6540F c6540f2 = new C6540F(7);
        c6540f2.s(L0.p.h(), aVar.f());
        c6540f2.s(L0.p.g(), aVar.e());
        c6540f2.s(L0.p.b(), aVar.a());
        c6540f2.s(L0.p.j(), aVar.g());
        c6540f2.s(L0.p.k(), aVar.h());
        c6540f2.s(L0.p.f(), aVar.d());
        c6540f2.s(L0.p.d(), aVar.c());
        f26904c = c6540f2;
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, RunnableC2677f runnableC2677f) {
        return eVar.then(new RulerProviderModifierElement(runnableC2677f));
    }

    public static final void f(M m10, u uVar, long j10, int i10, int i11) {
        if (Q.b(j10, S.a())) {
            return;
        }
        m10.A0(uVar.a(), (int) ((j10 >>> 48) & 65535));
        m10.A0(uVar.b(), (int) ((j10 >>> 32) & 65535));
        m10.A0(uVar.c(), i10 - ((int) ((j10 >>> 16) & 65535)));
        m10.A0(uVar.d(), i11 - ((int) (j10 & 65535)));
    }
}
