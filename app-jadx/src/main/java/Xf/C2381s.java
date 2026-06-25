package Xf;

import Wf.AbstractC2358b;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Xf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2381s extends C2377n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC2358b f22007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22008d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2381s(InterfaceC2385w writer, AbstractC2358b json) {
        super(writer);
        AbstractC5504s.h(writer, "writer");
        AbstractC5504s.h(json, "json");
        this.f22007c = json;
    }

    @Override // Xf.C2377n
    public void b() {
        o(true);
        this.f22008d++;
    }

    @Override // Xf.C2377n
    public void c() {
        o(false);
        k("\n");
        int i10 = this.f22008d;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.f22007c.f().n());
        }
    }

    @Override // Xf.C2377n
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // Xf.C2377n
    public void p() {
        f(' ');
    }

    @Override // Xf.C2377n
    public void q() {
        this.f22008d--;
    }
}
