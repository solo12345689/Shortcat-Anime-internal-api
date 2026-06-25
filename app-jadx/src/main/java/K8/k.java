package K8;

import P8.a;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class k extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f10957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f10958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(P8.f fVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(fVar);
        this.f10957c = context;
        this.f10958d = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ P8.k a(Status status) {
        return new J8.b(null, status);
    }

    @Override // com.google.android.gms.common.api.internal.a
    protected final /* bridge */ /* synthetic */ void d(a.b bVar) {
        w wVar = (w) ((i) bVar).C();
        Context context = this.f10957c;
        GoogleSignInOptions googleSignInOptions = this.f10958d;
        wVar.I3(new j(this, context, googleSignInOptions), googleSignInOptions);
    }
}
