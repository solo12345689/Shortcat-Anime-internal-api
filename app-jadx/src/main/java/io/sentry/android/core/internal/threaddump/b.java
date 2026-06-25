package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f49796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49797b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49799d;

    public b(ArrayList arrayList) {
        this.f49796a = arrayList;
        this.f49798c = arrayList.size();
    }

    public static b c(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new b(arrayList);
            }
            i10++;
            arrayList.add(new a(i10, line));
        }
    }

    public boolean a() {
        return this.f49799d < this.f49798c;
    }

    public a b() {
        int i10 = this.f49799d;
        if (i10 < this.f49797b || i10 >= this.f49798c) {
            return null;
        }
        ArrayList arrayList = this.f49796a;
        this.f49799d = i10 + 1;
        return (a) arrayList.get(i10);
    }

    public void d() {
        this.f49799d--;
    }
}
