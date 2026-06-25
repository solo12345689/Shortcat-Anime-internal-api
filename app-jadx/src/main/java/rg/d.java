package rg;

import Df.r;
import Ud.AbstractC2279u;
import fg.AbstractC4803a;
import fg.AbstractC4807e;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC5504s;
import tg.b0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f58816a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        AbstractC5504s.g(US, "US");
        String lowerCase = str.toLowerCase(US);
        AbstractC5504s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List c(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return AbstractC2279u.m();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC5504s.c(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return AbstractC2279u.m();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) b0.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !r.Q(str, ".", false, 2, null) && !r.A(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !r.Q(str2, ".", false, 2, null) && !r.A(str2, "..", false, 2, null)) {
            if (!r.A(str, ".", false, 2, null)) {
                str = str + com.amazon.a.a.o.c.a.b.f34706a;
            }
            String str3 = str;
            if (!r.A(str2, ".", false, 2, null)) {
                str2 = str2 + com.amazon.a.a.o.c.a.b.f34706a;
            }
            String strB = b(str2);
            if (!r.W(strB, "*", false, 2, null)) {
                return AbstractC5504s.c(str3, strB);
            }
            if (!r.Q(strB, "*.", false, 2, null) || r.i0(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || AbstractC5504s.c("*.", strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            AbstractC5504s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!r.A(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || r.o0(str3, com.amazon.a.a.o.c.a.b.f34706a, length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List listC = c(x509Certificate, 2);
        if (listC != null && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (f58816a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String strE = AbstractC4803a.e(str);
        List listC = c(x509Certificate, 7);
        if (listC != null && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (AbstractC5504s.c(strE, AbstractC4803a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List a(X509Certificate certificate) {
        AbstractC5504s.h(certificate, "certificate");
        return AbstractC2279u.I0(c(certificate, 7), c(certificate, 2));
    }

    public final boolean e(String host, X509Certificate certificate) {
        AbstractC5504s.h(host, "host");
        AbstractC5504s.h(certificate, "certificate");
        return AbstractC4807e.i(host) ? h(host, certificate) : g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        AbstractC5504s.h(host, "host");
        AbstractC5504s.h(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            AbstractC5504s.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
