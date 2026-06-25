package i4;

import Ud.a0;
import android.net.Uri;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f48640i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f48641j = new b(null, false, false, false, false, 0, 0, null, 255, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f48642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f48643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f48644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f48645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f48646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f48647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f48648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f48649h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: i4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0772b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f48650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f48651b;

        public C0772b(Uri uri, boolean z10) {
            AbstractC5504s.h(uri, "uri");
            this.f48650a = uri;
            this.f48651b = z10;
        }

        public final Uri a() {
            return this.f48650a;
        }

        public final boolean b() {
            return this.f48651b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!AbstractC5504s.c(C0772b.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            AbstractC5504s.f(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            C0772b c0772b = (C0772b) obj;
            return AbstractC5504s.c(this.f48650a, c0772b.f48650a) && this.f48651b == c0772b.f48651b;
        }

        public int hashCode() {
            return (this.f48650a.hashCode() * 31) + Boolean.hashCode(this.f48651b);
        }
    }

    public b(j requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set contentUriTriggers) {
        AbstractC5504s.h(requiredNetworkType, "requiredNetworkType");
        AbstractC5504s.h(contentUriTriggers, "contentUriTriggers");
        this.f48642a = requiredNetworkType;
        this.f48643b = z10;
        this.f48644c = z11;
        this.f48645d = z12;
        this.f48646e = z13;
        this.f48647f = j10;
        this.f48648g = j11;
        this.f48649h = contentUriTriggers;
    }

    public final long a() {
        return this.f48648g;
    }

    public final long b() {
        return this.f48647f;
    }

    public final Set c() {
        return this.f48649h;
    }

    public final j d() {
        return this.f48642a;
    }

    public final boolean e() {
        return !this.f48649h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC5504s.c(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f48643b == bVar.f48643b && this.f48644c == bVar.f48644c && this.f48645d == bVar.f48645d && this.f48646e == bVar.f48646e && this.f48647f == bVar.f48647f && this.f48648g == bVar.f48648g && this.f48642a == bVar.f48642a) {
            return AbstractC5504s.c(this.f48649h, bVar.f48649h);
        }
        return false;
    }

    public final boolean f() {
        return this.f48645d;
    }

    public final boolean g() {
        return this.f48643b;
    }

    public final boolean h() {
        return this.f48644c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f48642a.hashCode() * 31) + (this.f48643b ? 1 : 0)) * 31) + (this.f48644c ? 1 : 0)) * 31) + (this.f48645d ? 1 : 0)) * 31) + (this.f48646e ? 1 : 0)) * 31;
        long j10 = this.f48647f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f48648g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f48649h.hashCode();
    }

    public final boolean i() {
        return this.f48646e;
    }

    public /* synthetic */ b(j jVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? j.NOT_REQUIRED : jVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) != 0 ? -1L : j11, (i10 & 128) != 0 ? a0.d() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(b other) {
        AbstractC5504s.h(other, "other");
        boolean z10 = other.f48643b;
        boolean z11 = other.f48644c;
        this(other.f48642a, z10, z11, other.f48645d, other.f48646e, other.f48647f, other.f48648g, other.f48649h);
    }
}
