package nf;

import Ge.c;
import Ud.AbstractC2279u;
import hf.C4948b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import mf.C5675f;
import mf.C5683n;
import mf.C5686q;
import mf.InterfaceC5669B;
import mf.InterfaceC5682m;
import mf.InterfaceC5684o;
import mf.InterfaceC5691w;
import mf.InterfaceC5692x;
import pf.n;
import ve.o;
import ye.H;
import ye.M;
import ye.O;
import ye.S;

/* JADX INFO: renamed from: nf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5787b implements ve.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5789d f54130b = new C5789d();

    /* JADX INFO: renamed from: nf.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function1 {
        a(Object obj) {
            super(1, obj, C5789d.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String p02) {
            AbstractC5504s.h(p02, "p0");
            return ((C5789d) this.receiver).a(p02);
        }
    }

    @Override // ve.b
    public O a(n storageManager, H builtInsModule, Iterable classDescriptorFactories, Ae.c platformDependentDeclarationFilter, Ae.a additionalClassPartsProvider, boolean z10) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(builtInsModule, "builtInsModule");
        AbstractC5504s.h(classDescriptorFactories, "classDescriptorFactories");
        AbstractC5504s.h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC5504s.h(additionalClassPartsProvider, "additionalClassPartsProvider");
        return b(storageManager, builtInsModule, o.f62156J, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z10, new a(this.f54130b));
    }

    public final O b(n nVar, H h10, Set packageFqNames, Iterable classDescriptorFactories, Ae.c platformDependentDeclarationFilter, Ae.a additionalClassPartsProvider, boolean z10, Function1 loadResource) throws IOException {
        C5788c c5788cA;
        n storageManager = nVar;
        H module = h10;
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(packageFqNames, "packageFqNames");
        AbstractC5504s.h(classDescriptorFactories, "classDescriptorFactories");
        AbstractC5504s.h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC5504s.h(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC5504s.h(loadResource, "loadResource");
        ArrayList arrayList = new ArrayList();
        Iterator it = packageFqNames.iterator();
        while (it.hasNext()) {
            Xe.c cVar = (Xe.c) it.next();
            InputStream inputStream = (InputStream) loadResource.invoke(C5786a.f54129r.r(cVar));
            if (inputStream != null) {
                H h11 = module;
                c5788cA = C5788c.f54131o.a(cVar, nVar, h11, inputStream, z10);
                storageManager = nVar;
                module = h11;
            } else {
                c5788cA = null;
            }
            if (c5788cA != null) {
                arrayList.add(c5788cA);
            }
        }
        S s10 = new S(arrayList);
        M m10 = new M(storageManager, module);
        InterfaceC5684o.a aVar = InterfaceC5684o.a.f53457a;
        C5686q c5686q = new C5686q(s10);
        C5786a c5786a = C5786a.f54129r;
        C5675f c5675f = new C5675f(module, m10, c5786a);
        InterfaceC5669B.a aVar2 = InterfaceC5669B.a.f53332a;
        InterfaceC5691w DO_NOTHING = InterfaceC5691w.f53478a;
        AbstractC5504s.g(DO_NOTHING, "DO_NOTHING");
        C5683n c5683n = new C5683n(storageManager, h10, aVar, c5686q, c5675f, s10, aVar2, DO_NOTHING, c.a.f7454a, InterfaceC5692x.a.f53479a, classDescriptorFactories, m10, InterfaceC5682m.f53433a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c5786a.e(), null, new C4948b(storageManager, AbstractC2279u.m()), null, null, 851968, null);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C5788c) it2.next()).L0(c5683n);
        }
        return s10;
    }
}
