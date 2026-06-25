package c1;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33421b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Locale f33422a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(Locale locale) {
        this.f33422a = locale;
    }

    public final String a() {
        return h.a(this.f33422a);
    }

    public final Locale b() {
        return this.f33422a;
    }

    public final String c() {
        return h.b(this.f33422a);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC5504s.c(c(), ((d) obj).c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return c();
    }

    public d(String str) {
        this(g.a().b(str));
    }
}
