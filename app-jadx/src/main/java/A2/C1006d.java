package A2;

import C2.InterfaceC1176y;
import C2.InterfaceC1177z;
import C2.P;
import C2.a0;
import I2.a;
import I2.b;
import J2.C1730j;
import J2.InterfaceC1737q;
import S2.C2135k;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.N0;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.ArrayList;
import t2.AbstractC6635w;

/* JADX INFO: renamed from: A2.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C1006d implements O {

    /* JADX INFO: renamed from: a */
    private final Context f198a;

    /* JADX INFO: renamed from: b */
    private final C1730j f199b;

    /* JADX INFO: renamed from: e */
    private boolean f202e;

    /* JADX INFO: renamed from: g */
    private boolean f204g;

    /* JADX INFO: renamed from: h */
    private boolean f205h;

    /* JADX INFO: renamed from: i */
    private boolean f206i;

    /* JADX INFO: renamed from: j */
    private boolean f207j;

    /* JADX INFO: renamed from: l */
    private boolean f209l;

    /* JADX INFO: renamed from: c */
    private int f200c = 0;

    /* JADX INFO: renamed from: d */
    private long f201d = HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS;

    /* JADX INFO: renamed from: f */
    private J2.E f203f = J2.E.f9326a;

    /* JADX INFO: renamed from: k */
    private long f208k = -9223372036854775807L;

    public C1006d(Context context) {
        this.f198a = context;
        this.f199b = new C1730j(context);
    }

    @Override // A2.O
    public N0 a(N0 n02, Handler handler, S2.K k10, InterfaceC1176y interfaceC1176y, O2.h hVar, K2.b bVar) {
        if (n02.f() == 2) {
            return j(n02, this.f198a, this.f200c, this.f203f, this.f202e, handler, k10, this.f201d);
        }
        return null;
    }

    @Override // A2.O
    public N0[] b(Handler handler, S2.K k10, InterfaceC1176y interfaceC1176y, O2.h hVar, K2.b bVar) {
        Handler handler2;
        ArrayList arrayList = new ArrayList();
        l(this.f198a, this.f200c, this.f203f, this.f202e, handler, k10, this.f201d, arrayList);
        InterfaceC1177z interfaceC1177zD = d(this.f198a, this.f204g, this.f205h);
        if (interfaceC1177zD != null) {
            handler2 = handler;
            c(this.f198a, this.f200c, this.f203f, this.f202e, interfaceC1177zD, handler2, interfaceC1176y, arrayList);
        } else {
            handler2 = handler;
        }
        k(this.f198a, hVar, handler2.getLooper(), this.f200c, arrayList);
        h(this.f198a, bVar, handler2.getLooper(), this.f200c, arrayList);
        e(this.f198a, this.f200c, arrayList);
        f(this.f198a, arrayList);
        i(this.f198a, handler2, this.f200c, arrayList);
        return (N0[]) arrayList.toArray(new N0[0]);
    }

    protected void c(Context context, int i10, J2.E e10, boolean z10, InterfaceC1177z interfaceC1177z, Handler handler, InterfaceC1176y interfaceC1176y, ArrayList arrayList) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        arrayList.add(new a0(context, n(), e10, z10, handler, interfaceC1176y, interfaceC1177z));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (N0) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, InterfaceC1176y.class, InterfaceC1177z.class).newInstance(context, handler, interfaceC1176y, interfaceC1177z));
                    AbstractC6635w.g("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating MIDI extension", e11);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i12 = i11 + 1;
            } catch (Exception e12) {
                throw new IllegalStateException("Error instantiating Opus extension", e12);
            }
        } catch (ClassNotFoundException unused3) {
        }
        try {
            arrayList.add(i11, (N0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC1176y.class, InterfaceC1177z.class).newInstance(handler, interfaceC1176y, interfaceC1177z));
            AbstractC6635w.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
        } catch (ClassNotFoundException unused4) {
            i11 = i12;
            i12 = i11;
        }
        try {
            try {
                i13 = i12 + 1;
                try {
                    arrayList.add(i12, (N0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1176y.class, InterfaceC1177z.class).newInstance(handler, interfaceC1176y, interfaceC1177z));
                    AbstractC6635w.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                    i12 = i13;
                    i13 = i12;
                }
            } catch (Exception e13) {
                throw new IllegalStateException("Error instantiating FLAC extension", e13);
            }
        } catch (ClassNotFoundException unused6) {
        }
        try {
            try {
                i14 = i13 + 1;
            } catch (Exception e14) {
                throw new IllegalStateException("Error instantiating FFmpeg extension", e14);
            }
        } catch (ClassNotFoundException unused7) {
        }
        try {
            arrayList.add(i13, (N0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1176y.class, InterfaceC1177z.class).newInstance(handler, interfaceC1176y, interfaceC1177z));
            AbstractC6635w.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
        } catch (ClassNotFoundException unused8) {
            i13 = i14;
            i14 = i13;
        }
        try {
            try {
                i15 = i14 + 1;
                try {
                    arrayList.add(i14, (N0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, InterfaceC1176y.class, InterfaceC1177z.class).newInstance(context, handler, interfaceC1176y, interfaceC1177z));
                    AbstractC6635w.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                } catch (ClassNotFoundException unused9) {
                    i14 = i15;
                    i15 = i14;
                }
            } catch (Exception e15) {
                throw new IllegalStateException("Error instantiating IAMF extension", e15);
            }
        } catch (ClassNotFoundException unused10) {
        }
        try {
            arrayList.add(i15, (N0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, InterfaceC1176y.class, InterfaceC1177z.class).newInstance(handler, interfaceC1176y, interfaceC1177z));
            AbstractC6635w.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
        } catch (ClassNotFoundException unused11) {
        } catch (Exception e16) {
            throw new IllegalStateException("Error instantiating MPEG-H extension", e16);
        }
    }

    protected InterfaceC1177z d(Context context, boolean z10, boolean z11) {
        return new P.g(context).m(z10).l(z11).k();
    }

    protected void e(Context context, int i10, ArrayList arrayList) {
        arrayList.add(new T2.b());
    }

    protected void f(Context context, ArrayList arrayList) {
        g(arrayList);
    }

    protected void g(ArrayList arrayList) {
        arrayList.add(new I2.e(o(this.f198a), null));
    }

    protected void h(Context context, K2.b bVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new K2.c(bVar, looper));
        arrayList.add(new K2.c(bVar, looper));
    }

    protected N0 j(N0 n02, Context context, int i10, J2.E e10, boolean z10, Handler handler, S2.K k10, long j10) {
        if (!this.f206i || n02.getClass() != C2135k.class) {
            return null;
        }
        C2135k.d dVarP = new C2135k.d(context).s(n()).x(e10).r(j10).t(z10).u(handler).v(k10).w(50).q(this.f207j).p(this.f208k);
        if (Build.VERSION.SDK_INT >= 34) {
            dVarP = dVarP.o(this.f209l);
        }
        return dVarP.n();
    }

    protected void k(Context context, O2.h hVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new O2.i(hVar, looper));
    }

    protected void l(Context context, int i10, J2.E e10, boolean z10, Handler handler, S2.K k10, long j10, ArrayList arrayList) {
        int i11;
        int i12;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        C2135k.d dVarP = new C2135k.d(context).s(n()).x(e10).r(j10).t(z10).u(handler).v(k10).w(50).q(this.f207j).p(this.f208k);
        if (Build.VERSION.SDK_INT >= 34) {
            dVarP = dVarP.o(this.f209l);
        }
        arrayList.add(dVarP.n());
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating VP9 extension", e11);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (N0) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, S2.K.class, cls).newInstance(Long.valueOf(j10), handler, k10, 50));
            AbstractC6635w.g("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i11;
            i11 = size;
        }
        try {
            try {
                i12 = i11 + 1;
                try {
                    arrayList.add(i11, (N0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, S2.K.class, cls).newInstance(Long.valueOf(j10), handler, k10, 50));
                    AbstractC6635w.g("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i11 = i12;
                    i12 = i11;
                }
            } catch (Exception e12) {
                throw new IllegalStateException("Error instantiating AV1 extension", e12);
            }
        } catch (ClassNotFoundException unused4) {
        }
        try {
            arrayList.add(i12, (N0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, S2.K.class, cls).newInstance(Long.valueOf(j10), handler, k10, 50));
            AbstractC6635w.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
        } catch (ClassNotFoundException unused5) {
        } catch (Exception e13) {
            throw new IllegalStateException("Error instantiating FFmpeg extension", e13);
        }
    }

    public final C1006d m() {
        this.f199b.c();
        return this;
    }

    protected InterfaceC1737q.b n() {
        return this.f199b;
    }

    protected b.a o(Context context) {
        return new a.c(context);
    }

    public final C1006d p(boolean z10) {
        this.f202e = z10;
        return this;
    }

    protected void i(Context context, Handler handler, int i10, ArrayList arrayList) {
    }
}
