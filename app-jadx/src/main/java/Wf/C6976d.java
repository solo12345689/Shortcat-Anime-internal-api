package wf;

import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import rf.InterfaceC6315e;
import ye.m0;

/* JADX INFO: renamed from: wf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C6976d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f63201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f63202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S f63203c;

    public C6976d(m0 typeParameter, S inProjection, S outProjection) {
        AbstractC5504s.h(typeParameter, "typeParameter");
        AbstractC5504s.h(inProjection, "inProjection");
        AbstractC5504s.h(outProjection, "outProjection");
        this.f63201a = typeParameter;
        this.f63202b = inProjection;
        this.f63203c = outProjection;
    }

    public final S a() {
        return this.f63202b;
    }

    public final S b() {
        return this.f63203c;
    }

    public final m0 c() {
        return this.f63201a;
    }

    public final boolean d() {
        return InterfaceC6315e.f58773a.a(this.f63202b, this.f63203c);
    }
}
