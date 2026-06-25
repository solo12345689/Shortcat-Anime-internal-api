.class public final LQe/h$a$b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQe/x$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQe/h$a$b;->b(LXe/b;)LQe/x$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:LQe/x$a;

.field final synthetic b:LQe/x$a;

.field final synthetic c:LQe/h$a$b;

.field final synthetic d:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(LQe/x$a;LQe/h$a$b;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQe/h$a$b$a;->b:LQe/x$a;

    .line 2
    .line 3
    iput-object p2, p0, LQe/h$a$b$a;->c:LQe/h$a$b;

    .line 4
    .line 5
    iput-object p3, p0, LQe/h$a$b$a;->d:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LQe/h$a$b$a;->a:LQe/x$a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, LQe/h$a$b$a;->b:LQe/x$a;

    .line 2
    .line 3
    invoke-interface {v0}, LQe/x$a;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQe/h$a$b$a;->c:LQe/h$a$b;

    .line 7
    .line 8
    invoke-static {v0}, LQe/h$a$b;->f(LQe/h$a$b;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ldf/a;

    .line 13
    .line 14
    iget-object v2, p0, LQe/h$a$b$a;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {v2}, LUd/u;->M0(Ljava/util/List;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lze/c;

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ldf/a;-><init>(Lze/c;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

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
    iget-object v0, p0, LQe/h$a$b$a;->a:LQe/x$a;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2, p3}, LQe/x$a;->b(LXe/f;LXe/b;LXe/f;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public c(LXe/f;LXe/b;)LQe/x$a;
    .locals 1

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQe/h$a$b$a;->a:LQe/x$a;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, LQe/x$a;->c(LXe/f;LXe/b;)LQe/x$a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public d(LXe/f;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQe/h$a$b$a;->a:LQe/x$a;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LQe/x$a;->d(LXe/f;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(LXe/f;)LQe/x$b;
    .locals 1

    .line 1
    iget-object v0, p0, LQe/h$a$b$a;->a:LQe/x$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LQe/x$a;->e(LXe/f;)LQe/x$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    iget-object v0, p0, LQe/h$a$b$a;->a:LQe/x$a;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, LQe/x$a;->f(LXe/f;Ldf/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
