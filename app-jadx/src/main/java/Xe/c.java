package Xe;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21763c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f21764d = new c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f21765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient c f21766b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(f shortName) {
            AbstractC5504s.h(shortName, "shortName");
            return new c(d.f21767e.a(shortName));
        }

        private a() {
        }
    }

    public c(String fqName) {
        AbstractC5504s.h(fqName, "fqName");
        this.f21765a = new d(fqName, this);
    }

    public final String a() {
        return this.f21765a.a();
    }

    public final c b(f name) {
        AbstractC5504s.h(name, "name");
        return new c(this.f21765a.b(name), this);
    }

    public final boolean c() {
        return this.f21765a.e();
    }

    public final c d() {
        c cVar = this.f21766b;
        if (cVar != null) {
            return cVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        c cVar2 = new c(this.f21765a.g());
        this.f21766b = cVar2;
        return cVar2;
    }

    public final List e() {
        return this.f21765a.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && AbstractC5504s.c(this.f21765a, ((c) obj).f21765a);
    }

    public final f f() {
        return this.f21765a.j();
    }

    public final f g() {
        return this.f21765a.k();
    }

    public final boolean h(f segment) {
        AbstractC5504s.h(segment, "segment");
        return this.f21765a.l(segment);
    }

    public int hashCode() {
        return this.f21765a.hashCode();
    }

    public final d i() {
        return this.f21765a;
    }

    public String toString() {
        return this.f21765a.toString();
    }

    public c(d fqName) {
        AbstractC5504s.h(fqName, "fqName");
        this.f21765a = fqName;
    }

    private c(d dVar, c cVar) {
        this.f21765a = dVar;
        this.f21766b = cVar;
    }
}
