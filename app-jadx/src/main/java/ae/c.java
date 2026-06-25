package Ae;

import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;
import ye.g0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public static final a f406a = new a();

        private a() {
        }

        @Override // Ae.c
        public boolean b(InterfaceC7227e classDescriptor, g0 functionDescriptor) {
            AbstractC5504s.h(classDescriptor, "classDescriptor");
            AbstractC5504s.h(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public static final b f407a = new b();

        private b() {
        }

        @Override // Ae.c
        public boolean b(InterfaceC7227e classDescriptor, g0 functionDescriptor) {
            AbstractC5504s.h(classDescriptor, "classDescriptor");
            AbstractC5504s.h(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().k0(d.a());
        }
    }

    boolean b(InterfaceC7227e interfaceC7227e, g0 g0Var);
}
