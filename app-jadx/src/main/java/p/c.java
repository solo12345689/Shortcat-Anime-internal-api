package P;

import U0.A;
import U0.Y0;
import U0.Z0;
import Ud.AbstractC2279u;
import Y0.AbstractC2485u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5010c;
import i1.C5009b;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f13182h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f13183i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static c f13184j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC5027t f13185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y0 f13186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5011d f13187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC2485u.b f13188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y0 f13189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f13190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f13191g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(c cVar, EnumC5027t enumC5027t, Y0 y02, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar) {
            if (cVar != null && enumC5027t == cVar.g() && AbstractC5504s.c(y02, cVar.f()) && interfaceC5011d.getDensity() == cVar.d().getDensity() && bVar == cVar.e()) {
                return cVar;
            }
            c cVar2 = c.f13184j;
            if (cVar2 != null && enumC5027t == cVar2.g() && AbstractC5504s.c(y02, cVar2.f()) && interfaceC5011d.getDensity() == cVar2.d().getDensity() && bVar == cVar2.e()) {
                return cVar2;
            }
            c cVar3 = new c(enumC5027t, Z0.d(y02, enumC5027t), interfaceC5011d, bVar, null);
            c.f13184j = cVar3;
            return cVar3;
        }

        private a() {
        }
    }

    public /* synthetic */ c(EnumC5027t enumC5027t, Y0 y02, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC5027t, y02, interfaceC5011d, bVar);
    }

    public final long c(long j10, int i10) {
        float height = this.f13191g;
        float height2 = this.f13190f;
        if (Float.isNaN(height) || Float.isNaN(height2)) {
            height = A.a(d.f13192a, this.f13189e, AbstractC5010c.b(0, 0, 0, 0, 15, null), this.f13187c, this.f13188d, (64 & 32) != 0 ? AbstractC2279u.m() : null, (64 & 64) != 0 ? AbstractC2279u.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : false).getHeight();
            height2 = A.a(d.f13193b, this.f13189e, AbstractC5010c.b(0, 0, 0, 0, 15, null), this.f13187c, this.f13188d, (64 & 32) != 0 ? AbstractC2279u.m() : null, (64 & 64) != 0 ? AbstractC2279u.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : false).getHeight() - height;
            this.f13191g = height;
            this.f13190f = height2;
        }
        return AbstractC5010c.a(C5009b.n(j10), C5009b.l(j10), i10 != 1 ? AbstractC5874j.i(AbstractC5874j.e(Math.round(height + (height2 * (i10 - 1))), 0), C5009b.k(j10)) : C5009b.m(j10), C5009b.k(j10));
    }

    public final InterfaceC5011d d() {
        return this.f13187c;
    }

    public final AbstractC2485u.b e() {
        return this.f13188d;
    }

    public final Y0 f() {
        return this.f13186b;
    }

    public final EnumC5027t g() {
        return this.f13185a;
    }

    private c(EnumC5027t enumC5027t, Y0 y02, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar) {
        this.f13185a = enumC5027t;
        this.f13186b = y02;
        this.f13187c = interfaceC5011d;
        this.f13188d = bVar;
        this.f13189e = Z0.d(y02, enumC5027t);
        this.f13190f = Float.NaN;
        this.f13191g = Float.NaN;
    }
}
