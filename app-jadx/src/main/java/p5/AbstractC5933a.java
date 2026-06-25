package p5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: p5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5933a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f55805a = new C0857a();

    /* JADX INFO: renamed from: p5.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements d {
        b() {
        }

        @Override // p5.AbstractC5933a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: p5.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements g {
        c() {
        }

        @Override // p5.AbstractC5933a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: p5.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        Object create();
    }

    /* JADX INFO: renamed from: p5.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e implements K1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f55806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f55807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final K1.d f55808c;

        e(K1.d dVar, d dVar2, g gVar) {
            this.f55808c = dVar;
            this.f55806a = dVar2;
            this.f55807b = gVar;
        }

        @Override // K1.d
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).h().b(true);
            }
            this.f55807b.a(obj);
            return this.f55808c.a(obj);
        }

        @Override // K1.d
        public Object b() {
            Object objB = this.f55808c.b();
            if (objB == null) {
                objB = this.f55806a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + objB.getClass());
                }
            }
            if (objB instanceof f) {
                ((f) objB).h().b(false);
            }
            return objB;
        }
    }

    /* JADX INFO: renamed from: p5.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f {
        p5.c h();
    }

    /* JADX INFO: renamed from: p5.a$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface g {
        void a(Object obj);
    }

    private static K1.d a(K1.d dVar, d dVar2) {
        return b(dVar, dVar2, c());
    }

    private static K1.d b(K1.d dVar, d dVar2, g gVar) {
        return new e(dVar, dVar2, gVar);
    }

    private static g c() {
        return f55805a;
    }

    public static K1.d d(int i10, d dVar) {
        return a(new K1.e(i10), dVar);
    }

    public static K1.d e() {
        return f(20);
    }

    public static K1.d f(int i10) {
        return b(new K1.e(i10), new b(), new c());
    }

    /* JADX INFO: renamed from: p5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0857a implements g {
        C0857a() {
        }

        @Override // p5.AbstractC5933a.g
        public void a(Object obj) {
        }
    }
}
