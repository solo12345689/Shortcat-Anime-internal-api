package androidx.media;

import androidx.versionedparcelable.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f30305a = aVar.p(audioAttributesImplBase.f30305a, 1);
        audioAttributesImplBase.f30306b = aVar.p(audioAttributesImplBase.f30306b, 2);
        audioAttributesImplBase.f30307c = aVar.p(audioAttributesImplBase.f30307c, 3);
        audioAttributesImplBase.f30308d = aVar.p(audioAttributesImplBase.f30308d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f30305a, 1);
        aVar.F(audioAttributesImplBase.f30306b, 2);
        aVar.F(audioAttributesImplBase.f30307c, 3);
        aVar.F(audioAttributesImplBase.f30308d, 4);
    }
}
