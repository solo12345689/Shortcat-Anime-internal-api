package Zg;

import Hg.h;
import Zg.f;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecureRandom f23429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f23430b = new h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f23435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f23438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f23439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f23440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f23441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f23442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f23443o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f23444p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f23445q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f23446r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f23447s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f23448t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final f f23449u;

    a(int i10, SecureRandom secureRandom, boolean z10) {
        int i11;
        int i12;
        int i13;
        this.f23435g = i10;
        if (i10 != 2) {
            if (i10 == 3) {
                this.f23436h = 6;
                this.f23437i = 5;
                this.f23438j = 4;
                this.f23439k = 49;
                this.f23440l = 196;
                this.f23441m = 524288;
                this.f23442n = 261888;
                this.f23443o = 55;
                this.f23432d = 640;
                this.f23433e = 128;
                this.f23434f = 128;
                i13 = 48;
            } else {
                if (i10 != 5) {
                    throw new IllegalArgumentException("The mode " + i10 + "is not supported by Crystals Dilithium!");
                }
                this.f23436h = 8;
                this.f23437i = 7;
                this.f23438j = 2;
                this.f23439k = 60;
                this.f23440l = 120;
                this.f23441m = 524288;
                this.f23442n = 261888;
                this.f23443o = 75;
                this.f23432d = 640;
                this.f23433e = 128;
                this.f23434f = 96;
                i13 = 64;
            }
            this.f23444p = i13;
        } else {
            this.f23436h = 4;
            this.f23437i = 4;
            this.f23438j = 2;
            this.f23439k = 39;
            this.f23440l = 78;
            this.f23441m = 131072;
            this.f23442n = 95232;
            this.f23443o = 80;
            this.f23432d = 576;
            this.f23433e = JfifUtil.MARKER_SOFn;
            this.f23434f = 96;
            this.f23444p = 32;
        }
        this.f23449u = z10 ? new f.a() : new f.b();
        this.f23429a = secureRandom;
        int i14 = this.f23443o;
        int i15 = this.f23436h;
        int i16 = i14 + i15;
        this.f23431c = i16;
        this.f23445q = (i15 * 320) + 32;
        int i17 = this.f23437i;
        int i18 = this.f23434f;
        this.f23446r = (i17 * i18) + 128 + (i18 * i15) + (i15 * 416);
        this.f23447s = this.f23444p + (i17 * this.f23432d) + i16;
        int i19 = this.f23441m;
        if (i19 == 131072) {
            i11 = this.f23449u.f23467b;
            i12 = i11 + 575;
        } else {
            if (i19 != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            i11 = this.f23449u.f23467b;
            i12 = i11 + 639;
        }
        this.f23448t = i12 / i11;
    }

    int a() {
        return this.f23436h;
    }

    int b() {
        return this.f23437i;
    }

    int c() {
        return this.f23434f;
    }
}
