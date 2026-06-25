package pd;

import Td.L;
import android.util.Log;
import expo.modules.updates.db.UpdatesDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import rd.C6306a;

/* JADX INFO: renamed from: pd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5999d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5999d f56002a = new C5999d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f56003b = C5999d.class.getSimpleName();

    private C5999d() {
    }

    public static final void a(expo.modules.updates.d configuration, UpdatesDatabase database, File file, rd.d dVar, Bd.h selectionPolicy) {
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(selectionPolicy, "selectionPolicy");
        if (dVar == null) {
            Log.d(f56003b, "Tried to reap while no update was launched; aborting");
            return;
        }
        database.Q().b(selectionPolicy.b(database.Q().i(), dVar, yd.k.f65039a.f(database, configuration)));
        List<C6306a> listC = database.O().c();
        ArrayList<C6306a> arrayList = new ArrayList();
        for (C6306a c6306a : listC) {
            if (c6306a.k()) {
                File file2 = new File(file, c6306a.m());
                try {
                    if (file2.exists() && !file2.delete()) {
                        Log.e(f56003b, "Failed to delete asset with URL " + c6306a.s() + " at path " + file2);
                        arrayList.add(c6306a);
                    }
                    L l10 = L.f17438a;
                } catch (Exception e10) {
                    Log.e(f56003b, "Failed to delete asset with URL " + c6306a.s() + " at path " + file2, e10);
                    arrayList.add(c6306a);
                }
            } else {
                Log.e(f56003b, "Tried to delete asset with URL " + c6306a.s() + " but it was not marked for deletion");
            }
        }
        for (C6306a c6306a2 : arrayList) {
            File file3 = new File(file, c6306a2.m());
            try {
                if (!file3.exists() || file3.delete()) {
                    arrayList.remove(c6306a2);
                } else {
                    Log.e(f56003b, "Retried and failed again deleting asset with URL " + c6306a2.s() + " at path " + file3);
                }
            } catch (Exception e11) {
                Log.e(f56003b, "Retried and failed again deleting asset with URL " + c6306a2.s() + " at path " + file3, e11);
                arrayList.add(c6306a2);
            }
        }
    }
}
