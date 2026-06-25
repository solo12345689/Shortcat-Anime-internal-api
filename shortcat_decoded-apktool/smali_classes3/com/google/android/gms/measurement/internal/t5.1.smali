.class final synthetic Lcom/google/android/gms/measurement/internal/t5;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/w5;

.field private final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field private final synthetic c:Lcom/google/android/gms/measurement/internal/B6;

.field private final synthetic d:Lj9/J;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/w5;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/B6;Lj9/J;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/t5;->a:Lcom/google/android/gms/measurement/internal/w5;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/t5;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/t5;->c:Lcom/google/android/gms/measurement/internal/B6;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/t5;->d:Lj9/J;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/t5;->a:Lcom/google/android/gms/measurement/internal/w5;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/t5;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/t5;->c:Lcom/google/android/gms/measurement/internal/B6;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/t5;->d:Lj9/J;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/w5;->H(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/B6;Lj9/J;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
