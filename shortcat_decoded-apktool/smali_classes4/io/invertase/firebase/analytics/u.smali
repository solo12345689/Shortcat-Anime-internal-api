.class public final synthetic Lio/invertase/firebase/analytics/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/invertase/firebase/analytics/v;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lio/invertase/firebase/analytics/v;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/invertase/firebase/analytics/u;->a:Lio/invertase/firebase/analytics/v;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/invertase/firebase/analytics/u;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/u;->a:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/invertase/firebase/analytics/u;->b:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Lio/invertase/firebase/analytics/v;->g(Lio/invertase/firebase/analytics/v;J)Ljava/lang/Void;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
