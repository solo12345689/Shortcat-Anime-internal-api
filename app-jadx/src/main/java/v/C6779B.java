package v;

import Ud.S;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6779B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f61566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f61567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f61568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f61569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f61570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f61571f;

    public C6779B(n nVar, x xVar, h hVar, u uVar, boolean z10, Map map) {
        this.f61566a = nVar;
        this.f61567b = xVar;
        this.f61568c = hVar;
        this.f61569d = uVar;
        this.f61570e = z10;
        this.f61571f = map;
    }

    public final h a() {
        return this.f61568c;
    }

    public final Map b() {
        return this.f61571f;
    }

    public final n c() {
        return this.f61566a;
    }

    public final boolean d() {
        return this.f61570e;
    }

    public final u e() {
        return this.f61569d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6779B)) {
            return false;
        }
        C6779B c6779b = (C6779B) obj;
        return AbstractC5504s.c(this.f61566a, c6779b.f61566a) && AbstractC5504s.c(this.f61567b, c6779b.f61567b) && AbstractC5504s.c(this.f61568c, c6779b.f61568c) && AbstractC5504s.c(this.f61569d, c6779b.f61569d) && this.f61570e == c6779b.f61570e && AbstractC5504s.c(this.f61571f, c6779b.f61571f);
    }

    public final x f() {
        return this.f61567b;
    }

    public int hashCode() {
        n nVar = this.f61566a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        x xVar = this.f61567b;
        int iHashCode2 = (iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        h hVar = this.f61568c;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        u uVar = this.f61569d;
        return ((((iHashCode3 + (uVar != null ? uVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f61570e)) * 31) + this.f61571f.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.f61566a + ", slide=" + this.f61567b + ", changeSize=" + this.f61568c + ", scale=" + this.f61569d + ", hold=" + this.f61570e + ", effectsMap=" + this.f61571f + ')';
    }

    public /* synthetic */ C6779B(n nVar, x xVar, h hVar, u uVar, boolean z10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : nVar, (i10 & 2) != 0 ? null : xVar, (i10 & 4) != 0 ? null : hVar, (i10 & 8) != 0 ? null : uVar, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? S.i() : map);
    }
}
