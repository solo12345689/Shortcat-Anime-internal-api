package r8;

import android.util.Base64;
import p8.EnumC5940e;
import r8.C6278d;

/* JADX INFO: renamed from: r8.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6289o {

    /* JADX INFO: renamed from: r8.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public abstract AbstractC6289o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC5940e enumC5940e);
    }

    public static a a() {
        return new C6278d.b().d(EnumC5940e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC5940e d();

    public boolean e() {
        return c() != null;
    }

    public AbstractC6289o f(EnumC5940e enumC5940e) {
        return a().b(b()).d(enumC5940e).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
