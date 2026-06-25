package h5;

import android.content.Context;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.fragment.app.K;
import androidx.lifecycle.AbstractC2857k;
import h5.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class m {

    /* JADX INFO: renamed from: a */
    final Map f47617a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final o.b f47618b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements p {

        /* JADX INFO: renamed from: a */
        private final K f47621a;

        b(K k10) {
            this.f47621a = k10;
        }

        private void b(K k10, Set set) {
            List listC0 = k10.C0();
            int size = listC0.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = (AbstractComponentCallbacksC2838q) listC0.get(i10);
                b(abstractComponentCallbacksC2838q.getChildFragmentManager(), set);
                com.bumptech.glide.k kVarA = m.this.a(abstractComponentCallbacksC2838q.getLifecycle());
                if (kVarA != null) {
                    set.add(kVarA);
                }
            }
        }

        @Override // h5.p
        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f47621a, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f47618b = bVar;
    }

    com.bumptech.glide.k a(AbstractC2857k abstractC2857k) {
        o5.l.b();
        return (com.bumptech.glide.k) this.f47617a.get(abstractC2857k);
    }

    com.bumptech.glide.k b(Context context, com.bumptech.glide.b bVar, AbstractC2857k abstractC2857k, K k10, boolean z10) {
        o5.l.b();
        com.bumptech.glide.k kVarA = a(abstractC2857k);
        if (kVarA != null) {
            return kVarA;
        }
        k kVar = new k(abstractC2857k);
        com.bumptech.glide.k kVarA2 = this.f47618b.a(bVar, kVar, new b(k10), context);
        this.f47617a.put(abstractC2857k, kVarA2);
        kVar.b(new a(abstractC2857k));
        if (z10) {
            kVarA2.b();
        }
        return kVarA2;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2857k f47619a;

        a(AbstractC2857k abstractC2857k) {
            this.f47619a = abstractC2857k;
        }

        @Override // h5.l
        public void d() {
            m.this.f47617a.remove(this.f47619a);
        }

        @Override // h5.l
        public void a() {
        }

        @Override // h5.l
        public void b() {
        }
    }
}
