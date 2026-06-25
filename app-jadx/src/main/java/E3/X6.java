package E3;

import android.os.Bundle;
import android.os.SystemClock;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class X6 {

    /* JADX INFO: renamed from: e */
    private static final String f5059e = t2.a0.H0(0);

    /* JADX INFO: renamed from: f */
    private static final String f5060f = t2.a0.H0(1);

    /* JADX INFO: renamed from: g */
    private static final String f5061g = t2.a0.H0(2);

    /* JADX INFO: renamed from: h */
    private static final String f5062h = t2.a0.H0(3);

    /* JADX INFO: renamed from: a */
    public final int f5063a;

    /* JADX INFO: renamed from: b */
    public final Bundle f5064b;

    /* JADX INFO: renamed from: c */
    public final long f5065c;

    /* JADX INFO: renamed from: d */
    public final V6 f5066d;

    public X6(int i10) {
        this(i10, Bundle.EMPTY);
    }

    public static X6 a(Bundle bundle) {
        int i10 = bundle.getInt(f5059e, -1);
        Bundle bundle2 = bundle.getBundle(f5060f);
        long j10 = bundle.getLong(f5061g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(f5062h);
        V6 v6A = bundle3 != null ? V6.a(bundle3) : i10 != 0 ? new V6(i10, "no error message provided") : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new X6(i10, bundle2, j10, v6A);
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f5059e, this.f5063a);
        bundle.putBundle(f5060f, this.f5064b);
        bundle.putLong(f5061g, this.f5065c);
        V6 v62 = this.f5066d;
        if (v62 != null) {
            bundle.putBundle(f5062h, v62.b());
        }
        return bundle;
    }

    public X6(int i10, Bundle bundle) {
        this(i10, bundle, SystemClock.elapsedRealtime(), null);
    }

    private X6(int i10, Bundle bundle, long j10, V6 v62) {
        AbstractC6614a.a(v62 == null || i10 < 0);
        this.f5063a = i10;
        this.f5064b = new Bundle(bundle);
        this.f5065c = j10;
        if (v62 == null && i10 < 0) {
            v62 = new V6(i10, "no error message provided");
        }
        this.f5066d = v62;
    }
}
