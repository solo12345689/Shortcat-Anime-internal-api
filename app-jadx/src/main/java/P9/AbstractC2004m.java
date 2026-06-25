package P9;

import java.util.Comparator;

/* JADX INFO: renamed from: P9.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2004m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC2004m f13713a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC2004m f13714b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC2004m f13715c = new b(1);

    /* JADX INFO: renamed from: P9.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC2004m {
        a() {
            super(null);
        }

        @Override // P9.AbstractC2004m
        public AbstractC2004m d(int i10, int i11) {
            return k(Integer.compare(i10, i11));
        }

        @Override // P9.AbstractC2004m
        public AbstractC2004m e(long j10, long j11) {
            return k(Long.compare(j10, j11));
        }

        @Override // P9.AbstractC2004m
        public AbstractC2004m f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        @Override // P9.AbstractC2004m
        public AbstractC2004m g(boolean z10, boolean z11) {
            return k(Boolean.compare(z10, z11));
        }

        @Override // P9.AbstractC2004m
        public AbstractC2004m h(boolean z10, boolean z11) {
            return k(Boolean.compare(z11, z10));
        }

        @Override // P9.AbstractC2004m
        public int i() {
            return 0;
        }

        AbstractC2004m k(int i10) {
            return i10 < 0 ? AbstractC2004m.f13714b : i10 > 0 ? AbstractC2004m.f13715c : AbstractC2004m.f13713a;
        }
    }

    /* synthetic */ AbstractC2004m(a aVar) {
        this();
    }

    public static AbstractC2004m j() {
        return f13713a;
    }

    public abstract AbstractC2004m d(int i10, int i11);

    public abstract AbstractC2004m e(long j10, long j11);

    public abstract AbstractC2004m f(Object obj, Object obj2, Comparator comparator);

    public abstract AbstractC2004m g(boolean z10, boolean z11);

    public abstract AbstractC2004m h(boolean z10, boolean z11);

    public abstract int i();

    private AbstractC2004m() {
    }

    /* JADX INFO: renamed from: P9.m$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends AbstractC2004m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f13716d;

        b(int i10) {
            super(null);
            this.f13716d = i10;
        }

        @Override // P9.AbstractC2004m
        public int i() {
            return this.f13716d;
        }

        @Override // P9.AbstractC2004m
        public AbstractC2004m d(int i10, int i11) {
            return this;
        }

        @Override // P9.AbstractC2004m
        public AbstractC2004m e(long j10, long j11) {
            return this;
        }

        @Override // P9.AbstractC2004m
        public AbstractC2004m g(boolean z10, boolean z11) {
            return this;
        }

        @Override // P9.AbstractC2004m
        public AbstractC2004m h(boolean z10, boolean z11) {
            return this;
        }

        @Override // P9.AbstractC2004m
        public AbstractC2004m f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }
    }
}
