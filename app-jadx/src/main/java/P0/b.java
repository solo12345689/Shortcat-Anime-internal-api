package P0;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import x0.C7032d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f13249a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C7032d f13250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13251b;

        public a(C7032d c7032d, int i10) {
            this.f13250a = c7032d;
            this.f13251b = i10;
        }

        public final int a() {
            return this.f13251b;
        }

        public final C7032d b() {
            return this.f13250a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f13250a, aVar.f13250a) && this.f13251b == aVar.f13251b;
        }

        public int hashCode() {
            return (this.f13250a.hashCode() * 31) + Integer.hashCode(this.f13251b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f13250a + ", configFlags=" + this.f13251b + ')';
        }
    }

    /* JADX INFO: renamed from: P0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0212b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources.Theme f13252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13253b;

        public C0212b(Resources.Theme theme, int i10) {
            this.f13252a = theme;
            this.f13253b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0212b)) {
                return false;
            }
            C0212b c0212b = (C0212b) obj;
            return AbstractC5504s.c(this.f13252a, c0212b.f13252a) && this.f13253b == c0212b.f13253b;
        }

        public int hashCode() {
            return (this.f13252a.hashCode() * 31) + Integer.hashCode(this.f13253b);
        }

        public String toString() {
            return "Key(theme=" + this.f13252a + ", id=" + this.f13253b + ')';
        }
    }

    public final void a() {
        this.f13249a.clear();
    }

    public final a b(C0212b c0212b) {
        WeakReference weakReference = (WeakReference) this.f13249a.get(c0212b);
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    public final void c(int i10) {
        Iterator it = this.f13249a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(i10, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(C0212b c0212b, a aVar) {
        this.f13249a.put(c0212b, new WeakReference(aVar));
    }
}
