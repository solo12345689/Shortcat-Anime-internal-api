package io.sentry.android.core.internal.util;

import android.content.ContentProvider;
import io.sentry.N0;
import io.sentry.android.core.C5131g0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5131g0 f49907a;

    public n() {
        this(new C5131g0(N0.e()));
    }

    public void a(ContentProvider contentProvider) {
        int iD = this.f49907a.d();
        if (iD < 26 || iD > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public n(C5131g0 c5131g0) {
        this.f49907a = c5131g0;
    }
}
