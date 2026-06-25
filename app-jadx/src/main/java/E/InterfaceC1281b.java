package E;

import i1.C5015h;
import i1.InterfaceC5011d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: E.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1281b {

    /* JADX INFO: renamed from: E.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC1281b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f3873a;

        public /* synthetic */ a(float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10);
        }

        @Override // E.InterfaceC1281b
        public List a(InterfaceC5011d interfaceC5011d, int i10, int i11) {
            return AbstractC1287h.c(i10, Math.max((i10 + i11) / (interfaceC5011d.s0(this.f3873a) + i11), 1), i11);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C5015h.q(this.f3873a, ((a) obj).f3873a);
        }

        public int hashCode() {
            return C5015h.r(this.f3873a);
        }

        private a(float f10) {
            this.f3873a = f10;
            if (C5015h.m(f10, C5015h.n(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided min size " + ((Object) C5015h.s(f10)) + " should be larger than zero.").toString());
        }
    }

    List a(InterfaceC5011d interfaceC5011d, int i10, int i11);
}
