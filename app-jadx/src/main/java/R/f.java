package r;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.K;
import androidx.lifecycle.W;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K f58233a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f58234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f58235b;

        b(c cVar, int i10) {
            this.f58234a = cVar;
            this.f58235b = i10;
        }

        public int a() {
            return this.f58235b;
        }

        public c b() {
            return this.f58234a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f58240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f58241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CharSequence f58242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CharSequence f58243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f58244e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f58245f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f58246g;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private CharSequence f58247a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private CharSequence f58248b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private CharSequence f58249c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private CharSequence f58250d = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f58251e = true;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f58252f = false;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f58253g = 0;

            public d a() {
                if (TextUtils.isEmpty(this.f58247a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!r.b.e(this.f58253g)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + r.b.a(this.f58253g));
                }
                int i10 = this.f58253g;
                boolean zC = i10 != 0 ? r.b.c(i10) : this.f58252f;
                if (TextUtils.isEmpty(this.f58250d) && !zC) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f58250d) || !zC) {
                    return new d(this.f58247a, this.f58248b, this.f58249c, this.f58250d, this.f58251e, this.f58252f, this.f58253g);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            public a b(CharSequence charSequence) {
                this.f58250d = charSequence;
                return this;
            }

            public a c(CharSequence charSequence) {
                this.f58247a = charSequence;
                return this;
            }
        }

        d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, boolean z11, int i10) {
            this.f58240a = charSequence;
            this.f58241b = charSequence2;
            this.f58242c = charSequence3;
            this.f58243d = charSequence4;
            this.f58244e = z10;
            this.f58245f = z11;
            this.f58246g = i10;
        }

        public int a() {
            return this.f58246g;
        }

        public CharSequence b() {
            return this.f58242c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f58243d;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence d() {
            return this.f58241b;
        }

        public CharSequence e() {
            return this.f58240a;
        }

        public boolean f() {
            return this.f58244e;
        }

        public boolean g() {
            return this.f58245f;
        }
    }

    public f(AbstractActivityC2842v abstractActivityC2842v, Executor executor, a aVar) {
        if (abstractActivityC2842v == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        f(abstractActivityC2842v.C(), e(abstractActivityC2842v), executor, aVar);
    }

    private void b(d dVar, c cVar) {
        K k10 = this.f58233a;
        if (k10 == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k10.X0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            d(this.f58233a).w(dVar, cVar);
        }
    }

    private static r.d c(K k10) {
        return (r.d) k10.q0("androidx.biometric.BiometricFragment");
    }

    private static r.d d(K k10) {
        r.d dVarC = c(k10);
        if (dVarC != null) {
            return dVarC;
        }
        r.d dVarM = r.d.M();
        k10.s().e(dVarM, "androidx.biometric.BiometricFragment").i();
        k10.l0();
        return dVarM;
    }

    private static g e(AbstractActivityC2842v abstractActivityC2842v) {
        if (abstractActivityC2842v != null) {
            return (g) new W(abstractActivityC2842v).a(g.class);
        }
        return null;
    }

    private void f(K k10, g gVar, Executor executor, a aVar) {
        this.f58233a = k10;
        if (gVar != null) {
            if (executor != null) {
                gVar.K(executor);
            }
            gVar.J(aVar);
        }
    }

    public void a(d dVar, c cVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int iB = r.b.b(dVar, cVar);
        if (r.b.f(iB)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && r.b.c(iB)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        b(dVar, cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Signature f58236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f58237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Mac f58238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final IdentityCredential f58239d;

        public c(Signature signature) {
            this.f58236a = signature;
            this.f58237b = null;
            this.f58238c = null;
            this.f58239d = null;
        }

        public Cipher a() {
            return this.f58237b;
        }

        public IdentityCredential b() {
            return this.f58239d;
        }

        public Mac c() {
            return this.f58238c;
        }

        public Signature d() {
            return this.f58236a;
        }

        public c(Cipher cipher) {
            this.f58236a = null;
            this.f58237b = cipher;
            this.f58238c = null;
            this.f58239d = null;
        }

        public c(Mac mac) {
            this.f58236a = null;
            this.f58237b = null;
            this.f58238c = mac;
            this.f58239d = null;
        }

        public c(IdentityCredential identityCredential) {
            this.f58236a = null;
            this.f58237b = null;
            this.f58238c = null;
            this.f58239d = identityCredential;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public void b() {
        }

        public void c(b bVar) {
        }

        public void a(int i10, CharSequence charSequence) {
        }
    }
}
