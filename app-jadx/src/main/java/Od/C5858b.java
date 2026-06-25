package od;

import Df.C1271d;
import Df.r;
import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import ie.InterfaceC5082a;
import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zg.AbstractC7432y;
import zg.C7419n0;

/* JADX INFO: renamed from: od.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5858b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f55363c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f55364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f55365b;

    /* JADX INFO: renamed from: od.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final X509Certificate d(String str) throws CertificateException {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bytes = str.getBytes(C1271d.f3718b);
            AbstractC5504s.g(bytes, "getBytes(...)");
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
            AbstractC5504s.f(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) certificateGenerateCertificate;
            x509Certificate.checkValidity();
            return x509Certificate;
        }

        private final boolean f(X509Certificate x509Certificate) {
            if (x509Certificate.getBasicConstraints() > -1 && x509Certificate.getKeyUsage() != null) {
                boolean[] keyUsage = x509Certificate.getKeyUsage();
                AbstractC5504s.g(keyUsage, "getKeyUsage(...)");
                if (!(keyUsage.length == 0) && x509Certificate.getKeyUsage()[5]) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean g(X509Certificate x509Certificate) {
            if (x509Certificate.getKeyUsage() != null) {
                boolean[] keyUsage = x509Certificate.getKeyUsage();
                AbstractC5504s.g(keyUsage, "getKeyUsage(...)");
                if (!(keyUsage.length == 0) && x509Certificate.getKeyUsage()[0] && x509Certificate.getExtendedKeyUsage() != null && x509Certificate.getExtendedKeyUsage().contains("1.3.6.1.5.5.7.3.3")) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(List list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
            int size = list.size() - 1;
            int i10 = 0;
            while (i10 < size) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i10);
                i10++;
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i10);
                if (!x509Certificate.getIssuerX500Principal().equals(x509Certificate2.getSubjectX500Principal())) {
                    throw new CertificateException("Certificates do not chain");
                }
                x509Certificate.verify(x509Certificate2.getPublicKey());
            }
            if (!((X509Certificate) AbstractC2279u.y0(list)).getIssuerX500Principal().equals(((X509Certificate) AbstractC2279u.y0(list)).getSubjectX500Principal())) {
                throw new CertificateException("Root certificate not self-signed");
            }
            ((X509Certificate) AbstractC2279u.y0(list)).verify(((X509Certificate) AbstractC2279u.y0(list)).getPublicKey());
            if (list.size() > 1) {
                X509Certificate x509Certificate3 = (X509Certificate) AbstractC2279u.y0(list);
                if (!f(x509Certificate3)) {
                    throw new CertificateException("Root certificate subject must be a Certificate Authority");
                }
                C5863g c5863gE = e(x509Certificate3);
                int basicConstraints = x509Certificate3.getBasicConstraints();
                int size2 = list.size() - 2;
                while (size2 > 0) {
                    X509Certificate x509Certificate4 = (X509Certificate) list.get(size2);
                    if (!f(x509Certificate4)) {
                        throw new CertificateException("Non-leaf certificate subject must be a Certificate Authority");
                    }
                    C5863g c5863gE2 = e(x509Certificate4);
                    if (c5863gE != null && !AbstractC5504s.c(c5863gE, c5863gE2)) {
                        throw new CertificateException("Expo project information must be a subset or equal of that of parent certificates");
                    }
                    if (basicConstraints <= 0) {
                        throw new CertificateException("pathLenConstraint violated by intermediate certificate");
                    }
                    basicConstraints = Math.min(x509Certificate4.getBasicConstraints(), basicConstraints - 1);
                    size2--;
                    c5863gE = c5863gE2;
                }
                if (c5863gE != null && !AbstractC5504s.c(c5863gE, e((X509Certificate) AbstractC2279u.m0(list)))) {
                    throw new CertificateException("Expo project information must be a subset of or equal to that of parent certificates");
                }
            }
        }

        public final C5863g e(X509Certificate x509Certificate) throws CertificateException {
            AbstractC7432y abstractC7432yV;
            String strX;
            AbstractC5504s.h(x509Certificate, "<this>");
            byte[] extensionValue = x509Certificate.getExtensionValue("1.2.840.113556.1.8000.2554.43437.254.128.102.157.7894389.20439.2.1");
            if (extensionValue != null && (abstractC7432yV = AbstractC7432y.v(extensionValue)) != null) {
                if (abstractC7432yV instanceof C7419n0) {
                    byte[] bArrB = ((C7419n0) abstractC7432yV).B();
                    AbstractC5504s.g(bArrB, "getOctets(...)");
                    strX = r.x(bArrB);
                } else {
                    strX = null;
                }
                if (strX != null) {
                    List listM0 = r.M0(strX, new char[]{','}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM0, 10));
                    Iterator it = listM0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(r.k1((String) it.next()).toString());
                    }
                    if (arrayList.size() == 2) {
                        return new C5863g((String) arrayList.get(0), (String) arrayList.get(1));
                    }
                    throw new CertificateException("Invalid Expo project information extension value");
                }
            }
            return null;
        }

        private a() {
        }
    }

    public C5858b(List certificateStrings) {
        AbstractC5504s.h(certificateStrings, "certificateStrings");
        this.f55364a = certificateStrings;
        this.f55365b = AbstractC2163n.b(new InterfaceC5082a() { // from class: od.a
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5858b.b(this.f55362a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X509Certificate b(C5858b c5858b) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (c5858b.f55364a.isEmpty()) {
            throw new CertificateException("No code signing certificates provided");
        }
        List list = c5858b.f55364a;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f55363c.d((String) it.next()));
        }
        a aVar = f55363c;
        aVar.h(arrayList);
        X509Certificate x509Certificate = (X509Certificate) arrayList.get(0);
        if (aVar.g(x509Certificate)) {
            return x509Certificate;
        }
        throw new CertificateException("First certificate in chain is not a code signing certificate. Must have X509v3 Key Usage: Digital Signature and X509v3 Extended Key Usage: Code Signing");
    }

    public final X509Certificate c() {
        return (X509Certificate) this.f55365b.getValue();
    }
}
