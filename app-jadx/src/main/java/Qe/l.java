package Qe;

import Ge.c;
import He.C1657d;
import He.D;
import He.InterfaceC1673u;
import He.InterfaceC1674v;
import Ie.i;
import Ke.e;
import Pe.C2022g;
import Pe.m0;
import Ud.AbstractC2279u;
import hf.C4948b;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import mf.InterfaceC5682m;
import mf.InterfaceC5684o;
import mf.InterfaceC5691w;
import qf.C6213x;
import tf.C6673a;
import ye.M;
import ye.k0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements He.A {
        a() {
        }

        @Override // He.A
        public List a(Xe.b classId) {
            AbstractC5504s.h(classId, "classId");
            return null;
        }
    }

    public static final k a(ye.H module, pf.n storageManager, M notFoundClasses, Ke.j lazyJavaPackageFragmentProvider, v reflectKotlinClassFinder, n deserializedDescriptorResolver, InterfaceC5691w errorReporter, Ue.c metadataVersion) {
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        AbstractC5504s.h(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        AbstractC5504s.h(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        AbstractC5504s.h(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC5504s.h(errorReporter, "errorReporter");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        return new k(storageManager, module, InterfaceC5684o.a.f53457a, new o(reflectKotlinClassFinder, deserializedDescriptorResolver), AbstractC2090i.a(module, notFoundClasses, storageManager, reflectKotlinClassFinder, metadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, c.a.f7454a, InterfaceC5682m.f53433a.a(), rf.p.f58793b.a(), new C6673a(AbstractC2279u.e(C6213x.f58121a)));
    }

    public static final Ke.j b(InterfaceC1673u javaClassFinder, ye.H module, pf.n storageManager, M notFoundClasses, v reflectKotlinClassFinder, n deserializedDescriptorResolver, InterfaceC5691w errorReporter, Ne.b javaSourceElementFactory, Ke.n singleModuleClassResolver, D packagePartProvider) {
        AbstractC5504s.h(javaClassFinder, "javaClassFinder");
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        AbstractC5504s.h(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        AbstractC5504s.h(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC5504s.h(errorReporter, "errorReporter");
        AbstractC5504s.h(javaSourceElementFactory, "javaSourceElementFactory");
        AbstractC5504s.h(singleModuleClassResolver, "singleModuleClassResolver");
        AbstractC5504s.h(packagePartProvider, "packagePartProvider");
        Ie.o DO_NOTHING = Ie.o.f9107a;
        AbstractC5504s.g(DO_NOTHING, "DO_NOTHING");
        Ie.j EMPTY = Ie.j.f9100a;
        AbstractC5504s.g(EMPTY, "EMPTY");
        i.a aVar = i.a.f9099a;
        C4948b c4948b = new C4948b(storageManager, AbstractC2279u.m());
        k0.a aVar2 = k0.a.f65115a;
        c.a aVar3 = c.a.f7454a;
        ve.n nVar = new ve.n(module, notFoundClasses);
        D.b bVar = He.D.f8426d;
        C1657d c1657d = new C1657d(bVar.a());
        e.a aVar4 = e.a.f11056a;
        return new Ke.j(new Ke.d(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, aVar, c4948b, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, nVar, c1657d, new m0(new C2022g(aVar4)), InterfaceC1674v.a.f8578a, aVar4, rf.p.f58793b.a(), bVar.a(), new a(), null, 8388608, null));
    }
}
