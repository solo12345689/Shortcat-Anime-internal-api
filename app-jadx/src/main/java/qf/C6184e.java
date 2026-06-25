package qf;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import qf.u0;

/* JADX INFO: renamed from: qf.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6184e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f58038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u0 f58039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uf.r f58040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final uf.j f58041d;

    public C6184e(Collection collection, u0 u0Var, uf.r rVar, uf.j jVar) {
        this.f58038a = collection;
        this.f58039b = u0Var;
        this.f58040c = rVar;
        this.f58041d = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C6188g.x(this.f58038a, this.f58039b, this.f58040c, this.f58041d, (u0.a) obj);
    }
}
