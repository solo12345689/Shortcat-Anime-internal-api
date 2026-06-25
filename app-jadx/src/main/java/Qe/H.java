package Qe;

import Ud.AbstractC2279u;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ye.InterfaceC7227e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class H implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f14806a = new H();

    private H() {
    }

    @Override // Qe.G
    public S a(S kotlinType) {
        AbstractC5504s.h(kotlinType, "kotlinType");
        return null;
    }

    @Override // Qe.G
    public String b(InterfaceC7227e classDescriptor) {
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // Qe.G
    public void d(S kotlinType, InterfaceC7227e descriptor) {
        AbstractC5504s.h(kotlinType, "kotlinType");
        AbstractC5504s.h(descriptor, "descriptor");
    }

    @Override // Qe.G
    public String e(InterfaceC7227e classDescriptor) {
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // Qe.G
    public S f(Collection types) {
        AbstractC5504s.h(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + AbstractC2279u.w0(types, null, null, null, 0, null, null, 63, null));
    }

    @Override // Qe.G
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s c(InterfaceC7227e classDescriptor) {
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        return null;
    }
}
