package i4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48665a = i.i("InputMerger");

    public static g a(String str) {
        try {
            return (g) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e10) {
            i.e().d(f48665a, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract androidx.work.b b(List list);
}
