package oc;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import oc.InterfaceC5856e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements j, InterfaceC5856e, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaScriptTypedArray f55354a;

    public g(JavaScriptTypedArray rawArray) {
        AbstractC5504s.h(rawArray, "rawArray");
        this.f55354a = rawArray;
    }

    @Override // oc.i
    public JavaScriptTypedArray b() {
        return this.f55354a;
    }

    @Override // oc.j
    public int d() {
        return this.f55354a.d();
    }

    @Override // oc.InterfaceC5856e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        if (i10 < 0 || i10 >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return Integer.valueOf(f(i10 * 4));
    }

    public int f(int i10) {
        return this.f55354a.read4Byte(i10);
    }

    @Override // oc.j
    public int getLength() {
        return this.f55354a.getLength();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return InterfaceC5856e.a.a(this);
    }

    @Override // oc.j
    public ByteBuffer toDirectBuffer() {
        return this.f55354a.toDirectBuffer();
    }

    @Override // oc.j
    public void write(byte[] buffer, int i10, int i11) {
        AbstractC5504s.h(buffer, "buffer");
        this.f55354a.write(buffer, i10, i11);
    }
}
