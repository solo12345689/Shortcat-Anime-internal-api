package r;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f58229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BiometricManager f58230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1.a f58231c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        static int a(BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f58232a;

        c(Context context) {
            this.f58232a = context.getApplicationContext();
        }

        @Override // r.e.d
        public boolean a() {
            return m.a(this.f58232a) != null;
        }

        @Override // r.e.d
        public boolean b() {
            return m.b(this.f58232a);
        }

        @Override // r.e.d
        public boolean c() {
            return j.a(this.f58232a, Build.MODEL);
        }

        @Override // r.e.d
        public C1.a d() {
            return C1.a.c(this.f58232a);
        }

        @Override // r.e.d
        public BiometricManager e() {
            return a.b(this.f58232a);
        }

        @Override // r.e.d
        public boolean f() {
            return n.a(this.f58232a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface d {
        boolean a();

        boolean b();

        boolean c();

        C1.a d();

        BiometricManager e();

        boolean f();
    }

    e(d dVar) {
        this.f58229a = dVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f58230b = i10 >= 29 ? dVar.e() : null;
        this.f58231c = i10 <= 29 ? dVar.d() : null;
    }

    private int b(int i10) {
        if (!r.b.e(i10)) {
            return -2;
        }
        if (i10 == 0 || !this.f58229a.a()) {
            return 12;
        }
        if (r.b.c(i10)) {
            return this.f58229a.b() ? 0 : 11;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 29) {
            return r.b.f(i10) ? f() : e();
        }
        if (i11 != 28) {
            return c();
        }
        if (this.f58229a.f()) {
            return d();
        }
        return 12;
    }

    private int c() {
        C1.a aVar = this.f58231c;
        if (aVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (aVar.f()) {
            return !this.f58231c.e() ? 11 : 0;
        }
        return 12;
    }

    private int d() {
        return !this.f58229a.b() ? c() : c() == 0 ? 0 : -1;
    }

    private int e() {
        BiometricPrompt.CryptoObject cryptoObjectD;
        Method methodC = a.c();
        if (methodC != null && (cryptoObjectD = i.d(i.a())) != null) {
            try {
                Object objInvoke = methodC.invoke(this.f58230b, cryptoObjectD);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e10) {
                e = e10;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (IllegalArgumentException e11) {
                e = e11;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (InvocationTargetException e12) {
                e = e12;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int iF = f();
        return (this.f58229a.c() || iF != 0) ? iF : d();
    }

    private int f() {
        BiometricManager biometricManager = this.f58230b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static e g(Context context) {
        return new e(new c(context));
    }

    public int a(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i10);
        }
        BiometricManager biometricManager = this.f58230b;
        if (biometricManager != null) {
            return b.a(biometricManager, i10);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
