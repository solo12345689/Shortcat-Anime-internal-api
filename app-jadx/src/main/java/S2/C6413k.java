package s2;

import android.os.Bundle;
import t2.a0;

/* JADX INFO: renamed from: s2.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6413k implements InterfaceC6410h {

    /* JADX INFO: renamed from: d */
    private static final String f59097d = a0.H0(0);

    /* JADX INFO: renamed from: e */
    private static final String f59098e = a0.H0(1);

    /* JADX INFO: renamed from: f */
    private static final String f59099f = a0.H0(2);

    /* JADX INFO: renamed from: a */
    public int f59100a;

    /* JADX INFO: renamed from: b */
    public int f59101b;

    /* JADX INFO: renamed from: c */
    public final int f59102c;

    public C6413k(int i10, int i11, int i12) {
        this.f59100a = i10;
        this.f59101b = i11;
        this.f59102c = i12;
    }

    public static C6413k a(Bundle bundle) {
        return new C6413k(bundle.getInt(f59097d), bundle.getInt(f59098e), bundle.getInt(f59099f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f59097d, this.f59100a);
        bundle.putInt(f59098e, this.f59101b);
        bundle.putInt(f59099f, this.f59102c);
        return bundle;
    }
}
