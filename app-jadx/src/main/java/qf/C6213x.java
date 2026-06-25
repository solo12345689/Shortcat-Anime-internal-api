package qf;

import Ud.AbstractC2279u;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7235m;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: qf.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6213x implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6213x f58121a = new C6213x();

    private C6213x() {
    }

    @Override // qf.q0
    public r0 a(InterfaceC7374h annotations, v0 v0Var, InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(annotations, "annotations");
        return annotations.isEmpty() ? r0.f58089b.k() : r0.f58089b.j(AbstractC2279u.e(new C6208s(annotations)));
    }
}
