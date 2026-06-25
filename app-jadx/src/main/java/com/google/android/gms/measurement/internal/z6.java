package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class z6 extends B3 {

    /* JADX INFO: renamed from: i */
    private static final String[] f41818i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j */
    private static final String[] f41819j = {"_err"};

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f41820k = 0;

    /* JADX INFO: renamed from: c */
    private SecureRandom f41821c;

    /* JADX INFO: renamed from: d */
    private final AtomicLong f41822d;

    /* JADX INFO: renamed from: e */
    private int f41823e;

    /* JADX INFO: renamed from: f */
    private J3.a f41824f;

    /* JADX INFO: renamed from: g */
    private Boolean f41825g;

    /* JADX INFO: renamed from: h */
    private Integer f41826h;

    z6(X2 x22) {
        super(x22);
        this.f41826h = null;
        this.f41822d = new AtomicLong(0L);
    }

    static MessageDigest C() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    static long D(byte[] bArr) {
        AbstractC2115p.l(bArr);
        int length = bArr.length;
        int i10 = 0;
        AbstractC2115p.o(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (((long) bArr[i11]) & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    static boolean E(Context context, boolean z10) {
        AbstractC2115p.l(context);
        return F(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean F(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean N(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private static boolean O(String str, String[] strArr) {
        AbstractC2115p.l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(String str) {
        return !f41819j[0].equals(str);
    }

    public static ArrayList h0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3826i c3826i = (C3826i) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c3826i.f41351a);
            bundle.putString("origin", c3826i.f41352b);
            bundle.putLong("creation_timestamp", c3826i.f41354d);
            bundle.putString("name", c3826i.f41353c.f41669b);
            j9.t.a(bundle, AbstractC2115p.l(c3826i.f41353c.c()));
            bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, c3826i.f41355e);
            String str = c3826i.f41356f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            G g10 = c3826i.f41357g;
            if (g10 != null) {
                bundle.putString("timed_out_event_name", g10.f40764a);
                E e10 = g10.f40765b;
                if (e10 != null) {
                    bundle.putBundle("timed_out_event_params", e10.l());
                }
            }
            bundle.putLong("trigger_timeout", c3826i.f41358h);
            G g11 = c3826i.f41359i;
            if (g11 != null) {
                bundle.putString("triggered_event_name", g11.f40764a);
                E e11 = g11.f40765b;
                if (e11 != null) {
                    bundle.putBundle("triggered_event_params", e11.l());
                }
            }
            bundle.putLong("triggered_timestamp", c3826i.f41353c.f41670c);
            bundle.putLong("time_to_live", c3826i.f41360j);
            G g12 = c3826i.f41361k;
            if (g12 != null) {
                bundle.putString("expired_event_name", g12.f40764a);
                E e12 = g12.f40765b;
                if (e12 != null) {
                    bundle.putBundle("expired_event_params", e12.l());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static boolean j0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC2115p.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void k0(E4 e42, Bundle bundle, boolean z10) {
        if (bundle != null && e42 != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = e42.f40741a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = e42.f40742b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", e42.f40743c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && e42 == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    static final boolean m0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    private final Object n0(int i10, Object obj, boolean z10, boolean z11, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return q(obj.toString(), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleQ = Q((Bundle) parcelable, null);
                if (!bundleQ.isEmpty()) {
                    arrayList.add(bundleQ);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final int o0(String str) {
        if ("_ldl".equals(str)) {
            this.f40611a.w();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f40611a.w();
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if ("_lgclid".equals(str)) {
            this.f40611a.w();
            return 100;
        }
        this.f40611a.w();
        return 36;
    }

    static boolean r0(String str) {
        AbstractC2115p.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    final void A(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            X2 x22 = this.f40611a;
            x22.a().t().c("Not putting event parameter. Invalid value type. name, type", x22.D().b(str), simpleName);
        }
    }

    final int A0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.f40611a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }

    final void B(y6 y6Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        y6Var.d(str, "_err", bundle);
    }

    final boolean B0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    final boolean C0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i10) {
                this.f40611a.a().t().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    final void D0(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int iZ0;
        String str4;
        int iR;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        X2 x22 = this.f40611a;
        int i10 = true != x22.w().f40611a.C().V(231100000, true) ? 0 : 35;
        int i11 = 0;
        boolean z11 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str5)) {
                iZ0 = !z10 ? z0(str5) : 0;
                if (iZ0 == 0) {
                    iZ0 = A0(str5);
                }
            } else {
                iZ0 = 0;
            }
            if (iZ0 != 0) {
                x(bundle, iZ0, str5, iZ0 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (B0(bundle.get(str5))) {
                    x22.a().t().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iR = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    iR = r(str, str2, str5, bundle.get(str5), bundle, list2, z10, false);
                }
                if (iR != 0 && !"_ev".equals(str5)) {
                    x(bundle, iR, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (r0(str5) && !O(str5, j9.x.f51723d)) {
                    i11++;
                    if (!V(231100000, true)) {
                        x22.a().q().c("Item array not supported on client's version of Google Play Services (Android Only)", x22.D().a(str2), x22.D().e(bundle));
                        m0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i11 > i10) {
                        if (!x22.w().H(str4, AbstractC3789d2.f41210f1) || !z11) {
                            C3873o2 c3873o2Q = x22.a().q();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" item-scoped custom params");
                            c3873o2Q.c(sb2.toString(), x22.D().a(str2), x22.D().e(bundle));
                        }
                        m0(bundle, 28);
                        bundle.remove(str5);
                        list2 = list;
                        z11 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    final boolean G() {
        h();
        return J() == 1;
    }

    final J3.a H() {
        if (this.f41824f == null) {
            this.f41824f = J3.a.a(this.f40611a.d());
        }
        return this.f41824f;
    }

    final int I() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    final long J() {
        long j10;
        h();
        if (!L(this.f40611a.L().q())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j10 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else {
            X2 x22 = this.f40611a;
            int I10 = I();
            x22.w();
            j10 = I10 < ((Integer) AbstractC3789d2.f41230m0.b(null)).intValue() ? 16L : 0L;
        }
        if (!M("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !K()) {
            j10 = 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    final boolean K() {
        Object e10;
        Integer num;
        if (this.f41825g == null) {
            J3.a aVarH = H();
            boolean z10 = false;
            if (aVarH == null) {
                return false;
            }
            try {
                num = (Integer) aVarH.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e11) {
                        e10 = e11;
                        this.f40611a.a().r().b("Measurement manager api exception", e10);
                        this.f41825g = Boolean.FALSE;
                    } catch (CancellationException e12) {
                        e10 = e12;
                        this.f40611a.a().r().b("Measurement manager api exception", e10);
                        this.f41825g = Boolean.FALSE;
                    } catch (ExecutionException e13) {
                        e10 = e13;
                        this.f40611a.a().r().b("Measurement manager api exception", e10);
                        this.f41825g = Boolean.FALSE;
                    } catch (TimeoutException e14) {
                        e10 = e14;
                        this.f40611a.a().r().b("Measurement manager api exception", e10);
                        this.f41825g = Boolean.FALSE;
                    }
                }
                this.f41825g = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e15) {
                e10 = e15;
                num = null;
            }
            this.f40611a.a().w().b("Measurement manager api status result", num);
        }
        return this.f41825g.booleanValue();
    }

    final boolean L(String str) {
        String str2 = (String) AbstractC3789d2.f41242s0.b(null);
        return str2.equals("*") || Arrays.asList(str2.split(com.amazon.a.a.o.b.f.f34694a)).contains(str);
    }

    final boolean M(String str) {
        h();
        X2 x22 = this.f40611a;
        if (X8.e.a(x22.d()).a(str) == 0) {
            return true;
        }
        x22.a().v().b("Permission not granted", str);
        return false;
    }

    final boolean P(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        X2 x22 = this.f40611a;
        String strI = x22.w().i();
        x22.c();
        return strI.equals(str);
    }

    final Bundle Q(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objS = s(str2, bundle.get(str2));
                if (objS == null) {
                    X2 x22 = this.f40611a;
                    x22.a().t().b("Param value can't be null", x22.D().b(str2));
                } else {
                    A(bundle2, str2, objS);
                }
            }
        }
        return bundle2;
    }

    final G R(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (x0(str2) != 0) {
            X2 x22 = this.f40611a;
            x22.a().o().b("Invalid conditional property event name", x22.D().c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleT = t(str, str2, bundle2, com.google.android.gms.common.util.e.a("_o"), true);
        if (z10) {
            bundleT = Q(bundleT, str);
        }
        AbstractC2115p.l(bundleT);
        return new G(str2, new E(bundleT), str3, j10);
    }

    final boolean S(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoE = X8.e.a(context).e(str, 64);
            if (packageInfoE == null || (signatureArr = packageInfoE.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            this.f40611a.a().o().b("Package name not found", e10);
            return true;
        } catch (CertificateException e11) {
            this.f40611a.a().o().b("Error obtaining certificate", e11);
            return true;
        }
    }

    final byte[] T(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final boolean V(int i10, boolean z10) {
        Boolean boolX = this.f40611a.J().x();
        if (W() < i10 / 1000) {
            return (boolX == null || boolX.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int W() {
        if (this.f41826h == null) {
            this.f41826h = Integer.valueOf(com.google.android.gms.common.b.f().a(this.f40611a.d()) / 1000);
        }
        return this.f41826h.intValue();
    }

    public final int X(int i10) {
        return com.google.android.gms.common.b.f().h(this.f40611a.d(), 12451000);
    }

    public final long Y(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    final void Z(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f40611a.a().r().b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void a0(InterfaceC3623y0 interfaceC3623y0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC3623y0.f(bundle);
        } catch (RemoteException e10) {
            this.f40611a.a().r().b("Error returning string value to wrapper", e10);
        }
    }

    public final void b0(InterfaceC3623y0 interfaceC3623y0, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            interfaceC3623y0.f(bundle);
        } catch (RemoteException e10) {
            this.f40611a.a().r().b("Error returning long value to wrapper", e10);
        }
    }

    public final void c0(InterfaceC3623y0 interfaceC3623y0, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            interfaceC3623y0.f(bundle);
        } catch (RemoteException e10) {
            this.f40611a.a().r().b("Error returning int value to wrapper", e10);
        }
    }

    public final void d0(InterfaceC3623y0 interfaceC3623y0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC3623y0.f(bundle);
        } catch (RemoteException e10) {
            this.f40611a.a().r().b("Error returning byte array to wrapper", e10);
        }
    }

    public final void e0(InterfaceC3623y0 interfaceC3623y0, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            interfaceC3623y0.f(bundle);
        } catch (RemoteException e10) {
            this.f40611a.a().r().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void f0(InterfaceC3623y0 interfaceC3623y0, Bundle bundle) {
        try {
            interfaceC3623y0.f(bundle);
        } catch (RemoteException e10) {
            this.f40611a.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    public final void g0(InterfaceC3623y0 interfaceC3623y0, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC3623y0.f(bundle);
        } catch (RemoteException e10) {
            this.f40611a.a().r().b("Error returning bundle list to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean i() {
        return true;
    }

    public final URL i0(long j10, String str, String str2, long j11, String str3) {
        try {
            AbstractC2115p.f(str2);
            AbstractC2115p.f(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 133005L, Integer.valueOf(W())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f40611a.w().j())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e10) {
            e = e10;
            this.f40611a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e11) {
            e = e11;
            this.f40611a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final void j() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f40611a.a().r().a("Utils falling back to Random for random id");
            }
        }
        this.f41822d.set(jNextLong);
    }

    final String l0() {
        byte[] bArr = new byte[16];
        q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f40611a.a().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        AbstractC2115p.l(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.f40611a.a().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C3887q2.x(str));
        return false;
    }

    final boolean p(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            AbstractC2115p.l(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final long p0() {
        long andIncrement;
        long j10;
        AtomicLong atomicLong = this.f41822d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f41822d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ this.f40611a.e().a()).nextLong();
            int i10 = this.f41823e + 1;
            this.f41823e = i10;
            j10 = jNextLong + ((long) i10);
        }
        return j10;
    }

    public final String q(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    final SecureRandom q0() {
        h();
        if (this.f41821c == null) {
            this.f41821c = new SecureRandom();
        }
        return this.f41821c;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int r(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z6.r(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    final Object s(String str, Object obj) {
        if ("_ev".equals(str)) {
            return n0(this.f40611a.w().y(null, false), obj, true, true, null);
        }
        return n0(N(str) ? this.f40611a.w().y(null, false) : this.f40611a.w().x(null, false), obj, false, true, null);
    }

    final Bundle s0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(Constants.MEDIUM, queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            for (String str2 : uri.getQueryParameterNames()) {
                if (str2.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str2, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            this.f40611a.a().r().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    final Bundle t(String str, String str2, Bundle bundle, List list, boolean z10) {
        int iZ0;
        List list2 = list;
        boolean zO = O(str2, j9.w.f51719d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        X2 x22 = this.f40611a;
        int iV = x22.w().v();
        int i10 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                iZ0 = !z10 ? z0(str3) : 0;
                if (iZ0 == 0) {
                    iZ0 = A0(str3);
                }
            } else {
                iZ0 = 0;
            }
            if (iZ0 != 0) {
                x(bundle2, iZ0, str3, iZ0 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iR = r(str, str2, str3, bundle.get(str3), bundle2, list2, z10, zO);
                if (iR == 17) {
                    x(bundle2, 17, str3, Boolean.FALSE);
                } else if (iR != 0 && !"_ev".equals(str3)) {
                    x(bundle2, iR, iR == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (r0(str3) && (i10 = i10 + 1) > iV) {
                    if (!x22.w().H(null, AbstractC3789d2.f41210f1) || !z11) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iV).length() + 37);
                        sb2.append("Event can't contain more than ");
                        sb2.append(iV);
                        sb2.append(" params");
                        x22.a().q().c(sb2.toString(), x22.D().a(str2), x22.D().e(bundle));
                    }
                    m0(bundle2, 5);
                    bundle2.remove(str3);
                    z11 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    final boolean t0(String str, String str2) {
        if (str2 == null) {
            this.f40611a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f40611a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f40611a.a().q().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f40611a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final void u(C3893r2 c3893r2, int i10) {
        Bundle bundle = c3893r2.f41573d;
        int i11 = 0;
        boolean z10 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (r0(str) && (i11 = i11 + 1) > i10) {
                X2 x22 = this.f40611a;
                if (!x22.w().H(null, AbstractC3789d2.f41210f1) || !z10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    x22.a().q().c(sb2.toString(), x22.D().a(c3893r2.f41570a), x22.D().e(bundle));
                    m0(bundle, 5);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    final boolean u0(String str, String str2) {
        if (str2 == null) {
            this.f40611a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f40611a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f40611a.a().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f40611a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final void v(Parcelable[] parcelableArr, int i10) {
        AbstractC2115p.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            boolean z10 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (r0(str) && !O(str, j9.x.f51723d) && (i11 = i11 + 1) > i10) {
                    X2 x22 = this.f40611a;
                    if (!x22.w().H(null, AbstractC3789d2.f41210f1) || !z10) {
                        C3873o2 c3873o2Q = x22.a().q();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i10);
                        sb2.append(" item-scoped custom parameters");
                        c3873o2Q.c(sb2.toString(), x22.D().b(str), x22.D().e(bundle));
                    }
                    m0(bundle, 28);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    final boolean v0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f40611a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC2115p.l(str2);
        String[] strArr3 = f41818i;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f40611a.a().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !O(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && O(str2, strArr2)) {
            return true;
        }
        this.f40611a.a().q().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final void w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f40611a.C().A(bundle, str, bundle2.get(str));
            }
        }
    }

    final boolean w0(String str, int i10, String str2) {
        if (str2 == null) {
            this.f40611a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.f40611a.a().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    final void x(Bundle bundle, int i10, String str, Object obj) {
        if (m0(bundle, i10)) {
            this.f40611a.w();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                AbstractC2115p.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    final int x0(String str) {
        if (!u0("event", str)) {
            return 2;
        }
        if (!v0("event", j9.w.f51716a, j9.w.f51717b, str)) {
            return 13;
        }
        this.f40611a.w();
        return !w0("event", 40, str) ? 2 : 0;
    }

    final int y(String str, Object obj) {
        return "_ldl".equals(str) ? C0("user property referrer", str, o0(str), obj) : C0("user property", str, o0(str), obj) ? 0 : 7;
    }

    final int y0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (!v0("user property", j9.y.f51724a, null, str)) {
            return 15;
        }
        this.f40611a.w();
        return !w0("user property", 24, str) ? 6 : 0;
    }

    final Object z(String str, Object obj) {
        return "_ldl".equals(str) ? n0(o0(str), obj, true, false, null) : n0(o0(str), obj, false, false, null);
    }

    final int z0(String str) {
        if (!t0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.f40611a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }
}
