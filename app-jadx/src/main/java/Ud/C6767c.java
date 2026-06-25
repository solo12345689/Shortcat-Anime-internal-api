package ud;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;
import xd.C7136g;
import xd.EnumC7131b;

/* JADX INFO: renamed from: ud.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6767c implements InterfaceC6765a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7136g f61504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f61505b;

    public C6767c(C7136g logger) {
        AbstractC5504s.h(logger, "logger");
        this.f61504a = logger;
    }

    @Override // ud.InterfaceC6765a
    public void a(WeakReference weakReference) {
        this.f61505b = weakReference;
    }

    @Override // ud.InterfaceC6765a
    public void b(Cd.b context) {
        InterfaceC6766b interfaceC6766b;
        AbstractC5504s.h(context, "context");
        C7136g.e(this.f61504a, "Sending state machine context to observer", null, 2, null);
        WeakReference weakReferenceC = c();
        if (weakReferenceC == null || (interfaceC6766b = (InterfaceC6766b) weakReferenceC.get()) == null) {
            this.f61504a.c("Unable to send state machine context to observer, no observer", EnumC7131b.f64348j);
            return;
        }
        try {
            interfaceC6766b.b(context);
            C7136g.e(this.f61504a, "Sent state machine context to observer", null, 2, null);
        } catch (Exception e10) {
            this.f61504a.f("Could not send state machine context to observer", e10, EnumC7131b.f64348j);
        }
    }

    public WeakReference c() {
        return this.f61505b;
    }
}
