package od;

import id.InterfaceC5076h;
import id.n;
import id.o;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: od.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5864h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55382d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f55384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC5859c f55385c;

    /* JADX INFO: renamed from: od.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5864h a(String signatureHeader) throws Exception {
            AbstractC5504s.h(signatureHeader, "signatureHeader");
            Map map = new n(signatureHeader).B().get();
            InterfaceC5076h interfaceC5076h = (InterfaceC5076h) map.get("sig");
            InterfaceC5076h interfaceC5076h2 = (InterfaceC5076h) map.get("keyid");
            InterfaceC5076h interfaceC5076h3 = (InterfaceC5076h) map.get("alg");
            if (!(interfaceC5076h instanceof o)) {
                throw new Exception("Structured field sig not found in expo-signature header");
            }
            String str = ((o) interfaceC5076h).get();
            String str2 = interfaceC5076h2 instanceof o ? ((o) interfaceC5076h2).get() : "root";
            String str3 = interfaceC5076h3 instanceof o ? ((o) interfaceC5076h3).get() : null;
            AbstractC5504s.e(str);
            AbstractC5504s.e(str2);
            return new C5864h(str, str2, EnumC5859c.f55366b.a(str3));
        }

        private a() {
        }
    }

    public C5864h(String signature, String keyId, EnumC5859c algorithm) {
        AbstractC5504s.h(signature, "signature");
        AbstractC5504s.h(keyId, "keyId");
        AbstractC5504s.h(algorithm, "algorithm");
        this.f55383a = signature;
        this.f55384b = keyId;
        this.f55385c = algorithm;
    }

    public final EnumC5859c a() {
        return this.f55385c;
    }

    public final String b() {
        return this.f55384b;
    }

    public final String c() {
        return this.f55383a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5864h)) {
            return false;
        }
        C5864h c5864h = (C5864h) obj;
        return AbstractC5504s.c(this.f55383a, c5864h.f55383a) && AbstractC5504s.c(this.f55384b, c5864h.f55384b) && this.f55385c == c5864h.f55385c;
    }

    public int hashCode() {
        return (((this.f55383a.hashCode() * 31) + this.f55384b.hashCode()) * 31) + this.f55385c.hashCode();
    }

    public String toString() {
        return "SignatureHeaderInfo(signature=" + this.f55383a + ", keyId=" + this.f55384b + ", algorithm=" + this.f55385c + ")";
    }
}
