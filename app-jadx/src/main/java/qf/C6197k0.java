package qf;

import Td.AbstractC2163n;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import rf.AbstractC6317g;

/* JADX INFO: renamed from: qf.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6197k0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.m0 f58064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f58065b;

    public C6197k0(ye.m0 typeParameter) {
        AbstractC5504s.h(typeParameter, "typeParameter");
        this.f58064a = typeParameter;
        this.f58065b = AbstractC2163n.a(Td.q.f17462b, new C6195j0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S c(C6197k0 c6197k0) {
        return AbstractC6199l0.b(c6197k0.f58064a);
    }

    private final S e() {
        return (S) this.f58065b.getValue();
    }

    @Override // qf.B0
    public boolean a() {
        return true;
    }

    @Override // qf.B0
    public N0 b() {
        return N0.f58001g;
    }

    @Override // qf.B0
    public S getType() {
        return e();
    }

    @Override // qf.B0
    public B0 o(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
