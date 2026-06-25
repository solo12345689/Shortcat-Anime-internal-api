package K8;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class j extends e {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f10954a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ GoogleSignInOptions f10955b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ k f10956c;

    j(k kVar, Context context, GoogleSignInOptions googleSignInOptions) {
        this.f10954a = context;
        this.f10955b = googleSignInOptions;
        Objects.requireNonNull(kVar);
        this.f10956c = kVar;
    }

    @Override // K8.e, K8.v
    public final void h0(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            Context context = this.f10954a;
            r.a(context).c(this.f10955b, googleSignInAccount);
        }
        this.f10956c.setResult(new J8.b(googleSignInAccount, status));
    }
}
