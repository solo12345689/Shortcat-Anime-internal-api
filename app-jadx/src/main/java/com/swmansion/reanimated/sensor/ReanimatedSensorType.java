package com.swmansion.reanimated.sensor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum ReanimatedSensorType {
    ACCELEROMETER(10),
    GYROSCOPE(4),
    GRAVITY(9),
    MAGNETIC_FIELD(2),
    ROTATION_VECTOR(11);

    private final int type;

    ReanimatedSensorType(int i10) {
        this.type = i10;
    }

    public static ReanimatedSensorType getInstanceById(int i10) {
        if (i10 == 1) {
            return ACCELEROMETER;
        }
        if (i10 == 2) {
            return GYROSCOPE;
        }
        if (i10 == 3) {
            return GRAVITY;
        }
        if (i10 == 4) {
            return MAGNETIC_FIELD;
        }
        if (i10 == 5) {
            return ROTATION_VECTOR;
        }
        throw new IllegalArgumentException("[Reanimated] Unknown sensor type.");
    }

    public int getType() {
        return this.type;
    }
}
