package Fd;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class G {
    public static final String a(String str, String tip) {
        AbstractC5504s.h(tip, "tip");
        if (str == null) {
            str = "Expo-video playback service binder error";
        }
        return str + ". " + tip;
    }

    public static /* synthetic */ String b(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "Make sure that the expo-video config plugin is properly configured to avoid issues with displaying the now playing notification and sustaining background playback.";
        }
        return a(str, str2);
    }
}
