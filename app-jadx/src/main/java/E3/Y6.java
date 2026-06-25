package E3;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import q2.AbstractC6076H;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Y6 {

    /* JADX INFO: renamed from: b */
    private static final String f5085b;

    /* JADX INFO: renamed from: c */
    private static final String f5086c;

    /* JADX INFO: renamed from: a */
    private final a f5087a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        Bundle getExtras();

        int getType();

        String r();

        int s();

        String t();

        Bundle u();

        Object v();

        int w();

        ComponentName x();

        boolean y();

        MediaSession.Token z();
    }

    static {
        AbstractC6076H.a("media3.session");
        f5085b = t2.a0.H0(0);
        f5086c = t2.a0.H0(1);
    }

    Y6(int i10, int i11, int i12, int i13, String str, r rVar, Bundle bundle, MediaSession.Token token) {
        this.f5087a = new Z6(i10, i11, i12, i13, str, rVar, bundle, token);
    }

    Object a() {
        return this.f5087a.v();
    }

    ComponentName b() {
        return this.f5087a.x();
    }

    public Bundle c() {
        return this.f5087a.getExtras();
    }

    public int d() {
        return this.f5087a.w();
    }

    public String e() {
        return this.f5087a.r();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Y6) {
            return this.f5087a.equals(((Y6) obj).f5087a);
        }
        return false;
    }

    MediaSession.Token f() {
        return this.f5087a.z();
    }

    public String g() {
        return this.f5087a.t();
    }

    public int h() {
        return this.f5087a.getType();
    }

    public int hashCode() {
        return this.f5087a.hashCode();
    }

    public int i() {
        return this.f5087a.s();
    }

    boolean j() {
        return this.f5087a.y();
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        if (this.f5087a instanceof Z6) {
            bundle.putInt(f5085b, 0);
        } else {
            bundle.putInt(f5085b, 1);
        }
        bundle.putBundle(f5086c, this.f5087a.u());
        return bundle;
    }

    public String toString() {
        return this.f5087a.toString();
    }
}
