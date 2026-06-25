package Y;

import Td.C2160k;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractC2394b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f22167b;

    public O(Function1 function1) {
        super(new InterfaceC5082a() { // from class: Y.N
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return O.h();
            }
        });
        this.f22167b = new P(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h() {
        AbstractC2454w.u("Unexpected call to default provider");
        throw new C2160k();
    }

    @Override // Y.AbstractC2394b1
    public C2397c1 c(Object obj) {
        return new C2397c1(this, obj, obj == null, null, null, null, true);
    }

    @Override // Y.D
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public P a() {
        return this.f22167b;
    }
}
