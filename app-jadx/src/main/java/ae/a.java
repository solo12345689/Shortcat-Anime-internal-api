package Ae;

import Ud.AbstractC2279u;
import Xe.f;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: Ae.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0010a implements a {

        /* JADX INFO: renamed from: a */
        public static final C0010a f405a = new C0010a();

        private C0010a() {
        }

        @Override // Ae.a
        public Collection a(InterfaceC7227e classDescriptor) {
            AbstractC5504s.h(classDescriptor, "classDescriptor");
            return AbstractC2279u.m();
        }

        @Override // Ae.a
        public Collection c(f name, InterfaceC7227e classDescriptor) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(classDescriptor, "classDescriptor");
            return AbstractC2279u.m();
        }

        @Override // Ae.a
        public Collection d(InterfaceC7227e classDescriptor) {
            AbstractC5504s.h(classDescriptor, "classDescriptor");
            return AbstractC2279u.m();
        }

        @Override // Ae.a
        public Collection e(InterfaceC7227e classDescriptor) {
            AbstractC5504s.h(classDescriptor, "classDescriptor");
            return AbstractC2279u.m();
        }
    }

    Collection a(InterfaceC7227e interfaceC7227e);

    Collection c(f fVar, InterfaceC7227e interfaceC7227e);

    Collection d(InterfaceC7227e interfaceC7227e);

    Collection e(InterfaceC7227e interfaceC7227e);
}
