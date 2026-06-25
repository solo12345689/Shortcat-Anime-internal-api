package R0;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.InterfaceC5866b;

/* JADX INFO: renamed from: R0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2098g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14955d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2098g f14956e = new C2098g(0.0f, AbstractC5874j.b(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5866b f14958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14959c;

    /* JADX INFO: renamed from: R0.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2098g a() {
            return C2098g.f14956e;
        }

        private a() {
        }
    }

    public C2098g(float f10, InterfaceC5866b interfaceC5866b, int i10) {
        this.f14957a = f10;
        this.f14958b = interfaceC5866b;
        this.f14959c = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f14957a;
    }

    public final InterfaceC5866b c() {
        return this.f14958b;
    }

    public final int d() {
        return this.f14959c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2098g)) {
            return false;
        }
        C2098g c2098g = (C2098g) obj;
        return this.f14957a == c2098g.f14957a && AbstractC5504s.c(this.f14958b, c2098g.f14958b) && this.f14959c == c2098g.f14959c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f14957a) * 31) + this.f14958b.hashCode()) * 31) + this.f14959c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f14957a + ", range=" + this.f14958b + ", steps=" + this.f14959c + ')';
    }

    public /* synthetic */ C2098g(float f10, InterfaceC5866b interfaceC5866b, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, interfaceC5866b, (i11 & 4) != 0 ? 0 : i10);
    }
}
