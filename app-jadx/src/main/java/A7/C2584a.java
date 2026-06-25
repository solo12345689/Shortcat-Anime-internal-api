package a7;

import dg.C4618A;
import dg.InterfaceC4624e;
import dg.p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: a7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2584a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2584a f23827a = new C2584a();

    private C2584a() {
    }

    public static final void a(C4618A client, Object tag) {
        AbstractC5504s.h(client, "client");
        AbstractC5504s.h(tag, "tag");
        p pVarE = client.e();
        for (InterfaceC4624e interfaceC4624e : pVarE.i()) {
            if (AbstractC5504s.c(tag, interfaceC4624e.z().n())) {
                interfaceC4624e.cancel();
                return;
            }
        }
        for (InterfaceC4624e interfaceC4624e2 : pVarE.j()) {
            if (AbstractC5504s.c(tag, interfaceC4624e2.z().n())) {
                interfaceC4624e2.cancel();
                return;
            }
        }
    }
}
