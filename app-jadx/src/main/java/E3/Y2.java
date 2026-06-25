package E3;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Y2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f5071e = t2.a0.H0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f5072f = t2.a0.H0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f5073g = t2.a0.H0(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f5074h = t2.a0.H0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f5075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5078d;

    private Y2(Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f5075a = new Bundle(bundle);
        this.f5076b = z10;
        this.f5077c = z11;
        this.f5078d = z12;
    }

    public static Y2 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f5071e);
        boolean z10 = bundle.getBoolean(f5072f, false);
        boolean z11 = bundle.getBoolean(f5073g, false);
        boolean z12 = bundle.getBoolean(f5074h, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new Y2(bundle2, z10, z11, z12);
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f5071e, this.f5075a);
        bundle.putBoolean(f5072f, this.f5076b);
        bundle.putBoolean(f5073g, this.f5077c);
        bundle.putBoolean(f5074h, this.f5078d);
        return bundle;
    }
}
