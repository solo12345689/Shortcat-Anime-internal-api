package o3;

import U2.I;
import U2.InterfaceC2256q;
import j3.c;
import java.util.ArrayList;
import java.util.List;
import q2.C6080L;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final O9.r f54400d = O9.r.d(':');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final O9.r f54401e = O9.r.d('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f54402a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54403b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54404c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f54406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54407c;

        public a(int i10, long j10, int i11) {
            this.f54405a = i10;
            this.f54406b = j10;
            this.f54407c = i11;
        }
    }

    private void a(InterfaceC2256q interfaceC2256q, I i10) {
        C6609I c6609i = new C6609I(8);
        interfaceC2256q.readFully(c6609i.f(), 0, 8);
        this.f54404c = c6609i.z() + 8;
        if (c6609i.v() != 1397048916) {
            i10.f18917a = 0L;
        } else {
            i10.f18917a = interfaceC2256q.getPosition() - ((long) (this.f54404c - 12));
            this.f54403b = 2;
        }
    }

    private static int b(String str) throws C6080L {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw C6080L.a("Invalid SEF name", null);
        }
    }

    private void d(InterfaceC2256q interfaceC2256q, I i10) {
        long length = interfaceC2256q.getLength();
        int i11 = this.f54404c - 20;
        C6609I c6609i = new C6609I(i11);
        interfaceC2256q.readFully(c6609i.f(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            c6609i.c0(2);
            short sB = c6609i.B();
            if (sB == 2192 || sB == 2816 || sB == 2817 || sB == 2819 || sB == 2820) {
                this.f54402a.add(new a(sB, (length - ((long) this.f54404c)) - ((long) c6609i.z()), c6609i.z()));
            } else {
                c6609i.c0(8);
            }
        }
        if (this.f54402a.isEmpty()) {
            i10.f18917a = 0L;
        } else {
            this.f54403b = 3;
            i10.f18917a = ((a) this.f54402a.get(0)).f54406b;
        }
    }

    private void e(InterfaceC2256q interfaceC2256q, List list) throws C6080L {
        long position = interfaceC2256q.getPosition();
        int length = (int) ((interfaceC2256q.getLength() - interfaceC2256q.getPosition()) - ((long) this.f54404c));
        C6609I c6609i = new C6609I(length);
        interfaceC2256q.readFully(c6609i.f(), 0, length);
        for (int i10 = 0; i10 < this.f54402a.size(); i10++) {
            a aVar = (a) this.f54402a.get(i10);
            c6609i.b0((int) (aVar.f54406b - position));
            c6609i.c0(4);
            int iZ = c6609i.z();
            int iB = b(c6609i.J(iZ));
            int i11 = aVar.f54407c - (iZ + 8);
            if (iB == 2192) {
                list.add(f(c6609i, i11));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static j3.c f(C6609I c6609i, int i10) throws C6080L {
        ArrayList arrayList = new ArrayList();
        List listF = f54401e.f(c6609i.J(i10));
        for (int i11 = 0; i11 < listF.size(); i11++) {
            List listF2 = f54400d.f((CharSequence) listF.get(i11));
            if (listF2.size() != 3) {
                throw C6080L.a(null, null);
            }
            try {
                arrayList.add(new c.a(Long.parseLong((String) listF2.get(0)), Long.parseLong((String) listF2.get(1)), 1 << (Integer.parseInt((String) listF2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw C6080L.a(null, e10);
            }
        }
        return new j3.c(arrayList);
    }

    public int c(InterfaceC2256q interfaceC2256q, I i10, List list) throws C6080L {
        int i11 = this.f54403b;
        long j10 = 0;
        if (i11 == 0) {
            long length = interfaceC2256q.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            i10.f18917a = j10;
            this.f54403b = 1;
        } else if (i11 == 1) {
            a(interfaceC2256q, i10);
        } else if (i11 == 2) {
            d(interfaceC2256q, i10);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC2256q, list);
            i10.f18917a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f54402a.clear();
        this.f54403b = 0;
    }
}
