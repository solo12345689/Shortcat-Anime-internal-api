package De;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import mf.InterfaceC5691w;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements InterfaceC5691w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f3705b = new j();

    private j() {
    }

    @Override // mf.InterfaceC5691w
    public void a(InterfaceC7224b descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // mf.InterfaceC5691w
    public void b(InterfaceC7227e descriptor, List unresolvedSuperClasses) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}
