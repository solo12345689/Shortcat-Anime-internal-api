.class public final LU6/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU6/e$a;
    }
.end annotation


# instance fields
.field private final a:LU6/e$a;

.field private final b:I

.field private c:F

.field private d:F

.field private e:F

.field private f:Landroid/hardware/SensorManager;

.field private g:J

.field private h:I

.field private i:J


# direct methods
.method public constructor <init>(LU6/e$a;I)V
    .locals 1

    .line 1
    const-string v0, "shakeListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LU6/e;->a:LU6/e$a;

    .line 10
    .line 11
    iput p2, p0, LU6/e;->b:I

    .line 12
    .line 13
    return-void
.end method

.method private final a(F)Z
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const v0, 0x4150af7e

    .line 6
    .line 7
    .line 8
    cmpl-float p1, p1, v0

    .line 9
    .line 10
    if-lez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method private final b(J)V
    .locals 2

    .line 1
    iget v0, p0, LU6/e;->h:I

    .line 2
    .line 3
    iget v1, p0, LU6/e;->b:I

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x8

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, LU6/e;->d()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LU6/e;->a:LU6/e$a;

    .line 13
    .line 14
    invoke-interface {v0}, LU6/e$a;->a()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-wide v0, p0, LU6/e;->i:J

    .line 18
    .line 19
    sub-long/2addr p1, v0

    .line 20
    long-to-float p1, p1

    .line 21
    invoke-static {}, LU6/f;->b()F

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    cmpl-float p1, p1, p2

    .line 26
    .line 27
    if-lez p1, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, LU6/e;->d()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method private final c(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LU6/e;->i:J

    .line 2
    .line 3
    iget p1, p0, LU6/e;->h:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, LU6/e;->h:I

    .line 8
    .line 9
    return-void
.end method

.method private final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LU6/e;->h:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LU6/e;->c:F

    .line 6
    .line 7
    iput v0, p0, LU6/e;->d:F

    .line 8
    .line 9
    iput v0, p0, LU6/e;->e:F

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final e(Landroid/hardware/SensorManager;)V
    .locals 3

    .line 1
    const-string v0, "manager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iput-object p1, p0, LU6/e;->f:Landroid/hardware/SensorManager;

    .line 15
    .line 16
    const-wide/16 v1, -0x1

    .line 17
    .line 18
    iput-wide v1, p0, LU6/e;->g:J

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-virtual {p1, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 22
    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    iput-wide v0, p0, LU6/e;->i:J

    .line 27
    .line 28
    invoke-direct {p0}, LU6/e;->d()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, LU6/e;->f:Landroid/hardware/SensorManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, LU6/e;->f:Landroid/hardware/SensorManager;

    .line 10
    .line 11
    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    const-string p2, "sensor"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 5

    .line 1
    const-string v0, "sensorEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 7
    .line 8
    iget-wide v2, p0, LU6/e;->g:J

    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    invoke-static {}, LU6/f;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-gez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aget v1, v0, v1

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    aget v2, v0, v2

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    aget v0, v0, v3

    .line 30
    .line 31
    const v3, 0x411ce80a

    .line 32
    .line 33
    .line 34
    sub-float/2addr v0, v3

    .line 35
    iget-wide v3, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 36
    .line 37
    iput-wide v3, p0, LU6/e;->g:J

    .line 38
    .line 39
    invoke-direct {p0, v1}, LU6/e;->a(F)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v4, 0x0

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    iget v3, p0, LU6/e;->c:F

    .line 47
    .line 48
    mul-float/2addr v3, v1

    .line 49
    cmpg-float v3, v3, v4

    .line 50
    .line 51
    if-gtz v3, :cond_1

    .line 52
    .line 53
    iget-wide v2, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 54
    .line 55
    invoke-direct {p0, v2, v3}, LU6/e;->c(J)V

    .line 56
    .line 57
    .line 58
    iput v1, p0, LU6/e;->c:F

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-direct {p0, v2}, LU6/e;->a(F)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    iget v1, p0, LU6/e;->d:F

    .line 68
    .line 69
    mul-float/2addr v1, v2

    .line 70
    cmpg-float v1, v1, v4

    .line 71
    .line 72
    if-gtz v1, :cond_2

    .line 73
    .line 74
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 75
    .line 76
    invoke-direct {p0, v0, v1}, LU6/e;->c(J)V

    .line 77
    .line 78
    .line 79
    iput v2, p0, LU6/e;->d:F

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-direct {p0, v0}, LU6/e;->a(F)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    iget v1, p0, LU6/e;->e:F

    .line 89
    .line 90
    mul-float/2addr v1, v0

    .line 91
    cmpg-float v1, v1, v4

    .line 92
    .line 93
    if-gtz v1, :cond_3

    .line 94
    .line 95
    iget-wide v1, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 96
    .line 97
    invoke-direct {p0, v1, v2}, LU6/e;->c(J)V

    .line 98
    .line 99
    .line 100
    iput v0, p0, LU6/e;->e:F

    .line 101
    .line 102
    :cond_3
    :goto_0
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 103
    .line 104
    invoke-direct {p0, v0, v1}, LU6/e;->b(J)V

    .line 105
    .line 106
    .line 107
    return-void
.end method
