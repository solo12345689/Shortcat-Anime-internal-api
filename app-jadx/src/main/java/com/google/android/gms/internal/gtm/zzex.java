package com.google.android.gms.internal.gtm;

import R8.AbstractC2115p;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzex {
    private final Map<String, String> zza;
    private final List<zzcp> zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;
    private final boolean zzf;
    private final String zzg;

    public zzex(zzbr zzbrVar, Map<String, String> map, long j10, boolean z10, long j11, int i10, List<zzcp> list) {
        String strZzb;
        String strZzj;
        String strZzj2;
        AbstractC2115p.l(zzbrVar);
        AbstractC2115p.l(map);
        this.zzd = j10;
        this.zzf = z10;
        this.zzc = j11;
        this.zze = i10;
        this.zzb = list != null ? list : Collections.EMPTY_LIST;
        if (list != null) {
            for (zzcp zzcpVar : list) {
                if ("appendVersion".equals(zzcpVar.zza())) {
                    strZzb = zzcpVar.zzb();
                    break;
                }
            }
            strZzb = null;
        } else {
            strZzb = null;
        }
        this.zzg = true != TextUtils.isEmpty(strZzb) ? strZzb : null;
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (zzl(entry.getKey()) && (strZzj2 = zzj(zzbrVar, entry.getKey())) != null) {
                map2.put(strZzj2, zzk(zzbrVar, entry.getValue()));
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (!zzl(entry2.getKey()) && (strZzj = zzj(zzbrVar, entry2.getKey())) != null) {
                map2.put(strZzj, zzk(zzbrVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzfs.zzg(map2, "_v", this.zzg);
            if (this.zzg.equals("ma4.0.0") || this.zzg.equals("ma4.0.1")) {
                map2.remove("adid");
            }
        }
        this.zza = Collections.unmodifiableMap(map2);
    }

    private final String zzi(String str, String str2) {
        AbstractC2115p.f(str);
        AbstractC2115p.b(!str.startsWith("&"), "Short param name required");
        String str3 = this.zza.get(str);
        return str3 != null ? str3 : str2;
    }

    private static String zzj(zzbr zzbrVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String string = obj.toString();
        if (string.startsWith("&")) {
            string = string.substring(1);
        }
        int length = string.length();
        if (length > 256) {
            string = string.substring(0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            zzbrVar.zzT("Hit param name is too long and will be trimmed", Integer.valueOf(length), string);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    private static String zzk(zzbr zzbrVar, Object obj) {
        String string = obj == null ? "" : obj.toString();
        int length = string.length();
        if (length <= 8192) {
            return string;
        }
        String strSubstring = string.substring(0, 8192);
        zzbrVar.zzT("Hit param value is too long and will be trimmed", Integer.valueOf(length), strSubstring);
        return strSubstring;
    }

    private static boolean zzl(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ht=");
        sb2.append(this.zzd);
        if (this.zzc != 0) {
            sb2.append(", dbId=");
            sb2.append(this.zzc);
        }
        if (this.zze != 0) {
            sb2.append(", appUID=");
            sb2.append(this.zze);
        }
        ArrayList arrayList = new ArrayList(this.zza.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) arrayList.get(i10);
            sb2.append(", ");
            sb2.append(str);
            sb2.append(f.f34695b);
            sb2.append(this.zza.get(str));
        }
        return sb2.toString();
    }

    public final long zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return zzfs.zza(zzi("_s", "0"));
    }

    public final long zzd() {
        return this.zzd;
    }

    public final Map<String, String> zzg() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzf;
    }
}
