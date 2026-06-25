package dg;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.Constants;
import ie.InterfaceC5082a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6686k;

/* JADX INFO: renamed from: dg.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4626g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f45384c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C4626g f45385d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f45386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rg.c f45387b;

    /* JADX INFO: renamed from: dg.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f45388a = new ArrayList();

        public final C4626g a() {
            return new C4626g(AbstractC2279u.f1(this.f45388a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: dg.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            AbstractC5504s.h(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + b((X509Certificate) certificate).b();
        }

        public final C6686k b(X509Certificate x509Certificate) {
            AbstractC5504s.h(x509Certificate, "<this>");
            C6686k.a aVar = C6686k.f61044d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            AbstractC5504s.g(encoded, "publicKey.encoded");
            return C6686k.a.j(aVar, encoded, 0, 0, 3, null).J();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: dg.g$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f45390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f45391c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, String str) {
            super(0);
            this.f45390b = list;
            this.f45391c = str;
        }

        @Override // ie.InterfaceC5082a
        public final List invoke() {
            List<Certificate> listA;
            rg.c cVarD = C4626g.this.d();
            if (cVarD == null || (listA = cVarD.a(this.f45390b, this.f45391c)) == null) {
                listA = this.f45390b;
            }
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listA, 10));
            for (Certificate certificate : listA) {
                AbstractC5504s.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C4626g(Set pins, rg.c cVar) {
        AbstractC5504s.h(pins, "pins");
        this.f45386a = pins;
        this.f45387b = cVar;
    }

    public final void a(String hostname, List peerCertificates) {
        AbstractC5504s.h(hostname, "hostname");
        AbstractC5504s.h(peerCertificates, "peerCertificates");
        b(hostname, new c(peerCertificates, hostname));
    }

    public final void b(String hostname, InterfaceC5082a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        AbstractC5504s.h(hostname, "hostname");
        AbstractC5504s.h(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(f45384c.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            sb2.append("\n    ");
            sb2.append((Object) null);
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List c(String hostname) {
        AbstractC5504s.h(hostname, "hostname");
        Set set = this.f45386a;
        List listM = AbstractC2279u.m();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listM;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public final rg.c d() {
        return this.f45387b;
    }

    public final C4626g e(rg.c certificateChainCleaner) {
        AbstractC5504s.h(certificateChainCleaner, "certificateChainCleaner");
        return AbstractC5504s.c(this.f45387b, certificateChainCleaner) ? this : new C4626g(this.f45386a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4626g)) {
            return false;
        }
        C4626g c4626g = (C4626g) obj;
        return AbstractC5504s.c(c4626g.f45386a, this.f45386a) && AbstractC5504s.c(c4626g.f45387b, this.f45387b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f45386a.hashCode()) * 41;
        rg.c cVar = this.f45387b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ C4626g(Set set, rg.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
