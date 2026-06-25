package q5;

import q5.C6116b;
import q5.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C6116b.r f57199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f57200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f57201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g.C6118b f57202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f57203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g.C6118b f57204f;

    public f() {
        this.f57199a = null;
        this.f57200b = null;
        this.f57201c = null;
        this.f57202d = null;
        this.f57203e = null;
        this.f57204f = null;
    }

    public boolean a() {
        C6116b.r rVar = this.f57199a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean b() {
        return this.f57200b != null;
    }

    public boolean c() {
        return this.f57201c != null;
    }

    public boolean d() {
        return this.f57203e != null;
    }

    public boolean e() {
        return this.f57202d != null;
    }

    public boolean f() {
        return this.f57204f != null;
    }

    public f g(float f10, float f11, float f12, float f13) {
        this.f57204f = new g.C6118b(f10, f11, f12, f13);
        return this;
    }

    public f(f fVar) {
        this.f57199a = null;
        this.f57200b = null;
        this.f57201c = null;
        this.f57202d = null;
        this.f57203e = null;
        this.f57204f = null;
        if (fVar == null) {
            return;
        }
        this.f57199a = fVar.f57199a;
        this.f57200b = fVar.f57200b;
        this.f57202d = fVar.f57202d;
        this.f57203e = fVar.f57203e;
        this.f57204f = fVar.f57204f;
    }
}
