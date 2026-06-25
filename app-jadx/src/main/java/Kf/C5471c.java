package kf;

import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ye.InterfaceC7223a;

/* JADX INFO: renamed from: kf.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5471c extends AbstractC5469a implements InterfaceC5474f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC7223a f52193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Xe.f f52194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5471c(InterfaceC7223a declarationDescriptor, S receiverType, Xe.f fVar, InterfaceC5475g interfaceC5475g) {
        super(receiverType, interfaceC5475g);
        AbstractC5504s.h(declarationDescriptor, "declarationDescriptor");
        AbstractC5504s.h(receiverType, "receiverType");
        this.f52193c = declarationDescriptor;
        this.f52194d = fVar;
    }

    @Override // kf.InterfaceC5474f
    public Xe.f a() {
        return this.f52194d;
    }

    public InterfaceC7223a c() {
        return this.f52193c;
    }

    public String toString() {
        return "Cxt { " + c() + " }";
    }
}
