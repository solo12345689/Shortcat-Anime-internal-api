.class public final synthetic LXf/D;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# instance fields
.field public final synthetic a:LTf/e;

.field public final synthetic b:LWf/b;


# direct methods
.method public synthetic constructor <init>(LTf/e;LWf/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LXf/D;->a:LTf/e;

    .line 5
    .line 6
    iput-object p2, p0, LXf/D;->b:LWf/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LXf/D;->a:LTf/e;

    .line 2
    .line 3
    iget-object v1, p0, LXf/D;->b:LWf/b;

    .line 4
    .line 5
    invoke-static {v0, v1}, LXf/E;->a(LTf/e;LWf/b;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
