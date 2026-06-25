package f6;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: f6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4778a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5.a f46907b;

    public C4778a(int i10, C5.a bitmap) {
        AbstractC5504s.h(bitmap, "bitmap");
        this.f46906a = i10;
        this.f46907b = bitmap;
    }

    public final C5.a a() {
        return this.f46907b;
    }

    public final int b() {
        return this.f46906a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46907b.close();
    }
}
