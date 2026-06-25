package eg;

import Df.r;
import Rh.b;
import dg.E;
import dg.F;
import dg.v;
import kg.AbstractC5482e;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6694t;
import tg.InterfaceC6685j;
import tg.K;

/* JADX INFO: renamed from: eg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4675a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4675a f45979a = new C4675a();

    private C4675a() {
    }

    @Override // dg.v
    public E a(v.a chain) {
        AbstractC5504s.h(chain, "chain");
        return chain.z().h("Accept-Encoding") == null ? b(chain.a(chain.z().m().e("Accept-Encoding", "br,gzip").b())) : chain.a(chain.z());
    }

    public final E b(E response) {
        F fJ;
        String strD;
        InterfaceC6685j interfaceC6685jD;
        AbstractC5504s.h(response, "response");
        if (!AbstractC5482e.b(response) || (fJ = response.j()) == null || (strD = E.D(response, "Content-Encoding", null, 2, null)) == null) {
            return response;
        }
        if (r.B(strD, "br", true)) {
            interfaceC6685jD = K.d(K.k(new b(fJ.k().L())));
        } else {
            if (!r.B(strD, "gzip", true)) {
                return response;
            }
            interfaceC6685jD = K.d(new C6694t(fJ.k()));
        }
        return response.Y().r("Content-Encoding").r("Content-Length").b(F.f45298a.c(interfaceC6685jD, fJ.j(), -1L)).c();
    }
}
