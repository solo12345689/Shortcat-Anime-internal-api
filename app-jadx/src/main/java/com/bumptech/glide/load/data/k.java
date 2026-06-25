package com.bumptech.glide.load.data;

import b5.V;
import com.bumptech.glide.load.data.e;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f35714a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V4.b f35715a;

        public a(V4.b bVar) {
            this.f35715a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f35715a);
        }
    }

    public k(InputStream inputStream, V4.b bVar) {
        V v10 = new V(inputStream, bVar);
        this.f35714a = v10;
        v10.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f35714a.g();
    }

    public void c() {
        this.f35714a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f35714a.reset();
        return this.f35714a;
    }
}
