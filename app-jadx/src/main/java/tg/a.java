package Tg;

import Fg.g;
import Jh.f;
import Oh.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import vh.C6871c;
import wh.C6980c;
import xh.C7178c;
import yh.C7253c;
import zg.C7427t;
import zh.C7436c;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends Provider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f17538b = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f17539c = "BouncyCastle Security Provider v1.81";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pg.a f17540d = new Tg.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f17541e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f17542f = Qg.a.a(a.class, "java.security.cert.PKIXRevocationChecker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f17543g = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f17544h = {"SipHash", "SipHash128", "Poly1305"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Fg.c[] f17545i = {p("AES", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("ARC4", 20), p("ARIA", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("Blowfish", 128), p("Camellia", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("CAST5", 128), p("CAST6", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("ChaCha", 128), p("DES", 56), p("DESede", 112), p("GOST28147", 128), p("Grainv1", 128), p("Grain128", 128), p("HC128", 128), p("HC256", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("IDEA", 128), p("Noekeon", 128), p("RC2", 128), p("RC5", 128), p("RC6", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("Rijndael", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("Salsa20", 128), p("SEED", 128), p("Serpent", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("Shacal2", 128), p("Skipjack", 80), p("SM4", 128), p("TEA", 128), p("Twofish", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("Threefish", 128), p("VMPC", 128), p("VMPCKSA3", 128), p("XTEA", 128), p("XSalsa20", 128), p("OpenSSLPBKDF", 128), p("DSTU7624", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("GOST3412_2015", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), p("Zuc", 128)};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f17546j = {"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures", "NoSig"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f17547k = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU", "CONTEXT", "SLHDSA", "MLDSA", "MLKEM"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f17548l = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f17549m = {"BC", "BCFKS", "PKCS12"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f17550n = {"DRBG"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f17551a;

    /* JADX INFO: renamed from: Tg.a$a, reason: collision with other inner class name */
    class C0303a implements PrivilegedAction {
        C0303a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            a.this.q();
            return null;
        }
    }

    class b implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f17553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f17555c;

        b(String str, String str2, String str3) {
            this.f17553a = str;
            this.f17554b = str2;
            this.f17555c = str3;
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Provider.Service run() {
            Provider.Service service = a.super.getService(this.f17553a, this.f17554b);
            if (service == null || service.getClassName() == null) {
                return null;
            }
            a.this.f17551a.put(this.f17555c, service);
            a.super.remove(service.getType() + "." + service.getAlgorithm());
            a.super.putService(service);
            return service;
        }
    }

    private static class c implements Fg.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17558b;

        c(String str, int i10) {
            this.f17557a = str;
            this.f17558b = i10;
        }

        @Override // Fg.c
        public String t() {
            return this.f17557a;
        }
    }

    public a() {
        super("BC", 1.81d, f17539c);
        this.f17551a = new ConcurrentHashMap();
        AccessController.doPrivileged(new C0303a());
    }

    private void i(String str, Fg.c[] cVarArr) {
        for (int i10 = 0; i10 != cVarArr.length; i10++) {
            Fg.c cVar = cVarArr[i10];
            g.a(cVar);
            m(str, cVar.t());
        }
    }

    private void j(String str, String[] strArr) {
        for (int i10 = 0; i10 != strArr.length; i10++) {
            m(str, strArr[i10]);
        }
    }

    private void k() {
        h(Ag.a.f596a0, new Hh.c());
        h(Ag.a.f603b0, new Hh.c());
        h(Ag.a.f610c0, new Hh.c());
        h(Ag.a.f617d0, new Hh.c());
        h(Ag.a.f624e0, new Hh.c());
        h(Ag.a.f631f0, new Hh.c());
        h(Ag.a.f638g0, new Hh.c());
        h(Ag.a.f645h0, new Hh.c());
        h(Ag.a.f652i0, new Hh.c());
        h(Ag.a.f659j0, new Hh.c());
        h(Ag.a.f666k0, new Hh.c());
        h(Ag.a.f673l0, new Hh.c());
        h(Ag.a.f680m0, new Hh.c());
        h(Ag.a.f687n0, new Hh.c());
        h(Ag.a.f693o0, new Hh.c());
        h(Ag.a.f699p0, new Hh.c());
        h(Ag.a.f705q0, new Hh.c());
        h(Ag.a.f711r0, new Hh.c());
        h(Ag.a.f717s0, new Hh.c());
        h(Ag.a.f723t0, new Hh.c());
        h(Ag.a.f729u0, new Hh.c());
        h(Ag.a.f735v0, new Hh.c());
        h(Ag.a.f741w0, new Hh.c());
        h(Ag.a.f747x0, new Hh.c());
        h(Ag.a.f753y0, new Hh.c());
        h(Ag.a.f759z0, new Hh.c());
        h(Ag.a.f440A0, new Hh.c());
        h(Ag.a.f446B0, new Hh.c());
        h(Ag.a.f452C0, new Hh.c());
        h(Ag.a.f458D0, new Hh.c());
        h(Ag.a.f464E0, new Hh.c());
        h(Ag.a.f470F0, new Hh.c());
        h(Ag.a.f476G0, new Hh.c());
        h(Ag.a.f482H0, new Hh.c());
        h(Ag.a.f488I0, new Hh.c());
        h(Ag.a.f494J0, new Hh.c());
        h(Ag.a.f500K0, new Hh.c());
        h(Ag.a.f518N0, new Hh.c());
        h(Ag.a.f530P0, new Hh.c());
        h(Ag.a.f542R0, new Hh.c());
        h(new C7427t("1.3.9999.6.4.10"), new Hh.c());
        h(Ag.a.f548S0, new Hh.c());
        h(Ag.a.f560U0, new Hh.c());
        h(Ag.a.f572W0, new Hh.c());
        h(Vg.g.f20342r, new Gh.c());
        h(Vg.g.f20346v, new Ch.c());
        h(Vg.g.f20347w, new f());
        h(Lg.a.f11606a, new f());
        h(Vg.g.f20295F, new Jh.g());
        h(Lg.a.f11607b, new Jh.g());
        h(Cg.a.f3192R0, new Ah.c());
        h(Ag.a.f700p1, new Eh.c());
        h(Ag.a.f483H1, new C7178c());
        h(Ag.a.f501K1, new C7178c());
        h(Bg.a.f1949X0, new Og.c());
        h(Bg.a.f1951Y0, new Og.c());
        h(Bg.a.f1953Z0, new Og.c());
        h(Ag.a.f549S1, new C6980c());
        h(Ag.a.f555T1, new C6980c());
        h(Ag.a.f561U1, new C6980c());
        h(Ag.a.f567V1, new C6980c());
        h(Ag.a.f573W1, new C6980c());
        h(Ag.a.f579X1, new C6980c());
        h(Ag.a.f460D2, new C6871c());
        h(Ag.a.f472F2, new C6871c());
        h(Ag.a.f484H2, new C6871c());
        h(Ag.a.f496J2, new C6871c());
        h(Ag.a.f508L2, new C6871c());
        h(Ag.a.f600a4, new uh.c());
        h(Ag.a.f607b4, new uh.c());
        h(Ag.a.f614c4, new uh.c());
        h(Ag.a.f628e4, new C7253c());
        h(Ag.a.f635f4, new C7253c());
        h(Ag.a.f642g4, new C7253c());
        h(Ag.a.f485H3, new C7436c());
        h(Ag.a.f491I3, new C7436c());
        h(Ag.a.f497J3, new C7436c());
        h(Ag.a.f750x3, new Dh.c());
        h(Ag.a.f756y3, new Dh.c());
        h(Ag.a.f762z3, new Dh.c());
        h(Ag.a.f443A3, new Dh.c());
        h(Ag.a.f656i4, new Bh.c());
        h(Ag.a.f663j4, new Bh.c());
        h(Ag.a.f670k4, new Bh.c());
        h(Ag.a.f677l4, new Bh.c());
        h(Ag.a.f739v4, new Fh.c());
        h(Ag.a.f745w4, new Fh.c());
        h(Ag.a.f751x4, new Fh.c());
        h(Ag.a.f757y4, new Fh.c());
        h(Ag.a.f763z4, new Fh.c());
        h(Ag.a.f444A4, new Fh.c());
        h(Ag.a.f450B4, new Fh.c());
        h(Ag.a.f456C4, new Fh.c());
        h(Ag.a.f462D4, new Fh.c());
        h(Ag.a.f468E4, new Fh.c());
        h(Ag.a.f474F4, new Fh.c());
        h(Ag.a.f480G4, new Fh.c());
        h(Ag.a.f510L4, new Fh.c());
        h(Ag.a.f516M4, new Fh.c());
        h(Ag.a.f522N4, new Fh.c());
        h(Ag.a.f528O4, new Fh.c());
        h(Ag.a.f534P4, new Fh.c());
        h(Ag.a.f540Q4, new Fh.c());
        h(Ag.a.f546R4, new Fh.c());
        h(Ag.a.f552S4, new Fh.c());
        h(Ag.a.f558T4, new Fh.c());
        h(Ag.a.f564U4, new Fh.c());
        h(Ag.a.f570V4, new Fh.c());
        h(Ag.a.f576W4, new Fh.c());
        h(Ag.a.f582X4, new Fh.c());
        h(Ag.a.f588Y4, new Fh.c());
        h(Ag.a.f594Z4, new Fh.c());
        h(Ag.a.f601a5, new Fh.c());
        h(Ag.a.f608b5, new Fh.c());
        h(Ag.a.f615c5, new Fh.c());
        h(Ag.a.f622d5, new Fh.c());
        h(Ag.a.f629e5, new Fh.c());
        h(Ag.a.f636f5, new Fh.c());
        h(Ag.a.f643g5, new Fh.c());
        h(Ag.a.f650h5, new Fh.c());
        h(Ag.a.f657i5, new Fh.c());
        h(Ag.a.f664j5, new Fh.c());
        h(Ag.a.f671k5, new Fh.c());
        h(Ag.a.f678l5, new Fh.c());
        h(Ag.a.f685m5, new Fh.c());
    }

    private void m(String str, String str2) {
        Class clsA = Qg.a.a(a.class, str + str2 + "$Mappings");
        if (clsA == null) {
            return;
        }
        try {
            android.support.v4.media.session.b.a(clsA.newInstance());
            throw null;
        } catch (Exception e10) {
            throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e10);
        }
    }

    private static Fg.c p(String str, int i10) {
        return new c(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        String str;
        String str2;
        j("org.bouncycastle.jcajce.provider.digest.", f17548l);
        j("org.bouncycastle.jcajce.provider.symmetric.", f17543g);
        j("org.bouncycastle.jcajce.provider.symmetric.", f17544h);
        i("org.bouncycastle.jcajce.provider.symmetric.", f17545i);
        j("org.bouncycastle.jcajce.provider.asymmetric.", f17546j);
        j("org.bouncycastle.jcajce.provider.asymmetric.", f17547k);
        j("org.bouncycastle.jcajce.provider.keystore.", f17549m);
        j("org.bouncycastle.jcajce.provider.drbg.", f17550n);
        k();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        Class cls = f17542f;
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        put("CertPathBuilder.RFC3280", str2);
        put("CertPathValidator.PKIX", str);
        put("CertPathBuilder.PKIX", str2);
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    @Override // java.security.Provider
    public final Provider.Service getService(String str, String str2) {
        Provider.Service service;
        String str3 = str + "." + i.g(str2);
        Provider.Service service2 = (Provider.Service) this.f17551a.get(str3);
        if (service2 != null) {
            return service2;
        }
        synchronized (this) {
            try {
                service = (Provider.Service) (!this.f17551a.containsKey(str3) ? AccessController.doPrivileged(new b(str, str2, str3)) : this.f17551a.get(str3));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return service;
    }

    public void h(C7427t c7427t, Rg.a aVar) {
        Map map = f17541e;
        synchronized (map) {
            map.put(c7427t, aVar);
        }
    }
}
