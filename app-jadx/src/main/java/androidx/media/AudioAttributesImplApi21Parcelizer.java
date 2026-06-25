package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f30303a = (AudioAttributes) aVar.r(audioAttributesImplApi21.f30303a, 1);
        audioAttributesImplApi21.f30304b = aVar.p(audioAttributesImplApi21.f30304b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.x(false, false);
        aVar.H(audioAttributesImplApi21.f30303a, 1);
        aVar.F(audioAttributesImplApi21.f30304b, 2);
    }
}
