.class public final LQe/h$a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQe/x$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQe/h$a;->e(LXe/f;)LQe/x$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;

.field final synthetic b:LQe/h;

.field final synthetic c:LXe/f;

.field final synthetic d:LQe/h$a;


# direct methods
.method constructor <init>(LQe/h;LXe/f;LQe/h$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQe/h$a$b;->b:LQe/h;

    .line 2
    .line 3
    iput-object p2, p0, LQe/h$a$b;->c:LXe/f;

    .line 4
    .line 5
    iput-object p3, p0, LQe/h$a$b;->d:LQe/h$a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LQe/h$a$b;->a:Ljava/util/ArrayList;

    .line 16
    .line 17
    return-void
.end method

.method public static final synthetic f(LQe/h$a$b;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, LQe/h$a$b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, LQe/h$a$b;->d:LQe/h$a;

    .line 2
    .line 3
    iget-object v1, p0, LQe/h$a$b;->c:LXe/f;

    .line 4
    .line 5
    iget-object v2, p0, LQe/h$a$b;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, LQe/h$a;->g(LXe/f;Ljava/util/ArrayList;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b(LXe/b;)LQe/x$a;
    .locals 4

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

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
    iget-object v1, p0, LQe/h$a$b;->b:LQe/h;

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
    invoke-virtual {v1, p1, v2, v0}, LQe/h;->x(LXe/b;Lye/h0;Ljava/util/List;)LQe/x$a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, LQe/h$a$b$a;

    .line 28
    .line 29
    invoke-direct {v1, p1, p0, v0}, LQe/h$a$b$a;-><init>(LQe/x$a;LQe/h$a$b;Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public c(LXe/b;LXe/f;)V
    .locals 2

    .line 1
    const-string v0, "enumClassId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "enumEntryName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LQe/h$a$b;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v1, Ldf/k;

    .line 14
    .line 15
    invoke-direct {v1, p1, p2}, Ldf/k;-><init>(LXe/b;LXe/f;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public d(Ldf/f;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQe/h$a$b;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v1, Ldf/s;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Ldf/s;-><init>(Ldf/f;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, LQe/h$a$b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, LQe/h$a$b;->b:LQe/h;

    .line 4
    .line 5
    iget-object v2, p0, LQe/h$a$b;->c:LXe/f;

    .line 6
    .line 7
    invoke-static {v1, v2, p1}, LQe/h;->N(LQe/h;LXe/f;Ljava/lang/Object;)Ldf/g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
