package C;

import i1.EnumC5027t;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;

/* JADX INFO: renamed from: C.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1141l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2145a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1141l f2146b = a.f2149e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1141l f2147c = e.f2152e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC1141l f2148d = c.f2150e;

    /* JADX INFO: renamed from: C.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends AbstractC1141l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f2149e = new a();

        private a() {
            super(null);
        }

        @Override // C.AbstractC1141l
        public int a(int i10, EnumC5027t enumC5027t, androidx.compose.ui.layout.s sVar, int i11) {
            return i10 / 2;
        }
    }

    /* JADX INFO: renamed from: C.l$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1141l a(e.b bVar) {
            return new d(bVar);
        }

        public final AbstractC1141l b(e.c cVar) {
            return new f(cVar);
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: C.l$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends AbstractC1141l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f2150e = new c();

        private c() {
            super(null);
        }

        @Override // C.AbstractC1141l
        public int a(int i10, EnumC5027t enumC5027t, androidx.compose.ui.layout.s sVar, int i11) {
            if (enumC5027t == EnumC5027t.f48573a) {
                return i10;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: C.l$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d extends AbstractC1141l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e.b f2151e;

        public d(e.b bVar) {
            super(null);
            this.f2151e = bVar;
        }

        @Override // C.AbstractC1141l
        public int a(int i10, EnumC5027t enumC5027t, androidx.compose.ui.layout.s sVar, int i11) {
            return this.f2151e.a(0, i10, enumC5027t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC5504s.c(this.f2151e, ((d) obj).f2151e);
        }

        public int hashCode() {
            return this.f2151e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f2151e + ')';
        }
    }

    /* JADX INFO: renamed from: C.l$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e extends AbstractC1141l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f2152e = new e();

        private e() {
            super(null);
        }

        @Override // C.AbstractC1141l
        public int a(int i10, EnumC5027t enumC5027t, androidx.compose.ui.layout.s sVar, int i11) {
            if (enumC5027t == EnumC5027t.f48573a) {
                return 0;
            }
            return i10;
        }
    }

    /* JADX INFO: renamed from: C.l$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f extends AbstractC1141l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e.c f2153e;

        public f(e.c cVar) {
            super(null);
            this.f2153e = cVar;
        }

        @Override // C.AbstractC1141l
        public int a(int i10, EnumC5027t enumC5027t, androidx.compose.ui.layout.s sVar, int i11) {
            return this.f2153e.a(0, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && AbstractC5504s.c(this.f2153e, ((f) obj).f2153e);
        }

        public int hashCode() {
            return this.f2153e.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f2153e + ')';
        }
    }

    public /* synthetic */ AbstractC1141l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int i10, EnumC5027t enumC5027t, androidx.compose.ui.layout.s sVar, int i11);

    public Integer b(androidx.compose.ui.layout.s sVar) {
        return null;
    }

    public boolean c() {
        return false;
    }

    private AbstractC1141l() {
    }
}
