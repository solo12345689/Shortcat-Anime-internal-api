.class public final Lv4/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private final e:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv4/a$a;->a:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv4/a$a;->b:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv4/a$a;->c:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv4/a$a;->d:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv4/a$a;->e:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lv4/a;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    invoke-virtual {p1}, Lv4/a;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lv4/a$a;->a:Ljava/util/List;

    .line 9
    invoke-virtual {p1}, Lv4/a;->e()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lv4/a$a;->b:Ljava/util/List;

    .line 10
    invoke-virtual {p1}, Lv4/a;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lv4/a$a;->c:Ljava/util/List;

    .line 11
    invoke-virtual {p1}, Lv4/a;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lv4/a$a;->d:Ljava/util/List;

    .line 12
    invoke-virtual {p1}, Lv4/a;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lv4/a$a;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(LA4/i$a;Ljava/lang/Class;)Lv4/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/a$a;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final b(LB4/b;)Lv4/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/a$a;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final c(LC4/b;Ljava/lang/Class;)Lv4/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/a$a;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final d(LD4/d;Ljava/lang/Class;)Lv4/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/a$a;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final e(Lx4/i$a;)Lv4/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/a$a;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final f()Lv4/a;
    .locals 7

    .line 1
    new-instance v0, Lv4/a;

    .line 2
    .line 3
    iget-object v1, p0, Lv4/a$a;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v1}, LL4/c;->a(Ljava/util/List;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lv4/a$a;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2}, LL4/c;->a(Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Lv4/a$a;->c:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v3}, LL4/c;->a(Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, p0, Lv4/a$a;->d:Ljava/util/List;

    .line 22
    .line 23
    invoke-static {v4}, LL4/c;->a(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, p0, Lv4/a$a;->e:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v5}, LL4/c;->a(Ljava/util/List;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-direct/range {v0 .. v6}, Lv4/a;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/a$a;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/a$a;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
