package s2;

import android.os.Bundle;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: s2.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6414l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f59103b = a0.H0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59104a;

    public C6414l(String str) {
        this.f59104a = str;
    }

    public static C6414l a(Bundle bundle) {
        return new C6414l((String) AbstractC6614a.e(bundle.getString(f59103b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f59103b, this.f59104a);
        return bundle;
    }
}
