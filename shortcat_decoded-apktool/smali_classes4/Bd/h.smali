.class public final LBd/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LBd/a;

.field private final b:LBd/c;

.field private final c:LBd/e;


# direct methods
.method public constructor <init>(LBd/a;LBd/c;LBd/e;)V
    .locals 1

    .line 1
    const-string v0, "launcherSelectionPolicy"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "loaderSelectionPolicy"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "reaperSelectionPolicy"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LBd/h;->a:LBd/a;

    .line 20
    .line 21
    iput-object p2, p0, LBd/h;->b:LBd/c;

    .line 22
    .line 23
    iput-object p3, p0, LBd/h;->c:LBd/e;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lorg/json/JSONObject;)Lrd/d;
    .locals 1

    .line 1
    const-string v0, "updates"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LBd/h;->a:LBd/a;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, LBd/a;->a(Ljava/util/List;Lorg/json/JSONObject;)Lrd/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final b(Ljava/util/List;Lrd/d;Lorg/json/JSONObject;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "updates"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "launchedUpdate"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LBd/h;->c:LBd/e;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2, p3}, LBd/e;->a(Ljava/util/List;Lrd/d;Lorg/json/JSONObject;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final c(Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LBd/h;->b:LBd/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LBd/c;->a(Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d(Lwd/u$c;Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z
    .locals 1

    .line 1
    const-string v0, "directive"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "embeddedUpdate"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LBd/h;->b:LBd/c;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2, p3, p4}, LBd/c;->b(Lwd/u$c;Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method
