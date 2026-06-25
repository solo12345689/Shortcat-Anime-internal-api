.class Ln4/A$a;
.super LM3/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln4/A;-><init>(LM3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ln4/A;


# direct methods
.method constructor <init>(Ln4/A;LM3/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln4/A$a;->d:Ln4/A;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LM3/i;-><init>(LM3/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic i(LS3/k;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ln4/y;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ln4/A$a;->l(LS3/k;Ln4/y;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l(LS3/k;Ln4/y;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ln4/y;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p2}, Ln4/y;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {p2}, Ln4/y;->b()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x2

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-virtual {p2}, Ln4/y;->b()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p1, v1, p2}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
