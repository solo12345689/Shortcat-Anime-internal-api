package r3;

import P9.AbstractC2011u;
import java.util.Objects;
import q2.C6109x;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface r {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58521a = new C0884a();

        /* JADX INFO: renamed from: r3.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0884a implements a {
            C0884a() {
            }

            @Override // r3.r.a
            public r a(C6109x c6109x) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // r3.r.a
            public boolean b(C6109x c6109x) {
                return false;
            }

            @Override // r3.r.a
            public int c(C6109x c6109x) {
                return 1;
            }
        }

        r a(C6109x c6109x);

        boolean b(C6109x c6109x);

        int c(C6109x c6109x);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f58522c = new b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f58523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f58524b;

        private b(long j10, boolean z10) {
            this.f58523a = j10;
            this.f58524b = z10;
        }

        public static b b() {
            return f58522c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }
    }

    void a(byte[] bArr, int i10, int i11, b bVar, InterfaceC6627n interfaceC6627n);

    default j b(byte[] bArr, int i10, int i11) {
        final AbstractC2011u.a aVarT = AbstractC2011u.t();
        b bVar = b.f58522c;
        Objects.requireNonNull(aVarT);
        a(bArr, i10, i11, bVar, new InterfaceC6627n() { // from class: r3.q
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                aVarT.a((d) obj);
            }
        });
        return new f(aVarT.k());
    }

    int c();

    default void reset() {
    }
}
