package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.M3;
import io.sentry.util.p;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements B0 {

    /* JADX INFO: renamed from: b */
    public static final x f51153b = new x("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* JADX INFO: renamed from: a */
    private final io.sentry.util.p f51154a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public x a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            return new x(interfaceC5218j1.X0());
        }
    }

    public x() {
        this((UUID) null);
    }

    public static /* synthetic */ String a(x xVar, UUID uuid) {
        xVar.getClass();
        return xVar.d(io.sentry.util.J.c(uuid));
    }

    public String d(String str) {
        return io.sentry.util.D.e(str).replace("-", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f51154a.a()).equals(((x) obj).f51154a.a());
    }

    public int hashCode() {
        return ((String) this.f51154a.a()).hashCode();
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.f(toString());
    }

    public String toString() {
        return (String) this.f51154a.a();
    }

    public x(final UUID uuid) {
        if (uuid != null) {
            this.f51154a = new io.sentry.util.p(new p.a() { // from class: io.sentry.protocol.t
                @Override // io.sentry.util.p.a
                public final Object a() {
                    return x.a(this.f51148a, uuid);
                }
            });
        } else {
            this.f51154a = new io.sentry.util.p(new p.a() { // from class: io.sentry.protocol.u
                @Override // io.sentry.util.p.a
                public final Object a() {
                    return M3.a();
                }
            });
        }
    }

    public x(String str) {
        final String strE = io.sentry.util.D.e(str);
        if (strE.length() != 32 && strE.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        }
        if (strE.length() == 36) {
            this.f51154a = new io.sentry.util.p(new p.a() { // from class: io.sentry.protocol.v
                @Override // io.sentry.util.p.a
                public final Object a() {
                    return this.f51150a.d(strE);
                }
            });
        } else {
            this.f51154a = new io.sentry.util.p(new p.a() { // from class: io.sentry.protocol.w
                @Override // io.sentry.util.p.a
                public final Object a() {
                    return x.b(strE);
                }
            });
        }
    }

    public static /* synthetic */ String b(String str) {
        return str;
    }
}
