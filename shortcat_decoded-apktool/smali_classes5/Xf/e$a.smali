.class public final LXf/e$a;
.super LUf/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXf/e;->t0(Ljava/lang/String;LTf/e;)LXf/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LXf/e;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:LTf/e;


# direct methods
.method constructor <init>(LXf/e;Ljava/lang/String;LTf/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LXf/e$a;->a:LXf/e;

    .line 2
    .line 3
    iput-object p2, p0, LXf/e$a;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, LXf/e$a;->c:LTf/e;

    .line 6
    .line 7
    invoke-direct {p0}, LUf/b;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public F(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LXf/e$a;->a:LXf/e;

    .line 7
    .line 8
    iget-object v1, p0, LXf/e$a;->b:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v2, LWf/v;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    iget-object v4, p0, LXf/e$a;->c:LTf/e;

    .line 14
    .line 15
    invoke-direct {v2, p1, v3, v4}, LWf/v;-><init>(Ljava/lang/Object;ZLTf/e;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, LXf/e;->v0(Ljava/lang/String;LWf/i;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public a()LYf/e;
    .locals 1

    .line 1
    iget-object v0, p0, LXf/e$a;->a:LXf/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/e;->d()LWf/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LWf/b;->a()LYf/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
