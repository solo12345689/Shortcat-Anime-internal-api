package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C3502k2;
import com.google.android.gms.internal.measurement.C3521m3;
import com.google.android.gms.internal.measurement.C3583t3;
import com.google.android.gms.internal.measurement.EnumC3539o3;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3793d6 extends W5 {
    C3793d6(q6 q6Var) {
        super(q6Var);
    }

    private final String k(String str) {
        String strX = this.f41010b.D0().x(str);
        if (TextUtils.isEmpty(strX)) {
            return (String) AbstractC3789d2.f41239r.b(null);
        }
        Uri uri = Uri.parse((String) AbstractC3789d2.f41239r.b(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(authority).length());
        sb2.append(strX);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }

    private static final boolean l(String str) {
        String str2 = (String) AbstractC3789d2.f41243t.b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(com.amazon.a.a.o.b.f.f34694a)) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final C3785c6 i(String str) {
        C3928w2 c3928w2J0;
        q6 q6Var = this.f41010b;
        C3928w2 c3928w2J02 = q6Var.F0().J0(str);
        C3785c6 c3785c6 = null;
        if (c3928w2J02 == null || !c3928w2J02.V()) {
            return new C3785c6(k(str), Collections.EMPTY_MAP, j9.G.GOOGLE_ANALYTICS, null);
        }
        C3521m3 c3521m3D = C3583t3.D();
        c3521m3D.u(2);
        c3521m3D.t((EnumC3539o3) AbstractC2115p.l(EnumC3539o3.a(c3928w2J02.M())));
        String strP0 = c3928w2J02.p0();
        C3502k2 c3502k2W = q6Var.D0().w(str);
        if (c3502k2W == null || (c3928w2J0 = q6Var.F0().J0(str)) == null || ((!c3502k2W.Q() || c3502k2W.R().E() != 100) && !this.f40611a.C().P(str, c3928w2J0.l0()) && (TextUtils.isEmpty(strP0) || Math.abs(strP0.hashCode() % 100) >= c3502k2W.R().E()))) {
            c3521m3D.v(3);
            return new C3785c6(k(str), Collections.EMPTY_MAP, j9.G.GOOGLE_ANALYTICS, (C3583t3) c3521m3D.q());
        }
        String strO0 = c3928w2J02.o0();
        c3521m3D.u(2);
        C3502k2 c3502k2W2 = q6Var.D0().w(c3928w2J02.o0());
        if (c3502k2W2 == null || !c3502k2W2.Q()) {
            this.f40611a.a().w().b("[sgtm] Missing sgtm_setting in remote config. appId", strO0);
            c3521m3D.v(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(c3928w2J02.l0())) {
                map.put("x-gtm-server-preview", c3928w2J02.l0());
            }
            String strF = c3502k2W2.R().F();
            EnumC3539o3 enumC3539o3A = EnumC3539o3.a(c3928w2J02.M());
            if (enumC3539o3A != null && enumC3539o3A != EnumC3539o3.CLIENT_UPLOAD_ELIGIBLE) {
                c3521m3D.t(enumC3539o3A);
            } else if (l(c3928w2J02.o0())) {
                c3521m3D.t(EnumC3539o3.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strF)) {
                c3521m3D.t(EnumC3539o3.MISSING_SGTM_SERVER_URL);
            } else {
                this.f40611a.a().w().b("[sgtm] Eligible for client side upload. appId", strO0);
                c3521m3D.u(3);
                c3521m3D.t(EnumC3539o3.CLIENT_UPLOAD_ELIGIBLE);
                c3785c6 = new C3785c6(strF, map, j9.G.SGTM_CLIENT, (C3583t3) c3521m3D.q());
            }
            c3502k2W2.R().C();
            c3502k2W2.R().D();
            X2 x22 = this.f40611a;
            x22.c();
            if (TextUtils.isEmpty(strF)) {
                c3521m3D.v(6);
                x22.a().w().b("[sgtm] Local service, missing sgtm_server_url", c3928w2J02.o0());
            } else {
                x22.a().w().b("[sgtm] Eligible for local service direct upload. appId", strO0);
                c3521m3D.u(5);
                c3521m3D.v(2);
                c3785c6 = new C3785c6(strF, map, j9.G.SGTM, (C3583t3) c3521m3D.q());
            }
        }
        return c3785c6 != null ? c3785c6 : new C3785c6(k(str), Collections.EMPTY_MAP, j9.G.GOOGLE_ANALYTICS, (C3583t3) c3521m3D.q());
    }

    final boolean j(String str, EnumC3539o3 enumC3539o3) {
        C3502k2 c3502k2W;
        h();
        return (enumC3539o3 != EnumC3539o3.CLIENT_UPLOAD_ELIGIBLE || l(str) || (c3502k2W = this.f41010b.D0().w(str)) == null || !c3502k2W.Q() || c3502k2W.R().F().isEmpty()) ? false : true;
    }
}
