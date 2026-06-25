package t6;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s5.InterfaceC6433d;
import x6.n;
import y5.i;

/* JADX INFO: renamed from: t6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6647c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6433d f60842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f60843b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f60845d = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n.b f60844c = new a();

    /* JADX INFO: renamed from: t6.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements n.b {
        a() {
        }

        @Override // x6.n.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC6433d interfaceC6433d, boolean z10) {
            C6647c.this.f(interfaceC6433d, z10);
        }
    }

    /* JADX INFO: renamed from: t6.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements InterfaceC6433d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC6433d f60847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f60848b;

        public b(InterfaceC6433d interfaceC6433d, int i10) {
            this.f60847a = interfaceC6433d;
            this.f60848b = i10;
        }

        @Override // s5.InterfaceC6433d
        public String a() {
            return null;
        }

        @Override // s5.InterfaceC6433d
        public boolean b(Uri uri) {
            return this.f60847a.b(uri);
        }

        @Override // s5.InterfaceC6433d
        public boolean c() {
            return false;
        }

        @Override // s5.InterfaceC6433d
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f60848b == bVar.f60848b && this.f60847a.equals(bVar.f60847a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // s5.InterfaceC6433d
        public int hashCode() {
            return (this.f60847a.hashCode() * 1013) + this.f60848b;
        }

        public String toString() {
            return i.b(this).b("imageCacheKey", this.f60847a).a("frameIndex", this.f60848b).toString();
        }
    }

    public C6647c(InterfaceC6433d interfaceC6433d, n nVar) {
        this.f60842a = interfaceC6433d;
        this.f60843b = nVar;
    }

    private b e(int i10) {
        return new b(this.f60842a, i10);
    }

    private synchronized InterfaceC6433d g() {
        InterfaceC6433d interfaceC6433d;
        Iterator it = this.f60845d.iterator();
        if (it.hasNext()) {
            interfaceC6433d = (InterfaceC6433d) it.next();
            it.remove();
        } else {
            interfaceC6433d = null;
        }
        return interfaceC6433d;
    }

    public C5.a a(int i10, C5.a aVar) {
        return this.f60843b.d(e(i10), aVar, this.f60844c);
    }

    public boolean b(int i10) {
        return this.f60843b.contains(e(i10));
    }

    public C5.a c(int i10) {
        return this.f60843b.get(e(i10));
    }

    public C5.a d() {
        C5.a aVarE;
        do {
            InterfaceC6433d interfaceC6433dG = g();
            if (interfaceC6433dG == null) {
                return null;
            }
            aVarE = this.f60843b.e(interfaceC6433dG);
        } while (aVarE == null);
        return aVarE;
    }

    public synchronized void f(InterfaceC6433d interfaceC6433d, boolean z10) {
        try {
            if (z10) {
                this.f60845d.add(interfaceC6433d);
            } else {
                this.f60845d.remove(interfaceC6433d);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
