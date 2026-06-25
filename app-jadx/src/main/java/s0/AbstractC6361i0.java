package s0;

import android.graphics.Shader;

/* JADX INFO: renamed from: s0.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6361i0 {

    /* JADX INFO: renamed from: s0.i0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends A1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Shader f58953a;

        a(Shader shader) {
            this.f58953a = shader;
        }

        @Override // s0.A1
        /* JADX INFO: renamed from: createShader-uvyYCjk */
        public Shader mo483createShaderuvyYCjk(long j10) {
            return this.f58953a;
        }
    }

    public static final A1 a(Shader shader) {
        return new a(shader);
    }
}
