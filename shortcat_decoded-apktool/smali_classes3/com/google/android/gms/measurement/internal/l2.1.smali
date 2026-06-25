.class final synthetic Lcom/google/android/gms/measurement/internal/l2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ln9/e;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/m2;

.field private final synthetic b:J


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/m2;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/l2;->a:Lcom/google/android/gms/measurement/internal/m2;

    .line 5
    .line 6
    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/l2;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic onFailure(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/l2;->a:Lcom/google/android/gms/measurement/internal/m2;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/l2;->b:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/measurement/internal/m2;->c(JLjava/lang/Exception;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
