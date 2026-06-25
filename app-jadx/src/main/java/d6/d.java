package d6;

import a6.InterfaceC2580a;
import b6.InterfaceC3025b;
import d6.InterfaceC4568a;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC4568a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f45033b = d.class;

    public d(int i10) {
        this.f45032a = i10;
    }

    @Override // d6.InterfaceC4568a
    public void a() {
        InterfaceC4568a.C0708a.c(this);
    }

    @Override // d6.InterfaceC4568a
    public void b(int i10, int i11, InterfaceC5082a interfaceC5082a) {
        InterfaceC4568a.C0708a.d(this, i10, i11, interfaceC5082a);
    }

    @Override // d6.InterfaceC4568a
    public C5.a c(int i10, int i11, int i12) {
        return InterfaceC4568a.C0708a.b(this, i10, i11, i12);
    }

    @Override // d6.InterfaceC4568a
    public void d() {
        InterfaceC4568a.C0708a.a(this);
    }

    @Override // d6.InterfaceC4568a
    public void e(b bitmapFramePreparer, InterfaceC3025b bitmapFrameCache, InterfaceC2580a animationBackend, int i10, InterfaceC5082a interfaceC5082a) {
        AbstractC5504s.h(bitmapFramePreparer, "bitmapFramePreparer");
        AbstractC5504s.h(bitmapFrameCache, "bitmapFrameCache");
        AbstractC5504s.h(animationBackend, "animationBackend");
        int i11 = this.f45032a;
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int iA = (i10 + i12) % animationBackend.a();
                if (AbstractC7283a.w(2)) {
                    AbstractC7283a.z(this.f45033b, "Preparing frame %d, last drawn: %d", Integer.valueOf(iA), Integer.valueOf(i10));
                }
                if (!bitmapFramePreparer.a(bitmapFrameCache, animationBackend, iA)) {
                    return;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (interfaceC5082a != null) {
            interfaceC5082a.invoke();
        }
    }
}
