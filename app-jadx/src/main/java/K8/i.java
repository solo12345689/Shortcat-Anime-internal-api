package K8;

import P8.f;
import R8.AbstractC2106g;
import R8.C2103d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends AbstractC2106g {

    /* JADX INFO: renamed from: I */
    private final GoogleSignInOptions f10953I;

    public i(Context context, Looper looper, C2103d c2103d, GoogleSignInOptions googleSignInOptions, f.a aVar, f.b bVar) {
        super(context, looper, 91, c2103d, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar2.i(b9.b.a());
        if (!c2103d.d().isEmpty()) {
            Iterator it = c2103d.d().iterator();
            while (it.hasNext()) {
                aVar2.e((Scope) it.next(), new Scope[0]);
            }
        }
        this.f10953I = aVar2.a();
    }

    @Override // R8.AbstractC2102c
    protected final String D() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // R8.AbstractC2102c
    protected final String E() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final int k() {
        return 12451000;
    }

    public final GoogleSignInOptions l0() {
        return this.f10953I;
    }

    @Override // R8.AbstractC2102c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new w(iBinder);
    }
}
