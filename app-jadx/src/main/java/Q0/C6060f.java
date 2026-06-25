package q0;

import K0.p0;
import Td.L;
import androidx.compose.ui.focus.FocusTargetNode;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5502p;
import t.Q;
import t.f0;

/* JADX INFO: renamed from: q0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6060f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6064j f56114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f56115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q f56116c = f0.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q f56117d = f0.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f56118e;

    /* JADX INFO: renamed from: q0.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements InterfaceC5082a {
        a(Object obj) {
            super(0, obj, C6060f.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m964invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m964invoke() {
            ((C6060f) this.receiver).c();
        }
    }

    public C6060f(InterfaceC6064j interfaceC6064j, p0 p0Var) {
        this.f56114a = interfaceC6064j;
        this.f56115b = p0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C6060f.c():void");
    }

    private final void d() {
        if (this.f56114a.j() == null || this.f56114a.q() == o.f56124d) {
            this.f56114a.a();
        }
    }

    public final boolean b() {
        return this.f56118e;
    }

    public final void e() {
        if (this.f56118e) {
            return;
        }
        this.f56115b.F(new a(this));
        this.f56118e = true;
    }

    public final void f(FocusTargetNode focusTargetNode) {
        if (this.f56116c.h(focusTargetNode)) {
            e();
        }
    }

    public final void g(InterfaceC6058d interfaceC6058d) {
        if (this.f56117d.h(interfaceC6058d)) {
            e();
        }
    }
}
