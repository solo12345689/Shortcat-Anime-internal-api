package l9;

import P8.f;
import R8.AbstractC2102c;
import R8.AbstractC2106g;
import R8.AbstractC2115p;
import R8.C2103d;
import R8.O;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: l9.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5570a extends AbstractC2106g implements k9.e {

    /* JADX INFO: renamed from: l0 */
    public static final /* synthetic */ int f52711l0 = 0;

    /* JADX INFO: renamed from: I */
    private final boolean f52712I;

    /* JADX INFO: renamed from: X */
    private final C2103d f52713X;

    /* JADX INFO: renamed from: Y */
    private final Bundle f52714Y;

    /* JADX INFO: renamed from: Z */
    private final Integer f52715Z;

    public C5570a(Context context, Looper looper, boolean z10, C2103d c2103d, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, c2103d, aVar, bVar);
        this.f52712I = true;
        this.f52713X = c2103d;
        this.f52714Y = bundle;
        this.f52715Z = c2103d.i();
    }

    public static Bundle l0(C2103d c2103d) {
        c2103d.h();
        Integer numI = c2103d.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c2103d.a());
        if (numI != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numI.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // R8.AbstractC2102c
    protected final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // R8.AbstractC2102c
    protected final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // k9.e
    public final void a(InterfaceC5575f interfaceC5575f) {
        AbstractC2115p.m(interfaceC5575f, "Expecting a valid ISignInCallbacks");
        try {
            Account accountC = this.f52713X.c();
            ((C5576g) C()).K3(new C5579j(1, new O(accountC, ((Integer) AbstractC2115p.l(this.f52715Z)).intValue(), "<<default account>>".equals(accountC.name) ? K8.c.b(w()).c() : null)), interfaceC5575f);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC5575f.a3(new C5581l(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final boolean f() {
        return this.f52712I;
    }

    @Override // k9.e
    public final void g() {
        j(new AbstractC2102c.d(this));
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final int k() {
        return 12451000;
    }

    @Override // R8.AbstractC2102c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C5576g ? (C5576g) iInterfaceQueryLocalInterface : new C5576g(iBinder);
    }

    @Override // R8.AbstractC2102c
    protected final Bundle y() {
        if (!w().getPackageName().equals(this.f52713X.f())) {
            this.f52714Y.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f52713X.f());
        }
        return this.f52714Y;
    }
}
