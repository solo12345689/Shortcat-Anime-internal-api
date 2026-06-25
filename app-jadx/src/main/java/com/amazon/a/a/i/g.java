package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.amazon.a.a.i.c;
import com.amazon.a.a.i.h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends h implements com.amazon.a.a.k.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f34400b = 31536000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34401e = new com.amazon.a.a.o.c("ShutdownPrompt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f34402f = "https://www.amazon.com/appstore-error-help";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f34403g = "badcert";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f34404h = "1.1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f34405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f34406j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.amazon.a.a.a.a f34407a;

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            return null;
        }

        private a(com.amazon.a.a.a.a aVar) {
            this.f34407a = aVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            g.b(this.f34407a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends AsyncTask<Intent, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f34408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.amazon.a.a.a.a f34409b;

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Intent... intentArr) {
            this.f34408a.startActivity(intentArr[0]);
            return null;
        }

        private b(Context context, com.amazon.a.a.a.a aVar) {
            this.f34408a = context;
            this.f34409b = aVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            g.b(this.f34409b);
        }
    }

    public g(c cVar) {
        super(cVar, h.a.EXTENDED);
        f34401e.a("new ShutdownPrompt called!");
    }

    private String n() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    @Override // com.amazon.a.a.e.a
    public void b() {
        this.f34405i.g();
    }

    @Override // com.amazon.a.a.e.c
    protected long h() {
        return f34400b;
    }

    @Override // com.amazon.a.a.i.h
    protected void i() {
        a(0);
    }

    protected void m() {
        com.amazon.a.a.o.c cVar = f34401e;
        cVar.a("Store contains " + this.f34406j.toString());
        if (!((h) this).f34412c.i()) {
            cVar.a("Should not show fixup");
            new a(this.f34405i).execute(new Void[0]);
        } else {
            cVar.a("Should show fixup");
            Activity activityA = this.f34405i.a();
            a(activityA, a((Context) activityA));
            cVar.a("Attempted to start browser.");
        }
    }

    public String toString() {
        return "ShutdownPrompt";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.amazon.a.a.a.a aVar) {
        com.amazon.a.a.o.c cVar = f34401e;
        cVar.a("doShutdown()");
        cVar.c("Killing application");
        System.exit(0);
    }

    @Override // com.amazon.a.a.i.h
    protected void a(int i10) {
        com.amazon.a.a.o.c cVar = f34401e;
        cVar.a("doAction(" + i10 + ")");
        c.a[] aVarArrC = ((h) this).f34412c.c();
        c.a aVar = c.a.DEFAULT;
        c.a aVar2 = i10 < aVarArrC.length ? aVarArrC[i10] : aVar;
        if (aVar2 == c.a.HELP) {
            cVar.a("doAction() help");
            m();
        } else if (aVar2 == c.a.DEEPLINK) {
            cVar.a("doAction() deeplink");
            a(f34403g);
        } else if (aVar2 == aVar) {
            b(this.f34405i);
        }
    }

    private String b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            f34401e.a("tm was null!");
            return null;
        }
        com.amazon.a.a.o.c cVar = f34401e;
        cVar.a("tm was not null.");
        int simState = telephonyManager.getSimState();
        if (simState != 5) {
            cVar.a("SIM not ready, returning null.  State was " + simState);
            return null;
        }
        return telephonyManager.getSimOperator();
    }

    private boolean b(Context context, Intent intent) {
        intent.addFlags(268435456);
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final Intent a(Context context) {
        String packageName = context.getPackageName();
        StringBuilder sb2 = new StringBuilder(f34402f);
        PackageManager packageManager = context.getPackageManager();
        a(sb2, "?k=", f34404h);
        a(sb2, "&m=", ((h) this).f34412c.e());
        a(sb2, "&ec=", String.valueOf(((h) this).f34412c.g()));
        String str = (String) this.f34406j.a(com.amazon.a.a.m.c.f34466f);
        if (str != null) {
            a(sb2, "&t=", str);
            a(sb2, "&tv=", str, packageManager);
        }
        String str2 = (String) this.f34406j.a(com.amazon.a.a.m.c.f34467g);
        if (str2 != null) {
            a(sb2, "&c=", str2);
        }
        String str3 = (String) this.f34406j.a(com.amazon.a.a.m.c.f34464d);
        if (str3 != null) {
            a(sb2, "&e=", str3);
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            a(sb2, "&d=", str4);
        }
        String str5 = Build.MANUFACTURER;
        if (str5 != null) {
            a(sb2, "&ma=", str5);
        }
        String str6 = Build.MODEL;
        if (str6 != null) {
            a(sb2, "&mo=", str6);
        }
        String str7 = Build.ID;
        if (str7 != null) {
            a(sb2, "&bn=", str7);
        }
        a(sb2, "&sz=", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
        a(sb2, "&s=", String.valueOf(Build.VERSION.SDK_INT));
        a(sb2, "&p=", packageName);
        a(sb2, "&pv=", packageName, packageManager);
        a(sb2, "&l=", n());
        String strB = b(context);
        if (!TextUtils.isEmpty(strB)) {
            a(sb2, "&mc=", strB);
        }
        String string = sb2.toString();
        f34401e.a("Starting browser for uri " + string);
        return new Intent("android.intent.action.VIEW", Uri.parse(string));
    }

    private final void a(StringBuilder sb2, String str, String str2, PackageManager packageManager) {
        try {
            a(sb2, str, String.valueOf(packageManager.getPackageInfo(str2, 0).versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
            f34401e.b("Could not find information for package " + str2);
        }
    }

    private final void a(StringBuilder sb2, String str, String str2) {
        try {
            String strEncode = URLEncoder.encode(str2, Constants.ENCODING);
            sb2.append(str);
            sb2.append(strEncode);
        } catch (UnsupportedEncodingException e10) {
            f34401e.b("Failed to URL-encode argument", e10);
        }
    }

    private void a(String str) {
        f34401e.a("Attempting to deep link to appstore.");
        Activity activityA = this.f34405i.a();
        a(activityA, a(activityA, str));
    }

    private Intent a(Context context, String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/android?p=" + context.getPackageName() + "&ref=" + str));
    }

    private void a(Context context, Intent intent) {
        if (!b(context, intent)) {
            f34401e.b("Could not start activity, nothing resolves for the given data.");
            b(this.f34405i);
        } else {
            new b(context, this.f34405i).execute(intent);
        }
    }

    @Override // com.amazon.a.a.i.h
    protected boolean a(c.a aVar) {
        Intent intentA;
        if (aVar == c.a.DEFAULT) {
            return true;
        }
        Activity activityA = this.f34405i.a();
        if (aVar == c.a.DEEPLINK) {
            intentA = a(activityA, f34403g);
        } else {
            intentA = aVar == c.a.HELP ? a((Context) activityA) : null;
        }
        if (intentA == null) {
            f34401e.b("Unexpected action " + aVar + ", could not create intent.");
            return false;
        }
        return b(activityA, intentA);
    }
}
