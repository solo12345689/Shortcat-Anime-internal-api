package Qe;

import kotlin.jvm.internal.AbstractC5504s;
import mf.C5678i;
import mf.InterfaceC5679j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class o implements InterfaceC5679j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f14890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f14891b;

    public o(v kotlinClassFinder, n deserializedDescriptorResolver) {
        AbstractC5504s.h(kotlinClassFinder, "kotlinClassFinder");
        AbstractC5504s.h(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f14890a = kotlinClassFinder;
        this.f14891b = deserializedDescriptorResolver;
    }

    @Override // mf.InterfaceC5679j
    public C5678i a(Xe.b classId) {
        AbstractC5504s.h(classId, "classId");
        x xVarB = w.b(this.f14890a, classId, this.f14891b.f().g().d());
        if (xVarB == null) {
            return null;
        }
        AbstractC5504s.c(xVarB.g(), classId);
        return this.f14891b.l(xVarB);
    }
}
