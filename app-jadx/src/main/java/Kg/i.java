package kg;

import dg.C;
import dg.u;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f52219a = new i();

    private i() {
    }

    private final boolean b(C c10, Proxy.Type type) {
        return !c10.k() && type == Proxy.Type.HTTP;
    }

    public final String a(C request, Proxy.Type proxyType) {
        AbstractC5504s.h(request, "request");
        AbstractC5504s.h(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.l());
        sb2.append(' ');
        i iVar = f52219a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.p());
        } else {
            sb2.append(iVar.c(request.p()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(u url) {
        AbstractC5504s.h(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
