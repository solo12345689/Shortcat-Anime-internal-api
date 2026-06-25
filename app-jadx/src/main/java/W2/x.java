package w2;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f62894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f62895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f62896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f62897g;

    public x(int i10, String str, IOException iOException, Map map, o oVar, byte[] bArr) {
        super("Response code: " + i10, iOException, oVar, 2004, 1);
        this.f62894d = i10;
        this.f62895e = str;
        this.f62896f = map;
        this.f62897g = bArr;
    }
}
