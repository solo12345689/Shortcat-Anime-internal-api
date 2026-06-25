package od;

import Df.r;
import Td.AbstractC2163n;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.util.Base64;
import android.util.Log;
import id.C5069a;
import id.C5072d;
import id.o;
import ie.InterfaceC5082a;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import od.EnumC5859c;

/* JADX INFO: renamed from: od.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5862f {

    /* JADX INFO: renamed from: g */
    public static final a f55373g = new a(null);

    /* JADX INFO: renamed from: a */
    private final String f55374a;

    /* JADX INFO: renamed from: b */
    private final Map f55375b;

    /* JADX INFO: renamed from: c */
    private final boolean f55376c;

    /* JADX INFO: renamed from: d */
    private final boolean f55377d;

    /* JADX INFO: renamed from: e */
    private final Lazy f55378e;

    /* JADX INFO: renamed from: f */
    private final Lazy f55379f;

    /* JADX INFO: renamed from: od.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(String certificateChainInManifestResponse) {
            AbstractC5504s.h(certificateChainInManifestResponse, "certificateChainInManifestResponse");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                String str = certificateChainInManifestResponse;
                int iJ0 = r.j0(str, "-----BEGIN CERTIFICATE-----", i10, false, 4, null);
                int iJ02 = r.j0(str, "-----END CERTIFICATE-----", i10, false, 4, null);
                if (iJ0 == -1 || iJ02 == -1) {
                    break;
                }
                i10 = iJ02 + 25;
                String strSubstring = str.substring(iJ0, i10);
                AbstractC5504s.g(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                certificateChainInManifestResponse = str;
            }
            return arrayList;
        }

        private a() {
        }
    }

    public C5862f(String embeddedCertificateString, Map map, boolean z10, boolean z11) {
        AbstractC5504s.h(embeddedCertificateString, "embeddedCertificateString");
        this.f55374a = embeddedCertificateString;
        this.f55375b = map;
        this.f55376c = z10;
        this.f55377d = z11;
        this.f55378e = AbstractC2163n.b(new InterfaceC5082a() { // from class: od.d
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5862f.c(this.f55371a);
            }
        });
        this.f55379f = AbstractC2163n.b(new InterfaceC5082a() { // from class: od.e
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5862f.g(this.f55372a);
            }
        });
    }

    public static final EnumC5859c c(C5862f c5862f) {
        EnumC5859c.a aVar = EnumC5859c.f55366b;
        Map map = c5862f.f55375b;
        return aVar.a(map != null ? (String) map.get("alg") : null);
    }

    private final EnumC5859c e() {
        return (EnumC5859c) this.f55378e.getValue();
    }

    private final String f() {
        return (String) this.f55379f.getValue();
    }

    public static final String g(C5862f c5862f) {
        String str;
        Map map = c5862f.f55375b;
        return (map == null || (str = (String) map.get("keyid")) == null) ? "root" : str;
    }

    private final i i(C5864h c5864h, byte[] bArr, String str) throws Exception {
        C5858b c5858b;
        if (this.f55376c) {
            a aVar = f55373g;
            if (str == null) {
                str = "";
            }
            c5858b = new C5858b(AbstractC2279u.J0(aVar.a(str), this.f55374a));
        } else {
            if (!AbstractC5504s.c(c5864h.b(), f())) {
                throw new Exception("Key with keyid=" + c5864h.b() + " from signature not found in client configuration");
            }
            if (c5864h.a() != e()) {
                Log.i("CodeSigning", "Key with alg=" + c5864h.a() + " from signature does not match client configuration algorithm, continuing");
            }
            c5858b = new C5858b(AbstractC2279u.e(this.f55374a));
        }
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(c5858b.c().getPublicKey());
        signature.update(bArr);
        return new i(signature.verify(Base64.decode(c5864h.c(), 0)) ? j.f55388a : j.f55389b, C5858b.f55363c.e(c5858b.c()));
    }

    public final String d() {
        String strE = C5072d.f(S.l(z.a("sig", C5069a.e(true)), z.a("keyid", o.f(f())), z.a("alg", o.f(e().b())))).e();
        AbstractC5504s.g(strE, "serialize(...)");
        return strE;
    }

    public final i h(String str, byte[] bodyBytes, String str2) throws Exception {
        AbstractC5504s.h(bodyBytes, "bodyBytes");
        if (str != null) {
            return i(C5864h.f55382d.a(str), bodyBytes, str2);
        }
        if (this.f55377d) {
            return new i(j.f55390c, null);
        }
        throw new Exception("No expo-signature header specified");
    }
}
