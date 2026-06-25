package H8;

import P8.a;
import R8.AbstractC2113n;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements a.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f8184d = new g(new f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8185a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8187c;

    public g(f fVar) {
        this.f8186b = fVar.f8182a.booleanValue();
        this.f8187c = fVar.f8183b;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f8186b);
        bundle.putString("log_session_id", this.f8187c);
        return bundle;
    }

    final /* synthetic */ boolean b() {
        return this.f8186b;
    }

    final /* synthetic */ String c() {
        return this.f8187c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC2113n.a(null, null) && this.f8186b == gVar.f8186b && AbstractC2113n.a(this.f8187c, gVar.f8187c);
    }

    public final int hashCode() {
        return AbstractC2113n.b(null, Boolean.valueOf(this.f8186b), this.f8187c);
    }
}
