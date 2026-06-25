package x0;

import java.util.Iterator;
import java.util.List;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: x0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7042n extends p implements Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f63572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f63573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f63574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f63575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f63576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f63577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f63578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f63579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f63580j;

    /* JADX INFO: renamed from: x0.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f63581a;

        a(C7042n c7042n) {
            this.f63581a = c7042n.f63580j.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p next() {
            return (p) this.f63581a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f63581a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7042n(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
        super(null);
        this.f63571a = str;
        this.f63572b = f10;
        this.f63573c = f11;
        this.f63574d = f12;
        this.f63575e = f13;
        this.f63576f = f14;
        this.f63577g = f15;
        this.f63578h = f16;
        this.f63579i = list;
        this.f63580j = list2;
    }

    public final p d(int i10) {
        return (p) this.f63580j.get(i10);
    }

    public final List e() {
        return this.f63579i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C7042n)) {
            C7042n c7042n = (C7042n) obj;
            return AbstractC5504s.c(this.f63571a, c7042n.f63571a) && this.f63572b == c7042n.f63572b && this.f63573c == c7042n.f63573c && this.f63574d == c7042n.f63574d && this.f63575e == c7042n.f63575e && this.f63576f == c7042n.f63576f && this.f63577g == c7042n.f63577g && this.f63578h == c7042n.f63578h && AbstractC5504s.c(this.f63579i, c7042n.f63579i) && AbstractC5504s.c(this.f63580j, c7042n.f63580j);
        }
        return false;
    }

    public final String f() {
        return this.f63571a;
    }

    public int hashCode() {
        return (((((((((((((((((this.f63571a.hashCode() * 31) + Float.hashCode(this.f63572b)) * 31) + Float.hashCode(this.f63573c)) * 31) + Float.hashCode(this.f63574d)) * 31) + Float.hashCode(this.f63575e)) * 31) + Float.hashCode(this.f63576f)) * 31) + Float.hashCode(this.f63577g)) * 31) + Float.hashCode(this.f63578h)) * 31) + this.f63579i.hashCode()) * 31) + this.f63580j.hashCode();
    }

    public final float i() {
        return this.f63573c;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    public final float l() {
        return this.f63574d;
    }

    public final float n() {
        return this.f63572b;
    }

    public final float p() {
        return this.f63575e;
    }

    public final float r() {
        return this.f63576f;
    }

    public final int t() {
        return this.f63580j.size();
    }

    public final float u() {
        return this.f63577g;
    }

    public final float v() {
        return this.f63578h;
    }
}
