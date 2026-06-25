package F3;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VolumeProvider f6531e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends VolumeProvider {
        a(int i10, int i11, int i12, String str) {
            super(i10, i11, i12, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            x.this.b(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            x.this.c(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends VolumeProvider {
        b(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            x.this.b(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            x.this.c(i10);
        }
    }

    public x(int i10, int i11, int i12, String str) {
        this.f6527a = i10;
        this.f6528b = i11;
        this.f6530d = i12;
        this.f6529c = str;
    }

    public Object a() {
        x xVar;
        if (this.f6531e != null) {
            xVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            xVar = this;
            xVar.f6531e = xVar.new a(this.f6527a, this.f6528b, this.f6530d, this.f6529c);
        } else {
            xVar = this;
            xVar.f6531e = new b(xVar.f6527a, xVar.f6528b, xVar.f6530d);
        }
        return xVar.f6531e;
    }

    public abstract void b(int i10);

    public abstract void c(int i10);

    public final void d(int i10) {
        this.f6530d = i10;
        ((VolumeProvider) a()).setCurrentVolume(i10);
    }
}
