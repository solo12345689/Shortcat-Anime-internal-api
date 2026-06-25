package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2815t;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2809m {

    /* JADX INFO: renamed from: b */
    private static volatile C2809m f29371b;

    /* JADX INFO: renamed from: c */
    static final C2809m f29372c = new C2809m(true);

    /* JADX INFO: renamed from: a */
    private final Map f29373a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final Object f29374a;

        /* JADX INFO: renamed from: b */
        private final int f29375b;

        a(Object obj, int i10) {
            this.f29374a = obj;
            this.f29375b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29374a == aVar.f29374a && this.f29375b == aVar.f29375b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f29374a) * 65535) + this.f29375b;
        }
    }

    C2809m(boolean z10) {
    }

    public static C2809m b() {
        C2809m c2809mA;
        if (W.f29251d) {
            return f29372c;
        }
        C2809m c2809m = f29371b;
        if (c2809m != null) {
            return c2809m;
        }
        synchronized (C2809m.class) {
            try {
                c2809mA = f29371b;
                if (c2809mA == null) {
                    c2809mA = AbstractC2808l.a();
                    f29371b = c2809mA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2809mA;
    }

    public AbstractC2815t.c a(K k10, int i10) {
        android.support.v4.media.session.b.a(this.f29373a.get(new a(k10, i10)));
        return null;
    }
}
