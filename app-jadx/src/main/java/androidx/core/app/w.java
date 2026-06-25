package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f28909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f28910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f28911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f28913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f28914g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(w wVar) {
            Set setF;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(wVar.n()).setLabel(wVar.m()).setChoices(wVar.g()).setAllowFreeFormInput(wVar.e()).addExtras(wVar.l());
            if (Build.VERSION.SDK_INT >= 26 && (setF = wVar.f()) != null) {
                Iterator it = setF.iterator();
                while (it.hasNext()) {
                    b.c(builderAddExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.a(builderAddExtras, wVar.j());
            }
            return builderAddExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static void a(w wVar, Intent intent, Map map) {
            RemoteInput.addDataResultToIntent(w.c(wVar), intent, map);
        }

        static Map b(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder c(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {
        static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        static void b(Intent intent, int i10) {
            RemoteInput.setResultsSource(intent, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28915a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f28918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence[] f28919e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f28916b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f28917c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f28920f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f28921g = 0;

        public e(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f28915a = str;
        }

        public w a() {
            return new w(this.f28915a, this.f28918d, this.f28919e, this.f28920f, this.f28921g, this.f28917c, this.f28916b);
        }

        public e b(boolean z10) {
            this.f28920f = z10;
            return this;
        }

        public e c(CharSequence[] charSequenceArr) {
            this.f28919e = charSequenceArr;
            return this;
        }

        public e d(int i10) {
            this.f28921g = i10;
            return this;
        }

        public e e(CharSequence charSequence) {
            this.f28918d = charSequence;
            return this;
        }
    }

    w(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set set) {
        this.f28908a = str;
        this.f28909b = charSequence;
        this.f28910c = charSequenceArr;
        this.f28911d = z10;
        this.f28912e = i10;
        this.f28913f = bundle;
        this.f28914g = set;
        if (j() == 2 && !e()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(w wVar, Intent intent, Map map) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(wVar, intent, map);
            return;
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            intentH = new Intent();
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Uri uri = (Uri) entry.getValue();
            if (str != null) {
                Bundle bundleExtra = intentH.getBundleExtra(k(str));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(wVar.n(), uri.toString());
                intentH.putExtra(k(str), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", intentH));
    }

    public static void b(w[] wVarArr, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(d(wVarArr), intent, bundle);
            return;
        }
        Bundle bundleO = o(intent);
        int iP = p(intent);
        if (bundleO != null) {
            bundleO.putAll(bundle);
            bundle = bundleO;
        }
        for (w wVar : wVarArr) {
            Map mapI = i(intent, wVar.n());
            a.a(d(new w[]{wVar}), intent, bundle);
            if (mapI != null) {
                a(wVar, intent, mapI);
            }
        }
        r(intent, iP);
    }

    static RemoteInput c(w wVar) {
        return a.b(wVar);
    }

    static RemoteInput[] d(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            remoteInputArr[i10] = c(wVarArr[i10]);
        }
        return remoteInputArr;
    }

    private static Intent h(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    public static Map i(Intent intent, String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(intent, str);
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : intentH.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                String strSubstring = str2.substring(39);
                if (!strSubstring.isEmpty() && (string = intentH.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    map.put(strSubstring, Uri.parse(string));
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private static String k(String str) {
        return "android.remoteinput.dataTypeResultsData" + str;
    }

    public static Bundle o(Intent intent) {
        return a.c(intent);
    }

    public static int p(Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(intent);
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            return 0;
        }
        return intentH.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    public static void r(Intent intent, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(intent, i10);
            return;
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            intentH = new Intent();
        }
        intentH.putExtra("android.remoteinput.resultsSource", i10);
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", intentH));
    }

    public boolean e() {
        return this.f28911d;
    }

    public Set f() {
        return this.f28914g;
    }

    public CharSequence[] g() {
        return this.f28910c;
    }

    public int j() {
        return this.f28912e;
    }

    public Bundle l() {
        return this.f28913f;
    }

    public CharSequence m() {
        return this.f28909b;
    }

    public String n() {
        return this.f28908a;
    }

    public boolean q() {
        if (e()) {
            return false;
        }
        return ((g() != null && g().length != 0) || f() == null || f().isEmpty()) ? false : true;
    }
}
