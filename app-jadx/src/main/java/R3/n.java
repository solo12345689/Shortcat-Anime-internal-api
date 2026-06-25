package r3;

import U2.E;
import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.O;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import q2.C6080L;
import q2.C6109x;
import r3.r;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.InterfaceC6627n;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class n implements InterfaceC2255p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f58504a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6109x f58506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f58507d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O f58510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f58511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f58512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f58513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f58514k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6239c f58505b = new C6239c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f58509f = a0.f60567f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6609I f58508e = new C6609I();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f58515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f58516b;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f58515a, bVar.f58515a);
        }

        private b(long j10, byte[] bArr) {
            this.f58515a = j10;
            this.f58516b = bArr;
        }
    }

    public n(r rVar, C6109x c6109x) {
        this.f58504a = rVar;
        this.f58506c = c6109x != null ? c6109x.b().y0("application/x-media3-cues").U(c6109x.f57022o).Y(rVar.c()).P() : null;
        this.f58507d = new ArrayList();
        this.f58512i = 0;
        this.f58513j = a0.f60568g;
        this.f58514k = -9223372036854775807L;
    }

    public static /* synthetic */ void d(n nVar, d dVar) {
        nVar.getClass();
        b bVar = new b(dVar.f58495b, nVar.f58505b.a(dVar.f58494a, dVar.f58496c));
        nVar.f58507d.add(bVar);
        long j10 = nVar.f58514k;
        if (j10 == -9223372036854775807L || dVar.f58497d >= j10) {
            nVar.m(bVar);
        }
    }

    private void e() throws C6080L {
        try {
            long j10 = this.f58514k;
            this.f58504a.a(this.f58509f, 0, this.f58511h, j10 != -9223372036854775807L ? r.b.c(j10) : r.b.b(), new InterfaceC6627n() { // from class: r3.m
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    n.d(this.f58503a, (d) obj);
                }
            });
            Collections.sort(this.f58507d);
            this.f58513j = new long[this.f58507d.size()];
            for (int i10 = 0; i10 < this.f58507d.size(); i10++) {
                this.f58513j[i10] = ((b) this.f58507d.get(i10)).f58515a;
            }
            this.f58509f = a0.f60567f;
        } catch (RuntimeException e10) {
            throw C6080L.a("SubtitleParser failed.", e10);
        }
    }

    private boolean g(InterfaceC2256q interfaceC2256q) {
        byte[] bArr = this.f58509f;
        if (bArr.length == this.f58511h) {
            this.f58509f = Arrays.copyOf(bArr, bArr.length + IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        byte[] bArr2 = this.f58509f;
        int i10 = this.f58511h;
        int i11 = interfaceC2256q.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            this.f58511h += i11;
        }
        long length = interfaceC2256q.getLength();
        return (length != -1 && ((long) this.f58511h) == length) || i11 == -1;
    }

    private boolean j(InterfaceC2256q interfaceC2256q) {
        return interfaceC2256q.b((interfaceC2256q.getLength() > (-1L) ? 1 : (interfaceC2256q.getLength() == (-1L) ? 0 : -1)) != 0 ? S9.f.e(interfaceC2256q.getLength()) : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == -1;
    }

    private void k() {
        long j10 = this.f58514k;
        for (int iK = j10 == -9223372036854775807L ? 0 : a0.k(this.f58513j, j10, true, true); iK < this.f58507d.size(); iK++) {
            m((b) this.f58507d.get(iK));
        }
    }

    private void m(b bVar) {
        AbstractC6614a.i(this.f58510g);
        int length = bVar.f58516b.length;
        this.f58508e.Y(bVar.f58516b);
        this.f58510g.f(this.f58508e, length);
        this.f58510g.a(bVar.f58515a, 1, length, 0, null);
    }

    @Override // U2.InterfaceC2255p
    public void a() {
        if (this.f58512i == 5) {
            return;
        }
        this.f58504a.reset();
        this.f58512i = 5;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        int i10 = this.f58512i;
        AbstractC6614a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f58514k = j11;
        if (this.f58512i == 2) {
            this.f58512i = 1;
        }
        if (this.f58512i == 4) {
            this.f58512i = 3;
        }
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        AbstractC6614a.g(this.f58512i == 0);
        O oE = rVar.e(0, 3);
        this.f58510g = oE;
        C6109x c6109x = this.f58506c;
        if (c6109x != null) {
            oE.c(c6109x);
            rVar.p();
            rVar.t(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f58512i = 1;
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        return true;
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) throws C6080L {
        int i11 = this.f58512i;
        AbstractC6614a.g((i11 == 0 || i11 == 5) ? false : true);
        if (this.f58512i == 1) {
            int iE = interfaceC2256q.getLength() != -1 ? S9.f.e(interfaceC2256q.getLength()) : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            if (iE > this.f58509f.length) {
                this.f58509f = new byte[iE];
            }
            this.f58511h = 0;
            this.f58512i = 2;
        }
        if (this.f58512i == 2 && g(interfaceC2256q)) {
            e();
            this.f58512i = 4;
        }
        if (this.f58512i == 3 && j(interfaceC2256q)) {
            k();
            this.f58512i = 4;
        }
        return this.f58512i == 4 ? -1 : 0;
    }
}
