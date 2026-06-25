.class final Lcom/google/android/gms/internal/play_billing/h0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field static final b:Lcom/google/android/gms/internal/play_billing/h0;

.field static final c:Lcom/google/android/gms/internal/play_billing/h0;


# instance fields
.field final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/h0;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/play_billing/h0$a;

    .line 4
    .line 5
    const-string v2, "Failure occurred while trying to finish a future."

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/play_billing/h0$a;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/h0;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/android/gms/internal/play_billing/h0;->b:Lcom/google/android/gms/internal/play_billing/h0;

    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/internal/play_billing/h0;

    .line 16
    .line 17
    new-instance v1, Lcom/google/android/gms/internal/play_billing/h0$b;

    .line 18
    .line 19
    const-string v2, "Failure.exception is unexpectedly null."

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/play_billing/h0$b;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/h0;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/google/android/gms/internal/play_billing/h0;->c:Lcom/google/android/gms/internal/play_billing/h0;

    .line 28
    .line 29
    return-void
.end method

.method constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/h0;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    return-void
.end method
