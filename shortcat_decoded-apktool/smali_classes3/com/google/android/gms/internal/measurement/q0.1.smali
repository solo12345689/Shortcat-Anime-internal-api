.class public abstract Lcom/google/android/gms/internal/measurement/q0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lcom/google/android/gms/internal/measurement/o0;

.field private static volatile b:Lcom/google/android/gms/internal/measurement/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/p0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/p0;-><init>([B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/internal/measurement/q0;->a:Lcom/google/android/gms/internal/measurement/o0;

    .line 8
    .line 9
    sput-object v0, Lcom/google/android/gms/internal/measurement/q0;->b:Lcom/google/android/gms/internal/measurement/o0;

    .line 10
    .line 11
    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/measurement/o0;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/q0;->b:Lcom/google/android/gms/internal/measurement/o0;

    .line 2
    .line 3
    return-object v0
.end method
