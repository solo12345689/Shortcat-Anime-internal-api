package Zh;

import Vh.h;
import Vh.m;
import Vh.n;
import Vh.p;
import Yh.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f23477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f23478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Zh.a f23479e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f23484e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f23480a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f23481b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f23482c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Set f23483d = h.s();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Zh.a f23485f = Zh.a.NONE;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements d {
            a() {
            }

            @Override // Zh.d
            public Zh.b a(Zh.c cVar) {
                return new n(cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public d j() {
            d dVar = this.f23484e;
            return dVar != null ? dVar : new a();
        }

        public e g() {
            return new e(this);
        }

        public b h(bi.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("delimiterProcessor must not be null");
            }
            this.f23481b.add(aVar);
            return this;
        }

        public b i(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("extensions must not be null");
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Sh.a aVar = (Sh.a) it.next();
                if (aVar instanceof c) {
                    ((c) aVar).a(this);
                }
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c extends Sh.a {
        void a(b bVar);
    }

    public static b a() {
        return new b();
    }

    private h b() {
        return new h(this.f23475a, this.f23477c, this.f23476b, this.f23479e);
    }

    private s d(s sVar) {
        Iterator it = this.f23478d.iterator();
        if (!it.hasNext()) {
            return sVar;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public s c(String str) {
        if (str != null) {
            return d(b().t(str));
        }
        throw new NullPointerException("input must not be null");
    }

    private e(b bVar) {
        this.f23475a = h.l(bVar.f23480a, bVar.f23483d);
        d dVarJ = bVar.j();
        this.f23477c = dVarJ;
        this.f23478d = bVar.f23482c;
        List list = bVar.f23481b;
        this.f23476b = list;
        this.f23479e = bVar.f23485f;
        dVarJ.a(new m(list, new p()));
    }
}
