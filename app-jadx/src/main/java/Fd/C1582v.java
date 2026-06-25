package Fd;

import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Fd.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1582v extends AbstractComponentCallbacksC2838q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f6653b;

    public C1582v(InterfaceC1581u listener) {
        AbstractC5504s.h(listener, "listener");
        this.f6652a = C1582v.class.getSimpleName() + "_" + UUID.randomUUID();
        this.f6653b = new WeakReference(listener);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onPictureInPictureModeChanged(boolean z10) {
        super.onPictureInPictureModeChanged(z10);
        if (z10) {
            InterfaceC1581u interfaceC1581u = (InterfaceC1581u) this.f6653b.get();
            if (interfaceC1581u != null) {
                interfaceC1581u.d();
                return;
            }
            return;
        }
        InterfaceC1581u interfaceC1581u2 = (InterfaceC1581u) this.f6653b.get();
        if (interfaceC1581u2 != null) {
            interfaceC1581u2.e();
        }
    }

    public final String w() {
        return this.f6652a;
    }

    public final void x() {
        this.f6653b.clear();
    }
}
