package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import S8.b;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C3418b;
import com.google.android.gms.internal.measurement.C3431c3;
import com.google.android.gms.internal.measurement.C3440d3;
import com.google.android.gms.internal.measurement.C3449e3;
import com.google.android.gms.internal.measurement.C3494j3;
import com.google.android.gms.internal.measurement.C3498j7;
import com.google.android.gms.internal.measurement.C3512l3;
import com.google.android.gms.internal.measurement.C3583t3;
import com.google.android.gms.internal.measurement.C3592u3;
import com.google.android.gms.internal.measurement.C3601v3;
import com.google.android.gms.internal.measurement.w7;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class u6 extends AbstractC3777b6 {
    u6(q6 q6Var) {
        super(q6Var);
    }

    private static final String A(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final Object B(com.google.android.gms.internal.measurement.W2 w22) {
        if (w22.E()) {
            return w22.F();
        }
        if (w22.G()) {
            return Long.valueOf(w22.H());
        }
        if (w22.K()) {
            return Double.valueOf(w22.L());
        }
        if (w22.N() > 0) {
            return Y(w22.M());
        }
        return null;
    }

    private static final void C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f34694a);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z(builder, str3, string, set);
            }
        }
    }

    private static final void D(StringBuilder sb2, int i10, String str, C3494j3 c3494j3) {
        if (c3494j3 == null) {
            return;
        }
        y(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c3494j3.F() != 0) {
            y(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : c3494j3.E()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (c3494j3.D() != 0) {
            y(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : c3494j3.C()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (c3494j3.H() != 0) {
            y(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.Q2 q22 : c3494j3.G()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(q22.C() ? Integer.valueOf(q22.D()) : null);
                sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                sb2.append(q22.E() ? Long.valueOf(q22.F()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (c3494j3.J() != 0) {
            y(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (C3512l3 c3512l3 : c3494j3.I()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c3512l3.C() ? Integer.valueOf(c3512l3.D()) : null);
                sb2.append(": [");
                Iterator it = c3512l3.E().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        y(sb2, 3);
        sb2.append("}\n");
    }

    private static final void E(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void F(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.J1 j12) {
        if (j12 == null) {
            return;
        }
        y(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (j12.C()) {
            int iN = j12.N();
            E(sb2, i10, "comparison_type", iN != 1 ? iN != 2 ? iN != 3 ? iN != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (j12.D()) {
            E(sb2, i10, "match_as_float", Boolean.valueOf(j12.E()));
        }
        if (j12.F()) {
            E(sb2, i10, "comparison_value", j12.G());
        }
        if (j12.H()) {
            E(sb2, i10, "min_comparison_value", j12.I());
        }
        if (j12.J()) {
            E(sb2, i10, "max_comparison_value", j12.K());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }

    static boolean O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean P(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    static List Q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    static com.google.android.gms.internal.measurement.D5 W(com.google.android.gms.internal.measurement.D5 d52, byte[] bArr) {
        com.google.android.gms.internal.measurement.R4 r4A = com.google.android.gms.internal.measurement.R4.a();
        return r4A != null ? d52.A1(bArr, r4A) : d52.B0(bArr);
    }

    static int X(C3440d3 c3440d3, String str) {
        for (int i10 = 0; i10 < c3440d3.Y0(); i10++) {
            if (str.equals(c3440d3.Z0(i10).E())) {
                return i10;
            }
        }
        return -1;
    }

    static Bundle[] Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.W2 w22 = (com.google.android.gms.internal.measurement.W2) it.next();
            if (w22 != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.W2 w23 : w22.M()) {
                    if (w23.E()) {
                        bundle.putString(w23.D(), w23.F());
                    } else if (w23.G()) {
                        bundle.putLong(w23.D(), w23.H());
                    } else if (w23.K()) {
                        bundle.putDouble(w23.D(), w23.L());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static final void o(com.google.android.gms.internal.measurement.R2 r22, String str, Object obj) {
        List listT = r22.t();
        int i10 = 0;
        while (true) {
            if (i10 >= listT.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.W2) listT.get(i10)).D())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.V2 v2O = com.google.android.gms.internal.measurement.W2.O();
        v2O.u(str);
        v2O.A(((Long) obj).longValue());
        if (i10 >= 0) {
            r22.y(i10, v2O);
        } else {
            r22.B(v2O);
        }
    }

    static final boolean p(G g10, B6 b62) {
        AbstractC2115p.l(g10);
        AbstractC2115p.l(b62);
        return !TextUtils.isEmpty(b62.f40647b);
    }

    static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.W2 w22 = (com.google.android.gms.internal.measurement.W2) it.next();
            String strD = w22.D();
            if (w22.K()) {
                bundle.putDouble(strD, w22.L());
            } else if (w22.I()) {
                bundle.putFloat(strD, w22.J());
            } else if (w22.E()) {
                bundle.putString(strD, w22.F());
            } else if (w22.G()) {
                bundle.putLong(strD, w22.H());
            }
        }
        return bundle;
    }

    static final com.google.android.gms.internal.measurement.W2 r(com.google.android.gms.internal.measurement.S2 s22, String str) {
        for (com.google.android.gms.internal.measurement.W2 w22 : s22.C()) {
            if (w22.D().equals(str)) {
                return w22;
            }
        }
        return null;
    }

    static final Map s(com.google.android.gms.internal.measurement.S2 s22, String... strArr) {
        Object objB;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.W2 w22 : s22.C()) {
            if (Arrays.asList(strArr).contains(w22.D()) && (objB = B(w22)) != null) {
                map.put(w22.D(), objB);
            }
        }
        return map;
    }

    static final Map t(com.google.android.gms.internal.measurement.S2 s22, String str) {
        Object objB;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.W2 w22 : s22.C()) {
            if (w22.D().startsWith("gad_") && (objB = B(w22)) != null) {
                map.put(w22.D(), objB);
            }
        }
        return map;
    }

    static final Object u(com.google.android.gms.internal.measurement.S2 s22, String str) {
        com.google.android.gms.internal.measurement.W2 w2R = r(s22, str);
        if (w2R == null) {
            return null;
        }
        return B(w2R);
    }

    static final Object v(com.google.android.gms.internal.measurement.S2 s22, String str, Object obj) {
        Object objU = u(s22, str);
        return objU == null ? obj : objU;
    }

    private final void w(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.W2 w22 = (com.google.android.gms.internal.measurement.W2) it.next();
            if (w22 != null) {
                y(sb2, i11);
                sb2.append("param {\n");
                E(sb2, i11, "name", w22.C() ? this.f40611a.D().b(w22.D()) : null);
                E(sb2, i11, "string_value", w22.E() ? w22.F() : null);
                E(sb2, i11, "int_value", w22.G() ? Long.valueOf(w22.H()) : null);
                E(sb2, i11, "double_value", w22.K() ? Double.valueOf(w22.L()) : null);
                if (w22.N() > 0) {
                    w(sb2, i11, w22.M());
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void x(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.F1 f12) {
        String str;
        if (f12 == null) {
            return;
        }
        y(sb2, i10);
        sb2.append("filter {\n");
        if (f12.G()) {
            E(sb2, i10, "complement", Boolean.valueOf(f12.H()));
        }
        if (f12.I()) {
            E(sb2, i10, "param_name", this.f40611a.D().b(f12.J()));
        }
        if (f12.C()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.P1 p1D = f12.D();
            if (p1D != null) {
                y(sb2, i11);
                sb2.append("string_filter {\n");
                if (p1D.C()) {
                    switch (p1D.L()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    E(sb2, i11, "match_type", str);
                }
                if (p1D.D()) {
                    E(sb2, i11, "expression", p1D.E());
                }
                if (p1D.F()) {
                    E(sb2, i11, "case_sensitive", Boolean.valueOf(p1D.G()));
                }
                if (p1D.I() > 0) {
                    y(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : p1D.H()) {
                        y(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (f12.E()) {
            F(sb2, i10 + 1, "number_filter", f12.F());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }

    private static final void y(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final void z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    final void G(C3592u3 c3592u3, Object obj) {
        AbstractC2115p.l(obj);
        c3592u3.x();
        c3592u3.A();
        c3592u3.C();
        if (obj instanceof String) {
            c3592u3.v((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c3592u3.y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c3592u3.B(((Double) obj).doubleValue());
        } else {
            this.f40611a.a().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final void H(com.google.android.gms.internal.measurement.V2 v22, Object obj) {
        AbstractC2115p.l(obj);
        v22.y();
        v22.B();
        v22.D();
        v22.H();
        if (obj instanceof String) {
            v22.x((String) obj);
            return;
        }
        if (obj instanceof Long) {
            v22.A(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            v22.C(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f40611a.a().o().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.V2 v2O = com.google.android.gms.internal.measurement.W2.O();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.V2 v2O2 = com.google.android.gms.internal.measurement.W2.O();
                    v2O2.u(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        v2O2.A(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        v2O2.x((String) obj2);
                    } else if (obj2 instanceof Double) {
                        v2O2.C(((Double) obj2).doubleValue());
                    }
                    v2O.F(v2O2);
                }
                if (v2O.E() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.W2) v2O.q());
                }
            }
        }
        v22.G(arrayList);
    }

    final S5 I(String str, C3440d3 c3440d3, com.google.android.gms.internal.measurement.R2 r22, String str2) {
        int iIndexOf;
        C3498j7.a();
        X2 x22 = this.f40611a;
        if (!x22.w().H(str, AbstractC3789d2.f41174Q0)) {
            return null;
        }
        long jA = x22.e().a();
        Set setA = j9.L.a(x22.w().C(str, AbstractC3789d2.f41248v0).split(com.amazon.a.a.o.b.f.f34694a));
        q6 q6Var = this.f41010b;
        C3793d6 c3793d6C0 = q6Var.C0();
        String strX = c3793d6C0.f41010b.D0().x(str);
        Uri.Builder builder = new Uri.Builder();
        X2 x23 = c3793d6C0.f40611a;
        builder.scheme(x23.w().C(str, AbstractC3789d2.f41234o0));
        if (TextUtils.isEmpty(strX)) {
            builder.authority(x23.w().C(str, AbstractC3789d2.f41236p0));
        } else {
            String strC = x23.w().C(str, AbstractC3789d2.f41236p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(strC).length());
            sb2.append(strX);
            sb2.append(".");
            sb2.append(strC);
            builder.authority(sb2.toString());
        }
        builder.path(x23.w().C(str, AbstractC3789d2.f41238q0));
        z(builder, "gmp_app_id", c3440d3.p0(), setA);
        x22.w().A();
        z(builder, "gmp_version", String.valueOf(133005L), setA);
        String strQ = c3440d3.Q();
        C3856m c3856mW = x22.w();
        C3781c2 c3781c2 = AbstractC3789d2.f41180T0;
        if (c3856mW.H(str, c3781c2) && q6Var.D0().N(str)) {
            strQ = "";
        }
        z(builder, "app_instance_id", strQ, setA);
        z(builder, "rdid", c3440d3.K(), setA);
        z(builder, "bundle_id", c3440d3.F(), setA);
        String strF = r22.F();
        String strA = j9.w.a(strF);
        if (true != TextUtils.isEmpty(strA)) {
            strF = strA;
        }
        z(builder, "app_event_name", strF, setA);
        z(builder, "app_version", String.valueOf(c3440d3.v0()), setA);
        String strX2 = c3440d3.x();
        if (x22.w().H(str, c3781c2) && q6Var.D0().K(str) && !TextUtils.isEmpty(strX2) && (iIndexOf = strX2.indexOf(".")) != -1) {
            strX2 = strX2.substring(0, iIndexOf);
        }
        z(builder, "os_version", strX2, setA);
        z(builder, DiagnosticsEntry.TIMESTAMP_KEY, String.valueOf(r22.I()), setA);
        if (c3440d3.N()) {
            z(builder, "lat", "1", setA);
        }
        z(builder, "privacy_sandbox_version", String.valueOf(c3440d3.c0()), setA);
        z(builder, "trigger_uri_source", "1", setA);
        z(builder, "trigger_uri_timestamp", String.valueOf(jA), setA);
        z(builder, "request_uuid", str2, setA);
        List<com.google.android.gms.internal.measurement.W2> listT = r22.t();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.W2 w22 : listT) {
            String strD = w22.D();
            if (w22.K()) {
                bundle.putString(strD, String.valueOf(w22.L()));
            } else if (w22.I()) {
                bundle.putString(strD, String.valueOf(w22.J()));
            } else if (w22.E()) {
                bundle.putString(strD, w22.F());
            } else if (w22.G()) {
                bundle.putString(strD, String.valueOf(w22.H()));
            }
        }
        C(builder, x22.w().C(str, AbstractC3789d2.f41246u0).split("\\|"), bundle, setA);
        List<C3601v3> listX0 = c3440d3.X0();
        Bundle bundle2 = new Bundle();
        for (C3601v3 c3601v3 : listX0) {
            String strE = c3601v3.E();
            if (c3601v3.L()) {
                bundle2.putString(strE, String.valueOf(c3601v3.M()));
            } else if (c3601v3.J()) {
                bundle2.putString(strE, String.valueOf(c3601v3.K()));
            } else if (c3601v3.F()) {
                bundle2.putString(strE, c3601v3.G());
            } else if (c3601v3.H()) {
                bundle2.putString(strE, String.valueOf(c3601v3.I()));
            }
        }
        C(builder, x22.w().C(str, AbstractC3789d2.f41244t0).split("\\|"), bundle2, setA);
        z(builder, "dma", true != c3440d3.Y() ? "0" : "1", setA);
        if (!c3440d3.a0().isEmpty()) {
            z(builder, "dma_cps", c3440d3.a0(), setA);
        }
        if (c3440d3.g0()) {
            com.google.android.gms.internal.measurement.A2 a2H0 = c3440d3.h0();
            if (!a2H0.N().isEmpty()) {
                z(builder, "dl_gclid", a2H0.N(), setA);
            }
            if (!a2H0.P().isEmpty()) {
                z(builder, "dl_gbraid", a2H0.P(), setA);
            }
            if (!a2H0.R().isEmpty()) {
                z(builder, "dl_gs", a2H0.R(), setA);
            }
            if (a2H0.T() > 0) {
                z(builder, "dl_ss_ts", String.valueOf(a2H0.T()), setA);
            }
            if (!a2H0.V().isEmpty()) {
                z(builder, "mr_gclid", a2H0.V(), setA);
            }
            if (!a2H0.X().isEmpty()) {
                z(builder, "mr_gbraid", a2H0.X(), setA);
            }
            if (!a2H0.Z().isEmpty()) {
                z(builder, "mr_gs", a2H0.Z(), setA);
            }
            if (a2H0.b0() > 0) {
                z(builder, "mr_click_ts", String.valueOf(a2H0.b0()), setA);
            }
        }
        return new S5(builder.build().toString(), jA, 1);
    }

    final com.google.android.gms.internal.measurement.S2 J(B b10) {
        com.google.android.gms.internal.measurement.R2 r2M = com.google.android.gms.internal.measurement.S2.M();
        r2M.L(b10.f40629e);
        E e10 = b10.f40630f;
        D d10 = new D(e10);
        while (d10.hasNext()) {
            String next = d10.next();
            com.google.android.gms.internal.measurement.V2 v2O = com.google.android.gms.internal.measurement.W2.O();
            v2O.u(next);
            Object objC = e10.c(next);
            AbstractC2115p.l(objC);
            H(v2O, objC);
            r2M.B(v2O);
        }
        String str = b10.f40627c;
        if (!TextUtils.isEmpty(str) && e10.c("_o") == null) {
            com.google.android.gms.internal.measurement.V2 v2O2 = com.google.android.gms.internal.measurement.W2.O();
            v2O2.u("_o");
            v2O2.x(str);
            r2M.A((com.google.android.gms.internal.measurement.W2) v2O2.q());
        }
        return (com.google.android.gms.internal.measurement.S2) r2M.q();
    }

    final String K(C3431c3 c3431c3) {
        com.google.android.gms.internal.measurement.E2 e2X0;
        if (c3431c3 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (c3431c3.H()) {
            E(sb2, 0, "upload_subdomain", c3431c3.I());
        }
        if (c3431c3.F()) {
            E(sb2, 0, "sgtm_join_id", c3431c3.G());
        }
        for (C3449e3 c3449e3 : c3431c3.C()) {
            if (c3449e3 != null) {
                y(sb2, 1);
                sb2.append("bundle {\n");
                if (c3449e3.c0()) {
                    E(sb2, 1, "protocol_version", Integer.valueOf(c3449e3.e1()));
                }
                w7.a();
                X2 x22 = this.f40611a;
                if (x22.w().H(c3449e3.C(), AbstractC3789d2.f41168N0) && c3449e3.K0()) {
                    E(sb2, 1, "session_stitching_token", c3449e3.L0());
                }
                E(sb2, 1, "platform", c3449e3.A2());
                if (c3449e3.E()) {
                    E(sb2, 1, "gmp_version", Long.valueOf(c3449e3.F()));
                }
                if (c3449e3.G()) {
                    E(sb2, 1, "uploading_gmp_version", Long.valueOf(c3449e3.H()));
                }
                if (c3449e3.G0()) {
                    E(sb2, 1, "dynamite_version", Long.valueOf(c3449e3.H0()));
                }
                if (c3449e3.Y()) {
                    E(sb2, 1, "config_version", Long.valueOf(c3449e3.Z()));
                }
                E(sb2, 1, "gmp_app_id", c3449e3.R());
                E(sb2, 1, "app_id", c3449e3.C());
                E(sb2, 1, "app_version", c3449e3.D());
                if (c3449e3.W()) {
                    E(sb2, 1, "app_version_major", Integer.valueOf(c3449e3.X()));
                }
                E(sb2, 1, "firebase_instance_id", c3449e3.V());
                if (c3449e3.M()) {
                    E(sb2, 1, "dev_cert_hash", Long.valueOf(c3449e3.N()));
                }
                E(sb2, 1, "app_store", c3449e3.G2());
                if (c3449e3.q2()) {
                    E(sb2, 1, "upload_timestamp_millis", Long.valueOf(c3449e3.r2()));
                }
                if (c3449e3.s2()) {
                    E(sb2, 1, "start_timestamp_millis", Long.valueOf(c3449e3.t2()));
                }
                if (c3449e3.u2()) {
                    E(sb2, 1, "end_timestamp_millis", Long.valueOf(c3449e3.v2()));
                }
                if (c3449e3.w2()) {
                    E(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c3449e3.x2()));
                }
                if (c3449e3.y2()) {
                    E(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c3449e3.z2()));
                }
                E(sb2, 1, "app_instance_id", c3449e3.L());
                E(sb2, 1, "resettable_device_id", c3449e3.I());
                E(sb2, 1, "ds_id", c3449e3.b0());
                if (c3449e3.J()) {
                    E(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c3449e3.K()));
                }
                E(sb2, 1, "os_version", c3449e3.B2());
                E(sb2, 1, "device_model", c3449e3.C2());
                E(sb2, 1, "user_default_language", c3449e3.D2());
                if (c3449e3.E2()) {
                    E(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c3449e3.F2()));
                }
                if (c3449e3.O()) {
                    E(sb2, 1, "bundle_sequential_index", Integer.valueOf(c3449e3.P()));
                }
                if (c3449e3.Y0()) {
                    E(sb2, 1, "delivery_index", Integer.valueOf(c3449e3.Z0()));
                }
                if (c3449e3.S()) {
                    E(sb2, 1, "service_upload", Boolean.valueOf(c3449e3.T()));
                }
                E(sb2, 1, "health_monitor", c3449e3.Q());
                if (c3449e3.E0()) {
                    E(sb2, 1, "retry_counter", Integer.valueOf(c3449e3.F0()));
                }
                if (c3449e3.I0()) {
                    E(sb2, 1, "consent_signals", c3449e3.J0());
                }
                if (c3449e3.R0()) {
                    E(sb2, 1, "is_dma_region", Boolean.valueOf(c3449e3.S0()));
                }
                if (c3449e3.T0()) {
                    E(sb2, 1, "core_platform_services", c3449e3.U0());
                }
                if (c3449e3.P0()) {
                    E(sb2, 1, "consent_diagnostics", c3449e3.Q0());
                }
                if (c3449e3.M0()) {
                    E(sb2, 1, "target_os_version", Long.valueOf(c3449e3.N0()));
                }
                C3498j7.a();
                if (x22.w().H(c3449e3.C(), AbstractC3789d2.f41174Q0)) {
                    E(sb2, 1, "ad_services_version", Integer.valueOf(c3449e3.V0()));
                    if (c3449e3.W0() && (e2X0 = c3449e3.X0()) != null) {
                        y(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        E(sb2, 2, "eligible", Boolean.valueOf(e2X0.C()));
                        E(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(e2X0.D()));
                        E(sb2, 2, "pre_r", Boolean.valueOf(e2X0.E()));
                        E(sb2, 2, "r_extensions_too_old", Boolean.valueOf(e2X0.F()));
                        E(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(e2X0.G()));
                        E(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(e2X0.H()));
                        E(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(e2X0.I()));
                        y(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (c3449e3.a1()) {
                    com.google.android.gms.internal.measurement.A2 a2B1 = c3449e3.b1();
                    y(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (a2B1.M()) {
                        E(sb2, 2, "deep_link_gclid", a2B1.N());
                    }
                    if (a2B1.O()) {
                        E(sb2, 2, "deep_link_gbraid", a2B1.P());
                    }
                    if (a2B1.Q()) {
                        E(sb2, 2, "deep_link_gad_source", a2B1.R());
                    }
                    if (a2B1.S()) {
                        E(sb2, 2, "deep_link_session_millis", Long.valueOf(a2B1.T()));
                    }
                    if (a2B1.U()) {
                        E(sb2, 2, "market_referrer_gclid", a2B1.V());
                    }
                    if (a2B1.W()) {
                        E(sb2, 2, "market_referrer_gbraid", a2B1.X());
                    }
                    if (a2B1.Y()) {
                        E(sb2, 2, "market_referrer_gad_source", a2B1.Z());
                    }
                    if (a2B1.a0()) {
                        E(sb2, 2, "market_referrer_click_millis", Long.valueOf(a2B1.b0()));
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (c3449e3.d0()) {
                    E(sb2, 1, "batching_timestamp_millis", Long.valueOf(c3449e3.e0()));
                }
                if (c3449e3.c1()) {
                    C3583t3 c3583t3D1 = c3449e3.d1();
                    y(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int iH = c3583t3D1.H();
                    E(sb2, 2, "upload_type", iH != 1 ? iH != 2 ? iH != 3 ? iH != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    E(sb2, 2, "client_upload_eligibility", c3583t3D1.C().name());
                    int I10 = c3583t3D1.I();
                    E(sb2, 2, "service_upload_eligibility", I10 != 1 ? I10 != 2 ? I10 != 3 ? I10 != 4 ? I10 != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (c3449e3.f0()) {
                    com.google.android.gms.internal.measurement.O2 o2G0 = c3449e3.g0();
                    y(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.L2 l22 : o2G0.C()) {
                        y(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int iE = l22.E();
                        E(sb2, 3, "type", iE != 1 ? iE != 2 ? iE != 3 ? iE != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iF = l22.F();
                        E(sb2, 3, "mode", iF != 1 ? iF != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        y(sb2, 3);
                        sb2.append("}\n");
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                List<C3601v3> listN2 = c3449e3.n2();
                if (listN2 != null) {
                    for (C3601v3 c3601v3 : listN2) {
                        if (c3601v3 != null) {
                            y(sb2, 2);
                            sb2.append("user_property {\n");
                            E(sb2, 2, "set_timestamp_millis", c3601v3.C() ? Long.valueOf(c3601v3.D()) : null);
                            E(sb2, 2, "name", x22.D().c(c3601v3.E()));
                            E(sb2, 2, "string_value", c3601v3.G());
                            E(sb2, 2, "int_value", c3601v3.H() ? Long.valueOf(c3601v3.I()) : null);
                            E(sb2, 2, "double_value", c3601v3.L() ? Double.valueOf(c3601v3.M()) : null);
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.G2> listU = c3449e3.U();
                if (listU != null) {
                    for (com.google.android.gms.internal.measurement.G2 g22 : listU) {
                        if (g22 != null) {
                            y(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (g22.C()) {
                                E(sb2, 2, "audience_id", Integer.valueOf(g22.D()));
                            }
                            if (g22.H()) {
                                E(sb2, 2, "new_audience", Boolean.valueOf(g22.I()));
                            }
                            D(sb2, 2, "current_data", g22.E());
                            if (g22.F()) {
                                D(sb2, 2, "previous_data", g22.G());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.S2> listH2 = c3449e3.h2();
                if (listH2 != null) {
                    for (com.google.android.gms.internal.measurement.S2 s22 : listH2) {
                        if (s22 != null) {
                            y(sb2, 2);
                            sb2.append("event {\n");
                            E(sb2, 2, "name", x22.D().a(s22.F()));
                            if (s22.G()) {
                                E(sb2, 2, "timestamp_millis", Long.valueOf(s22.H()));
                            }
                            if (s22.I()) {
                                E(sb2, 2, "previous_timestamp_millis", Long.valueOf(s22.J()));
                            }
                            if (s22.K()) {
                                E(sb2, 2, "count", Integer.valueOf(s22.L()));
                            }
                            if (s22.D() != 0) {
                                w(sb2, 2, s22.C());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                y(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    final String L(com.google.android.gms.internal.measurement.D1 d12) {
        if (d12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (d12.C()) {
            E(sb2, 0, "filter_id", Integer.valueOf(d12.D()));
        }
        E(sb2, 0, "event_name", this.f40611a.D().a(d12.E()));
        String strA = A(d12.K(), d12.L(), d12.N());
        if (!strA.isEmpty()) {
            E(sb2, 0, "filter_type", strA);
        }
        if (d12.I()) {
            F(sb2, 1, "event_count_filter", d12.J());
        }
        if (d12.G() > 0) {
            sb2.append("  filters {\n");
            Iterator it = d12.F().iterator();
            while (it.hasNext()) {
                x(sb2, 2, (com.google.android.gms.internal.measurement.F1) it.next());
            }
        }
        y(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    final String M(com.google.android.gms.internal.measurement.L1 l12) {
        if (l12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (l12.C()) {
            E(sb2, 0, "filter_id", Integer.valueOf(l12.D()));
        }
        E(sb2, 0, "property_name", this.f40611a.D().c(l12.E()));
        String strA = A(l12.G(), l12.H(), l12.J());
        if (!strA.isEmpty()) {
            E(sb2, 0, "filter_type", strA);
        }
        x(sb2, 1, l12.F());
        sb2.append("}\n");
        return sb2.toString();
    }

    final Parcelable N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (b.a unused) {
                this.f40611a.a().o().a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    final List R(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f40611a.a().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f40611a.a().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    final boolean S(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f40611a.e().a() - j10) > j11;
    }

    final long T(byte[] bArr) {
        AbstractC2115p.l(bArr);
        X2 x22 = this.f40611a;
        x22.C().h();
        MessageDigest messageDigestC = z6.C();
        if (messageDigestC != null) {
            return z6.D(messageDigestC.digest(bArr));
        }
        x22.a().o().a("Failed to get MD5");
        return 0L;
    }

    final long U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return T(str.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING)));
    }

    final byte[] V(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f40611a.a().o().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    final Map Z(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(Z((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(Z((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(Z((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3777b6
    protected final boolean l() {
        return false;
    }

    final G m(C3418b c3418b) {
        Object obj;
        Bundle bundleN = n(c3418b.f(), true);
        String string = (!bundleN.containsKey("_o") || (obj = bundleN.get("_o")) == null) ? "app" : obj.toString();
        String strB = j9.w.b(c3418b.b());
        if (strB == null) {
            strB = c3418b.b();
        }
        return new G(strB, new E(bundleN), string, c3418b.a());
    }

    final Bundle n(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(n((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }
}
