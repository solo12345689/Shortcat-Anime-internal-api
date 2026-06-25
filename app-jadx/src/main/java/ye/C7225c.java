package ye;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.N0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: ye.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C7225c implements m0 {

    /* JADX INFO: renamed from: a */
    private final m0 f65091a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC7235m f65092b;

    /* JADX INFO: renamed from: c */
    private final int f65093c;

    public C7225c(m0 originalDescriptor, InterfaceC7235m declarationDescriptor, int i10) {
        AbstractC5504s.h(originalDescriptor, "originalDescriptor");
        AbstractC5504s.h(declarationDescriptor, "declarationDescriptor");
        this.f65091a = originalDescriptor;
        this.f65092b = declarationDescriptor;
        this.f65093c = i10;
    }

    @Override // ye.m0
    public pf.n M() {
        pf.n nVarM = this.f65091a.M();
        AbstractC5504s.g(nVarM, "getStorageManager(...)");
        return nVarM;
    }

    @Override // ye.m0
    public boolean Q() {
        return true;
    }

    @Override // ye.InterfaceC7236n, ye.InterfaceC7235m
    public InterfaceC7235m b() {
        return this.f65092b;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return this.f65091a.b0(interfaceC7237o, obj);
    }

    @Override // ze.InterfaceC7367a
    public InterfaceC7374h getAnnotations() {
        return this.f65091a.getAnnotations();
    }

    @Override // ye.m0
    public int getIndex() {
        return this.f65093c + this.f65091a.getIndex();
    }

    @Override // ye.J
    public Xe.f getName() {
        Xe.f name = this.f65091a.getName();
        AbstractC5504s.g(name, "getName(...)");
        return name;
    }

    @Override // ye.m0
    public List getUpperBounds() {
        List upperBounds = this.f65091a.getUpperBounds();
        AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // ye.InterfaceC7238p
    public h0 k() {
        h0 h0VarK = this.f65091a.k();
        AbstractC5504s.g(h0VarK, "getSource(...)");
        return h0VarK;
    }

    @Override // ye.m0, ye.InterfaceC7230h
    public qf.v0 l() {
        qf.v0 v0VarL = this.f65091a.l();
        AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
        return v0VarL;
    }

    @Override // ye.m0
    public N0 m() {
        N0 n0M = this.f65091a.m();
        AbstractC5504s.g(n0M, "getVariance(...)");
        return n0M;
    }

    @Override // ye.InterfaceC7230h
    public AbstractC6183d0 p() {
        AbstractC6183d0 abstractC6183d0P = this.f65091a.p();
        AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
        return abstractC6183d0P;
    }

    public String toString() {
        return this.f65091a + "[inner-copy]";
    }

    @Override // ye.m0
    public boolean y() {
        return this.f65091a.y();
    }

    @Override // ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public m0 a() {
        m0 m0VarA = this.f65091a.a();
        AbstractC5504s.g(m0VarA, "getOriginal(...)");
        return m0VarA;
    }
}
