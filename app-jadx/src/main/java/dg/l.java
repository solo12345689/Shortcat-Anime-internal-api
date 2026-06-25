package dg;

import Ud.AbstractC2279u;
import fg.AbstractC4807e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f45518e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C4628i[] f45519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C4628i[] f45520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f45521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f45522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f45523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f45524k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f45525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f45527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f45528d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        C4628i c4628i = C4628i.f45489o1;
        C4628i c4628i2 = C4628i.f45492p1;
        C4628i c4628i3 = C4628i.f45495q1;
        C4628i c4628i4 = C4628i.f45447a1;
        C4628i c4628i5 = C4628i.f45459e1;
        C4628i c4628i6 = C4628i.f45450b1;
        C4628i c4628i7 = C4628i.f45462f1;
        C4628i c4628i8 = C4628i.f45480l1;
        C4628i c4628i9 = C4628i.f45477k1;
        C4628i[] c4628iArr = {c4628i, c4628i2, c4628i3, c4628i4, c4628i5, c4628i6, c4628i7, c4628i8, c4628i9};
        f45519f = c4628iArr;
        C4628i[] c4628iArr2 = {c4628i, c4628i2, c4628i3, c4628i4, c4628i5, c4628i6, c4628i7, c4628i8, c4628i9, C4628i.f45417L0, C4628i.f45419M0, C4628i.f45473j0, C4628i.f45476k0, C4628i.f45408H, C4628i.f45416L, C4628i.f45478l};
        f45520g = c4628iArr2;
        a aVarB = new a(true).b((C4628i[]) Arrays.copyOf(c4628iArr, c4628iArr.length));
        H h10 = H.TLS_1_3;
        H h11 = H.TLS_1_2;
        f45521h = aVarB.e(h10, h11).d(true).a();
        f45522i = new a(true).b((C4628i[]) Arrays.copyOf(c4628iArr2, c4628iArr2.length)).e(h10, h11).d(true).a();
        f45523j = new a(true).b((C4628i[]) Arrays.copyOf(c4628iArr2, c4628iArr2.length)).e(h10, h11, H.TLS_1_1, H.TLS_1_0).d(true).a();
        f45524k = new a(false).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f45525a = z10;
        this.f45526b = z11;
        this.f45527c = strArr;
        this.f45528d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z10) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f45527c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            AbstractC5504s.g(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = AbstractC4807e.E(enabledCipherSuites, this.f45527c, C4628i.f45448b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f45528d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            AbstractC5504s.g(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = AbstractC4807e.E(enabledProtocols, this.f45528d, Xd.a.f());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC5504s.g(supportedCipherSuites, "supportedCipherSuites");
        int iX = AbstractC4807e.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", C4628i.f45448b.c());
        if (z10 && iX != -1) {
            AbstractC5504s.g(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iX];
            AbstractC5504s.g(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = AbstractC4807e.o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        AbstractC5504s.g(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarC = aVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        AbstractC5504s.g(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarC.f((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean z10) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        l lVarG = g(sslSocket, z10);
        if (lVarG.i() != null) {
            sslSocket.setEnabledProtocols(lVarG.f45528d);
        }
        if (lVarG.d() != null) {
            sslSocket.setEnabledCipherSuites(lVarG.f45527c);
        }
    }

    public final List d() {
        String[] strArr = this.f45527c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C4628i.f45448b.b(str));
        }
        return AbstractC2279u.b1(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        AbstractC5504s.h(socket, "socket");
        if (!this.f45525a) {
            return false;
        }
        String[] strArr = this.f45528d;
        if (strArr != null && !AbstractC4807e.u(strArr, socket.getEnabledProtocols(), Xd.a.f())) {
            return false;
        }
        String[] strArr2 = this.f45527c;
        return strArr2 == null || AbstractC4807e.u(strArr2, socket.getEnabledCipherSuites(), C4628i.f45448b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f45525a;
        l lVar = (l) obj;
        if (z10 != lVar.f45525a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f45527c, lVar.f45527c) && Arrays.equals(this.f45528d, lVar.f45528d) && this.f45526b == lVar.f45526b);
    }

    public final boolean f() {
        return this.f45525a;
    }

    public final boolean h() {
        return this.f45526b;
    }

    public int hashCode() {
        if (!this.f45525a) {
            return 17;
        }
        String[] strArr = this.f45527c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f45528d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f45526b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f45528d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(H.f45305b.a(str));
        }
        return AbstractC2279u.b1(arrayList);
    }

    public String toString() {
        if (!this.f45525a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f45526b + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f45529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f45530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f45531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f45532d;

        public a(boolean z10) {
            this.f45529a = z10;
        }

        public final l a() {
            return new l(this.f45529a, this.f45532d, this.f45530b, this.f45531c);
        }

        public final a b(C4628i... cipherSuites) {
            AbstractC5504s.h(cipherSuites, "cipherSuites");
            if (!this.f45529a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C4628i c4628i : cipherSuites) {
                arrayList.add(c4628i.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... cipherSuites) {
            AbstractC5504s.h(cipherSuites, "cipherSuites");
            if (!this.f45529a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f45530b = (String[]) cipherSuites.clone();
            return this;
        }

        public final a d(boolean z10) {
            if (!this.f45529a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f45532d = z10;
            return this;
        }

        public final a e(H... tlsVersions) {
            AbstractC5504s.h(tlsVersions, "tlsVersions");
            if (!this.f45529a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (H h10 : tlsVersions) {
                arrayList.add(h10.b());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... tlsVersions) {
            AbstractC5504s.h(tlsVersions, "tlsVersions");
            if (!this.f45529a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f45531c = (String[]) tlsVersions.clone();
            return this;
        }

        public a(l connectionSpec) {
            AbstractC5504s.h(connectionSpec, "connectionSpec");
            this.f45529a = connectionSpec.f();
            this.f45530b = connectionSpec.f45527c;
            this.f45531c = connectionSpec.f45528d;
            this.f45532d = connectionSpec.h();
        }
    }
}
