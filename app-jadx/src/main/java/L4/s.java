package L4;

import android.content.Context;
import y4.InterfaceC7199a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a */
    public static final s f11295a = new s();

    /* JADX INFO: renamed from: b */
    private static InterfaceC7199a f11296b;

    private s() {
    }

    public final synchronized InterfaceC7199a a(Context context) {
        InterfaceC7199a interfaceC7199aA;
        interfaceC7199aA = f11296b;
        if (interfaceC7199aA == null) {
            interfaceC7199aA = new InterfaceC7199a.C0978a().b(fe.k.F(j.l(context), "image_cache")).a();
            f11296b = interfaceC7199aA;
        }
        return interfaceC7199aA;
    }
}
