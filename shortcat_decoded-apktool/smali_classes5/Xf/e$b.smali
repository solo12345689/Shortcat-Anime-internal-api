.class public final LXf/e$b;
.super LUf/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXf/e;->u0(Ljava/lang/String;)LXf/e$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:LYf/e;

.field final synthetic b:LXf/e;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(LXf/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LXf/e$b;->b:LXf/e;

    .line 2
    .line 3
    iput-object p2, p0, LXf/e$b;->c:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, LUf/b;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, LXf/e;->d()LWf/b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, LWf/b;->a()LYf/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, LXf/e$b;->a:LYf/e;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public E(I)V
    .locals 0

    .line 1
    invoke-static {p1}, LTd/D;->b(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, LXf/f;->a(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LXf/e$b;->J(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final J(Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "s"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LXf/e$b;->b:LXf/e;

    .line 7
    .line 8
    iget-object v1, p0, LXf/e$b;->c:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v2, LWf/v;

    .line 11
    .line 12
    const/4 v6, 0x4

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    move-object v3, p1

    .line 17
    invoke-direct/range {v2 .. v7}, LWf/v;-><init>(Ljava/lang/Object;ZLTf/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, LXf/e;->v0(Ljava/lang/String;LWf/i;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public a()LYf/e;
    .locals 1

    .line 1
    iget-object v0, p0, LXf/e$b;->a:LYf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public j(B)V
    .locals 0

    .line 1
    invoke-static {p1}, LTd/B;->b(B)B

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, LTd/B;->k(B)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LXf/e$b;->J(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public s(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, LTd/F;->b(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-static {p1, p2}, LXf/g;->a(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LXf/e$b;->J(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public w(S)V
    .locals 0

    .line 1
    invoke-static {p1}, LTd/I;->b(S)S

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, LTd/I;->k(S)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LXf/e$b;->J(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
