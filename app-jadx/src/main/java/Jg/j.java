package jg;

import Ud.AbstractC2279u;
import dg.C4620a;
import dg.G;
import dg.InterfaceC4624e;
import dg.r;
import dg.u;
import fg.AbstractC4807e;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f51911i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4620a f51912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f51913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4624e f51914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f51915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f51916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f51918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f51919h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            AbstractC5504s.h(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                AbstractC5504s.g(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            AbstractC5504s.g(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f51920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51921b;

        public b(List routes) {
            AbstractC5504s.h(routes, "routes");
            this.f51920a = routes;
        }

        public final List a() {
            return this.f51920a;
        }

        public final boolean b() {
            return this.f51921b < this.f51920a.size();
        }

        public final G c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f51920a;
            int i10 = this.f51921b;
            this.f51921b = i10 + 1;
            return (G) list.get(i10);
        }
    }

    public j(C4620a address, h routeDatabase, InterfaceC4624e call, r eventListener) {
        AbstractC5504s.h(address, "address");
        AbstractC5504s.h(routeDatabase, "routeDatabase");
        AbstractC5504s.h(call, "call");
        AbstractC5504s.h(eventListener, "eventListener");
        this.f51912a = address;
        this.f51913b = routeDatabase;
        this.f51914c = call;
        this.f51915d = eventListener;
        this.f51916e = AbstractC2279u.m();
        this.f51918g = AbstractC2279u.m();
        this.f51919h = new ArrayList();
        f(address.l(), address.g());
    }

    private final boolean b() {
        return this.f51917f < this.f51916e.size();
    }

    private final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List list = this.f51916e;
            int i10 = this.f51917f;
            this.f51917f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f51912a.l().h() + "; exhausted proxy configurations: " + this.f51916e);
    }

    private final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String strH;
        int iM;
        List listA;
        ArrayList arrayList = new ArrayList();
        this.f51918g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strH = this.f51912a.l().h();
            iM = this.f51912a.l().m();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            a aVar = f51911i;
            AbstractC5504s.g(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strH = aVar.a(inetSocketAddress);
            iM = inetSocketAddress.getPort();
        }
        if (1 > iM || iM >= 65536) {
            throw new SocketException("No route to " + strH + ':' + iM + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strH, iM));
            return;
        }
        if (AbstractC4807e.i(strH)) {
            listA = AbstractC2279u.e(InetAddress.getByName(strH));
        } else {
            this.f51915d.n(this.f51914c, strH);
            listA = this.f51912a.c().a(strH);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.f51912a.c() + " returned no addresses for " + strH);
            }
            this.f51915d.m(this.f51914c, strH, listA);
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM));
        }
    }

    private final void f(u uVar, Proxy proxy) {
        this.f51915d.p(this.f51914c, uVar);
        List listG = g(proxy, uVar, this);
        this.f51916e = listG;
        this.f51917f = 0;
        this.f51915d.o(this.f51914c, uVar, listG);
    }

    private static final List g(Proxy proxy, u uVar, j jVar) {
        if (proxy != null) {
            return AbstractC2279u.e(proxy);
        }
        URI uriR = uVar.r();
        if (uriR.getHost() == null) {
            return AbstractC4807e.w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = jVar.f51912a.i().select(uriR);
        if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
            return AbstractC4807e.w(Proxy.NO_PROXY);
        }
        AbstractC5504s.g(proxiesOrNull, "proxiesOrNull");
        return AbstractC4807e.V(proxiesOrNull);
    }

    public final boolean a() {
        return b() || !this.f51919h.isEmpty();
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator it = this.f51918g.iterator();
            while (it.hasNext()) {
                G g10 = new G(this.f51912a, proxyD, (InetSocketAddress) it.next());
                if (this.f51913b.c(g10)) {
                    this.f51919h.add(g10);
                } else {
                    arrayList.add(g10);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC2279u.D(arrayList, this.f51919h);
            this.f51919h.clear();
        }
        return new b(arrayList);
    }
}
