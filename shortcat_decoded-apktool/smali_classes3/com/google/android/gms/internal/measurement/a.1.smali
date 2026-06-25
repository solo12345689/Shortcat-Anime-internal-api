.class final synthetic Lcom/google/android/gms/internal/measurement/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/measurement/e0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/a;->a:Lcom/google/android/gms/internal/measurement/e0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/b4;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/a;->a:Lcom/google/android/gms/internal/measurement/e0;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/e0;->c:Lcom/google/android/gms/internal/measurement/c;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/b4;-><init>(Lcom/google/android/gms/internal/measurement/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
