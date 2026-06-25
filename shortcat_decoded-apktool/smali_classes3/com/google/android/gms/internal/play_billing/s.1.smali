.class public abstract Lcom/google/android/gms/internal/play_billing/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lcom/google/android/gms/internal/play_billing/F;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/play_billing/q;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/q;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    new-instance v0, Lcom/google/android/gms/internal/play_billing/r;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/r;-><init>()V

    .line 16
    .line 17
    .line 18
    :goto_0
    sput-object v0, Lcom/google/android/gms/internal/play_billing/s;->a:Lcom/google/android/gms/internal/play_billing/F;

    .line 19
    .line 20
    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/play_billing/F;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s;->a:Lcom/google/android/gms/internal/play_billing/F;

    .line 2
    .line 3
    return-object v0
.end method
