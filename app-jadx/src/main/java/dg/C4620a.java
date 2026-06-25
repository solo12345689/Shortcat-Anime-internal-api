package dg;

import com.adjust.sdk.Constants;
import dg.u;
import fg.AbstractC4807e;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: dg.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4620a {

    /* JADX INFO: renamed from: a */
    private final q f45313a;

    /* JADX INFO: renamed from: b */
    private final SocketFactory f45314b;

    /* JADX INFO: renamed from: c */
    private final SSLSocketFactory f45315c;

    /* JADX INFO: renamed from: d */
    private final HostnameVerifier f45316d;

    /* JADX INFO: renamed from: e */
    private final C4626g f45317e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC4621b f45318f;

    /* JADX INFO: renamed from: g */
    private final Proxy f45319g;

    /* JADX INFO: renamed from: h */
    private final ProxySelector f45320h;

    /* JADX INFO: renamed from: i */
    private final u f45321i;

    /* JADX INFO: renamed from: j */
    private final List f45322j;

    /* JADX INFO: renamed from: k */
    private final List f45323k;

    public C4620a(String uriHost, int i10, q dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C4626g c4626g, InterfaceC4621b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC5504s.h(uriHost, "uriHost");
        AbstractC5504s.h(dns, "dns");
        AbstractC5504s.h(socketFactory, "socketFactory");
        AbstractC5504s.h(proxyAuthenticator, "proxyAuthenticator");
        AbstractC5504s.h(protocols, "protocols");
        AbstractC5504s.h(connectionSpecs, "connectionSpecs");
        AbstractC5504s.h(proxySelector, "proxySelector");
        this.f45313a = dns;
        this.f45314b = socketFactory;
        this.f45315c = sSLSocketFactory;
        this.f45316d = hostnameVerifier;
        this.f45317e = c4626g;
        this.f45318f = proxyAuthenticator;
        this.f45319g = proxy;
        this.f45320h = proxySelector;
        this.f45321i = new u.a().o(sSLSocketFactory != null ? Constants.SCHEME : "http").e(uriHost).k(i10).a();
        this.f45322j = AbstractC4807e.V(protocols);
        this.f45323k = AbstractC4807e.V(connectionSpecs);
    }

    public final C4626g a() {
        return this.f45317e;
    }

    public final List b() {
        return this.f45323k;
    }

    public final q c() {
        return this.f45313a;
    }

    public final boolean d(C4620a that) {
        AbstractC5504s.h(that, "that");
        return AbstractC5504s.c(this.f45313a, that.f45313a) && AbstractC5504s.c(this.f45318f, that.f45318f) && AbstractC5504s.c(this.f45322j, that.f45322j) && AbstractC5504s.c(this.f45323k, that.f45323k) && AbstractC5504s.c(this.f45320h, that.f45320h) && AbstractC5504s.c(this.f45319g, that.f45319g) && AbstractC5504s.c(this.f45315c, that.f45315c) && AbstractC5504s.c(this.f45316d, that.f45316d) && AbstractC5504s.c(this.f45317e, that.f45317e) && this.f45321i.m() == that.f45321i.m();
    }

    public final HostnameVerifier e() {
        return this.f45316d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4620a)) {
            return false;
        }
        C4620a c4620a = (C4620a) obj;
        return AbstractC5504s.c(this.f45321i, c4620a.f45321i) && d(c4620a);
    }

    public final List f() {
        return this.f45322j;
    }

    public final Proxy g() {
        return this.f45319g;
    }

    public final InterfaceC4621b h() {
        return this.f45318f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f45321i.hashCode()) * 31) + this.f45313a.hashCode()) * 31) + this.f45318f.hashCode()) * 31) + this.f45322j.hashCode()) * 31) + this.f45323k.hashCode()) * 31) + this.f45320h.hashCode()) * 31) + Objects.hashCode(this.f45319g)) * 31) + Objects.hashCode(this.f45315c)) * 31) + Objects.hashCode(this.f45316d)) * 31) + Objects.hashCode(this.f45317e);
    }

    public final ProxySelector i() {
        return this.f45320h;
    }

    public final SocketFactory j() {
        return this.f45314b;
    }

    public final SSLSocketFactory k() {
        return this.f45315c;
    }

    public final u l() {
        return this.f45321i;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f45321i.h());
        sb3.append(':');
        sb3.append(this.f45321i.m());
        sb3.append(", ");
        if (this.f45319g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f45319g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f45320h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }
}
