package kf;

import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ye.InterfaceC7227e;

/* JADX INFO: renamed from: kf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5470b extends AbstractC5469a implements InterfaceC5474f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC7227e f52191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Xe.f f52192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5470b(InterfaceC7227e classDescriptor, S receiverType, Xe.f fVar, InterfaceC5475g interfaceC5475g) {
        super(receiverType, interfaceC5475g);
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        AbstractC5504s.h(receiverType, "receiverType");
        this.f52191c = classDescriptor;
        this.f52192d = fVar;
    }

    @Override // kf.InterfaceC5474f
    public Xe.f a() {
        return this.f52192d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f52191c + " }";
    }
}
