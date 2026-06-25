.class abstract LL9/k;
.super LM9/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final a:LM9/i;

.field final b:Ln9/j;

.field final synthetic c:LL9/m;


# direct methods
.method constructor <init>(LL9/m;LM9/i;Ln9/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LL9/k;->c:LL9/m;

    .line 2
    .line 3
    invoke-direct {p0}, LM9/g;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LL9/k;->a:LM9/i;

    .line 7
    .line 8
    iput-object p3, p0, LL9/k;->b:Ln9/j;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public f(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p1, p0, LL9/k;->c:LL9/m;

    .line 2
    .line 3
    iget-object p1, p1, LL9/m;->a:LM9/t;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LL9/k;->b:Ln9/j;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LM9/t;->r(Ln9/j;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, LL9/k;->a:LM9/i;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    new-array v0, v0, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v1, "onGetLaunchReviewFlowInfo"

    .line 18
    .line 19
    invoke-virtual {p1, v1, v0}, LM9/i;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    return-void
.end method
