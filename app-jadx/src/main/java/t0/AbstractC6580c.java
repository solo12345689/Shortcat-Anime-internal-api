package t0;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: t0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6580c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f60198d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f60199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f60200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f60201c;

    /* JADX INFO: renamed from: t0.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC6580c(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, i10);
    }

    public final int a() {
        return AbstractC6579b.f(this.f60200b);
    }

    public final int b() {
        return this.f60201c;
    }

    public abstract float c(int i10);

    public abstract float d(int i10);

    public final long e() {
        return this.f60200b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC6580c abstractC6580c = (AbstractC6580c) obj;
        if (this.f60201c == abstractC6580c.f60201c && AbstractC5504s.c(this.f60199a, abstractC6580c.f60199a)) {
            return AbstractC6579b.e(this.f60200b, abstractC6580c.f60200b);
        }
        return false;
    }

    public final String f() {
        return this.f60199a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f10, float f11, float f12);

    public int hashCode() {
        return (((this.f60199a.hashCode() * 31) + AbstractC6579b.g(this.f60200b)) * 31) + this.f60201c;
    }

    public abstract float i(float f10, float f11, float f12);

    public abstract long j(float f10, float f11, float f12, float f13, AbstractC6580c abstractC6580c);

    public String toString() {
        return this.f60199a + " (id=" + this.f60201c + ", model=" + ((Object) AbstractC6579b.h(this.f60200b)) + ')';
    }

    private AbstractC6580c(String str, long j10, int i10) {
        this.f60199a = str;
        this.f60200b = j10;
        this.f60201c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
