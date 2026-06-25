.class public abstract Li0/W;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:J

.field private b:Li0/W;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Li0/W;->a:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract c(Li0/W;)V
.end method

.method public abstract d(J)Li0/W;
.end method

.method public final e()Li0/W;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/W;->b:Li0/W;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-wide v0, p0, Li0/W;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final g(Li0/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li0/W;->b:Li0/W;

    .line 2
    .line 3
    return-void
.end method

.method public final h(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Li0/W;->a:J

    .line 2
    .line 3
    return-void
.end method
