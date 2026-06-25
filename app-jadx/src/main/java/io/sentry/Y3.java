package io.sentry;

import io.sentry.util.p;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class Y3 implements B0 {

    /* JADX INFO: renamed from: b */
    public static final Y3 f49384b = new Y3("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* JADX INFO: renamed from: a */
    private final io.sentry.util.p f49385a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public Y3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            return new Y3(interfaceC5218j1.X0());
        }
    }

    public Y3(final String str) {
        Objects.requireNonNull(str, "value is required");
        this.f49385a = new io.sentry.util.p(new p.a() { // from class: io.sentry.X3
            @Override // io.sentry.util.p.a
            public final Object a() {
                return Y3.a(str);
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y3.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f49385a.a()).equals(((Y3) obj).f49385a.a());
    }

    public int hashCode() {
        return ((String) this.f49385a.a()).hashCode();
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.f((String) this.f49385a.a());
    }

    public String toString() {
        return (String) this.f49385a.a();
    }

    public Y3() {
        this.f49385a = new io.sentry.util.p(new p.a() { // from class: io.sentry.W3
            @Override // io.sentry.util.p.a
            public final Object a() {
                return M3.b();
            }
        });
    }

    public static /* synthetic */ String a(String str) {
        return str;
    }
}
