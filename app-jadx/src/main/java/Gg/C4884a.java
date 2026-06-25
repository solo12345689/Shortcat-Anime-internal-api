package gg;

import Df.r;
import Ud.AbstractC2279u;
import dg.C;
import dg.C4620a;
import dg.C4627h;
import dg.E;
import dg.G;
import dg.InterfaceC4621b;
import dg.o;
import dg.q;
import dg.u;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4884a implements InterfaceC4621b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f47475d;

    /* JADX INFO: renamed from: gg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class C0763a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47476a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f47476a = iArr;
        }
    }

    public C4884a(q defaultDns) {
        AbstractC5504s.h(defaultDns, "defaultDns");
        this.f47475d = defaultDns;
    }

    private final InetAddress b(Proxy proxy, u uVar, q qVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0763a.f47476a[type.ordinal()]) == 1) {
            return (InetAddress) AbstractC2279u.m0(qVar.a(uVar.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        AbstractC5504s.f(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        AbstractC5504s.g(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // dg.InterfaceC4621b
    public C a(G g10, E response) {
        Proxy proxy;
        q qVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C4620a c4620aA;
        AbstractC5504s.h(response, "response");
        List<C4627h> listM = response.m();
        C cF0 = response.F0();
        u uVarP = cF0.p();
        boolean z10 = response.o() == 407;
        if (g10 == null || (proxy = g10.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C4627h c4627h : listM) {
            if (r.B("Basic", c4627h.c(), true)) {
                if (g10 == null || (c4620aA = g10.a()) == null || (qVarC = c4620aA.c()) == null) {
                    qVarC = this.f47475d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    AbstractC5504s.f(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    AbstractC5504s.g(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, uVarP, qVarC), inetSocketAddress.getPort(), uVarP.q(), c4627h.b(), c4627h.c(), uVarP.s(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = uVarP.h();
                    AbstractC5504s.g(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strH, b(proxy, uVarP, qVarC), uVarP.m(), uVarP.q(), c4627h.b(), c4627h.c(), uVarP.s(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    AbstractC5504s.g(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    AbstractC5504s.g(password, "auth.password");
                    return cF0.m().e(str, o.a(userName, new String(password), c4627h.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ C4884a(q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.f45568b : qVar);
    }
}
