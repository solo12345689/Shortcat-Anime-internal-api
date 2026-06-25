package s2;

import android.os.Bundle;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: s2.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6411i implements InterfaceC6410h {

    /* JADX INFO: renamed from: c */
    private static final String f59093c = a0.H0(0);

    /* JADX INFO: renamed from: d */
    private static final String f59094d = a0.H0(1);

    /* JADX INFO: renamed from: a */
    public final String f59095a;

    /* JADX INFO: renamed from: b */
    public final int f59096b;

    public C6411i(String str, int i10) {
        this.f59095a = str;
        this.f59096b = i10;
    }

    public static C6411i a(Bundle bundle) {
        return new C6411i((String) AbstractC6614a.e(bundle.getString(f59093c)), bundle.getInt(f59094d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f59093c, this.f59095a);
        bundle.putInt(f59094d, this.f59096b);
        return bundle;
    }
}
