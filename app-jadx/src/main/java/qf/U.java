package qf;

import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import rf.AbstractC6317g;

/* JADX INFO: loaded from: classes5.dex */
class U implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f58019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f58020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r0 f58021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f58022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5387k f58023e;

    public U(v0 v0Var, List list, r0 r0Var, boolean z10, InterfaceC5387k interfaceC5387k) {
        this.f58019a = v0Var;
        this.f58020b = list;
        this.f58021c = r0Var;
        this.f58022d = z10;
        this.f58023e = interfaceC5387k;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return V.o(this.f58019a, this.f58020b, this.f58021c, this.f58022d, this.f58023e, (AbstractC6317g) obj);
    }
}
