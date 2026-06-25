package x0;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5015h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6358h0;
import s0.C6385r0;

/* JADX INFO: renamed from: x0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7032d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f63435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f63436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f63437m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f63439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f63440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f63441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f63442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C7042n f63443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f63444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f63445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f63446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f63447j;

    /* JADX INFO: renamed from: x0.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f63448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f63449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f63450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f63451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f63452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f63453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f63454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f63455h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayList f63456i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private C0957a f63457j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f63458k;

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f10, f11, f12, f13, j10, i10, z10);
        }

        public static /* synthetic */ a b(a aVar, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "";
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i10 & 4) != 0) {
                f11 = 0.0f;
            }
            if ((i10 & 8) != 0) {
                f12 = 0.0f;
            }
            if ((i10 & 16) != 0) {
                f13 = 1.0f;
            }
            if ((i10 & 32) != 0) {
                f14 = 1.0f;
            }
            if ((i10 & 64) != 0) {
                f15 = 0.0f;
            }
            if ((i10 & 128) != 0) {
                f16 = 0.0f;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                list = AbstractC7043o.d();
            }
            float f17 = f16;
            List list2 = list;
            float f18 = f15;
            float f19 = f13;
            return aVar.a(str, f10, f11, f12, f19, f14, f18, f17, list2);
        }

        private final C7042n e(C0957a c0957a) {
            return new C7042n(c0957a.c(), c0957a.f(), c0957a.d(), c0957a.e(), c0957a.g(), c0957a.h(), c0957a.i(), c0957a.j(), c0957a.b(), c0957a.a());
        }

        private final void h() {
            if (this.f63458k) {
                H0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final C0957a i() {
            return (C0957a) AbstractC7033e.d(this.f63456i);
        }

        public final a a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list) {
            h();
            AbstractC7033e.f(this.f63456i, new C0957a(str, f10, f11, f12, f13, f14, f15, f16, list, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null));
            return this;
        }

        public final a c(List list, int i10, String str, AbstractC6358h0 abstractC6358h0, float f10, AbstractC6358h0 abstractC6358h02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
            h();
            i().a().add(new r(str, list, i10, abstractC6358h0, f10, abstractC6358h02, f11, f12, i11, i12, f13, f14, f15, f16, null));
            return this;
        }

        public final C7032d f() {
            h();
            while (this.f63456i.size() > 1) {
                g();
            }
            C7032d c7032d = new C7032d(this.f63448a, this.f63449b, this.f63450c, this.f63451d, this.f63452e, e(this.f63457j), this.f63453f, this.f63454g, this.f63455h, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null);
            this.f63458k = true;
            return c7032d;
        }

        public final a g() {
            h();
            i().a().add(e((C0957a) AbstractC7033e.e(this.f63456i)));
            return this;
        }

        private a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10) {
            this.f63448a = str;
            this.f63449b = f10;
            this.f63450c = f11;
            this.f63451d = f12;
            this.f63452e = f13;
            this.f63453f = j10;
            this.f63454g = i10;
            this.f63455h = z10;
            ArrayList arrayList = new ArrayList();
            this.f63456i = arrayList;
            C0957a c0957a = new C0957a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f63457j = c0957a;
            AbstractC7033e.f(arrayList, c0957a);
        }

        /* JADX INFO: renamed from: x0.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0957a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f63459a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f63460b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f63461c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f63462d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f63463e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private float f63464f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private float f63465g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private float f63466h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List f63467i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List f63468j;

            public C0957a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
                this.f63459a = str;
                this.f63460b = f10;
                this.f63461c = f11;
                this.f63462d = f12;
                this.f63463e = f13;
                this.f63464f = f14;
                this.f63465g = f15;
                this.f63466h = f16;
                this.f63467i = list;
                this.f63468j = list2;
            }

            public final List a() {
                return this.f63468j;
            }

            public final List b() {
                return this.f63467i;
            }

            public final String c() {
                return this.f63459a;
            }

            public final float d() {
                return this.f63461c;
            }

            public final float e() {
                return this.f63462d;
            }

            public final float f() {
                return this.f63460b;
            }

            public final float g() {
                return this.f63463e;
            }

            public final float h() {
                return this.f63464f;
            }

            public final float i() {
                return this.f63465g;
            }

            public final float j() {
                return this.f63466h;
            }

            public /* synthetic */ C0957a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? AbstractC7043o.d() : list, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? C6385r0.f58985b.j() : j10, (i11 & 64) != 0 ? androidx.compose.ui.graphics.c.f26737b.z() : i10, (i11 & 128) != 0 ? false : z10, null);
        }
    }

    /* JADX INFO: renamed from: x0.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            int i10;
            synchronized (C7032d.f63437m) {
                i10 = C7032d.f63436l;
                C7032d.f63436l = i10 + 1;
            }
            return i10;
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        f63435k = bVar;
        f63437m = bVar;
    }

    public /* synthetic */ C7032d(String str, float f10, float f11, float f12, float f13, C7042n c7042n, long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, f11, f12, f13, c7042n, j10, i10, z10, i11);
    }

    public final boolean d() {
        return this.f63446i;
    }

    public final float e() {
        return this.f63440c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7032d)) {
            return false;
        }
        C7032d c7032d = (C7032d) obj;
        return AbstractC5504s.c(this.f63438a, c7032d.f63438a) && C5015h.q(this.f63439b, c7032d.f63439b) && C5015h.q(this.f63440c, c7032d.f63440c) && this.f63441d == c7032d.f63441d && this.f63442e == c7032d.f63442e && AbstractC5504s.c(this.f63443f, c7032d.f63443f) && C6385r0.s(this.f63444g, c7032d.f63444g) && androidx.compose.ui.graphics.c.G(this.f63445h, c7032d.f63445h) && this.f63446i == c7032d.f63446i;
    }

    public final float f() {
        return this.f63439b;
    }

    public final int g() {
        return this.f63447j;
    }

    public final String h() {
        return this.f63438a;
    }

    public int hashCode() {
        return (((((((((((((((this.f63438a.hashCode() * 31) + C5015h.r(this.f63439b)) * 31) + C5015h.r(this.f63440c)) * 31) + Float.hashCode(this.f63441d)) * 31) + Float.hashCode(this.f63442e)) * 31) + this.f63443f.hashCode()) * 31) + C6385r0.y(this.f63444g)) * 31) + androidx.compose.ui.graphics.c.H(this.f63445h)) * 31) + Boolean.hashCode(this.f63446i);
    }

    public final C7042n i() {
        return this.f63443f;
    }

    public final int j() {
        return this.f63445h;
    }

    public final long k() {
        return this.f63444g;
    }

    public final float l() {
        return this.f63442e;
    }

    public final float m() {
        return this.f63441d;
    }

    private C7032d(String str, float f10, float f11, float f12, float f13, C7042n c7042n, long j10, int i10, boolean z10, int i11) {
        this.f63438a = str;
        this.f63439b = f10;
        this.f63440c = f11;
        this.f63441d = f12;
        this.f63442e = f13;
        this.f63443f = c7042n;
        this.f63444g = j10;
        this.f63445h = i10;
        this.f63446i = z10;
        this.f63447j = i11;
    }

    public /* synthetic */ C7032d(String str, float f10, float f11, float f12, float f13, C7042n c7042n, long j10, int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, f11, f12, f13, c7042n, j10, i10, z10, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? f63435k.a() : i11, null);
    }
}
