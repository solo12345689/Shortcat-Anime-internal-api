package T2;

import T2.e;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import t2.C6630q;
import t2.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f17046j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f17047k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f17048l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f17049m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f17050n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f17052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f17053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C6630q f17054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17059i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f17061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f17062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f17063d;

        public a(e.b bVar) {
            this.f17060a = bVar.a();
            this.f17061b = r.e(bVar.f17044c);
            this.f17062c = r.e(bVar.f17045d);
            int i10 = bVar.f17043b;
            if (i10 == 1) {
                this.f17063d = 5;
            } else if (i10 != 2) {
                this.f17063d = 4;
            } else {
                this.f17063d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f17037a;
        e.a aVar2 = eVar.f17038b;
        return aVar.b() == 1 && aVar.a(0).f17042a == 0 && aVar2.b() == 1 && aVar2.a(0).f17042a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f17053c : this.f17052b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f17051a;
        GLES20.glUniformMatrix3fv(this.f17056f, 1, false, i11 == 1 ? z10 ? f17048l : f17047k : i11 == 2 ? z10 ? f17050n : f17049m : f17046j, 0);
        GLES20.glUniformMatrix4fv(this.f17055e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f17059i, 0);
        try {
            r.b();
        } catch (r.a e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f17057g, 3, 5126, false, 12, (Buffer) aVar.f17061b);
        try {
            r.b();
        } catch (r.a e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f17058h, 2, 5126, false, 8, (Buffer) aVar.f17062c);
        try {
            r.b();
        } catch (r.a e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f17063d, 0, aVar.f17060a);
        try {
            r.b();
        } catch (r.a e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            C6630q c6630q = new C6630q("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f17054d = c6630q;
            this.f17055e = c6630q.j("uMvpMatrix");
            this.f17056f = this.f17054d.j("uTexMatrix");
            this.f17057g = this.f17054d.e("aPosition");
            this.f17058h = this.f17054d.e("aTexCoords");
            this.f17059i = this.f17054d.j("uTexture");
        } catch (r.a e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f17051a = eVar.f17039c;
            a aVar = new a(eVar.f17037a.a(0));
            this.f17052b = aVar;
            if (!eVar.f17040d) {
                aVar = new a(eVar.f17038b.a(0));
            }
            this.f17053c = aVar;
        }
    }
}
