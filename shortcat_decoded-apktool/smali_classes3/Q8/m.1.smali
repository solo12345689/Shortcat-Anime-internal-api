.class public final LQ8/m;
.super LP8/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lcom/google/android/gms/common/api/internal/BasePendingResult;


# direct methods
.method public constructor <init>(LP8/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LP8/g;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 5
    .line 6
    iput-object p1, p0, LQ8/m;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final addStatusListener(LP8/h$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/m;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP8/h;->addStatusListener(LP8/h$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final await(JLjava/util/concurrent/TimeUnit;)LP8/k;
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/m;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->await(JLjava/util/concurrent/TimeUnit;)LP8/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
