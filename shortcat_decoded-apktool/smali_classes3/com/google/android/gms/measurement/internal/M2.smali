.class final synthetic Lcom/google/android/gms/measurement/internal/M2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/P2;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/P2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/M2;->a:Lcom/google/android/gms/measurement/internal/P2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/M2;->a:Lcom/google/android/gms/measurement/internal/P2;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/measurement/P7;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/P2;->k:Lcom/google/android/gms/internal/measurement/u7;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/P7;-><init>(Lcom/google/android/gms/internal/measurement/u7;)V

    .line 8
    .line 9
    .line 10
    return-object v1
.end method
