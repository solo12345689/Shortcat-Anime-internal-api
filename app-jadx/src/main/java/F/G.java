package F;

import F.InterfaceC1533d;
import a0.C2507c;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC1533d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2507c f6009a = new C2507c(new InterfaceC1533d.a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1533d.a f6011c;

    private final void c(int i10) {
        if (i10 < 0 || i10 >= getSize()) {
            throw new IndexOutOfBoundsException("Index " + i10 + ", size " + getSize());
        }
    }

    private final boolean d(InterfaceC1533d.a aVar, int i10) {
        return i10 < aVar.b() + aVar.a() && aVar.b() <= i10;
    }

    private final InterfaceC1533d.a e(int i10) {
        InterfaceC1533d.a aVar = this.f6011c;
        if (aVar != null && d(aVar, i10)) {
            return aVar;
        }
        C2507c c2507c = this.f6009a;
        InterfaceC1533d.a aVar2 = (InterfaceC1533d.a) c2507c.o()[AbstractC1534e.b(c2507c, i10)];
        this.f6011c = aVar2;
        return aVar2;
    }

    @Override // F.InterfaceC1533d
    public void a(int i10, int i11, Function1 function1) {
        c(i10);
        c(i11);
        if (i11 < i10) {
            throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
        }
        int iB = AbstractC1534e.b(this.f6009a, i10);
        int iB2 = ((InterfaceC1533d.a) this.f6009a.o()[iB]).b();
        while (iB2 <= i11) {
            InterfaceC1533d.a aVar = (InterfaceC1533d.a) this.f6009a.o()[iB];
            function1.invoke(aVar);
            iB2 += aVar.a();
            iB++;
        }
    }

    public final void b(int i10, Object obj) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i10).toString());
        }
        if (i10 == 0) {
            return;
        }
        InterfaceC1533d.a aVar = new InterfaceC1533d.a(getSize(), i10, obj);
        this.f6010b = getSize() + i10;
        this.f6009a.c(aVar);
    }

    @Override // F.InterfaceC1533d
    public InterfaceC1533d.a get(int i10) {
        c(i10);
        return e(i10);
    }

    @Override // F.InterfaceC1533d
    public int getSize() {
        return this.f6010b;
    }
}
