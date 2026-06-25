package bf;

import qf.v0;
import rf.InterfaceC6315e;
import ye.InterfaceC7223a;

/* JADX INFO: loaded from: classes5.dex */
class e implements InterfaceC6315e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7223a f33294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC7223a f33295c;

    public e(boolean z10, InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2) {
        this.f33293a = z10;
        this.f33294b = interfaceC7223a;
        this.f33295c = interfaceC7223a2;
    }

    @Override // rf.InterfaceC6315e.a
    public boolean a(v0 v0Var, v0 v0Var2) {
        return g.h(this.f33293a, this.f33294b, this.f33295c, v0Var, v0Var2);
    }
}
