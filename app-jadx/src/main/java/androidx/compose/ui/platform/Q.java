package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Q implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f27355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActionMode f27356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M0.c f27357c = new M0.c(new a(), null, null, null, null, null, null, 126, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u1 f27358d = u1.f27501b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m83invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m83invoke() {
            Q.this.f27356b = null;
        }
    }

    public Q(View view) {
        this.f27355a = view;
    }

    @Override // androidx.compose.ui.platform.s1
    public void a() {
        this.f27358d = u1.f27501b;
        ActionMode actionMode = this.f27356b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f27356b = null;
    }

    @Override // androidx.compose.ui.platform.s1
    public u1 b() {
        return this.f27358d;
    }

    @Override // androidx.compose.ui.platform.s1
    public void c(C6226h c6226h, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4) {
        e(c6226h, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, interfaceC5082a4, null);
    }

    public void e(C6226h c6226h, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, InterfaceC5082a interfaceC5082a5) {
        this.f27357c.m(c6226h);
        this.f27357c.i(interfaceC5082a);
        this.f27357c.j(interfaceC5082a3);
        this.f27357c.k(interfaceC5082a2);
        this.f27357c.l(interfaceC5082a4);
        this.f27357c.h(interfaceC5082a5);
        ActionMode actionMode = this.f27356b;
        if (actionMode == null) {
            this.f27358d = u1.f27500a;
            this.f27356b = t1.f27495a.a(this.f27355a, new M0.a(this.f27357c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }
}
