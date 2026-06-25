package com.google.firebase.analytics.connector.internal;

import P9.AbstractC2011u;
import P9.AbstractC2013w;
import android.os.Bundle;
import j9.y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2013w f43205a = AbstractC2013w.G("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b */
    private static final AbstractC2011u f43206b = AbstractC2011u.I("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c */
    private static final AbstractC2011u f43207c = AbstractC2011u.F("auto", "app", "am");

    /* JADX INFO: renamed from: d */
    private static final AbstractC2011u f43208d = AbstractC2011u.D("_r", "_dbg");

    /* JADX INFO: renamed from: e */
    private static final AbstractC2011u f43209e = new AbstractC2011u.a().i(y.f51724a).i(y.f51725b).k();

    /* JADX INFO: renamed from: f */
    private static final AbstractC2011u f43210f = AbstractC2011u.D("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean a(String str) {
        return !f43207c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (f43206b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC2011u abstractC2011u = f43208d;
        int size = abstractC2011u.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC2011u.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f43209e.contains(str2)) {
            return false;
        }
        AbstractC2011u abstractC2011u = f43210f;
        int size = abstractC2011u.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zMatches = str2.matches((String) abstractC2011u.get(i10));
            i10++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        AbstractC2011u abstractC2011u = f43208d;
        int size = abstractC2011u.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC2011u.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals("fcm")) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
