package K;

import a1.C2551s;
import androidx.compose.ui.platform.InterfaceC2724o1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import q0.InterfaceC6062h;

/* JADX INFO: renamed from: K.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1770u implements InterfaceC1771v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2724o1 f10338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1772w f10339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC6062h f10340c;

    public C1770u(InterfaceC2724o1 interfaceC2724o1) {
        this.f10338a = interfaceC2724o1;
    }

    public void a(int i10) {
        C2551s.a aVar = C2551s.f23628b;
        if (C2551s.m(i10, aVar.d())) {
            b().h(androidx.compose.ui.focus.d.f26651b.e());
            return;
        }
        if (C2551s.m(i10, aVar.f())) {
            b().h(androidx.compose.ui.focus.d.f26651b.f());
            return;
        }
        if (!C2551s.m(i10, aVar.b())) {
            if (C2551s.m(i10, aVar.c()) ? true : C2551s.m(i10, aVar.g()) ? true : C2551s.m(i10, aVar.h()) ? true : C2551s.m(i10, aVar.a())) {
                return;
            }
            C2551s.m(i10, aVar.e());
        } else {
            InterfaceC2724o1 interfaceC2724o1 = this.f10338a;
            if (interfaceC2724o1 != null) {
                interfaceC2724o1.a();
            }
        }
    }

    public final InterfaceC6062h b() {
        InterfaceC6062h interfaceC6062h = this.f10340c;
        if (interfaceC6062h != null) {
            return interfaceC6062h;
        }
        AbstractC5504s.u("focusManager");
        return null;
    }

    public final C1772w c() {
        C1772w c1772w = this.f10339b;
        if (c1772w != null) {
            return c1772w;
        }
        AbstractC5504s.u("keyboardActions");
        return null;
    }

    public final void d(int i10) {
        Function1 function1G;
        C2551s.a aVar = C2551s.f23628b;
        Td.L l10 = null;
        if (C2551s.m(i10, aVar.b())) {
            function1G = c().b();
        } else if (C2551s.m(i10, aVar.c())) {
            function1G = c().c();
        } else if (C2551s.m(i10, aVar.d())) {
            function1G = c().d();
        } else if (C2551s.m(i10, aVar.f())) {
            function1G = c().e();
        } else if (C2551s.m(i10, aVar.g())) {
            function1G = c().f();
        } else if (C2551s.m(i10, aVar.h())) {
            function1G = c().g();
        } else {
            if (!(C2551s.m(i10, aVar.a()) ? true : C2551s.m(i10, aVar.e()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            function1G = null;
        }
        if (function1G != null) {
            function1G.invoke(this);
            l10 = Td.L.f17438a;
        }
        if (l10 == null) {
            a(i10);
        }
    }

    public final void e(InterfaceC6062h interfaceC6062h) {
        this.f10340c = interfaceC6062h;
    }

    public final void f(C1772w c1772w) {
        this.f10339b = c1772w;
    }
}
