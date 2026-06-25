package o3;

import P9.AbstractC2011u;
import U2.B;
import i3.C5033a;
import q2.C6078J;
import q2.C6109x;
import t2.AbstractC6635w;
import t2.C6609I;
import u2.AbstractC6723e;
import u2.C6721c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class j {
    public static C6721c a(C6078J c6078j, String str) {
        for (int i10 = 0; i10 < c6078j.e(); i10++) {
            C6078J.a aVarD = c6078j.d(i10);
            if (aVarD instanceof C6721c) {
                C6721c c6721c = (C6721c) aVarD;
                if (c6721c.f61221a.equals(str)) {
                    return c6721c;
                }
            }
        }
        return null;
    }

    private static i3.e b(int i10, C6609I c6609i) {
        int iV = c6609i.v();
        if (c6609i.v() == 1684108385) {
            c6609i.c0(8);
            String strH = c6609i.H(iV - 16);
            return new i3.e("und", strH, strH);
        }
        AbstractC6635w.i("MetadataUtil", "Failed to parse comment attribute: " + AbstractC6723e.a(i10));
        return null;
    }

    private static C5033a c(C6609I c6609i) {
        int iV = c6609i.v();
        if (c6609i.v() != 1684108385) {
            AbstractC6635w.i("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iP = AbstractC5811b.p(c6609i.v());
        String str = iP == 13 ? "image/jpeg" : iP == 14 ? "image/png" : null;
        if (str == null) {
            AbstractC6635w.i("MetadataUtil", "Unrecognized cover art flags: " + iP);
            return null;
        }
        c6609i.c0(4);
        int i10 = iV - 16;
        byte[] bArr = new byte[i10];
        c6609i.q(bArr, 0, i10);
        return new C5033a(str, null, 3, bArr);
    }

    public static C6078J.a d(C6609I c6609i) {
        int iG = c6609i.g() + c6609i.v();
        int iV = c6609i.v();
        int i10 = (iV >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iV;
                if (i11 == 6516084) {
                    return b(iV, c6609i);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return k(iV, "TIT2", c6609i);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return k(iV, "TCOM", c6609i);
                }
                if (i11 == 6578553) {
                    return k(iV, "TDRC", c6609i);
                }
                if (i11 == 4280916) {
                    return k(iV, "TPE1", c6609i);
                }
                if (i11 == 7630703) {
                    return k(iV, "TSSE", c6609i);
                }
                if (i11 == 6384738) {
                    return k(iV, "TALB", c6609i);
                }
                if (i11 == 7108978) {
                    return k(iV, "USLT", c6609i);
                }
                if (i11 == 6776174) {
                    return k(iV, "TCON", c6609i);
                }
                if (i11 == 6779504) {
                    return k(iV, "TIT1", c6609i);
                }
            } else {
                if (iV == 1735291493) {
                    return j(c6609i);
                }
                if (iV == 1684632427) {
                    return e(iV, "TPOS", c6609i);
                }
                if (iV == 1953655662) {
                    return e(iV, "TRCK", c6609i);
                }
                if (iV == 1953329263) {
                    return g(iV, "TBPM", c6609i, true, false);
                }
                if (iV == 1668311404) {
                    return g(iV, "TCMP", c6609i, true, true);
                }
                if (iV == 1668249202) {
                    return c(c6609i);
                }
                if (iV == 1631670868) {
                    return k(iV, "TPE2", c6609i);
                }
                if (iV == 1936682605) {
                    return k(iV, "TSOT", c6609i);
                }
                if (iV == 1936679276) {
                    return k(iV, "TSOA", c6609i);
                }
                if (iV == 1936679282) {
                    return k(iV, "TSOP", c6609i);
                }
                if (iV == 1936679265) {
                    return k(iV, "TSO2", c6609i);
                }
                if (iV == 1936679791) {
                    return k(iV, "TSOC", c6609i);
                }
                if (iV == 1920233063) {
                    return g(iV, "ITUNESADVISORY", c6609i, false, false);
                }
                if (iV == 1885823344) {
                    return g(iV, "ITUNESGAPLESS", c6609i, false, true);
                }
                if (iV == 1936683886) {
                    return k(iV, "TVSHOWSORT", c6609i);
                }
                if (iV == 1953919848) {
                    return k(iV, "TVSHOW", c6609i);
                }
                if (iV == 757935405) {
                    return h(c6609i, iG);
                }
            }
            AbstractC6635w.b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC6723e.a(iV));
            c6609i.b0(iG);
            return null;
        } finally {
            c6609i.b0(iG);
        }
    }

    private static i3.n e(int i10, String str, C6609I c6609i) {
        int iV = c6609i.v();
        if (c6609i.v() == 1684108385 && iV >= 22) {
            c6609i.c0(10);
            int iU = c6609i.U();
            if (iU > 0) {
                String str2 = "" + iU;
                int iU2 = c6609i.U();
                if (iU2 > 0) {
                    str2 = str2 + "/" + iU2;
                }
                return new i3.n(str, null, AbstractC2011u.B(str2));
            }
        }
        AbstractC6635w.i("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC6723e.a(i10));
        return null;
    }

    private static int f(C6609I c6609i) {
        int iV = c6609i.v();
        if (c6609i.v() == 1684108385) {
            c6609i.c0(8);
            int i10 = iV - 16;
            if (i10 == 1) {
                return c6609i.M();
            }
            if (i10 == 2) {
                return c6609i.U();
            }
            if (i10 == 3) {
                return c6609i.P();
            }
            if (i10 == 4 && (c6609i.n() & 128) == 0) {
                return c6609i.Q();
            }
        }
        AbstractC6635w.i("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static i3.i g(int i10, String str, C6609I c6609i, boolean z10, boolean z11) {
        int iF = f(c6609i);
        if (z11) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z10 ? new i3.n(str, null, AbstractC2011u.B(Integer.toString(iF))) : new i3.e("und", str, Integer.toString(iF));
        }
        AbstractC6635w.i("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC6723e.a(i10));
        return null;
    }

    private static i3.i h(C6609I c6609i, int i10) {
        String strH = null;
        String strH2 = null;
        int i11 = -1;
        int i12 = -1;
        while (c6609i.g() < i10) {
            int iG = c6609i.g();
            int iV = c6609i.v();
            int iV2 = c6609i.v();
            c6609i.c0(4);
            if (iV2 == 1835360622) {
                strH = c6609i.H(iV - 12);
            } else if (iV2 == 1851878757) {
                strH2 = c6609i.H(iV - 12);
            } else {
                if (iV2 == 1684108385) {
                    i11 = iG;
                    i12 = iV;
                }
                c6609i.c0(iV - 12);
            }
        }
        if (strH == null || strH2 == null || i11 == -1) {
            return null;
        }
        c6609i.b0(i11);
        c6609i.c0(16);
        return new i3.k(strH, strH2, c6609i.H(i12 - 16));
    }

    public static C6721c i(C6609I c6609i, int i10, String str) {
        while (true) {
            int iG = c6609i.g();
            if (iG >= i10) {
                return null;
            }
            int iV = c6609i.v();
            if (c6609i.v() == 1684108385) {
                int iV2 = c6609i.v();
                int iV3 = c6609i.v();
                int i11 = iV - 16;
                byte[] bArr = new byte[i11];
                c6609i.q(bArr, 0, i11);
                return new C6721c(str, bArr, iV3, iV2);
            }
            c6609i.b0(iG + iV);
        }
    }

    private static i3.n j(C6609I c6609i) {
        String strA = i3.j.a(f(c6609i) - 1);
        if (strA != null) {
            return new i3.n("TCON", null, AbstractC2011u.B(strA));
        }
        AbstractC6635w.i("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static i3.n k(int i10, String str, C6609I c6609i) {
        int iV = c6609i.v();
        if (c6609i.v() == 1684108385) {
            c6609i.c0(8);
            return new i3.n(str, null, AbstractC2011u.B(c6609i.H(iV - 16)));
        }
        AbstractC6635w.i("MetadataUtil", "Failed to parse text attribute: " + AbstractC6723e.a(i10));
        return null;
    }

    public static void l(int i10, B b10, C6109x.b bVar) {
        if (i10 == 1 && b10.a()) {
            bVar.d0(b10.f18880a).e0(b10.f18881b);
        }
    }

    public static void m(int i10, C6078J c6078j, C6109x.b bVar, C6078J c6078j2, C6078J... c6078jArr) {
        if (c6078j2 == null) {
            c6078j2 = new C6078J(new C6078J.a[0]);
        }
        if (c6078j != null) {
            for (int i11 = 0; i11 < c6078j.e(); i11++) {
                C6078J.a aVarD = c6078j.d(i11);
                if (aVarD instanceof C6721c) {
                    C6721c c6721c = (C6721c) aVarD;
                    if (!c6721c.f61221a.equals("com.android.capture.fps")) {
                        c6078j2 = c6078j2.a(c6721c);
                    } else if (i10 == 2) {
                        c6078j2 = c6078j2.a(c6721c);
                    }
                }
            }
        }
        for (C6078J c6078j3 : c6078jArr) {
            c6078j2 = c6078j2.b(c6078j3);
        }
        if (c6078j2.e() > 0) {
            bVar.r0(c6078j2);
        }
    }
}
