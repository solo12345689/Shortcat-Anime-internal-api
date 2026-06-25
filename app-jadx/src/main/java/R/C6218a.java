package r;

import C1.a;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import r.f;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C6218a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BiometricPrompt$AuthenticationCallback f58200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.c f58201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final d f58202c;

    /* JADX INFO: renamed from: r.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0880a extends a.c {
        C0880a() {
        }

        @Override // C1.a.c
        public void a(int i10, CharSequence charSequence) {
            C6218a.this.f58202c.a(i10, charSequence);
        }

        @Override // C1.a.c
        public void b() {
            C6218a.this.f58202c.b();
        }

        @Override // C1.a.c
        public void c(int i10, CharSequence charSequence) {
            C6218a.this.f58202c.c(charSequence);
        }

        @Override // C1.a.c
        public void d(a.d dVar) {
            C6218a.this.f58202c.d(new f.b(dVar != null ? i.c(dVar.a()) : null, 2));
        }
    }

    /* JADX INFO: renamed from: r.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {
        static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* JADX INFO: renamed from: r.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d {
        d() {
        }

        abstract void a(int i10, CharSequence charSequence);

        abstract void b();

        abstract void c(CharSequence charSequence);

        abstract void d(f.b bVar);
    }

    C6218a(d dVar) {
        this.f58202c = dVar;
    }

    BiometricPrompt$AuthenticationCallback a() {
        if (this.f58200a == null) {
            this.f58200a = b.a(this.f58202c);
        }
        return this.f58200a;
    }

    a.c b() {
        if (this.f58201b == null) {
            this.f58201b = new C0880a();
        }
        return this.f58201b;
    }

    /* JADX INFO: renamed from: r.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        static BiometricPrompt$AuthenticationCallback a(d dVar) {
            return new C0881a(dVar);
        }

        /* JADX INFO: renamed from: r.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0881a extends BiometricPrompt$AuthenticationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f58204a;

            C0881a(d dVar) {
                this.f58204a = dVar;
            }

            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f58204a.a(i10, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f58204a.b();
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                f.c cVarB = authenticationResult != null ? i.b(authenticationResult.getCryptoObject()) : null;
                int i10 = Build.VERSION.SDK_INT;
                int iA = -1;
                if (i10 >= 30) {
                    if (authenticationResult != null) {
                        iA = c.a(authenticationResult);
                    }
                } else if (i10 != 29) {
                    iA = 2;
                }
                this.f58204a.d(new f.b(cVarB, iA));
            }

            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }
        }
    }
}
