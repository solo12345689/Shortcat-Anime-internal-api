package hc;

import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: hc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C4931c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5082a f47801b;

    public C4931c(String name) {
        AbstractC5504s.h(name, "name");
        this.f47800a = name;
    }

    public final C4930b a() {
        String str = this.f47800a;
        InterfaceC5082a interfaceC5082a = this.f47801b;
        if (interfaceC5082a != null) {
            return new C4930b(str, interfaceC5082a);
        }
        throw new IllegalArgumentException(("The constant '" + str + "' doesn't have getter.").toString());
    }

    public final void b(InterfaceC5082a interfaceC5082a) {
        this.f47801b = interfaceC5082a;
    }
}
