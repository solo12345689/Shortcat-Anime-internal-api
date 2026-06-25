package E4;

import E4.c;
import android.graphics.Bitmap;
import java.util.Map;
import t.C6575z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a */
    private final i f5642a;

    /* JADX INFO: renamed from: b */
    private final b f5643b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final Bitmap f5644a;

        /* JADX INFO: renamed from: b */
        private final Map f5645b;

        /* JADX INFO: renamed from: c */
        private final int f5646c;

        public a(Bitmap bitmap, Map map, int i10) {
            this.f5644a = bitmap;
            this.f5645b = map;
            this.f5646c = i10;
        }

        public final Bitmap a() {
            return this.f5644a;
        }

        public final Map b() {
            return this.f5645b;
        }

        public final int c() {
            return this.f5646c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends C6575z {

        /* JADX INFO: renamed from: j */
        final /* synthetic */ f f5647j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, f fVar) {
            super(i10);
            this.f5647j = fVar;
        }

        @Override // t.C6575z
        /* JADX INFO: renamed from: m */
        public void b(boolean z10, c.b bVar, a aVar, a aVar2) {
            this.f5647j.f5642a.c(bVar, aVar.a(), aVar.b(), aVar.c());
        }

        @Override // t.C6575z
        /* JADX INFO: renamed from: n */
        public int j(c.b bVar, a aVar) {
            return aVar.c();
        }
    }

    public f(int i10, i iVar) {
        this.f5642a = iVar;
        this.f5643b = new b(i10, this);
    }

    @Override // E4.h
    public void a(int i10) {
        if (i10 >= 40) {
            e();
        } else {
            if (10 > i10 || i10 >= 20) {
                return;
            }
            this.f5643b.l(g() / 2);
        }
    }

    @Override // E4.h
    public c.C0055c b(c.b bVar) {
        a aVar = (a) this.f5643b.d(bVar);
        if (aVar != null) {
            return new c.C0055c(aVar.a(), aVar.b());
        }
        return null;
    }

    @Override // E4.h
    public void c(c.b bVar, Bitmap bitmap, Map map) {
        int iA = L4.a.a(bitmap);
        if (iA <= f()) {
            this.f5643b.f(bVar, new a(bitmap, map, iA));
        } else {
            this.f5643b.g(bVar);
            this.f5642a.c(bVar, bitmap, map, iA);
        }
    }

    public void e() {
        this.f5643b.c();
    }

    public int f() {
        return this.f5643b.e();
    }

    public int g() {
        return this.f5643b.i();
    }
}
