package P9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class E {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13585a;

        a(int i10) {
            this.f13585a = i10;
        }

        @Override // P9.E.e
        Map c() {
            return L.c(this.f13585a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f13586a;

        b(Comparator comparator) {
            this.f13586a = comparator;
        }

        @Override // P9.E.e
        Map c() {
            return new TreeMap(this.f13586a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements O9.t, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13587a;

        c(int i10) {
            this.f13587a = AbstractC1999h.b(i10, "expectedValuesPerKey");
        }

        @Override // O9.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f13587a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class d extends E {
        d() {
            super(null);
        }

        public abstract z e();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class e {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f13588a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f13589b;

            a(e eVar, int i10) {
                this.f13588a = i10;
                this.f13589b = eVar;
            }

            @Override // P9.E.d
            public z e() {
                return F.b(this.f13589b.c(), new c(this.f13588a));
            }
        }

        e() {
        }

        public d a() {
            return b(2);
        }

        public d b(int i10) {
            AbstractC1999h.b(i10, "expectedValuesPerKey");
            return new a(this, i10);
        }

        abstract Map c();
    }

    /* synthetic */ E(a aVar) {
        this();
    }

    public static e a() {
        return b(8);
    }

    public static e b(int i10) {
        AbstractC1999h.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e c() {
        return d(K.c());
    }

    public static e d(Comparator comparator) {
        O9.n.j(comparator);
        return new b(comparator);
    }

    private E() {
    }
}
