package dg;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4620a f45302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f45303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f45304c;

    public G(C4620a address, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC5504s.h(address, "address");
        AbstractC5504s.h(proxy, "proxy");
        AbstractC5504s.h(socketAddress, "socketAddress");
        this.f45302a = address;
        this.f45303b = proxy;
        this.f45304c = socketAddress;
    }

    public final C4620a a() {
        return this.f45302a;
    }

    public final Proxy b() {
        return this.f45303b;
    }

    public final boolean c() {
        return this.f45302a.k() != null && this.f45303b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f45304c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return AbstractC5504s.c(g10.f45302a, this.f45302a) && AbstractC5504s.c(g10.f45303b, this.f45303b) && AbstractC5504s.c(g10.f45304c, this.f45304c);
    }

    public int hashCode() {
        return ((((527 + this.f45302a.hashCode()) * 31) + this.f45303b.hashCode()) * 31) + this.f45304c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f45304c + '}';
    }
}
