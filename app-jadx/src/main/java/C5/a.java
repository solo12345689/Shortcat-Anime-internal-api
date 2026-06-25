package C5;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import y5.AbstractC7204b;
import y5.k;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Cloneable, Closeable {

    /* JADX INFO: renamed from: f */
    private static int f2861f;

    /* JADX INFO: renamed from: a */
    protected boolean f2864a = false;

    /* JADX INFO: renamed from: b */
    protected final i f2865b;

    /* JADX INFO: renamed from: c */
    protected final c f2866c;

    /* JADX INFO: renamed from: d */
    protected final Throwable f2867d;

    /* JADX INFO: renamed from: e */
    private static Class f2860e = a.class;

    /* JADX INFO: renamed from: g */
    private static final h f2862g = new C0032a();

    /* JADX INFO: renamed from: h */
    private static final c f2863h = new b();

    /* JADX INFO: renamed from: C5.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0032a implements h {
        C0032a() {
        }

        @Override // C5.h
        /* JADX INFO: renamed from: b */
        public void a(Closeable closeable) {
            try {
                AbstractC7204b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements c {
        b() {
        }

        @Override // C5.a.c
        public void a(i iVar, Throwable th2) {
            Object objF = iVar.f();
            AbstractC7283a.G(a.f2860e, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), objF == null ? null : objF.getClass().getName());
        }

        @Override // C5.a.c
        public boolean b() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        void a(i iVar, Throwable th2);

        boolean b();
    }

    protected a(i iVar, c cVar, Throwable th2) {
        this.f2865b = (i) k.g(iVar);
        iVar.b();
        this.f2866c = cVar;
        this.f2867d = th2;
    }

    public static boolean H(a aVar) {
        return aVar != null && aVar.E();
    }

    public static a J(Closeable closeable) {
        return S(closeable, f2862g);
    }

    public static a O(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return h0(closeable, f2862g, cVar, cVar.b() ? new Throwable() : null);
    }

    public static a S(Object obj, h hVar) {
        return Y(obj, hVar, f2863h);
    }

    public static a Y(Object obj, h hVar, c cVar) {
        if (obj == null) {
            return null;
        }
        return h0(obj, hVar, cVar, cVar.b() ? new Throwable() : null);
    }

    public static a h0(Object obj, h hVar, c cVar, Throwable th2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof d)) {
            int i10 = f2861f;
            if (i10 == 1) {
                return new C5.c(obj, hVar, cVar, th2);
            }
            if (i10 == 2) {
                return new g(obj, hVar, cVar, th2);
            }
            if (i10 == 3) {
                return new e(obj);
            }
        }
        return new C5.b(obj, hVar, cVar, th2);
    }

    public static a j(a aVar) {
        if (aVar != null) {
            return aVar.h();
        }
        return null;
    }

    public static List k(Collection collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(j((a) it.next()));
        }
        return arrayList;
    }

    public static void m(a aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static void q(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m((a) it.next());
            }
        }
    }

    public synchronized Object C() {
        k.i(!this.f2864a);
        return k.g(this.f2865b.f());
    }

    public int D() {
        if (E()) {
            return System.identityHashCode(this.f2865b.f());
        }
        return 0;
    }

    public synchronized boolean E() {
        return !this.f2864a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f2864a) {
                    return;
                }
                this.f2864a = true;
                this.f2865b.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract a clone();

    public synchronized a h() {
        if (!E()) {
            return null;
        }
        return clone();
    }

    protected a(Object obj, h hVar, c cVar, Throwable th2, boolean z10) {
        this.f2865b = new i(obj, hVar, z10);
        this.f2866c = cVar;
        this.f2867d = th2;
    }
}
