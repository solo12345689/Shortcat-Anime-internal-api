package of;

import Be.AbstractC1107b;
import Se.t;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import mf.C5685p;
import mf.X;
import ye.InterfaceC7235m;
import ye.h0;
import ye.k0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class S extends AbstractC1107b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C5685p f55454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Se.t f55455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C5878a f55456m;

    /* JADX WARN: Illegal instructions before constructor call */
    public S(C5685p c10, Se.t proto, int i10) {
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(proto, "proto");
        pf.n nVarH = c10.h();
        InterfaceC7235m interfaceC7235mE = c10.e();
        InterfaceC7374h interfaceC7374hB = InterfaceC7374h.f66223k0.b();
        Xe.f fVarB = mf.L.b(c10.g(), proto.O());
        mf.O o10 = mf.O.f53376a;
        t.c cVarU = proto.U();
        AbstractC5504s.g(cVarU, "getVariance(...)");
        super(nVarH, interfaceC7235mE, interfaceC7374hB, fVarB, o10.d(cVarU), proto.P(), i10, h0.f65112a, k0.a.f65115a);
        this.f55454k = c10;
        this.f55455l = proto;
        this.f55456m = new C5878a(c10.h(), new Q(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N0(S s10) {
        return AbstractC2279u.b1(s10.f55454k.c().d().a(s10.f55455l, s10.f55454k.g()));
    }

    @Override // Be.AbstractC1113h
    protected List L0() {
        List listS = Ue.g.s(this.f55455l, this.f55454k.j());
        if (listS.isEmpty()) {
            return AbstractC2279u.e(ff.e.m(this).z());
        }
        X xI = this.f55454k.i();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(xI.u((Se.r) it.next()));
        }
        return arrayList;
    }

    @Override // ze.AbstractC7368b, ze.InterfaceC7367a
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C5878a getAnnotations() {
        return this.f55456m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Be.AbstractC1113h
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public Void K0(qf.S type) {
        AbstractC5504s.h(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
