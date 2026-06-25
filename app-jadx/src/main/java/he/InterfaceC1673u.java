package He;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: He.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC1673u {
    Oe.u a(Xe.c cVar, boolean z10);

    Oe.g b(a aVar);

    Set c(Xe.c cVar);

    /* JADX INFO: renamed from: He.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Xe.b f8575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f8576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Oe.g f8577c;

        public a(Xe.b classId, byte[] bArr, Oe.g gVar) {
            AbstractC5504s.h(classId, "classId");
            this.f8575a = classId;
            this.f8576b = bArr;
            this.f8577c = gVar;
        }

        public final Xe.b a() {
            return this.f8575a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f8575a, aVar.f8575a) && AbstractC5504s.c(this.f8576b, aVar.f8576b) && AbstractC5504s.c(this.f8577c, aVar.f8577c);
        }

        public int hashCode() {
            int iHashCode = this.f8575a.hashCode() * 31;
            byte[] bArr = this.f8576b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            Oe.g gVar = this.f8577c;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f8575a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f8576b) + ", outerClass=" + this.f8577c + ')';
        }

        public /* synthetic */ a(Xe.b bVar, byte[] bArr, Oe.g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : gVar);
        }
    }
}
