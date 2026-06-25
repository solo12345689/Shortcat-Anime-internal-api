.class public final synthetic Lio/invertase/firebase/analytics/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/invertase/firebase/analytics/v;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/invertase/firebase/analytics/r;->a:Lio/invertase/firebase/analytics/v;

    .line 5
    .line 6
    iput-object p2, p0, Lio/invertase/firebase/analytics/r;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lio/invertase/firebase/analytics/r;->c:Landroid/os/Bundle;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/r;->a:Lio/invertase/firebase/analytics/v;

    .line 2
    .line 3
    iget-object v1, p0, Lio/invertase/firebase/analytics/r;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lio/invertase/firebase/analytics/r;->c:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lio/invertase/firebase/analytics/v;->k(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Void;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
