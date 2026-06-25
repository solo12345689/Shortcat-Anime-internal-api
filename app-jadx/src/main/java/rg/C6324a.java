package rg;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6324a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0890a f58812c = new C0890a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f58813b;

    /* JADX INFO: renamed from: rg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0890a {
        public /* synthetic */ C0890a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0890a() {
        }
    }

    public C6324a(e trustRootIndex) {
        AbstractC5504s.h(trustRootIndex, "trustRootIndex");
        this.f58813b = trustRootIndex;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!AbstractC5504s.c(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // rg.c
    public List a(List chain, String hostname) throws SSLPeerUnverifiedException {
        AbstractC5504s.h(chain, "chain");
        AbstractC5504s.h(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC5504s.g(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.f58813b.a(x509Certificate);
            if (x509CertificateA == null) {
                Iterator it = arrayDeque.iterator();
                AbstractC5504s.g(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC5504s.f(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z10) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !AbstractC5504s.c(x509Certificate, x509CertificateA)) {
                arrayList.add(x509CertificateA);
            }
            if (b(x509CertificateA, x509CertificateA)) {
                return arrayList;
            }
            z10 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C6324a) && AbstractC5504s.c(((C6324a) obj).f58813b, this.f58813b);
    }

    public int hashCode() {
        return this.f58813b.hashCode();
    }
}
