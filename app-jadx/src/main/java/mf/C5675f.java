package mf;

import Se.b;
import df.AbstractC4598g;
import kotlin.jvm.internal.AbstractC5504s;
import lf.AbstractC5594a;
import ze.InterfaceC7369c;

/* JADX INFO: renamed from: mf.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5675f extends AbstractC5670a implements InterfaceC5674e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5676g f53418b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5675f(ye.H module, ye.M notFoundClasses, AbstractC5594a protocol) {
        super(protocol);
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        AbstractC5504s.h(protocol, "protocol");
        this.f53418b = new C5676g(module, notFoundClasses);
    }

    @Override // mf.InterfaceC5677h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public InterfaceC7369c d(Se.b proto, Ue.d nameResolver) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        return this.f53418b.a(proto, nameResolver);
    }

    @Override // mf.InterfaceC5674e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC4598g l(N container, Se.o proto, qf.S expectedType) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(expectedType, "expectedType");
        return null;
    }

    @Override // mf.InterfaceC5674e
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC4598g k(N container, Se.o proto, qf.S expectedType) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(expectedType, "expectedType");
        b.C0278b.c cVar = (b.C0278b.c) Ue.f.a(proto, m().b());
        if (cVar == null) {
            return null;
        }
        return this.f53418b.f(expectedType, cVar, container.b());
    }
}
