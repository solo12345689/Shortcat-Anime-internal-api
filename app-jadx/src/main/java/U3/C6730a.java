package u3;

import android.graphics.Bitmap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import r3.d;
import r3.r;
import s2.C6403a;
import t2.C6609I;
import t2.InterfaceC6627n;
import t2.a0;

/* JADX INFO: renamed from: u3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6730a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f61353a = new C6609I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f61354b = new C6609I();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0915a f61355c = new C0915a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f61356d;

    /* JADX INFO: renamed from: u3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0915a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6609I f61357a = new C6609I();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f61358b = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f61359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f61360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f61361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f61362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f61363g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f61364h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f61365i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(C6609I c6609i, int i10) {
            int iP;
            if (i10 < 4) {
                return;
            }
            c6609i.c0(3);
            int i11 = i10 - 4;
            if ((c6609i.M() & 128) != 0) {
                if (i11 < 7 || (iP = c6609i.P()) < 4) {
                    return;
                }
                this.f61364h = c6609i.U();
                this.f61365i = c6609i.U();
                this.f61357a.X(iP - 4);
                i11 = i10 - 11;
            }
            int iG = this.f61357a.g();
            int iJ = this.f61357a.j();
            if (iG >= iJ || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iJ - iG);
            c6609i.q(this.f61357a.f(), iG, iMin);
            this.f61357a.b0(iG + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(C6609I c6609i, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f61360d = c6609i.U();
            this.f61361e = c6609i.U();
            c6609i.c0(11);
            this.f61362f = c6609i.U();
            this.f61363g = c6609i.U();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(C6609I c6609i, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            c6609i.c0(2);
            Arrays.fill(this.f61358b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iM = c6609i.M();
                int iM2 = c6609i.M();
                int iM3 = c6609i.M();
                int iM4 = c6609i.M();
                double d10 = iM2;
                double d11 = iM3 - 128;
                double d12 = iM4 - 128;
                this.f61358b[iM] = (a0.r((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (c6609i.M() << 24) | (a0.r((int) ((1.402d * d11) + d10), 0, 255) << 16) | a0.r((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f61359c = true;
        }

        public C6403a d() {
            int iM;
            if (this.f61360d == 0 || this.f61361e == 0 || this.f61364h == 0 || this.f61365i == 0 || this.f61357a.j() == 0 || this.f61357a.g() != this.f61357a.j() || !this.f61359c) {
                return null;
            }
            this.f61357a.b0(0);
            int i10 = this.f61364h * this.f61365i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iM2 = this.f61357a.M();
                if (iM2 != 0) {
                    iM = i11 + 1;
                    iArr[i11] = this.f61358b[iM2];
                } else {
                    int iM3 = this.f61357a.M();
                    if (iM3 != 0) {
                        iM = ((iM3 & 64) == 0 ? iM3 & 63 : ((iM3 & 63) << 8) | this.f61357a.M()) + i11;
                        Arrays.fill(iArr, i11, iM, (iM3 & 128) == 0 ? this.f61358b[0] : this.f61358b[this.f61357a.M()]);
                    }
                }
                i11 = iM;
            }
            return new C6403a.b().f(Bitmap.createBitmap(iArr, this.f61364h, this.f61365i, Bitmap.Config.ARGB_8888)).k(this.f61362f / this.f61360d).l(0).h(this.f61363g / this.f61361e, 0).i(0).n(this.f61364h / this.f61360d).g(this.f61365i / this.f61361e).a();
        }

        public void h() {
            this.f61360d = 0;
            this.f61361e = 0;
            this.f61362f = 0;
            this.f61363g = 0;
            this.f61364h = 0;
            this.f61365i = 0;
            this.f61357a.X(0);
            this.f61359c = false;
        }
    }

    private static C6403a d(C6609I c6609i, C0915a c0915a) {
        int iJ = c6609i.j();
        int iM = c6609i.M();
        int iU = c6609i.U();
        int iG = c6609i.g() + iU;
        C6403a c6403aD = null;
        if (iG > iJ) {
            c6609i.b0(iJ);
            return null;
        }
        if (iM != 128) {
            switch (iM) {
                case 20:
                    c0915a.g(c6609i, iU);
                    break;
                case 21:
                    c0915a.e(c6609i, iU);
                    break;
                case 22:
                    c0915a.f(c6609i, iU);
                    break;
            }
        } else {
            c6403aD = c0915a.d();
            c0915a.h();
        }
        c6609i.b0(iG);
        return c6403aD;
    }

    @Override // r3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC6627n interfaceC6627n) {
        this.f61353a.Z(bArr, i11 + i10);
        this.f61353a.b0(i10);
        if (this.f61356d == null) {
            this.f61356d = new Inflater();
        }
        if (a0.S0(this.f61353a, this.f61354b, this.f61356d)) {
            this.f61353a.Z(this.f61354b.f(), this.f61354b.j());
        }
        this.f61355c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f61353a.a() >= 3) {
            C6403a c6403aD = d(this.f61353a, this.f61355c);
            if (c6403aD != null) {
                arrayList.add(c6403aD);
            }
        }
        interfaceC6627n.accept(new d(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // r3.r
    public int c() {
        return 2;
    }
}
