package E3;

import android.os.Bundle;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: E3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C1371h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f5281g = t2.a0.H0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f5282h = t2.a0.H0(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f5283i = t2.a0.H0(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f5284j = t2.a0.H0(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f5285k = t2.a0.H0(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f5286l = t2.a0.H0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f5291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5292f;

    public C1371h(String str, int i10, Bundle bundle, int i11) {
        this(1008000300, 7, str, i10, new Bundle(bundle), i11);
    }

    public static C1371h a(Bundle bundle) {
        int i10 = bundle.getInt(f5281g, 0);
        int i11 = bundle.getInt(f5285k, 0);
        String str = (String) AbstractC6614a.e(bundle.getString(f5282h));
        String str2 = f5283i;
        AbstractC6614a.a(bundle.containsKey(str2));
        int i12 = bundle.getInt(str2);
        Bundle bundle2 = bundle.getBundle(f5284j);
        int i13 = bundle.getInt(f5286l, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new C1371h(i10, i11, str, i12, bundle2, i13);
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f5281g, this.f5287a);
        bundle.putString(f5282h, this.f5289c);
        bundle.putInt(f5283i, this.f5290d);
        bundle.putBundle(f5284j, this.f5291e);
        bundle.putInt(f5285k, this.f5288b);
        bundle.putInt(f5286l, this.f5292f);
        return bundle;
    }

    private C1371h(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f5287a = i10;
        this.f5288b = i11;
        this.f5289c = str;
        this.f5290d = i12;
        this.f5291e = bundle;
        this.f5292f = i13;
    }
}
