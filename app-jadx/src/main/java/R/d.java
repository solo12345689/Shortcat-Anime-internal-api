package r;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.fragment.app.K;
import androidx.lifecycle.B;
import androidx.lifecycle.W;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import r.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class d extends AbstractComponentCallbacksC2838q {

    /* JADX INFO: renamed from: a */
    Handler f58207a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    r.g f58208b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f58209a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CharSequence f58210b;

        a(int i10, CharSequence charSequence) {
            this.f58209a = i10;
            this.f58210b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f58208b.h().a(this.f58209a, this.f58210b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f58208b.h().b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements B {
        c() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: b */
        public void a(f.b bVar) {
            if (bVar != null) {
                d.this.Q(bVar);
                d.this.f58208b.G(null);
            }
        }
    }

    /* JADX INFO: renamed from: r.d$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0882d implements B {
        C0882d() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: b */
        public void a(r.c cVar) {
            if (cVar != null) {
                d.this.N(cVar.b(), cVar.c());
                d.this.f58208b.D(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements B {
        e() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: b */
        public void a(CharSequence charSequence) {
            if (charSequence != null) {
                d.this.P(charSequence);
                d.this.f58208b.D(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f implements B {
        f() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: b */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                d.this.O();
                d.this.f58208b.E(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g implements B {
        g() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: b */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                if (d.this.J()) {
                    d.this.S();
                } else {
                    d.this.R();
                }
                d.this.f58208b.U(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h implements B {
        h() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: b */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                d.this.z(1);
                d.this.C();
                d.this.f58208b.O(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f58208b.P(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f58220a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CharSequence f58221b;

        j(int i10, CharSequence charSequence) {
            this.f58220a = i10;
            this.f58221b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.T(this.f58220a, this.f58221b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class k implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ f.b f58223a;

        k(f.b bVar) {
            this.f58223a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f58208b.h().c(this.f58223a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class l {
        static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class m {
        static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class n {
        static void a(BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        static void b(BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class o {
        static void a(BiometricPrompt.Builder builder, int i10) {
            builder.setAllowedAuthenticators(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class p implements Executor {

        /* JADX INFO: renamed from: a */
        private final Handler f58225a = new Handler(Looper.getMainLooper());

        p() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f58225a.post(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class q implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WeakReference f58226a;

        q(d dVar) {
            this.f58226a = new WeakReference(dVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f58226a.get() != null) {
                ((d) this.f58226a.get()).b0();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class r implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WeakReference f58227a;

        r(r.g gVar) {
            this.f58227a = new WeakReference(gVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f58227a.get() != null) {
                ((r.g) this.f58227a.get()).N(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class s implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WeakReference f58228a;

        s(r.g gVar) {
            this.f58228a = new WeakReference(gVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f58228a.get() != null) {
                ((r.g) this.f58228a.get()).T(false);
            }
        }
    }

    private static int A(C1.a aVar) {
        if (aVar.f()) {
            return !aVar.e() ? 11 : 0;
        }
        return 12;
    }

    private void B() {
        if (getActivity() == null) {
            return;
        }
        r.g gVar = (r.g) new W(getActivity()).a(r.g.class);
        this.f58208b = gVar;
        gVar.e().h(this, new c());
        this.f58208b.c().h(this, new C0882d());
        this.f58208b.d().h(this, new e());
        this.f58208b.t().h(this, new f());
        this.f58208b.B().h(this, new g());
        this.f58208b.y().h(this, new h());
    }

    private void D() {
        this.f58208b.X(false);
        if (isAdded()) {
            K parentFragmentManager = getParentFragmentManager();
            r.l lVar = (r.l) parentFragmentManager.q0("androidx.biometric.FingerprintDialogFragment");
            if (lVar != null) {
                if (lVar.isAdded()) {
                    lVar.A();
                } else {
                    parentFragmentManager.s().n(lVar).i();
                }
            }
        }
    }

    private int E() {
        Context context = getContext();
        return (context == null || !r.j.f(context, Build.MODEL)) ? 2000 : 0;
    }

    private void F(int i10) {
        if (i10 == -1) {
            W(new f.b(null, 1));
        } else {
            T(10, getString(u.f58322l));
        }
    }

    private boolean G() {
        AbstractActivityC2842v activity = getActivity();
        return activity != null && activity.isChangingConfigurations();
    }

    private boolean H() {
        AbstractActivityC2842v activity = getActivity();
        return (activity == null || this.f58208b.j() == null || !r.j.g(activity, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean I() {
        return Build.VERSION.SDK_INT == 28 && !r.n.a(getContext());
    }

    private boolean K() {
        return Build.VERSION.SDK_INT < 28 || H() || I();
    }

    private void L() {
        AbstractActivityC2842v activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerA = r.m.a(activity);
        if (keyguardManagerA == null) {
            T(12, getString(u.f58321k));
            return;
        }
        CharSequence charSequenceS = this.f58208b.s();
        CharSequence charSequenceR = this.f58208b.r();
        CharSequence charSequenceK = this.f58208b.k();
        if (charSequenceR == null) {
            charSequenceR = charSequenceK;
        }
        Intent intentA = l.a(keyguardManagerA, charSequenceS, charSequenceR);
        if (intentA == null) {
            T(14, getString(u.f58320j));
            return;
        }
        this.f58208b.L(true);
        if (K()) {
            D();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    static d M() {
        return new d();
    }

    private void U(int i10, CharSequence charSequence) {
        if (this.f58208b.w()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.f58208b.u()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f58208b.H(false);
            this.f58208b.i().execute(new a(i10, charSequence));
        }
    }

    private void V() {
        if (this.f58208b.u()) {
            this.f58208b.i().execute(new b());
        } else {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    private void W(f.b bVar) {
        X(bVar);
        C();
    }

    private void X(f.b bVar) {
        if (!this.f58208b.u()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.f58208b.H(false);
            this.f58208b.i().execute(new k(bVar));
        }
    }

    private void Y() {
        BiometricPrompt.Builder builderD = m.d(requireContext().getApplicationContext());
        CharSequence charSequenceS = this.f58208b.s();
        CharSequence charSequenceR = this.f58208b.r();
        CharSequence charSequenceK = this.f58208b.k();
        if (charSequenceS != null) {
            m.h(builderD, charSequenceS);
        }
        if (charSequenceR != null) {
            m.g(builderD, charSequenceR);
        }
        if (charSequenceK != null) {
            m.e(builderD, charSequenceK);
        }
        CharSequence charSequenceQ = this.f58208b.q();
        if (!TextUtils.isEmpty(charSequenceQ)) {
            m.f(builderD, charSequenceQ, this.f58208b.i(), this.f58208b.p());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            n.a(builderD, this.f58208b.v());
        }
        int iA = this.f58208b.a();
        if (i10 >= 30) {
            o.a(builderD, iA);
        } else if (i10 >= 29) {
            n.b(builderD, r.b.c(iA));
        }
        x(m.c(builderD), getContext());
    }

    private void Z() {
        Context applicationContext = requireContext().getApplicationContext();
        C1.a aVarC = C1.a.c(applicationContext);
        int iA = A(aVarC);
        if (iA != 0) {
            T(iA, r.k.a(applicationContext, iA));
            return;
        }
        if (isAdded()) {
            this.f58208b.P(true);
            if (!r.j.f(applicationContext, Build.MODEL)) {
                this.f58207a.postDelayed(new i(), 500L);
                r.l.Q().M(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f58208b.I(0);
            y(aVarC, applicationContext);
        }
    }

    private void a0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(u.f58312b);
        }
        this.f58208b.S(2);
        this.f58208b.Q(charSequence);
    }

    void C() {
        this.f58208b.X(false);
        D();
        if (!this.f58208b.w() && isAdded()) {
            getParentFragmentManager().s().n(this).i();
        }
        Context context = getContext();
        if (context == null || !r.j.e(context, Build.MODEL)) {
            return;
        }
        this.f58208b.N(true);
        this.f58207a.postDelayed(new r(this.f58208b), 600L);
    }

    boolean J() {
        return Build.VERSION.SDK_INT <= 28 && r.b.c(this.f58208b.a());
    }

    void N(int i10, CharSequence charSequence) {
        if (!r.k.b(i10)) {
            i10 = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && r.k.c(i10) && context != null && r.m.b(context) && r.b.c(this.f58208b.a())) {
            L();
            return;
        }
        if (!K()) {
            if (charSequence == null) {
                charSequence = getString(u.f58312b) + " " + i10;
            }
            T(i10, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = r.k.a(getContext(), i10);
        }
        if (i10 == 5) {
            int iF = this.f58208b.f();
            if (iF == 0 || iF == 3) {
                U(i10, charSequence);
            }
            C();
            return;
        }
        if (this.f58208b.z()) {
            T(i10, charSequence);
        } else {
            a0(charSequence);
            this.f58207a.postDelayed(new j(i10, charSequence), E());
        }
        this.f58208b.P(true);
    }

    void O() {
        if (K()) {
            a0(getString(u.f58319i));
        }
        V();
    }

    void P(CharSequence charSequence) {
        if (K()) {
            a0(charSequence);
        }
    }

    void Q(f.b bVar) {
        W(bVar);
    }

    void R() {
        CharSequence charSequenceQ = this.f58208b.q();
        if (charSequenceQ == null) {
            charSequenceQ = getString(u.f58312b);
        }
        T(13, charSequenceQ);
        z(2);
    }

    void S() {
        L();
    }

    void T(int i10, CharSequence charSequence) {
        U(i10, charSequence);
        C();
    }

    void b0() {
        if (this.f58208b.C()) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f58208b.X(true);
        this.f58208b.H(true);
        if (K()) {
            Z();
        } else {
            Y();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            this.f58208b.L(false);
            F(i11);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && r.b.c(this.f58208b.a())) {
            this.f58208b.T(true);
            this.f58207a.postDelayed(new s(this.f58208b), 250L);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f58208b.w() || G()) {
            return;
        }
        z(0);
    }

    void w(f.d dVar, f.c cVar) {
        AbstractActivityC2842v activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.f58208b.W(dVar);
        int iB = r.b.b(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && iB == 15 && cVar == null) {
            this.f58208b.M(r.i.a());
        } else {
            this.f58208b.M(cVar);
        }
        if (J()) {
            this.f58208b.V(getString(u.f58311a));
        } else {
            this.f58208b.V(null);
        }
        if (J() && r.e.g(activity).a(255) != 0) {
            this.f58208b.H(true);
            L();
        } else if (this.f58208b.x()) {
            this.f58207a.postDelayed(new q(this), 600L);
        } else {
            b0();
        }
    }

    void x(BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject cryptoObjectD = r.i.d(this.f58208b.j());
        CancellationSignal cancellationSignalB = this.f58208b.g().b();
        p pVar = new p();
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackA = this.f58208b.b().a();
        try {
            if (cryptoObjectD == null) {
                m.b(biometricPrompt, cancellationSignalB, pVar, biometricPrompt$AuthenticationCallbackA);
            } else {
                m.a(biometricPrompt, cryptoObjectD, cancellationSignalB, pVar, biometricPrompt$AuthenticationCallbackA);
            }
        } catch (NullPointerException e10) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
            T(1, context != null ? context.getString(u.f58312b) : "");
        }
    }

    void y(C1.a aVar, Context context) {
        try {
            aVar.a(r.i.e(this.f58208b.j()), 0, this.f58208b.g().c(), this.f58208b.b().b(), null);
        } catch (NullPointerException e10) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
            T(1, r.k.a(context, 1));
        }
    }

    void z(int i10) {
        if (i10 == 3 || !this.f58208b.A()) {
            if (K()) {
                this.f58208b.I(i10);
                if (i10 == 1) {
                    U(10, r.k.a(getContext(), 10));
                }
            }
            this.f58208b.g().a();
        }
    }
}
