package U2;

import android.net.Uri;
import java.util.Map;
import r3.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f19093a = new u() { // from class: U2.t
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return u.e();
        }
    };

    static /* synthetic */ InterfaceC2255p[] e() {
        return new InterfaceC2255p[0];
    }

    default InterfaceC2255p[] d(Uri uri, Map map) {
        return f();
    }

    InterfaceC2255p[] f();

    default u a(r.a aVar) {
        return this;
    }

    default u b(int i10) {
        return this;
    }

    default u c(boolean z10) {
        return this;
    }
}
