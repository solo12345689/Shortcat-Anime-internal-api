package kg;

import Df.p;
import dg.C;
import dg.C4618A;
import dg.D;
import dg.E;
import dg.G;
import dg.u;
import dg.v;
import fg.AbstractC4807e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52220b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4618A f52221a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(C4618A client) {
        AbstractC5504s.h(client, "client");
        this.f52221a = client;
    }

    private final C b(E e10, String str) {
        String strD;
        u uVarP;
        if (!this.f52221a.x() || (strD = E.D(e10, "Location", null, 2, null)) == null || (uVarP = e10.F0().p().p(strD)) == null) {
            return null;
        }
        if (!AbstractC5504s.c(uVarP.q(), e10.F0().p().q()) && !this.f52221a.y()) {
            return null;
        }
        C.a aVarM = e10.F0().m();
        if (C5483f.b(str)) {
            int iO = e10.o();
            C5483f c5483f = C5483f.f52206a;
            boolean z10 = c5483f.d(str) || iO == 308 || iO == 307;
            if (!c5483f.c(str) || iO == 308 || iO == 307) {
                aVarM.g(str, z10 ? e10.F0().e() : null);
            } else {
                aVarM.g("GET", null);
            }
            if (!z10) {
                aVarM.i("Transfer-Encoding");
                aVarM.i("Content-Length");
                aVarM.i("Content-Type");
            }
        }
        if (!AbstractC4807e.j(e10.F0().p(), uVarP)) {
            aVarM.i("Authorization");
        }
        return aVarM.l(uVarP).b();
    }

    private final C c(E e10, jg.c cVar) throws ProtocolException {
        jg.f fVarH;
        G gA = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.A();
        int iO = e10.o();
        String strL = e10.F0().l();
        if (iO != 307 && iO != 308) {
            if (iO == 401) {
                return this.f52221a.i().a(gA, e10);
            }
            if (iO == 421) {
                D dE = e10.F0().e();
                if ((dE != null && dE.e()) || cVar == null || !cVar.l()) {
                    return null;
                }
                cVar.h().y();
                return e10.F0();
            }
            if (iO == 503) {
                E eK0 = e10.k0();
                if ((eK0 == null || eK0.o() != 503) && g(e10, Integer.MAX_VALUE) == 0) {
                    return e10.F0();
                }
                return null;
            }
            if (iO == 407) {
                AbstractC5504s.e(gA);
                if (gA.b().type() == Proxy.Type.HTTP) {
                    return this.f52221a.K().a(gA, e10);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iO == 408) {
                if (!this.f52221a.N()) {
                    return null;
                }
                D dE2 = e10.F0().e();
                if (dE2 != null && dE2.e()) {
                    return null;
                }
                E eK02 = e10.k0();
                if ((eK02 == null || eK02.o() != 408) && g(e10, 0) <= 0) {
                    return e10.F0();
                }
                return null;
            }
            switch (iO) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(e10, strL);
    }

    private final boolean d(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException iOException, jg.e eVar, C c10, boolean z10) {
        if (this.f52221a.N()) {
            return !(z10 && f(iOException, c10)) && d(iOException, z10) && eVar.A();
        }
        return false;
    }

    private final boolean f(IOException iOException, C c10) {
        D dE = c10.e();
        return (dE != null && dE.e()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(E e10, int i10) {
        String strD = E.D(e10, "Retry-After", null, 2, null);
        if (strD == null) {
            return i10;
        }
        if (!new p("\\d+").h(strD)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strD);
        AbstractC5504s.g(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = r1.q();
        r6 = c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.m() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1.C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r1.j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r0 = r6.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.e() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1.j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r0 = r7.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        fg.AbstractC4807e.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r8 > 20) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r0.Y().o(r7.Y().b(null).c()).c();
     */
    @Override // dg.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dg.E a(dg.v.a r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.j.a(dg.v$a):dg.E");
    }
}
