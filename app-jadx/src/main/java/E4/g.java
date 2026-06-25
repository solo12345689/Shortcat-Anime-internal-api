package E4;

import E4.c;
import Ud.AbstractC2279u;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: c */
    public static final a f5648c = new a(null);

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap f5649a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private int f5650b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final int f5651a;

        /* JADX INFO: renamed from: b */
        private final WeakReference f5652b;

        /* JADX INFO: renamed from: c */
        private final Map f5653c;

        /* JADX INFO: renamed from: d */
        private final int f5654d;

        public b(int i10, WeakReference weakReference, Map map, int i11) {
            this.f5651a = i10;
            this.f5652b = weakReference;
            this.f5653c = map;
            this.f5654d = i11;
        }

        public final WeakReference a() {
            return this.f5652b;
        }

        public final Map b() {
            return this.f5653c;
        }

        public final int c() {
            return this.f5651a;
        }

        public final int d() {
            return this.f5654d;
        }
    }

    private final void e() {
        int i10 = this.f5650b;
        this.f5650b = i10 + 1;
        if (i10 >= 10) {
            d();
        }
    }

    @Override // E4.i
    public synchronized void a(int i10) {
        if (i10 >= 10 && i10 != 20) {
            d();
        }
    }

    @Override // E4.i
    public synchronized c.C0055c b(c.b bVar) {
        try {
            ArrayList arrayList = (ArrayList) this.f5649a.get(bVar);
            c.C0055c c0055c = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                b bVar2 = (b) arrayList.get(i10);
                Bitmap bitmap = (Bitmap) bVar2.a().get();
                c.C0055c c0055c2 = bitmap != null ? new c.C0055c(bitmap, bVar2.b()) : null;
                if (c0055c2 != null) {
                    c0055c = c0055c2;
                    break;
                }
                i10++;
            }
            e();
            return c0055c;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // E4.i
    public synchronized void c(c.b bVar, Bitmap bitmap, Map map, int i10) {
        try {
            LinkedHashMap linkedHashMap = this.f5649a;
            Object arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bVar, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            b bVar2 = new b(iIdentityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(bVar2);
                    break;
                }
                b bVar3 = (b) arrayList2.get(i11);
                if (i10 < bVar3.d()) {
                    i11++;
                } else if (bVar3.c() == iIdentityHashCode && bVar3.a().get() == bitmap) {
                    arrayList2.set(i11, bVar2);
                } else {
                    arrayList2.add(i11, bVar2);
                }
            }
            e();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        WeakReference weakReferenceA;
        this.f5650b = 0;
        Iterator it = this.f5649a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) AbstractC2279u.o0(arrayList);
                if (((bVar == null || (weakReferenceA = bVar.a()) == null) ? null : (Bitmap) weakReferenceA.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((b) arrayList.get(i12)).a().get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
