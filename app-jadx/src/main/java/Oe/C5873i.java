package oe;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oe.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5873i extends C5871g implements InterfaceC5867c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f55413e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C5873i f55414f = new C5873i(1, 0);

    /* JADX INFO: renamed from: oe.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5873i a() {
            return C5873i.f55414f;
        }

        private a() {
        }
    }

    public C5873i(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @Override // oe.C5871g
    public boolean equals(Object obj) {
        if (!(obj instanceof C5873i)) {
            return false;
        }
        if (isEmpty() && ((C5873i) obj).isEmpty()) {
            return true;
        }
        C5873i c5873i = (C5873i) obj;
        return f() == c5873i.f() && i() == c5873i.i();
    }

    @Override // oe.C5871g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (f() ^ (f() >>> 32))) + (i() ^ (i() >>> 32)));
    }

    @Override // oe.C5871g, oe.InterfaceC5867c
    public boolean isEmpty() {
        return f() > i();
    }

    @Override // oe.InterfaceC5867c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long e() {
        return Long.valueOf(i());
    }

    @Override // oe.InterfaceC5867c
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Long b() {
        return Long.valueOf(f());
    }

    @Override // oe.C5871g
    public String toString() {
        return f() + ".." + i();
    }
}
