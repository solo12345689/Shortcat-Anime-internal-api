package C2;

import P9.AbstractC2011u;
import P9.AbstractC2012v;
import P9.AbstractC2013w;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import q2.AbstractC6079K;
import q2.C6088c;
import q2.C6109x;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: C2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1157e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1157e f2725c = new C1157e(AbstractC2011u.B(C0030e.f2730d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC2011u f2726d = AbstractC2011u.F(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final AbstractC2012v f2727e = new AbstractC2012v.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f2728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2729b;

    /* JADX INFO: renamed from: C2.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        private static AbstractC2013w a() {
            AbstractC2013w.a aVarI = new AbstractC2013w.a().i(8, 7);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                aVarI.i(26, 27);
            }
            if (i10 >= 33) {
                aVarI.a(30);
            }
            return aVarI.l();
        }

        public static boolean b(AudioManager audioManager, C1162j c1162j) {
            AudioDeviceInfo[] devices = c1162j == null ? ((AudioManager) AbstractC6614a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{c1162j.f2757a};
            AbstractC2013w abstractC2013wA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (abstractC2013wA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: C2.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {
        public static AbstractC2011u a(C6088c c6088c) {
            AbstractC2011u.a aVarT = AbstractC2011u.t();
            P9.X it = C1157e.f2727e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= t2.a0.M(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c6088c.b().f56759a)) {
                    aVarT.a(num);
                }
            }
            aVarT.a(2);
            return aVarT.k();
        }

        public static int b(int i10, int i11, C6088c c6088c) {
            for (int i12 = 10; i12 > 0; i12--) {
                int iO = t2.a0.O(i12);
                if (iO != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iO).build(), c6088c.b().f56759a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: C2.e$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {
        public static C1157e a(AudioManager audioManager, C6088c c6088c) {
            return new C1157e(C1157e.c(audioManager.getDirectProfilesForAttributes(c6088c.b().f56759a)));
        }

        public static C1162j b(AudioManager audioManager, C6088c c6088c) {
            List audioDevicesForAttributes = ((AudioManager) AbstractC6614a.e(audioManager)).getAudioDevicesForAttributes(c6088c.b().f56759a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C1162j((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        }
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC2011u c(List list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(S9.f.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile audioProfileA = AbstractC1153a.a(list.get(i10));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (t2.a0.L0(format) || f2727e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) AbstractC6614a.e((Set) map.get(Integer.valueOf(format)))).addAll(S9.f.c(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(S9.f.c(audioProfileA.getChannelMasks())));
                    }
                }
            }
        }
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        for (Map.Entry entry : map.entrySet()) {
            aVarT.a(new C0030e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return aVarT.k();
    }

    private static AbstractC2011u d(int[] iArr, int i10) {
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            aVarT.a(new C0030e(i11, i10));
        }
        return aVarT.k();
    }

    static C1157e e(Context context, Intent intent, C6088c c6088c, C1162j c1162j) {
        AudioManager audioManagerC = r2.m.c(context);
        if (c1162j == null) {
            c1162j = Build.VERSION.SDK_INT >= 33 ? d.b(audioManagerC, c6088c) : null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && (t2.a0.P0(context) || t2.a0.I0(context))) {
            return d.a(audioManagerC, c6088c);
        }
        if (b.b(audioManagerC, c1162j)) {
            return f2725c;
        }
        AbstractC2013w.a aVar = new AbstractC2013w.a();
        aVar.a(2);
        if (i10 >= 29 && (t2.a0.P0(context) || t2.a0.I0(context))) {
            aVar.j(c.a(c6088c));
            return new C1157e(d(S9.f.o(aVar.l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.j(f2726d);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C1157e(d(S9.f.o(aVar.l()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(S9.f.c(intArrayExtra));
        }
        return new C1157e(d(S9.f.o(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    static C1157e f(Context context, C6088c c6088c, C1162j c1162j) {
        return e(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c6088c, c1162j);
    }

    private static int g(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(Build.DEVICE) && i10 == 1) {
            i10 = 2;
        }
        return t2.a0.O(i10);
    }

    static Uri i() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157e)) {
            return false;
        }
        C1157e c1157e = (C1157e) obj;
        return t2.a0.v(this.f2728a, c1157e.f2728a) && this.f2729b == c1157e.f2729b;
    }

    public Pair h(C6109x c6109x, C6088c c6088c) {
        int iF = AbstractC6079K.f((String) AbstractC6614a.e(c6109x.f57022o), c6109x.f57018k);
        if (!f2727e.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        if (iF == 18 && !k(18)) {
            iF = 6;
        } else if ((iF == 8 && !k(8)) || (iF == 30 && !k(30))) {
            iF = 7;
        }
        if (!k(iF)) {
            return null;
        }
        C0030e c0030e = (C0030e) AbstractC6614a.e((C0030e) this.f2728a.get(iF));
        int iB = c6109x.f56997G;
        if (iB == -1 || iF == 18) {
            int i10 = c6109x.f56998H;
            if (i10 == -1) {
                i10 = 48000;
            }
            iB = c0030e.b(i10, c6088c);
        } else if (!c6109x.f57022o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!c0030e.c(iB)) {
                return null;
            }
        } else if (iB > 10) {
            return null;
        }
        int iG = g(iB);
        if (iG == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iG));
    }

    public int hashCode() {
        return this.f2729b + (t2.a0.w(this.f2728a) * 31);
    }

    public boolean j(C6109x c6109x, C6088c c6088c) {
        return h(c6109x, c6088c) != null;
    }

    public boolean k(int i10) {
        return t2.a0.t(this.f2728a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f2729b + ", audioProfiles=" + this.f2728a + "]";
    }

    private C1157e(List list) {
        this.f2728a = new SparseArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0030e c0030e = (C0030e) list.get(i10);
            this.f2728a.put(c0030e.f2731a, c0030e);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f2728a.size(); i11++) {
            iMax = Math.max(iMax, ((C0030e) this.f2728a.valueAt(i11)).f2732b);
        }
        this.f2729b = iMax;
    }

    /* JADX INFO: renamed from: C2.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0030e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0030e f2730d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractC2013w f2733c;

        static {
            f2730d = Build.VERSION.SDK_INT >= 33 ? new C0030e(2, a(10)) : new C0030e(2, 10);
        }

        public C0030e(int i10, Set set) {
            this.f2731a = i10;
            AbstractC2013w abstractC2013wV = AbstractC2013w.v(set);
            this.f2733c = abstractC2013wV;
            P9.X it = abstractC2013wV.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f2732b = iMax;
        }

        private static AbstractC2013w a(int i10) {
            AbstractC2013w.a aVar = new AbstractC2013w.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(t2.a0.O(i11)));
            }
            return aVar.l();
        }

        public int b(int i10, C6088c c6088c) {
            return this.f2733c != null ? this.f2732b : Build.VERSION.SDK_INT >= 29 ? c.b(this.f2731a, i10, c6088c) : ((Integer) AbstractC6614a.e((Integer) C1157e.f2727e.getOrDefault(Integer.valueOf(this.f2731a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f2733c == null) {
                return i10 <= this.f2732b;
            }
            int iO = t2.a0.O(i10);
            if (iO == 0) {
                return false;
            }
            return this.f2733c.contains(Integer.valueOf(iO));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0030e)) {
                return false;
            }
            C0030e c0030e = (C0030e) obj;
            return this.f2731a == c0030e.f2731a && this.f2732b == c0030e.f2732b && Objects.equals(this.f2733c, c0030e.f2733c);
        }

        public int hashCode() {
            int i10 = ((this.f2731a * 31) + this.f2732b) * 31;
            AbstractC2013w abstractC2013w = this.f2733c;
            return i10 + (abstractC2013w == null ? 0 : abstractC2013w.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f2731a + ", maxChannelCount=" + this.f2732b + ", channelMasks=" + this.f2733c + "]";
        }

        public C0030e(int i10, int i11) {
            this.f2731a = i10;
            this.f2732b = i11;
            this.f2733c = null;
        }
    }
}
