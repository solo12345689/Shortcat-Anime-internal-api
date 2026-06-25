.class abstract LQe/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQe/x$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQe/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation


# instance fields
.field final synthetic a:LQe/h;


# direct methods
.method public constructor <init>(LQe/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQe/h$a;->a:LQe/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(LXe/f;LXe/b;LXe/f;)V
    .locals 1

    .line 1
    const-string v0, "enumClassId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "enumEntryName"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ldf/k;

    .line 12
    .line 13
    invoke-direct {v0, p2, p3}, Ldf/k;-><init>(LXe/b;LXe/f;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, LQe/h$a;->h(LXe/f;Ldf/g;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public c(LXe/f;LXe/b;)LQe/x$a;
    .locals 4

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LQe/h$a;->a:LQe/h;

    .line 12
    .line 13
    sget-object v2, Lye/h0;->a:Lye/h0;

    .line 14
    .line 15
    const-string v3, "NO_SOURCE"

    .line 16
    .line 17
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2, v2, v0}, LQe/h;->x(LXe/b;Lye/h0;Ljava/util/List;)LQe/x$a;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, LQe/h$a$a;

    .line 28
    .line 29
    invoke-direct {v1, p2, p0, p1, v0}, LQe/h$a$a;-><init>(LQe/x$a;LQe/h$a;LXe/f;Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public d(LXe/f;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQe/h$a;->a:LQe/h;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, LQe/h;->N(LQe/h;LXe/f;Ljava/lang/Object;)Ldf/g;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p0, p1, p2}, LQe/h$a;->h(LXe/f;Ldf/g;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(LXe/f;)LQe/x$b;
    .locals 2

    .line 1
    new-instance v0, LQe/h$a$b;

    .line 2
    .line 3
    iget-object v1, p0, LQe/h$a;->a:LQe/h;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p0}, LQe/h$a$b;-><init>(LQe/h;LXe/f;LQe/h$a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public f(LXe/f;Ldf/f;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldf/s;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Ldf/s;-><init>(Ldf/f;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, LQe/h$a;->h(LXe/f;Ldf/g;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public abstract g(LXe/f;Ljava/util/ArrayList;)V
.end method

.method public abstract h(LXe/f;Ldf/g;)V
.end method
