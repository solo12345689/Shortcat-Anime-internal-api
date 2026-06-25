package G8;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.AbstractBinderC3365k0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f7418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f7419b;

    g(String str, Bundle bundle) {
        this.f7418a = str;
        this.f7419b = bundle;
    }

    @Override // G8.h
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws a, IOException {
        Bundle bundleG1 = AbstractBinderC3365k0.e(iBinder).g1(this.f7418a, this.f7419b);
        i.f(bundleG1);
        String string = bundleG1.getString("Error");
        if (bundleG1.getBoolean("booleanResult")) {
            return null;
        }
        throw new a(string);
    }
}
