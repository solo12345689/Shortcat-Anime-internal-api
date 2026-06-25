package x0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: x0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7036h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f63492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f63493b;

    /* JADX INFO: renamed from: x0.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f63496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f63497f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f63498g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f63499h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f63500i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f63494c = f10;
            this.f63495d = f11;
            this.f63496e = f12;
            this.f63497f = z10;
            this.f63498g = z11;
            this.f63499h = f13;
            this.f63500i = f14;
        }

        public final float c() {
            return this.f63499h;
        }

        public final float d() {
            return this.f63500i;
        }

        public final float e() {
            return this.f63494c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f63494c, aVar.f63494c) == 0 && Float.compare(this.f63495d, aVar.f63495d) == 0 && Float.compare(this.f63496e, aVar.f63496e) == 0 && this.f63497f == aVar.f63497f && this.f63498g == aVar.f63498g && Float.compare(this.f63499h, aVar.f63499h) == 0 && Float.compare(this.f63500i, aVar.f63500i) == 0;
        }

        public final float f() {
            return this.f63496e;
        }

        public final float g() {
            return this.f63495d;
        }

        public final boolean h() {
            return this.f63497f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f63494c) * 31) + Float.hashCode(this.f63495d)) * 31) + Float.hashCode(this.f63496e)) * 31) + Boolean.hashCode(this.f63497f)) * 31) + Boolean.hashCode(this.f63498g)) * 31) + Float.hashCode(this.f63499h)) * 31) + Float.hashCode(this.f63500i);
        }

        public final boolean i() {
            return this.f63498g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f63494c + ", verticalEllipseRadius=" + this.f63495d + ", theta=" + this.f63496e + ", isMoreThanHalf=" + this.f63497f + ", isPositiveArc=" + this.f63498g + ", arcStartX=" + this.f63499h + ", arcStartY=" + this.f63500i + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f63501c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    /* JADX INFO: renamed from: x0.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f63504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f63505f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f63506g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f63507h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f63502c = f10;
            this.f63503d = f11;
            this.f63504e = f12;
            this.f63505f = f13;
            this.f63506g = f14;
            this.f63507h = f15;
        }

        public final float c() {
            return this.f63502c;
        }

        public final float d() {
            return this.f63504e;
        }

        public final float e() {
            return this.f63506g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f63502c, cVar.f63502c) == 0 && Float.compare(this.f63503d, cVar.f63503d) == 0 && Float.compare(this.f63504e, cVar.f63504e) == 0 && Float.compare(this.f63505f, cVar.f63505f) == 0 && Float.compare(this.f63506g, cVar.f63506g) == 0 && Float.compare(this.f63507h, cVar.f63507h) == 0;
        }

        public final float f() {
            return this.f63503d;
        }

        public final float g() {
            return this.f63505f;
        }

        public final float h() {
            return this.f63507h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f63502c) * 31) + Float.hashCode(this.f63503d)) * 31) + Float.hashCode(this.f63504e)) * 31) + Float.hashCode(this.f63505f)) * 31) + Float.hashCode(this.f63506g)) * 31) + Float.hashCode(this.f63507h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f63502c + ", y1=" + this.f63503d + ", x2=" + this.f63504e + ", y2=" + this.f63505f + ", x3=" + this.f63506g + ", y3=" + this.f63507h + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63508c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f63508c = f10;
        }

        public final float c() {
            return this.f63508c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f63508c, ((d) obj).f63508c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f63508c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f63508c + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63510d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f63509c = f10;
            this.f63510d = f11;
        }

        public final float c() {
            return this.f63509c;
        }

        public final float d() {
            return this.f63510d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f63509c, eVar.f63509c) == 0 && Float.compare(this.f63510d, eVar.f63510d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f63509c) * 31) + Float.hashCode(this.f63510d);
        }

        public String toString() {
            return "LineTo(x=" + this.f63509c + ", y=" + this.f63510d + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63512d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f63511c = f10;
            this.f63512d = f11;
        }

        public final float c() {
            return this.f63511c;
        }

        public final float d() {
            return this.f63512d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f63511c, fVar.f63511c) == 0 && Float.compare(this.f63512d, fVar.f63512d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f63511c) * 31) + Float.hashCode(this.f63512d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f63511c + ", y=" + this.f63512d + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f63515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f63516f;

        public g(float f10, float f11, float f12, float f13) {
            super(false, true, true ? 1 : 0, null);
            this.f63513c = f10;
            this.f63514d = f11;
            this.f63515e = f12;
            this.f63516f = f13;
        }

        public final float c() {
            return this.f63513c;
        }

        public final float d() {
            return this.f63515e;
        }

        public final float e() {
            return this.f63514d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f63513c, gVar.f63513c) == 0 && Float.compare(this.f63514d, gVar.f63514d) == 0 && Float.compare(this.f63515e, gVar.f63515e) == 0 && Float.compare(this.f63516f, gVar.f63516f) == 0;
        }

        public final float f() {
            return this.f63516f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f63513c) * 31) + Float.hashCode(this.f63514d)) * 31) + Float.hashCode(this.f63515e)) * 31) + Float.hashCode(this.f63516f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f63513c + ", y1=" + this.f63514d + ", x2=" + this.f63515e + ", y2=" + this.f63516f + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0958h extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f63519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f63520f;

        public C0958h(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f63517c = f10;
            this.f63518d = f11;
            this.f63519e = f12;
            this.f63520f = f13;
        }

        public final float c() {
            return this.f63517c;
        }

        public final float d() {
            return this.f63519e;
        }

        public final float e() {
            return this.f63518d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0958h)) {
                return false;
            }
            C0958h c0958h = (C0958h) obj;
            return Float.compare(this.f63517c, c0958h.f63517c) == 0 && Float.compare(this.f63518d, c0958h.f63518d) == 0 && Float.compare(this.f63519e, c0958h.f63519e) == 0 && Float.compare(this.f63520f, c0958h.f63520f) == 0;
        }

        public final float f() {
            return this.f63520f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f63517c) * 31) + Float.hashCode(this.f63518d)) * 31) + Float.hashCode(this.f63519e)) * 31) + Float.hashCode(this.f63520f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f63517c + ", y1=" + this.f63518d + ", x2=" + this.f63519e + ", y2=" + this.f63520f + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63522d;

        public i(float f10, float f11) {
            super(false, true, true ? 1 : 0, null);
            this.f63521c = f10;
            this.f63522d = f11;
        }

        public final float c() {
            return this.f63521c;
        }

        public final float d() {
            return this.f63522d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f63521c, iVar.f63521c) == 0 && Float.compare(this.f63522d, iVar.f63522d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f63521c) * 31) + Float.hashCode(this.f63522d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f63521c + ", y=" + this.f63522d + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f63525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f63526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f63527g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f63528h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f63529i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f63523c = f10;
            this.f63524d = f11;
            this.f63525e = f12;
            this.f63526f = z10;
            this.f63527g = z11;
            this.f63528h = f13;
            this.f63529i = f14;
        }

        public final float c() {
            return this.f63528h;
        }

        public final float d() {
            return this.f63529i;
        }

        public final float e() {
            return this.f63523c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f63523c, jVar.f63523c) == 0 && Float.compare(this.f63524d, jVar.f63524d) == 0 && Float.compare(this.f63525e, jVar.f63525e) == 0 && this.f63526f == jVar.f63526f && this.f63527g == jVar.f63527g && Float.compare(this.f63528h, jVar.f63528h) == 0 && Float.compare(this.f63529i, jVar.f63529i) == 0;
        }

        public final float f() {
            return this.f63525e;
        }

        public final float g() {
            return this.f63524d;
        }

        public final boolean h() {
            return this.f63526f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f63523c) * 31) + Float.hashCode(this.f63524d)) * 31) + Float.hashCode(this.f63525e)) * 31) + Boolean.hashCode(this.f63526f)) * 31) + Boolean.hashCode(this.f63527g)) * 31) + Float.hashCode(this.f63528h)) * 31) + Float.hashCode(this.f63529i);
        }

        public final boolean i() {
            return this.f63527g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f63523c + ", verticalEllipseRadius=" + this.f63524d + ", theta=" + this.f63525e + ", isMoreThanHalf=" + this.f63526f + ", isPositiveArc=" + this.f63527g + ", arcStartDx=" + this.f63528h + ", arcStartDy=" + this.f63529i + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f63532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f63533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f63534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f63535h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f63530c = f10;
            this.f63531d = f11;
            this.f63532e = f12;
            this.f63533f = f13;
            this.f63534g = f14;
            this.f63535h = f15;
        }

        public final float c() {
            return this.f63530c;
        }

        public final float d() {
            return this.f63532e;
        }

        public final float e() {
            return this.f63534g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f63530c, kVar.f63530c) == 0 && Float.compare(this.f63531d, kVar.f63531d) == 0 && Float.compare(this.f63532e, kVar.f63532e) == 0 && Float.compare(this.f63533f, kVar.f63533f) == 0 && Float.compare(this.f63534g, kVar.f63534g) == 0 && Float.compare(this.f63535h, kVar.f63535h) == 0;
        }

        public final float f() {
            return this.f63531d;
        }

        public final float g() {
            return this.f63533f;
        }

        public final float h() {
            return this.f63535h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f63530c) * 31) + Float.hashCode(this.f63531d)) * 31) + Float.hashCode(this.f63532e)) * 31) + Float.hashCode(this.f63533f)) * 31) + Float.hashCode(this.f63534g)) * 31) + Float.hashCode(this.f63535h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f63530c + ", dy1=" + this.f63531d + ", dx2=" + this.f63532e + ", dy2=" + this.f63533f + ", dx3=" + this.f63534g + ", dy3=" + this.f63535h + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63536c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f63536c = f10;
        }

        public final float c() {
            return this.f63536c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f63536c, ((l) obj).f63536c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f63536c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f63536c + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63538d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f63537c = f10;
            this.f63538d = f11;
        }

        public final float c() {
            return this.f63537c;
        }

        public final float d() {
            return this.f63538d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f63537c, mVar.f63537c) == 0 && Float.compare(this.f63538d, mVar.f63538d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f63537c) * 31) + Float.hashCode(this.f63538d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f63537c + ", dy=" + this.f63538d + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63540d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f63539c = f10;
            this.f63540d = f11;
        }

        public final float c() {
            return this.f63539c;
        }

        public final float d() {
            return this.f63540d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f63539c, nVar.f63539c) == 0 && Float.compare(this.f63540d, nVar.f63540d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f63539c) * 31) + Float.hashCode(this.f63540d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f63539c + ", dy=" + this.f63540d + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$o */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f63543e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f63544f;

        public o(float f10, float f11, float f12, float f13) {
            super(false, true, true ? 1 : 0, null);
            this.f63541c = f10;
            this.f63542d = f11;
            this.f63543e = f12;
            this.f63544f = f13;
        }

        public final float c() {
            return this.f63541c;
        }

        public final float d() {
            return this.f63543e;
        }

        public final float e() {
            return this.f63542d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f63541c, oVar.f63541c) == 0 && Float.compare(this.f63542d, oVar.f63542d) == 0 && Float.compare(this.f63543e, oVar.f63543e) == 0 && Float.compare(this.f63544f, oVar.f63544f) == 0;
        }

        public final float f() {
            return this.f63544f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f63541c) * 31) + Float.hashCode(this.f63542d)) * 31) + Float.hashCode(this.f63543e)) * 31) + Float.hashCode(this.f63544f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f63541c + ", dy1=" + this.f63542d + ", dx2=" + this.f63543e + ", dy2=" + this.f63544f + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$p */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f63547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f63548f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f63545c = f10;
            this.f63546d = f11;
            this.f63547e = f12;
            this.f63548f = f13;
        }

        public final float c() {
            return this.f63545c;
        }

        public final float d() {
            return this.f63547e;
        }

        public final float e() {
            return this.f63546d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f63545c, pVar.f63545c) == 0 && Float.compare(this.f63546d, pVar.f63546d) == 0 && Float.compare(this.f63547e, pVar.f63547e) == 0 && Float.compare(this.f63548f, pVar.f63548f) == 0;
        }

        public final float f() {
            return this.f63548f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f63545c) * 31) + Float.hashCode(this.f63546d)) * 31) + Float.hashCode(this.f63547e)) * 31) + Float.hashCode(this.f63548f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f63545c + ", dy1=" + this.f63546d + ", dx2=" + this.f63547e + ", dy2=" + this.f63548f + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$q */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63550d;

        public q(float f10, float f11) {
            super(false, true, true ? 1 : 0, null);
            this.f63549c = f10;
            this.f63550d = f11;
        }

        public final float c() {
            return this.f63549c;
        }

        public final float d() {
            return this.f63550d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f63549c, qVar.f63549c) == 0 && Float.compare(this.f63550d, qVar.f63550d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f63549c) * 31) + Float.hashCode(this.f63550d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f63549c + ", dy=" + this.f63550d + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$r */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63551c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f63551c = f10;
        }

        public final float c() {
            return this.f63551c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f63551c, ((r) obj).f63551c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f63551c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f63551c + ')';
        }
    }

    /* JADX INFO: renamed from: x0.h$s */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s extends AbstractC7036h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63552c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f63552c = f10;
        }

        public final float c() {
            return this.f63552c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f63552c, ((s) obj).f63552c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f63552c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f63552c + ')';
        }
    }

    public /* synthetic */ AbstractC7036h(boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11);
    }

    public final boolean a() {
        return this.f63492a;
    }

    public final boolean b() {
        return this.f63493b;
    }

    private AbstractC7036h(boolean z10, boolean z11) {
        this.f63492a = z10;
        this.f63493b = z11;
    }

    public /* synthetic */ AbstractC7036h(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}
