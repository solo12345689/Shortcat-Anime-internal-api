package com.google.android.gms.internal.gtm;

import F8.n;
import R8.AbstractC2115p;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfe extends zzbs {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfo zzc;

    zzfe(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzbt.zza, Build.VERSION.RELEASE, zzfs.zzd(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(java.net.URL r6, byte[] r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing http post connection output stream"
            R8.AbstractC2115p.l(r6)
            R8.AbstractC2115p.l(r7)
            int r1 = r7.length
            java.lang.String r2 = "POST bytes, url"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r5.zzH(r2, r3, r6)
            boolean r2 = com.google.android.gms.internal.gtm.zzbr.zzV()
            if (r2 == 0) goto L22
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            java.lang.String r3 = "Post payload\n"
            r5.zzP(r3, r2)
        L22:
            r2 = 0
            android.content.Context r3 = r5.zzo()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            r3.getPackageName()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.net.HttpURLConnection r6 = r5.zzb(r6)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            r3 = 1
            r6.setDoOutput(r3)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r6.setFixedLengthStreamingMode(r1)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r6.connect()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r2.write(r7)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r5.zzk(r6)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 != r1) goto L57
            com.google.android.gms.internal.gtm.zzbq r7 = r5.zzs()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r7.zzi()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r7 = r1
            goto L57
        L53:
            r7 = move-exception
            goto L93
        L55:
            r7 = move-exception
            goto L6c
        L57:
            java.lang.String r1 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r5.zzG(r1, r3)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r2.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r1 = move-exception
            r5.zzK(r0, r1)
        L68:
            r6.disconnect()
            return r7
        L6c:
            r4 = r2
            r2 = r6
            r6 = r4
            goto L79
        L70:
            r6 = move-exception
            r7 = r6
            goto L76
        L73:
            r6 = move-exception
            r7 = r6
            goto L78
        L76:
            r6 = r2
            goto L93
        L78:
            r6 = r2
        L79:
            java.lang.String r1 = "Network POST connection error"
            r5.zzS(r1, r7)     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L88
            r6.close()     // Catch: java.io.IOException -> L84
            goto L88
        L84:
            r6 = move-exception
            r5.zzK(r0, r6)
        L88:
            if (r2 == 0) goto L8d
            r2.disconnect()
        L8d:
            r6 = 0
            return r6
        L8f:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L93:
            if (r2 == 0) goto L9d
            r2.close()     // Catch: java.io.IOException -> L99
            goto L9d
        L99:
            r1 = move-exception
            r5.zzK(r0, r1)
        L9d:
            if (r6 == 0) goto La2
            r6.disconnect()
        La2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzg(java.net.URL, byte[]):int");
    }

    private final URL zzh() {
        zzw();
        String strZzi = zzct.zzi();
        zzw();
        String strZzb = zzeu.zzt.zzb();
        try {
            return new URL(strZzb.length() != 0 ? strZzi.concat(strZzb) : new String(strZzi));
        } catch (MalformedURLException e10) {
            zzK("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    private final URL zzi(zzex zzexVar) {
        String str;
        String strConcat;
        if (zzexVar.zzh()) {
            zzw();
            String strZzi = zzct.zzi();
            zzw();
            String strZzj = zzct.zzj();
            if (strZzj.length() != 0) {
                strConcat = strZzi.concat(strZzj);
            } else {
                str = new String(strZzi);
                strConcat = str;
            }
        } else {
            zzw();
            String strZzk = zzct.zzk();
            zzw();
            String strZzj2 = zzct.zzj();
            if (strZzj2.length() != 0) {
                strConcat = strZzk.concat(strZzj2);
            } else {
                str = new String(strZzk);
                strConcat = str;
            }
        }
        try {
            return new URL(strConcat);
        } catch (MalformedURLException e10) {
            zzK("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    private final URL zzj(zzex zzexVar, String str) {
        String string;
        if (zzexVar.zzh()) {
            zzw();
            String strZzi = zzct.zzi();
            zzw();
            String strZzj = zzct.zzj();
            int length = strZzi.length();
            StringBuilder sb2 = new StringBuilder(length + 1 + strZzj.length() + str.length());
            sb2.append(strZzi);
            sb2.append(strZzj);
            sb2.append("?");
            sb2.append(str);
            string = sb2.toString();
        } else {
            zzw();
            String strZzk = zzct.zzk();
            zzw();
            String strZzj2 = zzct.zzj();
            int length2 = strZzk.length();
            StringBuilder sb3 = new StringBuilder(length2 + 1 + strZzj2.length() + str.length());
            sb3.append(strZzk);
            sb3.append(strZzj2);
            sb3.append("?");
            sb3.append(str);
            string = sb3.toString();
        }
        try {
            return new URL(string);
        } catch (MalformedURLException e10) {
            zzK("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0014, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0015, code lost:
    
        zzK("Error closing http connection input stream", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0018, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk(java.net.HttpURLConnection r4) throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L1b
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L19
        La:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 > 0) goto La
            r4.close()     // Catch: java.io.IOException -> L14
            return
        L14:
            r4 = move-exception
            r3.zzK(r0, r4)
            return
        L19:
            r1 = move-exception
            goto L1d
        L1b:
            r1 = move-exception
            r4 = 0
        L1d:
            if (r4 == 0) goto L27
            r4.close()     // Catch: java.io.IOException -> L23
            goto L27
        L23:
            r4 = move-exception
            r3.zzK(r0, r4)
        L27:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzk(java.net.HttpURLConnection):void");
    }

    private static final void zzl(StringBuilder sb2, String str, String str2) {
        if (sb2.length() != 0) {
            sb2.append('&');
        }
        sb2.append(URLEncoder.encode(str, Constants.ENCODING));
        sb2.append('=');
        sb2.append(URLEncoder.encode(str2, Constants.ENCODING));
    }

    final String zza(zzex zzexVar, boolean z10) {
        AbstractC2115p.l(zzexVar);
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzexVar.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zzl(sb2, key, entry.getValue());
                }
            }
            zzl(sb2, "ht", String.valueOf(zzexVar.zzd()));
            zzl(sb2, "qt", String.valueOf(zzC().a() - zzexVar.zzd()));
            zzw();
            if (z10) {
                long jZzc = zzexVar.zzc();
                zzl(sb2, "z", jZzc != 0 ? String.valueOf(jZzc) : String.valueOf(zzexVar.zzb()));
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            zzK("Failed to encode name or value", e10);
            return null;
        }
    }

    final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzw();
        httpURLConnection.setConnectTimeout(zzeu.zzE.zzb().intValue());
        zzw();
        httpURLConnection.setReadTimeout(zzeu.zzF.zzb().intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.zzb);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0328 A[EDGE_INSN: B:385:0x0328->B:361:0x0328 BREAK  A[LOOP:1: B:309:0x0234->B:388:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:? A[LOOP:1: B:309:0x0234->B:388:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.Long> zzc(java.util.List<com.google.android.gms.internal.gtm.zzex> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzc(java.util.List):java.util.List");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        zzP("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo activeNetworkInfo;
        n.d();
        zzW();
        try {
            activeNetworkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzO("No network connectivity");
        return false;
    }
}
