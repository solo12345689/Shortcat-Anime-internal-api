package v3;

import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: v3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6839a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f61865f;

    private C6839a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f61860a = i10;
        this.f61861b = i11;
        this.f61862c = i12;
        this.f61863d = i13;
        this.f61864e = i14;
        this.f61865f = i15;
    }

    public static C6839a a(String str) {
        AbstractC6614a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), f.f34694a);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            String strE = O9.c.e(strArrSplit[i15].trim());
            strE.getClass();
            switch (strE) {
                case "end":
                    i12 = i15;
                    break;
                case "text":
                    i14 = i15;
                    break;
                case "layer":
                    i10 = i15;
                    break;
                case "start":
                    i11 = i15;
                    break;
                case "style":
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new C6839a(i10, i11, i12, i13, i14, strArrSplit.length);
    }
}
