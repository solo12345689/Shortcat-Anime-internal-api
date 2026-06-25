package sg;

import Df.r;
import dg.t;
import fg.AbstractC4807e;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f59781g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f59785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f59786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f59787f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(t responseHeaders) {
            AbstractC5504s.h(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z10 = false;
            Integer numR = null;
            boolean z11 = false;
            Integer numR2 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (r.B(responseHeaders.f(i10), "Sec-WebSocket-Extensions", true)) {
                    String strP = responseHeaders.p(i10);
                    int i11 = 0;
                    while (i11 < strP.length()) {
                        int i12 = i11;
                        int iR = AbstractC4807e.r(strP, ',', i12, 0, 4, null);
                        int iP = AbstractC4807e.p(strP, ';', i12, iR);
                        String strZ = AbstractC4807e.Z(strP, i12, iP);
                        int i13 = iP + 1;
                        if (r.B(strZ, "permessage-deflate", true)) {
                            if (!z10) {
                                z13 = true;
                                while (i13 < iR) {
                                    int iP2 = AbstractC4807e.p(strP, ';', i13, iR);
                                    int iP3 = AbstractC4807e.p(strP, '=', i13, iP2);
                                    String strZ2 = AbstractC4807e.Z(strP, i13, iP3);
                                    String strE0 = iP3 < iP2 ? r.E0(AbstractC4807e.Z(strP, iP3 + 1, iP2), "\"") : null;
                                    int i14 = iP2 + 1;
                                    if (r.B(strZ2, "client_max_window_bits", true)) {
                                        if (numR != null) {
                                            z13 = true;
                                        }
                                        numR = strE0 != null ? r.r(strE0) : null;
                                        i13 = numR == null ? i14 : i14;
                                    } else if (r.B(strZ2, "client_no_context_takeover", true)) {
                                        if (z11) {
                                            z13 = true;
                                        }
                                        if (strE0 != null) {
                                            z13 = true;
                                        }
                                        i13 = i14;
                                        z11 = true;
                                    } else if (r.B(strZ2, "server_max_window_bits", true)) {
                                        if (numR2 != null) {
                                            z13 = true;
                                        }
                                        numR2 = strE0 != null ? r.r(strE0) : null;
                                        if (numR2 == null) {
                                        }
                                    } else if (r.B(strZ2, "server_no_context_takeover", true)) {
                                        if (z12) {
                                            z13 = true;
                                        }
                                        if (strE0 != null) {
                                            z13 = true;
                                        }
                                        i13 = i14;
                                        z12 = true;
                                    }
                                }
                                i11 = i13;
                                z10 = true;
                            }
                            z13 = true;
                        } else {
                            i11 = i13;
                            z13 = true;
                        }
                    }
                }
            }
            return new e(z10, numR, z11, numR2, z12, z13);
        }

        private a() {
        }
    }

    public e(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f59782a = z10;
        this.f59783b = num;
        this.f59784c = z11;
        this.f59785d = num2;
        this.f59786e = z12;
        this.f59787f = z13;
    }

    public final boolean a(boolean z10) {
        return z10 ? this.f59784c : this.f59786e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f59782a == eVar.f59782a && AbstractC5504s.c(this.f59783b, eVar.f59783b) && this.f59784c == eVar.f59784c && AbstractC5504s.c(this.f59785d, eVar.f59785d) && this.f59786e == eVar.f59786e && this.f59787f == eVar.f59787f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z10 = this.f59782a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        Integer num = this.f59783b;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z11 = this.f59784c;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        int i11 = (iHashCode + r22) * 31;
        Integer num2 = this.f59785d;
        int iHashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.f59786e;
        ?? r23 = z12;
        if (z12) {
            r23 = 1;
        }
        int i12 = (iHashCode2 + r23) * 31;
        boolean z13 = this.f59787f;
        return i12 + (z13 ? 1 : z13);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f59782a + ", clientMaxWindowBits=" + this.f59783b + ", clientNoContextTakeover=" + this.f59784c + ", serverMaxWindowBits=" + this.f59785d + ", serverNoContextTakeover=" + this.f59786e + ", unknownValues=" + this.f59787f + ')';
    }
}
