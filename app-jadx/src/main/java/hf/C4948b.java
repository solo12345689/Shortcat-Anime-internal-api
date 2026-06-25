package hf;

import kotlin.jvm.internal.AbstractC5504s;
import pf.InterfaceC6037b;
import pf.n;

/* JADX INFO: renamed from: hf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4948b implements InterfaceC4947a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f47853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6037b f47854b;

    public C4948b(n storageManager, Iterable samWithReceiverResolvers) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f47853a = samWithReceiverResolvers;
        this.f47854b = storageManager.f();
    }
}
