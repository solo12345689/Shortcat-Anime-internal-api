package b0;

import Ud.AbstractC2263d;
import f0.C4750d;
import java.util.List;
import je.InterfaceC5371a;

/* JADX INFO: renamed from: b0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2966c extends List, InterfaceC2965b, InterfaceC5371a {

    /* JADX INFO: renamed from: b0.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends AbstractC2263d implements InterfaceC2966c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC2966c f33018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f33019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f33020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f33021e;

        public a(InterfaceC2966c interfaceC2966c, int i10, int i11) {
            this.f33018b = interfaceC2966c;
            this.f33019c = i10;
            this.f33020d = i11;
            C4750d.c(i10, i11, interfaceC2966c.size());
            this.f33021e = i11 - i10;
        }

        @Override // Ud.AbstractC2261b
        public int d() {
            return this.f33021e;
        }

        @Override // Ud.AbstractC2263d, java.util.List
        public Object get(int i10) {
            C4750d.a(i10, this.f33021e);
            return this.f33018b.get(this.f33019c + i10);
        }

        @Override // Ud.AbstractC2263d, java.util.List
        public InterfaceC2966c subList(int i10, int i11) {
            C4750d.c(i10, i11, this.f33021e);
            InterfaceC2966c interfaceC2966c = this.f33018b;
            int i12 = this.f33019c;
            return new a(interfaceC2966c, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    default InterfaceC2966c subList(int i10, int i11) {
        return new a(this, i10, i11);
    }
}
