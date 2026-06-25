package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f30303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30304b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f30303a.equals(((AudioAttributesImplApi21) obj).f30303a);
        }
        return false;
    }

    public int hashCode() {
        return this.f30303a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f30303a;
    }
}
