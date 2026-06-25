package oe;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oe.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5870f extends C5868d implements InterfaceC5867c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f55403e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C5870f f55404f = new C5870f(1, 0);

    /* JADX INFO: renamed from: oe.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5870f a() {
            return C5870f.f55404f;
        }

        private a() {
        }
    }

    public C5870f(int i10, int i11) {
        super(i10, i11, 1);
    }

    public boolean H(int i10) {
        return f() <= i10 && i10 <= i();
    }

    @Override // oe.C5868d
    public boolean equals(Object obj) {
        if (!(obj instanceof C5870f)) {
            return false;
        }
        if (isEmpty() && ((C5870f) obj).isEmpty()) {
            return true;
        }
        C5870f c5870f = (C5870f) obj;
        return f() == c5870f.f() && i() == c5870f.i();
    }

    @Override // oe.C5868d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f() * 31) + i();
    }

    @Override // oe.C5868d, oe.InterfaceC5867c
    public boolean isEmpty() {
        return f() > i();
    }

    @Override // oe.InterfaceC5867c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer e() {
        return Integer.valueOf(i());
    }

    @Override // oe.InterfaceC5867c
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer b() {
        return Integer.valueOf(f());
    }

    @Override // oe.C5868d
    public String toString() {
        return f() + ".." + i();
    }
}
