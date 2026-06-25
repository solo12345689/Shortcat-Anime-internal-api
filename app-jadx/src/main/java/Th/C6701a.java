package th;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: th.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C6701a extends Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f61087a = "BouncyCastle Post-Quantum Security Provider v1.81";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f61088b = "BCPQC";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f61089c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f61090d = {"SPHINCS", "LMS", "NH", "XMSS", "SPHINCSPlus", "CMCE", "Frodo", "SABER", "Picnic", "NTRU", "Falcon", "Kyber", "Dilithium", "NTRUPrime", "BIKE", "HQC", "Rainbow", "Mayo", "Snova"};

    /* JADX INFO: renamed from: th.a$a, reason: collision with other inner class name */
    class C0911a implements PrivilegedAction {
        C0911a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            C6701a.this.f();
            return null;
        }
    }

    /* JADX INFO: renamed from: th.a$b */
    static class b implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f61092a;

        b(String str) {
            this.f61092a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f61092a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public C6701a() {
        super(f61088b, 1.81d, f61087a);
        AccessController.doPrivileged(new C0911a());
    }

    private void d(String str, String[] strArr) {
        for (int i10 = 0; i10 != strArr.length; i10++) {
            Class clsE = e(C6701a.class, str + strArr[i10] + "$Mappings");
            if (clsE != null) {
                try {
                    android.support.v4.media.session.b.a(clsE.newInstance());
                    throw null;
                } catch (Exception e10) {
                    throw new InternalError("cannot create instance of " + str + strArr[i10] + "$Mappings : " + e10);
                }
            }
        }
    }

    static Class e(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        d("org.bouncycastle.pqc.jcajce.provider.", f61090d);
    }
}
