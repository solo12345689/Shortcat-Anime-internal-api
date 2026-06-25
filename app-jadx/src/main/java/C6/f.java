package C6;

import java.io.IOException;
import java.io.InputStream;
import y5.AbstractC7204b;
import y5.k;
import y5.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B5.a f2891h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2886c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2885b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2887d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2889f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2888e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2884a = 0;

    public f(B5.a aVar) {
        this.f2891h = (B5.a) k.g(aVar);
    }

    private boolean a(InputStream inputStream) throws Throwable {
        int i10;
        int i11 = this.f2888e;
        while (this.f2884a != 6 && (i10 = inputStream.read()) != -1) {
            try {
                int i12 = this.f2886c;
                this.f2886c = i12 + 1;
                if (this.f2890g) {
                    this.f2884a = 6;
                    this.f2890g = false;
                    return false;
                }
                int i13 = this.f2884a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    this.f2884a = 5;
                                } else if (i13 != 5) {
                                    k.i(false);
                                } else {
                                    int i14 = ((this.f2885b << 8) + i10) - 2;
                                    G5.d.a(inputStream, i14);
                                    this.f2886c += i14;
                                    this.f2884a = 2;
                                }
                            } else if (i10 == 255) {
                                this.f2884a = 3;
                            } else if (i10 == 0) {
                                this.f2884a = 2;
                            } else if (i10 == 217) {
                                this.f2890g = true;
                                f(i12 - 1);
                                this.f2884a = 2;
                            } else {
                                if (i10 == 218) {
                                    f(i12 - 1);
                                }
                                if (b(i10)) {
                                    this.f2884a = 4;
                                } else {
                                    this.f2884a = 2;
                                }
                            }
                        } else if (i10 == 255) {
                            this.f2884a = 3;
                        }
                    } else if (i10 == 216) {
                        this.f2884a = 2;
                    } else {
                        this.f2884a = 6;
                    }
                } else if (i10 == 255) {
                    this.f2884a = 1;
                } else {
                    this.f2884a = 6;
                }
                this.f2885b = i10;
            } catch (IOException e10) {
                p.a(e10);
            }
            return (this.f2884a == 6 || this.f2888e == i11) ? false : true;
        }
        if (this.f2884a == 6) {
            return false;
        }
    }

    private static boolean b(int i10) {
        if (i10 == 1) {
            return false;
        }
        return ((i10 >= 208 && i10 <= 215) || i10 == 217 || i10 == 216) ? false : true;
    }

    private void f(int i10) {
        int i11 = this.f2887d;
        if (i11 > 0) {
            this.f2889f = i10;
        }
        this.f2887d = i11 + 1;
        this.f2888e = i11;
    }

    public int c() {
        return this.f2889f;
    }

    public int d() {
        return this.f2888e;
    }

    public boolean e() {
        return this.f2890g;
    }

    public boolean g(E6.k kVar) {
        if (this.f2884a == 6 || kVar.C() <= this.f2886c) {
            return false;
        }
        B5.g gVar = new B5.g(kVar.w(), (byte[]) this.f2891h.get(16384), this.f2891h);
        try {
            G5.d.a(gVar, this.f2886c);
            return a(gVar);
        } catch (IOException e10) {
            p.a(e10);
            return false;
        } finally {
            AbstractC7204b.b(gVar);
        }
    }
}
