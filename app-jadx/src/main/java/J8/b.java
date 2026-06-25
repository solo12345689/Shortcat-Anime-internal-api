package J8;

import P8.k;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f9455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f9456b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f9456b = googleSignInAccount;
        this.f9455a = status;
    }

    public GoogleSignInAccount a() {
        return this.f9456b;
    }

    @Override // P8.k
    public Status b() {
        return this.f9455a;
    }
}
