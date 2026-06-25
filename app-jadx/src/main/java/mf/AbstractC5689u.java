package mf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import of.InterfaceC5895s;
import ye.h0;

/* JADX INFO: renamed from: mf.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5689u extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Ue.a f53471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC5895s f53472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Ue.e f53473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final M f53474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Se.n f53475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC5387k f53476m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5689u(Xe.c fqName, pf.n storageManager, ye.H module, Se.n proto, Ue.a metadataVersion, InterfaceC5895s interfaceC5895s) {
        super(fqName, storageManager, module);
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        this.f53471h = metadataVersion;
        this.f53472i = interfaceC5895s;
        Se.q qVarP = proto.P();
        AbstractC5504s.g(qVarP, "getStrings(...)");
        Se.p pVarO = proto.O();
        AbstractC5504s.g(pVarO, "getQualifiedNames(...)");
        Ue.e eVar = new Ue.e(qVarP, pVarO);
        this.f53473j = eVar;
        this.f53474k = new M(proto, eVar, metadataVersion, new C5687s(this));
        this.f53475l = proto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 O0(AbstractC5689u abstractC5689u, Xe.b it) {
        AbstractC5504s.h(it, "it");
        InterfaceC5895s interfaceC5895s = abstractC5689u.f53472i;
        if (interfaceC5895s != null) {
            return interfaceC5895s;
        }
        h0 NO_SOURCE = h0.f65112a;
        AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection Q0(AbstractC5689u abstractC5689u) {
        Collection collectionB = abstractC5689u.H0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            Xe.b bVar = (Xe.b) obj;
            if (!bVar.j() && !C5681l.f53427c.a().contains(bVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Xe.b) it.next()).h());
        }
        return arrayList2;
    }

    @Override // mf.r
    public void L0(C5683n components) {
        AbstractC5504s.h(components, "components");
        Se.n nVar = this.f53475l;
        if (nVar == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f53475l = null;
        Se.m mVarN = nVar.N();
        AbstractC5504s.g(mVarN, "getPackage(...)");
        this.f53476m = new of.M(this, mVarN, this.f53473j, this.f53471h, this.f53472i, components, "scope of " + this, new C5688t(this));
    }

    @Override // mf.r
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public M H0() {
        return this.f53474k;
    }

    @Override // ye.N
    public InterfaceC5387k o() {
        InterfaceC5387k interfaceC5387k = this.f53476m;
        if (interfaceC5387k != null) {
            return interfaceC5387k;
        }
        AbstractC5504s.u("_memberScope");
        return null;
    }
}
