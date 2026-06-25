package Qe;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC5668A;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface v extends InterfaceC5668A {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {

        /* JADX INFO: renamed from: Qe.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0253a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final x f14914a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final byte[] f14915b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0253a(x kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                AbstractC5504s.h(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f14914a = kotlinJvmBinaryClass;
                this.f14915b = bArr;
            }

            public final x b() {
                return this.f14914a;
            }

            public /* synthetic */ C0253a(x xVar, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(xVar, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a() {
            C0253a c0253a = this instanceof C0253a ? (C0253a) this : null;
            if (c0253a != null) {
                return c0253a.b();
            }
            return null;
        }

        private a() {
        }
    }

    a a(Oe.g gVar, Ue.c cVar);

    a c(Xe.b bVar, Ue.c cVar);
}
