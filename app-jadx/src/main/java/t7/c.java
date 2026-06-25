package T7;

import android.content.Context;
import com.facebook.soloader.C;
import com.facebook.soloader.C3328c;
import com.facebook.soloader.C3331f;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17323a;

    public c(Context context) {
        this.f17323a = context;
    }

    @Override // T7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/app missing libraries.");
        File file = new File(this.f17323a.getApplicationInfo().nativeLibraryDir);
        if (!file.exists()) {
            p.b("SoLoader", "Native library directory " + file + " does not exist, exiting /data/app recovery.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = eArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            E e10 = eArr[i10];
            if (e10 instanceof C3328c) {
                C3328c c3328c = (C3328c) e10;
                try {
                    for (G.c cVar : c3328c.o()) {
                        if (!new File(file, cVar.f38548a).exists()) {
                            arrayList.add(cVar.f38548a);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        p.b("SoLoader", "No libraries missing from " + file);
                        return false;
                    }
                    p.b("SoLoader", "Missing libraries from " + file + ": " + arrayList.toString() + ", will run prepare on tbe backup so source");
                    c3328c.e(0);
                } catch (Exception e11) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/app failure ", e11);
                    return false;
                }
            } else {
                i10++;
            }
        }
        for (E e12 : eArr) {
            if ((e12 instanceof C3331f) && !(e12 instanceof C3328c)) {
                ((C3331f) e12).h();
            }
        }
        p.b("SoLoader", "Successfully recovered from /data/app disk failure.");
        return true;
    }
}
