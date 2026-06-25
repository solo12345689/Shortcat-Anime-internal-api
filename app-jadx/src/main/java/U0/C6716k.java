package u0;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.G1;
import s0.H1;
import s0.InterfaceC6377n1;

/* JADX INFO: renamed from: u0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6716k extends AbstractC6712g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f61116e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f61117f = G1.f58877a.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f61118g = H1.f58881a.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f61119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f61120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f61122d;

    /* JADX INFO: renamed from: u0.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C6716k.f61117f;
        }

        private a() {
        }
    }

    public /* synthetic */ C6716k(float f10, float f11, int i10, int i11, InterfaceC6377n1 interfaceC6377n1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, interfaceC6377n1);
    }

    public final int b() {
        return this.f61121c;
    }

    public final int c() {
        return this.f61122d;
    }

    public final float d() {
        return this.f61120b;
    }

    public final InterfaceC6377n1 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6716k)) {
            return false;
        }
        C6716k c6716k = (C6716k) obj;
        return this.f61119a == c6716k.f61119a && this.f61120b == c6716k.f61120b && G1.e(this.f61121c, c6716k.f61121c) && H1.e(this.f61122d, c6716k.f61122d) && AbstractC5504s.c(null, null);
    }

    public final float f() {
        return this.f61119a;
    }

    public int hashCode() {
        return ((((((Float.hashCode(this.f61119a) * 31) + Float.hashCode(this.f61120b)) * 31) + G1.f(this.f61121c)) * 31) + H1.f(this.f61122d)) * 31;
    }

    public String toString() {
        return "Stroke(width=" + this.f61119a + ", miter=" + this.f61120b + ", cap=" + ((Object) G1.g(this.f61121c)) + ", join=" + ((Object) H1.g(this.f61122d)) + ", pathEffect=" + ((Object) null) + ')';
    }

    public /* synthetic */ C6716k(float f10, float f11, int i10, int i11, InterfaceC6377n1 interfaceC6377n1, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? f61117f : i10, (i12 & 8) != 0 ? f61118g : i11, (i12 & 16) != 0 ? null : interfaceC6377n1, null);
    }

    private C6716k(float f10, float f11, int i10, int i11, InterfaceC6377n1 interfaceC6377n1) {
        super(null);
        this.f61119a = f10;
        this.f61120b = f11;
        this.f61121c = i10;
        this.f61122d = i11;
    }
}
