package xe;

import Ge.c;
import Ud.AbstractC2279u;
import hf.InterfaceC4947a;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.AbstractC5672c;
import mf.C5675f;
import mf.C5683n;
import mf.C5686q;
import mf.C5694z;
import mf.InterfaceC5669B;
import mf.InterfaceC5682m;
import mf.InterfaceC5684o;
import mf.InterfaceC5691w;
import mf.InterfaceC5692x;
import nf.C5786a;
import nf.C5788c;
import we.C6966a;
import ye.H;
import ye.M;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class w extends AbstractC5672c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f64456f = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(pf.n storageManager, Qe.v finder, H moduleDescriptor, M notFoundClasses, Ae.a additionalClassPartsProvider, Ae.c platformDependentDeclarationFilter, InterfaceC5684o deserializationConfiguration, rf.p kotlinTypeChecker, InterfaceC4947a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(finder, "finder");
        AbstractC5504s.h(moduleDescriptor, "moduleDescriptor");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        AbstractC5504s.h(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC5504s.h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC5504s.h(deserializationConfiguration, "deserializationConfiguration");
        AbstractC5504s.h(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC5504s.h(samConversionResolver, "samConversionResolver");
        C5686q c5686q = new C5686q(this);
        C5786a c5786a = C5786a.f54129r;
        C5675f c5675f = new C5675f(moduleDescriptor, notFoundClasses, c5786a);
        InterfaceC5669B.a aVar = InterfaceC5669B.a.f53332a;
        InterfaceC5691w DO_NOTHING = InterfaceC5691w.f53478a;
        AbstractC5504s.g(DO_NOTHING, "DO_NOTHING");
        k(new C5683n(storageManager, moduleDescriptor, deserializationConfiguration, c5686q, c5675f, this, aVar, DO_NOTHING, c.a.f7454a, InterfaceC5692x.a.f53479a, AbstractC2279u.p(new C6966a(storageManager, moduleDescriptor), new C7143g(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, InterfaceC5682m.f53433a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c5786a.e(), kotlinTypeChecker, samConversionResolver, null, C5694z.f53486a, 262144, null));
    }

    @Override // mf.AbstractC5672c
    protected mf.r e(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        InputStream inputStreamB = h().b(fqName);
        if (inputStreamB != null) {
            return C5788c.f54131o.a(fqName, j(), i(), inputStreamB, false);
        }
        return null;
    }
}
