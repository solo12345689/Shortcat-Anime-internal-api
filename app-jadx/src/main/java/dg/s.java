package dg;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import fg.AbstractC4807e;
import ie.InterfaceC5082a;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: e */
    public static final a f45572e = new a(null);

    /* JADX INFO: renamed from: a */
    private final H f45573a;

    /* JADX INFO: renamed from: b */
    private final C4628i f45574b;

    /* JADX INFO: renamed from: c */
    private final List f45575c;

    /* JADX INFO: renamed from: d */
    private final Lazy f45576d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: dg.s$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0720a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ List f45577a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0720a(List list) {
                super(0);
                this.f45577a = list;
            }

            @Override // ie.InterfaceC5082a
            public final List invoke() {
                return this.f45577a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ List f45578a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f45578a = list;
            }

            @Override // ie.InterfaceC5082a
            public final List invoke() {
                return this.f45578a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List c(Certificate[] certificateArr) {
            return certificateArr != null ? AbstractC4807e.w(Arrays.copyOf(certificateArr, certificateArr.length)) : AbstractC2279u.m();
        }

        public final s a(H tlsVersion, C4628i cipherSuite, List peerCertificates, List localCertificates) {
            AbstractC5504s.h(tlsVersion, "tlsVersion");
            AbstractC5504s.h(cipherSuite, "cipherSuite");
            AbstractC5504s.h(peerCertificates, "peerCertificates");
            AbstractC5504s.h(localCertificates, "localCertificates");
            return new s(tlsVersion, cipherSuite, AbstractC4807e.V(localCertificates), new C0720a(AbstractC4807e.V(peerCertificates)));
        }

        public final s b(SSLSession sSLSession) throws IOException {
            List listM;
            AbstractC5504s.h(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (AbstractC5504s.c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : AbstractC5504s.c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C4628i c4628iB = C4628i.f45448b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (AbstractC5504s.c("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            H hA = H.f45305b.a(protocol);
            try {
                listM = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listM = AbstractC2279u.m();
            }
            return new s(hA, c4628iB, c(sSLSession.getLocalCertificates()), new b(listM));
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5082a f45579a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5082a interfaceC5082a) {
            super(0);
            this.f45579a = interfaceC5082a;
        }

        @Override // ie.InterfaceC5082a
        public final List invoke() {
            try {
                return (List) this.f45579a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return AbstractC2279u.m();
            }
        }
    }

    public s(H tlsVersion, C4628i cipherSuite, List localCertificates, InterfaceC5082a peerCertificatesFn) {
        AbstractC5504s.h(tlsVersion, "tlsVersion");
        AbstractC5504s.h(cipherSuite, "cipherSuite");
        AbstractC5504s.h(localCertificates, "localCertificates");
        AbstractC5504s.h(peerCertificatesFn, "peerCertificatesFn");
        this.f45573a = tlsVersion;
        this.f45574b = cipherSuite;
        this.f45575c = localCertificates;
        this.f45576d = AbstractC2163n.b(new b(peerCertificatesFn));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        AbstractC5504s.g(type, "type");
        return type;
    }

    public final C4628i a() {
        return this.f45574b;
    }

    public final List c() {
        return this.f45575c;
    }

    public final List d() {
        return (List) this.f45576d.getValue();
    }

    public final H e() {
        return this.f45573a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.f45573a == this.f45573a && AbstractC5504s.c(sVar.f45574b, this.f45574b) && AbstractC5504s.c(sVar.d(), d()) && AbstractC5504s.c(sVar.f45575c, this.f45575c);
    }

    public int hashCode() {
        return ((((((527 + this.f45573a.hashCode()) * 31) + this.f45574b.hashCode()) * 31) + d().hashCode()) * 31) + this.f45575c.hashCode();
    }

    public String toString() {
        List listD = d();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f45573a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f45574b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List list = this.f45575c;
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
