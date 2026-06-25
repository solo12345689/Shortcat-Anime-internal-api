package Y4;

import Y4.n;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class q implements n {

    /* JADX INFO: renamed from: a */
    private final List f22817a;

    /* JADX INFO: renamed from: b */
    private final K1.d f22818b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements com.bumptech.glide.load.data.d, d.a {

        /* JADX INFO: renamed from: a */
        private final List f22819a;

        /* JADX INFO: renamed from: b */
        private final K1.d f22820b;

        /* JADX INFO: renamed from: c */
        private int f22821c;

        /* JADX INFO: renamed from: d */
        private com.bumptech.glide.g f22822d;

        /* JADX INFO: renamed from: e */
        private d.a f22823e;

        /* JADX INFO: renamed from: f */
        private List f22824f;

        /* JADX INFO: renamed from: g */
        private boolean f22825g;

        a(List list, K1.d dVar) {
            this.f22820b = dVar;
            o5.k.d(list);
            this.f22819a = list;
            this.f22821c = 0;
        }

        private void g() {
            if (this.f22825g) {
                return;
            }
            if (this.f22821c < this.f22819a.size() - 1) {
                this.f22821c++;
                e(this.f22822d, this.f22823e);
            } else {
                o5.k.e(this.f22824f);
                this.f22823e.c(new U4.q("Fetch failed", new ArrayList(this.f22824f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ((com.bumptech.glide.load.data.d) this.f22819a.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List list = this.f22824f;
            if (list != null) {
                this.f22820b.a(list);
            }
            this.f22824f = null;
            Iterator it = this.f22819a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) o5.k.e(this.f22824f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f22825g = true;
            Iterator it = this.f22819a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public S4.a d() {
            return ((com.bumptech.glide.load.data.d) this.f22819a.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            this.f22822d = gVar;
            this.f22823e = aVar;
            this.f22824f = (List) this.f22820b.b();
            ((com.bumptech.glide.load.data.d) this.f22819a.get(this.f22821c)).e(gVar, this);
            if (this.f22825g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (obj != null) {
                this.f22823e.f(obj);
            } else {
                g();
            }
        }
    }

    q(List list, K1.d dVar) {
        this.f22817a = list;
        this.f22818b = dVar;
    }

    @Override // Y4.n
    public boolean a(Object obj) {
        Iterator it = this.f22817a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // Y4.n
    public n.a b(Object obj, int i10, int i11, S4.h hVar) {
        n.a aVarB;
        int size = this.f22817a.size();
        ArrayList arrayList = new ArrayList(size);
        S4.f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) this.f22817a.get(i12);
            if (nVar.a(obj) && (aVarB = nVar.b(obj, i10, i11, hVar)) != null) {
                fVar = aVarB.f22810a;
                arrayList.add(aVarB.f22812c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a(fVar, new a(arrayList, this.f22818b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f22817a.toArray()) + '}';
    }
}
