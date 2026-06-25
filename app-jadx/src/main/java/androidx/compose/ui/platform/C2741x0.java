package androidx.compose.ui.platform;

import Ud.AbstractC2279u;
import android.os.Parcel;
import android.util.Base64;
import g1.C4821a;
import g1.C4831k;
import i1.AbstractC5030w;
import i1.C5029v;
import i1.C5031x;
import r0.C6224f;
import s0.C6385r0;

/* JADX INFO: renamed from: androidx.compose.ui.platform.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2741x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Parcel f27563a;

    public C2741x0(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f27563a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int a() {
        return this.f27563a.dataAvail();
    }

    private final float b() {
        return C4821a.c(e());
    }

    private final byte c() {
        return this.f27563a.readByte();
    }

    private final float e() {
        return this.f27563a.readFloat();
    }

    private final int i() {
        return this.f27563a.readInt();
    }

    private final s0.C1 j() {
        long jD = d();
        float fE = e();
        return new s0.C1(jD, C6224f.e((((long) Float.floatToRawIntBits(e())) & 4294967295L) | (Float.floatToRawIntBits(fE) << 32)), e(), null);
    }

    private final String l() {
        return this.f27563a.readString();
    }

    private final C4831k m() {
        int i10 = i();
        C4831k.a aVar = C4831k.f47287b;
        boolean z10 = (aVar.b().e() & i10) != 0;
        boolean z11 = (i10 & aVar.d().e()) != 0;
        return (z10 && z11) ? aVar.a(AbstractC2279u.p(aVar.b(), aVar.d())) : z10 ? aVar.b() : z11 ? aVar.d() : aVar.c();
    }

    private final g1.q n() {
        return new g1.q(e(), e());
    }

    public final long d() {
        return s0.H.a(C6385r0.f58985b, this.f27563a.readLong());
    }

    public final int f() {
        byte bC = c();
        return bC == 0 ? Y0.H.f22594b.b() : bC == 1 ? Y0.H.f22594b.a() : Y0.H.f22594b.b();
    }

    public final int g() {
        byte bC = c();
        return bC == 0 ? Y0.I.f22598b.b() : bC == 1 ? Y0.I.f22598b.a() : bC == 3 ? Y0.I.f22598b.c() : bC == 2 ? Y0.I.f22598b.d() : Y0.I.f22598b.b();
    }

    public final Y0.L h() {
        return new Y0.L(i());
    }

    public final U0.I0 k() {
        C2688c1 c2688c1 = new C2688c1(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f27563a.dataAvail() > 1) {
            byte bC = c();
            if (bC != 1) {
                if (bC != 2) {
                    if (bC != 3) {
                        if (bC != 4) {
                            if (bC != 5) {
                                if (bC != 6) {
                                    if (bC != 7) {
                                        if (bC != 8) {
                                            if (bC != 9) {
                                                if (bC != 10) {
                                                    if (bC != 11) {
                                                        if (bC == 12) {
                                                            if (a() < 20) {
                                                                break;
                                                            }
                                                            c2688c1.j(j());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (a() < 4) {
                                                            break;
                                                        }
                                                        c2688c1.k(m());
                                                    }
                                                } else {
                                                    if (a() < 8) {
                                                        break;
                                                    }
                                                    c2688c1.a(d());
                                                }
                                            } else {
                                                if (a() < 8) {
                                                    break;
                                                }
                                                c2688c1.l(n());
                                            }
                                        } else {
                                            if (a() < 4) {
                                                break;
                                            }
                                            c2688c1.b(C4821a.b(b()));
                                        }
                                    } else {
                                        if (a() < 5) {
                                            break;
                                        }
                                        c2688c1.i(o());
                                    }
                                } else {
                                    c2688c1.d(l());
                                }
                            } else {
                                if (a() < 1) {
                                    break;
                                }
                                c2688c1.g(Y0.I.e(g()));
                            }
                        } else {
                            if (a() < 1) {
                                break;
                            }
                            c2688c1.f(Y0.H.c(f()));
                        }
                    } else {
                        if (a() < 4) {
                            break;
                        }
                        c2688c1.h(h());
                    }
                } else {
                    if (a() < 5) {
                        break;
                    }
                    c2688c1.e(o());
                }
            } else {
                if (a() < 8) {
                    break;
                }
                c2688c1.c(d());
            }
        }
        return c2688c1.m();
    }

    public final long o() {
        byte bC = c();
        long jB = bC == 1 ? C5031x.f48582b.b() : bC == 2 ? C5031x.f48582b.a() : C5031x.f48582b.c();
        return C5031x.g(jB, C5031x.f48582b.c()) ? C5029v.f48578b.a() : AbstractC5030w.a(e(), jB);
    }
}
