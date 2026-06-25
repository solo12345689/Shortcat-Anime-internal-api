package Q2;

import O9.s;
import P9.AbstractC2011u;
import P9.AbstractC2012v;
import Q2.d;
import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import t2.AbstractC6614a;
import t2.AbstractC6616c;
import t2.C6602B;
import t2.InterfaceC6623j;
import t2.a0;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d, InterfaceC6932F {

    /* JADX INFO: renamed from: r */
    public static final AbstractC2011u f14285r = AbstractC2011u.G(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: s */
    public static final AbstractC2011u f14286s = AbstractC2011u.G(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: t */
    public static final AbstractC2011u f14287t = AbstractC2011u.G(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: u */
    public static final AbstractC2011u f14288u = AbstractC2011u.G(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: v */
    public static final AbstractC2011u f14289v = AbstractC2011u.G(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: w */
    public static final AbstractC2011u f14290w = AbstractC2011u.G(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: x */
    private static i f14291x;

    /* JADX INFO: renamed from: a */
    private final Context f14292a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2012v f14293b;

    /* JADX INFO: renamed from: c */
    private final d.a.C0241a f14294c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6623j f14295d;

    /* JADX INFO: renamed from: e */
    private final boolean f14296e;

    /* JADX INFO: renamed from: f */
    private final r f14297f;

    /* JADX INFO: renamed from: g */
    private int f14298g;

    /* JADX INFO: renamed from: h */
    private long f14299h;

    /* JADX INFO: renamed from: i */
    private long f14300i;

    /* JADX INFO: renamed from: j */
    private long f14301j;

    /* JADX INFO: renamed from: k */
    private long f14302k;

    /* JADX INFO: renamed from: l */
    private long f14303l;

    /* JADX INFO: renamed from: m */
    private long f14304m;

    /* JADX INFO: renamed from: n */
    private int f14305n;

    /* JADX INFO: renamed from: o */
    private boolean f14306o;

    /* JADX INFO: renamed from: p */
    private int f14307p;

    /* JADX INFO: renamed from: q */
    private String f14308q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final Context f14309a;

        /* JADX INFO: renamed from: b */
        private final Map f14310b;

        /* JADX INFO: renamed from: c */
        private int f14311c;

        /* JADX INFO: renamed from: d */
        private InterfaceC6623j f14312d;

        /* JADX INFO: renamed from: e */
        private boolean f14313e;

        public b(Context context) {
            this.f14309a = context == null ? null : context.getApplicationContext();
            this.f14311c = 2000;
            this.f14312d = InterfaceC6623j.f60596a;
            this.f14313e = true;
            HashMap map = new HashMap(8);
            this.f14310b = map;
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }

        public i a() {
            return new i(this.f14309a, this.f14310b, this.f14311c, this.f14312d, this.f14313e);
        }
    }

    /* synthetic */ i(Context context, Map map, int i10, InterfaceC6623j interfaceC6623j, boolean z10, a aVar) {
        this(context, map, i10, interfaceC6623j, z10);
    }

    private static int[] k(String str) {
        str.getClass();
        switch (str) {
            case "AD":
            case "AI":
            case "BB":
            case "BQ":
            case "CW":
            case "DM":
            case "KN":
            case "KY":
            case "SX":
            case "VC":
                return new int[]{1, 2, 0, 0, 2, 2};
            case "AE":
                return new int[]{1, 4, 2, 3, 4, 1};
            case "AF":
            case "SZ":
                return new int[]{4, 4, 3, 4, 2, 2};
            case "AG":
            case "CI":
                return new int[]{2, 4, 3, 4, 2, 2};
            case "AL":
                return new int[]{1, 1, 1, 2, 2, 2};
            case "AM":
            case "PA":
                return new int[]{2, 3, 2, 3, 2, 2};
            case "AO":
                return new int[]{3, 4, 4, 3, 2, 2};
            case "AQ":
            case "ER":
            case "NU":
            case "SC":
            case "SH":
                return new int[]{4, 2, 2, 2, 2, 2};
            case "AR":
                return new int[]{2, 2, 2, 2, 1, 2};
            case "AS":
                return new int[]{2, 2, 3, 3, 2, 2};
            case "AT":
            case "EE":
            case "HU":
            case "IS":
            case "LV":
            case "MT":
            case "SE":
                return new int[]{0, 0, 0, 0, 0, 2};
            case "AU":
                return new int[]{0, 3, 1, 1, 3, 0};
            case "AW":
                return new int[]{2, 2, 3, 4, 2, 2};
            case "AX":
            case "CX":
            case "LI":
            case "MS":
            case "PM":
            case "SM":
            case "VA":
                return new int[]{0, 2, 2, 2, 2, 2};
            case "AZ":
            case "DJ":
            case "LY":
            case "SL":
                return new int[]{4, 2, 3, 3, 2, 2};
            case "BA":
            case "JO":
            case "TR":
                return new int[]{1, 1, 1, 1, 2, 2};
            case "BD":
                return new int[]{2, 1, 3, 2, 4, 2};
            case "BE":
                return new int[]{0, 0, 1, 0, 1, 2};
            case "BF":
            case "SD":
            case "SY":
            case "TD":
                return new int[]{4, 3, 4, 4, 2, 2};
            case "BG":
            case "PT":
            case "SI":
                return new int[]{0, 0, 0, 0, 1, 2};
            case "BH":
                return new int[]{1, 3, 1, 3, 4, 2};
            case "BI":
            case "GQ":
            case "HT":
            case "NE":
            case "VE":
            case "YE":
                return new int[]{4, 4, 4, 4, 2, 2};
            case "BJ":
                return new int[]{4, 4, 2, 3, 2, 2};
            case "BL":
            case "MP":
            case "PY":
                return new int[]{1, 2, 2, 2, 2, 2};
            case "BM":
                return new int[]{0, 2, 0, 0, 2, 2};
            case "BN":
                return new int[]{3, 2, 0, 0, 2, 2};
            case "BO":
                return new int[]{1, 2, 4, 4, 2, 2};
            case "BR":
                return new int[]{1, 1, 1, 1, 2, 4};
            case "BS":
                return new int[]{3, 2, 1, 1, 2, 2};
            case "BT":
                return new int[]{3, 1, 2, 2, 3, 2};
            case "BW":
                return new int[]{3, 2, 1, 0, 2, 2};
            case "BY":
                return new int[]{1, 2, 3, 3, 2, 2};
            case "BZ":
            case "CK":
                return new int[]{2, 2, 2, 1, 2, 2};
            case "CA":
            case "UA":
                return new int[]{0, 2, 1, 2, 3, 3};
            case "CD":
            case "ML":
                return new int[]{3, 3, 2, 2, 2, 2};
            case "CF":
                return new int[]{4, 2, 4, 2, 2, 2};
            case "CG":
            case "EG":
            case "MG":
                return new int[]{3, 4, 3, 3, 2, 2};
            case "CH":
                return new int[]{0, 1, 0, 0, 0, 2};
            case "CL":
            case "TH":
                return new int[]{0, 1, 2, 2, 2, 2};
            case "CM":
            case "MR":
                return new int[]{4, 3, 3, 4, 2, 2};
            case "CN":
                return new int[]{2, 0, 1, 1, 3, 1};
            case "CO":
                return new int[]{2, 3, 3, 2, 2, 2};
            case "CR":
            case "NI":
                return new int[]{2, 4, 4, 4, 2, 2};
            case "CU":
            case "KI":
            case "NR":
            case "TL":
                return new int[]{4, 2, 4, 4, 2, 2};
            case "CV":
                return new int[]{2, 3, 0, 1, 2, 2};
            case "CY":
                return new int[]{1, 0, 1, 0, 0, 2};
            case "CZ":
                return new int[]{0, 0, 2, 0, 1, 2};
            case "DE":
                return new int[]{0, 1, 4, 2, 2, 1};
            case "DK":
                return new int[]{0, 0, 2, 0, 0, 2};
            case "DO":
            case "LR":
                return new int[]{3, 4, 4, 4, 2, 2};
            case "DZ":
            case "TJ":
                return new int[]{3, 3, 4, 4, 2, 2};
            case "EC":
                return new int[]{1, 3, 2, 1, 2, 2};
            case "ES":
                return new int[]{0, 0, 0, 0, 1, 0};
            case "ET":
                return new int[]{4, 3, 4, 4, 4, 2};
            case "FI":
                return new int[]{0, 0, 0, 1, 0, 2};
            case "FJ":
                return new int[]{3, 2, 2, 3, 2, 2};
            case "FK":
            case "NF":
            case "SJ":
                return new int[]{3, 2, 2, 2, 2, 2};
            case "FM":
                return new int[]{4, 2, 4, 0, 2, 2};
            case "FO":
                return new int[]{0, 2, 2, 0, 2, 2};
            case "FR":
                return new int[]{1, 1, 1, 1, 0, 2};
            case "GA":
                return new int[]{3, 4, 0, 0, 2, 2};
            case "GB":
                return new int[]{1, 1, 3, 2, 2, 2};
            case "GD":
                return new int[]{2, 2, 0, 0, 2, 2};
            case "GE":
                return new int[]{1, 1, 0, 2, 2, 2};
            case "GF":
                return new int[]{3, 2, 3, 3, 2, 2};
            case "GG":
                return new int[]{0, 2, 1, 1, 2, 2};
            case "GH":
                return new int[]{3, 3, 3, 2, 2, 2};
            case "GI":
            case "IM":
            case "JE":
                return new int[]{0, 2, 0, 1, 2, 2};
            case "GL":
            case "MC":
                return new int[]{1, 2, 2, 0, 2, 2};
            case "GM":
            case "SS":
                return new int[]{4, 3, 2, 4, 2, 2};
            case "GN":
                return new int[]{3, 4, 4, 2, 2, 2};
            case "GP":
                return new int[]{2, 1, 1, 3, 2, 2};
            case "GR":
                return new int[]{1, 0, 0, 0, 1, 2};
            case "GT":
                return new int[]{2, 1, 2, 1, 2, 2};
            case "GU":
                return new int[]{2, 2, 4, 3, 3, 2};
            case "GW":
                return new int[]{4, 4, 1, 2, 2, 2};
            case "GY":
                return new int[]{3, 1, 1, 3, 2, 2};
            case "HK":
                return new int[]{0, 1, 0, 1, 1, 0};
            case "HR":
            case "KW":
                return new int[]{1, 0, 0, 0, 0, 2};
            case "ID":
                return new int[]{3, 1, 3, 3, 2, 4};
            case "IE":
                return new int[]{1, 1, 1, 1, 1, 2};
            case "IL":
                return new int[]{1, 2, 2, 3, 4, 2};
            case "IN":
                return new int[]{1, 1, 3, 2, 2, 3};
            case "IO":
                return new int[]{3, 2, 2, 0, 2, 2};
            case "IQ":
                return new int[]{3, 2, 3, 2, 2, 2};
            case "IR":
                return new int[]{4, 2, 3, 3, 4, 3};
            case "IT":
                return new int[]{0, 1, 1, 2, 1, 2};
            case "JM":
                return new int[]{2, 4, 3, 1, 2, 2};
            case "JP":
                return new int[]{0, 3, 2, 3, 4, 2};
            case "KE":
                return new int[]{3, 2, 1, 1, 1, 2};
            case "KG":
                return new int[]{2, 1, 1, 2, 2, 2};
            case "KH":
                return new int[]{1, 0, 4, 2, 2, 2};
            case "KM":
            case "VU":
                return new int[]{4, 3, 3, 2, 2, 2};
            case "KR":
                return new int[]{0, 2, 2, 4, 4, 4};
            case "KZ":
                return new int[]{2, 1, 2, 2, 3, 2};
            case "LA":
                return new int[]{1, 2, 1, 3, 2, 2};
            case "LB":
                return new int[]{3, 1, 1, 2, 2, 2};
            case "LC":
                return new int[]{2, 2, 1, 1, 2, 2};
            case "LK":
            case "MM":
                return new int[]{3, 2, 3, 3, 4, 2};
            case "LS":
            case "PG":
                return new int[]{4, 3, 3, 3, 2, 2};
            case "LT":
                return new int[]{0, 1, 0, 1, 0, 2};
            case "LU":
                return new int[]{4, 0, 3, 2, 1, 3};
            case "MA":
                return new int[]{3, 3, 1, 1, 2, 2};
            case "MD":
                return new int[]{1, 0, 0, 0, 2, 2};
            case "ME":
                return new int[]{2, 0, 0, 1, 3, 2};
            case "MF":
                return new int[]{1, 2, 2, 3, 2, 2};
            case "MH":
            case "TM":
            case "TV":
            case "WF":
                return new int[]{4, 2, 2, 4, 2, 2};
            case "MK":
                return new int[]{1, 0, 0, 1, 3, 2};
            case "MN":
                return new int[]{2, 0, 2, 2, 2, 2};
            case "MO":
                return new int[]{0, 2, 4, 4, 3, 1};
            case "MQ":
                return new int[]{2, 1, 2, 3, 2, 2};
            case "MU":
                return new int[]{3, 1, 0, 2, 2, 2};
            case "MV":
                return new int[]{3, 2, 1, 3, 4, 2};
            case "MW":
                return new int[]{3, 2, 2, 1, 2, 2};
            case "MX":
                return new int[]{2, 4, 4, 4, 3, 2};
            case "MY":
                return new int[]{1, 0, 4, 1, 1, 0};
            case "MZ":
            case "WS":
                return new int[]{3, 1, 2, 2, 2, 2};
            case "NA":
                return new int[]{3, 4, 3, 2, 2, 2};
            case "NC":
            case "YT":
                return new int[]{2, 3, 3, 4, 2, 2};
            case "NG":
                return new int[]{3, 4, 2, 1, 2, 2};
            case "NL":
                return new int[]{2, 1, 4, 3, 0, 4};
            case "NO":
                return new int[]{0, 0, 3, 0, 0, 2};
            case "NP":
                return new int[]{2, 2, 4, 3, 2, 2};
            case "NZ":
                return new int[]{0, 0, 1, 2, 4, 2};
            case "OM":
                return new int[]{2, 3, 1, 2, 4, 2};
            case "PE":
                return new int[]{1, 2, 4, 4, 3, 2};
            case "PF":
                return new int[]{2, 2, 3, 1, 2, 2};
            case "PH":
                return new int[]{2, 1, 2, 3, 2, 1};
            case "PK":
                return new int[]{3, 3, 3, 3, 2, 2};
            case "PL":
                return new int[]{1, 0, 2, 2, 4, 4};
            case "PR":
                return new int[]{2, 0, 2, 1, 2, 0};
            case "PS":
                return new int[]{3, 4, 1, 3, 2, 2};
            case "PW":
                return new int[]{2, 2, 4, 1, 2, 2};
            case "QA":
                return new int[]{1, 4, 4, 4, 4, 2};
            case "RE":
                return new int[]{0, 3, 2, 3, 1, 2};
            case "RO":
                return new int[]{0, 0, 1, 1, 3, 2};
            case "RS":
                return new int[]{1, 0, 0, 1, 2, 2};
            case "RU":
                return new int[]{1, 0, 0, 1, 3, 3};
            case "RW":
                return new int[]{3, 3, 2, 0, 2, 2};
            case "SA":
                return new int[]{3, 1, 1, 2, 2, 0};
            case "SB":
            case "ZW":
                return new int[]{4, 2, 4, 3, 2, 2};
            case "SG":
                return new int[]{2, 3, 3, 3, 1, 1};
            case "SK":
                return new int[]{0, 1, 1, 1, 2, 2};
            case "SN":
                return new int[]{4, 4, 3, 2, 2, 2};
            case "SO":
                return new int[]{2, 2, 3, 4, 4, 2};
            case "SR":
                return new int[]{2, 4, 4, 1, 2, 2};
            case "ST":
                return new int[]{2, 2, 1, 2, 2, 2};
            case "SV":
                return new int[]{2, 3, 2, 1, 2, 2};
            case "TC":
                return new int[]{3, 2, 1, 2, 2, 2};
            case "TG":
                return new int[]{3, 4, 1, 0, 2, 2};
            case "TN":
                return new int[]{3, 1, 1, 1, 2, 2};
            case "TO":
                return new int[]{3, 2, 4, 3, 2, 2};
            case "TT":
                return new int[]{2, 4, 1, 0, 2, 2};
            case "TW":
                return new int[]{0, 0, 0, 0, 0, 0};
            case "TZ":
                return new int[]{3, 4, 2, 1, 3, 2};
            case "UG":
                return new int[]{3, 3, 2, 3, 4, 2};
            case "US":
                return new int[]{2, 2, 4, 1, 3, 1};
            case "UY":
                return new int[]{2, 1, 1, 2, 1, 2};
            case "UZ":
                return new int[]{1, 2, 3, 4, 3, 2};
            case "VG":
                return new int[]{2, 2, 1, 1, 2, 4};
            case "VI":
                return new int[]{0, 2, 1, 2, 2, 2};
            case "VN":
                return new int[]{0, 0, 1, 2, 2, 2};
            case "XK":
                return new int[]{1, 2, 1, 1, 2, 2};
            case "ZA":
                return new int[]{2, 4, 2, 1, 1, 2};
            case "ZM":
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long l(int i10) {
        Long lValueOf = (Long) this.f14293b.get(Integer.valueOf(i10));
        if (lValueOf == null) {
            lValueOf = (Long) this.f14293b.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            lValueOf = Long.valueOf(m(this.f14308q, i10));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    private static long m(String str, int i10) {
        int[] iArrK = k(s.d(str));
        if (i10 != 2) {
            if (i10 == 3) {
                return ((Long) f14286s.get(iArrK[1])).longValue();
            }
            if (i10 == 4) {
                return ((Long) f14287t.get(iArrK[2])).longValue();
            }
            if (i10 == 5) {
                return ((Long) f14288u.get(iArrK[3])).longValue();
            }
            if (i10 != 7) {
                if (i10 == 9) {
                    return ((Long) f14290w.get(iArrK[5])).longValue();
                }
                if (i10 != 10) {
                    return 1000000L;
                }
                return ((Long) f14289v.get(iArrK[4])).longValue();
            }
        }
        return ((Long) f14285r.get(iArrK[0])).longValue();
    }

    public static synchronized i n(Context context) {
        try {
            if (f14291x == null) {
                f14291x = new b(context).a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f14291x;
    }

    private static boolean o(w2.o oVar, boolean z10) {
        return z10 && !oVar.d(8);
    }

    private void p(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f14304m) {
            return;
        }
        this.f14304m = j11;
        this.f14294c.c(i10, j10, j11);
    }

    public synchronized void q(int i10) throws Throwable {
        Throwable th2;
        try {
            try {
                int i11 = this.f14305n;
                if (i11 != 0) {
                    try {
                        if (!this.f14296e) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                if (this.f14306o) {
                    i10 = this.f14307p;
                }
                if (i11 != i10 || this.f14308q == null) {
                    this.f14305n = i10;
                    if (i10 == 1 || i10 == 0 || i10 == 8) {
                        return;
                    }
                    if (this.f14308q == null) {
                        this.f14308q = a0.W(this.f14292a);
                    }
                    this.f14303l = l(i10);
                    long jC = this.f14295d.c();
                    p(this.f14298g > 0 ? (int) (jC - this.f14299h) : 0, this.f14300i, this.f14303l);
                    this.f14299h = jC;
                    this.f14300i = 0L;
                    this.f14302k = 0L;
                    this.f14301j = 0L;
                    this.f14297f.g();
                    return;
                }
                return;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    @Override // w2.InterfaceC6932F
    public synchronized void b(InterfaceC6940g interfaceC6940g, w2.o oVar, boolean z10, int i10) {
        if (o(oVar, z10)) {
            this.f14300i += (long) i10;
        }
    }

    @Override // Q2.d
    public synchronized long d() {
        return this.f14303l;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:44:0x0001, B:48:0x0009, B:52:0x0011, B:54:0x002e, B:64:0x0060, B:63:0x0055), top: B:79:0x0001 }] */
    @Override // w2.InterfaceC6932F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void e(w2.InterfaceC6940g r11, w2.o r12, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = o(r12, r13)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.f14298g     // Catch: java.lang.Throwable -> L72
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = r12
            goto L11
        L10:
            r11 = 0
        L11:
            t2.AbstractC6614a.g(r11)     // Catch: java.lang.Throwable -> L72
            t2.j r11 = r10.f14295d     // Catch: java.lang.Throwable -> L72
            long r0 = r11.c()     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f14299h     // Catch: java.lang.Throwable -> L72
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f14301j     // Catch: java.lang.Throwable -> L72
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.f14301j = r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f14302k     // Catch: java.lang.Throwable -> L72
            long r6 = r10.f14300i     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.f14302k = r2     // Catch: java.lang.Throwable -> L72
            if (r5 <= 0) goto L75
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L72
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L72
            float r11 = r11 / r13
            Q2.r r13 = r10.f14297f     // Catch: java.lang.Throwable -> L72
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L72
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L72
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L72
            r13.c(r2, r11)     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f14301j     // Catch: java.lang.Throwable -> L72
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L55
            long r2 = r10.f14302k     // Catch: java.lang.Throwable -> L51
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L60
            goto L55
        L51:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7d
        L55:
            Q2.r r11 = r10.f14297f     // Catch: java.lang.Throwable -> L72
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.f(r13)     // Catch: java.lang.Throwable -> L72
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L72
            r10.f14303l = r2     // Catch: java.lang.Throwable -> L72
        L60:
            long r6 = r10.f14300i     // Catch: java.lang.Throwable -> L72
            long r8 = r10.f14303l     // Catch: java.lang.Throwable -> L72
            r4 = r10
            r4.p(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f
            r4.f14299h = r0     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            r4.f14300i = r0     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
        L70:
            r11 = r0
            goto L7d
        L72:
            r0 = move-exception
            r4 = r10
            goto L70
        L75:
            r4 = r10
        L76:
            int r11 = r4.f14298g     // Catch: java.lang.Throwable -> L6f
            int r11 = r11 - r12
            r4.f14298g = r11     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r10)
            return
        L7d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.i.e(w2.g, w2.o, boolean):void");
    }

    @Override // Q2.d
    public void f(d.a aVar) {
        this.f14294c.d(aVar);
    }

    @Override // w2.InterfaceC6932F
    public synchronized void h(InterfaceC6940g interfaceC6940g, w2.o oVar, boolean z10) {
        try {
            if (o(oVar, z10)) {
                if (this.f14298g == 0) {
                    this.f14299h = this.f14295d.c();
                }
                this.f14298g++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Q2.d
    public void i(Handler handler, d.a aVar) {
        AbstractC6614a.e(handler);
        AbstractC6614a.e(aVar);
        this.f14294c.b(handler, aVar);
    }

    private i(Context context, Map map, int i10, InterfaceC6623j interfaceC6623j, boolean z10) {
        this.f14292a = context == null ? null : context.getApplicationContext();
        this.f14293b = AbstractC2012v.d(map);
        this.f14294c = new d.a.C0241a();
        this.f14297f = new r(i10);
        this.f14295d = interfaceC6623j;
        this.f14296e = z10;
        if (context == null) {
            this.f14305n = 0;
            this.f14303l = 1000000L;
            return;
        }
        C6602B c6602bE = C6602B.e(context);
        int iG = c6602bE.g();
        this.f14305n = iG;
        this.f14303l = l(iG);
        c6602bE.k(new C6602B.c() { // from class: Q2.h
            @Override // t2.C6602B.c
            public final void a(int i11) throws Throwable {
                this.f14284a.q(i11);
            }
        }, AbstractC6616c.a());
    }

    @Override // Q2.d
    public InterfaceC6932F c() {
        return this;
    }

    @Override // w2.InterfaceC6932F
    public void g(InterfaceC6940g interfaceC6940g, w2.o oVar, boolean z10) {
    }
}
