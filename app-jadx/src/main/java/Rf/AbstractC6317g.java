package rf;

import ie.InterfaceC5082a;
import java.util.Collection;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import qf.v0;
import ye.H;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;

/* JADX INFO: renamed from: rf.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6317g extends qf.r {

    /* JADX INFO: renamed from: rf.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC6317g {

        /* JADX INFO: renamed from: a */
        public static final a f58775a = new a();

        private a() {
        }

        @Override // rf.AbstractC6317g
        public InterfaceC7227e b(Xe.b classId) {
            AbstractC5504s.h(classId, "classId");
            return null;
        }

        @Override // rf.AbstractC6317g
        public InterfaceC5387k c(InterfaceC7227e classDescriptor, InterfaceC5082a compute) {
            AbstractC5504s.h(classDescriptor, "classDescriptor");
            AbstractC5504s.h(compute, "compute");
            return (InterfaceC5387k) compute.invoke();
        }

        @Override // rf.AbstractC6317g
        public boolean d(H moduleDescriptor) {
            AbstractC5504s.h(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // rf.AbstractC6317g
        public boolean e(v0 typeConstructor) {
            AbstractC5504s.h(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // rf.AbstractC6317g
        public Collection g(InterfaceC7227e classDescriptor) {
            AbstractC5504s.h(classDescriptor, "classDescriptor");
            Collection collectionK = classDescriptor.l().k();
            AbstractC5504s.g(collectionK, "getSupertypes(...)");
            return collectionK;
        }

        @Override // qf.r
        /* JADX INFO: renamed from: h */
        public S a(uf.i type) {
            AbstractC5504s.h(type, "type");
            return (S) type;
        }

        @Override // rf.AbstractC6317g
        /* JADX INFO: renamed from: i */
        public InterfaceC7227e f(InterfaceC7235m descriptor) {
            AbstractC5504s.h(descriptor, "descriptor");
            return null;
        }
    }

    public abstract InterfaceC7227e b(Xe.b bVar);

    public abstract InterfaceC5387k c(InterfaceC7227e interfaceC7227e, InterfaceC5082a interfaceC5082a);

    public abstract boolean d(H h10);

    public abstract boolean e(v0 v0Var);

    public abstract InterfaceC7230h f(InterfaceC7235m interfaceC7235m);

    public abstract Collection g(InterfaceC7227e interfaceC7227e);

    /* JADX INFO: renamed from: h */
    public abstract S a(uf.i iVar);
}
