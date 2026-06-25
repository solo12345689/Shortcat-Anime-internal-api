package x2;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f63783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet f63784b = new TreeSet(new Comparator() { // from class: x2.o
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p.h((i) obj, (i) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f63785c;

    public p(long j10) {
        this.f63783a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(i iVar, i iVar2) {
        long j10 = iVar.f63752f;
        long j11 = iVar2.f63752f;
        return j10 - j11 == 0 ? iVar.compareTo(iVar2) : j10 < j11 ? -1 : 1;
    }

    private void i(InterfaceC7048a interfaceC7048a, long j10) {
        while (this.f63785c + j10 > this.f63783a && !this.f63784b.isEmpty()) {
            interfaceC7048a.f((i) this.f63784b.first());
        }
    }

    @Override // x2.d
    public void a(InterfaceC7048a interfaceC7048a, String str, long j10, long j11) {
        if (j11 != -1) {
            i(interfaceC7048a, j11);
        }
    }

    @Override // x2.InterfaceC7048a.b
    public void b(InterfaceC7048a interfaceC7048a, i iVar) {
        this.f63784b.add(iVar);
        this.f63785c += iVar.f63749c;
        i(interfaceC7048a, 0L);
    }

    @Override // x2.d
    public boolean c() {
        return true;
    }

    @Override // x2.InterfaceC7048a.b
    public void d(InterfaceC7048a interfaceC7048a, i iVar, i iVar2) {
        e(interfaceC7048a, iVar);
        b(interfaceC7048a, iVar2);
    }

    @Override // x2.InterfaceC7048a.b
    public void e(InterfaceC7048a interfaceC7048a, i iVar) {
        this.f63784b.remove(iVar);
        this.f63785c -= iVar.f63749c;
    }

    @Override // x2.d
    public void f() {
    }
}
