package F2;

import F2.t;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import z2.InterfaceC7277b;

/* JADX INFO: renamed from: F2.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1558m {

    /* JADX INFO: renamed from: F2.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6253a;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f6253a = i10;
        }
    }

    static void e(InterfaceC1558m interfaceC1558m, InterfaceC1558m interfaceC1558m2) {
        if (interfaceC1558m == interfaceC1558m2) {
            return;
        }
        if (interfaceC1558m2 != null) {
            interfaceC1558m2.g(null);
        }
        if (interfaceC1558m != null) {
            interfaceC1558m.h(null);
        }
    }

    UUID a();

    boolean b();

    a c();

    InterfaceC7277b d();

    Map f();

    void g(t.a aVar);

    int getState();

    void h(t.a aVar);

    boolean i(String str);
}
