package v6;

import dg.E;
import dg.t;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f61982c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f61983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f61984b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(E response) {
            AbstractC5504s.h(response, "response");
            E eS = response.S();
            Integer numValueOf = eS != null ? Integer.valueOf(eS.o()) : null;
            E eS2 = response.S();
            return new d(numValueOf, eS2 != null ? eS2.E() : null);
        }

        private a() {
        }
    }

    public d(Integer num, t tVar) {
        this.f61983a = num;
        this.f61984b = tVar;
    }
}
